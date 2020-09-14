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
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableElement"
)
public class HTMLTableElement extends HTMLElement {
  @Nonnull
  public String align;

  @Nonnull
  public String bgColor;

  @Nonnull
  public String border;

  /**
   * The HTMLTableElement.caption property represents the table caption. If no caption element is associated with the table, this property is null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/caption">HTMLTableElement.caption - MDN</a>
   */
  @Nullable
  public HTMLTableCaptionElement caption;

  @Nonnull
  public String cellPadding;

  @Nonnull
  public String cellSpacing;

  @Nonnull
  public String frame;

  @Nonnull
  public String rules;

  @Nonnull
  public String summary;

  /**
   * The HTMLTableElement.tFoot property represents the tfoot element of a table. Its value will be null if there is no such element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/tFoot">HTMLTableElement.tFoot - MDN</a>
   */
  @Nullable
  public HTMLTableSectionElement tFoot;

  /**
   * The HTMLTableElement.tHead represents the thead element of a table. Its value will be null if there is no such element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/tHead">HTMLTableElement.tHead - MDN</a>
   */
  @Nullable
  public HTMLTableSectionElement tHead;

  @Nonnull
  public String width;

  public HTMLTableElement() {
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
   */
  @Nonnull
  public native HTMLTableRowElement insertRow(int index);

  /**
   * The HTMLTableElement.insertRow() method inserts a new row (tr) in a given table, and returns a reference to the new row.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableElement/insertRow">HTMLTableElement.insertRow - MDN</a>
   */
  @Nonnull
  public native HTMLTableRowElement insertRow();
}
