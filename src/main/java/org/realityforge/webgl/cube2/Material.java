package org.realityforge.webgl.cube2;

import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLUniformLocation;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.GL;

final class Material
{
  @Nonnull
  private final WebGLProgram _program;
  @Nonnull
  private final WebGLUniformLocation _modelMatrixLocation;
  @Nonnull
  private final WebGLUniformLocation _viewMatrixLocation;
  @Nonnull
  private final WebGLUniformLocation _projectionMatrixLocation;
  @Nonnull
  private final WebGLUniformLocation _colorsLocation1;
  @Nonnull
  private final WebGLUniformLocation _colorsLocation2;
  @Nonnull
  private final WebGLUniformLocation _colorsLocation3;
  @Nonnull
  private final WebGLUniformLocation _xOffsetsLocation;
  private final int _positionIndex;

  Material( @Nonnull final WebGL2RenderingContext gl,
            @GLSL @Nonnull final String vertexShaderSource,
            @GLSL @Nonnull final String fragmentShaderSource )
  {
    final WebGLProgram program = GL.createProgram( gl, vertexShaderSource, fragmentShaderSource );
    assert null != program;
    _program = program;
    _modelMatrixLocation = GL.getUniformLocation( gl, _program, "modelMatrix" );
    _viewMatrixLocation = GL.getUniformLocation( gl, _program, "viewMatrix" );
    _projectionMatrixLocation = GL.getUniformLocation( gl, _program, "projectionMatrix" );

    // Notice how we name these uniforms. So rather than uploading a
    // single 3x4f array we upload 3 separate 4f arrays
    _colorsLocation1 = GL.getUniformLocation( gl, _program, "u_colors[0]" );
    _colorsLocation2 = GL.getUniformLocation( gl, _program, "u_colors[1]" );
    _colorsLocation3 = GL.getUniformLocation( gl, _program, "u_colors[2]" );

    _xOffsetsLocation = GL.getUniformLocation( gl, _program, "u_xOffsets" );

    _positionIndex = gl.getAttribLocation( _program, "position" );
  }

  @Nonnull
  WebGLProgram getProgram()
  {
    return _program;
  }

  @Nonnull
  WebGLUniformLocation getModelMatrixLocation()
  {
    return _modelMatrixLocation;
  }

  @Nonnull
  WebGLUniformLocation getViewMatrixLocation()
  {
    return _viewMatrixLocation;
  }

  @Nonnull
  WebGLUniformLocation getProjectionMatrixLocation()
  {
    return _projectionMatrixLocation;
  }

  @Nonnull
  WebGLUniformLocation getColorsLocation1()
  {
    return _colorsLocation1;
  }

  @Nonnull
  WebGLUniformLocation getColorsLocation2()
  {
    return _colorsLocation2;
  }

  @Nonnull
  WebGLUniformLocation getColorsLocation3()
  {
    return _colorsLocation3;
  }

  @Nonnull
  WebGLUniformLocation getOffsetsLocation()
  {
    return _xOffsetsLocation;
  }

  int getPositionIndex()
  {
    return _positionIndex;
  }
}
