package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DataTransferItem object represents one drag data item. During a drag operation, each drag event has a dataTransfer property which contains a list of drag data items. Each item in the list is a DataTransferItem object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransferItem">DataTransferItem - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#datatransferitem">DataTransferItem - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/editing.html#datatransferitem">DataTransferItem - HTML 5.1</a>
 * @see <a href="https://wicg.github.io/entries-api/#dom-datatransferitem-webkitgetasentry">DataTransferItem.webkitGetAsEntry() - File and Directory Entries API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DataTransferItem"
)
public class DataTransferItem {
  protected DataTransferItem() {
  }

  /**
   * The read-only DataTransferItem.kind property returns a DataTransferItem representing the drag data item kind: some text or some file.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransferItem/kind">DataTransferItem.kind - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransferitem-kind">kind - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransferitem-kind">kind - HTML 5.1</a>
   */
  @JsProperty(
      name = "kind"
  )
  @Nonnull
  public native String kind();

  /**
   * The read-only DataTransferItem.type property returns the type (format) of the DataTransferItem object representing the drag data item. The type is a Unicode string generally given by a MIME type, although a MIME type is not required.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransferItem/type">DataTransferItem.type - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransferitem-type">type - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransferitem-type">type - HTML 5.1</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  /**
   * If the item is a file, the DataTransferItem.getAsFile() method returns the drag data item's File object. If the item is not a file, this method returns null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransferItem/getAsFile">DataTransferItem.getAsFile - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransferitem-getasfile">getAsFile() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransferitem-getasfile">getAsFile() - HTML 5.1</a>
   */
  @Nullable
  public native File getAsFile();

  /**
   * The DataTransferItem.getAsString() method invokes the given callback with the drag data item's string data as the argument if the item's kind is a Plain unicode string (i.e. kind is string).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransferItem/getAsString">DataTransferItem.getAsString - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-datatransferitem-getasstring">getAsString() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-datatransferitem-getasstring">getAsString() - HTML 5.1</a>
   */
  public native void getAsString(@Nullable FunctionStringCallback _callback);
}
