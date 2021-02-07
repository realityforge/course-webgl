package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MessageChannel interface of the Channel Messaging API allows us to create a new message channel and send data through it via its two MessagePort properties.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessageChannel">MessageChannel - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#message-channels">Message channels - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MessageChannel"
)
public class MessageChannel {
  /**
   * The MessageChannel() constructor of the MessageChannel interface returns a new MessageChannel object with two new MessagePort objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessageChannel/MessageChannel">MessageChannel.MessageChannel - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-messagechannel">MessageChannel() - HTML Living Standard</a>
   */
  public MessageChannel() {
  }

  /**
   * The port1 read-only property of the MessageChannel interface returns the first port of the message channel &mdash; the port attached to the context that originated the channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessageChannel/port1">MessageChannel.port1 - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-messagechannel-port1">port1 - HTML Living Standard</a>
   */
  @JsProperty(
      name = "port1"
  )
  @Nonnull
  public native MessagePort port1();

  /**
   * The port2 read-only property of the MessageChannel interface returns the second port of the message channel &mdash; the port attached to the context at the other end of the channel, which the message is initially sent to.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessageChannel/port2">MessageChannel.port2 - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-messagechannel-port2">port2 - HTML Living Standard</a>
   */
  @JsProperty(
      name = "port2"
  )
  @Nonnull
  public native MessagePort port2();
}
