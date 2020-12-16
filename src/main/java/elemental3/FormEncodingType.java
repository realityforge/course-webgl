package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumeration specifying the HTTP method to submit the form with.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = FormEncodingType.class
)
public @interface FormEncodingType {
  /**
   * The default value.
   */
  @Nonnull
  String urlencoded = "application/x-www-form-urlencoded";

  /**
   * Use this if the form contains <code>&lt;input&gt;</code> elements with type=file.
   */
  @Nonnull
  String multipart_form_data = "multipart/form-data";

  /**
   * Introduced by HTML5 for debugging purposes.
   */
  @Nonnull
  String text_plain = "text/plain";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return FormEncodingType.urlencoded.equals( value ) || FormEncodingType.multipart_form_data.equals( value ) || FormEncodingType.text_plain.equals( value );
    }
  }
}
