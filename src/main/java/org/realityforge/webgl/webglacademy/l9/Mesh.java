package org.realityforge.webgl.webglacademy.l9;

import elemental3.core.Float32Array;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLTexture;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
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

  void render( @Nonnull final Matrix4d modelMatrix,
               @Nonnull final Matrix4d viewMatrix,
               @Nonnull final Matrix4d projectionMatrix,
               @Nonnull final WebGLTexture texture )
  {
    final AppState appState = AppState.get();
    appState.useProgram( _material.getProgram() );

    final WebGL2RenderingContext gl = appState.gl();
    gl.uniformMatrix4fv( _material.getModelMatrixLocation(), false, new Float32Array( modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _material.getViewMatrixLocation(), false, new Float32Array( viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _material.getProjectionMatrixLocation(), false,
                         new Float32Array( projectionMatrix.toArray() ) );
    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, texture );
    gl.uniform1i( _material.getTextureLocation(), 0 );

    _geometry.draw();
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    final AppState appState = AppState.get();
    final WebGLProgram program = _material.getProgram();
    appState.useProgram( program );

    _geometry.getAttribute( 0 ).setLocation( GL.getAttribLocation( gl, program, "position" ) );
    _geometry.getAttribute( 1 ).setLocation( GL.getAttribLocation( gl, program, "normal" ) );
    _geometry.getAttribute( 2 ).setLocation( GL.getAttribLocation( gl, program, "uv" ) );
    _geometry.uploadToGpu();
  }
}
