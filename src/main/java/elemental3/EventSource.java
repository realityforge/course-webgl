package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The EventSource interface is web content's interface to server-sent events. An EventSource instance opens a persistent connection to an HTTP server, which sends events in text/event-stream format.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventSource">EventSource - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/server-sent-events.html#the-eventsource-interface">EventSource - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EventSource"
)
public class EventSource extends EventTarget {
  @JsOverlay
  public static final int CLOSED = 2;

  @JsOverlay
  public static final int CONNECTING = 0;

  @JsOverlay
  public static final int OPEN = 1;

  /**
   * The onerror property of the EventSource interface is an EventHandler called when an error occurs and the error event is dispatched on an EventSource object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventSource/onerror">EventSource.onerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#handler-eventsource-onerror">onerror - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onerror;

  /**
   * The onmessage property of the EventSource interface is an EventHandler called when a message event is received, that is when a message is coming from the source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventSource/onmessage">EventSource.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#handler-eventsource-onmessage">onmessage - HTML Living Standard</a>
   */
  @Nullable
  public MessageEventHandler onmessage;

  /**
   * The onopen property of the EventSource interface is an EventHandler called when an open event is received, that is when the connection was just opened.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventSource/onopen">EventSource.onopen - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#handler-eventsource-onopen">onopen - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onopen;

  /**
   * The EventSource() constructor returns a newly-created EventSource, which represents a remote resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventSource/EventSource">EventSource.EventSource - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#dom-eventsource">EventSource() - HTML Living Standard</a>
   */
  public EventSource(@Nonnull final String url,
      @Nonnull final EventSourceInit eventSourceInitDict) {
  }

  /**
   * The EventSource() constructor returns a newly-created EventSource, which represents a remote resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventSource/EventSource">EventSource.EventSource - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#dom-eventsource">EventSource() - HTML Living Standard</a>
   */
  public EventSource(@Nonnull final String url) {
  }

  /**
   * The readyState read-only property of the EventSource interface returns a number representing the state of the connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventSource/readyState">EventSource.readyState - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#dom-eventsource-readystate">readyState - HTML Living Standard</a>
   */
  @JsProperty(
      name = "readyState"
  )
  @EventSourceReadyState
  public native int readyState();

  /**
   * The url read-only property of the EventSource interface returns a DOMString representing the URL of the source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventSource/url">EventSource.url - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#dom-eventsource-url">url - HTML Living Standard</a>
   */
  @JsProperty(
      name = "url"
  )
  @Nonnull
  public native String url();

  /**
   * The withCredentials read-only property of the EventSource interface returns a Boolean indicating whether the EventSource object was instantiated with CORS credentials set.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventSource/withCredentials">EventSource.withCredentials - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#dom-eventsource-withcredentials">withCredentials - HTML Living Standard</a>
   */
  @JsProperty(
      name = "withCredentials"
  )
  public native boolean withCredentials();

  /**
   * The close() method of the EventSource interface closes the connection, if one is made, and sets the EventSource.readyState attribute to 2 (closed).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventSource/close">EventSource.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#dom-eventsource-close">close() - HTML Living Standard</a>
   */
  public native void close();

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
  public final void addOpenListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "open", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOpenListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "open", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addOpenListener(@Nonnull final EventListener callback) {
    addEventListener( "open", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeOpenListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "open", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOpenListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "open", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeOpenListener(@Nonnull final EventListener callback) {
    removeEventListener( "open", Js.cast( callback ) );
  }
}
