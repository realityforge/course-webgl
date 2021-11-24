package org.realityforge.webgl.webgpu.glb_viewer.model;

import akasha.gl.WebGL2RenderingContext;
import akasha.gpu.GPUBufferUsage;
import java.lang.annotation.Documented;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Documented
@MagicConstant(
  intValues = {
    GPUBufferUsage.VERTEX,
    GPUBufferUsage.INDEX
  }
)
public @interface BufferViewUsage
{
  final class Util
  {
    private Util()
    {
    }

    @BufferViewUsage
    public static int requireValid( final int value )
    {
      assertValid( value );
      return value;
    }

    public static void assertValid( final int value )
    {
      assert isValid( value ) :
        "@BufferTargetType annotated value must be one of [GPUBufferUsage.VERTEX, GPUBufferUsage.INDEX] but is " +
        value;
    }

    public static boolean isValid( final int value )
    {
      return GPUBufferUsage.VERTEX == value || GPUBufferUsage.INDEX == value;
    }

    @Nonnull
    public static String describe( final int value )
    {
      return GPUBufferUsage.VERTEX == value ? "VERTEX" :
             GPUBufferUsage.INDEX == value ? "INDEX" :
             "Unknown value " + value;
    }
  }
}
