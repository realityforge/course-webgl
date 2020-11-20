package org.realityforge.webgl.multi_pass;

import elemental3.ArrayBufferView;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLTexture;
import java.util.Objects;
import javax.annotation.Nonnull;

/**
 * The composer will apply multiple effects passes.
 * The output of each pass is rendered into a texture. The output texture is then rendered as a quad into
 * the next pass. The composer uses double buffering to address the performance concerns.
 */
public final class MultiPassComposer
{
  @Nonnull
  private final WebGL2RenderingContext _gl;
  /**
   * The width of the textures.
   */
  private final int _width;
  /**
   * The height of the textures.
   */
  private final int _height;
  /**
   * The textures in which to render.
   */
  @Nonnull
  private final WebGLTexture[] _textures = new WebGLTexture[ 2 ];

  public MultiPassComposer( @Nonnull final WebGL2RenderingContext gl, final int width, final int height )
  {
    assert width > 0;
    assert height > 0;
    _gl = Objects.requireNonNull( gl );
    _width = width;
    _height = height;
    _textures[ 0 ] = createTexture();
    _textures[ 1 ] = createTexture();
  }

  @Nonnull
  private WebGLTexture createTexture()
  {
    //https://github.com/vanruesc/postprocessing
    final WebGLTexture texture = _gl.createTexture();
    assert null != texture;
    _gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, texture );
    _gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                       WebGL2RenderingContext.TEXTURE_MAG_FILTER,
                       WebGL2RenderingContext.LINEAR );
    _gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                       WebGL2RenderingContext.TEXTURE_MIN_FILTER,
                       WebGL2RenderingContext.LINEAR );
    _gl.texImage2D( WebGL2RenderingContext.TEXTURE_2D,
                    0,
                    WebGL2RenderingContext.RGBA,
                    _width,
                    _height,
                    0,
                    WebGL2RenderingContext.RGBA,
                    WebGL2RenderingContext.UNSIGNED_BYTE,
                    (ArrayBufferView) null );
    return texture;
  }
}
