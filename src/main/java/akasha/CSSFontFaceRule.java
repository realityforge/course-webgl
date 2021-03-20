package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSFontFaceRule interface represents an @font-face at-rule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSFontFaceRule">CSSFontFaceRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-fonts-4/#om-fontface">CSSFontFaceRule - CSS Fonts Module Level 4</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSFontFaceRule">CSSFontFaceRule - Document Object Model (DOM) Level 2 Style Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSFontFaceRule"
)
public class CSSFontFaceRule extends CSSRule {
  protected CSSFontFaceRule() {
  }

  @JsProperty(
      name = "style"
  )
  @Nonnull
  public native CSSStyleDeclaration style();
}
