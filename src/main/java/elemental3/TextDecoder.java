package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TextDecoder interface represents a decoder for a specific text encoding, such as UTF-8, ISO-8859-2, KOI8-R, GBK, etc. A decoder takes a stream of bytes as input and emits a stream of code points.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder">TextDecoder - MDN</a>
 * @see <a href="https://encoding.spec.whatwg.org/#interface-textdecoder">The definition of 'TextDecoder' in the 'Encoding' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextDecoder"
)
public class TextDecoder {
  /**
   * The TextDecoder() constructor returns a newly created TextDecoder object for the encoding specified in parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/TextDecoder">TextDecoder.TextDecoder - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder">The definition of 'TextDecoder()' in the 'Encoding' specification.</a>
   */
  public TextDecoder(@Nonnull final String label, @Nonnull final TextDecoderOptions options) {
  }

  /**
   * The TextDecoder() constructor returns a newly created TextDecoder object for the encoding specified in parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/TextDecoder">TextDecoder.TextDecoder - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder">The definition of 'TextDecoder()' in the 'Encoding' specification.</a>
   */
  public TextDecoder(@Nonnull final String label) {
  }

  /**
   * The TextDecoder() constructor returns a newly created TextDecoder object for the encoding specified in parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/TextDecoder">TextDecoder.TextDecoder - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder">The definition of 'TextDecoder()' in the 'Encoding' specification.</a>
   */
  public TextDecoder() {
  }

  /**
   * The TextDecoder.prototype.encoding read-only property returns a DOMString containing the name of the decoding algorithm used by the specific decoder.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/encoding">TextDecoder.encoding - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-encoding">The definition of 'TextDecoder.encoding' in the 'Encoding' specification.</a>
   */
  @JsProperty(
      name = "encoding"
  )
  @Nonnull
  public native String encoding();

  @JsProperty(
      name = "fatal"
  )
  public native boolean fatal();

  @JsProperty(
      name = "ignoreBOM"
  )
  public native boolean ignoreBOM();

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull BufferSource input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull ArrayBufferView input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Int8Array input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Int16Array input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Int32Array input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Uint8Array input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Uint16Array input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Uint32Array input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Uint8ClampedArray input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Float32Array input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Float64Array input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull DataView input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull ArrayBuffer input, @Nonnull TextDecodeOptions options);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull BufferSource input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull ArrayBufferView input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Int8Array input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Int16Array input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Int32Array input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Uint8Array input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Uint16Array input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Uint32Array input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Uint8ClampedArray input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Float32Array input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull Float64Array input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull DataView input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode(@Nonnull ArrayBuffer input);

  /**
   * The TextDecoder.prototype.decode() method returns a DOMString containing the text, given in parameters, decoded with the specific method for that TextDecoder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode">TextDecoder.decode - MDN</a>
   * @see <a href="https://encoding.spec.whatwg.org/#dom-textdecoder-decode">The definition of 'TextDecoder.decode()' in the 'Encoding' specification.</a>
   */
  @Nonnull
  public native String decode();
}
