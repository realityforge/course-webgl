package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = VisibilityState.class
)
public @interface VisibilityState {
  @Nonnull
  String hidden = "hidden";

  @Nonnull
  String visible = "visible";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return VisibilityState.hidden.equals( value ) || VisibilityState.visible.equals( value );
    }
  }
}
