package org.realityforge.webgl.textures;

import elemental2.core.Float32Array;
import elemental3.HTMLImageElement;
import elemental3.Image;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import elemental3.gl.WebGLTexture;
import elemental3.gl.WebGLUniformLocation;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.webgl.annotations.GLSL;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.MathUtil;

final class Mesh
{
  @Nonnull
  private final WebGLBuffer _positionBuffer;
  @Nonnull
  private final WebGLBuffer _colorBuffer;
  @Nonnull
  private final WebGLBuffer _textureCoordinatesBuffer;
  @Nonnull
  private final WebGLTexture _texture1;
  @Nonnull
  private final WebGLProgram _program;
  @Nonnull
  private final WebGLUniformLocation _modelMatrixLocation;
  @Nonnull
  private final WebGLUniformLocation _viewMatrixLocation;
  @Nonnull
  private final WebGLUniformLocation _projectionMatrixLocation;
  private final int _positionIndex;
  private final int _colorIndex;
  private final int _textureCoordinateIndex;

  Mesh( @Nonnull final WebGL2RenderingContext gl,
        @Nonnull final Float32Array positionData,
        @Nonnull final Float32Array colorData,
        @Nonnull final Float32Array textureCoordinatesData,
        @GLSL @Nonnull final String vertexShaderSource,
        @GLSL @Nonnull final String fragmentShaderSource )
  {
    _positionBuffer = GL.prepareBuffer( gl,
                                        WebGL2RenderingContext.ARRAY_BUFFER,
                                        WebGL2RenderingContext.STATIC_DRAW,
                                        positionData );
    _colorBuffer = GL.prepareBuffer( gl,
                                     WebGL2RenderingContext.ARRAY_BUFFER,
                                     WebGL2RenderingContext.STATIC_DRAW,
                                     colorData );
    _textureCoordinatesBuffer = GL.prepareBuffer( gl,
                                                  WebGL2RenderingContext.ARRAY_BUFFER,
                                                  WebGL2RenderingContext.STATIC_DRAW,
                                                  textureCoordinatesData );

    final WebGLTexture texture1 = gl.createTexture();
    assert null != texture1;
    _texture1 = texture1;
    final HTMLImageElement image = new Image();
    image.src = "img/webgl-logo-256.jpg";
    image.onload = e -> {
      // Bind texture1 texture buffer to the TEXTURE_2D gate/channel and send data across
      gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture1 );
      gl.texImage2D( WebGL2RenderingContext.TEXTURE_2D,
                     0,
                     WebGL2RenderingContext.RGB,
                     WebGL2RenderingContext.RGB,
                     WebGL2RenderingContext.UNSIGNED_BYTE,
                     image );

      // Make sure we specify how perform interpolation between texture coordinates

      // TODO: These methods should have integer enums defined for their target,
      //  parameters and potentially param values
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_MAG_FILTER,
                        WebGL2RenderingContext.LINEAR );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_MIN_FILTER,
                        WebGL2RenderingContext.LINEAR );
    };

    final WebGLShader vertexShader = GL.createShader( gl, WebGL2RenderingContext.VERTEX_SHADER, vertexShaderSource );
    final WebGLShader fragmentShader =
      GL.createShader( gl, WebGL2RenderingContext.FRAGMENT_SHADER, fragmentShaderSource );
    assert null != vertexShader;
    assert null != fragmentShader;
    final WebGLProgram program = GL.createProgram( gl, vertexShader, fragmentShader );
    assert null != program;
    _program = program;
    _modelMatrixLocation = getUniformLocation( gl, _program, "modelMatrix" );
    _viewMatrixLocation = getUniformLocation( gl, _program, "viewMatrix" );
    _projectionMatrixLocation = getUniformLocation( gl, _program, "projectionMatrix" );

    _positionIndex = gl.getAttribLocation( _program, "position" );
    _colorIndex = gl.getAttribLocation( _program, "color" );
    _textureCoordinateIndex = gl.getAttribLocation( _program, "textureCoordinate" );
  }

  void render( @Nonnull final WebGL2RenderingContext gl,
               @Nonnull final Matrix4d modelMatrix,
               @Nonnull final Matrix4d viewMatrix,
               @Nonnull final Matrix4d projectionMatrix )
  {
    gl.useProgram( _program );
    gl.uniformMatrix4fv( _modelMatrixLocation, false, MathUtil.toFloat32Array( modelMatrix ) );
    gl.uniformMatrix4fv( _viewMatrixLocation, false, MathUtil.toFloat32Array( viewMatrix ) );
    gl.uniformMatrix4fv( _projectionMatrixLocation, false, MathUtil.toFloat32Array( projectionMatrix ) );
    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 36 );
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    // Tell GPU to load position data into program from out buffer
    GL.linkBufferResource( gl,
                           _positionBuffer,
                           _positionIndex,
                           WebGL2RenderingContext.ARRAY_BUFFER,
                           3,
                           WebGL2RenderingContext.FLOAT,
                           0,
                           0 );

    // Tell GPU to load color data into program from out buffer
    GL.linkBufferResource( gl,
                           _colorBuffer,
                           _colorIndex,
                           WebGL2RenderingContext.ARRAY_BUFFER,
                           4,
                           WebGL2RenderingContext.FLOAT,
                           0,
                           0 );
    // Tell GPU to load uv texture coordinates into program from the buffer
    GL.linkBufferResource( gl,
                           _textureCoordinatesBuffer,
                           _textureCoordinateIndex,
                           WebGL2RenderingContext.ARRAY_BUFFER,
                           2,
                           WebGL2RenderingContext.FLOAT,
                           0,
                           0 );
  }

  @Nonnull
  private WebGLUniformLocation getUniformLocation( @Nonnull final WebGL2RenderingContext gl,
                                                   @Nonnull final WebGLProgram program,
                                                   @Nonnull final String name )
  {
    final WebGLUniformLocation location = gl.getUniformLocation( program, name );
    assert null != location;
    return location;
  }
}
