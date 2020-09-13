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
 * Listen to these events using addEventListener() or by assigning an event listener to the oneventname property of this interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDTMFSender">RTCDTMFSender - MDN</a>
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
   */
  @Nullable
  public RTCDTMFToneChangeEventHandler ontonechange;

  RTCDTMFSender() {
  }

  @JsProperty(
      name = "canInsertDTMF"
  )
  public native boolean canInsertDTMF();

  /**
   * The RTCDTMFSender interface's toneBuffer property returns a string containing a list of the DTMF tones currently queued for sending to the remote peer over the RTCPeerConnection. To place tones into the buffer, call insertDTMF().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDTMFSender/toneBuffer">RTCDTMFSender.toneBuffer - MDN</a>
   */
  @JsProperty(
      name = "toneBuffer"
  )
  @Nonnull
  public native String toneBuffer();

  public native void insertDTMF(@Nonnull String tones, int duration, int interToneGap);

  public native void insertDTMF(@Nonnull String tones, int duration);

  public native void insertDTMF(@Nonnull String tones);

  @JsOverlay
  public final void addTonechangeListener(@Nonnull final RTCDTMFToneChangeEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "tonechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTonechangeListener(@Nonnull final RTCDTMFToneChangeEventListener callback,
      final boolean options) {
    addEventListener( "tonechange", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "tonechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTonechangeListener(
      @Nonnull final RTCDTMFToneChangeEventListener callback) {
    removeEventListener( "tonechange", Js.cast( callback ) );
  }
}
