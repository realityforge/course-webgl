package org.realityforge.webgl.webgpu.util;

import akasha.Console;
import akasha.Document;
import akasha.HTMLCanvasElement;
import akasha.HTMLElement;
import akasha.RenderContextType;
import akasha.WindowGlobal;
import akasha.gpu.GPUCanvasContext;
import akasha.gpu.GPUCompilationMessage;
import akasha.gpu.GPUCompilationMessageType;
import akasha.gpu.GPUDevice;
import akasha.gpu.GPUExtent3DDict;
import akasha.gpu.GPUShaderModule;
import akasha.gpu.GPUShaderModuleDescriptor;
import akasha.gpu.WGSL;
import akasha.lang.JsArray;
import java.util.Objects;
import javax.annotation.Nonnull;

@SuppressWarnings( "UnstableApiUsage" )
public final class WebGpuKit
{
  private WebGpuKit()
  {
  }

  @Nonnull
  public static HTMLCanvasElement createCanvas()
  {
    final Document document = WindowGlobal.document();
    final HTMLCanvasElement canvas = (HTMLCanvasElement) document.createElement( "canvas" );
    final HTMLElement body = document.body;
    assert null != body;
    body.appendChild( canvas );
    return canvas;
  }

  @Nonnull
  public static HTMLCanvasElement createFullWindowCanvas()
  {
    final HTMLCanvasElement canvas = createCanvas();
    canvas.width = WindowGlobal.innerWidth();
    canvas.height = WindowGlobal.innerHeight();
    return canvas;
  }

  @Nonnull
  public static GPUExtent3DDict calcGpuExtent3D( @Nonnull final HTMLCanvasElement canvas )
  {
    final double devicePixelRatio = WindowGlobal.devicePixelRatio();
    return GPUExtent3DDict
      .width( (int) ( canvas.clientWidth() * devicePixelRatio ) )
      .height( (int) ( canvas.clientHeight() * devicePixelRatio ) );
  }

  @Nonnull
  public static GPUCanvasContext getGpuCanvasContext( @Nonnull final HTMLCanvasElement canvas )
  {
    return (GPUCanvasContext) Objects.requireNonNull( canvas.getContext( RenderContextType.webgpu ) );
  }

  @Nonnull
  public static GPUShaderModule createShaderModule( @Nonnull final GPUDevice device, @WGSL @Nonnull final String code )
  {
    final GPUShaderModule module = device.createShaderModule( GPUShaderModuleDescriptor.code( code ) );
    module.compilationInfo().thenAccept( compilationInfo -> {

      final JsArray<GPUCompilationMessage> messages = compilationInfo.messages();
      if ( messages.length > 0 )
      {
        boolean hadError = false;
        Console.log( "Shader compilation log:" );
        for ( int i = 0; i < messages.length; ++i )
        {
          final GPUCompilationMessage message = messages.getAt( i );
          Console.log( message.lineNum() + ":" + message.linePos() + " - " + message.message() );
          hadError |= GPUCompilationMessageType.error.equals( message.type() );
        }
        if ( hadError )
        {
          Console.log( "Shader failed to compile" );
        }
      }
    } );

    return module;
  }

}
