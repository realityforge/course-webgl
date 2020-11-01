package org.realityforge.webgl.webglacademy.l11;

import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import elemental3.gl.WebGLUniformLocation;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.GL;

final class BackgroundMaterial
{
  @GLSL
  @Nonnull
  private static final String VERTEX_SHADER =
    "#version 300 es\n" +
    "in vec2 a_position;\n" +
    "out vec2 v_uv;\n" +
    "void main()\n" +
    "{\n" +
    "  gl_Position = vec4(a_position, -1.0, 1.0);\n" +
    //v_uv must be between 0 and 1;
    "  v_uv = 0.5 * (a_position + vec2(1.0, 1.0));\n" +
    "}";
  @GLSL
  @Nonnull
  private static final String FRAGMENT_SHADER =
    "#version 300 es\n" +
    "precision mediump float;\n" +
    "uniform sampler2D u_textureData;\n" +
    "in vec2 v_uv;\n" +
    "out vec4 o_fragColor;\n" +
    "void main()\n" +
    "{\n" +
    "  o_fragColor = texture(u_textureData, v_uv);\n" +
    "}\n";
  @Nonnull
  private final WebGLProgram _program;
  @Nonnull
  private final WebGLUniformLocation _textureLocation;
  private final int _positionLocation;

  BackgroundMaterial( @Nonnull final WebGL2RenderingContext gl )
  {
    final WebGLShader vertexShader = GL.createShader( gl, WebGL2RenderingContext.VERTEX_SHADER, VERTEX_SHADER );
    final WebGLShader fragmentShader = GL.createShader( gl, WebGL2RenderingContext.FRAGMENT_SHADER, FRAGMENT_SHADER );
    assert null != vertexShader;
    assert null != fragmentShader;
    final WebGLProgram program = GL.createProgram( gl, vertexShader, fragmentShader );
    assert null != program;
    _program = program;
    _textureLocation = GL.getUniformLocation( gl, _program, "u_textureData" );
    _positionLocation = GL.getAttribLocation( gl, program, "a_position" );
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

  public int getPositionLocation()
  {
    return _positionLocation;
  }
}
