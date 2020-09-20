package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLTemplateElement interface enables access to the contents of an HTML template element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTemplateElement">HTMLTemplateElement - MDN</a>
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
   */
  @JsProperty(
      name = "content"
  )
  @Nonnull
  public native DocumentFragment content();
}
