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
public interface AnalyserOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static AnalyserOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "fftSize"
  )
  int fftSize();

  @JsProperty
  void setFftSize(int fftSize);

  @JsOverlay
  @Nonnull
  default AnalyserOptions fftSize(final int fftSize) {
    setFftSize( fftSize );
    return this;
  }

  @JsProperty(
      name = "maxDecibels"
  )
  double maxDecibels();

  @JsProperty
  void setMaxDecibels(double maxDecibels);

  @JsOverlay
  @Nonnull
  default AnalyserOptions maxDecibels(final double maxDecibels) {
    setMaxDecibels( maxDecibels );
    return this;
  }

  @JsProperty(
      name = "minDecibels"
  )
  double minDecibels();

  @JsProperty
  void setMinDecibels(double minDecibels);

  @JsOverlay
  @Nonnull
  default AnalyserOptions minDecibels(final double minDecibels) {
    setMinDecibels( minDecibels );
    return this;
  }

  @JsProperty(
      name = "smoothingTimeConstant"
  )
  double smoothingTimeConstant();

  @JsProperty
  void setSmoothingTimeConstant(double smoothingTimeConstant);

  @JsOverlay
  @Nonnull
  default AnalyserOptions smoothingTimeConstant(final double smoothingTimeConstant) {
    setSmoothingTimeConstant( smoothingTimeConstant );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AnalyserOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AnalyserOptions channelCountMode(
      @ChannelCountMode @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AnalyserOptions channelInterpretation(
      @ChannelInterpretation @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
