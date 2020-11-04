package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The CSSSupportsRule interface describes an object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSSupportsRule">CSSSupportsRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-conditional-3/#the-csssupportsrule-interface">The definition of 'CSSSupportsRule' in CSS Conditional Rules Module Level 3.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSSupportsRule"
)
public class CSSSupportsRule extends CSSConditionRule {
  protected CSSSupportsRule() {
  }
}
