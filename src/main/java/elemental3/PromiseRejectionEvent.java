package elemental3;

import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The PromiseRejectionEvent interface represents events which are sent to the global script context when JavaScript Promises are rejected.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PromiseRejectionEvent">PromiseRejectionEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#promiserejectionevent">The definition of 'PromiseRejectionEvent' in the 'HTML Living Standard' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PromiseRejectionEvent"
)
public class PromiseRejectionEvent extends Event {
  /**
   * The PromiseRejectionEvent() constructor returns a newly created PromiseRejectionEvent, which represents events fired when a JavaScript Promise is rejected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PromiseRejectionEvent/PromiseRejectionEvent">PromiseRejectionEvent.PromiseRejectionEvent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#the-promiserejectionevent-interface">The definition of 'the PromiseRejectionEvent interface' in the 'HTML Living Standard' specification.</a>
   */
  public PromiseRejectionEvent(@Nonnull final String type,
      @Nonnull final PromiseRejectionEventInit eventInitDict) {
    super( null );
  }

  /**
   * The PromiseRejectionEvent interface's promise read-only property indicates the JavaScript Promise which was rejected. You can examine the event's PromiseRejectionEvent.reason property to learn why the promise was rejected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PromiseRejectionEvent/promise">PromiseRejectionEvent.promise - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-promiserejectionevent-promise">The definition of 'PromiseRejectionEvent.promise' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "promise"
  )
  @Nonnull
  public native Promise<Any> promise();

  /**
   * The PromiseRejectionEvent reason read-only property is any JavaScript value or Object which provides the reason passed into Promise.reject(). This in theory provides information about why the promise was rejected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PromiseRejectionEvent/reason">PromiseRejectionEvent.reason - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-promiserejectionevent-reason">The definition of 'PromiseRejectionEvent.reason' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "reason"
  )
  @Nullable
  public native Any reason();
}
