package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLHRElement interface provides special properties (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating hr elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHRElement">HTMLHRElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlhrelement">The definition of 'HTMLHRElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/grouping-content.html#the-hr-element">The definition of 'HTMLHRElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-68228811">The definition of 'HTMLHRElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-68228811">The definition of 'HTMLHRElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLHRElement"
)
public class HTMLHRElement extends HTMLElement {
  @Nonnull
  public String align;

  @Nonnull
  public String color;

  public boolean noShade;

  @Nonnull
  public String size;

  @Nonnull
  public String width;

  protected HTMLHRElement() {
  }
}
