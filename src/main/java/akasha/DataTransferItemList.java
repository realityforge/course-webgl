package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * The DataTransferItemList object is a list of DataTransferItem objects representing items being dragged. During a drag operation, each DragEvent has a dataTransfer property and that property is a DataTransferItemList.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransferItemList">DataTransferItemList - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#datatransferitemlist">DataTransferItemList - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/editing.html#datatransferitemlist">DataTransferItemList - HTML 5.1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DataTransferItemList"
)
public class DataTransferItemList {
  protected DataTransferItemList() {
  }

  /**
   * The read-only length property of the DataTransferItemList interface returns the number of items currently in the drag item list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransferItemList/length">DataTransferItemList.length - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransferitemlist-length">length - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransferitemlist-length">length - HTML 5.1</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The DataTransferItemList.add() method creates a new DataTransferItem using the specified data and adds it to the drag data list. The item may be a File or a string of a given type. If the item is successfully added to the list, the newly-created DataTransferItem object is returned.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransferItemList/add">DataTransferItemList.add - MDN</a>
   */
  @Nullable
  public native DataTransferItem add(@Nonnull String data, @Nonnull String type);

  /**
   * The DataTransferItemList.add() method creates a new DataTransferItem using the specified data and adds it to the drag data list. The item may be a File or a string of a given type. If the item is successfully added to the list, the newly-created DataTransferItem object is returned.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransferItemList/add">DataTransferItemList.add - MDN</a>
   */
  @Nullable
  public native DataTransferItem add(@Nonnull File data);

  /**
   * The DataTransferItemList method clear() removes all DataTransferItem objects from the drag data items list, leaving the list empty.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransferItemList/clear">DataTransferItemList.clear - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransferitemlist-clear">clear() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransferitemlist-clear">clear() - HTML 5.1</a>
   */
  public native void clear();

  /**
   * undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransferItemList/remove">DataTransferItemList.remove - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransferitemlist-remove">remove() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransferitemlist-remove">remove() - HTML 5.1</a>
   */
  public native void remove(int index);

  @JsOverlay
  @Nonnull
  public final DataTransferItem getAt(final int index) {
    return Js.<JsArrayLike<DataTransferItem>>cast( this ).getAt( index );
  }
}
