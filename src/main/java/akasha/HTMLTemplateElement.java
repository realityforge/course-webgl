package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLTemplateElement interface enables access to the contents of an HTML &lt;template&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTemplateElement">HTMLTemplateElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#htmltemplateelement">HTMLTemplateElement interface - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#htmltemplateelement">HTMLTemplateElement interface - HTML5</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTemplateElement"
)
public class HTMLTemplateElement extends HTMLElement {
  protected HTMLTemplateElement() {
  }

  /**
   * The HTMLTemplateElement.content property returns a template element's template contents (a DocumentFragment).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTemplateElement/content">HTMLTemplateElement.content - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-template-content">HTMLTemplateElement interface - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#dom-template-content">HTMLTemplateElement interface - HTML5</a>
   */
  @JsProperty(
      name = "content"
  )
  @Nonnull
  public native DocumentFragment content();
}
