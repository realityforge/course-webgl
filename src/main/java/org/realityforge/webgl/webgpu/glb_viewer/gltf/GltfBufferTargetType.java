package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import akasha.gl.WebGL2RenderingContext;
import java.lang.annotation.Documented;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Documented
@MagicConstant(
  intValues = {
    GltfBufferTargetType.ARRAY_BUFFER,
    GltfBufferTargetType.ELEMENT_ARRAY_BUFFER
  }
)
public @interface GltfBufferTargetType
{
  int ARRAY_BUFFER = WebGL2RenderingContext.ARRAY_BUFFER;
  int ELEMENT_ARRAY_BUFFER = WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER;

  final class Util
  {
    private Util()
    {
    }

    @GltfBufferTargetType
    public static int requireValid( final int value )
    {
      assertValid( value );
      return value;
    }

    public static void assertValid( final int value )
    {
      assert isValid( value ) :
        "@GltfBufferTargetType annotated value must be one of [GltfBufferTargetType.ARRAY_BUFFER, GltfBufferTargetType.ELEMENT_ARRAY_BUFFER] but is " +
        value;
    }

    public static boolean isValid( final int value )
    {
      return GltfBufferTargetType.ARRAY_BUFFER == value || GltfBufferTargetType.ELEMENT_ARRAY_BUFFER == value;
    }

    @Nonnull
    public static String describe( final int value )
    {
      return GltfBufferTargetType.ARRAY_BUFFER == value ? "ARRAY_BUFFER" :
             GltfBufferTargetType.ELEMENT_ARRAY_BUFFER == value ? "ELEMENT_ARRAY_BUFFER" :
             "Unknown value " + value;
    }
  }
}
