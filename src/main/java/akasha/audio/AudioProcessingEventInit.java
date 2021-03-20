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
public interface AudioProcessingEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static AudioProcessingEventInit create(@Nonnull final AudioBuffer inputBuffer,
      @Nonnull final AudioBuffer outputBuffer, final double playbackTime) {
    return Js.<AudioProcessingEventInit>uncheckedCast( JsPropertyMap.of() ).inputBuffer( inputBuffer ).outputBuffer( outputBuffer ).playbackTime( playbackTime );
  }

  @JsProperty(
      name = "inputBuffer"
  )
  @Nonnull
  AudioBuffer inputBuffer();

  @JsProperty
  void setInputBuffer(@Nonnull AudioBuffer inputBuffer);

  @JsOverlay
  @Nonnull
  default AudioProcessingEventInit inputBuffer(@Nonnull final AudioBuffer inputBuffer) {
    setInputBuffer( inputBuffer );
    return this;
  }

  @JsProperty(
      name = "outputBuffer"
  )
  @Nonnull
  AudioBuffer outputBuffer();

  @JsProperty
  void setOutputBuffer(@Nonnull AudioBuffer outputBuffer);

  @JsOverlay
  @Nonnull
  default AudioProcessingEventInit outputBuffer(@Nonnull final AudioBuffer outputBuffer) {
    setOutputBuffer( outputBuffer );
    return this;
  }

  @JsProperty(
      name = "playbackTime"
  )
  double playbackTime();

  @JsProperty
  void setPlaybackTime(double playbackTime);

  @JsOverlay
  @Nonnull
  default AudioProcessingEventInit playbackTime(final double playbackTime) {
    setPlaybackTime( playbackTime );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AudioProcessingEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AudioProcessingEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AudioProcessingEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
