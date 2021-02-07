package elemental3.rtc;

import elemental3.AddEventListenerOptions;
import elemental3.EventListenerOptions;
import elemental3.EventTarget;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The RTCDTMFSender interface provides a mechanism for transmitting DTMF codes on a WebRTC RTCPeerConnection. You gain access to the connection's RTCDTMFSender through the RTCRtpSender.dtmf property on the audio track you wish to send DTMF with.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDTMFSender">RTCDTMFSender - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#rtcdtmfsender">RTCDTMFSender - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCDTMFSender"
)
public class RTCDTMFSender extends EventTarget {
  /**
   * The ontonechange property of the RTCDTMFSender interface is used to set the event handler for the tonechange event, which is sent to the RTCDTMFSender each time a tone begins or ends. The event handler receives as input a single parameter of type RTCDTMFToneChangeEvent, which describes the change.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDTMFSender/ontonechange">RTCDTMFSender.ontonechange - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdtmfsender-ontonechange">ontonechange - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public RTCDTMFToneChangeEventHandler ontonechange;

  protected RTCDTMFSender() {
  }

  @JsProperty(
      name = "canInsertDTMF"
  )
  public native boolean canInsertDTMF();

  /**
   * The RTCDTMFSender interface's toneBuffer property returns a string containing a list of the DTMF tones currently queued for sending to the remote peer over the RTCPeerConnection. To place tones into the buffer, call insertDTMF().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDTMFSender/toneBuffer">RTCDTMFSender.toneBuffer - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-RTCDTMFSender-tonebuffer">RTCDTMFSender.toneBuffer - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "toneBuffer"
  )
  @Nonnull
  public native String toneBuffer();

  /**
   * The insertDTMF() method on the RTCDTMFSender interface starts sending tones to the remote peer over the RTCPeerConnection. Sending of the tones is performed asynchronously, with tonechange events sent to the RTCDTMFSender every time a tone starts or ends.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDTMFSender/insertDTMF">RTCDTMFSender.insertDTMF - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-RTCDTMFSender-insertDTMF">RTCDTMFSender.insertDTMF() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public native void insertDTMF(@Nonnull String tones, int duration, int interToneGap);

  /**
   * The insertDTMF() method on the RTCDTMFSender interface starts sending tones to the remote peer over the RTCPeerConnection. Sending of the tones is performed asynchronously, with tonechange events sent to the RTCDTMFSender every time a tone starts or ends.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDTMFSender/insertDTMF">RTCDTMFSender.insertDTMF - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-RTCDTMFSender-insertDTMF">RTCDTMFSender.insertDTMF() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public native void insertDTMF(@Nonnull String tones, int duration);

  /**
   * The insertDTMF() method on the RTCDTMFSender interface starts sending tones to the remote peer over the RTCPeerConnection. Sending of the tones is performed asynchronously, with tonechange events sent to the RTCDTMFSender every time a tone starts or ends.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDTMFSender/insertDTMF">RTCDTMFSender.insertDTMF - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-RTCDTMFSender-insertDTMF">RTCDTMFSender.insertDTMF() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public native void insertDTMF(@Nonnull String tones);

  @JsOverlay
  public final void addTonechangeListener(@Nonnull final RTCDTMFToneChangeEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "tonechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTonechangeListener(@Nonnull final RTCDTMFToneChangeEventListener callback,
      final boolean useCapture) {
    addEventListener( "tonechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTonechangeListener(@Nonnull final RTCDTMFToneChangeEventListener callback) {
    addEventListener( "tonechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTonechangeListener(@Nonnull final RTCDTMFToneChangeEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "tonechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTonechangeListener(@Nonnull final RTCDTMFToneChangeEventListener callback,
      final boolean useCapture) {
    removeEventListener( "tonechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTonechangeListener(
      @Nonnull final RTCDTMFToneChangeEventListener callback) {
    removeEventListener( "tonechange", Js.cast( callback ) );
  }
}
