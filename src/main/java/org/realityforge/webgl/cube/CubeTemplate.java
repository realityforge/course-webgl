package org.realityforge.webgl.cube;

import elemental2.core.Float32Array;
import elemental3.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.realityforge.webgl.annotations.GLSL;

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
  // The vertex shader that will be run for every vertex
  @GLSL
  @Nonnull
  private static final String VERTEX_SHADER_SOURCE =
    // The shader language is OpenGL 3 (i.e. 300) ES and this version pragma must
    // be the first thing present in the shader source
    "#version 300 es\n" +
    // The incoming vertex position
    "in vec3 position;\n" +
    // The incoming vertex color
    "in vec4 color;\n" +
    // The output vertex color that will be fed to the next shader
    "out vec4 fcolor;\n" +
    "\n" +
    // The following are the unions (aka constant across multiple vertices)
    "uniform mat4 modelMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 projectionMatrix;\n" +
    // The main program/kernel
    "void main()\n" +
    "{\n" +
    // Copy position from input to output, converting to vec4 by adding using 1 for 4th dimension
    // and transforming via model/view/project matrices
    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(position, 1);" +
    // Copy color from input to output
    "  fcolor = color;" +
    "}\n";
  // The fragment shader that will be run for every pixel
  @GLSL
  private static final String FRAGMENT_SHADER_SOURCE =
    // The version of language in use
    "#version 300 es\n" +
    // There is no default precision for floats in fragment shaders so specify it
    "precision mediump float;\n" +
    // The incoming fragment color
    "in vec4 fcolor;\n" +
    // The output fragment color
    "out vec4 finalColor;\n" +
    "" +
    // The main program/kernel
    "void main()\n" +
    "{\n" +
    // Copy color from input to output
    "  finalColor = fcolor;" +
    "}\n";

  private CubeTemplate()
  {
  }

  @Nonnull
  private static Geometry createGeometry( @Nonnull final WebGL2RenderingContext gl )
  {
    return new Geometry( gl, new Float32Array( POSITIONS ), new Float32Array( COLORS ) );
  }

  @Nonnull
  private static Material createMaterial( @Nonnull final WebGL2RenderingContext gl )
  {
    return new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE );
  }

  @Nonnull
  public static Mesh create( @Nonnull final WebGL2RenderingContext gl )
  {
    return new Mesh( createGeometry( gl ), createMaterial( gl ) );
  }

}