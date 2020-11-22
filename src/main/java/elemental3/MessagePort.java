package elemental3;

import elemental3.core.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The MessagePort interface of the Channel Messaging API represents one of the two ports of a MessageChannel, allowing messages to be sent from one port and listening out for them arriving at the other.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessagePort">MessagePort - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#message-ports">The definition of 'Message ports' in the 'HTML Living Standard' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MessagePort"
)
public class MessagePort extends EventTarget implements Transferable {
  /**
   * The onmessage event handler of the MessagePort interface is an EventListener, called whenever an MessageEvent of type message is fired on the port &mdash; that is, when the port receives a message.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessagePort/onmessage">MessagePort.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#handler-messageport-onmessage">The definition of 'onmessage' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public MessageEventHandler onmessage;

  /**
   * The onmessageerror event handler of the MessagePort interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on the port&mdash;that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessagePort/onmessageerror">MessagePort.onmessageerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#handler-messageport-onmessageerror">The definition of 'onmessageerror' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public MessageEventHandler onmessageerror;

  protected MessagePort() {
  }

  /**
   * The close() method of the MessagePort interface disconnects the port, so it is no longer active. This stops the flow of messages to that port.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessagePort/close">MessagePort.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-messageport-close">The definition of 'close()' in the 'HTML Living Standard' specification.</a>
   */
  public native void close();

  /**
   * The postMessage() method of the MessagePort interface sends a message from the port, and optionally, transfers ownership of objects to other browsing contexts.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessagePort/postMessage">MessagePort.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-messageport-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull JsArray<Transferable> transfer);

  /**
   * The postMessage() method of the MessagePort interface sends a message from the port, and optionally, transfers ownership of objects to other browsing contexts.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessagePort/postMessage">MessagePort.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-messageport-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull Transferable[] transfer);

  /**
   * The postMessage() method of the MessagePort interface sends a message from the port, and optionally, transfers ownership of objects to other browsing contexts.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessagePort/postMessage">MessagePort.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-messageport-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull PostMessageOptions options);

  /**
   * The postMessage() method of the MessagePort interface sends a message from the port, and optionally, transfers ownership of objects to other browsing contexts.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessagePort/postMessage">MessagePort.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-messageport-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message);

  /**
   * The start() method of the MessagePort interface starts the sending of messages queued on the port. This method is only needed when using EventTarget.addEventListener; it is implied when using MessageChannel.onmessage.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessagePort/start">MessagePort.start - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-messageport-start">The definition of 'start()' in the 'HTML Living Standard' specification.</a>
   */
  public native void start();

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "messageerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "messageerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "messageerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "messageerror", Js.cast( callback ) );
  }
}
