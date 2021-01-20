package org.realityforge.webgl.webglacademy.l14;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLTexture;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Geometry;

final class Mesh
{
  @Nonnull
  private final Geometry _geometry;
  @Nonnull
  private final Material _material;

  Mesh( @Nonnull final Geometry geometry, @Nonnull final Material material )
  {
    _geometry = Objects.requireNonNull( geometry );
    _material = Objects.requireNonNull( material );
  }

  void render( @Nonnull final WebGLTexture texture, @Nonnull final WebGLTexture palette )
  {
    final AppState appState = AppState.get();
    appState.useProgram( _material.getProgram() );

    final WebGL2RenderingContext gl = appState.gl();
    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, texture );
    gl.uniform1i( _material.getTextureLocation(), 0 );

    gl.activeTexture( WebGL2RenderingContext.TEXTURE1 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, palette );
    gl.uniform1i( _material.getPaletteLocation(), 1 );

    _geometry.draw();
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    final AppState appState = AppState.get();
    final WebGLProgram program = _material.getProgram();
    appState.useProgram( program );

    _geometry.getAttribute( 0 ).setLocation( GL.getAttribLocation( gl, program, "position" ) );
    _geometry.getAttribute( 1 ).setLocation( GL.getAttribLocation( gl, program, "uv" ) );
    _geometry.uploadToGpu();
  }
}
