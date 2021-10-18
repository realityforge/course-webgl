package org.realityforge.webgl.webgpu.dragon;

import akasha.HTMLCanvasElement;
import akasha.WindowGlobal;
import akasha.core.Float32Array;
import akasha.core.Uint32Array;
import akasha.gpu.GPUAdapter;
import akasha.gpu.GPUBindGroup;
import akasha.gpu.GPUBindGroupDescriptor;
import akasha.gpu.GPUBindGroupEntry;
import akasha.gpu.GPUBuffer;
import akasha.gpu.GPUBufferBinding;
import akasha.gpu.GPUBufferDescriptor;
import akasha.gpu.GPUBufferUsage;
import akasha.gpu.GPUCanvasConfiguration;
import akasha.gpu.GPUCanvasContext;
import akasha.gpu.GPUColorDict;
import akasha.gpu.GPUColorTargetState;
import akasha.gpu.GPUCommandEncoder;
import akasha.gpu.GPUCompareFunction;
import akasha.gpu.GPUCullMode;
import akasha.gpu.GPUDepthStencilState;
import akasha.gpu.GPUDevice;
import akasha.gpu.GPUExtent3DDict;
import akasha.gpu.GPUFragmentState;
import akasha.gpu.GPUPrimitiveState;
import akasha.gpu.GPUPrimitiveTopology;
import akasha.gpu.GPURenderPassColorAttachment;
import akasha.gpu.GPURenderPassDepthStencilAttachment;
import akasha.gpu.GPURenderPassDescriptor;
import akasha.gpu.GPURenderPassEncoder;
import akasha.gpu.GPURenderPipeline;
import akasha.gpu.GPURenderPipelineDescriptor;
import akasha.gpu.GPUShaderModule;
import akasha.gpu.GPUStoreOp;
import akasha.gpu.GPUTexture;
import akasha.gpu.GPUTextureDescriptor;
import akasha.gpu.GPUTextureFormat;
import akasha.gpu.GPUTextureUsage;
import akasha.gpu.GPUTextureView;
import akasha.gpu.GPUVertexAttribute;
import akasha.gpu.GPUVertexBufferLayout;
import akasha.gpu.GPUVertexFormat;
import akasha.gpu.GPUVertexState;
import akasha.gpu.WGSL;
import com.google.gwt.core.client.EntryPoint;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.vecmath.Vector3d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.webgpu.util.WebGpuKit;
import org.realityforge.webgl.webgpu.util.dragon.Asset;

@SuppressWarnings( "UnstableApiUsage" )
public final class Main
  implements EntryPoint
{
  private GPUDevice _device;
  private GPURenderPipeline _pipeline;
  private GPUCanvasContext _gl;
  private GPUAdapter _adapter;
  private GPUBindGroup _uniformBindGroup;
  private GPUBuffer _verticesBuffer;
  private GPUBuffer _indexBuffer;
  private GPURenderPassDescriptor.Builder _renderPassDescriptor;
  private final Matrix4d _projectionMatrix = new Matrix4d();
  private GPUBuffer _uniformBuffer;
  private Asset _asset;

  @Override
  public void onModuleLoad()
  {
    Asset.loadStanfordDragon().thenAccept( data -> {
      _asset = data;
      WindowGlobal.navigator().gpu().requestAdapter().then( adapter -> {
        _adapter = adapter;
        return adapter.requestDevice();
      } ).thenAccept( this::onStart );
    } );
  }

  private void onStart( @Nonnull final GPUDevice device )
  {
    _device = device;
    final HTMLCanvasElement canvas = WebGpuKit.createFullWindowCanvas();

    _gl = WebGpuKit.getGpuCanvasContext( canvas );

    // Use the preferred format of adapter instead of hardcoding to a specific format ala bgra8unorm.
    @GPUTextureFormat
    final String textureFormat = _gl.getPreferredFormat( _adapter );

    final GPUExtent3DDict presentationSize = WebGpuKit.calcGpuExtent3D( canvas );
    _gl.configure( GPUCanvasConfiguration
                     .create( _device, textureFormat )
                     //Ensure the configured size takes into account the device pixel ratio.
                     .size( presentationSize ) );

    _verticesBuffer = device.createBuffer( GPUBufferDescriptor
                                             .create( _asset.vertexByteCount(), GPUBufferUsage.VERTEX )
                                             .mappedAtCreation( true ) );
    new Float32Array( _verticesBuffer.getMappedRange() ).set( _asset.getVertices() );
    _verticesBuffer.unmap();

    final double[] indices = _asset.getIndices();
    _indexBuffer = device.createBuffer( GPUBufferDescriptor
                                          .create( _asset.indexByteCount(), GPUBufferUsage.INDEX )
                                          .mappedAtCreation( true ) );
    new Uint32Array( _indexBuffer.getMappedRange() ).set( indices );
    _indexBuffer.unmap();

    @WGSL
    final String vertexShader =
      "[[block]] struct Uniforms {\n" +
      "  modelViewProjectionMatrix : mat4x4<f32>;\n" +
      "};\n" +
      "[[binding(0), group(0)]] var<uniform> uniforms : Uniforms;\n" +
      "\n" +
      "struct VertexOutput {\n" +
      "  [[builtin(position)]] Position : vec4<f32>;\n" +
      "  [[location(0)]] fragUV : vec2<f32>;\n" +
      "  [[location(1)]] fragPosition: vec4<f32>;\n" +
      "};\n" +
      "\n" +
      "[[stage(vertex)]]\n" +
      "fn vertex_main([[location(0)]] position : vec4<f32>,\n" +
      "        [[location(1)]] uv : vec2<f32>) -> VertexOutput {\n" +
      "  var output : VertexOutput;\n" +
      "  output.Position = uniforms.modelViewProjectionMatrix * position;\n" +
      "  output.fragUV = uv;\n" +
      "  output.fragPosition = 0.5 * (position + vec4<f32>(1.0, 1.0, 1.0, 1.0));\n" +
      "  return output;\n" +
      "}\n" +
      "[[stage(fragment)]]\n" +
      "fn fragment_main([[location(0)]] fragUV: vec2<f32>,\n" +
      "        [[location(1)]] fragPosition: vec4<f32>) -> [[location(0)]] vec4<f32> {\n" +
      "  return fragPosition;\n" +
      "}\n";

    final GPUShaderModule shaderModule = WebGpuKit.createShaderModule( _device, vertexShader );
    final GPUVertexState.Builder vertexState =
      GPUVertexState
        .create( shaderModule, "vertex_main" )
        .buffers( GPUVertexBufferLayout.create( _asset.vertexSize(),
                                                // position
                                                GPUVertexAttribute.create( GPUVertexFormat.float32x3,
                                                                           0,
                                                                           0 ),
                                                // uv
                                                GPUVertexAttribute.create( GPUVertexFormat.float32x2,
                                                                           Vector3f.BYTES * 2,
                                                                           1 ) ) );

    final GPUFragmentState fragmentState =
      GPUFragmentState.create( shaderModule,
                               "fragment_main",
                               GPUColorTargetState.format( textureFormat ) );

    _pipeline =
      _device.createRenderPipeline( GPURenderPipelineDescriptor
                                      .vertex( vertexState )
                                      .fragment( fragmentState )
                                      .primitive( GPUPrimitiveState
                                                    .create()
                                                    .topology( GPUPrimitiveTopology.triangle_list )
                                                    .cullMode( GPUCullMode.back ) )
                                      // Enable depth testing so that the fragment closest to the camera
                                      // is rendered in front.
                                      .depthStencil( GPUDepthStencilState
                                                       .format( GPUTextureFormat.depth24plus )
                                                       .depthCompare( GPUCompareFunction.less )
                                                       .depthWriteEnabled( true ) ) );

    final GPUTexture depthTexture =
      device.createTexture( GPUTextureDescriptor.create( presentationSize,
                                                         GPUTextureFormat.depth24plus,
                                                         GPUTextureUsage.RENDER_ATTACHMENT ) );

    final int uniformBufferSize = Matrix4d.FLOAT_BYTES;
    _uniformBuffer =
      device.createBuffer( GPUBufferDescriptor.create( uniformBufferSize,
                                                       GPUBufferUsage.UNIFORM | GPUBufferUsage.COPY_DST ) );

    final GPUBindGroupDescriptor.Builder bindGroupDescriptor =
      GPUBindGroupDescriptor.create( _pipeline.getBindGroupLayout( 0 ),
                                     GPUBindGroupEntry.create( 0, GPUBufferBinding.buffer( _uniformBuffer ) ) );
    _uniformBindGroup = device.createBindGroup( bindGroupDescriptor );

    final GPUTextureView textureView = _gl.getCurrentTexture().createView();

    final GPURenderPassColorAttachment attachment =
      GPURenderPassColorAttachment.create( textureView,
                                           GPUColorDict.create( 0.5, 0.5, 0.5, 1 ),
                                           GPUStoreOp.store );

    _renderPassDescriptor =
      GPURenderPassDescriptor
        .colorAttachments( attachment )
        .depthStencilAttachment( GPURenderPassDepthStencilAttachment.create( depthTexture.createView(),
                                                                             1.0F,
                                                                             GPUStoreOp.store,
                                                                             0,
                                                                             GPUStoreOp.store ) );

    _projectionMatrix.setPerspective( MathUtil.degreesToRadians( 72 ),
                                      CanvasUtil.getAspect( canvas ),
                                      1,
                                      100 );

    WindowGlobal.requestAnimationFrame( t -> renderFrame() );
  }

  @Nonnull
  private Float32Array getTransformationMatrix()
  {
    final Vector3d eyePosition = new Vector3d( 0, 20, -20 );
    final Vector3d upVector = new Vector3d( 0, 1, 0 );
    final Vector3d origin = new Vector3d( 0, 0, 0 );

    final Matrix4d m = new Matrix4d();

    final double rad = Math.PI * ( System.currentTimeMillis() / 5000.0 );
    m.rotateY( rad );
    eyePosition.mul( m );

    final Matrix4d viewMatrix = new Matrix4d();
    viewMatrix.lookAt( eyePosition, origin, upVector );

    final Matrix4d modelViewProjectionMatrix = new Matrix4d();
    Matrix4d.multiply( modelViewProjectionMatrix, viewMatrix, _projectionMatrix );

    return new Float32Array( modelViewProjectionMatrix.toArray() );
  }

  private void renderFrame()
  {
    WindowGlobal.requestAnimationFrame( t -> renderFrame() );

    final Float32Array transformationMatrix = getTransformationMatrix();
    _device.queue().writeBuffer( _uniformBuffer,
                                 0,
                                 transformationMatrix.buffer(),
                                 transformationMatrix.byteOffset(),
                                 transformationMatrix.byteLength() );

    _renderPassDescriptor.colorAttachments().getAt( 0 ).setView( _gl.getCurrentTexture().createView() );

    final GPUCommandEncoder commandEncoder = _device.createCommandEncoder();
    final GPURenderPassEncoder passEncoder = commandEncoder.beginRenderPass( _renderPassDescriptor );

    passEncoder.setPipeline( _pipeline );
    passEncoder.setBindGroup( 0, _uniformBindGroup );
    passEncoder.setVertexBuffer( 0, _verticesBuffer );
    passEncoder.setIndexBuffer( _indexBuffer, _asset.indexFormat() );
    passEncoder.drawIndexed( _asset.indexCount() );
    passEncoder.endPass();

    _device.queue().submit( commandEncoder.finish() );
  }
}
