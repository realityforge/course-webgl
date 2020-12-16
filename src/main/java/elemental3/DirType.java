package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumerated attribute indicating the directionality of the element's text.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = DirType.class
)
public @interface DirType {
  /**
   * Auto direction which lets the user agent decide. It uses a basic algorithm as it parses the characters inside the element until it finds a character with a strong directionality, then it applies that directionality to the whole element.
   */
  @Nonnull
  String auto = "auto";

  /**
   * Left to right direction which is to be used for languages that are written from the left to the right, such as English.
   */
  @Nonnull
  String ltr = "ltr";

  /**
   * Right to left direction which is to be used for languages that are written from the right to the left, such as Arabic.
   */
  @Nonnull
  String rtl = "rtl";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return DirType.auto.equals( value ) || DirType.ltr.equals( value ) || DirType.rtl.equals( value );
    }
  }
}
