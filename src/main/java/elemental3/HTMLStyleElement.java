package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLStyleElement interface represents a style element. It inherits properties and methods from its parent, HTMLElement, and from LinkStyle.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLStyleElement">HTMLStyleElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlstyleelement">The definition of 'HTMLStyleElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/document-metadata.html#the-style-element">The definition of 'HTMLStyleElement' in the 'HTML 5.1' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/document-metadata.html#the-style-element">The definition of 'HTMLStyleElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-16428977">The definition of 'HTMLStyleElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-16428977">The definition of 'HTMLStyleElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLStyleElement"
)
public class HTMLStyleElement extends HTMLElement {
  /**
   * The HTMLStyleElement.media property specifies the intended destination medium for style information.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLStyleElement/media">HTMLStyleElement.media - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#attr-style-media">The definition of 'HTMLStyleElement' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/semantics.html#attr-style-media">The definition of 'HTMLStyleElement' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/semantics.html#attr-style-media">The definition of 'HTMLStyleElement' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-16428977">The definition of 'HTMLStyleElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-16428977">The definition of 'HTMLStyleElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @Nonnull
  public String media;

  /**
   * The HTMLStyleElement.type read-only property returns the type of the current style.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLStyleElement/type">HTMLStyleElement.type - MDN</a>
   */
  @Nonnull
  public String type;

  protected HTMLStyleElement() {
  }

  @JsProperty(
      name = "sheet"
  )
  @Nullable
  public native CSSStyleSheet sheet();
}
