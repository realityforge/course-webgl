package elemental3.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRVisibilityState.class
)
public @interface XRVisibilityState {
  @Nonnull
  String hidden = "hidden";

  @Nonnull
  String visible = "visible";

  @Nonnull
  String visible_blurred = "visible-blurred";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRVisibilityState.hidden.equals( value ) || XRVisibilityState.visible.equals( value ) || XRVisibilityState.visible_blurred.equals( value );
    }
  }
}
