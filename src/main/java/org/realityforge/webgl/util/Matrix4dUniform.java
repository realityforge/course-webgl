package org.realityforge.webgl.util;

import elemental3.core.Float32Array;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;

public final class Matrix4dUniform
  extends Uniform
{
  @Nonnull
  private final Matrix4d _value;

  public Matrix4dUniform( @Nonnull final WebGL2RenderingContext gl,
                          @Nonnull final WebGLProgram program,
                          @Nonnull final String name,
                          @Nonnull final Matrix4d value )
  {
    super( gl, program, name );
    _value = Objects.requireNonNull( value );
  }

  @Nonnull
  public Matrix4d getValue()
  {
    return _value;
  }

  public void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.uniformMatrix4fv( getLocation(), false, new Float32Array( _value.toArray() ) );
  }
}
