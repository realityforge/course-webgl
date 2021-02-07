package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLOptGroupElement interface provides special properties and methods (beyond the regular HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of &lt;optgroup&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLOptGroupElement">HTMLOptGroupElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmloptgroupelement">HTMLOptgroupElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-optgroup-element">HTMLOptGroupElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-ID-38450247">HTMLOptGroupElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-38450247">HTMLOptGroupElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLOptGroupElement"
)
public class HTMLOptGroupElement extends HTMLElement {
  public boolean disabled;

  @Nonnull
  public String label;

  protected HTMLOptGroupElement() {
  }
}
