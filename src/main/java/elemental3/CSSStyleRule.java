package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSStyleRule interface represents a single CSS style rule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleRule">CSSStyleRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom/#the-cssstylerule-interface">CSSStyleRule - CSS Object Model (CSSOM)</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSStyleRule">CSSRule - Document Object Model (DOM) Level 2 Style Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSStyleRule"
)
public class CSSStyleRule extends CSSRule {
  /**
   * The CSSRule.selectorText property gets the textual representation of the selector for the rule set. This is readonly in some browsers; to set stylesheet rules dynamically cross-browser, see Using dynamic styling information.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleRule/selectorText">CSSStyleRule.selectorText - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssstylerule-selectortext">CSSStyleRule.selectorText - CSS Object Model (CSSOM)</a>
   */
  @Nonnull
  public String selectorText;

  protected CSSStyleRule() {
  }

  /**
   * The CSSRule.style property is the CSSStyleDeclaration interface for the declaration block of the CSSRule.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleRule/style">CSSStyleRule.style - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssstylerule-style">CSSStyleRule: style - CSS Object Model (CSSOM)</a>
   */
  @JsProperty(
      name = "style"
  )
  @Nonnull
  public native CSSStyleDeclaration style();
}
