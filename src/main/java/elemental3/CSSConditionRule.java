package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An object implementing the CSSConditionRule interface represents a single condition CSS at-rule, which consists of a condition and a statement block. It is a child of CSSGroupingRule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSConditionRule">CSSConditionRule - MDN</a>
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
