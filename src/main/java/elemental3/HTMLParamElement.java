package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLParamElement interface provides special properties (beyond those of the regular HTMLElement object interface it inherits) for manipulating &lt;param&gt; elements, representing a pair of a key and a value that acts as a parameter for an &lt;object&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLParamElement">HTMLParamElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlparamelement">HTMLParamElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#the-param-element">HTMLParamElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-64077273">HTMLParamElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-64077273">HTMLParamElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLParamElement"
)
public class HTMLParamElement extends HTMLElement {
  @Nonnull
  public String name;

  @Nonnull
  public String type;

  @Nonnull
  public String value;

  @Nonnull
  public String valueType;

  protected HTMLParamElement() {
  }
}
