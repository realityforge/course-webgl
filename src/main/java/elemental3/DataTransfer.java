package elemental3;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DataTransfer object is used to hold the data that is being dragged during a drag and drop operation. It may hold one or more data items, each of one or more data types. For more information about drag and drop, see HTML Drag and Drop API.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer">DataTransfer - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#datatransfer">The definition of 'DataTransfer' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/editing.html#the-datatransfer-interface">The definition of 'DataTransfer' in the 'HTML 5.1' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DataTransfer"
)
public class DataTransfer {
  /**
   * The DataTransfer.dropEffect property controls the feedback (typically visual) the user is given during a drag and drop operation. It will affect which cursor is displayed while dragging. For example, when the user hovers over a target drop element, the browser's cursor may indicate which type of operation will occur.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer/dropEffect">DataTransfer.dropEffect - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransfer-dropeffect">The definition of 'dropEffect' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransfer-dropeffect">The definition of 'dropEffect' in the 'HTML 5.1' specification.</a>
   */
  @Nonnull
  public String dropEffect;

  /**
   * The DataTransfer.effectAllowed property specifies the effect that is allowed for a drag operation. The copy operation is used to indicate that the data being dragged will be copied from its present location to the drop location. The move operation is used to indicate that the data being dragged will be moved, and the link operation is used to indicate that some form of relationship or connection will be created between the source and drop locations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer/effectAllowed">DataTransfer.effectAllowed - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransfer-effectallowed">The definition of 'effectAllowed' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransfer-effectallowed">The definition of 'effectAllowed' in the 'HTML 5.1' specification.</a>
   */
  @Nonnull
  public String effectAllowed;

  /**
   * The DataTransfer constructor creates a new DataTransfer object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer/DataTransfer">DataTransfer.DataTransfer - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-datatransfer">The definition of 'the DataTransfer() constructor' in the 'HTML Living Standard' specification.</a>
   */
  public DataTransfer() {
  }

  /**
   * The DataTransfer.files property is a list of the files in the drag operation. If the operation includes no files, the list is empty.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer/files">DataTransfer.files - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransfer-files">The definition of 'files' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransfer-files">The definition of 'files' in the 'HTML 5.1' specification.</a>
   */
  @JsProperty(
      name = "files"
  )
  @Nonnull
  public native FileList files();

  /**
   * The read-only DataTransfer property items property is a list of the data transfer items in a drag operation. The list includes one item for each item in the operation and if the operation had no items, the list is empty.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer/items">DataTransfer.items - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransfer-items">The definition of 'items' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransfer-items">The definition of 'items' in the 'HTML 5.1' specification.</a>
   */
  @JsProperty(
      name = "items"
  )
  @Nonnull
  public native DataTransferItemList items();

  /**
   * The DataTransfer.types read-only property returns an array of the drag data formats (as strings) that were set in the dragstart event. The order of the formats is the same order as the data included in the drag operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer/types">DataTransfer.types - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransfer-types">The definition of 'types' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransfer-types">The definition of 'types' in the 'HTML 5.1' specification.</a>
   */
  @JsProperty(
      name = "types"
  )
  @Nonnull
  public native JsArray<String> types();

  /**
   * The DataTransfer.clearData() method removes the drag operation's drag data for the given type. If data for the given type does not exist, this method does nothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer/clearData">DataTransfer.clearData - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransfer-cleardata">The definition of 'DataTransfer.clearData()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransfer-cleardata">The definition of 'DataTransfer.clearData()' in the 'HTML 5.1' specification.</a>
   */
  public native void clearData(@Nonnull String format);

  /**
   * The DataTransfer.clearData() method removes the drag operation's drag data for the given type. If data for the given type does not exist, this method does nothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer/clearData">DataTransfer.clearData - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransfer-cleardata">The definition of 'DataTransfer.clearData()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransfer-cleardata">The definition of 'DataTransfer.clearData()' in the 'HTML 5.1' specification.</a>
   */
  public native void clearData();

  /**
   * The DataTransfer.getData() method retrieves drag data (as a DOMString) for the specified type. If the drag operation does not include data, this method returns an empty string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer/getData">DataTransfer.getData - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransfer-getdata">The definition of 'getData()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransfer-getdata">The definition of 'getData()' in the 'HTML 5.1' specification.</a>
   */
  @Nonnull
  public native String getData(@Nonnull String format);

  /**
   * The DataTransfer.setData() method sets the drag operation's drag data to the specified data and type. If data for the given type does not exist, it is added at the end of the drag data store, such that the last item in the types list will be the new type. If data for the given type already exists, the existing data is replaced in the same position. That is, the order of the types list is not changed when replacing data of the same type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer/setData">DataTransfer.setData - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransfer-setdata">The definition of 'setData()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransfer-setdata">The definition of 'setData()' in the 'HTML 5.1' specification.</a>
   */
  public native void setData(@Nonnull String format, @Nonnull String data);

  /**
   * When a drag occurs, a translucent image is generated from the drag target (the element the dragstart event is fired at), and follows the mouse pointer during the drag. This image is created automatically, so you do not need to create it yourself. However, if a custom image is desired, the DataTransfer.setDragImage() method can be used to set the custom image to be used. The image will typically be an image element but it can also be a canvas or any other visible element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer/setDragImage">DataTransfer.setDragImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransfer-setdragimage">The definition of 'setDragImage()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransfer-setdragimage">The definition of 'setDragImage()' in the 'HTML 5.1' specification.</a>
   */
  public native void setDragImage(@Nonnull Element image, int x, int y);
}
