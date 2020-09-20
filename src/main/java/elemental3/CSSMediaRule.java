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
