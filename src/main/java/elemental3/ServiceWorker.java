package elemental3;

import elemental3.core.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ServiceWorker interface of the Service Worker API provides a reference to a service worker. Multiple browsing contexts (e.g. pages, workers, etc.) can be associated with the same service worker, each through a unique ServiceWorker object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorker">ServiceWorker - MDN</a>
 * @see <a href="https://w3c.github.io/ServiceWorker/#serviceworker">The definition of 'ServiceWorker' in the 'Service Workers' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ServiceWorker"
)
public class ServiceWorker extends EventTarget {
  /**
   * The AbstractWorker.onerror property of the AbstractWorker interface represents an EventHandler, that is a function to be called when the error event occurs and bubbles through the Worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorker/onerror">ServiceWorker.onerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-abstractworker-onerror">The definition of 'AbstractWorker.onerror' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onerror;

  /**
   * An EventListener property called whenever an event of type statechange is fired; it is basically fired anytime the ServiceWorker.state changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorker/onstatechange">ServiceWorker.onstatechange - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-serviceworker-onstatechange">The definition of 'ServiceWorker.onstatechange' in the 'Service Workers' specification.</a>
   */
  @Nullable
  public EventHandler onstatechange;

  protected ServiceWorker() {
  }

  /**
   * Returns the ServiceWorker serialized script URL defined as part of ServiceWorkerRegistration. Must be on the same origin as the document that registers the ServiceWorker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorker/scriptURL">ServiceWorker.scriptURL - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#service-worker-url">The definition of 'scriptURL' in the 'Service Workers' specification.</a>
   */
  @JsProperty(
      name = "scriptURL"
  )
  @Nonnull
  public native String scriptURL();

  /**
   * The state read-only property of the ServiceWorker interface returns a string representing the current state of the service worker. It can be one of the following values: installing, installed, activating, activated, or redundant.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorker/state">ServiceWorker.state - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#service-worker-state">The definition of 'state' in the 'Service Workers' specification.</a>
   */
  @JsProperty(
      name = "state"
  )
  @Nonnull
  @ServiceWorkerState
  public native String state();

  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull JsArray<Transferable> transfer);

  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull Transferable[] transfer);

  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull PostMessageOptions options);

  public native void postMessage(@DoNotAutobox @Nullable Object message);
}
