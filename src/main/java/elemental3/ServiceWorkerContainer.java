package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

/**
 * The ServiceWorkerContainer interface of the Service Worker API provides an object representing the service worker as an overall unit in the network ecosystem, including facilities to register, unregister and update service workers, and access the state of service workers and their registrations.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer">ServiceWorkerContainer - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ServiceWorkerContainer"
)
public class ServiceWorkerContainer extends EventTarget {
  @Nullable
  public EventHandler oncontrollerchange;

  /**
   * The onmessage property of the ServiceWorkerContainer interface is an event handler fired whenever a message event occurs &mdash; when incoming messages are received to the ServiceWorkerContainer object (e.g., via a Client.postMessage() call).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/onmessage">ServiceWorkerContainer.onmessage - MDN</a>
   */
  @Nullable
  public MessageEventHandler onmessage;

  @Nullable
  public EventHandler onmessageerror;

  ServiceWorkerContainer() {
  }

  /**
   * The controller read-only property of the ServiceWorkerContainer interface returns a ServiceWorker object if its state is activating or activated (the same object returned by ServiceWorkerRegistration.active). This property returns null if the request is a force refresh (Shift + refresh) or if there is no active worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/controller">ServiceWorkerContainer.controller - MDN</a>
   */
  @JsProperty(
      name = "controller"
  )
  @Nullable
  public native ServiceWorker controller();

  @JsProperty(
      name = "ready"
  )
  @Nonnull
  public native Promise<ServiceWorkerRegistration> ready();

  /**
   * The getRegistration() method of the ServiceWorkerContainer interface gets a ServiceWorkerRegistration object whose scope URL matches the provided document URL.  The method returns a Promise that resolves to a ServiceWorkerRegistration or undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/getRegistration">ServiceWorkerContainer.getRegistration - MDN</a>
   */
  @Nonnull
  public native Promise<Any> getRegistration(@Nonnull String clientURL);

  /**
   * The getRegistration() method of the ServiceWorkerContainer interface gets a ServiceWorkerRegistration object whose scope URL matches the provided document URL.  The method returns a Promise that resolves to a ServiceWorkerRegistration or undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/getRegistration">ServiceWorkerContainer.getRegistration - MDN</a>
   */
  @Nonnull
  public native Promise<Any> getRegistration();

  /**
   * The getRegistrations() method of the ServiceWorkerContainer interface gets all ServiceWorkerRegistrations associated with a ServiceWorkerContainer, in an array. The method returns a Promise that resolves to an array of ServiceWorkerRegistration.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/getRegistrations">ServiceWorkerContainer.getRegistrations - MDN</a>
   */
  @Nonnull
  public native Promise<JsArray<ServiceWorkerRegistration>> getRegistrations();

  /**
   * The register() method of the ServiceWorkerContainer interface creates or updates a ServiceWorkerRegistration for the given scriptURL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/register">ServiceWorkerContainer.register - MDN</a>
   */
  @Nonnull
  public native Promise<ServiceWorkerRegistration> register(@Nonnull String scriptURL,
      @Nonnull RegistrationOptions options);

  /**
   * The register() method of the ServiceWorkerContainer interface creates or updates a ServiceWorkerRegistration for the given scriptURL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/register">ServiceWorkerContainer.register - MDN</a>
   */
  @Nonnull
  public native Promise<ServiceWorkerRegistration> register(@Nonnull String scriptURL);

  /**
   * The startMessages() method of the ServiceWorkerContainer interface explicitly starts the flow of messages being dispatched from a service worker to pages under its control (e.g. sent via Client.postMessage()). This can be used to react to sent messages earlier, even before that page's content has finished loading.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/startMessages">ServiceWorkerContainer.startMessages - MDN</a>
   */
  public native void startMessages();

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback,
      final boolean options) {
    addEventListener( "message", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "message", Js.cast( callback ) );
  }
}