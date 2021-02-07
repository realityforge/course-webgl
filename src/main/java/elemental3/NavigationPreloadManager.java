package elemental3;

import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The NavigationPreloadManager interface of the Service Worker API provides methods for managing the preloading of resources with a service worker.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NavigationPreloadManager">NavigationPreloadManager - MDN</a>
 * @see <a href="https://w3c.github.io/ServiceWorker/#navigation-preload-manager">NavigationPreloadManager - Service Workers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NavigationPreloadManager"
)
public class NavigationPreloadManager {
  protected NavigationPreloadManager() {
  }

  @Nonnull
  public native Promise<Void> disable();

  @Nonnull
  public native Promise<Void> enable();

  @Nonnull
  public native Promise<NavigationPreloadState> getState();

  @Nonnull
  public native Promise<Void> setHeaderValue(@Nonnull String value);
}
