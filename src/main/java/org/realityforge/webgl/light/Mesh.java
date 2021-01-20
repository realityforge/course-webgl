package org.realityforge.webgl.light;

import elemental3.core.Float32Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import elemental3.gl.WebGLTexture;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.vecmath.Vector3d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.Camera;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Uniform;

final class Mesh
{
  @Nonnull
  private final Attribute _position;
  @Nonnull
  private final Attribute _normal;
  @Nonnull
  private final Attribute _color;
  @Nonnull
  private final Attribute _textureCoordinate;
  @Nonnull
  private final Float32Buffer _positionAttribute;
  @Nonnull
  private final Float32Buffer _normalsAttribute;
  @Nonnull
  private final Float32Buffer _colorAttribute;
  @Nonnull
  private final Float32Buffer _textureCoordinatesAttribute;
  private WebGLTexture _texture1;
  private WebGLTexture _texture2;
  @Nonnull
  private final WebGLProgram _program;
  @Nonnull
  private final Uniform _modelMatrix;
  @Nonnull
  private final Uniform _viewMatrix;
  @Nonnull
  private final Uniform _projectionMatrix;
  @Nonnull
  private final Uniform _textureData0;
  @Nonnull
  private final Uniform _textureData1;
  @Nonnull
  private final Uniform _lightColor;
  @Nonnull
  private final Uniform _lightPosition;
  @Nonnull
  private final Uniform _cameraPosition;

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
    _modelMatrix = new Uniform( gl, program, "modelMatrix" );
    _viewMatrix = new Uniform( gl, program, "viewMatrix" );
    _projectionMatrix = new Uniform( gl, program, "projectionMatrix" );
    _textureData0 = new Uniform( gl, program, "textureData0" );
    _textureData1 = new Uniform( gl, program, "textureData1" );
    _lightColor = new Uniform( gl, program, "lightColor" );
    _lightPosition = new Uniform( gl, program, "lightPosition" );
    _cameraPosition = new Uniform( gl, program, "cameraPosition" );

    _positionAttribute = Objects.requireNonNull( positionAttribute );
    _normalsAttribute = Objects.requireNonNull( normalsAttribute );
    _colorAttribute = Objects.requireNonNull( colorAttribute );
    _textureCoordinatesAttribute = Objects.requireNonNull( textureCoordinatesAttribute );
    _position = new Attribute( positionAttribute, GL.getAttribLocation( gl, program, "position" ) );
    _normal = new Attribute( normalsAttribute, GL.getAttribLocation( gl, program, "normal" ) );
    _color = new Attribute( colorAttribute, GL.getAttribLocation( gl, program, "color" ) );
    _textureCoordinate = new Attribute( textureCoordinatesAttribute,
                                        GL.getAttribLocation( gl, program, "textureCoordinate" ) );
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
    gl.uniformMatrix4fv( _modelMatrix.getLocation(), false, new Float32Array( modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _viewMatrix.getLocation(), false, new Float32Array( viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _projectionMatrix.getLocation(), false, new Float32Array( projectionMatrix.toArray() ) );
    final Vector3f color = light.getColor();
    gl.uniform3f( _lightColor.getLocation(), color.x, color.y, color.z );
    final Vector3f lightPosition = light.getPosition();
    gl.uniform3f( _lightPosition.getLocation(), lightPosition.x, lightPosition.y, lightPosition.z );

    final Vector3d eye = camera.getPosition();
    gl.uniform3f( _cameraPosition.getLocation(), (float) eye.x, (float) eye.y, (float) eye.z );

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 36 );
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    _positionAttribute.uploadToGpu( gl );
    _normalsAttribute.uploadToGpu( gl );
    _colorAttribute.uploadToGpu( gl );
    _textureCoordinatesAttribute.uploadToGpu( gl );
    _position.sendToGpu( gl );
    _normal.sendToGpu( gl );
    _color.sendToGpu( gl );
    _textureCoordinate.sendToGpu( gl );

    gl.useProgram( _program );

    GL.bindTexture( gl, _textureData0, _texture1, 0 );
    GL.bindTexture( gl, _textureData1, _texture2, 1 );
  }
}
