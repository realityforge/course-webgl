package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The AudioNode interface is a generic interface for representing an audio processing module.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode">AudioNode - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioNode"
)
public class AudioNode extends EventTarget {
  public int channelCount;

  @Nonnull
  @MagicConstant(
      valuesFromClass = ChannelCountMode.class
  )
  public String channelCountMode;

  @Nonnull
  @MagicConstant(
      valuesFromClass = ChannelInterpretation.class
  )
  public String channelInterpretation;

  AudioNode() {
  }

  /**
   * The read-only context property of the AudioNode interface returns the associated BaseAudioContext, that is the object representing the processing graph the node is participating in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/context">AudioNode.context - MDN</a>
   */
  @JsProperty(
      name = "context"
  )
  @Nonnull
  public native BaseAudioContext context();

  @JsProperty(
      name = "numberOfInputs"
  )
  public native int numberOfInputs();

  @JsProperty(
      name = "numberOfOutputs"
  )
  public native int numberOfOutputs();

  /**
   * If the destination is a node, connect() returns a reference to the destination AudioNode object, allowing you to chain multiple connect() calls. In some browsers, older implementations of this interface return undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/connect">AudioNode.connect - MDN</a>
   */
  @Nonnull
  public native AudioNode connect(@Nonnull AudioNode destinationNode, int output, int input);

  /**
   * If the destination is a node, connect() returns a reference to the destination AudioNode object, allowing you to chain multiple connect() calls. In some browsers, older implementations of this interface return undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/connect">AudioNode.connect - MDN</a>
   */
  @Nonnull
  public native AudioNode connect(@Nonnull AudioNode destinationNode, int output);

  /**
   * If the destination is a node, connect() returns a reference to the destination AudioNode object, allowing you to chain multiple connect() calls. In some browsers, older implementations of this interface return undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/connect">AudioNode.connect - MDN</a>
   */
  @Nonnull
  public native AudioNode connect(@Nonnull AudioNode destinationNode);

  /**
   * If the destination is a node, connect() returns a reference to the destination AudioNode object, allowing you to chain multiple connect() calls. In some browsers, older implementations of this interface return undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/connect">AudioNode.connect - MDN</a>
   */
  public native void connect(@Nonnull AudioParam destinationParam, int output);

  /**
   * If the destination is a node, connect() returns a reference to the destination AudioNode object, allowing you to chain multiple connect() calls. In some browsers, older implementations of this interface return undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/connect">AudioNode.connect - MDN</a>
   */
  public native void connect(@Nonnull AudioParam destinationParam);

  /**
   * undefined
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/disconnect">AudioNode.disconnect - MDN</a>
   */
  public native void disconnect();

  /**
   * undefined
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/disconnect">AudioNode.disconnect - MDN</a>
   */
  public native void disconnect(int output);

  /**
   * undefined
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/disconnect">AudioNode.disconnect - MDN</a>
   */
  public native void disconnect(@Nonnull AudioNode destinationNode);

  /**
   * undefined
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/disconnect">AudioNode.disconnect - MDN</a>
   */
  public native void disconnect(@Nonnull AudioNode destinationNode, int output);

  /**
   * undefined
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/disconnect">AudioNode.disconnect - MDN</a>
   */
  public native void disconnect(@Nonnull AudioNode destinationNode, int output, int input);

  /**
   * undefined
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/disconnect">AudioNode.disconnect - MDN</a>
   */
  public native void disconnect(@Nonnull AudioParam destinationParam);

  /**
   * undefined
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/disconnect">AudioNode.disconnect - MDN</a>
   */
  public native void disconnect(@Nonnull AudioParam destinationParam, int output);
}
