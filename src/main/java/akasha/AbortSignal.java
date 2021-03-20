package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The AbortSignal interface represents a signal object that allows you to communicate with a DOM request (such as a Fetch) and abort it if required via an AbortController object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal">AbortSignal - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-AbortSignal">AbortSignal - DOM</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AbortSignal"
)
public class AbortSignal extends EventTarget {
  /**
   * The onabort read-only property of the FetchSignal interface is an event handler Invoked when an abort event fires, i.e. when the fetch request(s) the signal is communicating with is/are aborted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal/onabort">AbortSignal.onabort - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-abortsignal-aborted">onabort - DOM</a>
   */
  @Nullable
  public EventHandler onabort;

  protected AbortSignal() {
  }

  /**
   * The aborted read-only property returns a Boolean that indicates whether the DOM request(s) the signal is communicating with is/are aborted (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal/aborted">AbortSignal.aborted - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-abortsignal-onabort">onabort - DOM</a>
   */
  @JsProperty(
      name = "aborted"
  )
  public native boolean aborted();

  @Nonnull
  public static native AbortSignal abort();

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "abort", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback) {
    addEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "abort", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback) {
    removeEventListener( "abort", Js.cast( callback ) );
  }
}
