package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSStyleSheet interface represents a single CSS stylesheet, and lets you inspect and modify the list of rules contained in the stylesheet.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleSheet">CSSStyleSheet - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom/#cssstylesheet">CSSStyleSheet - CSS Object Model (CSSOM)</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSStyleSheet">CSSStyleSheet - Document Object Model (DOM) Level 2 Style Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSStyleSheet"
)
public class CSSStyleSheet extends StyleSheet {
  protected CSSStyleSheet() {
  }

  /**
   * The read-only CSSStyleSheet property cssRules returns a live CSSRuleList which provides a real-time, up-to-date list of every CSS rule which comprises the stylesheet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleSheet/cssRules">CSSStyleSheet.cssRules - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssstylesheet-cssrules">CSSStyleSheet.cssRules - CSS Object Model (CSSOM)</a>
   */
  @JsProperty(
      name = "cssRules"
  )
  @Nonnull
  public native CSSRuleList cssRules();

  /**
   * The read-only CSSStyleSheet property ownerRule returns the CSSImportRule corresponding to the @import at-rule which imported the stylesheet into the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleSheet/ownerRule">CSSStyleSheet.ownerRule - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssstylesheet-ownerrule">CSSStyleSheet.ownerRule - CSS Object Model (CSSOM)</a>
   */
  @JsProperty(
      name = "ownerRule"
  )
  @Nullable
  public native CSSRule ownerRule();

  @JsProperty(
      name = "rules"
  )
  @Nonnull
  public native CSSRuleList rules();

  /**
   * The CSSStyleSheet method deleteRule() removes a rule from the stylesheet object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleSheet/deleteRule">CSSStyleSheet.deleteRule - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssstylesheet-deleterule">CSSStyleSheet.deleteRule() - CSS Object Model (CSSOM)</a>
   */
  public native void deleteRule(int index);

  /**
   * The CSSStyleSheet.insertRule() method inserts a new CSS rule into the current style sheet, with some restrictions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleSheet/insertRule">CSSStyleSheet.insertRule - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssstylesheet-insertrule">CSSStyleSheet.insertRule - CSS Object Model (CSSOM)</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSStyleSheet-insertRule">CSSStyleSheet.insertRule - Document Object Model (DOM) Level 2 Style Specification</a>
   */
  public native int insertRule(@Nonnull String rule, int index);

  /**
   * The CSSStyleSheet.insertRule() method inserts a new CSS rule into the current style sheet, with some restrictions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleSheet/insertRule">CSSStyleSheet.insertRule - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssstylesheet-insertrule">CSSStyleSheet.insertRule - CSS Object Model (CSSOM)</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSStyleSheet-insertRule">CSSStyleSheet.insertRule - Document Object Model (DOM) Level 2 Style Specification</a>
   */
  public native int insertRule(@Nonnull String rule);

  public native int addRule(@Nonnull String selector, @Nonnull String style, int index);

  public native int addRule(@Nonnull String selector, @Nonnull String style);

  public native int addRule(@Nonnull String selector);

  public native int addRule();

  public native void removeRule(int index);

  public native void removeRule();
}
