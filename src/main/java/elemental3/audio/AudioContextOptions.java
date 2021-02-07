package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The AudioContextOptions dictionary is used to specify configuration options when constructing a new AudioContext object to represent a graph of web audio nodes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions">AudioContextOptions - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#AudioContextOptions">AudioContextOptions - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface AudioContextOptions {
  @JsOverlay
  @Nonnull
  static AudioContextOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named latencyHint, which indicates the preferred maximum latency in seconds for the audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/latencyHint">AudioContextOptions.latencyHint - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-latencyhint">AudioContextOptions.latencyHint - Web Audio API</a>
   */
  @JsProperty(
      name = "latencyHint"
  )
  AudioContextLatencyCategoryOrDoubleUnion latencyHint();

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named latencyHint, which indicates the preferred maximum latency in seconds for the audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/latencyHint">AudioContextOptions.latencyHint - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-latencyhint">AudioContextOptions.latencyHint - Web Audio API</a>
   */
  @JsProperty
  void setLatencyHint(@Nonnull AudioContextLatencyCategoryOrDoubleUnion latencyHint);

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named latencyHint, which indicates the preferred maximum latency in seconds for the audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/latencyHint">AudioContextOptions.latencyHint - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-latencyhint">AudioContextOptions.latencyHint - Web Audio API</a>
   */
  @JsOverlay
  default void setLatencyHint(@Nonnull final String latencyHint) {
    setLatencyHint( AudioContextLatencyCategoryOrDoubleUnion.of( latencyHint ) );
  }

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named latencyHint, which indicates the preferred maximum latency in seconds for the audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/latencyHint">AudioContextOptions.latencyHint - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-latencyhint">AudioContextOptions.latencyHint - Web Audio API</a>
   */
  @JsOverlay
  @Nonnull
  default AudioContextOptions latencyHint(@Nonnull final String latencyHint) {
    setLatencyHint( latencyHint );
    return this;
  }

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named latencyHint, which indicates the preferred maximum latency in seconds for the audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/latencyHint">AudioContextOptions.latencyHint - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-latencyhint">AudioContextOptions.latencyHint - Web Audio API</a>
   */
  @JsOverlay
  default void setLatencyHint(final double latencyHint) {
    setLatencyHint( AudioContextLatencyCategoryOrDoubleUnion.of( latencyHint ) );
  }

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named latencyHint, which indicates the preferred maximum latency in seconds for the audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/latencyHint">AudioContextOptions.latencyHint - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-latencyhint">AudioContextOptions.latencyHint - Web Audio API</a>
   */
  @JsOverlay
  @Nonnull
  default AudioContextOptions latencyHint(final double latencyHint) {
    setLatencyHint( latencyHint );
    return this;
  }

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named sampleRate, which indicates the sample rate to use for the new context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/sampleRate">AudioContextOptions.sampleRate - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-samplerate">AudioContextOptions.sampleRate - Web Audio API</a>
   */
  @JsProperty(
      name = "sampleRate"
  )
  float sampleRate();

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named sampleRate, which indicates the sample rate to use for the new context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/sampleRate">AudioContextOptions.sampleRate - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-samplerate">AudioContextOptions.sampleRate - Web Audio API</a>
   */
  @JsProperty
  void setSampleRate(float sampleRate);

  /**
   * The AudioContextOptions dictionary (used when instantiating an AudioContext) may contain a property named sampleRate, which indicates the sample rate to use for the new context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContextOptions/sampleRate">AudioContextOptions.sampleRate - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontextoptions-samplerate">AudioContextOptions.sampleRate - Web Audio API</a>
   */
  @JsOverlay
  @Nonnull
  default AudioContextOptions sampleRate(final float sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }
}
