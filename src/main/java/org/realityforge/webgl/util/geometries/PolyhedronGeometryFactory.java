package org.realityforge.webgl.util.geometries;

import elemental2.core.Float32Array;
import elemental2.core.JsArray;
import elemental3.gl.DrawPrimitiveType;
import elemental3.gl.WebGL2RenderingContext;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.intellij.lang.annotations.MagicConstant;
import org.realityforge.vecmath.Vector3d;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.Geometry;

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
  private final JsArray<Double> _vertices = new JsArray<>();
  @Nullable
  private final JsArray<Double> _normals;
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
    _normals = NORMALS == ( NORMALS & options ) ? new JsArray<>() : null;
    _uvs = UVS == ( UVS & options ) ? new JsArray<>() : null;

    // the subdivision creates the vertex buffer data
    subdivide( vertices, indices, detail );

    // all vertices should lie on a conceptual sphere with a given radius
    applyRadius( radius );

    if ( null != _uvs )
    {
      // finally, create the uv data
      //TODO: generateUVs();
    }

    if ( null != _normals )
    {
      if ( 0 == detail )
      {
        // flat normals
        //TODO: computeVertexNormals();
      }
      else
      {
        // smooth normals
        //TODO: normalizeNormals();
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
                              _vertices.length / 3,
                              null,
                              attributes.toArray( new Attribute[ 0 ] ) );
  }

  private void subdivide( @Nonnull double[] vertices,
                          @Nonnull int[] indices,
                          final int detail )
  {
    final Vector3d a = new Vector3d();
    final Vector3d b = new Vector3d();
    final Vector3d c = new Vector3d();

    // iterate over all faces and apply a subdivison with the given detail value
    for ( int i = 0; i < indices.length; i += 3 )
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
      for ( int j = 0; j < 2 * ( columns - i ) - 1; j++ )
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
    for ( int i = 0; i < _vertices.length; i += 3 )
    {
      vertex.x = _vertices.getAt( i );
      vertex.y = _vertices.getAt( i + 1 );
      vertex.z = _vertices.getAt( i + 2 );

      vertex.normalize().mul( radius );

      _vertices.setAt( i, vertex.x );
      _vertices.setAt( i + 1, vertex.y );
      _vertices.setAt( i + 2, vertex.z );
    }
  }

  private void pushVertex( @Nonnull final Vector3d vertex )
  {
    _vertices.push( vertex.x, vertex.y, vertex.z );
  }

  private void extractVertexByIndex( @Nonnull final Vector3d vertex, @Nonnull final double[] vertices, final int index )
  {
    final int stride = index * 3;

    vertex.x = vertices[ stride ];
    vertex.y = vertices[ stride + 1 ];
    vertex.z = vertices[ stride + 2 ];
  }
}
