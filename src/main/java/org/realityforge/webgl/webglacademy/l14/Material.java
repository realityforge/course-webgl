package org.realityforge.webgl.webglacademy.l14;

import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import elemental3.gl.WebGLUniformLocation;
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
    final WebGLShader vertexShader = GL.createShader( gl, WebGL2RenderingContext.VERTEX_SHADER, vertexShaderSource );
    final WebGLShader fragmentShader =
      GL.createShader( gl, WebGL2RenderingContext.FRAGMENT_SHADER, fragmentShaderSource );
    assert null != vertexShader;
    assert null != fragmentShader;
    final WebGLProgram program = GL.createProgram( gl, vertexShader, fragmentShader );
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
