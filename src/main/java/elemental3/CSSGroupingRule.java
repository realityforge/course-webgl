package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * An object implementing the CSSGroupingRule interface represents any CSS at-rule that contains other rules nested within it.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSGroupingRule">CSSGroupingRule - MDN</a>
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
