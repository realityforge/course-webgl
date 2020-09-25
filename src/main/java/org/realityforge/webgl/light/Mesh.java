package org.realityforge.webgl.light;

import elemental2.promise.Promise;
import elemental3.HTMLImageElement;
import elemental3.Image;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import elemental3.gl.WebGLTexture;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.webgl.annotations.GLSL;
import org.realityforge.webgl.util.BufferAttributeBinding;
import org.realityforge.webgl.util.Float32BufferAttribute;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.util.UniformBinding;

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
  private final UniformBinding _modelMatrix;
  @Nonnull
  private final UniformBinding _viewMatrix;
  @Nonnull
  private final UniformBinding _projectionMatrix;
  @Nonnull
  private final UniformBinding _textureData0;
  @Nonnull
  private final UniformBinding _textureData1;

  Mesh( @Nonnull final WebGL2RenderingContext gl,
        @Nonnull final Float32BufferAttribute positionAttribute,
        @Nonnull final Float32BufferAttribute colorAttribute,
        @Nonnull final Float32BufferAttribute textureCoordinatesAttribute,
        @GLSL @Nonnull final String vertexShaderSource,
        @GLSL @Nonnull final String fragmentShaderSource )
  {
    loadTexture( gl, "img/webgl-logo-256.jpg" ).then( texture -> {
      _texture1 = texture;
      return null;
    } );

    loadTexture( gl, "img/StoreLogo.png" ).then( texture -> {
      _texture2 = texture;
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
    _modelMatrix = new UniformBinding( gl, program, "modelMatrix" );
    _viewMatrix = new UniformBinding( gl, program, "viewMatrix" );
    _projectionMatrix = new UniformBinding( gl, program, "projectionMatrix" );
    _textureData0 = new UniformBinding( gl, program, "textureData0" );
    _textureData1 = new UniformBinding( gl, program, "textureData1" );

    _position = new BufferAttributeBinding( gl, program, "position", positionAttribute );
    _color = new BufferAttributeBinding( gl, program, "color", colorAttribute );
    _textureCoordinate = new BufferAttributeBinding( gl, program, "textureCoordinate", textureCoordinatesAttribute );
  }

  @Nonnull
  private Promise<WebGLTexture> loadTexture( @Nonnull final WebGL2RenderingContext gl,
                                             @Nonnull final String src )
  {
    return new Promise<>( ( resolveFn, rejectFn ) -> {
      final HTMLImageElement image = new Image();
      image.src = src;
      image.onload = e -> resolveFn.onInvoke( GL.prepareTexture( gl,
                                                                 image,
                                                                 WebGL2RenderingContext.LINEAR,
                                                                 WebGL2RenderingContext.LINEAR,
                                                                 WebGL2RenderingContext.CLAMP_TO_EDGE,
                                                                 WebGL2RenderingContext.CLAMP_TO_EDGE ) );
      image.onerror = ( e, s, l, c, o ) -> rejectFn.onInvoke( e );
    } );
  }

  boolean areTexturesLoaded()
  {
    return null != _texture1 && null != _texture2;
  }

  void render( @Nonnull final WebGL2RenderingContext gl,
               @Nonnull final Matrix4d modelMatrix,
               @Nonnull final Matrix4d viewMatrix,
               @Nonnull final Matrix4d projectionMatrix,
               @Nonnull final Light light )
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
    GL.sendToGpu( gl, _position );
    GL.sendToGpu( gl, _color );
    GL.sendToGpu( gl, _textureCoordinate );

    gl.useProgram( _program );

    GL.sendTextureToGpu( gl, _textureData0, _texture1, 0 );
    GL.sendTextureToGpu( gl, _textureData1, _texture2, 1 );
  }
}
