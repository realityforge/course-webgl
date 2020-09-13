package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface TextEncoderEncodeIntoResult {
  @JsOverlay
  @Nonnull
  static TextEncoderEncodeIntoResult create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "read"
  )
  int read();

  @JsProperty
  void setRead(int read);

  @JsOverlay
  @Nonnull
  default TextEncoderEncodeIntoResult read(final int read) {
    setRead( read );
    return this;
  }

  @JsProperty(
      name = "written"
  )
  int written();

  @JsProperty
  void setWritten(int written);

  @JsOverlay
  @Nonnull
  default TextEncoderEncodeIntoResult written(final int written) {
    setWritten( written );
    return this;
  }
}
