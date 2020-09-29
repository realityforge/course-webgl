package org.realityforge.webgl.vaos;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import elemental3.gl.WebGLTexture;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.realityforge.webgl.annotations.GLSL;
import org.realityforge.webgl.util.BufferAttributeBinding;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.util.UniformBinding;

final class Mesh
{
  @Nonnull
  private final BufferAttributeBinding _position;
  @Nonnull
  private final BufferAttributeBinding _normal;
  @Nonnull
  private final BufferAttributeBinding _color;
  @Nonnull
  private final BufferAttributeBinding _textureCoordinate;
  private WebGLTexture _texture1;
  private WebGLTexture _texture2;
  @Nonnull
  private final WebGLProgram _program;
  @Nonnull
  private final UniformBinding _modelMatrix;
  @Nonnull
  private final UniformBinding _viewMatrix;
  @Nonnull
  private final UniformBinding _projectionMatrix;
  @Nonnull
  private final UniformBinding _textureData0;
  @Nonnull
  private final UniformBinding _textureData1;
  @Nonnull
  private final UniformBinding _lightColor;
  @Nonnull
  private final UniformBinding _lightPosition;
  @Nonnull
  private final UniformBinding _cameraPosition;

  Mesh( @Nonnull final WebGL2RenderingContext gl,
        @Nonnull final Float32Buffer positionAttribute,
        @Nonnull final Float32Buffer normalsAttribute,
        @Nonnull final Float32Buffer colorAttribute,
        @Nonnull final Float32Buffer textureCoordinatesAttribute,
        @GLSL @Nonnull final String vertexShaderSource,
        @GLSL @Nonnull final String fragmentShaderSource )
  {
    GL.loadTexture( gl, "img/wood.jpg" ).thenAccept( texture -> _texture1 = texture );
    GL.loadTexture( gl, "img/StoreLogo.png" ).thenAccept( texture -> _texture2 = texture );

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
    _textureData0 = new UniformBinding( gl, program, "textureData0" );
    _textureData1 = new UniformBinding( gl, program, "textureData1" );
    _lightColor = new UniformBinding( gl, program, "lightColor" );
    _lightPosition = new UniformBinding( gl, program, "lightPosition" );
    _cameraPosition = new UniformBinding( gl, program, "cameraPosition" );

    _position = new BufferAttributeBinding( gl, program, "position", positionAttribute );
    _normal = new BufferAttributeBinding( gl, program, "normal", normalsAttribute );
    _color = new BufferAttributeBinding( gl, program, "color", colorAttribute );
    _textureCoordinate = new BufferAttributeBinding( gl, program, "textureCoordinate", textureCoordinatesAttribute );
  }

  @Nonnull
  WebGLProgram getProgram()
  {
    return _program;
  }

  boolean areTexturesLoaded()
  {
    return null != _texture1 && null != _texture2;
  }

  void render( @Nonnull final WebGL2RenderingContext gl,
               @Nonnull final Matrix4d modelMatrix,
               @Nonnull final Matrix4d viewMatrix,
               @Nonnull final Matrix4d projectionMatrix,
               @Nonnull final Light light,
               @Nonnull final Camera camera )
  {
    gl.uniformMatrix4fv( _modelMatrix.getLocation(), false, MathUtil.toFloat32Array( modelMatrix ) );
    gl.uniformMatrix4fv( _viewMatrix.getLocation(), false, MathUtil.toFloat32Array( viewMatrix ) );
    gl.uniformMatrix4fv( _projectionMatrix.getLocation(), false, MathUtil.toFloat32Array( projectionMatrix ) );
    final Vector3f color = light.getColor();
    gl.uniform3f( _lightColor.getLocation(), color.x, color.y, color.z );
    final Vector3f lightPosition = light.getPosition();
    gl.uniform3f( _lightPosition.getLocation(), lightPosition.x, lightPosition.y, lightPosition.z );

    final Vector3d cameraPosition = camera.getPosition();
    gl.uniform3f( _cameraPosition.getLocation(),
                  (float) cameraPosition.x,
                  (float) cameraPosition.y,
                  (float) cameraPosition.z );

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 36 );
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    _position.sendToGpu( gl );
    _normal.sendToGpu( gl );
    _color.sendToGpu( gl );
    _textureCoordinate.sendToGpu( gl );

    gl.useProgram( _program );

    GL.sendTextureToGpu( gl, _textureData0, _texture1, 0 );
    GL.sendTextureToGpu( gl, _textureData1, _texture2, 1 );
  }
}
