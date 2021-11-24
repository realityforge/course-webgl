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
    GltfSamplerWrapMode.REPEAT,
    GltfSamplerWrapMode.CLAMP_TO_EDGE,
    GltfSamplerWrapMode.MIRRORED_REPEAT
  }
)
public @interface GltfSamplerWrapMode
{
  int REPEAT = WebGL2RenderingContext.REPEAT;
  int CLAMP_TO_EDGE = WebGL2RenderingContext.CLAMP_TO_EDGE;
  int MIRRORED_REPEAT = WebGL2RenderingContext.MIRRORED_REPEAT;

  final class Util
  {
    private Util()
    {
    }

    @GltfSamplerWrapMode
    public static int requireValid( final int value )
    {
      assertValid( value );
      return value;
    }

    public static void assertValid( final int value )
    {
      assert isValid( value ) :
        "@GltfSamplerWrapMode annotated value must be one of [GltfSamplerWrapMode.REPEAT, GltfSamplerWrapMode.CLAMP_TO_EDGE, GltfSamplerWrapMode.MIRRORED_REPEAT] but is " +
        value;
    }

    public static boolean isValid( final int value )
    {
      return GltfSamplerWrapMode.REPEAT == value ||
             GltfSamplerWrapMode.CLAMP_TO_EDGE == value ||
             GltfSamplerWrapMode.MIRRORED_REPEAT == value;
    }

    @Nonnull
    public static String describe( final int value )
    {
      return GltfSamplerWrapMode.REPEAT == value ? "REPEAT" :
             GltfSamplerWrapMode.CLAMP_TO_EDGE == value ? "CLAMP_TO_EDGE" :
             GltfSamplerWrapMode.MIRRORED_REPEAT == value ? "MIRRORED_REPEAT" :
             "Unknown value " + value;
    }
  }
}
