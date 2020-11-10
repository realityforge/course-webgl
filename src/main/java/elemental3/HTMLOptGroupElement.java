package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLOptGroupElement interface provides special properties and methods (beyond the regular HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of optgroup elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLOptGroupElement">HTMLOptGroupElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmloptgroupelement">The definition of 'HTMLOptgroupElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-optgroup-element">The definition of 'HTMLOptGroupElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-ID-38450247">The definition of 'HTMLOptGroupElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-38450247">The definition of 'HTMLOptGroupElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
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
