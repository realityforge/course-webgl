package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface BiquadFilterOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static BiquadFilterOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "Q"
  )
  float Q();

  @JsProperty
  void setQ(float Q);

  @JsOverlay
  @Nonnull
  default BiquadFilterOptions Q(final float Q) {
    setQ( Q );
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
  default BiquadFilterOptions detune(final float detune) {
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
  default BiquadFilterOptions frequency(final float frequency) {
    setFrequency( frequency );
    return this;
  }

  @JsProperty(
      name = "gain"
  )
  float gain();

  @JsProperty
  void setGain(float gain);

  @JsOverlay
  @Nonnull
  default BiquadFilterOptions gain(final float gain) {
    setGain( gain );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @MagicConstant(
      valuesFromClass = BiquadFilterType.class
  )
  String type();

  @JsProperty
  void setType(@MagicConstant(valuesFromClass = BiquadFilterType.class) @Nonnull String type);

  @JsOverlay
  @Nonnull
  default BiquadFilterOptions type(
      @MagicConstant(valuesFromClass = BiquadFilterType.class) @Nonnull final String type) {
    setType( type );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default BiquadFilterOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default BiquadFilterOptions channelCountMode(
      @MagicConstant(valuesFromClass = ChannelCountMode.class) @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default BiquadFilterOptions channelInterpretation(
      @MagicConstant(valuesFromClass = ChannelInterpretation.class) @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
