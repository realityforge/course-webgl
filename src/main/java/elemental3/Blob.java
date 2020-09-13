package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Blob object represents a blob, which is a file-like object of immutable, raw data; they can be read as text or binary data, or converted into a ReadableStream so its methods can be used for processing the data.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Blob">Blob - MDN</a>
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

  @JsProperty(
      name = "size"
  )
  public native int size();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  @Nonnull
  public native Promise<ArrayBuffer> arrayBuffer();

  @Nonnull
  public native Blob slice(int start, int end, @Nonnull String contentType);

  @Nonnull
  public native Blob slice(int start, int end);

  @Nonnull
  public native Blob slice(int start);

  @Nonnull
  public native Blob slice();

  @Nonnull
  public native ReadableStream stream();

  @Nonnull
  public native Promise<String> text();
}
