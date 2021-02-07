package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSRule interface represents a single CSS rule. There are several types of rules which inherit properties from CSSRule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSRule">CSSRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom/#css-rules">CSSRule - CSS Object Model (CSSOM)</a>
 * @see <a href="https://drafts.csswg.org/css-animations-1/#interface-cssrule">CSSRule - CSS Animations Level 1</a>
 * @see <a href="https://drafts.csswg.org/css-fonts-4/#om-fontfeaturevalues">CSSRule - CSS Fonts Module Level 4</a>
 * @see <a href="https://drafts.csswg.org/css-counter-styles-3/#extentions-to-cssrule-interface">CSSRule - CSS Counter Styles Level 3</a>
 * @see <a href="https://drafts.csswg.org/css-conditional-3/#extentions-to-cssrule-interface">CSSRule - CSS Conditional Rules Module Level 3</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSRule">CSSRule - Document Object Model (DOM) Level 2 Style Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSRule"
)
public class CSSRule {
  @JsOverlay
  public static final int CHARSET_RULE = 2;

  @JsOverlay
  public static final int COUNTER_STYLE_RULE = 11;

  @JsOverlay
  public static final int FONT_FACE_RULE = 5;

  @JsOverlay
  public static final int FONT_FEATURE_VALUES_RULE = 14;

  @JsOverlay
  public static final int FONT_PALETTE_VALUES_RULE = 15;

  @JsOverlay
  public static final int IMPORT_RULE = 3;

  @JsOverlay
  public static final int KEYFRAMES_RULE = 7;

  @JsOverlay
  public static final int KEYFRAME_RULE = 8;

  @JsOverlay
  public static final int MARGIN_RULE = 9;

  @JsOverlay
  public static final int MEDIA_RULE = 4;

  @JsOverlay
  public static final int NAMESPACE_RULE = 10;

  @JsOverlay
  public static final int PAGE_RULE = 6;

  @JsOverlay
  public static final int STYLE_RULE = 1;

  @JsOverlay
  public static final int SUPPORTS_RULE = 12;

  /**
   * The cssText property of the CSSRule interface returns the actual text of a CSSStyleSheet style-rule.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSRule/cssText">CSSRule.cssText - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssrule-csstext">CSSRule: cssText - CSS Object Model (CSSOM)</a>
   */
  @Nonnull
  public String cssText;

  protected CSSRule() {
  }

  @JsProperty(
      name = "parentRule"
  )
  @Nullable
  public native CSSRule parentRule();

  /**
   * The parentStyleSheet property of the CSSRule interface returns the StyleSheet object in which the current rule is defined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSRule/parentStyleSheet">CSSRule.parentStyleSheet - MDN</a>
   */
  @JsProperty(
      name = "parentStyleSheet"
  )
  @Nullable
  public native CSSStyleSheet parentStyleSheet();

  @JsProperty(
      name = "type"
  )
  @CSSRuleType
  public native int type();
}
