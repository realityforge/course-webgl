package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSMediaRule interface represents a single CSS @media rule. It implements the CSSConditionRule interface, and therefore the CSSGroupingRule and the CSSRule interface with a type value of 4 (CSSRule.MEDIA_RULE).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSMediaRule">CSSMediaRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-conditional-3/#the-cssmediarule-interface">The definition of 'CSSMediaRule' in the 'CSS Conditional Rules Module Level 3' specification.</a>
 * @see <a href="https://drafts.csswg.org/cssom/#the-cssmediarule-interface">The definition of 'CSSMediaRule' in the 'CSS Object Model (CSSOM)' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSMediaRule">The definition of 'CSSMediaRule' in the 'Document Object Model (DOM) Level 2 Style Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSMediaRule"
)
public class CSSMediaRule extends CSSConditionRule {
  protected CSSMediaRule() {
  }

  @JsProperty(
      name = "media"
  )
  @Nonnull
  public native MediaList media();
}
