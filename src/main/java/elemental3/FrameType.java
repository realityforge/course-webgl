package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = FrameType.class
)
public @interface FrameType {
  @Nonnull
  String auxiliary = "auxiliary";

  @Nonnull
  String nested = "nested";

  @Nonnull
  String none = "none";

  @Nonnull
  String top_level = "top-level";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return FrameType.auxiliary.equals( value ) || FrameType.nested.equals( value ) || FrameType.none.equals( value ) || FrameType.top_level.equals( value );
    }
  }
}
