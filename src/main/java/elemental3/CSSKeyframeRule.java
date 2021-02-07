package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSKeyframeRule interface describes an object representing a set of styles for a given keyframe. It corresponds to the contents of a single keyframe of a @keyframes at-rule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSKeyframeRule">CSSKeyframeRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-animations-1/#interface-csskeyframerule">CSSKeyframeRule - CSS Animations Level 1</a>
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
