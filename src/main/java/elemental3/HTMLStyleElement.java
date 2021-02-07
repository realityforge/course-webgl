package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLStyleElement interface represents a &lt;style&gt; element. It inherits properties and methods from its parent, HTMLElement, and from LinkStyle.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLStyleElement">HTMLStyleElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlstyleelement">HTMLStyleElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/document-metadata.html#the-style-element">HTMLStyleElement - HTML 5.1</a>
 * @see <a href="https://www.w3.org/TR/html52/document-metadata.html#the-style-element">HTMLStyleElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-16428977">HTMLStyleElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-16428977">HTMLStyleElement - Document Object Model (DOM) Level 1 Specification</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#attr-style-media">HTMLStyleElement - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/semantics.html#attr-style-media">HTMLStyleElement - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/semantics.html#attr-style-media">HTMLStyleElement - HTML5</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-16428977">HTMLStyleElement - Document Object Model (DOM) Level 2 HTML Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-16428977">HTMLStyleElement - Document Object Model (DOM) Level 1 Specification</a>
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
