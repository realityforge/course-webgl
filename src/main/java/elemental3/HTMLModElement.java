package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLModElement interface provides special properties (beyond the regular methods and properties available through the HTMLElement interface they also have available to them by inheritance) for manipulating modification elements, that is del and ins.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLModElement">HTMLModElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/edits.html#htmlmodelement">The definition of 'HTMLAnchorElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/edits.html#htmlmodelement">The definition of 'HTMLAnchorElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-79359609">The definition of 'HTMLModElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-79359609">The definition of 'HTMLModElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLModElement"
)
public class HTMLModElement extends HTMLElement {
  @Nonnull
  public String cite;

  @Nonnull
  public String dateTime;

  protected HTMLModElement() {
  }
}
