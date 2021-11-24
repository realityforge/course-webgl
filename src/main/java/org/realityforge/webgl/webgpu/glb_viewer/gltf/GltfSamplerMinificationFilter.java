package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import akasha.gl.WebGL2RenderingContext;
import java.lang.annotation.Documented;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Documented
@MagicConstant(
  intValues = {
    GltfSamplerMinificationFilter.NEAREST,
    GltfSamplerMinificationFilter.LINEAR,
    GltfSamplerMinificationFilter.NEAREST_MIPMAP_NEAREST,
    GltfSamplerMinificationFilter.LINEAR_MIPMAP_NEAREST,
    GltfSamplerMinificationFilter.NEAREST_MIPMAP_LINEAR,
    GltfSamplerMinificationFilter.LINEAR_MIPMAP_LINEAR
  }
)
public @interface GltfSamplerMinificationFilter
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

    @GltfSamplerMinificationFilter
    public static int requireValid( final int value )
    {
      assertValid( value );
      return value;
    }

    public static void assertValid( final int value )
    {
      assert isValid( value ) :
        "@GltfMinFilterType annotated value must be one of [GltfMinFilterType.NEAREST, GltfMinFilterType.LINEAR, GltfMinFilterType.NEAREST_MIPMAP_NEAREST, GltfMinFilterType.LINEAR_MIPMAP_NEAREST, GltfMinFilterType.NEAREST_MIPMAP_LINEAR, GltfMinFilterType.LINEAR_MIPMAP_LINEAR] but is " +
        value;
    }

    public static boolean isValid( final int value )
    {
      return GltfSamplerMinificationFilter.NEAREST == value ||
             GltfSamplerMinificationFilter.LINEAR == value ||
             GltfSamplerMinificationFilter.NEAREST_MIPMAP_NEAREST == value ||
             GltfSamplerMinificationFilter.LINEAR_MIPMAP_NEAREST == value ||
             GltfSamplerMinificationFilter.NEAREST_MIPMAP_LINEAR == value ||
             GltfSamplerMinificationFilter.LINEAR_MIPMAP_LINEAR == value;
    }

    @Nonnull
    public static String describe( final int value )
    {
      return GltfSamplerMinificationFilter.NEAREST == value ? "NEAREST" :
             GltfSamplerMinificationFilter.LINEAR == value ? "LINEAR" :
             GltfSamplerMinificationFilter.NEAREST_MIPMAP_NEAREST == value ? "NEAREST_MIPMAP_NEAREST" :
             GltfSamplerMinificationFilter.LINEAR_MIPMAP_NEAREST == value ? "LINEAR_MIPMAP_NEAREST" :
             GltfSamplerMinificationFilter.NEAREST_MIPMAP_LINEAR == value ? "NEAREST_MIPMAP_LINEAR" :
             GltfSamplerMinificationFilter.LINEAR_MIPMAP_LINEAR == value ? "LINEAR_MIPMAP_LINEAR" :
             "Unknown value " + value;
    }
  }
}
