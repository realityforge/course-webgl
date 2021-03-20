package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLHRElement interface provides special properties (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating &lt;hr&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHRElement">HTMLHRElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlhrelement">HTMLHRElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/grouping-content.html#the-hr-element">HTMLHRElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-68228811">HTMLHRElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-68228811">HTMLHRElement - Document Object Model (DOM) Level 1 Specification</a>
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
