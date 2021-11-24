package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import akasha.gl.WebGL2RenderingContext;
import java.lang.annotation.Documented;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Documented
@MagicConstant(
  intValues = {
    MinFilter.NEAREST,
    MinFilter.LINEAR,
    MinFilter.NEAREST_MIPMAP_NEAREST,
    MinFilter.LINEAR_MIPMAP_NEAREST,
    MinFilter.NEAREST_MIPMAP_LINEAR,
    MinFilter.LINEAR_MIPMAP_LINEAR
  }
)
public @interface MinFilter
{
  int NEAREST = WebGL2RenderingContext.NEAREST;
  int LINEAR = WebGL2RenderingContext.LINEAR;
  int NEAREST_MIPMAP_NEAREST = WebGL2RenderingContext.NEAREST_MIPMAP_NEAREST;
  int LINEAR_MIPMAP_NEAREST = WebGL2RenderingContext.LINEAR_MIPMAP_NEAREST;
  int NEAREST_MIPMAP_LINEAR = WebGL2RenderingContext.NEAREST_MIPMAP_LINEAR;
  int LINEAR_MIPMAP_LINEAR = WebGL2RenderingContext.LINEAR_MIPMAP_LINEAR;

  final class Util
  {
    private Util()
    {
    }

    @MinFilter
    public static int requireValid( final int value )
    {
      assertValid( value );
      return value;
    }

    public static void assertValid( final int value )
    {
      assert isValid( value ) :
        "@MinFilter annotated value must be one of [MinFilter.NEAREST, MinFilter.LINEAR, MinFilter.NEAREST_MIPMAP_NEAREST, MinFilter.LINEAR_MIPMAP_NEAREST, MinFilter.NEAREST_MIPMAP_LINEAR, MinFilter.LINEAR_MIPMAP_LINEAR] but is " +
        value;
    }

    public static boolean isValid( final int value )
    {
      return MinFilter.NEAREST == value ||
             MinFilter.LINEAR == value ||
             MinFilter.NEAREST_MIPMAP_NEAREST == value ||
             MinFilter.LINEAR_MIPMAP_NEAREST == value ||
             MinFilter.NEAREST_MIPMAP_LINEAR == value ||
             MinFilter.LINEAR_MIPMAP_LINEAR == value;
    }

    @Nonnull
    public static String describe( final int value )
    {
      return MinFilter.NEAREST == value ? "NEAREST" :
             MinFilter.LINEAR == value ? "LINEAR" :
             MinFilter.NEAREST_MIPMAP_NEAREST == value ? "NEAREST_MIPMAP_NEAREST" :
             MinFilter.LINEAR_MIPMAP_NEAREST == value ? "LINEAR_MIPMAP_NEAREST" :
             MinFilter.NEAREST_MIPMAP_LINEAR == value ? "NEAREST_MIPMAP_LINEAR" :
             MinFilter.LINEAR_MIPMAP_LINEAR == value ? "LINEAR_MIPMAP_LINEAR" :
             "Unknown value " + value;
    }
  }
}
