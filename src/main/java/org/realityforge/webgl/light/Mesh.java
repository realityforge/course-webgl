package org.realityforge.webgl.light;

import elemental3.core.Float32Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLTexture;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.vecmath.Vector3d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.Camera;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Geometry2;
import org.realityforge.webgl.util.Uniform;

final class Mesh
{
  @Nonnull
  private final Geometry2 _geometry;
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
        @Nonnull final Geometry2 geometry,
        @GLSL @Nonnull final String vertexShaderSource,
        @GLSL @Nonnull final String fragmentShaderSource )
  {
    GL.loadTexture( gl, "img/wood.jpg" ).thenAccept( texture -> _texture1 = texture );
    GL.loadTexture( gl, "img/StoreLogo.png" ).thenAccept( texture -> _texture2 = texture );

    final WebGLProgram program = GL.createProgram( gl, vertexShaderSource, fragmentShaderSource );
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

    _geometry = Objects.requireNonNull( geometry );
    _geometry.getAttribute( 0 ).setLocation( GL.getAttribLocation( gl, program, "position" ) );
    _geometry.getAttribute( 1 ).setLocation( GL.getAttribLocation( gl, program, "color" ) );
    _geometry.getAttribute( 2 ).setLocation( GL.getAttribLocation( gl, program, "textureCoordinate" ) );
    _geometry.getAttribute( 3 ).setLocation( GL.getAttribLocation( gl, program, "normal" ) );
  }

  @Nonnull
  WebGLProgram getProgram()
  {
    return _program;
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

    _geometry.draw();
  }

  @Nonnull
  Geometry2 getGeometry()
  {
    return _geometry;
  }

  WebGLTexture getTexture1()
  {
    return _texture1;
  }

  WebGLTexture getTexture2()
  {
    return _texture2;
  }

  @Nonnull
  Uniform getTextureData0()
  {
    return _textureData0;
  }

  @Nonnull
  Uniform getTextureData1()
  {
    return _textureData1;
  }
}
