package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLModElement interface provides special properties (beyond the regular methods and properties available through the HTMLElement interface they also have available to them by inheritance) for manipulating modification elements, that is &lt;del&gt; and &lt;ins&gt;.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLModElement">HTMLModElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/edits.html#htmlmodelement">HTMLAnchorElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/edits.html#htmlmodelement">HTMLAnchorElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-79359609">HTMLModElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-79359609">HTMLModElement - Document Object Model (DOM) Level 1 Specification</a>
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
