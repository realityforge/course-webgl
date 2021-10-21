package org.realityforge.webgl.webgpu.textured_cube;

import akasha.HTMLCanvasElement;
import akasha.ImageBitmap;
import akasha.Response;
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
import akasha.gpu.GPUFilterMode;
import akasha.gpu.GPUFragmentState;
import akasha.gpu.GPUImageCopyExternalImage;
import akasha.gpu.GPUImageCopyTextureTagged;
import akasha.gpu.GPUPrimitiveState;
import akasha.gpu.GPUPrimitiveTopology;
import akasha.gpu.GPURenderPassColorAttachment;
import akasha.gpu.GPURenderPassDepthStencilAttachment;
import akasha.gpu.GPURenderPassDescriptor;
import akasha.gpu.GPURenderPassEncoder;
import akasha.gpu.GPURenderPipeline;
import akasha.gpu.GPURenderPipelineDescriptor;
import akasha.gpu.GPUSampler;
import akasha.gpu.GPUSamplerDescriptor;
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
import org.realityforge.vecmath.Vector4d;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.webgpu.util.WebGpuKit;

@SuppressWarnings( "UnstableApiUsage" )
public final class Main
  implements EntryPoint
{
  /// Byte size of one cube vertex.
  private static final int CUBE_VERTEX_SIZE = Float.BYTES * ( 4 /* position */ + 4 /* color */ + 2 /* uv */ );
  /// Byte offset of cube vertex position attribute.
  private static final int CUBE_POSITION_OFFSET = 0;
  /// Byte offset of cube vertex color attribute.
  private static final int CUBE_COLOR_OFFSET = CUBE_POSITION_OFFSET + Vector4d.FLOAT_BYTES;
  /// Byte offset of cube vertex uv attribute.
  private static final int CUBE_UV_OFFSET = CUBE_COLOR_OFFSET + Vector4d.FLOAT_BYTES;
  private static final int CUBE_VERTEX_COUNT = 36;
  private static final Float32Array CUBE_VERTEX_ARRAY = new Float32Array( new double[]{
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
  private GPURenderPassDescriptor _renderPassDescriptor;
  private final Matrix4d _projectionMatrix = new Matrix4d();
  private GPUBuffer _uniformBuffer;
  private ImageBitmap _imageBitmap;

  @Override
  public void onModuleLoad()
  {
    WindowGlobal
      .fetch( "assets/Di-3d.png" )
      .then( Response::blob )
      .then( WindowGlobal::createImageBitmap )
      .thenAccept( imageBitmap -> {
        _imageBitmap = imageBitmap;
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
                     .device( _device )
                     .format( textureFormat )
                     //Ensure the configured size takes into account the device pixel ratio.
                     .size( presentationSize ) );

    // Create a vertex buffer from the cube data.
    _verticesBuffer = device.createBuffer( GPUBufferDescriptor
                                             .size( CUBE_VERTEX_ARRAY.byteLength() )
                                             .usage( GPUBufferUsage.VERTEX )
                                             .mappedAtCreation( true ) );
    new Float32Array( _verticesBuffer.getMappedRange() ).set( CUBE_VERTEX_ARRAY );
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
                    .arrayStride( CUBE_VERTEX_SIZE )
                    .attributes(
                      GPUVertexAttribute
                        .format( GPUVertexFormat.float32x4 )
                        .offset( CUBE_POSITION_OFFSET )
                        .shaderLocation( 0 ),
                      GPUVertexAttribute
                        .format( GPUVertexFormat.float32x2 )
                        .offset( CUBE_UV_OFFSET )
                        .shaderLocation( 1 )
                    )
        );

    @WGSL
    final String fragmentShader =
      "[[group(0), binding(1)]] var mySampler: sampler;\n" +
      "[[group(0), binding(2)]] var myTexture: texture_2d<f32>;\n" +
      "\n" +
      "[[stage(fragment)]]\n" +
      "fn main([[location(0)]] fragUV: vec2<f32>,\n" +
      "        [[location(1)]] fragPosition: vec4<f32>) -> [[location(0)]] vec4<f32> {\n" +
      "  return textureSample(myTexture, mySampler, fragUV) * fragPosition;\n" +
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

    final int uniformBufferSize = Matrix4d.FLOAT_BYTES;
    _uniformBuffer =
      device.createBuffer( GPUBufferDescriptor
                             .size( uniformBufferSize )
                             .usage( GPUBufferUsage.UNIFORM | GPUBufferUsage.COPY_DST ) );

    // Upload image into a GPUTexture.
    final GPUTexture cubeTexture =
      _device.createTexture( GPUTextureDescriptor
                               .size( GPUExtent3DDict
                                        .width( _imageBitmap.width() )
                                        .height( _imageBitmap.height() )
                                        .depthOrArrayLayers( 1 ) )
                               // TODO: Do we know this ahead of time? Should we not also source this
                               //   somehow from imageBitmap?
                               .format( GPUTextureFormat.rgba8unorm )
                               .usage( GPUTextureUsage.TEXTURE_BINDING |
                                       GPUTextureUsage.COPY_DST |
                                       GPUTextureUsage.RENDER_ATTACHMENT
                               ) );

    _device.queue().copyExternalImageToTexture( GPUImageCopyExternalImage.source( _imageBitmap ),
                                                GPUImageCopyTextureTagged.texture( cubeTexture ),
                                                GPUExtent3DDict
                                                  .width( _imageBitmap.width() )
                                                  .height( _imageBitmap.height() ) );

    final GPUSampler sampler =
      _device.createSampler( GPUSamplerDescriptor
                               .of()
                               .magFilter( GPUFilterMode.linear )
                               .minFilter( GPUFilterMode.linear ) );

    final GPUBindGroupDescriptor bindGroupDescriptor =
      GPUBindGroupDescriptor.layout( _pipeline.getBindGroupLayout( 0 ) )
        .entries(
          GPUBindGroupEntry.binding( 0 ).resource( GPUBufferBinding.buffer( _uniformBuffer ) ),
          GPUBindGroupEntry.binding( 1 ).resource( sampler ),
          GPUBindGroupEntry.binding( 2 ).resource( cubeTexture.createView() )
        );
    _uniformBindGroup = device.createBindGroup( bindGroupDescriptor );

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
    passEncoder.draw( CUBE_VERTEX_COUNT, 1, 0, 0 );
    passEncoder.endPass();

    _device.queue().submit( commandEncoder.finish() );
  }
}
