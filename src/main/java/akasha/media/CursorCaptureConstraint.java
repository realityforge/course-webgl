package akasha.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CursorCaptureConstraint.class
)
public @interface CursorCaptureConstraint {
  @Nonnull
  String always = "always";

  @Nonnull
  String motion = "motion";

  @Nonnull
  String never = "never";

  final class Util {
    private Util() {
    }

    @CursorCaptureConstraint
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CursorCaptureConstraint.always.equals( value ) || CursorCaptureConstraint.motion.equals( value ) || CursorCaptureConstraint.never.equals( value );
    }
  }
}
