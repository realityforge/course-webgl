package org.realityforge.webgl.util.v2;

import elemental3.gl.DataType;
import elemental3.gl.VertexDimensions;

public final class Accessor
{
  @VertexDimensions
  private final int _dimension;
  @DataType
  private final int _type;
  private final boolean _normalize;
  private final int _stride;
  private final int _offset;

  public Accessor( @VertexDimensions final int dimension, @DataType final int type )
  {
    this( dimension, type, false, 0, 0 );
  }

  public Accessor( @VertexDimensions final int dimension,
                   @DataType final int type,
                   final boolean normalize,
                   final int stride,
                   final int offset )
  {
    assert dimension > 0 && dimension <= 4;
    assert stride >= 0 && stride <= 255;
    assert offset >= 0;
    // Normalize should only be set to true for integer data types
    assert !normalize || ( WebGL2RenderingContext.FLOAT != type && WebGL2RenderingContext.HALF_FLOAT != type );
    DataType.Validator.assertValid( type );
    _dimension = dimension;
    _type = type;
    _normalize = normalize;
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

  public boolean shouldNormalize()
  {
    return _normalize;
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
