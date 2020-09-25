package org.realityforge.webgl.util;

import elemental2.core.Float32Array;
import elemental2.core.Uint16Array;
import elemental3.ArrayBufferView;
import elemental3.Global;
import elemental3.HTMLImageElement;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import elemental3.gl.WebGLTexture;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.realityforge.webgl.annotations.GLSL;
import org.realityforge.webgl.annotations.ShaderType;
import org.realityforge.webgl.annotations.TargetType;
import org.realityforge.webgl.annotations.Usage;

// TODO: All of these methods should take a onError handler that is invoked when unexpected error
//  occurs. We should then follow this up with throwing a runtime error to rollback state. Both of
//  these actions should be done after we cleanup any allocated resources.
public final class GL
{
  private GL()
  {
  }

  @SuppressWarnings( { "SameParameterValue", "UnusedReturnValue" } )
  @Nonnull
  public static WebGLBuffer prepareBuffer( @Nonnull final WebGL2RenderingContext gl,
                                           final int target,
                                           @Usage final int usage,
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
                                           @TargetType final int target,
                                           @Usage final int usage,
                                           @Nonnull final ArrayBufferView data )
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
                                           @TargetType final int target,
                                           @Usage final int usage,
                                           @Nonnull final Float32Array data )
  {
    final WebGLBuffer buffer = gl.createBuffer();
    assert null != buffer;
    gl.bindBuffer( target, buffer );
    gl.bufferData( target, data, usage );
    return buffer;
  }

  @SuppressWarnings( "SameParameterValue" )
  public static void sendToGpu( @Nonnull final WebGL2RenderingContext gl,
                                @Nonnull final Float32BufferAttribute attribute,
                                final int index )
  {
    gl.enableVertexAttribArray( index );
    gl.bindBuffer( attribute.getTarget(), attribute.getBuffer() );
    gl.vertexAttribPointer( index,
                            attribute.getDimension(),
                            attribute.getType(),
                            false,
                            attribute.getStride(),
                            attribute.getOffset() );
  }

  @SuppressWarnings( "SameParameterValue" )
  public static void sendToGpu( @Nonnull final WebGL2RenderingContext gl,
                                @Nonnull final WebGLBuffer buffer,
                                final int index,
                                @TargetType final int target,
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
  public static WebGLTexture prepareTexture( @Nonnull final WebGL2RenderingContext gl,
                                             @Nonnull final HTMLImageElement image,
                                             final int magFilter,
                                             final int minFilter,
                                             final int wrapS,
                                             final int wrapT )
  {
    // Bind texture1 texture buffer to the TEXTURE_2D gate/channel and send data across
    final WebGLTexture texture = gl.createTexture();
    assert null != texture;
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, texture );

    // This is the call that pushes data across to GPU so will be "slow"
    gl.texImage2D( WebGL2RenderingContext.TEXTURE_2D,
                   0,
                   WebGL2RenderingContext.RGB,
                   WebGL2RenderingContext.RGB,
                   WebGL2RenderingContext.UNSIGNED_BYTE,
                   image );

    // Make sure we specify how perform interpolation between texture coordinates

    // TODO: These methods should have integer enums defined for their target,
    //  parameters and potentially param values
    gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                      WebGL2RenderingContext.TEXTURE_MAG_FILTER,
                      magFilter );
    gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                      WebGL2RenderingContext.TEXTURE_MIN_FILTER,
                      minFilter );
    gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                      WebGL2RenderingContext.TEXTURE_WRAP_S,
                      wrapS );
    gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                      WebGL2RenderingContext.TEXTURE_WRAP_T,
                      wrapT );
    return texture;
  }

  public static void sendTextureToGpu( @Nonnull final WebGL2RenderingContext gl,
                                       @Nonnull final UniformBinding binding,
                                       @Nonnull final WebGLTexture texture,
                                       final int index )
  {
    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 + index );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, texture );
    gl.uniform1i( binding.getLocation(), index );
  }

  @Nonnull
  private static <T> T requireNonNull( final T object )
  {
    return Objects.requireNonNull( object );
  }
}
