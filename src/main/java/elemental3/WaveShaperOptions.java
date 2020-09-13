package elemental3;

import elemental2.core.JsArray;
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
public interface WaveShaperOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static WaveShaperOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "curve"
  )
  JsArray<Double> curve();

  @JsProperty
  void setCurve(@Nonnull JsArray<Double> curve);

  @JsOverlay
  @Nonnull
  default WaveShaperOptions curve(@Nonnull final JsArray<Double> curve) {
    setCurve( curve );
    return this;
  }

  @JsOverlay
  default void setCurve(@Nonnull final Double... curve) {
    setCurve( Js.<JsArray<Double>>uncheckedCast( curve ) );
  }

  @JsOverlay
  @Nonnull
  default WaveShaperOptions curve(@Nonnull final Double... curve) {
    setCurve( curve );
    return this;
  }

  @JsProperty(
      name = "oversample"
  )
  @MagicConstant(
      valuesFromClass = OverSampleType.class
  )
  String oversample();

  @JsProperty
  void setOversample(
      @MagicConstant(valuesFromClass = OverSampleType.class) @Nonnull String oversample);

  @JsOverlay
  @Nonnull
  default WaveShaperOptions oversample(
      @MagicConstant(valuesFromClass = OverSampleType.class) @Nonnull final String oversample) {
    setOversample( oversample );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WaveShaperOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WaveShaperOptions channelCountMode(
      @MagicConstant(valuesFromClass = ChannelCountMode.class) @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WaveShaperOptions channelInterpretation(
      @MagicConstant(valuesFromClass = ChannelInterpretation.class) @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
