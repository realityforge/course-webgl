package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSGroupingRule interface of the CSS Object Model represents any CSS at-rule that contains other rules nested within it.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSGroupingRule">CSSGroupingRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom/#cssgroupingrule">CSSGroupingRule - CSS Object Model (CSSOM)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSGroupingRule"
)
public class CSSGroupingRule extends CSSRule {
  protected CSSGroupingRule() {
  }

  @JsProperty(
      name = "cssRules"
  )
  @Nonnull
  public native CSSRuleList cssRules();

  public native void deleteRule(int index);

  public native int insertRule(@Nonnull String rule, int index);

  public native int insertRule(@Nonnull String rule);
}
