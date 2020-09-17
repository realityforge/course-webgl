package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The CSS interface holds useful CSS-related methods. No objects with this interface are implemented: it contains only static methods and is therefore a utilitarian interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSS">CSS - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSS"
)
public final class CSS {
  private CSS() {
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
