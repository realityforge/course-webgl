package org.realityforge.webgl.util.geometries;

import elemental3.core.Float32Array;
import elemental3.core.JsArray;
import elemental3.gl.DrawPrimitiveType;
import elemental3.gl.WebGL2RenderingContext;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.intellij.lang.annotations.MagicConstant;
import org.realityforge.webgl.util.Accessor;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.AttributeBuffer;
import org.realityforge.webgl.util.Geometry2;

public final class CubeGeometryFactory
{
  /**
   * If specified the factory should create vertex uvs.
   */
  public static final int UVS = 0x02;
  /**
   * If specified the factory should create vertex colors.
   */
  public static final int COLORS = 0x04;
  // We use JsArray of doubles as this will autogrow and contains native js numbers
  @Nonnull
  private final JsArray<Double> _positions = new JsArray<>();
  @Nullable
  private final JsArray<Double> _uvs;
  @Nullable
  private final JsArray<Double> _colors;
  @Nonnull
  private final Geometry2 _geometry;

  @Nonnull
  public static Geometry2 create( @Nonnull final WebGL2RenderingContext gl,
                                  @DrawPrimitiveType final int mode,
                                  final double length )
  {
    return create( gl, mode, length, UVS | COLORS );
  }

  @Nonnull
  public static Geometry2 create( @Nonnull final WebGL2RenderingContext gl,
                                  @DrawPrimitiveType final int mode,
                                  final double length,
                                  @MagicConstant( flags = { UVS, COLORS } ) final int options )
  {
    return new CubeGeometryFactory( gl, mode, length, options )
      ._geometry;
  }

  private CubeGeometryFactory( @Nonnull final WebGL2RenderingContext gl,
                               @DrawPrimitiveType final int mode,
                               final double length,
                               @MagicConstant( flags = { UVS, COLORS } ) final int options )
  {
    _uvs = UVS == ( UVS & options ) ? new JsArray<>() : null;
    _colors = COLORS == ( COLORS & options ) ? new JsArray<>() : null;

    buildData( length );

    final List<Attribute> attributes = new ArrayList<>();
    attributes.add( new Attribute( new AttributeBuffer( gl, new Float32Array( _positions ), new Accessor( 3 ) ) ) );
    if ( null != _colors )
    {
      attributes.add( new Attribute( new AttributeBuffer( gl, new Float32Array( _colors ), new Accessor( 4 ) ) ) );
    }
    if ( null != _uvs )
    {
      attributes.add( new Attribute( new AttributeBuffer( gl, new Float32Array( _uvs ), new Accessor( 2 ) ) ) );
    }
    _geometry = new Geometry2( gl, mode, 0, 36, null, attributes.toArray( new Attribute[ 0 ] ) );
  }

  private void buildData( final double length )
  {
    final double[] positions = new double[]
      {

        -length, -length, -length,
        length, -length, -length,
        length, length, -length,
        length, length, -length,
        -length, length, -length,
        -length, -length, -length,

        -length, -length, length,
        length, -length, length,
        length, length, length,
        length, length, length,
        -length, length, length,
        -length, -length, length,

        -length, length, length,
        -length, length, -length,
        -length, -length, -length,
        -length, -length, -length,
        -length, -length, length,
        -length, length, length,

        length, length, length,
        length, length, -length,
        length, -length, -length,
        length, -length, -length,
        length, -length, length,
        length, length, length,

        -length, -length, -length,
        length, -length, -length,
        length, -length, length,
        length, -length, length,
        -length, -length, length,
        -length, -length, -length,

        // Left face
        -length, length, -length,
        length, length, -length,
        length, length, length,
        length, length, length,
        -length, length, length,
        -length, length, -length
      };
    for ( double position : positions )
    {
      _positions.push( position );
    }
    if ( null != _uvs )
    {
      final double[] textureCoordinates = new double[]
        {

          0.0, 1.0,
          1.0, 1.0,
          1.0, 0.0,
          1.0, 0.0,
          0.0, 0.0,
          0.0, 1.0,

          0.0, 1.0,
          1.0, 1.0,
          1.0, 0.0,
          1.0, 0.0,
          0.0, 0.0,
          0.0, 1.0,

          1.0, 1.0,
          1.0, 0.0,
          0.0, 0.0,
          0.0, 0.0,
          0.0, 1.0,
          1.0, 1.0,

          1.0, 1.0,
          1.0, 0.0,
          0.0, 0.0,
          0.0, 0.0,
          0.0, 1.0,
          1.0, 1.0,

          0.0, 0.0,
          1.0, 0.0,
          1.0, 1.0,
          1.0, 1.0,
          0.0, 1.0,
          0.0, 0.0,

          // Left face
          0.0, 0.0,
          1.0, 0.0,
          1.0, 1.0,
          1.0, 1.0,
          0.0, 1.0,
          0.0, 0.0
        };
      for ( double textureCoordinate : textureCoordinates )
      {
        _uvs.push( textureCoordinate );
      }
    }
    if ( null != _colors )
    {
      final double[] colors = new double[]
        {
          // Front face
          1.0, 0.0, 0.0, 1.0,
          1.0, 0.0, 0.0, 1.0,
          1.0, 0.0, 0.0, 1.0,
          1.0, 0.0, 0.0, 1.0,
          1.0, 0.0, 0.0, 1.0,
          1.0, 0.0, 0.0, 1.0,

          // Back face
          0.0, 1.0, 0.0, 1.0,
          0.0, 1.0, 0.0, 1.0,
          0.0, 1.0, 0.0, 1.0,
          0.0, 1.0, 0.0, 1.0,
          0.0, 1.0, 0.0, 1.0,
          0.0, 1.0, 0.0, 1.0,

          // Top face
          0.0, 0.0, 1.0, 1.0,
          0.0, 0.0, 1.0, 1.0,
          0.0, 0.0, 1.0, 1.0,
          0.0, 0.0, 1.0, 1.0,
          0.0, 0.0, 1.0, 1.0,
          0.0, 0.0, 1.0, 1.0,

          // Bottom face
          1.0, 1.0, 0.0, 1.0,
          1.0, 1.0, 0.0, 1.0,
          1.0, 1.0, 0.0, 1.0,
          1.0, 1.0, 0.0, 1.0,
          1.0, 1.0, 0.0, 1.0,
          1.0, 1.0, 0.0, 1.0,

          // Right face
          1.0, 0.0, 1.0, 1.0,
          1.0, 0.0, 1.0, 1.0,
          1.0, 0.0, 1.0, 1.0,
          1.0, 0.0, 1.0, 1.0,
          1.0, 0.0, 1.0, 1.0,
          1.0, 0.0, 1.0, 1.0,

          // Left face
          0.0, 1.0, 1.0, 1.0,
          0.0, 1.0, 1.0, 1.0,
          0.0, 1.0, 1.0, 1.0,
          0.0, 1.0, 1.0, 1.0,
          0.0, 1.0, 1.0, 1.0,
          0.0, 1.0, 1.0, 1.0
        };
      for ( double value : colors )
      {
        _colors.push( value );
      }
    }
  }
}
