package org.realityforge.webgl.webgpu.hello_triangle;

import akasha.HTMLCanvasElement;
import akasha.RenderContextType;
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
import akasha.gpu.GPUPrimitiveState;
import akasha.gpu.GPUPrimitiveTopology;
import akasha.gpu.GPURenderPassColorAttachment;
import akasha.gpu.GPURenderPassDescriptor;
import akasha.gpu.GPURenderPassEncoder;
import akasha.gpu.GPURenderPipeline;
import akasha.gpu.GPURenderPipelineDescriptor;
import akasha.gpu.GPUShaderModuleDescriptor;
import akasha.gpu.GPUStoreOp;
import akasha.gpu.GPUTextureView;
import akasha.gpu.GPUVertexState;
import akasha.gpu.WGSL;
import com.google.gwt.core.client.EntryPoint;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.CanvasUtil;

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
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();

    _gl = (GPUCanvasContext) Objects.requireNonNull( canvas.getContext( RenderContextType.webgpu ) );

    // Use the preferred format of adapter instead of hardcoding to a specific format ala bgra8unorm.
    final String textureFormat = _gl.getPreferredFormat( _adapter );

    //Ensure the configured size takes into account the device pixel ratio.
    final double devicePixelRatio = WindowGlobal.devicePixelRatio();
    final GPUExtent3DDict extent3D = GPUExtent3DDict
      .create( (int) ( canvas.clientWidth() * devicePixelRatio ) )
      .height( (int) ( canvas.clientHeight() * devicePixelRatio ) );

    _gl.configure( GPUCanvasConfiguration.create( _device, textureFormat ).size( extent3D ) );

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
      GPUVertexState.create( _device.createShaderModule( GPUShaderModuleDescriptor.create( vertexShader ) ),
                             "main" );
    @WGSL
    final String fragmentShader =
      "[[stage(fragment)]]\n" +
      "fn main() -> [[location(0)]] vec4<f32> {\n" +
      "  return vec4<f32>(1.0, 0.0, 0.0, 1.0);\n" +
      "}";
    final GPUFragmentState fragmentState =
      GPUFragmentState.create( _device.createShaderModule( GPUShaderModuleDescriptor.create( fragmentShader ) ),
                               "main",
                               new GPUColorTargetState[]{ GPUColorTargetState.create( textureFormat ) } );

    _pipeline = _device.createRenderPipeline( GPURenderPipelineDescriptor
                                                .create( vertexState )
                                                .fragment( fragmentState )
                                                .primitive( GPUPrimitiveState
                                                              .create()
                                                              .topology( GPUPrimitiveTopology.triangle_list ) ) );

    WindowGlobal.requestAnimationFrame( t -> renderFrame() );
  }

  private void renderFrame()
  {
    WindowGlobal.requestAnimationFrame( t -> renderFrame() );
    final GPUCommandEncoder commandEncoder = _device.createCommandEncoder();
    final GPUTextureView textureView = _gl.getCurrentTexture().createView();

    final GPURenderPassColorAttachment attachment =
      GPURenderPassColorAttachment.create( textureView,
                                           GPUColorDict.create( 0, 0, 0, 1 ),
                                           GPUStoreOp.store );

    final GPURenderPassEncoder passEncoder =
      commandEncoder.beginRenderPass( GPURenderPassDescriptor.create( new GPURenderPassColorAttachment[]{ attachment } ) );
    passEncoder.setPipeline( _pipeline );
    passEncoder.draw( 3, 1, 0, 0 );
    passEncoder.endPass();

    _device.queue().submit( new GPUCommandBuffer[]{ commandEncoder.finish() } );
  }
}
