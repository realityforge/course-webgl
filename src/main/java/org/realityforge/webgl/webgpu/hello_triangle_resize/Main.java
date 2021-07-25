package org.realityforge.webgl.webgpu.hello_triangle_resize;

import akasha.Document;
import akasha.HTMLCanvasElement;
import akasha.HTMLHeadElement;
import akasha.HTMLStyleElement;
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
import javax.annotation.Nullable;
import org.intellij.lang.annotations.Language;
import org.realityforge.webgl.util.CanvasUtil;
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
  @Nullable
  private GPUTextureView _renderTargetView;
  @Nullable
  private GPUTexture _renderTarget;
  @GPUTextureFormat
  private String _textureFormat;
  private GPUExtent3DDict _presentationSize;
  private int _sampleCount;
  private HTMLCanvasElement _canvas;

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
    _canvas = CanvasUtil.createCanvas();

    @Language( "CSS" )
    final String css =
      "@keyframes animated-size {\n" +
      "  0% {\n" +
      "    width: 10px;\n" +
      "    height: 600px;\n" +
      "  }\n" +
      "  50% {\n" +
      "    width: 100%;\n" +
      "    height: 600px;\n" +
      "  }\n" +
      "  100% {\n" +
      "    width: 10px;\n" +
      "    height: 600px;\n" +
      "  }\n" +
      "}\n" +
      "\n" +
      ".animatedCanvasSize {\n" +
      "  animation-duration: 3s;\n" +
      "  animation-iteration-count: infinite;\n" +
      "  animation-name: animated-size;\n" +
      "  animation-timing-function: ease;\n" +
      "}";
    final Document document = WindowGlobal.document();
    final HTMLStyleElement styleElement = (HTMLStyleElement) document.createElement( "style" );
    styleElement.innerText = css;
    final HTMLHeadElement head = document.head();
    assert null != head;
    head.appendChild( styleElement );

    _canvas.classList().add( "animatedCanvasSize" );

    _gl = WebGpuKit.getGpuCanvasContext( _canvas );

    // Use the preferred format of adapter instead of hardcoding to a specific format ala bgra8unorm.
    _textureFormat = _gl.getPreferredFormat( _adapter );

    //Ensure the configured size takes into account the device pixel ratio.
    _presentationSize = WebGpuKit.calcGpuExtent3D( _canvas );

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
                               new GPUColorTargetState[]{ GPUColorTargetState.create( _textureFormat ) } );

    _sampleCount = 4;
    _pipeline = _device.createRenderPipeline( GPURenderPipelineDescriptor
                                                .create( vertexState )
                                                .fragment( fragmentState )
                                                .primitive( GPUPrimitiveState
                                                              .create()
                                                              .topology( GPUPrimitiveTopology.triangle_list ) )
                                                .multisample( GPUMultisampleState.create().count( _sampleCount ) ) );

    WindowGlobal.requestAnimationFrame( t -> renderFrame() );
  }

  private void renderFrame()
  {
    WindowGlobal.requestAnimationFrame( t -> renderFrame() );
    final GPUExtent3DDict newSize = WebGpuKit.calcGpuExtent3D( _canvas );
    if ( null == _presentationSize )
    {
      _presentationSize = newSize;
    }
    else
    {
      if ( newSize.height() != _presentationSize.height() ||
           newSize.width() != _presentationSize.width() )
      {
        if ( null != _renderTarget )
        {
          // Destroy the previous render target
          _renderTarget.destroy();
          _renderTargetView = null;
          _renderTarget = null;
        }
        _presentationSize = newSize;
      }
    }

    if ( null == _renderTarget )
    {
      _gl.configure( GPUCanvasConfiguration
                       .create( _device, _textureFormat )
                       .size( _presentationSize ) );

      _renderTarget = _device.createTexture( GPUTextureDescriptor
                                               .create( _presentationSize,
                                                        _textureFormat,
                                                        GPUTextureUsage.RENDER_ATTACHMENT )
                                               .sampleCount( _sampleCount ) );
      _renderTargetView = _renderTarget.createView();
    }
    assert null != _renderTargetView;

    final GPUCommandEncoder commandEncoder = _device.createCommandEncoder();
    final GPUTextureView textureView = _gl.getCurrentTexture().createView();

    final GPURenderPassColorAttachment attachment =
      GPURenderPassColorAttachment
        .create( _renderTargetView, GPUColorDict.create( 0, 0, 0, 1 ), GPUStoreOp.store )
        .resolveTarget( textureView );

    final GPURenderPassEncoder passEncoder =
      commandEncoder.beginRenderPass( GPURenderPassDescriptor.create( new GPURenderPassColorAttachment[]{ attachment } ) );
    passEncoder.setPipeline( _pipeline );
    passEncoder.draw( 3, 1, 0, 0 );
    passEncoder.endPass();

    _device.queue().submit( new GPUCommandBuffer[]{ commandEncoder.finish() } );
  }
}
