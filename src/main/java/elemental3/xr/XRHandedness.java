package elemental3.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRHandedness.class
)
public @interface XRHandedness {
  @Nonnull
  String left = "left";

  @Nonnull
  String none = "none";

  @Nonnull
  String right = "right";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRHandedness.left.equals( value ) || XRHandedness.none.equals( value ) || XRHandedness.right.equals( value );
    }
  }
}
