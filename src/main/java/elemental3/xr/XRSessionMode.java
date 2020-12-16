package elemental3.xr;

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

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRSessionMode.immersive_ar.equals( value ) || XRSessionMode.immersive_vr.equals( value ) || XRSessionMode.inline.equals( value );
    }
  }
}
