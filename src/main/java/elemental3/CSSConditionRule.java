package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An object implementing the CSSConditionRule interface represents a single condition CSS at-rule, which consists of a condition and a statement block.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSConditionRule">CSSConditionRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-conditional-3/#the-cssconditionrule-interface">CSSConditionRule - CSS Conditional Rules Module Level 3</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSConditionRule"
)
public class CSSConditionRule extends CSSGroupingRule {
  @Nonnull
  public String conditionText;

  protected CSSConditionRule() {
  }
}
