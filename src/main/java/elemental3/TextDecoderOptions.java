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
public interface TextDecoderOptions {
  @JsOverlay
  @Nonnull
  static TextDecoderOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "fatal"
  )
  boolean fatal();

  @JsProperty
  void setFatal(boolean fatal);

  @JsOverlay
  @Nonnull
  default TextDecoderOptions fatal(final boolean fatal) {
    setFatal( fatal );
    return this;
  }

  @JsProperty(
      name = "ignoreBOM"
  )
  boolean ignoreBOM();

  @JsProperty
  void setIgnoreBOM(boolean ignoreBOM);

  @JsOverlay
  @Nonnull
  default TextDecoderOptions ignoreBOM(final boolean ignoreBOM) {
    setIgnoreBOM( ignoreBOM );
    return this;
  }
}
