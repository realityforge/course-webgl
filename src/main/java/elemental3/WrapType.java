package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumerated value to indicate how the control wraps text.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = WrapType.class
)
public @interface WrapType {
  /**
   * The browser automatically inserts line breaks (CR+LF) so that each line has no more
   * than the width of the control; the cols attribute must also be specified for this to
   * take effect.
   */
  @Nonnull
  String hard = "hard";

  /**
   * The browser ensures that all line breaks in the value consist of a CR+LF pair, but does
   * not insert any additional line breaks. This is the default value.
   */
  @Nonnull
  String soft = "soft";

  final class Validator {
    private Validator() {
    }

    @WrapType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return WrapType.hard.equals( value ) || WrapType.soft.equals( value );
    }
  }
}
