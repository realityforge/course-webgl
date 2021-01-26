package org.realityforge.webgl.textures;

import elemental3.core.Float32Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLTexture;
import elemental3.gl.WebGLUniformLocation;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.AttributeBuffer;
import org.realityforge.webgl.util.GL;

final class Mesh
{
  @Nonnull
  private final Attribute _position;
  @Nonnull
  private final Attribute _color;
  @Nonnull
  private final Attribute _textureCoordinate;
  @Nonnull
  private final AttributeBuffer _positionBuffer;
  @Nonnull
  private final AttributeBuffer _colorBuffer;
  @Nonnull
  private final AttributeBuffer _textureCoordinatesBuffer;
  private WebGLTexture _texture1;
  private WebGLTexture _texture2;
  @Nonnull
  private final WebGLProgram _program;
  @Nonnull
  private final WebGLUniformLocation _modelMatrixLocation;
  @Nonnull
  private final WebGLUniformLocation _viewMatrixLocation;
  @Nonnull
  private final WebGLUniformLocation _projectionMatrixLocation;
  @Nonnull
  private final WebGLUniformLocation _textureData0Location;
  @Nonnull
  private final WebGLUniformLocation _textureData1Location;

  Mesh( @Nonnull final WebGL2RenderingContext gl,
        @Nonnull final AttributeBuffer positionBuffer,
        @Nonnull final AttributeBuffer colorBuffer,
        @Nonnull final AttributeBuffer textureCoordinatesBuffer,
        @GLSL @Nonnull final String vertexShaderSource,
        @GLSL @Nonnull final String fragmentShaderSource )
  {
    GL.loadTexture( gl, "img/webgl-logo-256.jpg" ).thenAccept( texture -> _texture1 = texture );
    GL.loadTexture( gl, "img/StoreLogo.png" ).thenAccept( texture -> _texture2 = texture );

    final WebGLProgram program = GL.createProgram( gl, vertexShaderSource, fragmentShaderSource );
    assert null != program;
    _program = program;
    _modelMatrixLocation = GL.getUniformLocation( gl, _program, "modelMatrix" );
    _viewMatrixLocation = GL.getUniformLocation( gl, _program, "viewMatrix" );
    _projectionMatrixLocation = GL.getUniformLocation( gl, _program, "projectionMatrix" );
    _textureData0Location = GL.getUniformLocation( gl, _program, "textureData0" );
    _textureData1Location = GL.getUniformLocation( gl, _program, "textureData1" );

    _positionBuffer = Objects.requireNonNull( positionBuffer );
    _colorBuffer = Objects.requireNonNull( colorBuffer );
    _textureCoordinatesBuffer = Objects.requireNonNull( textureCoordinatesBuffer );
    _position = new Attribute( positionBuffer, GL.getAttribLocation( gl, program, "position" ) );
    _color = new Attribute( colorBuffer, GL.getAttribLocation( gl, program, "color" ) );
    _textureCoordinate = new Attribute( textureCoordinatesBuffer,
                                        GL.getAttribLocation( gl, program, "textureCoordinate" ) );
  }

  boolean areTexturesLoaded()
  {
    return null != _texture1 && null != _texture2;
  }

  void render( @Nonnull final WebGL2RenderingContext gl,
               @Nonnull final Matrix4d modelMatrix,
               @Nonnull final Matrix4d viewMatrix,
               @Nonnull final Matrix4d projectionMatrix )
  {
    gl.useProgram( _program );
    gl.uniformMatrix4fv( _modelMatrixLocation, false, new Float32Array( modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _viewMatrixLocation, false, new Float32Array( viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _projectionMatrixLocation, false, new Float32Array( projectionMatrix.toArray() ) );

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 36 );
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    _positionBuffer.allocate();
    _colorBuffer.allocate();
    _textureCoordinatesBuffer.allocate();

    // Tell GPU to load position data into program from out buffer
    _position.sendToGpu();
    _color.sendToGpu();
    _textureCoordinate.sendToGpu();

    gl.useProgram( _program );

    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture1 );
    gl.uniform1i( _textureData0Location, 0 );

    gl.activeTexture( WebGL2RenderingContext.TEXTURE1 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture2 );
    gl.uniform1i( _textureData1Location, 1 );
  }
}
