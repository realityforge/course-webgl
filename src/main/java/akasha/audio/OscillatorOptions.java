package akasha.audio;

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
public interface OscillatorOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static OscillatorOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "detune"
  )
  float detune();

  @JsProperty
  void setDetune(float detune);

  @JsOverlay
  @Nonnull
  default OscillatorOptions detune(final float detune) {
    setDetune( detune );
    return this;
  }

  @JsProperty(
      name = "frequency"
  )
  float frequency();

  @JsProperty
  void setFrequency(float frequency);

  @JsOverlay
  @Nonnull
  default OscillatorOptions frequency(final float frequency) {
    setFrequency( frequency );
    return this;
  }

  @JsProperty(
      name = "periodicWave"
  )
  PeriodicWave periodicWave();

  @JsProperty
  void setPeriodicWave(@Nonnull PeriodicWave periodicWave);

  @JsOverlay
  @Nonnull
  default OscillatorOptions periodicWave(@Nonnull final PeriodicWave periodicWave) {
    setPeriodicWave( periodicWave );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @OscillatorType
  String type();

  @JsProperty
  void setType(@OscillatorType @Nonnull String type);

  @JsOverlay
  @Nonnull
  default OscillatorOptions type(@OscillatorType @Nonnull final String type) {
    setType( type );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default OscillatorOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default OscillatorOptions channelCountMode(
      @ChannelCountMode @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default OscillatorOptions channelInterpretation(
      @ChannelInterpretation @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
