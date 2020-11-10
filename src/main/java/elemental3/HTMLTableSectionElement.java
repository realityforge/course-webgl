package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLTableSectionElement interface provides special properties and methods (beyond the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of sections, that is headers, footers and bodies, in an HTML table.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableSectionElement">HTMLTableSectionElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/tabular-data.html#htmltablesectionelement">The definition of 'HTMLTableSectionElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/tabular-data.html#htmltablesectionelement">The definition of 'HTMLTableSectionElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-67417573">The definition of 'HTMLTableSectionElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-67417573">The definition of 'HTMLTableSectionElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableSectionElement"
)
public class HTMLTableSectionElement extends HTMLElement {
  @Nonnull
  public String align;

  @Nonnull
  public String ch;

  @Nonnull
  public String chOff;

  @Nonnull
  public String vAlign;

  protected HTMLTableSectionElement() {
  }

  @JsProperty(
      name = "rows"
  )
  @Nonnull
  public native HTMLCollection rows();

  public native void deleteRow(int index);

  @Nonnull
  public native HTMLTableRowElement insertRow(int index);

  @Nonnull
  public native HTMLTableRowElement insertRow();
}
