package org.realityforge.webgl.cube;

import elemental2.core.Float32Array;
import elemental3.Global;
import elemental3.WebGL2RenderingContext;
import elemental3.WebGLBuffer;
import elemental3.WebGLProgram;
import elemental3.WebGLShader;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.Language;

public final class GL
{
  private GL()
  {
  }

  @SuppressWarnings( "SameParameterValue" )
  @Nonnull
  static WebGLBuffer prepareBuffer( @Nonnull final WebGL2RenderingContext gl,
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
  static void linkBufferResource( @Nonnull final WebGL2RenderingContext gl,
                                  @Nonnull final WebGLBuffer colorBuffer,
                                  final int index,
                                  final int target,
                                  final int dimension,
                                  final int type,
                                  final int stride,
                                  final int offset )
  {
    gl.enableVertexAttribArray( index );
    gl.bindBuffer( target, colorBuffer );
    gl.vertexAttribPointer( index, dimension, type, false, stride, offset );
  }

  @Nonnull
  static WebGLProgram createProgram( @Nonnull final WebGL2RenderingContext gl,
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
    }
    return program;
  }

  @Nonnull
  static WebGLShader createShader( @Nonnull final WebGL2RenderingContext gl,
                                   @ShaderType final int type,
                                   @Language( "GLSL" ) @Nonnull final String source )
  {
    final WebGLShader vertexShader = gl.createShader( type );
    assert null != vertexShader;

    gl.shaderSource( vertexShader, source );
    gl.compileShader( vertexShader );
    if ( !requireNonNull( gl.getShaderParameter( vertexShader, WebGL2RenderingContext.COMPILE_STATUS ) ).asBoolean() )
    {
      Global.globalThis().console().log( gl.getShaderInfoLog( vertexShader ) );
    }
    return vertexShader;
  }

  @Nonnull
  public static <T> T requireNonNull( final T object )
  {
    return Objects.requireNonNull( object );
  }
}
