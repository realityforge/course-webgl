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
public interface TextDecodeOptions {
  @JsOverlay
  @Nonnull
  static TextDecodeOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "stream"
  )
  boolean stream();

  @JsProperty
  void setStream(boolean stream);

  @JsOverlay
  @Nonnull
  default TextDecodeOptions stream(final boolean stream) {
    setStream( stream );
    return this;
  }
}
