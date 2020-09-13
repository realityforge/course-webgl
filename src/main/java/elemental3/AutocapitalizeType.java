package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * Controls whether and how text input is automatically capitalized as it is entered/edited by the user.
 */
@Generated("org.realityforge.webtack")
public final class AutocapitalizeType {
  /**
   * No autocapitalization is applied (all letters default to lowercase).
   */
  @Nonnull
  public static final String off = "off";

  /**
   * No autocapitalization is applied (all letters default to lowercase).
   */
  @Nonnull
  public static final String none = "none";

  /**
   * The first letter of each sentence defaults to a capital letter; all other letters default to lowercase.
   */
  @Nonnull
  public static final String on = "on";

  /**
   * The first letter of each sentence defaults to a capital letter; all other letters default to lowercase.
   */
  @Nonnull
  public static final String sentences = "sentences";

  /**
   * The first letter of each word defaults to a capital letter; all other letters default to lowercase.
   */
  @Nonnull
  public static final String words = "words";

  /**
   * All letters should default to uppercase.
   */
  @Nonnull
  public static final String characters = "characters";

  private AutocapitalizeType() {
  }
}
