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
public interface ReadableStreamGetReaderOptions {
  @JsOverlay
  @Nonnull
  static ReadableStreamGetReaderOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "mode"
  )
  @ReadableStreamReaderMode
  String mode();

  @JsProperty
  void setMode(@ReadableStreamReaderMode @Nonnull String mode);

  @JsOverlay
  @Nonnull
  default ReadableStreamGetReaderOptions mode(
      @ReadableStreamReaderMode @Nonnull final String mode) {
    setMode( mode );
    return this;
  }
}
