package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * Controls whether and how text input is automatically capitalized as it is entered/edited by the user.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AutocapitalizeType.class
)
public @interface AutocapitalizeType {
  /**
   * All letters should default to uppercase.
   */
  @Nonnull
  String characters = "characters";

  /**
   * No autocapitalization is applied (all letters default to lowercase).
   */
  @Nonnull
  String none = "none";

  /**
   * No autocapitalization is applied (all letters default to lowercase).
   */
  @Nonnull
  String off = "off";

  /**
   * The first letter of each sentence defaults to a capital letter; all other letters default to lowercase.
   */
  @Nonnull
  String on = "on";

  /**
   * The first letter of each sentence defaults to a capital letter; all other letters default to lowercase.
   */
  @Nonnull
  String sentences = "sentences";

  /**
   * The first letter of each word defaults to a capital letter; all other letters default to lowercase.
   */
  @Nonnull
  String words = "words";

  final class Validator {
    private Validator() {
    }

    @AutocapitalizeType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AutocapitalizeType.characters.equals( value ) || AutocapitalizeType.none.equals( value ) || AutocapitalizeType.off.equals( value ) || AutocapitalizeType.on.equals( value ) || AutocapitalizeType.sentences.equals( value ) || AutocapitalizeType.words.equals( value );
    }
  }
}
