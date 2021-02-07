package elemental3.audio;

import elemental3.EventHandler;
import elemental3.MessagePort;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioWorkletNode interface of the Web Audio API represents a base class for a user-defined AudioNode, which can be connected to an audio routing graph along with other nodes. It has an associated AudioWorkletProcessor, which does the actual audio processing in a Web Audio rendering thread.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNode">AudioWorkletNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#audioworkletnode">AudioWorkletNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioWorkletNode"
)
public class AudioWorkletNode extends AudioNode {
  /**
   * The onprocessorerror property of the AudioWorkletNode interface defines an event handler function to be called when the processorerror event fires. This occurs when the underlying AudioWorkletProcessor behind the node throws an exception in its constructor, the process method, or any user-defined class method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNode/onprocessorerror">AudioWorkletNode.onprocessorerror - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioworkletnode-onprocessorerror">onprocessorerror - Web Audio API</a>
   */
  @Nullable
  public EventHandler onprocessorerror;

  /**
   * The AudioWorkletNode() constructor creates a new AudioWorkletNode object, which represents an AudioNode that uses a JavaScript function to perform custom audio processing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNode/AudioWorkletNode">AudioWorkletNode.AudioWorkletNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioworkletnode-audioworkletnode">AudioWorkletNode() - Web Audio API</a>
   */
  public AudioWorkletNode(@Nonnull final BaseAudioContext context, @Nonnull final String name,
      @Nonnull final AudioWorkletNodeOptions options) {
  }

  /**
   * The AudioWorkletNode() constructor creates a new AudioWorkletNode object, which represents an AudioNode that uses a JavaScript function to perform custom audio processing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNode/AudioWorkletNode">AudioWorkletNode.AudioWorkletNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioworkletnode-audioworkletnode">AudioWorkletNode() - Web Audio API</a>
   */
  public AudioWorkletNode(@Nonnull final BaseAudioContext context, @Nonnull final String name) {
  }

  /**
   * The read-only parameters property of the AudioWorkletNode interface returns the associated AudioParamMap &mdash; that is, a Map-like collection of AudioParam objects. They are instantiated during creation of the underlying AudioWorkletProcessor according to its parameterDescriptors static getter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNode/parameters">AudioWorkletNode.parameters - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioworkletnode-parameters">parameters - Web Audio API</a>
   */
  @JsProperty(
      name = "parameters"
  )
  @Nonnull
  public native AudioParamMap parameters();

  /**
   * The read-only port property of the AudioWorkletNode interface returns the associated MessagePort. It can be used to communicate between the node and its associated AudioWorkletProcessor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletNode/port">AudioWorkletNode.port - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioworkletnode-port">port - Web Audio API</a>
   */
  @JsProperty(
      name = "port"
  )
  @Nonnull
  public native MessagePort port();
}
