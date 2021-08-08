package org.realityforge.webgl.webgpu.rotating_cube;

import akasha.HTMLCanvasElement;
import akasha.WindowGlobal;
import akasha.core.Float32Array;
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
import akasha.gpu.GPUCommandBuffer;
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
import akasha.gpu.GPUShaderModuleDescriptor;
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
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.webgpu.util.MatrixKit;
import org.realityforge.webgl.webgpu.util.WebGpuKit;

@SuppressWarnings( "UnstableApiUsage" )
public final class Main
  implements EntryPoint
{
  // Byte size of one cube vertex.
  private static final int cubeVertexSize = Float.BYTES * ( 4 /* position */ + 4 /* color */ + 2 /* uv */ );
  private static final int cubePositionOffset = 0;
  private static final int cubeColorOffset = 4 * 4; // Byte offset of cube vertex color attribute.
  private static final int cubeUVOffset = 4 * 8;
  private static final int cubeVertexCount = 36;
  private static final Float32Array cubeVertexArray = new Float32Array( new double[]{
    // float4 position, float4 color, float2 uv,
    1, -1, 1, 1, 1, 0, 1, 1, 1, 1,
    -1, -1, 1, 1, 0, 0, 1, 1, 0, 1,
    -1, -1, -1, 1, 0, 0, 0, 1, 0, 0,
    1, -1, -1, 1, 1, 0, 0, 1, 1, 0,
    1, -1, 1, 1, 1, 0, 1, 1, 1, 1,
    -1, -1, -1, 1, 0, 0, 0, 1, 0, 0,

    1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    1, -1, 1, 1, 1, 0, 1, 1, 0, 1,
    1, -1, -1, 1, 1, 0, 0, 1, 0, 0,
    1, 1, -1, 1, 1, 1, 0, 1, 1, 0,
    1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    1, -1, -1, 1, 1, 0, 0, 1, 0, 0,

    -1, 1, 1, 1, 0, 1, 1, 1, 1, 1,
    1, 1, 1, 1, 1, 1, 1, 1, 0, 1,
    1, 1, -1, 1, 1, 1, 0, 1, 0, 0,
    -1, 1, -1, 1, 0, 1, 0, 1, 1, 0,
    -1, 1, 1, 1, 0, 1, 1, 1, 1, 1,
    1, 1, -1, 1, 1, 1, 0, 1, 0, 0,

    -1, -1, 1, 1, 0, 0, 1, 1, 1, 1,
    -1, 1, 1, 1, 0, 1, 1, 1, 0, 1,
    -1, 1, -1, 1, 0, 1, 0, 1, 0, 0,
    -1, -1, -1, 1, 0, 0, 0, 1, 1, 0,
    -1, -1, 1, 1, 0, 0, 1, 1, 1, 1,
    -1, 1, -1, 1, 0, 1, 0, 1, 0, 0,

    1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    -1, 1, 1, 1, 0, 1, 1, 1, 0, 1,
    -1, -1, 1, 1, 0, 0, 1, 1, 0, 0,
    -1, -1, 1, 1, 0, 0, 1, 1, 0, 0,
    1, -1, 1, 1, 1, 0, 1, 1, 1, 0,
    1, 1, 1, 1, 1, 1, 1, 1, 1, 1,

    1, -1, -1, 1, 1, 0, 0, 1, 1, 1,
    -1, -1, -1, 1, 0, 0, 0, 1, 0, 1,
    -1, 1, -1, 1, 0, 1, 0, 1, 0, 0,
    1, 1, -1, 1, 1, 1, 0, 1, 1, 0,
    1, -1, -1, 1, 1, 0, 0, 1, 1, 1,
    -1, 1, -1, 1, 0, 1, 0, 1, 0, 0,
    } );
  private GPUDevice _device;
  private GPURenderPipeline _pipeline;
  private GPUCanvasContext _gl;
  private GPUAdapter _adapter;
  private GPUBindGroup _uniformBindGroup;
  private GPUBuffer _verticesBuffer;
  private GPURenderPassDescriptor.Builder _renderPassDescriptor;
  private final Matrix4d _projectionMatrix = new Matrix4d();
  private GPUBuffer _uniformBuffer;

  @Override
  public void onModuleLoad()
  {
    WindowGlobal.navigator().gpu().requestAdapter().then( adapter -> {
      _adapter = adapter;
      return adapter.requestDevice();
    } ).thenAccept( this::onStart );
  }

  private void onStart( @Nonnull final GPUDevice device )
  {
    _device = device;
    final HTMLCanvasElement canvas = WebGpuKit.createCanvas();
    canvas.width = WindowGlobal.innerWidth();
    canvas.height = WindowGlobal.innerHeight();

    _gl = WebGpuKit.getGpuCanvasContext( canvas );

    // Use the preferred format of adapter instead of hardcoding to a specific format ala bgra8unorm.
    @GPUTextureFormat
    final String textureFormat = _gl.getPreferredFormat( _adapter );

    final GPUExtent3DDict presentationSize = WebGpuKit.calcGpuExtent3D( canvas );
    _gl.configure( GPUCanvasConfiguration
                     .create( _device, textureFormat )
                     //Ensure the configured size takes into account the device pixel ratio.
                     .size( presentationSize ) );

    // Create a vertex buffer from the cube data.
    _verticesBuffer = device.createBuffer( GPUBufferDescriptor
                                             .create( cubeVertexArray.byteLength(), GPUBufferUsage.VERTEX )
                                             .mappedAtCreation( true ) );
    new Float32Array( _verticesBuffer.getMappedRange() ).set( cubeVertexArray );
    _verticesBuffer.unmap();

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
      "fn main([[location(0)]] position : vec4<f32>,\n" +
      "        [[location(1)]] uv : vec2<f32>) -> VertexOutput {\n" +
      "  var output : VertexOutput;\n" +
      "  output.Position = uniforms.modelViewProjectionMatrix * position;\n" +
      "  output.fragUV = uv;\n" +
      "  output.fragPosition = 0.5 * (position + vec4<f32>(1.0, 1.0, 1.0, 1.0));\n" +
      "  return output;\n" +
      "}\n";
    final GPUVertexState.Builder vertexState =
      GPUVertexState
        .create( _device.createShaderModule( GPUShaderModuleDescriptor.create( vertexShader ) ),
                 "main" )
        .buffers( GPUVertexBufferLayout.create( cubeVertexSize, new GPUVertexAttribute[]{
          // position
          GPUVertexAttribute.create( GPUVertexFormat.float32x4, cubePositionOffset, 0 ),
          GPUVertexAttribute.create( GPUVertexFormat.float32x2, cubeUVOffset, 1 )
        } ) );

    @WGSL
    final String fragmentShader =
      "[[stage(fragment)]]\n" +
      "fn main([[location(0)]] fragUV: vec2<f32>,\n" +
      "        [[location(1)]] fragPosition: vec4<f32>) -> [[location(0)]] vec4<f32> {\n" +
      "  return fragPosition;\n" +
      "}\n";
    final GPUFragmentState fragmentState =
      GPUFragmentState.create( _device.createShaderModule( GPUShaderModuleDescriptor.create( fragmentShader ) ),
                               "main",
                               new GPUColorTargetState[]{ GPUColorTargetState.create( textureFormat ) } );

    _pipeline =
      _device.createRenderPipeline( GPURenderPipelineDescriptor
                                      .create( vertexState )
                                      .fragment( fragmentState )
                                      .primitive( GPUPrimitiveState
                                                    .create()
                                                    .topology( GPUPrimitiveTopology.triangle_list )
                                                    // Backface culling since the cube is solid piece of geometry.
                                                    // Faces pointing away from the camera will be occluded by faces
                                                    // pointing toward the camera.
                                                    .cullMode( GPUCullMode.back ) )
                                      // Enable depth testing so that the fragment closest to the camera
                                      // is rendered in front.
                                      .depthStencil( GPUDepthStencilState.create( GPUTextureFormat.depth24plus )
                                                       .depthCompare( GPUCompareFunction.less )
                                                       .depthWriteEnabled( true ) ) );

    final GPUTexture depthTexture =
      device.createTexture( GPUTextureDescriptor.create( presentationSize,
                                                         GPUTextureFormat.depth24plus,
                                                         GPUTextureUsage.RENDER_ATTACHMENT ) );

    final int uniformBufferSize = Float.BYTES * 16; // 4x4 matrix
    _uniformBuffer =
      device.createBuffer( GPUBufferDescriptor.create( uniformBufferSize,
                                                       GPUBufferUsage.UNIFORM | GPUBufferUsage.COPY_DST ) );

    final GPUBindGroupDescriptor.Builder bindGroupDescriptor =
      GPUBindGroupDescriptor.create( _pipeline.getBindGroupLayout( 0 ),
                                     new GPUBindGroupEntry[]
                                       {
                                         GPUBindGroupEntry.create( 0,
                                                                   GPUBufferBinding.create( _uniformBuffer ) )
                                       } );
    _uniformBindGroup = device.createBindGroup( bindGroupDescriptor );

    final GPUTextureView textureView = _gl.getCurrentTexture().createView();

    final GPURenderPassColorAttachment attachment =
      GPURenderPassColorAttachment.create( textureView,
                                           GPUColorDict.create( 0.5, 0.5, 0.5, 1 ),
                                           GPUStoreOp.store );

    _renderPassDescriptor =
      GPURenderPassDescriptor
        .create( new GPURenderPassColorAttachment[]{ attachment } )
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
    final Matrix4d viewMatrix = new Matrix4d();
    viewMatrix.setIdentity();
    viewMatrix.translate( 0, 0, -4 );
    viewMatrix.rotateX( System.currentTimeMillis() / 1000.0 );
    viewMatrix.rotateY( System.currentTimeMillis() / 1000.0 );
    //mat4.rotate( viewMatrix, viewMatrix, 1, vec3.fromValues(Math.sin(now), Math.cos(now), 0) );

    final Matrix4d modelViewProjectionMatrix = new Matrix4d();
    MatrixKit.multiply( modelViewProjectionMatrix, viewMatrix, _projectionMatrix );

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
    passEncoder.draw( cubeVertexCount, 1, 0, 0 );
    passEncoder.endPass();

    _device.queue().submit( new GPUCommandBuffer[]{ commandEncoder.finish() } );
  }
}