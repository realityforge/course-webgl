package org.realityforge.webgl.util;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLTexture;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class TextureUniformBinding
  extends UniformBinding
{
  private final int _textureUnitIndex;
  @Nullable
  private WebGLTexture _texture;

  public TextureUniformBinding( @Nonnull final WebGL2RenderingContext gl,
                                @Nonnull final WebGLProgram program,
                                @Nonnull final String name,
                                @Nonnull final String src,
                                final int textureUnitIndex )
  {
    super( gl, program, name );
    _textureUnitIndex = textureUnitIndex;
    GL.loadTexture( gl, src ).then( texture -> {
      _texture = texture;
      return null;
    } );
  }

  public boolean isReady()
  {
    return null != _texture;
  }

  @Nonnull
  public WebGLTexture getTexture()
  {
    // This should be only invoked after we know it is ready
    assert null != _texture;
    return _texture;
  }

  public void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    assert null != _texture;
    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 + _textureUnitIndex );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture );
    gl.uniform1i( getLocation(), _textureUnitIndex );
  }
}
