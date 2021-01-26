package org.realityforge.webgl.camera;

import elemental3.core.Float32Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.AttributeBuffer;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.TextureUniform;
import org.realityforge.webgl.util.Uniform;

final class Mesh
{
  @Nonnull
  private final Attribute _position;
  @Nonnull
  private final Attribute _color;
  @Nonnull
  private final Attribute _textureCoordinate;
  @Nonnull
  private final WebGLProgram _program;
  @Nonnull
  private final Uniform _modelMatrix;
  @Nonnull
  private final Uniform _viewMatrix;
  @Nonnull
  private final Uniform _projectionMatrix;
  @Nonnull
  private final TextureUniform _textureData0;
  @Nonnull
  private final TextureUniform _textureData1;

  Mesh( @Nonnull final WebGL2RenderingContext gl,
        @Nonnull final AttributeBuffer positionAttribute,
        @Nonnull final AttributeBuffer colorAttribute,
        @Nonnull final AttributeBuffer textureCoordinatesAttribute,
        @GLSL @Nonnull final String vertexShaderSource,
        @GLSL @Nonnull final String fragmentShaderSource )
  {
    final WebGLProgram program = GL.createProgram( gl, vertexShaderSource, fragmentShaderSource );
    assert null != program;
    _program = program;
    _modelMatrix = new Uniform( gl, program, "modelMatrix" );
    _viewMatrix = new Uniform( gl, program, "viewMatrix" );
    _projectionMatrix = new Uniform( gl, program, "projectionMatrix" );

    _textureData0 = new TextureUniform( gl, program, "textureData0", "img/webgl-logo-256.jpg", 0 );
    _textureData1 = new TextureUniform( gl, program, "textureData1", "img/StoreLogo.png", 1 );

    _position = new Attribute( positionAttribute, GL.getAttribLocation( gl, program, "position" ) );
    _color = new Attribute( colorAttribute, GL.getAttribLocation( gl, program, "color" ) );
    _textureCoordinate = new Attribute( textureCoordinatesAttribute,
                                        GL.getAttribLocation( gl, program, "textureCoordinate" ) );
    positionAttribute.allocate();
    colorAttribute.allocate();
    textureCoordinatesAttribute.allocate();
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
    gl.uniformMatrix4fv( _modelMatrix.getLocation(), false, new Float32Array( modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _viewMatrix.getLocation(), false, new Float32Array( viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _projectionMatrix.getLocation(), false, new Float32Array( projectionMatrix.toArray() ) );

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 36 );
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    // Tell GPU to load position data into program from out buffer
    _position.sendToGpu();
    _color.sendToGpu();
    _textureCoordinate.sendToGpu();

    gl.useProgram( _program );

    _textureData0.sendToGpu( gl );
    _textureData1.sendToGpu( gl );
  }
}
