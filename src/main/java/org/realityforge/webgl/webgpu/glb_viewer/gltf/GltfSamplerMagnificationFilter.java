package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import akasha.gl.WebGL2RenderingContext;
import java.lang.annotation.Documented;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Documented
@MagicConstant(
  intValues = {
    GltfSamplerMagnificationFilter.NEAREST,
    GltfSamplerMagnificationFilter.LINEAR
  }
)
public @interface GltfSamplerMagnificationFilter
{
  int NEAREST = WebGL2RenderingContext.NEAREST;
  int LINEAR = WebGL2RenderingContext.LINEAR;

  final class Util
  {
    private Util()
    {
    }

    @GltfSamplerMagnificationFilter
    public static int requireValid( final int value )
    {
      assertValid( value );
      return value;
    }

    public static void assertValid( final int value )
    {
      assert isValid( value ) :
        "@GltfMagFilterType annotated value must be one of [GltfMagFilterType.NEAREST, GltfMagFilterType.LINEAR] but is " +
        value;
    }

    public static boolean isValid( final int value )
    {
      return GltfSamplerMagnificationFilter.NEAREST == value || GltfSamplerMagnificationFilter.LINEAR == value;
    }

    @Nonnull
    public static String describe( final int value )
    {
      return GltfSamplerMagnificationFilter.NEAREST == value ? "NEAREST" :
             GltfSamplerMagnificationFilter.LINEAR == value ? "LINEAR" :
             "Unknown value " + value;
    }
  }
}
