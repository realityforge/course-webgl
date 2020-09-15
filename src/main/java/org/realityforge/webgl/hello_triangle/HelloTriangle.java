package org.realityforge.webgl.hello_triangle;

import com.google.gwt.core.client.EntryPoint;
import elemental2.core.Float32Array;
import elemental3.Document;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.HTMLElement;
import elemental3.RenderContextType;
import elemental3.WebGL2RenderingContext;
import elemental3.WebGLBuffer;
import elemental3.WebGLProgram;
import elemental3.WebGLShader;
import elemental3.Window;
import java.util.Objects;
import javax.annotation.Nonnull;

public class HelloTriangle
  implements EntryPoint
{
  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = createCanvas();
    final WebGL2RenderingContext gl = (WebGL2RenderingContext) canvas.getContext( RenderContextType.webgl2 );
    assert null != gl;

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
    if ( !requireNonNull( gl.getShaderParameter( vertexShader, WebGL2RenderingContext.COMPILE_STATUS ) ).asBoolean() )
    {
      Global.globalThis().console().log( gl.getShaderInfoLog( vertexShader ) );
    }

    // Build and compile the vertex shader
    final WebGLShader fragmentShader = gl.createShader( WebGL2RenderingContext.FRAGMENT_SHADER );
    assert null != fragmentShader;

    gl.shaderSource( fragmentShader, fragmentShaderSource );
    gl.compileShader( fragmentShader );
    if ( !requireNonNull( gl.getShaderParameter( fragmentShader, WebGL2RenderingContext.COMPILE_STATUS ) ).asBoolean() )
    {
      Global.globalThis().console().log( gl.getShaderInfoLog( fragmentShader ) );
    }

    // Combine the shaders into a program
    final WebGLProgram program = gl.createProgram();
    assert null != program;
    gl.attachShader( program, vertexShader );
    gl.attachShader( program, fragmentShader );
    gl.linkProgram( program );

    if ( !requireNonNull( gl.getProgramParameter( program, WebGL2RenderingContext.LINK_STATUS ) ).asBoolean() )
    {
      Global.globalThis().console().log( gl.getProgramInfoLog( program ) );
    }

    // Start using the program for all vertexes pass through gl until the program is changed
    gl.useProgram( program );

    // Tell GPU to load position data into program from out buffer
    final int positionAttribLocation = gl.getAttribLocation( program, "position" );
    gl.enableVertexAttribArray( positionAttribLocation );
    gl.bindBuffer( WebGL2RenderingContext.ARRAY_BUFFER, positionBuffer );
    gl.vertexAttribPointer( positionAttribLocation,
      /* the number of values to take for each vertex*/3,
      /* Each value is a float */ WebGL2RenderingContext.FLOAT,
      /* Not normalized */ false,
      /* 0 stride is a special signal to gl to indicate that the next value immediately follows */ 0,
      /* no offset so start at the start of the buffer */ 0 );

    // Tell GPU to load color data into program from out buffer
    final int colorAttribLocation = gl.getAttribLocation( program, "color" );
    gl.enableVertexAttribArray( colorAttribLocation );
    gl.bindBuffer( WebGL2RenderingContext.ARRAY_BUFFER, colorBuffer );
    gl.vertexAttribPointer( colorAttribLocation, 4, WebGL2RenderingContext.FLOAT, false, 0, 0 );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( gl ) );
  }

  private void renderFrame( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT );

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 3 );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( gl ) );
  }

  @Nonnull
  private HTMLCanvasElement createCanvas()
  {
    final Window window = Global.globalThis();
    final Document document = window.document();
    final HTMLCanvasElement canvas = (HTMLCanvasElement) document.createElement( "canvas" );
    canvas.width = window.innerWidth();
    canvas.height = window.innerHeight();
    final HTMLElement body = document.body;
    assert null != body;
    body.appendChild( canvas );
    return canvas;
  }

  @Nonnull
  public static <T> T requireNonNull( final T object )
  {
    return Objects.requireNonNull( object );
  }
}
