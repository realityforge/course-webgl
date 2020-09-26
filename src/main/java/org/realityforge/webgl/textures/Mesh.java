package org.realityforge.webgl.textures;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import elemental3.gl.WebGLTexture;
import elemental3.gl.WebGLUniformLocation;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.webgl.annotations.GLSL;
import org.realityforge.webgl.util.BufferAttributeBinding;
import org.realityforge.webgl.util.Float32BufferAttribute;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.MathUtil;

final class Mesh
{
  @Nonnull
  private final BufferAttributeBinding _position;
  @Nonnull
  private final BufferAttributeBinding _color;
  @Nonnull
  private final BufferAttributeBinding _textureCoordinate;
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
        @Nonnull final Float32BufferAttribute positionAttribute,
        @Nonnull final Float32BufferAttribute colorAttribute,
        @Nonnull final Float32BufferAttribute textureCoordinatesAttribute,
        @GLSL @Nonnull final String vertexShaderSource,
        @GLSL @Nonnull final String fragmentShaderSource )
  {
    GL.loadTexture( gl, "img/webgl-logo-256.jpg" ).then( texture -> {
      _texture1 = texture.getTexture();
      return null;
    } );

    GL.loadTexture( gl, "img/StoreLogo.png" ).then( texture -> {
      _texture2 = texture.getTexture();
      return null;
    } );

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
    _textureData0Location = getUniformLocation( gl, _program, "textureData0" );
    _textureData1Location = getUniformLocation( gl, _program, "textureData1" );

    _position = new BufferAttributeBinding( gl, program, "position", positionAttribute );
    _color = new BufferAttributeBinding( gl, program, "color", colorAttribute );
    _textureCoordinate = new BufferAttributeBinding( gl, program, "textureCoordinate", textureCoordinatesAttribute );
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
    gl.uniformMatrix4fv( _modelMatrixLocation, false, MathUtil.toFloat32Array( modelMatrix ) );
    gl.uniformMatrix4fv( _viewMatrixLocation, false, MathUtil.toFloat32Array( viewMatrix ) );
    gl.uniformMatrix4fv( _projectionMatrixLocation, false, MathUtil.toFloat32Array( projectionMatrix ) );

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 36 );
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    // Tell GPU to load position data into program from out buffer
    _position.sendToGpu( gl );
    _color.sendToGpu( gl );
    _textureCoordinate.sendToGpu( gl );

    gl.useProgram( _program );

    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture1 );
    gl.uniform1i( _textureData0Location, 0 );

    gl.activeTexture( WebGL2RenderingContext.TEXTURE1 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture2 );
    gl.uniform1i( _textureData1Location, 1 );
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
