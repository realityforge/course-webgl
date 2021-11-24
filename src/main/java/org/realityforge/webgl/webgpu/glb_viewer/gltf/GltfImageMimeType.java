package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import java.lang.annotation.Documented;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Documented
@MagicConstant(
  stringValues = {
    GltfImageMimeType.IMAGE_JPEG,
    GltfImageMimeType.IMAGE_PNG
  }
)
public @interface GltfImageMimeType
{
  @Nonnull
  String IMAGE_JPEG = "image/jpeg";
  @Nonnull
  String IMAGE_PNG = "image/png";

  final class Util
  {
    private Util()
    {
    }

    @GltfImageMimeType
    @Nonnull
    public static String requireValid( @Nonnull final String value )
    {
      assertValid( value );
      return value;
    }

    public static void assertValid( @Nonnull final String value )
    {
      assert isValid( value ) :
        "@GltfImageMimeType annotated value must be one of [GltfImageMimeType.IMAGE_JPEG, GltfImageMimeType.IMAGE_PNG] but is " +
        value;
    }

    public static boolean isValid( @Nonnull final String value )
    {
      return GltfImageMimeType.IMAGE_JPEG.equals( value ) || GltfImageMimeType.IMAGE_PNG.equals( value );
    }

    @Nonnull
    public static String describe( @Nonnull final String value )
    {
      return GltfImageMimeType.IMAGE_JPEG.equals( value )  ? "IMAGE_JPEG" :
             GltfImageMimeType.IMAGE_PNG.equals( value )  ? "IMAGE_PNG" :
             "Unknown value " + value;
    }
  }
}
