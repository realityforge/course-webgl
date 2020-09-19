package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumeration describing the whether elements can have their values automatically completed by the browser.
 */
@Generated("org.realityforge.webtack")
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
}
