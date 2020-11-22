package elemental3.rtc;

import elemental3.AddEventListenerOptions;
import elemental3.BinaryType;
import elemental3.Blob;
import elemental3.EventHandler;
import elemental3.EventListener;
import elemental3.EventListenerOptions;
import elemental3.EventTarget;
import elemental3.MessageEventHandler;
import elemental3.MessageEventListener;
import elemental3.core.ArrayBuffer;
import elemental3.core.ArrayBufferView;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The RTCDataChannel interface represents a network channel which can be used for bidirectional peer-to-peer transfers of arbitrary data. Every data channel is associated with an RTCPeerConnection, and each peer connection can have up to a theoretical maximum of 65,534 data channels (the actual limit may vary from browser to browser).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel">RTCDataChannel - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#rtcdatachannel">The definition of 'RTCDataChannel' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCDataChannel"
)
public class RTCDataChannel extends EventTarget {
  /**
   * The property binaryType on the RTCDataChannel interface is a DOMString which specifies the type of JavaScript object which should be used to represent binary data received on the RTCDataChannel. Values allowed by the WebSocket.binaryType property are also permitted here: &quot;blob&quot; if Blob objects are being used or &quot;arraybuffer&quot; if ArrayBuffer objects are being used. The default is &quot;blob&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/binaryType">RTCDataChannel.binaryType - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-datachannel-binarytype">The definition of 'RTCDataChannel.binaryType' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @Nonnull
  @BinaryType
  public String binaryType;

  /**
   * The RTCDataChannel property bufferedAmountLowThreshold is used to specify the number of bytes of buffered outgoing data that is considered &quot;low.&quot; The default value is 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/bufferedAmountLowThreshold">RTCDataChannel.bufferedAmountLowThreshold - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannel-bufferedamountlowthreshold">The definition of 'RTCDataChannel.bufferedAmountLowThreshold' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  public int bufferedAmountLowThreshold;

  /**
   * The RTCDataChannel.onbufferedamountlow property is an EventHandler which specifies a function the browser calls when the bufferedamountlow event is sent to the RTCDataChannel. This event, which is represented by a simple Event object, is sent when the amount of data buffered to be sent falls to or below the threshold specified by the channel's bufferedAmountLowThreshold.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/onbufferedamountlow">RTCDataChannel.onbufferedamountlow - MDN</a>
   */
  @Nullable
  public EventHandler onbufferedamountlow;

  /**
   * The RTCDataChannel.onclose property is an EventHandler which specifies a function to be called by the browser when the close event is received by the RTCDataChannel. This is a simple Event which indicates that the data channel has closed down.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/onclose">RTCDataChannel.onclose - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannel-onclose">The definition of 'RTCDataChannel.onclose' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @Nullable
  public EventHandler onclose;

  /**
   * The RTCDataChannel.onclosing property is an EventHandler which specifies a function to be called by the browser when the closing event is received by the RTCDataChannel. This is a simple Event which indicates that the data channel is being closed, that is, RTCDataChannel transitions to &quot;closing&quot; state. For example, after RTCDataChannel.close() was called but the underlying data transport might not have been closed yet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/onclosing">RTCDataChannel.onclosing - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannel-onclosing">The definition of 'RTCDataChannel.onclosing' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @Nullable
  public EventHandler onclosing;

  /**
   * The RTCDataChannel.onerror property is an EventHandler which specifies a function to be called when the error event is received. When an error occurs on the data channel, the function receives as input an ErrorEvent object describing the error which occurred.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/onerror">RTCDataChannel.onerror - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannel-onerror">The definition of 'RTCDataChannel.onerror' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @Nullable
  public RTCErrorEventHandler onerror;

  /**
   * The RTCDataChannel.onmessage property stores an EventHandler which specifies a function to be called when the message event is fired on the channel. This event is represented by the MessageEvent interface. This event is sent to the channel when a message is received from the other peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/onmessage">RTCDataChannel.onmessage - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannel-onmessage">The definition of 'RTCDataChannel.onmessage' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @Nullable
  public MessageEventHandler onmessage;

  /**
   * The RTCDataChannel.onopen property is an EventHandler which specifies a function to be called when the open event is fired; this is a simple Event which is sent when the data channel's underlying data transport&mdash;the link over which the RTCDataChannel's messages flow&mdash;is established or re-established.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/onopen">RTCDataChannel.onopen - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannel-onopen">The definition of 'RTCDataChannel.onopen' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @Nullable
  public RTCDataChannelEventHandler onopen;

  protected RTCDataChannel() {
  }

  /**
   * The read-only RTCDataChannel property bufferedAmount returns the number of bytes of data currently queued to be sent over the data channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/bufferedAmount">RTCDataChannel.bufferedAmount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-datachannel-bufferedamount">The definition of 'RTCDataChannel.bufferedAmount' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "bufferedAmount"
  )
  public native int bufferedAmount();

  /**
   * The read-only RTCDataChannel property id returns an ID number (between 0 and 65,534) which uniquely identifies the RTCDataChannel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/id">RTCDataChannel.id - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannel-id">The definition of 'RTCDataChannel.id' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "id"
  )
  @Nullable
  public native Double id();

  /**
   * The read-only RTCDataChannel property label returns a DOMString containing a name describing the data channel. These labels are not required to be unique.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/label">RTCDataChannel.label - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-datachannel-label">The definition of 'RTCDataChannel.label' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "label"
  )
  @Nonnull
  public native String label();

  /**
   * The read-only RTCDataChannel property maxPacketLifeTime returns the amount of time, in milliseconds, the browser is allowed to take to attempt to transmit a message, as set when the data channel was created, or null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/maxPacketLifeTime">RTCDataChannel.maxPacketLifeTime - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-datachannel-maxpacketlifetime">The definition of 'RTCDataChannel.maxPacketLifeTime' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "maxPacketLifeTime"
  )
  @Nullable
  public native Double maxPacketLifeTime();

  /**
   * The read-only RTCDataChannel property maxRetransmits returns the maximum number of times the browser should try to retransmit a message before giving up, as set when the data channel was created, or null, which indicates that there is no maximum.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/maxRetransmits">RTCDataChannel.maxRetransmits - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-datachannel-maxretransmits">The definition of 'RTCDataChannel.maxRetransmits' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "maxRetransmits"
  )
  @Nullable
  public native Double maxRetransmits();

  /**
   * The read-only RTCDataChannel property negotiated indicates whether the RTCDataChannel's connection was negotiated by the Web app (true) or by the WebRTC layer (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/negotiated">RTCDataChannel.negotiated - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-datachannel-negotiated">The definition of 'RTCDataChannel.negotiated' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "negotiated"
  )
  public native boolean negotiated();

  /**
   * The read-only RTCDataChannel property ordered indicates whether or not the data channel guarantees in-order delivery of messages; the default is true, which indicates that the data channel is indeed ordered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/ordered">RTCDataChannel.ordered - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-datachannel-ordered">The definition of 'RTCDataChannel.ordered' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "ordered"
  )
  public native boolean ordered();

  @JsProperty(
      name = "priority"
  )
  @Nonnull
  @RTCPriorityType
  public native String priority();

  /**
   * The read-only RTCDataChannel property protocol returns a DOMString containing the name of the subprotocol in use. If no protocol was specified when the data channel was created, then this property's value is &quot;&quot; (the empty string).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/protocol">RTCDataChannel.protocol - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-datachannel-protocol">The definition of 'RTCDataChannel.protocol' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "protocol"
  )
  @Nonnull
  public native String protocol();

  /**
   * The read-only RTCDataChannel property readyState returns an enum of type RTCDataChannelState which indicates the state of the data channel's underlying data connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/readyState">RTCDataChannel.readyState - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-datachannel-readystate">The definition of 'RTCDataChannel.readyState' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  @RTCDataChannelState
  public native String readyState();

  /**
   * The RTCDataChannel.close() method closes the RTCDataChannel. Either peer is permitted to call this method to initiate closure of the channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/close">RTCDataChannel.close - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannel-close">The definition of 'RTCDataChannel.close()' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  public native void close();

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannel-send">The definition of 'RTCDataChannel.send()' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  public native void send(@Nonnull String data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannel-send">The definition of 'RTCDataChannel.send()' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  public native void send(@Nonnull Blob data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannel-send">The definition of 'RTCDataChannel.send()' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  public native void send(@Nonnull ArrayBuffer data);

  /**
   * The send() method of the RTCDataChannel interface sends data across the data channel to the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannel/send">RTCDataChannel.send - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannel-send">The definition of 'RTCDataChannel.send()' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  public native void send(@Nonnull ArrayBufferView data);

  @JsOverlay
  public final void addErrorListener(@Nonnull final RTCErrorEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final RTCErrorEventListener callback,
      final boolean useCapture) {
    addEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final RTCErrorEventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final RTCErrorEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final RTCErrorEventListener callback,
      final boolean useCapture) {
    removeEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final RTCErrorEventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addOpenListener(@Nonnull final RTCDataChannelEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "open", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOpenListener(@Nonnull final RTCDataChannelEventListener callback,
      final boolean useCapture) {
    addEventListener( "open", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addOpenListener(@Nonnull final RTCDataChannelEventListener callback) {
    addEventListener( "open", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeOpenListener(@Nonnull final RTCDataChannelEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "open", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOpenListener(@Nonnull final RTCDataChannelEventListener callback,
      final boolean useCapture) {
    removeEventListener( "open", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeOpenListener(@Nonnull final RTCDataChannelEventListener callback) {
    removeEventListener( "open", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addBufferedamountlowListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "bufferedamountlow", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBufferedamountlowListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "bufferedamountlow", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addBufferedamountlowListener(@Nonnull final EventListener callback) {
    addEventListener( "bufferedamountlow", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeBufferedamountlowListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "bufferedamountlow", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBufferedamountlowListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "bufferedamountlow", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeBufferedamountlowListener(@Nonnull final EventListener callback) {
    removeEventListener( "bufferedamountlow", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCloseListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "close", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCloseListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "close", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCloseListener(@Nonnull final EventListener callback) {
    addEventListener( "close", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCloseListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "close", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCloseListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "close", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCloseListener(@Nonnull final EventListener callback) {
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
}
