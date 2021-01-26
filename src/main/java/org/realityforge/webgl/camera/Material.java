package org.realityforge.webgl.camera;

import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.TextureUniform;
import org.realityforge.webgl.util.Uniform;

final class Material
{
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

  Material( @Nonnull final WebGL2RenderingContext gl,
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
  }

  @Nonnull
  WebGLProgram getProgram()
  {
    return _program;
  }

  @Nonnull
  Uniform getProjectionMatrix()
  {
    return _projectionMatrix;
  }

  @Nonnull
  Uniform getViewMatrix()
  {
    return _viewMatrix;
  }

  @Nonnull
  Uniform getModelMatrix()
  {
    return _modelMatrix;
  }

  @Nonnull
  TextureUniform getTextureData1()
  {
    return _textureData1;
  }

  @Nonnull
  TextureUniform getTextureData0()
  {
    return _textureData0;
  }
}
