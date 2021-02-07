package elemental3;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The BroadcastChannel interface represents a named channel that any browsing context of a given origin can subscribe to. It allows communication between different documents (in different windows, tabs, frames or iframes) of the same origin. Messages are broadcasted via a message event fired at all BroadcastChannel objects listening to the channel.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel">BroadcastChannel - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#broadcastchannel">BroadcastChannel - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BroadcastChannel"
)
public class BroadcastChannel extends EventTarget {
  /**
   * The BroadcastChannel.onmessage event handler is a property that specifies the function to execute when a message event, of type MessageEvent, is received by this BroadcastChannel. Such an event is sent by the browser with a message broadcasted to the channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel/onmessage">BroadcastChannel.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#handler-broadcastchannel-onmessage">BroadcastChannel.onmessage - HTML Living Standard</a>
   */
  @Nullable
  public MessageEventHandler onmessage;

  /**
   * The onmessageerror event handler of the BroadcastChannel interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on the BroadcastChannel instance &mdash; that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel/onmessageerror">BroadcastChannel.onmessageerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-broadcastchannel-onmessageerror">onmessageerror - HTML Living Standard</a>
   */
  @Nullable
  public MessageEventHandler onmessageerror;

  /**
   * The BroadcastChannel() constructor creates a new BroadcastChannel and connects it to the underlying channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel/BroadcastChannel">BroadcastChannel.BroadcastChannel - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#dom-broadcastchannel">BroadcastChannel() - HTML Living Standard</a>
   */
  public BroadcastChannel(@Nonnull final String name) {
  }

  /**
   * The read-only BroadcastChannel.name property returns a DOMString, which uniquely identifies the given channel with its name. This name is passed to the BroadcastChannel() constructor at creation time and is therefore read-only.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel/name">BroadcastChannel.name - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#dom-broadcastchannel-name">BroadcastChannel.name - HTML Living Standard</a>
   */
  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  /**
   * The BroadcastChannel.close() terminates the connection to the underlying channel, allowing the object to be garbage collected. This is a necessary step to perform as there is no other way for a browser to know that this channel is not needed anymore.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel/close">BroadcastChannel.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#dom-broadcastchannel-close">BroadcastChannel.close() - HTML Living Standard</a>
   */
  public native void close();

  /**
   * The BroadcastChannel.postMessage() sends a message, which can be of any kind of Object, to each listener in any browsing context with the same origin. The message is transmitted as a message event targeted at each BroadcastChannel bound to the channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BroadcastChannel/postMessage">BroadcastChannel.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#dom-broadcastchannel-postmessage">BroadcastChannel.postmessage() - HTML Living Standard</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message);

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
