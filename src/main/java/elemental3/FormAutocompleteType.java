package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumeration describing the whether elements can have their values automatically completed by the browser.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = FormAutocompleteType.class
)
public @interface FormAutocompleteType {
  /**
   * The browser may not automatically complete entries.
   */
  @Nonnull
  String off = "off";

  /**
   * The browser may automatically complete entries.
   */
  @Nonnull
  String on = "on";

  final class Validator {
    private Validator() {
    }

    @FormAutocompleteType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return FormAutocompleteType.off.equals( value ) || FormAutocompleteType.on.equals( value );
    }
  }
}
