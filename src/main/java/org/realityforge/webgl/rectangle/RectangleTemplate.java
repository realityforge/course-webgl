package org.realityforge.webgl.rectangle;

import elemental2.core.Float32Array;
import elemental2.core.Uint16Array;
import elemental3.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.realityforge.webgl.annotations.GLSL;

final class RectangleTemplate
{
  // indexes into vertex attribute buffers
  private static final double[] INDEXES = new double[]
    {
      // Triangle 1
      0, 1, 2,
      // Triangle 2
      0, 2, 3
    };
  // Vertices position data
  private static final double[] POSITIONS = new double[]
    {
      -1.0, -1.0, 0.0, //0
      1.0, -1.0, 0.0, //1
      1.0, 1.0, 0.0, //2
      -1.0, 1.0, 0.0 //3
    };
  // Vertices color data in RGBA form
  private static final double[] COLORS = new double[]
    {
      1.0, 0.0, 0.0, 1.0,
      1.0, 0.0, 0.0, 1.0,
      1.0, 0.0, 0.0, 1.0,
      1.0, 0.0, 0.0, 1.0
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

  private RectangleTemplate()
  {
  }

  @Nonnull
  public static Mesh create( @Nonnull final WebGL2RenderingContext gl )
  {
    return new Mesh( new Geometry( gl,
                                   new Uint16Array( INDEXES ),
                                   new Float32Array( POSITIONS ),
                                   new Float32Array( COLORS ) ),
                     new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE ) );
  }
}