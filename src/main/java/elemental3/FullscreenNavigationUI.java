package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = FullscreenNavigationUI.class
)
public @interface FullscreenNavigationUI {
  @Nonnull
  String auto = "auto";

  @Nonnull
  String hide = "hide";

  @Nonnull
  String show = "show";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return FullscreenNavigationUI.auto.equals( value ) || FullscreenNavigationUI.hide.equals( value ) || FullscreenNavigationUI.show.equals( value );
    }
  }
}
