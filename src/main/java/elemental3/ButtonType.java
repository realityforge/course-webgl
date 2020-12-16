package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumeration describing the behavior of the button.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ButtonType.class
)
public @interface ButtonType {
  /**
   * The button has no default behaviour.
   */
  @Nonnull
  String button = "button";

  /**
   * The button displays a menu.
   * This is an experimental feature.
   */
  @Nonnull
  String menu = "menu";

  /**
   * The button resets the form.
   */
  @Nonnull
  String reset = "reset";

  /**
   * The button submits the form. This is the default value if the attribute is not specified, or if it is dynamically changed to an empty or invalid value.
   */
  @Nonnull
  String submit = "submit";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ButtonType.button.equals( value ) || ButtonType.menu.equals( value ) || ButtonType.reset.equals( value ) || ButtonType.submit.equals( value );
    }
  }
}
