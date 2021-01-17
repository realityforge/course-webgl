package org.realityforge.webgl.tjs;

import elemental3.core.Float32Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Geometry;
import org.realityforge.webgl.util.Uniform;

/**
 * Abstract base class that assumes the program has model, view and projection matrices
 */
abstract class Object3D
{
  @Nullable
  private Geometry _geometry;
  @Nonnull
  private final WebGLProgram _program;
  @Nonnull
  private final Uniform _modelMatrix;
  @Nonnull
  private final Uniform _viewMatrix;
  @Nonnull
  private final Uniform _projectionMatrix;

  protected Object3D( @Nonnull final WebGL2RenderingContext gl,
                      @GLSL @Nonnull final String vertexShaderSource,
                      @GLSL @Nonnull final String fragmentShaderSource )
  {
    final WebGLProgram program = GL.createProgram( gl, vertexShaderSource, fragmentShaderSource );
    assert null != program;
    _program = program;
    _modelMatrix = new Uniform( gl, program, "modelMatrix" );
    _viewMatrix = new Uniform( gl, program, "viewMatrix" );
    _projectionMatrix = new Uniform( gl, program, "projectionMatrix" );
  }

  @Nonnull
  protected final WebGLProgram getProgram()
  {
    return _program;
  }

  @Nonnull
  protected final Geometry getGeometry()
  {
    assert null != _geometry;
    return _geometry;
  }

  protected final void setGeometry( @Nonnull final Geometry geometry )
  {
    assert null == _geometry;
    _geometry = Objects.requireNonNull( geometry );
  }

  protected void render( @Nonnull final WebGL2RenderingContext gl,
                         @Nonnull final Matrix4d modelMatrix,
                         @Nonnull final Matrix4d viewMatrix,
                         @Nonnull final Matrix4d projectionMatrix )
  {
    gl.uniformMatrix4fv( _modelMatrix.getLocation(), false, new Float32Array( modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _viewMatrix.getLocation(), false, new Float32Array( viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _projectionMatrix.getLocation(), false, new Float32Array( projectionMatrix.toArray() ) );

    assert null != _geometry;
    _geometry.draw();
  }
}
