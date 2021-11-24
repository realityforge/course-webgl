package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import akasha.gl.WebGL2RenderingContext;
import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated( "org.realityforge.webtack" )
@Documented
@MagicConstant(
  intValues = {
    WrapMode.REPEAT,
    WrapMode.CLAMP_TO_EDGE,
    WrapMode.MIRRORED_REPEAT
  }
)
public @interface WrapMode
{
  int REPEAT = WebGL2RenderingContext.REPEAT;
  int CLAMP_TO_EDGE = WebGL2RenderingContext.CLAMP_TO_EDGE;
  int MIRRORED_REPEAT = WebGL2RenderingContext.MIRRORED_REPEAT;

  final class Util
  {
    private Util()
    {
    }

    @WrapMode
    public static int requireValid( final int value )
    {
      assertValid( value );
      return value;
    }

    public static void assertValid( final int value )
    {
      assert isValid( value ) :
        "@WrapMode annotated value must be one of [WrapMode.REPEAT, WrapMode.CLAMP_TO_EDGE, WrapMode.MIRRORED_REPEAT] but is " +
        value;
    }

    public static boolean isValid( final int value )
    {
      return WrapMode.REPEAT == value ||
             WrapMode.CLAMP_TO_EDGE == value ||
             WrapMode.MIRRORED_REPEAT == value;
    }

    @Nonnull
    public static String describe( final int value )
    {
      return WrapMode.REPEAT == value ? "REPEAT" :
             WrapMode.CLAMP_TO_EDGE == value ? "CLAMP_TO_EDGE" :
             WrapMode.MIRRORED_REPEAT == value ? "MIRRORED_REPEAT" :
             "Unknown value " + value;
    }
  }
}
