package org.realityforge.webgl.webgpu.two_cubes;

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
import akasha.gpu.GPUCommandEncoder;
import akasha.gpu.GPUCompareFunction;
import akasha.gpu.GPUCullMode;
import akasha.gpu.GPUDepthStencilState;
import akasha.gpu.GPUDevice;
import akasha.gpu.GPUExtent3DDict;
import akasha.gpu.GPUFragmentState;
import akasha.gpu.GPUPrimitiveState;
import akasha.gpu.GPUPrimitiveTopology;
import akasha.gpu.GPUQueue;
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
import org.realityforge.webgl.webgpu.util.WebGpuKit;

/**
 * This example shows some of the alignment requirements involved when updating and binding multiple
 * slices of a uniform buffer. It renders two rotating cubes which have transform matrices at different
 * offsets in a uniform buffer.
 */
@SuppressWarnings( "UnstableApiUsage" )
public final class Main
  implements EntryPoint
{
  private static final int cubeVertexSize = 4 * 10; // Byte size of one cube vertex.
  private static final int cubePositionOffset = 0;
  // Byte offset of cube vertex color attribute.
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
  // uniformBindGroup offset must be 256-byte aligned
  private static final int UNIFORM_BUFFER_OFFSET = 256;
  private GPUDevice _device;
  private GPURenderPipeline _pipeline;
  private GPUCanvasContext _gl;
  private GPUAdapter _adapter;
  private GPUBindGroup _uniformBindGroup1;
  private GPUBindGroup _uniformBindGroup2;
  private GPUBuffer _verticesBuffer;
  private GPURenderPassDescriptor _renderPassDescriptor;
  private final Matrix4d _projectionMatrix = new Matrix4d();
  private final Matrix4d _initialModelMatrix1 = new Matrix4d();
  private final Matrix4d _initialModelMatrix2 = new Matrix4d();
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
    final HTMLCanvasElement canvas = WebGpuKit.createFullWindowCanvas();

    _gl = WebGpuKit.getGpuCanvasContext( canvas );

    // Use the preferred format of adapter instead of hardcoding to a specific format ala bgra8unorm.
    @GPUTextureFormat
    final String textureFormat = _gl.getPreferredFormat( _adapter );

    final GPUExtent3DDict presentationSize = WebGpuKit.calcGpuExtent3D( canvas );
    _gl.configure( GPUCanvasConfiguration
                     .device( _device )
                     .format( textureFormat )
                     //Ensure the configured size takes into account the device pixel ratio.
                     .size( presentationSize ) );

    // Create a vertex buffer from the cube data.
    _verticesBuffer = device.createBuffer( GPUBufferDescriptor
                                             .size( cubeVertexArray.byteLength() )
                                             .usage( GPUBufferUsage.VERTEX )
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
    final GPUVertexState vertexState =
      GPUVertexState
        .module( _device.createShaderModule( GPUShaderModuleDescriptor.code( vertexShader ) ) )
        .entryPoint( "main" )
        .buffers( GPUVertexBufferLayout
                    .arrayStride( cubeVertexSize )
                    .attributes(
                      GPUVertexAttribute
                        .format( GPUVertexFormat.float32x4 )
                        .offset( cubePositionOffset )
                        .shaderLocation( 0 ),
                      GPUVertexAttribute
                        .format( GPUVertexFormat.float32x2 )
                        .offset( cubeUVOffset )
                        .shaderLocation( 1 ) ) );

    @WGSL
    final String fragmentShader =
      "[[stage(fragment)]]\n" +
      "fn main([[location(0)]] fragUV: vec2<f32>,\n" +
      "        [[location(1)]] fragPosition: vec4<f32>) -> [[location(0)]] vec4<f32> {\n" +
      "  return fragPosition;\n" +
      "}\n";
    final GPUFragmentState fragmentState =
      GPUFragmentState
        .module( _device.createShaderModule( GPUShaderModuleDescriptor.code( fragmentShader ) ) )
        .entryPoint( "main" )
        .targets( GPUColorTargetState.format( textureFormat ) );

    _pipeline =
      _device.createRenderPipeline( GPURenderPipelineDescriptor
                                      .vertex( vertexState )
                                      .fragment( fragmentState )
                                      .primitive( GPUPrimitiveState
                                                    .of()
                                                    .topology( GPUPrimitiveTopology.triangle_list )
                                                    // Backface culling since the cube is solid piece of geometry.
                                                    // Faces pointing away from the camera will be occluded by faces
                                                    // pointing toward the camera.
                                                    .cullMode( GPUCullMode.back ) )
                                      // Enable depth testing so that the fragment closest to the camera
                                      // is rendered in front.
                                      .depthStencil( GPUDepthStencilState
                                                       .format( GPUTextureFormat.depth24plus )
                                                       .depthCompare( GPUCompareFunction.less )
                                                       .depthWriteEnabled( true ) ) );

    final GPUTexture depthTexture =
      device.createTexture( GPUTextureDescriptor
                              .size( presentationSize )
                              .format( GPUTextureFormat.depth24plus )
                              .usage( GPUTextureUsage.RENDER_ATTACHMENT ) );

    final int uniformBufferSize = UNIFORM_BUFFER_OFFSET + Matrix4d.FLOAT_BYTES;
    _uniformBuffer =
      device.createBuffer( GPUBufferDescriptor
                             .size( uniformBufferSize )
                             .usage( GPUBufferUsage.UNIFORM | GPUBufferUsage.COPY_DST ) );

    // The descriptor for the first matrix in uniform buffer
    final GPUBindGroupDescriptor bindGroup1Descriptor =
      GPUBindGroupDescriptor.layout( _pipeline.getBindGroupLayout( 0 ) )
        .entries(
          // The first matrix in uniform buffer
          GPUBindGroupEntry
            .binding( 0 )
            .resource( GPUBufferBinding
                         .buffer( _uniformBuffer )
                         .offset( 0 )
                         .size( Matrix4d.FLOAT_BYTES )
            )
        );
    _uniformBindGroup1 = device.createBindGroup( bindGroup1Descriptor );

    // The descriptor for the second matrix in uniform buffer
    final GPUBindGroupDescriptor bindGroup2Descriptor =
      GPUBindGroupDescriptor
        .layout( _pipeline.getBindGroupLayout( 0 ) )
        .entries( GPUBindGroupEntry
                    .binding( 0 )
                    .resource( GPUBufferBinding
                                 .buffer( _uniformBuffer )
                                 .offset( UNIFORM_BUFFER_OFFSET )
                                 .size( Matrix4d.FLOAT_BYTES ) ) );
    _uniformBindGroup2 = device.createBindGroup( bindGroup2Descriptor );

    final GPUTextureView textureView = _gl.getCurrentTexture().createView();

    final GPURenderPassColorAttachment attachment =
      GPURenderPassColorAttachment
        .view( textureView )
        .loadValue( GPUColorDict.r( 0.5 ).g( 0.5 ).b( 0.5 ).a( 1 ) )
        .storeOp( GPUStoreOp.store );

    _renderPassDescriptor =
      GPURenderPassDescriptor
        .colorAttachments( attachment )
        .depthStencilAttachment( GPURenderPassDepthStencilAttachment
                                   .view( depthTexture.createView() )
                                   .depthLoadValue( 1 )
                                   .depthStoreOp( GPUStoreOp.store )
                                   .stencilLoadValue( 0 )
                                   .stencilStoreOp( GPUStoreOp.store ) );

    _projectionMatrix.setPerspective( MathUtil.degreesToRadians( 72 ),
                                      CanvasUtil.getAspect( canvas ),
                                      1,
                                      100 );

    _initialModelMatrix1.translate( -2, 0, 0 );
    _initialModelMatrix2.translate( 2, 0, 0 );

    WindowGlobal.requestAnimationFrame( t -> renderFrame() );
  }

  private void renderFrame()
  {
    WindowGlobal.requestAnimationFrame( t -> renderFrame() );

    final Matrix4d viewMatrix = new Matrix4d();
    viewMatrix.setIdentity();
    viewMatrix.translate( 0, 0, -7 );
    //mat4.rotate( viewMatrix, viewMatrix, 1, vec3.fromValues(Math.sin(now), Math.cos(now), 0) );

    final Matrix4d modelMatrix1 = new Matrix4d( _initialModelMatrix1 );
    modelMatrix1.rotateX( System.currentTimeMillis() / 1000.0 );
    modelMatrix1.rotateY( System.currentTimeMillis() / 1000.0 );
    final Matrix4d modelMatrix2 = new Matrix4d( _initialModelMatrix2 );
    modelMatrix2.rotateZ( System.currentTimeMillis() / 1000.0 );
    modelMatrix2.rotateY( System.currentTimeMillis() / 1000.0 );

    final Matrix4d modelViewProjectionMatrix1 = new Matrix4d();
    final Matrix4d modelViewProjectionMatrix2 = new Matrix4d();
    Matrix4d.multiply( modelViewProjectionMatrix1, modelMatrix1, viewMatrix );
    Matrix4d.multiply( modelViewProjectionMatrix1, modelViewProjectionMatrix1, _projectionMatrix );
    Matrix4d.multiply( modelViewProjectionMatrix2, modelMatrix2, viewMatrix );
    Matrix4d.multiply( modelViewProjectionMatrix2, modelViewProjectionMatrix2, _projectionMatrix );

    final Float32Array transformationMatrix1 = new Float32Array( modelViewProjectionMatrix1.toArray() );
    final Float32Array transformationMatrix2 = new Float32Array( modelViewProjectionMatrix2.toArray() );

    final GPUQueue gpuQueue = _device.queue();
    gpuQueue.writeBuffer( _uniformBuffer,
                          0,
                          transformationMatrix1.buffer(),
                          transformationMatrix1.byteOffset(),
                          transformationMatrix1.byteLength() );
    gpuQueue.writeBuffer( _uniformBuffer,
                          UNIFORM_BUFFER_OFFSET,
                          transformationMatrix2.buffer(),
                          transformationMatrix2.byteOffset(),
                          transformationMatrix2.byteLength() );

    _renderPassDescriptor.colorAttachments().getAt( 0 ).setView( _gl.getCurrentTexture().createView() );

    final GPUCommandEncoder commandEncoder = _device.createCommandEncoder();
    final GPURenderPassEncoder passEncoder = commandEncoder.beginRenderPass( _renderPassDescriptor );

    passEncoder.setPipeline( _pipeline );
    passEncoder.setVertexBuffer( 0, _verticesBuffer );

    // Bind the bind group (with the transformation matrix) for
    // each cube, and draw.
    passEncoder.setBindGroup( 0, _uniformBindGroup1 );
    passEncoder.draw( cubeVertexCount, 1, 0, 0 );

    passEncoder.setBindGroup( 0, _uniformBindGroup2 );
    passEncoder.draw( cubeVertexCount, 1, 0, 0 );

    passEncoder.endPass();

    gpuQueue.submit( commandEncoder.finish() );
  }
}
