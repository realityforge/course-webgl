package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRSessionMode.class
)
public @interface XRSessionMode {
  @Nonnull
  String immersive_ar = "immersive-ar";

  @Nonnull
  String immersive_vr = "immersive-vr";

  @Nonnull
  String inline = "inline";

  final class Util {
    private Util() {
    }

    @XRSessionMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRSessionMode.immersive_ar.equals( value ) || XRSessionMode.immersive_vr.equals( value ) || XRSessionMode.inline.equals( value );
    }
  }
}
