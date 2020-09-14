package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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
