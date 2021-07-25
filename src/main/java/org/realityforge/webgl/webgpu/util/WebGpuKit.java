package org.realityforge.webgl.webgpu.util;

import akasha.HTMLCanvasElement;
import akasha.RenderContextType;
import akasha.WindowGlobal;
import akasha.gpu.GPUCanvasContext;
import akasha.gpu.GPUExtent3DDict;
import java.util.Objects;
import javax.annotation.Nonnull;

@SuppressWarnings( "UnstableApiUsage" )
public final class WebGpuKit
{
  private WebGpuKit()
  {
  }

  @Nonnull
  public static GPUExtent3DDict calcGpuExtent3D( @Nonnull final HTMLCanvasElement canvas )
  {
    final double devicePixelRatio = WindowGlobal.devicePixelRatio();
    return GPUExtent3DDict
      .create( (int) ( canvas.clientWidth() * devicePixelRatio ) )
      .height( (int) ( canvas.clientHeight() * devicePixelRatio ) );
  }

  @Nonnull
  public static GPUCanvasContext getGpuCanvasContext( @Nonnull final HTMLCanvasElement canvas )
  {
    return (GPUCanvasContext) Objects.requireNonNull( canvas.getContext( RenderContextType.webgpu ) );
  }
}
