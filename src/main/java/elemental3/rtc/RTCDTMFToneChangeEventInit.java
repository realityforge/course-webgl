package elemental3.rtc;

import elemental3.EventInit;
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
public interface RTCDTMFToneChangeEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static RTCDTMFToneChangeEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "tone"
  )
  String tone();

  @JsProperty
  void setTone(@Nonnull String tone);

  @JsOverlay
  @Nonnull
  default RTCDTMFToneChangeEventInit tone(@Nonnull final String tone) {
    setTone( tone );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCDTMFToneChangeEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCDTMFToneChangeEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCDTMFToneChangeEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
