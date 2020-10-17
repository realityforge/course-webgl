package org.realityforge.webgl.util.geometries;

import elemental2.core.Float32Array;
import elemental2.core.JsArray;
import elemental2.core.Uint16Array;
import elemental3.gl.DrawPrimitiveType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.intellij.lang.annotations.MagicConstant;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.Geometry;
import org.realityforge.webgl.util.Uint16IndexBuffer;

/**
 * This file was extracted from https://github.com/mrdoob/three.js/blob/1040b5c9718eeb1b011b770ba56217ced3ca6bcc/src/geometries/BoxBufferGeometry.js
 */
public final class CuboidGeometryFactory
{
  /**
   * If specified the factory should create vertex normals.
   */
  public static final int NORMALS = 0x01;
  /**
   * If specified the factory should create vertex uvs.
   */
  public static final int UVS = 0x02;
  // We use JsArray of doubles as this will autogrow and contains native js numbers
  @Nonnull
  private final JsArray<Double> _indices = new JsArray<>();
  @Nonnull
  private final JsArray<Double> _vertices = new JsArray<>();
  @Nullable
  private final JsArray<Double> _normals;
  @Nullable
  private final JsArray<Double> _uvs;
  @Nonnull
  private final Geometry _geometry;

  @Nonnull
  public static Geometry create( @DrawPrimitiveType final int mode,
                                 final double width,
                                 final double height,
                                 final double depth,
                                 final int widthSegments,
                                 final int heightSegments,
                                 final int depthSegments )
  {
    return create( mode, width, height, depth, widthSegments, heightSegments, depthSegments, 0 );
  }

  @Nonnull
  public static Geometry create( @DrawPrimitiveType final int mode,
                                 final double width,
                                 final double height,
                                 final double depth,
                                 final int widthSegments,
                                 final int heightSegments,
                                 final int depthSegments,
                                 @MagicConstant( flags = { NORMALS, UVS } ) final int options )
  {
    return new CuboidGeometryFactory( mode,
                                      width,
                                      height,
                                      depth,
                                      widthSegments,
                                      heightSegments,
                                      depthSegments,
                                      options )
      ._geometry;
  }

  private CuboidGeometryFactory( @DrawPrimitiveType final int mode,
                                 final double width,
                                 final double height,
                                 final double depth,
                                 final int widthSegments,
                                 final int heightSegments,
                                 final int depthSegments,
                                 @MagicConstant( flags = { NORMALS, UVS } ) final int options )
  {
    _normals = NORMALS == ( NORMALS & options ) ? new JsArray<>() : null;
    _uvs = UVS == ( UVS & options ) ? new JsArray<>() : null;

    buildPlane( 2, 1, 0, -1, -1, depth, height, width, depthSegments, heightSegments, 0 );
    buildPlane( 2, 1, 0, 1, -1, depth, height, -width, depthSegments, heightSegments, 1 );
    buildPlane( 0, 2, 1, 1, 1, width, depth, height, widthSegments, depthSegments, 2 );
    buildPlane( 0, 2, 1, 1, -1, width, depth, -height, widthSegments, depthSegments, 3 );
    buildPlane( 0, 1, 2, 1, -1, width, height, depth, widthSegments, heightSegments, 4 );
    buildPlane( 0, 1, 2, -1, -1, width, height, -depth, widthSegments, heightSegments, 5 );

    final List<Attribute> attributes = new ArrayList<>();
    attributes.add( new Attribute( new Float32Buffer( new Float32Array( _vertices ), 3 ) ) );
    if ( null != _normals )
    {
      attributes.add( new Attribute( new Float32Buffer( new Float32Array( _normals ), 3 ) ) );
    }
    if ( null != _uvs )
    {
      attributes.add( new Attribute( new Float32Buffer( new Float32Array( _uvs ), 2 ) ) );
    }
    _geometry = new Geometry( mode,
                              0,
                              _indices.length,
                              new Uint16IndexBuffer( new Uint16Array( _indices ) ),
                              attributes.toArray( new Attribute[ 0 ] ) );
  }

  private void buildPlane( final int uIndex,
                           final int vIndex,
                           final int wIndex,
                           final int udir,
                           final int vdir,
                           final double width,
                           final double height,
                           final double depth,
                           final int gridX,
                           final int gridY,
                           final int side )
  {
    final double segmentWidth = width / gridX;
    final double segmentHeight = height / gridY;

    final double widthHalf = width / 2.0;
    final double heightHalf = height / 2.0;
    final double depthHalf = depth / 2.0;

    final int gridX1 = gridX + 1;
    final int gridY1 = gridY + 1;

    final double[] vector = new double[ 3 ];

    int vertexCount = 0;

    // generate vertices, normals and uvs
    for ( int iy = 0; iy < gridY1; iy++ )
    {
      final double y = iy * segmentHeight - heightHalf;

      for ( int ix = 0; ix < gridX1; ix++ )
      {
        final double x = ix * segmentWidth - widthHalf;

        // set values to correct vector component
        vector[ uIndex ] = x * udir;
        vector[ vIndex ] = y * vdir;
        vector[ wIndex ] = depthHalf;

        // now apply vector to vertex buffer
        _vertices.push( vector[ 0 ], vector[ 1 ], vector[ 2 ] );

        if ( null != _normals )
        {
          // set values to correct vector component
          vector[ uIndex ] = 0;
          vector[ vIndex ] = 0;
          vector[ wIndex ] = depth > 0 ? 1 : -1;

          // now apply vector to normal buffer
          _normals.push( vector[ 0 ], vector[ 1 ], vector[ 2 ] );
        }

        if ( null != _uvs )
        {
          // uvs
          _uvs.push( ix / (double) gridX );
          _uvs.push( 1.0 - ( iy / (double) gridY ) );
        }

        vertexCount++;
      }
    }

    // indices
    final int base = side * vertexCount;

    // 1. you need three indices to draw a single face
    // 2. a single segment consists of two faces
    // 3. so we need to generate six (2*3) indices per segment

    for ( int iy = 0; iy < gridY; iy++ )
    {
      for ( int ix = 0; ix < gridX; ix++ )
      {
        final int a = base + ix + gridX1 * iy;
        final int b = base + ix + gridX1 * ( iy + 1 );
        final int c = base + ( ix + 1 ) + gridX1 * ( iy + 1 );
        final int d = base + ( ix + 1 ) + gridX1 * iy;

        // faces
        _indices.push( (double) a, (double) b, (double) d );
        _indices.push( (double) b, (double) c, (double) d );
      }
    }
  }
}
