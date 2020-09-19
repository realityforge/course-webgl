package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * Controls whether and how text input is automatically capitalized as it is entered/edited by the user.
 */
@Generated("org.realityforge.webtack")
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
}
