package elemental3;

import elemental3.core.ArrayBuffer;
import elemental3.core.ArrayBufferView;
import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The WebSocket object provides the API for creating and managing a WebSocket connection to a server, as well as for sending and receiving data on the connection.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket">WebSocket - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebSocket"
)
public class WebSocket extends EventTarget {
  @JsOverlay
  public static final int CLOSED = 3;

  @JsOverlay
  public static final int CLOSING = 2;

  @JsOverlay
  public static final int CONNECTING = 0;

  @JsOverlay
  public static final int OPEN = 1;

  /**
   * The WebSocket.binaryType property returns the type of binary data being transmitted by the connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/binaryType">WebSocket.binaryType - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket-binarytype">The definition of 'WebSocket: binaryType' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  @BinaryType
  public String binaryType;

  /**
   * The WebSocket.onclose property is an EventHandler that is called when the WebSocket connection's readyState changes to CLOSED. It is called with a CloseEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/onclose">WebSocket.onclose - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-websocket-onclose">The definition of 'WebSocket: onclose' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public CloseEventHandler onclose;

  /**
   * The WebSocket interface's onerror event handler property is a function which gets called when an error occurs on the WebSocket.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/onerror">WebSocket.onerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-websocket-onerror">The definition of 'WebSocket: onerror' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onerror;

  /**
   * The WebSocket.onmessage property is an EventHandler that is called when a message is received from the server. It is called with a MessageEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/onmessage">WebSocket.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-websocket-onmessage">The definition of 'WebSocket: onmessage' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public MessageEventHandler onmessage;

  /**
   * The WebSocket.onopen property is an EventHandler that is called when the WebSocket connection's readyState changes to 1; this indicates that the connection is ready to send and receive data. It is called with an Event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/onopen">WebSocket.onopen - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-websocket-onopen">The definition of 'WebSocket: onopen' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onopen;

  /**
   * The WebSocket() constructor returns a new WebSocket object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/WebSocket">WebSocket.WebSocket - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket">The definition of 'the WebSocket constructor' in the 'HTML Living Standard' specification.</a>
   */
  public WebSocket(@Nonnull final String url, @Nonnull final String protocols) {
  }

  /**
   * The WebSocket() constructor returns a new WebSocket object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/WebSocket">WebSocket.WebSocket - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket">The definition of 'the WebSocket constructor' in the 'HTML Living Standard' specification.</a>
   */
  public WebSocket(@Nonnull final String url, @Nonnull final JsArray<String> protocols) {
  }

  /**
   * The WebSocket() constructor returns a new WebSocket object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/WebSocket">WebSocket.WebSocket - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket">The definition of 'the WebSocket constructor' in the 'HTML Living Standard' specification.</a>
   */
  public WebSocket(@Nonnull final String url, @Nonnull final String[] protocols) {
  }

  /**
   * The WebSocket() constructor returns a new WebSocket object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/WebSocket">WebSocket.WebSocket - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket">The definition of 'the WebSocket constructor' in the 'HTML Living Standard' specification.</a>
   */
  public WebSocket(@Nonnull final String url) {
  }

  /**
   * The WebSocket.bufferedAmount read-only property returns the number of bytes of data that have been queued using calls to send() but not yet transmitted to the network. This value resets to zero once all queued data has been sent. This value does not reset to zero when the connection is closed; if you keep calling send(), this will continue to climb.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/bufferedAmount">WebSocket.bufferedAmount - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket-bufferedamount">The definition of 'WebSocket: bufferedAmount' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "bufferedAmount"
  )
  public native int bufferedAmount();

  /**
   * The WebSocket.extensions read-only property returns the extensions selected by the server. This is currently only the empty string or a list of extensions as negotiated by the connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/extensions">WebSocket.extensions - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket-extensions">The definition of 'WebSocket: extensions' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "extensions"
  )
  @Nonnull
  public native String extensions();

  /**
   * The WebSocket.protocol read-only property returns the name of the sub-protocol the server selected; this will be one of the strings specified in the protocols parameter when creating the WebSocket object, or the empty string if no connection is established.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/protocol">WebSocket.protocol - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket-protocol">The definition of 'WebSocket: protocol' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "protocol"
  )
  @Nonnull
  public native String protocol();

  /**
   * The WebSocket.readyState read-only property returns the current state of the WebSocket connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/readyState">WebSocket.readyState - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket-readystate">The definition of 'WebSocket: readyState' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "readyState"
  )
  @WebSocketReadyState
  public native int readyState();

  /**
   * The WebSocket.url read-only property returns the absolute URL of the WebSocket as resolved by the constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/url">WebSocket.url - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket-url">The definition of 'WebSocket: url' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "url"
  )
  @Nonnull
  public native String url();

  /**
   * The WebSocket.close() method closes the WebSocket connection or connection attempt, if any. If the connection is already CLOSED, this method does nothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/close">WebSocket.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-sockets.html#dom-websocket-close">The definition of 'WebSocket.close()' in the 'HTML Living Standard' specification.</a>
   */
  public native void close(int code, @Nonnull String reason);

  /**
   * The WebSocket.close() method closes the WebSocket connection or connection attempt, if any. If the connection is already CLOSED, this method does nothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/close">WebSocket.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-sockets.html#dom-websocket-close">The definition of 'WebSocket.close()' in the 'HTML Living Standard' specification.</a>
   */
  public native void close(int code);

  /**
   * The WebSocket.close() method closes the WebSocket connection or connection attempt, if any. If the connection is already CLOSED, this method does nothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/close">WebSocket.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-sockets.html#dom-websocket-close">The definition of 'WebSocket.close()' in the 'HTML Living Standard' specification.</a>
   */
  public native void close();

  /**
   * The WebSocket.send() method enqueues the specified data to be transmitted to the server over the WebSocket connection, increasing the value of bufferedAmount by the number of bytes needed to contain the data. If the data can't be sent (for example, because it needs to be buffered but the buffer is full), the socket is closed automatically.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/send">WebSocket.send - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket-send">The definition of 'WebSocket: send' in the 'HTML Living Standard' specification.</a>
   */
  public native void send(@Nonnull String data);

  /**
   * The WebSocket.send() method enqueues the specified data to be transmitted to the server over the WebSocket connection, increasing the value of bufferedAmount by the number of bytes needed to contain the data. If the data can't be sent (for example, because it needs to be buffered but the buffer is full), the socket is closed automatically.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/send">WebSocket.send - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket-send">The definition of 'WebSocket: send' in the 'HTML Living Standard' specification.</a>
   */
  public native void send(@Nonnull Blob data);

  /**
   * The WebSocket.send() method enqueues the specified data to be transmitted to the server over the WebSocket connection, increasing the value of bufferedAmount by the number of bytes needed to contain the data. If the data can't be sent (for example, because it needs to be buffered but the buffer is full), the socket is closed automatically.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/send">WebSocket.send - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket-send">The definition of 'WebSocket: send' in the 'HTML Living Standard' specification.</a>
   */
  public native void send(@Nonnull ArrayBuffer data);

  /**
   * The WebSocket.send() method enqueues the specified data to be transmitted to the server over the WebSocket connection, increasing the value of bufferedAmount by the number of bytes needed to contain the data. If the data can't be sent (for example, because it needs to be buffered but the buffer is full), the socket is closed automatically.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/send">WebSocket.send - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-websocket-send">The definition of 'WebSocket: send' in the 'HTML Living Standard' specification.</a>
   */
  public native void send(@Nonnull ArrayBufferView data);

  @JsOverlay
  public final void addCloseListener(@Nonnull final CloseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "close", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCloseListener(@Nonnull final CloseEventListener callback,
      final boolean useCapture) {
    addEventListener( "close", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCloseListener(@Nonnull final CloseEventListener callback) {
    addEventListener( "close", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCloseListener(@Nonnull final CloseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "close", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCloseListener(@Nonnull final CloseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "close", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCloseListener(@Nonnull final CloseEventListener callback) {
    removeEventListener( "close", Js.cast( callback ) );
  }

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
  public final void addErrorListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
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
