package org.realityforge.webgl.util;

import elemental3.core.Float32Array;
import elemental3.core.Int16Array;
import elemental3.core.Int8Array;
import elemental3.core.Uint16Array;
import elemental3.core.Uint8Array;
import elemental3.gl.AttributeDataType;
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
  private final int _componentCount;
  @AttributeDataType
  private final int _componentType;
  private final boolean _normalize;
  private final int _stride;
  private final int _offset;

  public Accessor( @VertexDimensions final int componentCount )
  {
    this( componentCount, WebGL2RenderingContext.FLOAT );
  }

  public Accessor( @VertexDimensions final int componentCount, @AttributeDataType final int componentType )
  {
    this( componentCount, componentType, 0, 0 );
  }

  public Accessor( @VertexDimensions final int componentCount,
                   @AttributeDataType final int componentType,
                   final int stride,
                   final int offset )
  {
    this( componentCount, componentType, false, stride, offset );
  }

  public Accessor( @VertexDimensions final int componentCount,
                   @AttributeDataType final int componentType,
                   final boolean normalize,
                   final int stride,
                   final int offset )
  {
    assert componentCount > 0 && componentCount <= 4;
    assert stride >= 0 && stride <= 255;
    assert offset >= 0;
    // Normalize should only be set to true for integer data types
    assert !normalize || ( WebGL2RenderingContext.FLOAT != componentType &&
                           WebGL2RenderingContext.HALF_FLOAT != componentType );
    AttributeDataType.Validator.assertValid( componentType );
    _componentCount = componentCount;
    _componentType = componentType;
    _normalize = normalize;
    _stride = stride;
    _offset = offset;
    assert 0 == stride || stride >= getBytesPerVertex() :
      "Stride must be 0 or be greater the the bytesPerVertex. " +
      "stride=" + stride + " bytesPerVertex=" + getBytesPerVertex();
  }

  /**
   * @return the number of components per vertex attribute.
   */
  @VertexDimensions
  public int getComponentCount()
  {
    return _componentCount;
  }

  /**
   * @return the data type of each component in the vertex attribute.
   */
  @AttributeDataType
  public int getComponentType()
  {
    return _componentType;
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
   * @return the offset in bytes of the first vertex attribute in the vertex attribute buffer. Must be a multiple of the byte length of type.
   */
  public int getOffset()
  {
    return _offset;
  }

  /**
   * Return the number of bytes used to represent each component.
   *
   * @return the number of bytes used to represent each component.
   */
  public int getBytesPerComponent()
  {
    if ( WebGL2RenderingContext.FLOAT == _componentType )
    {
      return Float32Array.BYTES_PER_ELEMENT;
    }
    else if ( WebGL2RenderingContext.UNSIGNED_SHORT == _componentType )
    {
      return Uint16Array.BYTES_PER_ELEMENT;
    }
    else if ( WebGL2RenderingContext.UNSIGNED_BYTE == _componentType )
    {
      return Uint8Array.BYTES_PER_ELEMENT;
    }
    else if ( WebGL2RenderingContext.BYTE == _componentType )
    {
      return Int8Array.BYTES_PER_ELEMENT;
    }
    else if ( WebGL2RenderingContext.SHORT == _componentType )
    {
      return Int16Array.BYTES_PER_ELEMENT;
    }
    else
    {
      assert WebGL2RenderingContext.HALF_FLOAT == _componentType;
      return Float32Array.BYTES_PER_ELEMENT / 2;
    }
  }

  /**
   * Returns the number of bytes per "vertex" attribute.
   * This is based on the component type and component count and ignores stride.
   *
   * @return the number of bytes per "vertex" attribute.
   */
  public int getBytesPerVertex()
  {
    return getBytesPerComponent() * _componentCount;
  }
}
