package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import akasha.gl.WebGL2RenderingContext;
import java.lang.annotation.Documented;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Documented
@MagicConstant(
  intValues = {
    MagFilter.NEAREST,
    MagFilter.LINEAR
  }
)
public @interface MagFilter
{
  int NEAREST = WebGL2RenderingContext.NEAREST;
  int LINEAR = WebGL2RenderingContext.LINEAR;

  final class Util
  {
    private Util()
    {
    }

    @MagFilter
    public static int requireValid( final int value )
    {
      assertValid( value );
      return value;
    }

    public static void assertValid( final int value )
    {
      assert isValid( value ) :
        "@MagFilter annotated value must be one of [MagFilter.NEAREST, MagFilter.LINEAR] but is " +
        value;
    }

    public static boolean isValid( final int value )
    {
      return MagFilter.NEAREST == value || MagFilter.LINEAR == value;
    }

    @Nonnull
    public static String describe( final int value )
    {
      return MagFilter.NEAREST == value ? "NEAREST" :
             MagFilter.LINEAR == value ? "LINEAR" :
             "Unknown value " + value;
    }
  }
}
