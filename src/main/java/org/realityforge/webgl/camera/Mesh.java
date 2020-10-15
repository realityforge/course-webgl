package org.realityforge.webgl.camera;

import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.webgl.util.BufferAttribute;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.util.TextureUniformBinding;
import org.realityforge.webgl.util.UniformBinding;

final class Mesh
{
  @Nonnull
  private final BufferAttribute _position;
  @Nonnull
  private final BufferAttribute _color;
  @Nonnull
  private final BufferAttribute _textureCoordinate;
  @Nonnull
  private final WebGLProgram _program;
  @Nonnull
  private final UniformBinding _modelMatrix;
  @Nonnull
  private final UniformBinding _viewMatrix;
  @Nonnull
  private final UniformBinding _projectionMatrix;
  @Nonnull
  private final TextureUniformBinding _textureData0;
  @Nonnull
  private final TextureUniformBinding _textureData1;

  Mesh( @Nonnull final WebGL2RenderingContext gl,
        @Nonnull final Float32Buffer positionAttribute,
        @Nonnull final Float32Buffer colorAttribute,
        @Nonnull final Float32Buffer textureCoordinatesAttribute,
        @GLSL @Nonnull final String vertexShaderSource,
        @GLSL @Nonnull final String fragmentShaderSource )
  {
    final WebGLShader vertexShader = GL.createShader( gl, WebGL2RenderingContext.VERTEX_SHADER, vertexShaderSource );
    final WebGLShader fragmentShader =
      GL.createShader( gl, WebGL2RenderingContext.FRAGMENT_SHADER, fragmentShaderSource );
    assert null != vertexShader;
    assert null != fragmentShader;
    final WebGLProgram program = GL.createProgram( gl, vertexShader, fragmentShader );
    assert null != program;
    _program = program;
    _modelMatrix = new UniformBinding( gl, program, "modelMatrix" );
    _viewMatrix = new UniformBinding( gl, program, "viewMatrix" );
    _projectionMatrix = new UniformBinding( gl, program, "projectionMatrix" );

    _textureData0 = new TextureUniformBinding( gl, program, "textureData0", "img/webgl-logo-256.jpg", 0 );
    _textureData1 = new TextureUniformBinding( gl, program, "textureData1", "img/StoreLogo.png", 1 );

    _position = new BufferAttribute( positionAttribute, GL.getAttribLocation( gl, program, "position" ) );
    _color = new BufferAttribute( colorAttribute, GL.getAttribLocation( gl, program, "color" ) );
    _textureCoordinate = new BufferAttribute( textureCoordinatesAttribute,
                                              GL.getAttribLocation( gl, program, "textureCoordinate" ) );
  }

  boolean areTexturesLoaded()
  {
    return _textureData0.isReady() && _textureData1.isReady();
  }

  void render( @Nonnull final WebGL2RenderingContext gl,
               @Nonnull final Matrix4d modelMatrix,
               @Nonnull final Matrix4d viewMatrix,
               @Nonnull final Matrix4d projectionMatrix )
  {
    gl.useProgram( _program );
    gl.uniformMatrix4fv( _modelMatrix.getLocation(), false, MathUtil.toFloat32Array( modelMatrix ) );
    gl.uniformMatrix4fv( _viewMatrix.getLocation(), false, MathUtil.toFloat32Array( viewMatrix ) );
    gl.uniformMatrix4fv( _projectionMatrix.getLocation(), false, MathUtil.toFloat32Array( projectionMatrix ) );

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 36 );
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    // Tell GPU to load position data into program from out buffer
    _position.sendToGpu( gl );
    _color.sendToGpu( gl );
    _textureCoordinate.sendToGpu( gl );

    gl.useProgram( _program );

    _textureData0.sendToGpu( gl );
    _textureData1.sendToGpu( gl );
  }
}
