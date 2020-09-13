package elemental3;

import elemental2.core.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The ServiceWorker interface of the Service Worker API provides a reference to a service worker. Multiple browsing contexts (e.g. pages, workers, etc.) can be associated with the same service worker, each through a unique ServiceWorker object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorker">ServiceWorker - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ServiceWorker"
)
public class ServiceWorker extends EventTarget {
  @Nullable
  public EventHandler onstatechange;

  @Nullable
  public EventHandler onerror;

  ServiceWorker() {
  }

  /**
   * Returns the ServiceWorker serialized script URL defined as part of ServiceWorkerRegistration. Must be on the same origin as the document that registers the ServiceWorker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorker/scriptURL">ServiceWorker.scriptURL - MDN</a>
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
   */
  @JsProperty(
      name = "state"
  )
  @Nonnull
  public native String state();

  public native void postMessage(@Nullable Any message, @Nonnull JsArray<Object> transfer);

  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull JsArray<Object> transfer);

  public native void postMessage(@Nullable Any message, @Nonnull Object[] transfer);

  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull Object[] transfer);

  public native void postMessage(@Nullable Any message, @Nonnull PostMessageOptions options);

  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull PostMessageOptions options);

  public native void postMessage(@Nullable Any message);

  public native void postMessage(@DoNotAutobox @Nullable Object message);
}
