package akasha.audio;

import akasha.EventInit;
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
    name = "Object"
)
public interface OfflineAudioCompletionEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static OfflineAudioCompletionEventInit create(@Nonnull final AudioBuffer renderedBuffer) {
    return Js.<OfflineAudioCompletionEventInit>uncheckedCast( JsPropertyMap.of() ).renderedBuffer( renderedBuffer );
  }

  @JsProperty(
      name = "renderedBuffer"
  )
  @Nonnull
  AudioBuffer renderedBuffer();

  @JsProperty
  void setRenderedBuffer(@Nonnull AudioBuffer renderedBuffer);

  @JsOverlay
  @Nonnull
  default OfflineAudioCompletionEventInit renderedBuffer(
      @Nonnull final AudioBuffer renderedBuffer) {
    setRenderedBuffer( renderedBuffer );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default OfflineAudioCompletionEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default OfflineAudioCompletionEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default OfflineAudioCompletionEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
