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
    } );// 4x4 matrix
  private static final int MATRIX_SIZE = Float.BYTES * 16;// uniformBindGroup offset must be 256-byte aligned
  private static final int UNIFORM_BUFFER_OFFSET = 256;
  private GPUDevice _device;
  private GPURenderPipeline _pipeline;
  private GPUCanvasContext _gl;
  private GPUAdapter _adapter;
  private GPUBindGroup _uniformBindGroup1;
  private GPUBindGroup _uniformBindGroup2;
  private GPUBuffer _verticesBuffer;
  private GPURenderPassDescriptor.Builder _renderPassDescriptor;
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

    final int uniformBufferSize = UNIFORM_BUFFER_OFFSET + MATRIX_SIZE;
    _uniformBuffer =
      device.createBuffer( GPUBufferDescriptor.create( uniformBufferSize,
                                                       GPUBufferUsage.UNIFORM | GPUBufferUsage.COPY_DST ) );

    // The descriptor for the first matrix in uniform buffer
    final GPUBindGroupDescriptor.Builder bindGroup1Descriptor =
      GPUBindGroupDescriptor.create( _pipeline.getBindGroupLayout( 0 ),
                                     new GPUBindGroupEntry[]{
                                       // The first matrix in uniform buffer
                                       GPUBindGroupEntry.create( 0,
                                                                 GPUBufferBinding
                                                                   .create( _uniformBuffer )
                                                                   .offset( 0 )
                                                                   .size( MATRIX_SIZE ) )
                                     } );
    _uniformBindGroup1 = device.createBindGroup( bindGroup1Descriptor );

    // The descriptor for the second matrix in uniform buffer
    final GPUBindGroupDescriptor.Builder bindGroup2Descriptor =
      GPUBindGroupDescriptor.create( _pipeline.getBindGroupLayout( 0 ),
                                     new GPUBindGroupEntry[]{
                                       GPUBindGroupEntry.create( 0,
                                                                 GPUBufferBinding
                                                                   .create( _uniformBuffer )
                                                                   .offset( UNIFORM_BUFFER_OFFSET )
                                                                   .size( MATRIX_SIZE ) )
                                     } );
    _uniformBindGroup2 = device.createBindGroup( bindGroup2Descriptor );

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

    gpuQueue.submit( new GPUCommandBuffer[]{ commandEncoder.finish() } );
  }
}
