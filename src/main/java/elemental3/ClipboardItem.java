package elemental3;

import elemental3.core.JsArray;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

/**
 * The ClipboardItem interface of the Clipboard API represents a single item format, used when reading or writing data via the Clipboard API. That is clipboard.read() and clipboard.write() respectively.The ClipboardItem interface of the Clipboard API represents a single item format, used when reading or writing data via the Clipboard API. That is clipboard.read() and clipboard.write() respectively.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ClipboardItem">ClipboardItem - MDN</a>
 * @see <a href="https://w3c.github.io/clipboard-apis/#clipboarditem">ClipboardItem - Clipboard API and events</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ClipboardItem"
)
public class ClipboardItem {
  public ClipboardItem(@Nonnull final JsPropertyMap<Promise<ClipboardItemDataType>> items,
      @Nonnull final ClipboardItemOptions options) {
  }

  public ClipboardItem(@Nonnull final JsPropertyMap<Promise<ClipboardItemDataType>> items) {
  }

  @JsProperty(
      name = "delayed"
  )
  public native boolean delayed();

  @JsProperty(
      name = "lastModified"
  )
  public native int lastModified();

  @JsProperty(
      name = "presentationStyle"
  )
  @Nonnull
  @PresentationStyle
  public native String presentationStyle();

  /**
   * The read-only types property of the ClipboardItem interface returns an Array of MIME types available within the ClipboardItem
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ClipboardItem/types">ClipboardItem.types - MDN</a>
   * @see <a href="https://w3c.github.io/clipboard-apis/#clipboarditem">ClipboardItem - Clipboard API and events</a>
   */
  @JsProperty(
      name = "types"
  )
  @Nonnull
  public native JsArray<String> types();

  @Nonnull
  public static native ClipboardItem createDelayed(
      @Nonnull JsPropertyMap<ClipboardItemDelayedCallback> items,
      @Nonnull ClipboardItemOptions options);

  @Nonnull
  public static native ClipboardItem createDelayed(
      @Nonnull JsPropertyMap<ClipboardItemDelayedCallback> items);

  /**
   * The getType() method of the ClipboardItem interface returns a Promise that resolves with a Blob of the requested  MIME type or an error if the MIME type is not found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ClipboardItem/getType">ClipboardItem.getType - MDN</a>
   * @see <a href="https://w3c.github.io/clipboard-apis/#clipboarditem">ClipboardItem - Clipboard API and events</a>
   */
  @Nonnull
  public native Promise<Blob> getType(@Nonnull String type);
}
