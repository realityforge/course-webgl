package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * CSSStyleRule represents a single CSS style rule. It implements the CSSRule interface with a type value of 1 (CSSRule.STYLE_RULE).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleRule">CSSStyleRule - MDN</a>
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
   */
  @Nonnull
  public String selectorText;

  CSSStyleRule() {
  }

  /**
   * The CSSRule.style property is the CSSStyleDeclaration interface for the declaration block of the CSSRule.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleRule/style">CSSStyleRule.style - MDN</a>
   */
  @JsProperty(
      name = "style"
  )
  @Nonnull
  public native CSSStyleDeclaration style();
}
