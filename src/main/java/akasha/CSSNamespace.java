package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The CSS interface holds useful CSS-related methods. No objects with this interface are implemented: it contains only static methods and is therefore a utilitarian interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSS">CSS - MDN</a>
 * @see <a href="https://drafts.css-houdini.org/css-paint-api-1/#dom-css-paintworklet">paintWorklet - CSS Painting API Level 1</a>
 * @see <a href="https://drafts.csswg.org/cssom/#the-css.escape()-method">CSS - CSS Object Model (CSSOM)</a>
 * @see <a href="https://drafts.csswg.org/css-conditional-3/#the-css-interface">CSS - CSS Conditional Rules Module Level 3</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSS"
)
public final class CSSNamespace {
  private CSSNamespace() {
  }

  /**
   * The CSS.escape() static method returns a CSSOMString containing the escaped string passed as parameter, mostly for use as part of a CSS selector.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSS/escape">CSS.escape - MDN</a>
   */
  @Nonnull
  public native String escape(@Nonnull String ident);

  /**
   * The CSS.supports() method returns a Boolean value indicating if the browser supports a given CSS feature, or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSS/supports">CSS.supports - MDN</a>
   */
  public native boolean supports(@Nonnull String conditionText);

  /**
   * The CSS.supports() method returns a Boolean value indicating if the browser supports a given CSS feature, or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSS/supports">CSS.supports - MDN</a>
   */
  public native boolean supports(@Nonnull String property, @Nonnull String value);
}
