package elemental3.audio;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The AudioWorkletNodeOptions dictionary of the Web Audio API is used to specify configuration options when constructing a new AudioWorkletNode object for custom audio processing.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNodeOptions">AudioWorkletNodeOptions - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#dictdef-audioworkletnodeoptions">AudioWorkletNodeOptions - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface AudioWorkletNodeOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static AudioWorkletNodeOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "numberOfInputs"
  )
  int numberOfInputs();

  @JsProperty
  void setNumberOfInputs(int numberOfInputs);

  @JsOverlay
  @Nonnull
  default AudioWorkletNodeOptions numberOfInputs(final int numberOfInputs) {
    setNumberOfInputs( numberOfInputs );
    return this;
  }

  @JsProperty(
      name = "numberOfOutputs"
  )
  int numberOfOutputs();

  @JsProperty
  void setNumberOfOutputs(int numberOfOutputs);

  @JsOverlay
  @Nonnull
  default AudioWorkletNodeOptions numberOfOutputs(final int numberOfOutputs) {
    setNumberOfOutputs( numberOfOutputs );
    return this;
  }

  @JsProperty(
      name = "outputChannelCount"
  )
  JsArray<Double> outputChannelCount();

  @JsProperty
  void setOutputChannelCount(@Nonnull JsArray<Double> outputChannelCount);

  @JsOverlay
  @Nonnull
  default AudioWorkletNodeOptions outputChannelCount(
      @Nonnull final JsArray<Double> outputChannelCount) {
    setOutputChannelCount( outputChannelCount );
    return this;
  }

  @JsOverlay
  default void setOutputChannelCount(@Nonnull final double... outputChannelCount) {
    setOutputChannelCount( Js.<JsArray<Double>>uncheckedCast( outputChannelCount ) );
  }

  @JsOverlay
  @Nonnull
  default AudioWorkletNodeOptions outputChannelCount(@Nonnull final double... outputChannelCount) {
    setOutputChannelCount( outputChannelCount );
    return this;
  }

  @JsProperty(
      name = "parameterData"
  )
  JsPropertyMap<Double> parameterData();

  @JsProperty
  void setParameterData(@Nonnull JsPropertyMap<Double> parameterData);

  @JsOverlay
  @Nonnull
  default AudioWorkletNodeOptions parameterData(
      @Nonnull final JsPropertyMap<Double> parameterData) {
    setParameterData( parameterData );
    return this;
  }

  @JsProperty(
      name = "processorOptions"
  )
  Object processorOptions();

  @JsProperty
  void setProcessorOptions(@Nonnull Object processorOptions);

  @JsOverlay
  @Nonnull
  default AudioWorkletNodeOptions processorOptions(@Nonnull final Object processorOptions) {
    setProcessorOptions( processorOptions );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AudioWorkletNodeOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AudioWorkletNodeOptions channelCountMode(
      @ChannelCountMode @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AudioWorkletNodeOptions channelInterpretation(
      @ChannelInterpretation @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
