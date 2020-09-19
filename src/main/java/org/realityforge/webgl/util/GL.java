package org.realityforge.webgl.util;

import elemental2.core.Float32Array;
import elemental2.core.Uint16Array;
import elemental3.Global;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.realityforge.webgl.annotations.GLSL;
import org.realityforge.webgl.annotations.ShaderType;

public final class GL
{
  private GL()
  {
  }

  @SuppressWarnings( { "SameParameterValue", "UnusedReturnValue" } )
  @Nonnull
  public static WebGLBuffer prepareBuffer( @Nonnull final WebGL2RenderingContext gl,
                                           final int target,
                                           final int usage,
                                           @Nonnull final Uint16Array data )
  {
    final WebGLBuffer buffer = gl.createBuffer();
    assert null != buffer;
    gl.bindBuffer( target, buffer );
    gl.bufferData( target, data, usage );
    return buffer;
  }

  @SuppressWarnings( "SameParameterValue" )
  @Nonnull
  public static WebGLBuffer prepareBuffer( @Nonnull final WebGL2RenderingContext gl,
                                           final int target,
                                           final int usage,
                                           @Nonnull final Float32Array data )
  {
    final WebGLBuffer buffer = gl.createBuffer();
    assert null != buffer;
    gl.bindBuffer( target, buffer );
    gl.bufferData( target, data, usage );
    return buffer;
  }

  @SuppressWarnings( "SameParameterValue" )
  public static void linkBufferResource( @Nonnull final WebGL2RenderingContext gl,
                                         @Nonnull final WebGLBuffer buffer,
                                         final int index,
                                         final int target,
                                         final int dimension,
                                         final int type,
                                         final int stride,
                                         final int offset )
  {
    gl.enableVertexAttribArray( index );
    gl.bindBuffer( target, buffer );
    gl.vertexAttribPointer( index, dimension, type, false, stride, offset );
  }

  @Nullable
  public static WebGLProgram createProgram( @Nonnull final WebGL2RenderingContext gl,
                                            @Nonnull final WebGLShader vertexShader,
                                            @Nonnull final WebGLShader fragmentShader )
  {
    final WebGLProgram program = gl.createProgram();
    assert null != program;
    gl.attachShader( program, vertexShader );
    gl.attachShader( program, fragmentShader );
    gl.linkProgram( program );

    if ( !requireNonNull( gl.getProgramParameter( program, WebGL2RenderingContext.LINK_STATUS ) ).asBoolean() )
    {
      Global.globalThis().console().log( gl.getProgramInfoLog( program ) );
      gl.deleteProgram( program );
      return null;
    }
    else
    {
      return program;
    }
  }

  @Nullable
  public static WebGLShader createShader( @Nonnull final WebGL2RenderingContext gl,
                                          @ShaderType final int type,
                                          @GLSL @Nonnull final String source )
  {
    final WebGLShader shader = gl.createShader( type );
    assert null != shader;

    gl.shaderSource( shader, source );
    gl.compileShader( shader );
    if ( !requireNonNull( gl.getShaderParameter( shader, WebGL2RenderingContext.COMPILE_STATUS ) ).asBoolean() )
    {
      Global.globalThis().console().log( gl.getShaderInfoLog( shader ) );
      gl.deleteShader( shader );
      return null;
    }
    else
    {
      return shader;
    }
  }

  @Nonnull
  private static <T> T requireNonNull( final T object )
  {
    return Objects.requireNonNull( object );
  }
}
