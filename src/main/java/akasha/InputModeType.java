package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The inputmode enumeration that hints at the type of data that might be entered by the user while editing the element or its contents.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/inputmode">inputmode - MDN</a>
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = InputModeType.class
)
public @interface InputModeType {
  /**
   * Fractional numeric input keyboard containing the digits and decimal separator for the user's locale (typically <code>.</code> or <code>,</code>).
   * Devices may or may not show a minus key (<code>-</code>).
   */
  @Nonnull
  String decimal = "decimal";

  /**
   * A virtual keyboard optimized for entering email addresses.
   * Typically includes the <code>@</code> character as well as other optimizations. Inputs that require email
   * addresses should typically use <code>&lt;input type="email"&gt;</code> instead.
   */
  @Nonnull
  String email = "email";

  /**
   * No virtual keyboard. For when the page implements its own keyboard input control.
   */
  @Nonnull
  String none = "none";

  /**
   * Numeric input keyboard, but only requires the digits 0–9. Devices may or may not show a minus key.
   */
  @Nonnull
  String numeric = "numeric";

  /**
   * A virtual keyboard optimized for search input.
   * For instance, the return/submit key may be labeled “Search”, along with possible other optimizations.
   * Inputs that require a search query should typically use <code>&lt;input type="search"&gt;</code> instead.
   */
  @Nonnull
  String search = "search";

  /**
   * A telephone keypad input, including the digits 0–9, the asterisk (<code>*</code>), and the pound (<code>#</code>) key.
   * Inputs that require a telephone number should typically use <code>&lt;input type="tel"&gt;</code> instead.
   */
  @Nonnull
  String tel = "tel";

  /**
   * Standard input keyboard for the user's current locale.
   * This is the default value.
   */
  @Nonnull
  String text = "text";

  /**
   * A keypad optimized for entering URLs.
   * This may have the <code>/</code> key more prominent, for example. Enhanced features could include history
   * access and so on. Inputs that require a URL should typically use <code>&lt;input type="url"&gt;</code> instead.
   */
  @Nonnull
  String url = "url";

  final class Util {
    private Util() {
    }

    @InputModeType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return InputModeType.decimal.equals( value ) || InputModeType.email.equals( value ) || InputModeType.none.equals( value ) || InputModeType.numeric.equals( value ) || InputModeType.search.equals( value ) || InputModeType.tel.equals( value ) || InputModeType.text.equals( value ) || InputModeType.url.equals( value );
    }
  }
}
