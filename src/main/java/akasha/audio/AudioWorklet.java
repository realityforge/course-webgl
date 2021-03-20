package akasha.audio;

import akasha.Worklet;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The AudioWorklet interface of the Web Audio API is used to supply custom audio processing scripts that execute in a separate thread to provide very low latency audio processing. The worklet's code is run in the AudioWorkletGlobalScope global execution context, using a separate Web Audio thread which is shared by the worklet and other audio nodes.The AudioWorklet interface of the Web Audio API is used to supply custom audio processing scripts that execute in a separate thread to provide very low latency audio processing.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorklet">AudioWorklet - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#audioworklet">AudioWorklet - Web Audio API</a>
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
