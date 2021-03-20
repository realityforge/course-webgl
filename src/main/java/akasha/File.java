package akasha;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The File interface provides information about files and allows JavaScript in a web page to access their content.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/File">File - MDN</a>
 * @see <a href="https://w3c.github.io/FileAPI/#file-section">The File interface - File API</a>
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
   * @see <a href="https://w3c.github.io/FileAPI/">File API</a>
   */
  public File(@Nonnull final JsArray<BlobPart> fileBits, @Nonnull final String fileName,
      @Nonnull final FilePropertyBag options) {
  }

  /**
   * The File() constructor creates a new File object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/File/File">File.File - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/">File API</a>
   */
  public File(@Nonnull final BlobPart[] fileBits, @Nonnull final String fileName,
      @Nonnull final FilePropertyBag options) {
  }

  /**
   * The File() constructor creates a new File object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/File/File">File.File - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/">File API</a>
   */
  public File(@Nonnull final JsArray<BlobPart> fileBits, @Nonnull final String fileName) {
  }

  /**
   * The File() constructor creates a new File object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/File/File">File.File - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/">File API</a>
   */
  public File(@Nonnull final BlobPart[] fileBits, @Nonnull final String fileName) {
  }

  /**
   * The File.lastModified read-only property provides the last modified date of the file as the number of milliseconds since the Unix epoch (January 1, 1970 at midnight). Files without a known last modified date return the current date.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/File/lastModified">File.lastModified - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#file-attrs">lastModified - File API</a>
   */
  @JsProperty(
      name = "lastModified"
  )
  public native int lastModified();

  /**
   * Returns the name of the file represented by a File object. For security reasons, the path is excluded from this property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/File/name">File.name - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#file-attrs">name - File API</a>
   */
  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();
}
