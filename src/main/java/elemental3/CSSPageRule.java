package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * CSSPageRule represents a single CSS @page rule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSPageRule">CSSPageRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom/#the-csspagerule-interface">CSSPageRule - CSS Object Model (CSSOM)</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSPageRule">CSSPageRule - Document Object Model (DOM) Level 2 Style Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSPageRule"
)
public class CSSPageRule extends CSSGroupingRule {
  @Nonnull
  public String selectorText;

  protected CSSPageRule() {
  }

  @JsProperty(
      name = "style"
  )
  @Nonnull
  public native CSSStyleDeclaration style();
}
