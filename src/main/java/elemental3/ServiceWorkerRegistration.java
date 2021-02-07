package elemental3;

import elemental3.core.JsArray;
import elemental3.notifications.GetNotificationOptions;
import elemental3.notifications.Notification;
import elemental3.notifications.NotificationOptions;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ServiceWorkerRegistration interface of the Service Worker API represents the service worker registration. You register a service worker to control one or more pages that share the same origin.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration">ServiceWorkerRegistration - MDN</a>
 * @see <a href="https://w3c.github.io/ServiceWorker/#serviceworkerregistration">ServiceWorkerRegistration - Service Workers</a>
 * @see <a href="https://w3c.github.io/push-api/#dom-serviceworkerregistration-pushmanager">PushManager - Push API</a>
 * @see <a href="https://notifications.spec.whatwg.org/">Notifications API</a>
 * @see <a href="https://wicg.github.io/background-sync/spec/">Web Background Synchronization</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ServiceWorkerRegistration"
)
public class ServiceWorkerRegistration extends EventTarget {
  /**
   * The onupdatefound property of the ServiceWorkerRegistration interface is an EventListener property called whenever an event of type statechange is fired; it is fired any time the ServiceWorkerRegistration.installing property acquires a new service worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/onupdatefound">ServiceWorkerRegistration.onupdatefound - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-serviceworkerregistration-onupdatefound">ServiceWorkerRegistration.onupdatefound - Service Workers</a>
   */
  @Nullable
  public EventHandler onupdatefound;

  protected ServiceWorkerRegistration() {
  }

  /**
   * The active property of the ServiceWorkerRegistration interface returns a service worker whose ServiceWorker.state is activating or activated. This property is initially set to null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/active">ServiceWorkerRegistration.active - MDN</a>
   */
  @JsProperty(
      name = "active"
  )
  @Nullable
  public native ServiceWorker active();

  /**
   * The installing property of the ServiceWorkerRegistration interface returns a service worker whose ServiceWorker.state is installing. This property is initially set to null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/installing">ServiceWorkerRegistration.installing - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-serviceworkerregistration-installing">ServiceWorkerRegistration.installing - Service Workers</a>
   */
  @JsProperty(
      name = "installing"
  )
  @Nullable
  public native ServiceWorker installing();

  /**
   * The navigationPreload read-only property of the ServiceWorkerRegistration interface returns the NavigationPreloadManager associated with the current service worker registration.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/navigationPreload">ServiceWorkerRegistration.navigationPreload - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#service-worker-registration-navigationpreload">navigationPreload - Service Workers</a>
   */
  @JsProperty(
      name = "navigationPreload"
  )
  @Nonnull
  public native NavigationPreloadManager navigationPreload();

  /**
   * The pushManager property of the ServiceWorkerRegistration interface returns a reference to the PushManager interface for managing push subscriptions; this includes support for subscribing, getting an active subscription, and accessing push permission status.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/pushManager">ServiceWorkerRegistration.pushManager - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#pushmanager-interface">PushManager - Push API</a>
   */
  @JsProperty(
      name = "pushManager"
  )
  @Nonnull
  public native PushManager pushManager();

  /**
   * The scope read-only property of the ServiceWorkerRegistration interface returns a unique identifier for a service worker registration. The service worker must be on the same origin as the document that registers the ServiceWorker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/scope">ServiceWorkerRegistration.scope - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#dom-serviceworkerregistration-scope">ServiceWorkerRegistration.scope - Service Workers</a>
   */
  @JsProperty(
      name = "scope"
  )
  @Nonnull
  public native String scope();

  /**
   * The sync property of the ServiceWorkerRegistration interface returns a reference to the SyncManager interface, which manages background synchronization processes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/sync">ServiceWorkerRegistration.sync - MDN</a>
   * @see <a href="https://wicg.github.io/background-sync/spec/">Web Background Synchronization</a>
   */
  @JsProperty(
      name = "sync"
  )
  @Nonnull
  public native SyncManager sync();

  @JsProperty(
      name = "updateViaCache"
  )
  @Nonnull
  @ServiceWorkerUpdateViaCache
  public native String updateViaCache();

  /**
   * The waiting property of the ServiceWorkerRegistration interface returns a service worker whose ServiceWorker.state is installed. This property is initially set to null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/waiting">ServiceWorkerRegistration.waiting - MDN</a>
   */
  @JsProperty(
      name = "waiting"
  )
  @Nullable
  public native ServiceWorker waiting();

  /**
   * The unregister() method of the ServiceWorkerRegistration interface unregisters the service worker registration and returns a Promise. The promise will resolve to false if no registration was found, otherwise it resolves to true irrespective of whether unregistration happened or not (it may not unregister if someone else just called ServiceWorkerContainer.register() with the same scope.) The service worker will finish any ongoing operations before it is unregistered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/unregister">ServiceWorkerRegistration.unregister - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/navigator-service-worker-unregister">ServiceWorkerRegistration.unregister() - Service Workers</a>
   */
  @Nonnull
  public native Promise<Boolean> unregister();

  /**
   * The update() method of the ServiceWorkerRegistration interface attempts to update the service worker. It fetches the worker's script URL, and if the new worker is not byte-by-byte identical to the current worker, it installs the new worker. The fetch of the worker bypasses any browser caches if the previous fetch occurred over 24 hours ago.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/update">ServiceWorkerRegistration.update - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#service-worker-registration-update">ServiceWorkerRegistration.update() - Service Workers</a>
   */
  @Nonnull
  public native Promise<Void> update();

  /**
   * The getNotifications() method of the ServiceWorkerRegistration interface returns a list of the notifications in the order that they were created from the current origin via the current service worker registration. Origins can have many active but differently-scoped service worker registrations. Notifications created by one service worker on the same origin will not be available to other active services workers on that same origin.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/getNotifications">ServiceWorkerRegistration.getNotifications - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-serviceworkerregistration-getnotifications">ServiceWorkerRegistration.getNotifications() - Notifications API</a>
   */
  @Nonnull
  public native Promise<JsArray<Notification>> getNotifications(
      @Nonnull GetNotificationOptions filter);

  /**
   * The getNotifications() method of the ServiceWorkerRegistration interface returns a list of the notifications in the order that they were created from the current origin via the current service worker registration. Origins can have many active but differently-scoped service worker registrations. Notifications created by one service worker on the same origin will not be available to other active services workers on that same origin.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/getNotifications">ServiceWorkerRegistration.getNotifications - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-serviceworkerregistration-getnotifications">ServiceWorkerRegistration.getNotifications() - Notifications API</a>
   */
  @Nonnull
  public native Promise<JsArray<Notification>> getNotifications();

  /**
   * The showNotification() method of the ServiceWorkerRegistration interface creates a notification on an active service worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/showNotification">ServiceWorkerRegistration.showNotification - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-serviceworkerregistration-shownotification">showNotification() - Notifications API</a>
   */
  @Nonnull
  public native Promise<Void> showNotification(@Nonnull String title,
      @Nonnull NotificationOptions options);

  /**
   * The showNotification() method of the ServiceWorkerRegistration interface creates a notification on an active service worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerRegistration/showNotification">ServiceWorkerRegistration.showNotification - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-serviceworkerregistration-shownotification">showNotification() - Notifications API</a>
   */
  @Nonnull
  public native Promise<Void> showNotification(@Nonnull String title);
}
