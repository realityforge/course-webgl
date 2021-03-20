package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TextDecoderStream interface of the Encoding API converts a stream of strings into bytes in the UTF-8 encoding. It is the streaming equivalent of TextDecoder.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextDecoderStream">TextDecoderStream - MDN</a>
 * @see <a href="https://encoding.spec.whatwg.org/#interface-TextDecoderStream">TextDecoderStream - Encoding</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextDecoderStream"
)
public class TextDecoderStream {
  public TextDecoderStream(@Nonnull final String label, @Nonnull final TextDecoderOptions options) {
  }

  public TextDecoderStream(@Nonnull final String label) {
  }

  public TextDecoderStream() {
  }

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

  @JsProperty(
      name = "readable"
  )
  @Nonnull
  public native ReadableStream readable();

  @JsProperty(
      name = "writable"
  )
  @Nonnull
  public native WritableStream writable();
}
