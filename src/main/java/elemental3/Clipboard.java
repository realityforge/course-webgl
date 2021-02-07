package elemental3;

import elemental3.core.JsArray;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Clipboard interface implements the Clipboard API, providing&mdash;if the user grants permission&mdash;both read and write access to the contents of the system clipboard.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Clipboard">Clipboard - MDN</a>
 * @see <a href="https://w3c.github.io/clipboard-apis/#clipboard-interface">Clipboard - Clipboard API and events</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Clipboard"
)
public class Clipboard extends EventTarget {
  protected Clipboard() {
  }

  /**
   * The read() method of the Clipboard interface requests a copy of the clipboard's contents, delivering the data to the returned Promise when the promise is resolved. Unlike readText(), the read() method can return arbitrary data, such as images. This method can also return text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Clipboard/read">Clipboard.read - MDN</a>
   * @see <a href="https://w3c.github.io/clipboard-apis/#dom-clipboard-read">read() - Clipboard API and events</a>
   */
  @Nonnull
  public native Promise<JsArray<ClipboardItem>> read();

  /**
   * The Clipboard interface's readText() method returns a Promise which resolves with a copy of the textual contents of the system clipboard.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Clipboard/readText">Clipboard.readText - MDN</a>
   * @see <a href="https://w3c.github.io/clipboard-apis/#dom-clipboard-readtext">readText() - Clipboard API and events</a>
   */
  @Nonnull
  public native Promise<String> readText();

  /**
   * The Clipboard method write() writes arbitrary data, such as images, to the clipboard.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Clipboard/write">Clipboard.write - MDN</a>
   * @see <a href="https://w3c.github.io/clipboard-apis/#dom-clipboard-write">write() - Clipboard API and events</a>
   */
  @Nonnull
  public native Promise<Void> write(@Nonnull JsArray<ClipboardItem> data);

  /**
   * The Clipboard method write() writes arbitrary data, such as images, to the clipboard.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Clipboard/write">Clipboard.write - MDN</a>
   * @see <a href="https://w3c.github.io/clipboard-apis/#dom-clipboard-write">write() - Clipboard API and events</a>
   */
  @Nonnull
  public native Promise<Void> write(@Nonnull ClipboardItem[] data);

  /**
   * The Clipboard interface's writeText() property writes the specified text string to the system clipboard. Text may be read back using either read() or readText().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Clipboard/writeText">Clipboard.writeText - MDN</a>
   * @see <a href="https://w3c.github.io/clipboard-apis/#dom-clipboard-writetext">writeText() - Clipboard API and events</a>
   */
  @Nonnull
  public native Promise<Void> writeText(@Nonnull String data);
}
