package org.realityforge.webgl.webglacademy.l11;

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
  private WebGLTexture _texture;
  private boolean _uploaded;

  Mesh( @Nonnull final WebGL2RenderingContext gl, @Nonnull final Geometry geometry, @Nonnull final Material material )
  {
    _geometry = Objects.requireNonNull( geometry );
    _material = Objects.requireNonNull( material );
    GL.loadImage( "assets/dragon.png" ).thenAccept( image -> {
      final WebGLTexture texture = gl.createTexture();
      assert null != texture;

      gl.pixelStorei( WebGL2RenderingContext.UNPACK_FLIP_Y_WEBGL, 1 );
      gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, texture );
      gl.texImage2D( WebGL2RenderingContext.TEXTURE_2D,
                     0,
                     WebGL2RenderingContext.RGBA,
                     WebGL2RenderingContext.RGBA,
                     WebGL2RenderingContext.UNSIGNED_BYTE,
                     image );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_MAG_FILTER,
                        WebGL2RenderingContext.LINEAR );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_MIN_FILTER,
                        WebGL2RenderingContext.NEAREST_MIPMAP_LINEAR );
      gl.generateMipmap( WebGL2RenderingContext.TEXTURE_2D );
      _texture = texture;
    } );
  }

  void render( @Nonnull final Matrix4d modelMatrix,
               @Nonnull final Matrix4d viewMatrix,
               @Nonnull final Matrix4d projectionMatrix )
  {
    final AppState appState = AppState.get();
    appState.useProgram( _material.getProgram() );

    final WebGL2RenderingContext gl = appState.gl();
    gl.uniformMatrix4fv( _material.getModelMatrixLocation(), false, new Float32Array( modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _material.getViewMatrixLocation(), false, new Float32Array( viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _material.getProjectionMatrixLocation(), false,
                         new Float32Array( projectionMatrix.toArray() ) );
    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture );
    gl.uniform1i( _material.getTextureLocation(), 0 );
    _geometry.draw();
    // TODO: It is unclear whether nulling state is of value or should only be done
    //  when we cached value in appState differs from what we expect. Possible appState
    //  should contain  list of textures bound and could unbind them when they need to
    //  be unbound?. We could perform a appState.reset() at end of frame or similar to
    //  try and track down stray state? Or maybe the geometry/material objects should
    //  just manage their own state?
    appState.useProgram( null );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, null );
  }

  boolean areTexturesLoaded()
  {
    return null != _texture;
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    final AppState appState = AppState.get();
    final WebGLProgram program = _material.getProgram();
    appState.useProgram( program );

    _geometry.getAttribute( 0 ).setLocation( GL.getAttribLocation( gl, program, "position" ) );
    _geometry.getAttribute( 1 ).setLocation( GL.getAttribLocation( gl, program, "normal" ) );
    _geometry.getAttribute( 2 ).setLocation( GL.getAttribLocation( gl, program, "uv" ) );
    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture );
    gl.uniform1i( _material.getTextureLocation(), 0 );
    _geometry.uploadToCpu();
    _uploaded = true;
  }

  public boolean needsUploadToGpu()
  {
    return !_uploaded;
  }
}
