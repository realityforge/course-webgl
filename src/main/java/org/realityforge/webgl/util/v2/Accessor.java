package org.realityforge.webgl.util.v2;

import elemental3.gl.DataType;
import elemental3.gl.VertexDimensions;
import elemental3.gl.WebGL2RenderingContext;

/**
 * The Accessor class describes how a buffers memory is structured and should be accessed.
 * Multiple Accessor instances can be used to define different "views" of the data in a single
 * buffer. Accessors are immutable by design.
 */
public final class Accessor
{
  @VertexDimensions
  private final int _dimension;
  @DataType
  private final int _type;
  private final boolean _normalize;
  private final int _stride;
  private final int _offset;

  public Accessor( @VertexDimensions final int dimension )
  {
    this( dimension, WebGL2RenderingContext.FLOAT );
  }

  public Accessor( @VertexDimensions final int dimension, @DataType final int type )
  {
    this( dimension, type, 0, 0 );
  }

  public Accessor( @VertexDimensions final int dimension,
                   @DataType final int type,
                   final int stride,
                   final int offset )
  {
    this( dimension, type, false, stride, offset );
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

  /**
   * @return the number of components per vertex attribute.
   */
  @VertexDimensions
  public int getDimension()
  {
    return _dimension;
  }

  /**
   * @return the data type of each component in the vertex attribute.
   */
  @DataType
  public int getType()
  {
    return _type;
  }

  /**
   * @return true to normalize integers to [-1,1] if signed, or [0,1] if unsigned.
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#6.40">Vertex attribute conversions from normalized signed integers to floating point</a>
   */
  public boolean shouldNormalize()
  {
    return _normalize;
  }

  /**
   * The offset in bytes between the beginning of consecutive vertex attributes.
   * Cannot be larger than 255. If the stride is 0 then the attribute is tightly
   * packed in the buffer. (i.e. the attributes are not interleaved but each attribute
   * is in a separate block, and the next vertex attribute follows immediately after
   * the current vertex.)
   *
   * @return the byte offset between consecutive vertex attributes. If the stride is 0, then the vertex attributes are tightly packed in the buffer.
   */
  public int getStride()
  {
    return _stride;
  }

  /**
   * @return the offset in bytes of the first component in the vertex attribute buffer. Must be a multiple of the byte length of type.
   */
  public int getOffset()
  {
    return _offset;
  }
}