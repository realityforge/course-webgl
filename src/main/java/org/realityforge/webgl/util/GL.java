package org.realityforge.webgl.util;

import akasha.Console;
import akasha.HTMLImageElement;
import akasha.Image;
import akasha.core.Float32Array;
import akasha.core.Uint16Array;
import akasha.gl.AttributeDataType;
import akasha.gl.BufferTargetType;
import akasha.gl.GLSL;
import akasha.gl.ShaderType;
import akasha.gl.TextureMagnificationFilter;
import akasha.gl.TextureMinificationFilter;
import akasha.gl.TextureWrapMode;
import akasha.gl.UsageType;
import akasha.gl.VertexDimensions;
import akasha.gl.WebGL2RenderingContext;
import akasha.gl.WebGLBuffer;
import akasha.gl.WebGLProgram;
import akasha.gl.WebGLShader;
import akasha.gl.WebGLTexture;
import akasha.gl.WebGLUniformLocation;
import akasha.promise.Promise;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Any;

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
                                           @BufferTargetType final int target,
                                           @UsageType final int usage,
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
                                           @BufferTargetType final int target,
                                           @UsageType final int usage,
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
                                @Nonnull final WebGLBuffer buffer,
                                final int index,
                                @BufferTargetType final int target,
                                @VertexDimensions final int size,
                                @AttributeDataType final int type,
                                final int stride,
                                final int offset )
  {
    gl.enableVertexAttribArray( index );
    gl.bindBuffer( target, buffer );
    gl.vertexAttribPointer( index, size, type, false, stride, offset );
  }

  @Nullable
  public static WebGLProgram createProgram( @Nonnull final WebGL2RenderingContext gl,
                                            @GLSL @Nonnull final String vertexShaderSource,
                                            @GLSL @Nonnull final String fragmentShaderSource )
  {
    final WebGLShader vertexShader = createShader( gl, WebGL2RenderingContext.VERTEX_SHADER, vertexShaderSource );
    assert null != vertexShader;
    final WebGLShader fragmentShader = createShader( gl, WebGL2RenderingContext.FRAGMENT_SHADER, fragmentShaderSource );
    assert null != fragmentShader;
    return createProgram( gl, vertexShader, fragmentShader );
  }

  @Nullable
  private static WebGLProgram createProgram( @Nonnull final WebGL2RenderingContext gl,
                                             @Nonnull final WebGLShader vertexShader,
                                             @Nonnull final WebGLShader fragmentShader )
  {
    final WebGLProgram program = gl.createProgram();
    assert null != program;
    gl.attachShader( program, vertexShader );
    gl.attachShader( program, fragmentShader );
    gl.linkProgram( program );

    final Any parameter = gl.getProgramParameter( program, WebGL2RenderingContext.LINK_STATUS );
    assert null != parameter;
    if ( !parameter.asBoolean() )
    {
      Console.log( gl.getProgramInfoLog( program ) );
      gl.deleteProgram( program );
      return null;
    }
    else
    {
      return program;
    }
  }

  @Nullable
  private static WebGLShader createShader( @Nonnull final WebGL2RenderingContext gl,
                                           @ShaderType final int type,
                                           @GLSL @Nonnull final String source )
  {
    final WebGLShader shader = gl.createShader( type );
    assert null != shader;

    gl.shaderSource( shader, source );
    gl.compileShader( shader );
    final Any parameter = gl.getShaderParameter( shader, WebGL2RenderingContext.COMPILE_STATUS );
    assert null != parameter;
    if ( !parameter.asBoolean() )
    {
      Console.log( gl.getShaderInfoLog( shader ) );
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
                                             final boolean flipYCoord,
                                             @TextureMagnificationFilter final int magFilter,
                                             @TextureMinificationFilter final int minFilter,
                                             @TextureWrapMode final int wrapS,
                                             @TextureWrapMode final int wrapT )
  {
    // Bind texture1 texture buffer to the TEXTURE_2D gate/channel and send data across
    final WebGLTexture texture = gl.createTexture();
    assert null != texture;
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, texture );

    if ( flipYCoord )
    {
      gl.pixelStorei( WebGL2RenderingContext.UNPACK_FLIP_Y_WEBGL, 1 );
    }

    // This is the call that pushes data across to GPU so will be "slow"
    gl.texImage2D( WebGL2RenderingContext.TEXTURE_2D,
                   0,
                   WebGL2RenderingContext.RGB,
                   WebGL2RenderingContext.RGB,
                   WebGL2RenderingContext.UNSIGNED_BYTE,
                   image );

    // Make sure we specify how perform interpolation between texture coordinates

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

  public static void bindTexture( @Nonnull final WebGL2RenderingContext gl,
                                  @Nonnull final Uniform uniform,
                                  @Nonnull final WebGLTexture texture,
                                  final int index )
  {
    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 + index );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, texture );
    gl.uniform1i( uniform.getLocation(), index );
  }

  @Nonnull
  public static Promise<WebGLTexture> loadTexture( @Nonnull final WebGL2RenderingContext gl,
                                                   @Nonnull final String src )
  {
    return loadTexture( gl, src, false );
  }

  @Nonnull
  public static Promise<WebGLTexture> loadTexture( @Nonnull final WebGL2RenderingContext gl,
                                                   @Nonnull final String src,
                                                   final boolean flipYCoord )
  {
    return loadTexture( src, image -> prepareTexture( gl,
                                                      image,
                                                      flipYCoord,
                                                      WebGL2RenderingContext.LINEAR,
                                                      WebGL2RenderingContext.LINEAR,
                                                      WebGL2RenderingContext.CLAMP_TO_EDGE,
                                                      WebGL2RenderingContext.CLAMP_TO_EDGE ) );
  }

  public interface PrepareTextureFn
  {
    @Nonnull
    WebGLTexture prepareTexture( @Nonnull HTMLImageElement image );
  }

  @Nonnull
  public static Promise<WebGLTexture> loadTexture( @Nonnull final String src,
                                                   @Nonnull final PrepareTextureFn prepareImageFn )
  {
    return new Promise<>( ( resolveFn, rejectFn ) -> {
      final HTMLImageElement image = new Image();
      image.src = src;
      image.onload = e -> resolveFn.resolve( prepareImageFn.prepareTexture( image ) );
      image.onerror = ( e, s, l, c, o ) -> rejectFn.reject( e );
    } );
  }

  @Nonnull
  public static Promise<HTMLImageElement> loadImage( @Nonnull final String src )
  {
    return new Promise<>( ( resolveFn, rejectFn ) -> {
      final HTMLImageElement image = new Image();
      image.src = src;
      image.onload = e -> resolveFn.resolve( image );
      image.onerror = ( e, s, l, c, o ) -> rejectFn.reject( e );
    } );
  }

  /**
   * Describe specified WebGL2 type, returning "UNKNOWN" if supplied type matches no known value.
   *
   * @param type the type.
   * @return the string label for type.
   */
  @Nonnull
  public static String describeType( final int type )
  {
    switch ( type )
    {
      case WebGL2RenderingContext.FLOAT:
        return "FLOAT";
      case WebGL2RenderingContext.FLOAT_VEC2:
        return "FLOAT_VEC2";
      case WebGL2RenderingContext.FLOAT_VEC3:
        return "FLOAT_VEC3";
      case WebGL2RenderingContext.FLOAT_VEC4:
        return "FLOAT_VEC4";
      case WebGL2RenderingContext.INT:
        return "INT";
      case WebGL2RenderingContext.INT_VEC2:
        return "INT_VEC2";
      case WebGL2RenderingContext.INT_VEC3:
        return "INT_VEC3";
      case WebGL2RenderingContext.INT_VEC4:
        return "INT_VEC4";
      case WebGL2RenderingContext.BOOL:
        return "BOOL";
      case WebGL2RenderingContext.BOOL_VEC2:
        return "BOOL_VEC2";
      case WebGL2RenderingContext.BOOL_VEC3:
        return "BOOL_VEC3";
      case WebGL2RenderingContext.BOOL_VEC4:
        return "BOOL_VEC4";
      case WebGL2RenderingContext.FLOAT_MAT2:
        return "FLOAT_MAT2";
      case WebGL2RenderingContext.FLOAT_MAT3:
        return "FLOAT_MAT3";
      case WebGL2RenderingContext.FLOAT_MAT4:
        return "FLOAT_MAT4";
      case WebGL2RenderingContext.SAMPLER_2D:
        return "SAMPLER_2D";
      case WebGL2RenderingContext.SAMPLER_CUBE:
        return "SAMPLER_CUBE";
      case WebGL2RenderingContext.UNSIGNED_INT:
        return "UNSIGNED_INT";
      case WebGL2RenderingContext.UNSIGNED_INT_VEC2:
        return "UNSIGNED_INT_VEC2";
      case WebGL2RenderingContext.UNSIGNED_INT_VEC3:
        return "UNSIGNED_INT_VEC3";
      case WebGL2RenderingContext.UNSIGNED_INT_VEC4:
        return "UNSIGNED_INT_VEC4";
      case WebGL2RenderingContext.FLOAT_MAT2x3:
        return "FLOAT_MAT2x3";
      case WebGL2RenderingContext.FLOAT_MAT2x4:
        return "FLOAT_MAT2x4";
      case WebGL2RenderingContext.FLOAT_MAT3x2:
        return "FLOAT_MAT3x2";
      case WebGL2RenderingContext.FLOAT_MAT3x4:
        return "FLOAT_MAT3x4";
      case WebGL2RenderingContext.FLOAT_MAT4x2:
        return "FLOAT_MAT4x2";
      case WebGL2RenderingContext.FLOAT_MAT4x3:
        return "FLOAT_MAT4x3";
      case WebGL2RenderingContext.SAMPLER_3D:
        return "SAMPLER_3D";
      case WebGL2RenderingContext.SAMPLER_2D_SHADOW:
        return "SAMPLER_2D_SHADOW";
      case WebGL2RenderingContext.SAMPLER_2D_ARRAY:
        return "SAMPLER_2D_ARRAY";
      case WebGL2RenderingContext.SAMPLER_2D_ARRAY_SHADOW:
        return "SAMPLER_2D_ARRAY_SHADOW";
      case WebGL2RenderingContext.SAMPLER_CUBE_SHADOW:
        return "SAMPLER_CUBE_SHADOW";
      case WebGL2RenderingContext.INT_SAMPLER_2D:
        return "INT_SAMPLER_2D";
      case WebGL2RenderingContext.INT_SAMPLER_3D:
        return "INT_SAMPLER_3D";
      case WebGL2RenderingContext.INT_SAMPLER_CUBE:
        return "INT_SAMPLER_CUBE";
      case WebGL2RenderingContext.INT_SAMPLER_2D_ARRAY:
        return "INT_SAMPLER_2D_ARRAY";
      case WebGL2RenderingContext.UNSIGNED_INT_SAMPLER_2D:
        return "UNSIGNED_INT_SAMPLER_2D";
      case WebGL2RenderingContext.UNSIGNED_INT_SAMPLER_3D:
        return "UNSIGNED_INT_SAMPLER_3D";
      case WebGL2RenderingContext.UNSIGNED_INT_SAMPLER_CUBE:
        return "UNSIGNED_INT_SAMPLER_CUBE";
      case WebGL2RenderingContext.UNSIGNED_INT_SAMPLER_2D_ARRAY:
        return "UNSIGNED_INT_SAMPLER_2D_ARRAY";
      default:
        return "UNKNOWN";
    }
  }

  public static int getAttribLocation( @Nonnull final WebGL2RenderingContext gl,
                                       @Nonnull final WebGLProgram program,
                                       @Nonnull final String name )
  {
    final int location = gl.getAttribLocation( program, name );
    assert WebGL2RenderingContext.INVALID_INDEX != location;
    return location;
  }

  @Nonnull
  public static WebGLUniformLocation getUniformLocation( @Nonnull final WebGL2RenderingContext gl,
                                                         @Nonnull final WebGLProgram program,
                                                         @Nonnull final String name )
  {
    final WebGLUniformLocation location = gl.getUniformLocation( program, name );
    assert null != location;
    return location;
  }
}
