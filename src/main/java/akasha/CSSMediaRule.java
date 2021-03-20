package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSMediaRule interface represents a single CSS @media rule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSMediaRule">CSSMediaRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-conditional-3/#the-cssmediarule-interface">CSSMediaRule - CSS Conditional Rules Module Level 3</a>
 * @see <a href="https://drafts.csswg.org/cssom/#the-cssmediarule-interface">CSSMediaRule - CSS Object Model (CSSOM)</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSMediaRule">CSSMediaRule - Document Object Model (DOM) Level 2 Style Specification</a>
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
