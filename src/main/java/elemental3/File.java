package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The File interface provides information about files and allows JavaScript in a web page to access their content.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/File">File - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "File"
)
public class File extends Blob {
  /**
   * The File() constructor creates a new File object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/File/File">File.File - MDN</a>
   */
  public File(@Nonnull final JsArray<BlobPart> fileBits, @Nonnull final String fileName,
      @Nonnull final FilePropertyBag options) {
  }

  /**
   * The File() constructor creates a new File object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/File/File">File.File - MDN</a>
   */
  public File(@Nonnull final BlobPart[] fileBits, @Nonnull final String fileName,
      @Nonnull final FilePropertyBag options) {
  }

  /**
   * The File() constructor creates a new File object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/File/File">File.File - MDN</a>
   */
  public File(@Nonnull final JsArray<BlobPart> fileBits, @Nonnull final String fileName) {
  }

  /**
   * The File() constructor creates a new File object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/File/File">File.File - MDN</a>
   */
  public File(@Nonnull final BlobPart[] fileBits, @Nonnull final String fileName) {
  }

  @JsProperty(
      name = "lastModified"
  )
  public native int lastModified();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();
}
