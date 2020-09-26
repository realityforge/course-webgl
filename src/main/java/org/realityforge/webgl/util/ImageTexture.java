package org.realityforge.webgl.util;

import elemental3.gl.WebGLTexture;
import java.util.Objects;
import javax.annotation.Nonnull;

public final class ImageTexture
{
  @Nonnull
  private final WebGLTexture _texture;
  private final int _width;
  private final int _height;

  public ImageTexture( @Nonnull final WebGLTexture texture, final int width, final int height )
  {
    _texture = Objects.requireNonNull( texture );
    _width = width;
    _height = height;
  }

  @Nonnull
  public WebGLTexture getTexture()
  {
    return _texture;
  }

  public int getWidth()
  {
    return _width;
  }

  public int getHeight()
  {
    return _height;
  }
}
