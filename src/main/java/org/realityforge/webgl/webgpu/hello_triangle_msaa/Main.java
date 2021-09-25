package org.realityforge.webgl.webgpu.hello_triangle_msaa;

import akasha.HTMLCanvasElement;
import akasha.WindowGlobal;
import akasha.gpu.GPUAdapter;
import akasha.gpu.GPUCanvasConfiguration;
import akasha.gpu.GPUCanvasContext;
import akasha.gpu.GPUColorDict;
import akasha.gpu.GPUColorTargetState;
import akasha.gpu.GPUCommandBuffer;
import akasha.gpu.GPUCommandEncoder;
import akasha.gpu.GPUDevice;
import akasha.gpu.GPUExtent3DDict;
import akasha.gpu.GPUFragmentState;
import akasha.gpu.GPUMultisampleState;
import akasha.gpu.GPUPrimitiveState;
import akasha.gpu.GPUPrimitiveTopology;
import akasha.gpu.GPURenderPassColorAttachment;
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
import akasha.gpu.GPUVertexState;
import akasha.gpu.WGSL;
import com.google.gwt.core.client.EntryPoint;
import javax.annotation.Nonnull;
import org.realityforge.webgl.webgpu.util.WebGpuKit;

/**
 * A simple port of https://github.com/austinEng/webgpu-samples/blob/main/src/sample/helloTriangle/main.ts
 */
@SuppressWarnings( "UnstableApiUsage" )
public final class Main
  implements EntryPoint
{
  private GPUDevice _device;
  private GPURenderPipeline _pipeline;
  private GPUCanvasContext _gl;
  private GPUAdapter _adapter;
  private GPUTextureView _view;

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

    _gl = WebGpuKit.getGpuCanvasContext( canvas );

    // Use the preferred format of adapter instead of hardcoding to a specific format ala bgra8unorm.
    @GPUTextureFormat
    final String textureFormat = _gl.getPreferredFormat( _adapter );

    //Ensure the configured size takes into account the device pixel ratio.
    final GPUExtent3DDict presentationSize = WebGpuKit.calcGpuExtent3D( canvas );

    _gl.configure( GPUCanvasConfiguration
                     .create( _device, textureFormat )
                     .size( presentationSize ) );

    @WGSL
    final String vertexShader =
      "[[stage(vertex)]]\n" +
      "fn main([[builtin(vertex_index)]] VertexIndex : u32)\n" +
      "     -> [[builtin(position)]] vec4<f32> {\n" +
      "  var pos = array<vec2<f32>, 3>(\n" +
      "      vec2<f32>(0.0, 0.5),\n" +
      "      vec2<f32>(-0.5, -0.5),\n" +
      "      vec2<f32>(0.5, -0.5));\n" +
      "\n" +
      "  return vec4<f32>(pos[VertexIndex], 0.0, 1.0);\n" +
      "}";
    final GPUVertexState.Builder vertexState =
      GPUVertexState.create( _device.createShaderModule( GPUShaderModuleDescriptor.code( vertexShader ) ),
                             "main" );
    @WGSL
    final String fragmentShader =
      "[[stage(fragment)]]\n" +
      "fn main() -> [[location(0)]] vec4<f32> {\n" +
      "  return vec4<f32>(1.0, 0.0, 0.0, 1.0);\n" +
      "}";
    final GPUFragmentState fragmentState =
      GPUFragmentState.create( _device.createShaderModule( GPUShaderModuleDescriptor.code( fragmentShader ) ),
                               "main",
                               new GPUColorTargetState[]{ GPUColorTargetState.format( textureFormat ) } );

    final int sampleCount = 4;
    _pipeline = _device.createRenderPipeline( GPURenderPipelineDescriptor
                                                .vertex( vertexState )
                                                .fragment( fragmentState )
                                                .primitive( GPUPrimitiveState
                                                              .create()
                                                              .topology( GPUPrimitiveTopology.triangle_list ) )
                                                .multisample( GPUMultisampleState.create().count( sampleCount ) ) );
    final GPUTexture texture =
      device.createTexture( GPUTextureDescriptor
                              .create( presentationSize, textureFormat, GPUTextureUsage.RENDER_ATTACHMENT )
                              .sampleCount( sampleCount ) );
    _view = texture.createView();

    WindowGlobal.requestAnimationFrame( t -> renderFrame() );
  }

  private void renderFrame()
  {
    WindowGlobal.requestAnimationFrame( t -> renderFrame() );
    final GPUCommandEncoder commandEncoder = _device.createCommandEncoder();
    final GPUTextureView textureView = _gl.getCurrentTexture().createView();

    final GPURenderPassColorAttachment attachment =
      GPURenderPassColorAttachment
        .create( _view, GPUColorDict.create( 0, 0, 0, 1 ), GPUStoreOp.store )
        .resolveTarget( textureView );

    final GPURenderPassEncoder passEncoder =
      commandEncoder.beginRenderPass( GPURenderPassDescriptor.colorAttachments( new GPURenderPassColorAttachment[]{
        attachment
      } ) );
    passEncoder.setPipeline( _pipeline );
    passEncoder.draw( 3, 1, 0, 0 );
    passEncoder.endPass();

    _device.queue().submit( new GPUCommandBuffer[]{ commandEncoder.finish() } );
  }
}
