package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSImportRule interface represents an @import at-rule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSImportRule">CSSImportRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom/#cssimportrule">CSSImportRule - CSS Object Model (CSSOM)</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSImportRule">CSSImportRule - Document Object Model (DOM) Level 2 Style Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSImportRule"
)
public class CSSImportRule extends CSSRule {
  protected CSSImportRule() {
  }

  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native String href();

  @JsProperty(
      name = "media"
  )
  @Nonnull
  public native MediaList media();

  @JsProperty(
      name = "styleSheet"
  )
  @Nonnull
  public native CSSStyleSheet styleSheet();
}
