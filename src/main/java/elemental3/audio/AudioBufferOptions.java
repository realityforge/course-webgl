package elemental3.audio;

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
public interface AudioBufferOptions {
  @JsOverlay
  @Nonnull
  static AudioBufferOptions create(final int length, final float sampleRate) {
    return Js.<AudioBufferOptions>uncheckedCast( JsPropertyMap.of() ).length( length ).sampleRate( sampleRate );
  }

  @JsProperty(
      name = "length"
  )
  int length();

  @JsProperty
  void setLength(int length);

  @JsOverlay
  @Nonnull
  default AudioBufferOptions length(final int length) {
    setLength( length );
    return this;
  }

  @JsProperty(
      name = "numberOfChannels"
  )
  int numberOfChannels();

  @JsProperty
  void setNumberOfChannels(int numberOfChannels);

  @JsOverlay
  @Nonnull
  default AudioBufferOptions numberOfChannels(final int numberOfChannels) {
    setNumberOfChannels( numberOfChannels );
    return this;
  }

  @JsProperty(
      name = "sampleRate"
  )
  float sampleRate();

  @JsProperty
  void setSampleRate(float sampleRate);

  @JsOverlay
  @Nonnull
  default AudioBufferOptions sampleRate(final float sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }
}
