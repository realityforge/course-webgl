package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSKeyframesRule interface describes an object representing a complete set of keyframes for a CSS animation. It corresponds to the contents of a whole @keyframes at-rule. It implements the CSSRule interface with a type value of 7 (CSSRule.KEYFRAMES_RULE).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSKeyframesRule">CSSKeyframesRule - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSKeyframesRule"
)
public class CSSKeyframesRule extends CSSRule {
  @Nonnull
  public String name;

  protected CSSKeyframesRule() {
  }

  @JsProperty(
      name = "cssRules"
  )
  @Nonnull
  public native CSSRuleList cssRules();

  public native void appendRule(@Nonnull String rule);

  public native void deleteRule(@Nonnull String select);

  @Nullable
  public native CSSKeyframeRule findRule(@Nonnull String select);
}
