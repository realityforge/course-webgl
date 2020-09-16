package org.realityforge.webgl.cube;

import elemental2.core.Float32Array;
import elemental3.WebGL2RenderingContext;
import javax.annotation.Nonnull;

final class CubeTemplate
{
  // Vertices position data
  private static final double[] POSITIONS = new double[]
    {
      -0.5, -0.5, -0.5,
      0.5, -0.5, -0.5,
      0.5, 0.5, -0.5,
      0.5, 0.5, -0.5,
      -0.5, 0.5, -0.5,
      -0.5, -0.5, -0.5,

      -0.5, -0.5, 0.5,
      0.5, -0.5, 0.5,
      0.5, 0.5, 0.5,
      0.5, 0.5, 0.5,
      -0.5, 0.5, 0.5,
      -0.5, -0.5, 0.5,

      -0.5, 0.5, 0.5,
      -0.5, 0.5, -0.5,
      -0.5, -0.5, -0.5,
      -0.5, -0.5, -0.5,
      -0.5, -0.5, 0.5,
      -0.5, 0.5, 0.5,

      0.5, 0.5, 0.5,
      0.5, 0.5, -0.5,
      0.5, -0.5, -0.5,
      0.5, -0.5, -0.5,
      0.5, -0.5, 0.5,
      0.5, 0.5, 0.5,

      -0.5, -0.5, -0.5,
      0.5, -0.5, -0.5,
      0.5, -0.5, 0.5,
      0.5, -0.5, 0.5,
      -0.5, -0.5, 0.5,
      -0.5, -0.5, -0.5,

      -0.5, 0.5, -0.5,
      0.5, 0.5, -0.5,
      0.5, 0.5, 0.5,
      0.5, 0.5, 0.5,
      -0.5, 0.5, 0.5,
      -0.5, 0.5, -0.5
    };
  // Vertices color data in RGBA form
  private static final double[] COLORS = new double[]
    {
      1.0, 0.0, 0.0, 1.0, // Front face
      1.0, 0.0, 0.0, 1.0, // Front face
      1.0, 0.0, 0.0, 1.0, // Front face
      1.0, 0.0, 0.0, 1.0, // Front face
      1.0, 0.0, 0.0, 1.0, // Front face
      1.0, 0.0, 0.0, 1.0, // Front face

      0.0, 1.0, 0.0, 1.0, // Back face
      0.0, 1.0, 0.0, 1.0, // Back face
      0.0, 1.0, 0.0, 1.0, // Back face
      0.0, 1.0, 0.0, 1.0, // Back face
      0.0, 1.0, 0.0, 1.0, // Back face
      0.0, 1.0, 0.0, 1.0, // Back face

      0.0, 0.0, 1.0, 1.0, // Top face
      0.0, 0.0, 1.0, 1.0, // Top face
      0.0, 0.0, 1.0, 1.0, // Top face
      0.0, 0.0, 1.0, 1.0, // Top face
      0.0, 0.0, 1.0, 1.0, // Top face
      0.0, 0.0, 1.0, 1.0, // Top face

      1.0, 1.0, 0.0, 1.0, // Bottom face
      1.0, 1.0, 0.0, 1.0, // Bottom face
      1.0, 1.0, 0.0, 1.0, // Bottom face
      1.0, 1.0, 0.0, 1.0, // Bottom face
      1.0, 1.0, 0.0, 1.0, // Bottom face
      1.0, 1.0, 0.0, 1.0, // Bottom face

      1.0, 0.0, 1.0, 1.0, // Right face
      1.0, 0.0, 1.0, 1.0, // Right face
      1.0, 0.0, 1.0, 1.0, // Right face
      1.0, 0.0, 1.0, 1.0, // Right face
      1.0, 0.0, 1.0, 1.0, // Right face
      1.0, 0.0, 1.0, 1.0, // Right face

      0.0, 1.0, 1.0, 1.0, // Left face
      0.0, 1.0, 1.0, 1.0, // Left face
      0.0, 1.0, 1.0, 1.0, // Left face
      0.0, 1.0, 1.0, 1.0, // Left face
      0.0, 1.0, 1.0, 1.0, // Left face
      0.0, 1.0, 1.0, 1.0 // Left face
    };

  private CubeTemplate()
  {
  }

  @Nonnull
  public static Geometry create( @Nonnull final WebGL2RenderingContext gl )
  {
    return new Geometry( gl, new Float32Array( POSITIONS ), new Float32Array( COLORS ) );
  }
}
