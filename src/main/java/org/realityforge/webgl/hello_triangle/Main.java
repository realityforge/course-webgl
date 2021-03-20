package org.realityforge.webgl.hello_triangle;

import akasha.HTMLCanvasElement;
import akasha.core.Float32Array;
import akasha.gl.GLSL;
import akasha.gl.WebGL2RenderingContext;
import akasha.gl.WebGLProgram;
import com.google.gwt.core.client.EntryPoint;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.Accessor;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.AttributeBuffer;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Geometry2;

public class Main
  implements EntryPoint
{
  private WebGLProgram _program;
  private Geometry2 _geometry;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    // Vertex position data for triangle
    double[] positions = new double[]{
      // Vertex 1
      1.0, -1.0, 0.0,
      // Vertex 2
      0.0, 1.0, 0.0,
      // Vertex 3
      -1.0, -1.0, 0.0
    };

    // Vertex color data for triangle in RGBA form
    double[] colors = new double[]{
      // Red
      1.0, 0.0, 0.0, 1.0,
      // Green
      0.0, 1.0, 0.0, 1.0,
      // Blue
      0.0, 0.0, 1.0, 1.0
    };

    // The vertex shader that will be run for every vertex
    @GLSL
    final String vertexShaderSource =
      // The shader language is OpenGL 3 (i.e. 300) ES and this version pragma must
      // be the first thing present in the shader source
      "#version 300 es\n" +
      // The incoming vertex position
      "in vec3 position;\n" +
      // The incoming vertex color
      "in vec4 color;\n" +
      // The output vertex color that will be fed to the next shader
      "out vec4 fcolor;\n" +
      "" +
      // The main program/kernel
      "void main()\n" +
      "{\n" +
      // Copy position from input to output, converting to vec4 by adding using 1 for 4th dimension
      "  gl_Position = vec4(position, 1);" +
      // Copy color from input to output
      "  fcolor = color;" +
      "}\n";

    // The fragment shader that will be run for every pixel
    @GLSL
    final String fragmentShaderSource =
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

    final WebGLProgram program = GL.createProgram( gl, vertexShaderSource, fragmentShaderSource );
    assert null != program;
    _program = program;

    _geometry =
      new Geometry2( gl,
                     3,
                     new Attribute( new AttributeBuffer( gl,
                                                         new Float32Array( positions ),
                                                         new Accessor( 3 ) ),
                                    GL.getAttribLocation( gl, program, "position" ) ),
                     new Attribute( new AttributeBuffer( gl,
                                                         new Float32Array( colors ),
                                                         new Accessor( 4 ) ),
                                    GL.getAttribLocation( gl, program, "color" ) ) );
    _geometry.allocate();

    CanvasUtil.renderLoop( canvas, gl, this::renderFrame );
  }

  private void renderFrame( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT );

    gl.useProgram( _program );
    _geometry.draw();
    gl.useProgram( null );
  }
}
