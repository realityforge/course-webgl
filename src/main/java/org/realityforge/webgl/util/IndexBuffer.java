package org.realityforge.webgl.util;

import elemental3.core.ArrayBufferView;
import elemental3.gl.DrawElementDataType;
import elemental3.gl.UsageType;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;

public final class IndexBuffer
  extends Buffer
{
  @DrawElementDataType
  private final int _type;

  public IndexBuffer( @Nonnull final WebGL2RenderingContext gl,
                      @Nonnull final ArrayBufferView data,
                      @DrawElementDataType final int type )
  {
    this( gl, data, WebGL2RenderingContext.STATIC_DRAW, type );
  }

  public IndexBuffer( @Nonnull final WebGL2RenderingContext gl,
                      @Nonnull final ArrayBufferView data,
                      @UsageType final int usage,
                      @DrawElementDataType final int type )
  {
    super( gl, data, usage, WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER );
    DrawElementDataType.Validator.assertValid( type );
    _type = type;
  }

  @DrawElementDataType
  public int getType()
  {
    return _type;
  }
}
