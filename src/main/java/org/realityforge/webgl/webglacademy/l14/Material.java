package org.realityforge.webgl.webglacademy.l14;

import akasha.gl.GLSL;
import akasha.gl.WebGL2RenderingContext;
import akasha.gl.WebGLProgram;
import akasha.gl.WebGLUniformLocation;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.GL;

final class Material
{
  @Nonnull
  private final WebGLProgram _program;
  @Nonnull
  private final WebGLUniformLocation _textureLocation;
  @Nonnull
  private final WebGLUniformLocation _paletteLocation;

  Material( @Nonnull final WebGL2RenderingContext gl,
            @GLSL @Nonnull final String vertexShaderSource,
            @GLSL @Nonnull final String fragmentShaderSource )
  {
    final WebGLProgram program = GL.createProgram( gl, vertexShaderSource, fragmentShaderSource );
    assert null != program;
    _program = program;
    _textureLocation = GL.getUniformLocation( gl, _program, "u_textureData" );
    _paletteLocation = GL.getUniformLocation( gl, _program, "u_palette" );
  }

  @Nonnull
  WebGLProgram getProgram()
  {
    return _program;
  }

  @Nonnull
  public WebGLUniformLocation getTextureLocation()
  {
    return _textureLocation;
  }

  @Nonnull
  public WebGLUniformLocation getPaletteLocation()
  {
    return _paletteLocation;
  }
}
