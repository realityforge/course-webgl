package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSKeyframeRule interface describes an object representing a set of style for a given keyframe. It corresponds to the contains of a single keyframe of a @keyframes at-rule. It implements the CSSRule interface with a type value of 8 (CSSRule.KEYFRAME_RULE).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSKeyframeRule">CSSKeyframeRule - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSKeyframeRule"
)
public class CSSKeyframeRule extends CSSRule {
  @Nonnull
  public String keyText;

  protected CSSKeyframeRule() {
  }

  @JsProperty(
      name = "style"
  )
  @Nonnull
  public native CSSStyleDeclaration style();
}
