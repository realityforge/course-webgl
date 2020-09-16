package org.realityforge.webgl.cube;

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
import elemental3.WebGLUniformLocation;
import elemental3.Window;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.Language;
import org.intellij.lang.annotations.MagicConstant;
import org.joml.Matrix4d;

public final class Cube
  implements EntryPoint
{
  // Cube rotation angle
  private static double c_angle;
  private WebGLUniformLocation c_modelMatrixLocation;
  private WebGLUniformLocation c_viewMatrixLocation;
  private WebGLUniformLocation c_projectionMatrixLocation;
  @Nonnull
  private final Matrix4d c_modelMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d c_viewMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d c_projectionMatrix = new Matrix4d();
  private int c_positionIndex;
  private int c_colorIndex;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = createCanvas();
    final WebGL2RenderingContext gl = (WebGL2RenderingContext) canvas.getContext( RenderContextType.webgl2 );
    assert null != gl;

    // Vertex position data
    double[] positions = new double[]{
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

    // Vertex color data for triangle in RGBA form
    double[] colors = new double[]{
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
    @Language( "GLSL" )
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
    @Language( "GLSL" )
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

    c_projectionMatrix.perspective( 45 * Math.PI / 180.0, canvas.width / ( (double) canvas.height ), 0.1, 10.0 );

    // Create a GPU buffer for position data and send data via ARRAY_BUFFER gate with a hint that
    // the data is static and the CPU will not update it often which means that the GPU can store it
    // close to where it is used without worrying about latency to update
    final WebGLBuffer positionBuffer =
      prepareBuffer( gl,
                     WebGL2RenderingContext.ARRAY_BUFFER,
                     WebGL2RenderingContext.STATIC_DRAW,
                     new Float32Array( positions ) );

    final WebGLBuffer colorBuffer =
      prepareBuffer( gl,
                     WebGL2RenderingContext.ARRAY_BUFFER,
                     WebGL2RenderingContext.STATIC_DRAW,
                     new Float32Array( colors ) );

    // Build and compile the vertex shader
    final WebGLShader vertexShader = createShader( gl, WebGL2RenderingContext.VERTEX_SHADER, vertexShaderSource );

    // Build and compile the vertex shader
    final WebGLShader fragmentShader = createShader( gl, WebGL2RenderingContext.FRAGMENT_SHADER, fragmentShaderSource );

    // Combine the shaders into a program
    final WebGLProgram program = createProgram( gl, vertexShader, fragmentShader );

    c_modelMatrixLocation = gl.getUniformLocation( program, "modelMatrix" );
    c_viewMatrixLocation = gl.getUniformLocation( program, "viewMatrix" );
    c_projectionMatrixLocation = gl.getUniformLocation( program, "projectionMatrix" );

    c_positionIndex = gl.getAttribLocation( program, "position" );
    c_colorIndex = gl.getAttribLocation( program, "color" );

    // Start using the program for all vertexes pass through gl until the program is changed
    gl.useProgram( program );

    // Tell GPU to load position data into program from out buffer
    linkBufferResource( gl,
                        positionBuffer,
                        c_positionIndex,
                        WebGL2RenderingContext.ARRAY_BUFFER,
                        3,
                        WebGL2RenderingContext.FLOAT,
                        0,
                        0 );

    // Tell GPU to load color data into program from out buffer
    linkBufferResource( gl,
                        colorBuffer,
                        c_colorIndex,
                        WebGL2RenderingContext.ARRAY_BUFFER,
                        4,
                        WebGL2RenderingContext.FLOAT,
                        0,
                        0 );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( gl ) );
  }

  private void renderFrame( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    c_modelMatrix.identity();
    c_modelMatrix.translate( 0, 0, -7 );
    c_modelMatrix.rotateY( c_angle );
    c_modelMatrix.rotateX( 0.25 );

    c_viewMatrix.identity();

    gl.uniformMatrix4fv( c_modelMatrixLocation, false, toFloat32Array( c_modelMatrix ) );
    gl.uniformMatrix4fv( c_viewMatrixLocation, false, toFloat32Array( c_viewMatrix ) );
    gl.uniformMatrix4fv( c_projectionMatrixLocation, false, toFloat32Array( c_projectionMatrix ) );

    c_angle += 0.1;

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 36 );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( gl ) );
  }

  @Nonnull
  private Float32Array toFloat32Array( @Nonnull final Matrix4d matrix )
  {
    return new Float32Array( matrix.get( new double[ 16 ] ) );
  }

  @SuppressWarnings( "SameParameterValue" )
  @Nonnull
  private WebGLBuffer prepareBuffer( @Nonnull final WebGL2RenderingContext gl,
                                     final int target,
                                     final int usage,
                                     @Nonnull final Float32Array data )
  {
    final WebGLBuffer buffer = gl.createBuffer();
    assert null != buffer;
    gl.bindBuffer( target, buffer );
    gl.bufferData( target, data, usage );
    return buffer;
  }

  @SuppressWarnings( "SameParameterValue" )
  private void linkBufferResource( @Nonnull final WebGL2RenderingContext gl,
                                   @Nonnull final WebGLBuffer colorBuffer,
                                   final int index,
                                   final int target,
                                   final int dimension,
                                   final int type,
                                   final int stride,
                                   final int offset )
  {
    gl.enableVertexAttribArray( index );
    gl.bindBuffer( target, colorBuffer );
    gl.vertexAttribPointer( index, dimension, type, false, stride, offset );
  }

  @Nonnull
  private WebGLProgram createProgram( @Nonnull final WebGL2RenderingContext gl,
                                      @Nonnull final WebGLShader vertexShader,
                                      @Nonnull final WebGLShader fragmentShader )
  {
    final WebGLProgram program = gl.createProgram();
    assert null != program;
    gl.attachShader( program, vertexShader );
    gl.attachShader( program, fragmentShader );
    gl.linkProgram( program );

    if ( !requireNonNull( gl.getProgramParameter( program, WebGL2RenderingContext.LINK_STATUS ) ).asBoolean() )
    {
      Global.globalThis().console().log( gl.getProgramInfoLog( program ) );
    }
    return program;
  }

  @Nonnull
  private WebGLShader createShader( @Nonnull final WebGL2RenderingContext gl,
                                    @MagicConstant( intValues = { WebGL2RenderingContext.VERTEX_SHADER,
                                                                  WebGL2RenderingContext.FRAGMENT_SHADER } ) final int type,
                                    @Language( "GLSL" ) @Nonnull final String source )
  {
    final WebGLShader vertexShader = gl.createShader( type );
    assert null != vertexShader;

    gl.shaderSource( vertexShader, source );
    gl.compileShader( vertexShader );
    if ( !requireNonNull( gl.getShaderParameter( vertexShader, WebGL2RenderingContext.COMPILE_STATUS ) ).asBoolean() )
    {
      Global.globalThis().console().log( gl.getShaderInfoLog( vertexShader ) );
    }
    return vertexShader;
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
