package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AbortController interface represents a controller object that allows you to abort one or more Web requests as and when desired.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbortController">AbortController - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-abortcontroller">AbortController - DOM</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AbortController"
)
public class AbortController {
  /**
   * The AbortController() constructor creates a new AbortController object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbortController/AbortController">AbortController.AbortController - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-abortcontroller-abortcontroller">AbortController() - DOM</a>
   */
  public AbortController() {
  }

  /**
   * The signal read-only property of the AbortController interface returns an AbortSignal object instance, which can be used to communicate with/abort a DOM request as desired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbortController/signal">AbortController.signal - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-abortcontroller-signal">signal - DOM</a>
   */
  @JsProperty(
      name = "signal"
  )
  @Nonnull
  public native AbortSignal signal();

  /**
   * The abort() method of the AbortController interface aborts a DOM request (e.g. a Fetch request) before it has completed. This is able to abort fetch requests, consumption of any response Body, and streams.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbortController/abort">AbortController.abort - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-abortcontroller-abort">abort() - DOM</a>
   */
  public native void abort();
}
