package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = FillMode.class
)
public @interface FillMode {
  @Nonnull
  String auto = "auto";

  @Nonnull
  String backwards = "backwards";

  @Nonnull
  String both = "both";

  @Nonnull
  String forwards = "forwards";

  @Nonnull
  String none = "none";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return FillMode.auto.equals( value ) || FillMode.backwards.equals( value ) || FillMode.both.equals( value ) || FillMode.forwards.equals( value ) || FillMode.none.equals( value );
    }
  }
}
