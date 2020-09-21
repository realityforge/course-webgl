package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public interface AudioBufferSourceOptions {
  @JsOverlay
  @Nonnull
  static AudioBufferSourceOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "buffer"
  )
  @Nullable
  AudioBuffer buffer();

  @JsProperty
  void setBuffer(@Nullable AudioBuffer buffer);

  @JsOverlay
  @Nonnull
  default AudioBufferSourceOptions buffer(@Nullable final AudioBuffer buffer) {
    setBuffer( buffer );
    return this;
  }

  @JsProperty(
      name = "detune"
  )
  float detune();

  @JsProperty
  void setDetune(float detune);

  @JsOverlay
  @Nonnull
  default AudioBufferSourceOptions detune(final float detune) {
    setDetune( detune );
    return this;
  }

  @JsProperty(
      name = "loop"
  )
  boolean loop();

  @JsProperty
  void setLoop(boolean loop);

  @JsOverlay
  @Nonnull
  default AudioBufferSourceOptions loop(final boolean loop) {
    setLoop( loop );
    return this;
  }

  @JsProperty(
      name = "loopEnd"
  )
  double loopEnd();

  @JsProperty
  void setLoopEnd(double loopEnd);

  @JsOverlay
  @Nonnull
  default AudioBufferSourceOptions loopEnd(final double loopEnd) {
    setLoopEnd( loopEnd );
    return this;
  }

  @JsProperty(
      name = "loopStart"
  )
  double loopStart();

  @JsProperty
  void setLoopStart(double loopStart);

  @JsOverlay
  @Nonnull
  default AudioBufferSourceOptions loopStart(final double loopStart) {
    setLoopStart( loopStart );
    return this;
  }

  @JsProperty(
      name = "playbackRate"
  )
  float playbackRate();

  @JsProperty
  void setPlaybackRate(float playbackRate);

  @JsOverlay
  @Nonnull
  default AudioBufferSourceOptions playbackRate(final float playbackRate) {
    setPlaybackRate( playbackRate );
    return this;
  }
}
