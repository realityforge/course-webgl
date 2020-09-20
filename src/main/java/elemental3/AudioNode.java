package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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
  /**
   * The channelCount property of the AudioNode interface represents an integer used to determine how many channels are used when up-mixing and down-mixing connections to any inputs to the node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/channelCount">AudioNode.channelCount - MDN</a>
   */
  public int channelCount;

  /**
   * The channelCountMode property of the AudioNode interface represents an enumerated value describing the way channels must be matched between the node's inputs and outputs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/channelCountMode">AudioNode.channelCountMode - MDN</a>
   */
  @Nonnull
  @ChannelCountMode
  public String channelCountMode;

  /**
   * When the number of channels doesn't match between an input and an output, up- or down-mixing happens according the following rules. This can be somewhat controlled by setting the AudioNode.channelInterpretation property to speakers or discrete:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/channelInterpretation">AudioNode.channelInterpretation - MDN</a>
   */
  @Nonnull
  @ChannelInterpretation
  public String channelInterpretation;

  protected AudioNode() {
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

  /**
   * The numberOfInputs property of the AudioNode interface returns the number of inputs feeding the node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/numberOfInputs">AudioNode.numberOfInputs - MDN</a>
   */
  @JsProperty(
      name = "numberOfInputs"
  )
  public native int numberOfInputs();

  /**
   * The numberOfOutputs property of the AudioNode interface returns the number of outputs coming out of the node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNode/numberOfOutputs">AudioNode.numberOfOutputs - MDN</a>
   */
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
