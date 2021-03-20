package akasha;

import akasha.core.ArrayBuffer;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Blob object represents a blob, which is a file-like object of immutable, raw data; they can be read as text or binary data, or converted into a ReadableStream so its methods can be used for processing the data.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob">Blob - MDN</a>
 * @see <a href="https://w3c.github.io/FileAPI/#blob-section">The Blob interface - File API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Blob"
)
public class Blob {
  /**
   * The Blob() constructor returns a new Blob object. The content of the blob consists of the concatenation of the values given in the parameter array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/Blob">Blob.Blob - MDN</a>
   */
  public Blob(@Nonnull final JsArray<BlobPart> blobParts, @Nonnull final BlobPropertyBag options) {
  }

  /**
   * The Blob() constructor returns a new Blob object. The content of the blob consists of the concatenation of the values given in the parameter array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/Blob">Blob.Blob - MDN</a>
   */
  public Blob(@Nonnull final BlobPart[] blobParts, @Nonnull final BlobPropertyBag options) {
  }

  /**
   * The Blob() constructor returns a new Blob object. The content of the blob consists of the concatenation of the values given in the parameter array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/Blob">Blob.Blob - MDN</a>
   */
  public Blob(@Nonnull final JsArray<BlobPart> blobParts) {
  }

  /**
   * The Blob() constructor returns a new Blob object. The content of the blob consists of the concatenation of the values given in the parameter array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/Blob">Blob.Blob - MDN</a>
   */
  public Blob(@Nonnull final BlobPart[] blobParts) {
  }

  /**
   * The Blob() constructor returns a new Blob object. The content of the blob consists of the concatenation of the values given in the parameter array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/Blob">Blob.Blob - MDN</a>
   */
  public Blob() {
  }

  /**
   * The Blob interface's size property returns the size of the Blob or File in bytes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/size">Blob.size - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#dfn-size">Blob.size - File API</a>
   */
  @JsProperty(
      name = "size"
  )
  public native int size();

  /**
   * The type property of a Blob object returns the MIME type of the file.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/type">Blob.type - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#dfn-type">Blob.type - File API</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  /**
   * The arrayBuffer() method in the Blob interface returns a Promise that resolves with the contents of the blob as binary data contained in an ArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/arrayBuffer">Blob.arrayBuffer - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#dom-blob-arraybuffer">Blob.arrayBuffer() - File API</a>
   */
  @Nonnull
  public native Promise<ArrayBuffer> arrayBuffer();

  /**
   * The Blob interface's slice() method creates and returns a new Blob object which contains data from a subset of the blob on which it's called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/slice">Blob.slice - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#dfn-slice">Blob.slice() - File API</a>
   */
  @Nonnull
  public native Blob slice(int start, int end, @Nonnull String contentType);

  /**
   * The Blob interface's slice() method creates and returns a new Blob object which contains data from a subset of the blob on which it's called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/slice">Blob.slice - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#dfn-slice">Blob.slice() - File API</a>
   */
  @Nonnull
  public native Blob slice(int start, int end);

  /**
   * The Blob interface's slice() method creates and returns a new Blob object which contains data from a subset of the blob on which it's called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/slice">Blob.slice - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#dfn-slice">Blob.slice() - File API</a>
   */
  @Nonnull
  public native Blob slice(int start);

  /**
   * The Blob interface's slice() method creates and returns a new Blob object which contains data from a subset of the blob on which it's called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/slice">Blob.slice - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#dfn-slice">Blob.slice() - File API</a>
   */
  @Nonnull
  public native Blob slice();

  /**
   * The Blob interface's stream() method returns a ReadableStream which upon reading returns the data contained within the Blob.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/stream">Blob.stream - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#dom-blob-stream">Blob.stream() - File API</a>
   */
  @Nonnull
  public native ReadableStream stream();

  /**
   * The text() method in the Blob interface returns a Promise that resolves with a string containing the contents of the blob, interpreted as UTF-8.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob/text">Blob.text - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#dom-blob-text">Blob.text() - File API</a>
   */
  @Nonnull
  public native Promise<String> text();
}
