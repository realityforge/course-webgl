package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * An enumeration describing the whether elements can have their values automatically completed by the browser.
 */
@Generated("org.realityforge.webtack")
public final class FormAutocompleteType {
  /**
   * The browser may not automatically complete entries.
   */
  @Nonnull
  public static final String off = "off";

  /**
   * The browser may automatically complete entries.
   */
  @Nonnull
  public static final String on = "on";

  private FormAutocompleteType() {
  }
}
