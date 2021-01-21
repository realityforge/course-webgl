package org.realityforge.webgl.webglacademy.l11;

import elemental3.core.Float32Array;
import elemental3.core.Uint16Array;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLTexture;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.Buffer;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Geometry;
import org.realityforge.webgl.util.IndexBuffer;
import org.realityforge.webgl.util.v2.Accessor;

final class BackgroundMesh
{
  @Nonnull
  private final Geometry _geometry;
  @Nonnull
  private final BackgroundMaterial _material;
  private WebGLTexture _texture;
  private boolean _uploaded;

  BackgroundMesh( @Nonnull final WebGL2RenderingContext gl )
  {
    final Attribute positionData =
      new Attribute( new Buffer( gl,
                                 new Float32Array( new double[]{ -1, 1, -1, -1, 1, -1, 1, 1 } ),
                                 new Accessor( 2 ) ) );
    final IndexBuffer indexBuffer =
      new IndexBuffer( gl, new Uint16Array( new double[]{ 0, 1, 2, 0, 2, 3 } ), WebGL2RenderingContext.UNSIGNED_SHORT );
    _geometry = new Geometry( WebGL2RenderingContext.TRIANGLES, 0, 6, indexBuffer, positionData );
    _material = new BackgroundMaterial( gl );
    GL.loadImage( "assets/background.png" ).thenAccept( image -> {
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
                        WebGL2RenderingContext.LINEAR_MIPMAP_LINEAR );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_MIN_FILTER,
                        WebGL2RenderingContext.NEAREST_MIPMAP_LINEAR );
      gl.generateMipmap( WebGL2RenderingContext.TEXTURE_2D );
      _texture = texture;
    } );
  }

  void render()
  {
    assert null != _texture;
    final AppState appState = AppState.get();
    appState.useProgram( _material.getProgram() );
    final WebGL2RenderingContext gl = appState.gl();
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

    _geometry.getAttribute( 0 ).setLocation( _material.getPositionLocation() );
    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture );
    gl.uniform1i( _material.getTextureLocation(), 0 );
    _geometry.uploadToGpu();
    _uploaded = true;
  }

  public boolean needsUploadToGpu()
  {
    return !_uploaded;
  }
}
