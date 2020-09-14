package org.realityforge.webgl.hello_triangle;

import com.google.gwt.core.client.EntryPoint;
import elemental2.core.Float32Array;
import elemental3.Document;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.HTMLElement;
import elemental3.WebGL2RenderingContext;
import elemental3.WebGLBuffer;
import elemental3.WebGLShader;
import java.util.Objects;
import javax.annotation.Nonnull;

public class HelloTriangle
  implements EntryPoint
{
  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = createCanvas();
    // TODO: This method should have typing tightened up
    final WebGL2RenderingContext gl = (WebGL2RenderingContext) canvas.getContext( "webgl2" );
    assert null != gl;

    // Vertex position data for triangle
    double[] positions = new double[]{
      // Vertex 1
      1.0, -1.0, 0.0,
      // Vertex 1
      1.0, 1.0, 0.0,
      // Vertex 1
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

    // Create a GPU resource for position data
    final WebGLBuffer positionBuffer = gl.createBuffer();
    // Bind a gate between CPU and GPU
    gl.bindBuffer( WebGL2RenderingContext.ARRAY_BUFFER, positionBuffer );

    // Send data via ARRAY_BUFFER gate and whatever it is bound to which is a buffer in this case
    // The last parameter is a hint indicating that this data is static and the CPU will not update it often
    // which means that the GPU can store it close to where it is used without worrying about latency to update
    gl.bufferData( WebGL2RenderingContext.ARRAY_BUFFER,
                   new Float32Array( positions ),
                   WebGL2RenderingContext.STATIC_DRAW );

    final WebGLBuffer colorBuffer = gl.createBuffer();
    gl.bindBuffer( WebGL2RenderingContext.ARRAY_BUFFER, colorBuffer );
    gl.bufferData( WebGL2RenderingContext.ARRAY_BUFFER,
                   new Float32Array( colors ),
                   WebGL2RenderingContext.STATIC_DRAW );

    // Build and compile the vertex shader
    final WebGLShader vertexShader = gl.createShader( WebGL2RenderingContext.VERTEX_SHADER );
    assert null != vertexShader;

    gl.shaderSource( vertexShader, vertexShaderSource );
    gl.compileShader( vertexShader );
    if ( !Objects.requireNonNull( gl.getShaderParameter( vertexShader, WebGL2RenderingContext.COMPILE_STATUS ) ).asBoolean() )
    {
      Global.globalThis().console().log( gl.getShaderInfoLog( vertexShader ) );
    }

    // Build and compile the vertex shader
    final WebGLShader fragmentShader = gl.createShader( WebGL2RenderingContext.FRAGMENT_SHADER );
    assert null != fragmentShader;

    gl.shaderSource( fragmentShader, fragmentShaderSource );
    gl.compileShader( fragmentShader );
    if ( !Objects.requireNonNull( gl.getShaderParameter( fragmentShader, WebGL2RenderingContext.COMPILE_STATUS ) ).asBoolean() )
    {
      Global.globalThis().console().log( gl.getShaderInfoLog( fragmentShader ) );
    }
  }

  @Nonnull
  private HTMLCanvasElement createCanvas()
  {
    final Document document = Global.globalThis().document();
    final HTMLCanvasElement canvas = (HTMLCanvasElement) document.createElement( "canvas" );
    canvas.width = 1024;
    canvas.height = 786;
    final HTMLElement body = document.body;
    assert null != body;
    body.appendChild( canvas );
    return canvas;
  }
}
