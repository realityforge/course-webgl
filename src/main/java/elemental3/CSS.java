package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * The CSS interface holds useful CSS-related methods. No objects with this interface are implemented: it contains only static methods and is therefore a utilitarian interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSS">CSS - MDN</a>
 * @see <a href="https://drafts.css-houdini.org/css-paint-api-1/#dom-css-paintworklet">paintWorklet - CSS Painting API Level 1</a>
 * @see <a href="https://drafts.csswg.org/cssom/#the-css.escape()-method">CSS - CSS Object Model (CSSOM)</a>
 * @see <a href="https://drafts.csswg.org/css-conditional-3/#the-css-interface">CSS - CSS Conditional Rules Module Level 3</a>
 */
@Generated("org.realityforge.webtack")
public final class CSS {
  private CSS() {
  }

  /**
   * The CSS.escape() static method returns a CSSOMString containing the escaped string passed as parameter, mostly for use as part of a CSS selector.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSS/escape">CSS.escape - MDN</a>
   */
  @Nonnull
  public static String escape(@Nonnull String ident) {
    return namespace().escape(ident);
  }

  /**
   * The CSS.supports() method returns a Boolean value indicating if the browser supports a given CSS feature, or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSS/supports">CSS.supports - MDN</a>
   */
  public static boolean supports(@Nonnull String property, @Nonnull String value) {
    return namespace().supports(property, value);
  }

  /**
   * The CSS.supports() method returns a Boolean value indicating if the browser supports a given CSS feature, or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSS/supports">CSS.supports - MDN</a>
   */
  public static boolean supports(@Nonnull String conditionText) {
    return namespace().supports(conditionText);
  }

  /**
   * Return the 'CSS' namespace object.
   *
   * @return the 'CSS' namespace object
   */
  @Nonnull
  public static CSSNamespace namespace() {
    return Global.css();
  }
}
