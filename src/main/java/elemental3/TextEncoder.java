package elemental3;

import elemental3.core.Uint8Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * TextEncoder takes a stream of code points as input and emits a stream of UTF-8 bytes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextEncoder">TextEncoder - MDN</a>
 * @see <a href="https://encoding.spec.whatwg.org/#interface-textencoder">The definition of 'TextEncoder' in the 'Encoding' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextEncoder"
)
public class TextEncoder {
  /**
   * The TextEncoder() constructor returns a newly created utf-8 TextEncoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextEncoder/TextEncoder">TextEncoder.TextEncoder - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textencoder">The definition of 'TextEncoder()' in the 'Encoding' specification.</a>
   */
  public TextEncoder() {
  }

  /**
   * The TextEncoder.encoding read-only property returns a DOMString containing the name of the encoding algorithm used by the specific encoder.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextEncoder/encoding">TextEncoder.encoding - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textencoder-encoding">The definition of 'TextEncoder.encoding' in the 'Encoding' specification.</a>
   */
  @JsProperty(
      name = "encoding"
  )
  @Nonnull
  public native String encoding();

  /**
   * The TextEncoder.prototype.encode() method takes a USVString as input, and returns a Uint8Array containing the text given in parameters encoded with the specific method for that TextEncoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextEncoder/encode">TextEncoder.encode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textencoder-encode">The definition of 'TextEncoder.prototype.encode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native Uint8Array encode(@Nonnull String input);

  /**
   * The TextEncoder.prototype.encode() method takes a USVString as input, and returns a Uint8Array containing the text given in parameters encoded with the specific method for that TextEncoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextEncoder/encode">TextEncoder.encode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textencoder-encode">The definition of 'TextEncoder.prototype.encode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native Uint8Array encode();

  /**
   * The TextEncoder.prototype.encodeInto() method takes a USVString to encode and a destination Uint8Array to put resulting UTF-8 encoded text into, and returns a dictionary object indicating the progress of the encoding. This is potentially more performant than the older encode() method especially when the target buffer is a view into a Wasm heap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextEncoder/encodeInto">TextEncoder.encodeInto - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textencoder-encodeinto">The definition of 'TextEncoder.encode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native TextEncoderEncodeIntoResult encodeInto(@Nonnull String source,
      @Nonnull Uint8Array destination);
}
