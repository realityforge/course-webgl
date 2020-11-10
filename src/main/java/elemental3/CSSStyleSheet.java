package elemental3;

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
 * @see <a href="https://drafts.csswg.org/cssom/#cssstylesheet">The definition of 'CSSStyleSheet' in the 'CSS Object Model (CSSOM)' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSStyleSheet">The definition of 'CSSStyleSheet' in the 'Document Object Model (DOM) Level 2 Style Specification' specification.</a>
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
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssstylesheet-cssrules">The definition of 'CSSStyleSheet.cssRules' in the 'CSS Object Model (CSSOM)' specification.</a>
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
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssstylesheet-ownerrule">The definition of 'CSSStyleSheet.ownerRule' in the 'CSS Object Model (CSSOM)' specification.</a>
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
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssstylesheet-deleterule">The definition of 'CSSStyleSheet.deleteRule()' in the 'CSS Object Model (CSSOM)' specification.</a>
   */
  public native void deleteRule(int index);

  /**
   * The CSSStyleSheet.insertRule() method inserts a new CSS rule into the current style sheet, with some restrictions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleSheet/insertRule">CSSStyleSheet.insertRule - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssstylesheet-insertrule">The definition of 'CSSStyleSheet.insertRule' in the 'CSS Object Model (CSSOM)' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSStyleSheet-insertRule">The definition of 'CSSStyleSheet.insertRule' in the 'Document Object Model (DOM) Level 2 Style Specification' specification.</a>
   */
  public native int insertRule(@Nonnull String rule, int index);

  /**
   * The CSSStyleSheet.insertRule() method inserts a new CSS rule into the current style sheet, with some restrictions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleSheet/insertRule">CSSStyleSheet.insertRule - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-cssstylesheet-insertrule">The definition of 'CSSStyleSheet.insertRule' in the 'CSS Object Model (CSSOM)' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSStyleSheet-insertRule">The definition of 'CSSStyleSheet.insertRule' in the 'Document Object Model (DOM) Level 2 Style Specification' specification.</a>
   */
  public native int insertRule(@Nonnull String rule);

  public native int addRule(@Nonnull String selector, @Nonnull String style, int index);

  public native int addRule(@Nonnull String selector, @Nonnull String style);

  public native int addRule(@Nonnull String selector);

  public native int addRule();

  public native void removeRule(int index);

  public native void removeRule();
}
