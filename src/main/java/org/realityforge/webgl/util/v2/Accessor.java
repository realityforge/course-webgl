package org.realityforge.webgl.util.v2;

import elemental3.gl.DataType;
import elemental3.gl.VertexDimensions;

public final class Accessor
{
  @VertexDimensions
  private final int _dimension;
  @DataType
  private final int _type;
  private final boolean _normalized;
  private final int _stride;
  private final int _offset;

  public Accessor( @VertexDimensions final int dimension, @DataType final int type )
  {
    this( dimension, type, false, 0, 0 );
  }

  public Accessor( @VertexDimensions final int dimension,
                   @DataType final int type,
                   final boolean normalized,
                   final int stride,
                   final int offset )
  {
    assert dimension > 0 && dimension <= 4;
    assert stride >= 0 && stride <= 255;
    assert offset >= 0;
    DataType.Validator.assertValid( type );
    _dimension = dimension;
    _type = type;
    _normalized = normalized;
    _stride = stride;
    _offset = offset;
  }

  @VertexDimensions
  public int getDimension()
  {
    return _dimension;
  }

  @DataType
  public int getType()
  {
    return _type;
  }

  public boolean isNormalized()
  {
    return _normalized;
  }

  public int getStride()
  {
    return _stride;
  }

  public int getOffset()
  {
    return _offset;
  }
}
