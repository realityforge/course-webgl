package elemental3.audio;

import elemental3.Worklet;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The AudioWorklet interface of the Web Audio API is used to supply custom audio processing scripts that execute in a separate thread to provide very low latency audio processing.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorklet">AudioWorklet - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#audioworklet">The definition of 'AudioWorklet' in the 'Web Audio API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioWorklet"
)
public class AudioWorklet extends Worklet {
  protected AudioWorklet() {
  }
}
