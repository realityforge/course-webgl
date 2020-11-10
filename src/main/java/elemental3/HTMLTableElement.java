package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLTableElement interface provides special properties and methods (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating the layout and presentation of tables in an HTML document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement">HTMLTableElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmltableelement">The definition of 'HTMLTableElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/tabular-data.html#the-table-element">The definition of 'HTMLTableElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-64060425">The definition of 'HTMLTableElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-64060425">The definition of 'HTMLTableElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableElement"
)
public class HTMLTableElement extends HTMLElement {
  /**
   * The HTMLTableElement.align property represents the alignment of the table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/align">HTMLTableElement.align - MDN</a>
   */
  @Nonnull
  public String align;

  /**
   * The HTMLTableElement.bgcolor property represents the background color of the table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/bgColor">HTMLTableElement.bgColor - MDN</a>
   */
  @Nonnull
  public String bgColor;

  /**
   * The HTMLTableElement.border property represents the border width of the table element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/border">HTMLTableElement.border - MDN</a>
   */
  @Nonnull
  public String border;

  /**
   * The HTMLTableElement.caption property represents the table caption. If no caption element is associated with the table, this property is null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/caption">HTMLTableElement.caption - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/tabular-data.html#dom-table-caption">The definition of 'HTMLTableElement.caption' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/tabular-data.html#dom-table-caption">The definition of 'HTMLTableElement.caption' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14594520">The definition of 'HTMLTableElement.caption' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14594520">The definition of 'HTMLTableElement.caption' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @Nullable
  public HTMLTableCaptionElement caption;

  /**
   * The HTMLTableElement.cellPadding property represents the padding around the individual cells of the table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/cellPadding">HTMLTableElement.cellPadding - MDN</a>
   */
  @Nonnull
  public String cellPadding;

  @Nonnull
  public String cellSpacing;

  /**
   * The HTMLTableElement interface's frame property is a string that indicates which of the table's exterior borders should be drawn.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/frame">HTMLTableElement.frame - MDN</a>
   */
  @Nonnull
  public String frame;

  /**
   * The HTMLTableElement.rules property indicates which cell borders to render in the table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/rules">HTMLTableElement.rules - MDN</a>
   */
  @Nonnull
  public String rules;

  /**
   * The HTMLTableElement.summary property represents the table description.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/summary">HTMLTableElement.summary - MDN</a>
   */
  @Nonnull
  public String summary;

  /**
   * The HTMLTableElement.tFoot property represents the tfoot element of a table. Its value will be null if there is no such element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/tFoot">HTMLTableElement.tFoot - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/tabular-data.html#dom-table-tfoot">The definition of 'HTMLTableElement.tFoot' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/tabular-data.html#dom-table-tfoot">The definition of 'HTMLTableElement.tFoot' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-64197097">The definition of 'HTMLTableElement.tFoot' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-64197097">The definition of 'HTMLTableElement.tFoot' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @Nullable
  public HTMLTableSectionElement tFoot;

  /**
   * The HTMLTableElement.tHead represents the thead element of a table. Its value will be null if there is no such element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/tHead">HTMLTableElement.tHead - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/tabular-data.html#dom-table-thead">The definition of 'HTMLTableElement.tHead' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/tabular-data.html#dom-table-thead">The definition of 'HTMLTableElement.tHead' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-9530944">The definition of 'HTMLTableElement.tHead' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-9530944">The definition of 'HTMLTableElement.tHead' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @Nullable
  public HTMLTableSectionElement tHead;

  /**
   * The HTMLTableElement.width property represents the desired width of the table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/width">HTMLTableElement.width - MDN</a>
   */
  @Nonnull
  public String width;

  protected HTMLTableElement() {
  }

  /**
   * The read-only HTMLTableElement property rows returns a live HTMLCollection of all the rows in the table, including the rows contained within any thead, tfoot, and tbody elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/rows">HTMLTableElement.rows - MDN</a>
   */
  @JsProperty(
      name = "rows"
  )
  @Nonnull
  public native HTMLCollection rows();

  /**
   * The HTMLTableElement.tBodies read-only property returns a live HTMLCollection of the bodies in a table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/tBodies">HTMLTableElement.tBodies - MDN</a>
   */
  @JsProperty(
      name = "tBodies"
  )
  @Nonnull
  public native HTMLCollection tBodies();

  /**
   * The HTMLTableElement.createCaption() method returns the caption element associated with a given table. If no caption element exists on the table, this method creates it, and then returns it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/createCaption">HTMLTableElement.createCaption - MDN</a>
   */
  @Nonnull
  public native HTMLTableCaptionElement createCaption();

  @Nonnull
  public native HTMLTableSectionElement createTBody();

  /**
   * The HTMLTableElement.createTFoot() method returns the tfoot element associated with a given table. If no footer exists in the table, this methods creates it, and then returns it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/createTFoot">HTMLTableElement.createTFoot - MDN</a>
   */
  @Nonnull
  public native HTMLTableSectionElement createTFoot();

  /**
   * The HTMLTableElement.createTHead() method returns the thead element associated with a given table. If no header exists in the table, this method creates it, and then returns it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/createTHead">HTMLTableElement.createTHead - MDN</a>
   */
  @Nonnull
  public native HTMLTableSectionElement createTHead();

  /**
   * The HTMLTableElement.deleteCaption() method removes the caption element from a given table. If there is no caption element associated with the table, this method does nothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/deleteCaption">HTMLTableElement.deleteCaption - MDN</a>
   */
  public native void deleteCaption();

  /**
   * The HTMLTableElement.deleteRow() method removes a specific row (tr) from a given table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/deleteRow">HTMLTableElement.deleteRow - MDN</a>
   */
  public native void deleteRow(int index);

  /**
   * The HTMLTableElement.deleteTFoot() method removes the tfoot element from a given table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/deleteTFoot">HTMLTableElement.deleteTFoot - MDN</a>
   */
  public native void deleteTFoot();

  /**
   * The HTMLTableElement.deleteTHead() removes the thead element from a given table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/deleteTHead">HTMLTableElement.deleteTHead - MDN</a>
   */
  public native void deleteTHead();

  /**
   * The HTMLTableElement.insertRow() method inserts a new row (tr) in a given table, and returns a reference to the new row.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/insertRow">HTMLTableElement.insertRow - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#dom-table-insertrow">The definition of 'HTMLTableElement.insertRow()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-93995626">The definition of 'HTMLTableElement.insertRow()' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-39872903">The definition of 'HTMLTableElement.insertRow()' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @Nonnull
  public native HTMLTableRowElement insertRow(int index);

  /**
   * The HTMLTableElement.insertRow() method inserts a new row (tr) in a given table, and returns a reference to the new row.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/insertRow">HTMLTableElement.insertRow - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/tables.html#dom-table-insertrow">The definition of 'HTMLTableElement.insertRow()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-93995626">The definition of 'HTMLTableElement.insertRow()' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-39872903">The definition of 'HTMLTableElement.insertRow()' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @Nonnull
  public native HTMLTableRowElement insertRow();
}
