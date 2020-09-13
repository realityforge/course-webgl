package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DataTransfer object is used to hold the data that is being dragged during a drag and drop operation. It may hold one or more data items, each of one or more data types. For more information about drag and drop, see HTML Drag and Drop API.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer">DataTransfer - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DataTransfer"
)
public class DataTransfer {
  @Nonnull
  public String dropEffect;

  @Nonnull
  public String effectAllowed;

  /**
   * The DataTransfer constructor creates a new DataTransfer object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer/DataTransfer">DataTransfer.DataTransfer - MDN</a>
   */
  public DataTransfer() {
  }

  @JsProperty(
      name = "files"
  )
  @Nonnull
  public native FileList files();

  @JsProperty(
      name = "items"
  )
  @Nonnull
  public native DataTransferItemList items();

  @JsProperty(
      name = "types"
  )
  @Nonnull
  public native JsArray<String> types();

  public native void clearData(@Nonnull String format);

  public native void clearData();

  @Nonnull
  public native String getData(@Nonnull String format);

  public native void setData(@Nonnull String format, @Nonnull String data);

  public native void setDragImage(@Nonnull Element image, int x, int y);
}
