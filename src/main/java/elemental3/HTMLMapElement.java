package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLMapElement interface provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of map elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMapElement">HTMLMapElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlmapelement">HTMLMapElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#the-map-element">HTMLMapElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-94109203">HTMLAreaElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-94109203">HTMLAreaElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLMapElement"
)
public class HTMLMapElement extends HTMLElement {
  @Nonnull
  public String name;

  protected HTMLMapElement() {
  }

  @JsProperty(
      name = "areas"
  )
  @Nonnull
  public native HTMLCollection areas();
}
