package org.realityforge.webgl.cube2;

import elemental3.WebGL2RenderingContext;
import elemental3.WebGLProgram;
import elemental3.WebGLShader;
import elemental3.WebGLUniformLocation;
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
  private final int _positionIndex;
  private final int _colorIndex;

  Material( @Nonnull final WebGL2RenderingContext gl,
            @Nonnull final String vertexShaderSource,
            @Nonnull final String fragmentShaderSource )
  {
    final WebGLShader vertexShader = GL.createShader( gl, WebGL2RenderingContext.VERTEX_SHADER, vertexShaderSource );
    final WebGLShader fragmentShader =
      GL.createShader( gl, WebGL2RenderingContext.FRAGMENT_SHADER, fragmentShaderSource );
    assert null != vertexShader;
    assert null != fragmentShader;
    final WebGLProgram program = GL.createProgram( gl, vertexShader, fragmentShader );
    assert null != program;
    _program = program;
    _modelMatrixLocation = getModelMatrix( gl, _program, "modelMatrix" );
    _viewMatrixLocation = getModelMatrix( gl, _program, "viewMatrix" );
    _projectionMatrixLocation = getModelMatrix( gl, _program, "projectionMatrix" );

    _positionIndex = gl.getAttribLocation( _program, "position" );
    _colorIndex = gl.getAttribLocation( _program, "color" );

  }

  @Nonnull
  private static WebGLUniformLocation getModelMatrix( @Nonnull final WebGL2RenderingContext gl,
                                                      @Nonnull final WebGLProgram program,
                                                      @Nonnull final String name )
  {
    final WebGLUniformLocation location = gl.getUniformLocation( program, name );
    assert null != location;
    return location;
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

  int getPositionIndex()
  {
    return _positionIndex;
  }

  int getColorIndex()
  {
    return _colorIndex;
  }
}
