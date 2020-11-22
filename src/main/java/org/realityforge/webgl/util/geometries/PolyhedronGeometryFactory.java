package org.realityforge.webgl.util.geometries;

import elemental2.core.JsArray;
import elemental3.core.Float32Array;
import elemental3.core.Uint16Array;
import elemental3.gl.DrawPrimitiveType;
import elemental3.gl.WebGL2RenderingContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.intellij.lang.annotations.MagicConstant;
import org.realityforge.vecmath.Vector2d;
import org.realityforge.vecmath.Vector3d;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.Geometry;
import org.realityforge.webgl.util.Uint16IndexBuffer;

/**
 * This file was extracted from https://github.com/mrdoob/three.js/blob/1040b5c9718eeb1b011b770ba56217ced3ca6bcc/src/geometries/PolyhedronBufferGeometry.js
 */
public final class PolyhedronGeometryFactory
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
  private JsArray<Double> _vertices = new JsArray<>();
  @Nonnull
  private final JsArray<Double> _indexes = new JsArray<>();
  @Nullable
  private JsArray<Double> _normals;
  @Nullable
  private final JsArray<Double> _uvs;
  @Nonnull
  private final Geometry _geometry;

  @Nonnull
  public static Geometry createIsocahedron( final double radius, final int detail )
  {
    return createIsocahedron( WebGL2RenderingContext.TRIANGLES, radius, detail, 0 );
  }

  @Nonnull
  public static Geometry createIsocahedron( @DrawPrimitiveType final int mode,
                                            final double radius,
                                            final int detail,
                                            @MagicConstant( flags = { NORMALS, UVS } ) final int options )
  {
    //This method was derived from https://github.com/mrdoob/three.js/blob/1040b5c9718eeb1b011b770ba56217ced3ca6bcc/src/geometries/IcosahedronBufferGeometry.js
    final double t = ( 1 + Math.sqrt( 5 ) ) / 2;

    final double[] vertices = new double[]{
      -1, t, 0, 1, t, 0, -1, -t, 0, 1, -t, 0,
      0, -1, t, 0, 1, t, 0, -1, -t, 0, 1, -t,
      t, 0, -1, t, 0, 1, -t, 0, -1, -t, 0, 1
    };

    final int[] indices = new int[]{
      0, 11, 5, 0, 5, 1, 0, 1, 7, 0, 7, 10, 0, 10, 11,
      1, 5, 9, 5, 11, 4, 11, 10, 2, 10, 7, 6, 7, 1, 8,
      3, 9, 4, 3, 4, 2, 3, 2, 6, 3, 6, 8, 3, 8, 9,
      4, 9, 5, 2, 4, 11, 6, 2, 10, 8, 6, 7, 9, 8, 1
    };
    return create( mode, vertices, indices, radius, detail, options );
  }

  @Nonnull
  public static Geometry create( @DrawPrimitiveType final int mode,
                                 @Nonnull double[] vertices,
                                 @Nonnull int[] indices )
  {
    return create( mode, vertices, indices, 1.0, 0 );
  }

  @Nonnull
  public static Geometry create( @DrawPrimitiveType final int mode,
                                 @Nonnull double[] vertices,
                                 @Nonnull int[] indices,
                                 final double radius,
                                 final int detail )
  {
    return create( mode, vertices, indices, radius, detail, 0 );
  }

  @Nonnull
  public static Geometry create( @DrawPrimitiveType final int mode,
                                 @Nonnull double[] vertices,
                                 @Nonnull int[] indices,
                                 final double radius,
                                 final int detail,
                                 @MagicConstant( flags = { NORMALS, UVS } ) final int options )
  {
    return new PolyhedronGeometryFactory( mode, vertices, indices, radius, detail, options )._geometry;
  }

  private PolyhedronGeometryFactory( @DrawPrimitiveType final int mode,
                                     @Nonnull double[] vertices,
                                     @Nonnull int[] indices,
                                     final double radius,
                                     final int detail,
                                     @MagicConstant( flags = { NORMALS, UVS } ) final int options )
  {
    _uvs = UVS == ( UVS & options ) ? new JsArray<>() : null;

    // the subdivision creates the vertex buffer data
    subdivide( vertices, indices, detail );

    // all vertices should lie on a conceptual sphere with a given radius
    applyRadius( radius );

    mergeVertices();

    if ( null != _uvs )
    {
      // finally, create the uv data
      generateUVs();
    }

    if ( NORMALS == ( NORMALS & options ) )
    {
      if ( 0 == detail )
      {
        // flat normals
        _normals = new JsArray<>();
        _normals.setLength( _vertices.length );
        computeVertexNormals();
      }
      else
      {
        // smooth normals
        _normals = _vertices.slice();
        normalizeNormals();
      }
    }

    // build non-indexed geometry
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
                              _indexes.length,
                              new Uint16IndexBuffer( new Uint16Array( _indexes ) ),
                              attributes.toArray( new Attribute[ 0 ] ) );
  }

  /*
   * Checks for duplicate vertices with hashmap.
   */
  private void mergeVertices()
  {
    // map for looking up vertices by position coordinates (and making sure they are unique)

    final Map<String, Double> verticesMap = new HashMap<>();
    final JsArray<Double> newVertices = new JsArray<>();
    int newVerticesCount = 0;

    final int precisionPoints = 4; // number of decimal points, e.g. 4 for epsilon of 0.0001
    final double precision = Math.pow( 10, precisionPoints );

    final Vector3d v = new Vector3d();
    for ( int i = 0, iEnd = _vertices.length; i < iEnd; i += 3 )
    {
      getVector3d( _vertices, i, v );

      final String key =
        Math.round( v.x * precision ) + "_" + Math.round( v.y * precision ) + "_" + Math.round( v.z * precision );

      Double index = verticesMap.get( key );
      if ( null == index )
      {
        index = (double) newVerticesCount;
        verticesMap.put( key, index );
        newVertices.push( v.x, v.y, v.z );
        newVerticesCount++;
      }

      _indexes.push( index );
    }
    _vertices = newVertices;
  }

  private void subdivide( @Nonnull double[] vertices,
                          @Nonnull int[] indices,
                          final int detail )
  {
    final Vector3d a = new Vector3d();
    final Vector3d b = new Vector3d();
    final Vector3d c = new Vector3d();

    // iterate over all faces and apply a subdivison with the given detail value
    for ( int i = 0, iEnd = indices.length; i < iEnd; i += 3 )
    {
      // get the vertices of the face
      extractVertexByIndex( a, vertices, indices[ i ] );
      extractVertexByIndex( b, vertices, indices[ i + 1 ] );
      extractVertexByIndex( c, vertices, indices[ i + 2 ] );

      // perform subdivision
      subdivideFace( a, b, c, detail );
    }
  }

  private void subdivideFace( @Nonnull final Vector3d a,
                              @Nonnull final Vector3d b,
                              @Nonnull final Vector3d c,
                              final int detail )
  {
    final int columns = detail + 1;

    // we use this multidimensional array as a data structure for creating the subdivision

    final Vector3d[][] v = new Vector3d[ columns ][];

    // construct all of the vertices for this subdivision
    for ( int i = 0; i <= columns; i++ )
    {
      v[ i ] = new Vector3d[ 3 ];
      final double interpolationFactor = i / (double) columns;

      // Subdivide the line b-c
      final Vector3d bj = b.dup().lerp( c, interpolationFactor );
      // Subdivide the line a-c
      final Vector3d aj = a.dup().lerp( c, interpolationFactor );

      final int rows = columns - i;
      for ( int j = 0; j <= rows; j++ )
      {
        if ( 0 == rows )
        {
          v[ i ][ j ] = aj.dup();
        }
        else
        {
          v[ i ][ j ] = aj.dup().lerp( bj, j / (double) rows );
        }
      }
    }

    // construct all of the faces
    for ( int i = 0; i < columns; i++ )
    {
      for ( int j = 0, jEnd = 2 * ( columns - i ) - 1; j < jEnd; j++ )
      {
        final int k = j / 2;
        if ( 0 == j % 2 )
        {
          pushVertex( v[ i ][ k + 1 ] );
          pushVertex( v[ i + 1 ][ k ] );
          pushVertex( v[ i ][ k ] );
        }
        else
        {
          pushVertex( v[ i ][ k + 1 ] );
          pushVertex( v[ i + 1 ][ k + 1 ] );
          pushVertex( v[ i + 1 ][ k ] );
        }
      }
    }
  }

  private void applyRadius( final double radius )
  {
    final Vector3d vertex = new Vector3d();
    // iterate over the entire buffer and apply the radius to each vertex
    for ( int i = 0, iEnd = _vertices.length; i < iEnd; i += 3 )
    {
      getVector3d( _vertices, i, vertex );

      vertex.normalize().mul( radius );

      setVector3d( _vertices, i, vertex );
    }
  }

  private void generateUVs()
  {
    assert null != _uvs;
    final Vector3d vertex = new Vector3d();
    for ( int i = 0, iEnd = _vertices.length; i < iEnd; i += 3 )
    {
      getVector3d( _vertices, i, vertex );

      final double u = azimuth( vertex ) / 2 / Math.PI + 0.5;
      final double v = inclination( vertex ) / Math.PI + 0.5;
      _uvs.push( u, 1 - v );
    }
    correctUVs();
    correctSeam();
  }

  private void correctUVs()
  {
    assert null != _uvs;
    final Vector3d a = new Vector3d();
    final Vector3d b = new Vector3d();
    final Vector3d c = new Vector3d();

    final Vector3d centroid = new Vector3d();

    final Vector2d uvA = new Vector2d();
    final Vector2d uvB = new Vector2d();
    final Vector2d uvC = new Vector2d();

    for ( int i = 0, j = 0, iEnd = _vertices.length; i < iEnd; i += 9, j += 6 )
    {
      a.set( _vertices.getAt( i ), _vertices.getAt( i + 1 ), _vertices.getAt( i + 2 ) );
      b.set( _vertices.getAt( i + 3 ), _vertices.getAt( i + 4 ), _vertices.getAt( i + 5 ) );
      c.set( _vertices.getAt( i + 6 ), _vertices.getAt( i + 7 ), _vertices.getAt( i + 8 ) );

      uvA.set( _uvs.getAt( j ), _uvs.getAt( j + 1 ) );
      uvB.set( _uvs.getAt( j + 2 ), _uvs.getAt( j + 3 ) );
      uvC.set( _uvs.getAt( j + 4 ), _uvs.getAt( j + 5 ) );

      centroid.set( a ).add( b ).add( c ).div( 3 );

      final double azi = azimuth( centroid );

      correctUV( uvA, j, a, azi );
      correctUV( uvB, j + 2, b, azi );
      correctUV( uvC, j + 4, c, azi );
    }
  }

  private void correctUV( @Nonnull final Vector2d uv,
                          final int stride,
                          @Nonnull final Vector3d vector,
                          final double azimuth )
  {
    assert null != _uvs;
    if ( azimuth < 0 && 1 == uv.x )
    {
      _uvs.setAt( stride, uv.x - 1 );
    }
    if ( 0 == vector.x && 0 == vector.z )
    {
      _uvs.setAt( stride, azimuth / 2 / Math.PI + 0.5 );
    }
  }

  // Angle around the Y axis, counter-clockwise when looking from above.
  private double azimuth( @Nonnull final Vector3d vector )
  {
    return Math.atan2( vector.z, -vector.x );
  }

  // Angle above the XZ plane.
  private double inclination( @Nonnull final Vector3d vector )
  {
    return Math.atan2( -vector.y, Math.sqrt( ( vector.x * vector.x ) + ( vector.z * vector.z ) ) );
  }

  private void correctSeam()
  {
    assert null != _uvs;
    // handle case when face straddles the seam, see #3269
    for ( int i = 0, iEnd = _uvs.length; i < iEnd; i += 6 )
    {
      // uv data of a single face
      final double x0 = _uvs.getAt( i );
      final double x1 = _uvs.getAt( i + 2 );
      final double x2 = _uvs.getAt( i + 4 );

      final double max = Math.max( x0, Math.max( x1, x2 ) );
      final double min = Math.min( x0, Math.max( x1, x2 ) );

      // 0.9 is somewhat arbitrary
      if ( max > 0.9 && min < 0.1 )
      {
        if ( x0 < 0.2 )
        {
          _uvs.setAt( i, _uvs.getAt( i ) + 1 );
        }
        if ( x1 < 0.2 )
        {
          _uvs.setAt( i + 2, _uvs.getAt( i + 2 ) + 1 );
        }
        if ( x2 < 0.2 )
        {
          _uvs.setAt( i + 4, _uvs.getAt( i + 4 ) + 1 );
        }
      }
    }
  }

  private void computeVertexNormals()
  {
    assert null != _normals;

    for ( int i = 0, iEnd = _normals.length; i < iEnd; i += 1 )
    {
      _normals.setAt( i, _vertices.getAt( i ) );
    }
    final Vector3d pA = new Vector3d();
    final Vector3d pB = new Vector3d();
    final Vector3d pC = new Vector3d();
    final Vector3d cb = new Vector3d();
    for ( int i = 0, iEnd = _normals.length - 9; i < iEnd; i += 3 )
    {
      // Load three vertexes to form triangle
      getVector3d( _vertices, i, pA );
      getVector3d( _vertices, i + 3, pB );
      getVector3d( _vertices, i + 6, pC );

      // Compute normal to face
      cb.cross( pC.sub( pB ), pA.sub( pB ) );

      setVector3d( _normals, i, cb );
      setVector3d( _normals, i + 3, cb );
      setVector3d( _normals, i + 6, cb );
    }
    normalizeNormals();
  }

  private void normalizeNormals()
  {
    assert null != _normals;
    final Vector3d vertex = new Vector3d();
    for ( int i = 0, iEnd = _normals.length; i < iEnd; i += 3 )
    {
      getVector3d( _normals, i, vertex );

      vertex.normalize();

      setVector3d( _normals, i, vertex );
    }
  }

  private void pushVertex( @Nonnull final Vector3d vertex )
  {
    _vertices.push( vertex.x, vertex.y, vertex.z );
  }

  private void setVector3d( @Nonnull final JsArray<Double> array, final int position, @Nonnull final Vector3d vector )
  {
    array.setAt( position, vector.x );
    array.setAt( position + 1, vector.y );
    array.setAt( position + 2, vector.z );
  }

  private void getVector3d( @Nonnull final JsArray<Double> array,
                            final int position,
                            @Nonnull final Vector3d vector )
  {
    vector.x = array.getAt( position );
    vector.y = array.getAt( position + 1 );
    vector.z = array.getAt( position + 2 );
  }

  private void extractVertexByIndex( @Nonnull final Vector3d vertex, @Nonnull final double[] vertices, final int index )
  {
    final int stride = index * 3;

    vertex.x = vertices[ stride ];
    vertex.y = vertices[ stride + 1 ];
    vertex.z = vertices[ stride + 2 ];
  }
}
