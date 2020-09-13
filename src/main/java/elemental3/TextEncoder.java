package elemental3;

import elemental2.core.Uint8Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * TextEncoder takes a stream of code points as input and emits a stream of UTF-8 bytes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextEncoder">TextEncoder - MDN</a>
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
   */
  public TextEncoder() {
  }

  @JsProperty(
      name = "encoding"
  )
  @Nonnull
  public native String encoding();

  @Nonnull
  public native Uint8Array encode(@Nonnull String input);

  @Nonnull
  public native Uint8Array encode();

  @Nonnull
  public native TextEncoderEncodeIntoResult encodeInto(@Nonnull String source,
      @Nonnull Uint8Array destination);
}
