package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSRule interface represents a single CSS rule. There are several types of rules, listed in the Type constants section below.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSRule">CSSRule - MDN</a>
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
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssrule-csstext">The definition of 'CSSRule: cssText' in the 'CSS Object Model (CSSOM)' specification.</a>
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
