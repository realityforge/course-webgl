package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLTableRowElement interface provides special properties and methods (beyond the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of rows in an HTML table.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement">HTMLTableRowElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmltablerowelement">The definition of 'HTMLTableRowElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/tabular-data.html#the-tr-element">The definition of 'HTMLTableRowElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-6986576">The definition of 'HTMLTableRowElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-6986576">The definition of 'HTMLTableRowElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableRowElement"
)
public class HTMLTableRowElement extends HTMLElement {
  @Nonnull
  public String align;

  @Nonnull
  public String bgColor;

  @Nonnull
  public String ch;

  @Nonnull
  public String chOff;

  @Nonnull
  public String vAlign;

  protected HTMLTableRowElement() {
  }

  @JsProperty(
      name = "cells"
  )
  @Nonnull
  public native HTMLCollection cells();

  /**
   * The HTMLTableRowElement.rowIndex read-only property represents the position of a row in relation to the whole table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement/rowIndex">HTMLTableRowElement.rowIndex - MDN</a>
   */
  @JsProperty(
      name = "rowIndex"
  )
  public native int rowIndex();

  @JsProperty(
      name = "sectionRowIndex"
  )
  public native int sectionRowIndex();

  public native void deleteCell(int index);

  /**
   * The HTMLTableRowElement.insertCell() method inserts a new cell (td) into a table row (tr) and returns a reference to the cell.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement/insertCell">HTMLTableRowElement.insertCell - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#dom-tr-insertcell">The definition of 'HTMLTableRowElement.insertCell()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-68927016">The definition of 'HTMLTableRowElement.insertCell()' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   */
  @Nonnull
  public native HTMLTableCellElement insertCell(int index);

  /**
   * The HTMLTableRowElement.insertCell() method inserts a new cell (td) into a table row (tr) and returns a reference to the cell.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement/insertCell">HTMLTableRowElement.insertCell - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#dom-tr-insertcell">The definition of 'HTMLTableRowElement.insertCell()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-68927016">The definition of 'HTMLTableRowElement.insertCell()' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   */
  @Nonnull
  public native HTMLTableCellElement insertCell();
}
