package org.realityforge.webgl.webgpu.video_uploading;

import akasha.HTMLCanvasElement;
import akasha.HTMLVideoElement;
import akasha.WindowGlobal;
import akasha.core.Float32Array;
import akasha.gpu.GPUAdapter;
import akasha.gpu.GPUBindGroup;
import akasha.gpu.GPUBindGroupDescriptor;
import akasha.gpu.GPUBindGroupEntry;
import akasha.gpu.GPUBuffer;
import akasha.gpu.GPUBufferDescriptor;
import akasha.gpu.GPUBufferUsage;
import akasha.gpu.GPUCanvasConfiguration;
import akasha.gpu.GPUCanvasContext;
import akasha.gpu.GPUColorDict;
import akasha.gpu.GPUColorTargetState;
import akasha.gpu.GPUCommandBuffer;
import akasha.gpu.GPUCommandEncoder;
import akasha.gpu.GPUDevice;
import akasha.gpu.GPUExtent3DDict;
import akasha.gpu.GPUExternalTexture;
import akasha.gpu.GPUExternalTextureDescriptor;
import akasha.gpu.GPUFilterMode;
import akasha.gpu.GPUFragmentState;
import akasha.gpu.GPUPrimitiveState;
import akasha.gpu.GPUPrimitiveTopology;
import akasha.gpu.GPURenderPassColorAttachment;
import akasha.gpu.GPURenderPassDescriptor;
import akasha.gpu.GPURenderPassEncoder;
import akasha.gpu.GPURenderPipeline;
import akasha.gpu.GPURenderPipelineDescriptor;
import akasha.gpu.GPUSampler;
import akasha.gpu.GPUSamplerDescriptor;
import akasha.gpu.GPUShaderModuleDescriptor;
import akasha.gpu.GPUStoreOp;
import akasha.gpu.GPUTextureFormat;
import akasha.gpu.GPUTextureView;
import akasha.gpu.GPUVertexAttribute;
import akasha.gpu.GPUVertexBufferLayout;
import akasha.gpu.GPUVertexFormat;
import akasha.gpu.GPUVertexState;
import akasha.gpu.WGSL;
import com.google.gwt.core.client.EntryPoint;
import javax.annotation.Nonnull;
import jsinterop.base.Js;
import org.realityforge.vecmath.Vector3d;
import org.realityforge.webgl.webgpu.util.WebGpuKit;

@SuppressWarnings( "UnstableApiUsage" )
public final class Main
  implements EntryPoint
{
  /// Byte size of one cube vertex.
  private static final int VERTEX_SIZE = Float.BYTES * ( 3 /* position */ + 2 /* uv */ );
  /// Byte offset of vertex position attribute.
  private static final int POSITION_OFFSET = 0;
  /// Byte offset of vertex uv attribute.
  private static final int UV_OFFSET = POSITION_OFFSET + Vector3d.FLOAT_BYTES;
  private static final int VERTEX_COUNT = 6;
  private static final Float32Array RECT_VERTS = new Float32Array( new double[]{
    //position float3, uv float2
    1.0, 1.0, 0.0, 1.0, 0.0,
    1.0, -1.0, 0.0, 1.0, 1.0,
    -1.0, -1.0, 0.0, 0.0, 1.0,
    1.0, 1.0, 0.0, 1.0, 0.0,
    -1.0, -1.0, 0.0, 0.0, 1.0,
    -1.0, 1.0, 0.0, 0.0, 0.0,
    } );
  private GPUDevice _device;
  private GPURenderPipeline _pipeline;
  private GPUCanvasContext _gl;
  private GPUAdapter _adapter;
  private GPUBindGroup _uniformBindGroup;
  private GPUBuffer _verticesBuffer;
  private GPURenderPassDescriptor.Builder _renderPassDescriptor;
  private HTMLVideoElement _video;
  private GPUSampler _sampler;

  @Override
  public void onModuleLoad()
  {
    _video = (HTMLVideoElement) WindowGlobal.document().createElement( "video" );
    _video.loop = true;
    _video.autoplay = true;
    _video.muted = true;
    _video.src = "assets/video/pano.webm";
    _video.play().then( ignored -> WindowGlobal.navigator().gpu().requestAdapter() ).then( adapter -> {
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
                                             .create( RECT_VERTS.byteLength(), GPUBufferUsage.VERTEX )
                                             .mappedAtCreation( true ) );
    new Float32Array( _verticesBuffer.getMappedRange() ).set( RECT_VERTS );
    _verticesBuffer.unmap();

    @WGSL
    final String vertexShader =
      "struct VertexInput {\n" +
      "  [[location(0)]] position : vec3<f32>;\n" +
      "  [[location(1)]] uv : vec2<f32>;\n" +
      "};\n" +
      "\n" +
      "struct VertexOutput {\n" +
      "  [[builtin(position)]] Position : vec4<f32>;\n" +
      "  [[location(0)]] fragUV : vec2<f32>;\n" +
      "};\n" +
      "\n" +
      "[[stage(vertex)]]\n" +
      "fn main(input : VertexInput) -> VertexOutput {\n" +
      "  return VertexOutput(vec4<f32>(input.position, 1.0), input.uv);\n" +
      "}\n";
    final GPUVertexState.Builder vertexState =
      GPUVertexState
        .create( _device.createShaderModule( GPUShaderModuleDescriptor.create( vertexShader ) ),
                 "main" )
        .buffers( GPUVertexBufferLayout.create( VERTEX_SIZE, new GPUVertexAttribute[]{
          // position
          GPUVertexAttribute.create( GPUVertexFormat.float32x3, POSITION_OFFSET, 0 ),
          // uv
          GPUVertexAttribute.create( GPUVertexFormat.float32x2, UV_OFFSET, 1 )
        } ) );

    @WGSL
    final String fragmentShader =
      "[[binding(0), group(0)]] var mySampler: sampler;\n" +
      "[[binding(1), group(0)]] var myTexture: texture_external;\n" +
      "\n" +
      "[[stage(fragment)]]\n" +
      "fn main([[location(0)]] fragUV : vec2<f32>) -> [[location(0)]] vec4<f32> {\n" +
      "  return textureSampleLevel(myTexture, mySampler, fragUV);\n" +
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
                                                    .topology( GPUPrimitiveTopology.triangle_list ) ) );

    _sampler = device.createSampler( GPUSamplerDescriptor
                                       .create()
                                       .minFilter( GPUFilterMode.linear )
                                       .magFilter( GPUFilterMode.linear ) );

    final GPUTextureView textureView = _gl.getCurrentTexture().createView();

    final GPURenderPassColorAttachment attachment =
      GPURenderPassColorAttachment.create( textureView,
                                           GPUColorDict.create( 0, 0, 0, 1 ),
                                           GPUStoreOp.store );

    _renderPassDescriptor =
      GPURenderPassDescriptor
        .create( new GPURenderPassColorAttachment[]{ attachment } );

    WindowGlobal.requestAnimationFrame( t -> renderFrame() );
  }

  private void renderFrame()
  {
    WindowGlobal.requestAnimationFrame( t -> renderFrame() );

    final GPUExternalTexture externalTexture =
      _device.importExternalTexture( GPUExternalTextureDescriptor.create( _video ) );

    final GPUBindGroupDescriptor.Builder bindGroupDescriptor =
      GPUBindGroupDescriptor.create( _pipeline.getBindGroupLayout( 0 ),
                                     new GPUBindGroupEntry[]{
                                       GPUBindGroupEntry.create( 0, _sampler ),
                                       GPUBindGroupEntry.create( 1, externalTexture )
                                     } );
    _uniformBindGroup = _device.createBindGroup( bindGroupDescriptor );

    _renderPassDescriptor.colorAttachments().getAt( 0 ).setView( _gl.getCurrentTexture().createView() );

    final GPUCommandEncoder commandEncoder = _device.createCommandEncoder();
    final GPURenderPassEncoder passEncoder = commandEncoder.beginRenderPass( _renderPassDescriptor );

    passEncoder.setPipeline( _pipeline );
    passEncoder.setBindGroup( 0, _uniformBindGroup );
    passEncoder.setVertexBuffer( 0, _verticesBuffer );
    passEncoder.draw( VERTEX_COUNT, 1, 0, 0 );
    passEncoder.endPass();

    _device.queue().submit( new GPUCommandBuffer[]{ commandEncoder.finish() } );
  }
}
