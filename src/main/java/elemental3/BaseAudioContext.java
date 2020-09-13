package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The BaseAudioContext interface of the Web Audio API acts as a base definition for online and offline audio-processing graphs, as represented by AudioContext and OfflineAudioContext respectively.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext">BaseAudioContext - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BaseAudioContext"
)
public class BaseAudioContext extends EventTarget {
  @Nullable
  public EventHandler onstatechange;

  BaseAudioContext() {
  }

  /**
   * The audioWorklet read-only property of the BaseAudioContext interface returns an instance of AudioWorklet that can be used for adding AudioWorkletProcessor-derived classes which implement custom audio processing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/audioWorklet">BaseAudioContext.audioWorklet - MDN</a>
   */
  @JsProperty(
      name = "audioWorklet"
  )
  @Nonnull
  public native AudioWorklet audioWorklet();

  /**
   * The currentTime read-only property of the BaseAudioContext interface returns a double representing an ever-increasing hardware timestamp in seconds that can be used for scheduling audio playback, visualizing timelines, etc. It starts at 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/currentTime">BaseAudioContext.currentTime - MDN</a>
   */
  @JsProperty(
      name = "currentTime"
  )
  public native double currentTime();

  /**
   * An AudioDestinationNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/destination">BaseAudioContext.destination - MDN</a>
   */
  @JsProperty(
      name = "destination"
  )
  @Nonnull
  public native AudioDestinationNode destination();

  /**
   * An AudioListener object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/listener">BaseAudioContext.listener - MDN</a>
   */
  @JsProperty(
      name = "listener"
  )
  @Nonnull
  public native AudioListener listener();

  /**
   * The sampleRate property of the BaseAudioContext interface returns a floating point number representing the sample rate, in samples per second, used by all nodes in this audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/sampleRate">BaseAudioContext.sampleRate - MDN</a>
   */
  @JsProperty(
      name = "sampleRate"
  )
  public native float sampleRate();

  /**
   * A DOMString. Possible values are:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/state">BaseAudioContext.state - MDN</a>
   */
  @JsProperty(
      name = "state"
  )
  @Nonnull
  public native String state();

  /**
   * The createAnalyser() method of the BaseAudioContext interface creates an AnalyserNode, which can be used to expose audio time and frequency data and create data visualisations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createAnalyser">BaseAudioContext.createAnalyser - MDN</a>
   */
  @Nonnull
  public native AnalyserNode createAnalyser();

  /**
   * A BiquadFilterNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BaseAudioContext/createBiquadFilter">BaseAudioContext.createBiquadFilter - MDN</a>
   */
  @Nonnull
  public native BiquadFilterNode createBiquadFilter();

  @Nonnull
  public native AudioBuffer createBuffer(int numberOfChannels, int length, float sampleRate);

  @Nonnull
  public native AudioBufferSourceNode createBufferSource();

  @Nonnull
  public native ChannelMergerNode createChannelMerger(int numberOfInputs);

  @Nonnull
  public native ChannelMergerNode createChannelMerger();

  @Nonnull
  public native ChannelSplitterNode createChannelSplitter(int numberOfOutputs);

  @Nonnull
  public native ChannelSplitterNode createChannelSplitter();

  @Nonnull
  public native ConstantSourceNode createConstantSource();

  @Nonnull
  public native ConvolverNode createConvolver();

  @Nonnull
  public native DelayNode createDelay(double maxDelayTime);

  @Nonnull
  public native DelayNode createDelay();

  @Nonnull
  public native DynamicsCompressorNode createDynamicsCompressor();

  @Nonnull
  public native GainNode createGain();

  @Nonnull
  public native IIRFilterNode createIIRFilter(@Nonnull JsArray<Double> feedforward,
      @Nonnull JsArray<Double> feedback);

  @Nonnull
  public native IIRFilterNode createIIRFilter(@Nonnull Double[] feedforward,
      @Nonnull JsArray<Double> feedback);

  @Nonnull
  public native IIRFilterNode createIIRFilter(@Nonnull JsArray<Double> feedforward,
      @Nonnull Double[] feedback);

  @Nonnull
  public native IIRFilterNode createIIRFilter(@Nonnull Double[] feedforward,
      @Nonnull Double[] feedback);

  @Nonnull
  public native OscillatorNode createOscillator();

  @Nonnull
  public native PannerNode createPanner();

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull JsArray<Double> real,
      @Nonnull JsArray<Double> imag, @Nonnull PeriodicWaveConstraints constraints);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull Double[] real,
      @Nonnull JsArray<Double> imag, @Nonnull PeriodicWaveConstraints constraints);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull JsArray<Double> real,
      @Nonnull Double[] imag, @Nonnull PeriodicWaveConstraints constraints);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull Double[] real, @Nonnull Double[] imag,
      @Nonnull PeriodicWaveConstraints constraints);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull JsArray<Double> real,
      @Nonnull JsArray<Double> imag);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull Double[] real,
      @Nonnull JsArray<Double> imag);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull JsArray<Double> real,
      @Nonnull Double[] imag);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull Double[] real, @Nonnull Double[] imag);

  @Nonnull
  public native ScriptProcessorNode createScriptProcessor(int bufferSize, int numberOfInputChannels,
      int numberOfOutputChannels);

  @Nonnull
  public native ScriptProcessorNode createScriptProcessor(int bufferSize,
      int numberOfInputChannels);

  @Nonnull
  public native ScriptProcessorNode createScriptProcessor(int bufferSize);

  @Nonnull
  public native ScriptProcessorNode createScriptProcessor();

  @Nonnull
  public native StereoPannerNode createStereoPanner();

  @Nonnull
  public native WaveShaperNode createWaveShaper();

  @Nonnull
  public native Promise<AudioBuffer> decodeAudioData(@Nonnull ArrayBuffer audioData,
      @Nullable DecodeSuccessCallback successCallback, @Nullable DecodeErrorCallback errorCallback);

  @Nonnull
  public native Promise<AudioBuffer> decodeAudioData(@Nonnull ArrayBuffer audioData,
      @Nullable DecodeSuccessCallback successCallback);

  @Nonnull
  public native Promise<AudioBuffer> decodeAudioData(@Nonnull ArrayBuffer audioData);
}
