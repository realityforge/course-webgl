package elemental3;

import elemental3.core.JsArray;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PushManager interface of the Push API provides a way to receive notifications from third-party servers as well as request URLs for push notifications.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushManager">PushManager - MDN</a>
 * @see <a href="https://w3c.github.io/push-api/#pushmanager-interface">PushManager - Push API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PushManager"
)
public class PushManager {
  protected PushManager() {
  }

  /**
   * The supportedContentEncodings read-only property of the PushManager interface returns an array of supported content codings that can be used to encrypt the payload of a push message.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushManager/supportedContentEncodings">PushManager.supportedContentEncodings - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushmanager-supportedcontentencodings">supportedContentEncodings - Push API</a>
   */
  @JsProperty(
      name = "supportedContentEncodings"
  )
  @Nonnull
  public static native JsArray<String> supportedContentEncodings();

  /**
   * The PushManager.getSubscription() method of the PushManager interface retrieves an existing push subscription.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushManager/getSubscription">PushManager.getSubscription - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushmanager-getsubscription">getSubscription() - Push API</a>
   */
  @Nonnull
  public native Promise<PushSubscription> getSubscription();

  /**
   * The permissionState() method of the PushManager interface returns a Promise that resolves to a DOMString indicating the permission state of the push manager. Possible values are  'prompt', 'denied', or 'granted'.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushManager/permissionState">PushManager.permissionState - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushmanager-permissionstate">permissionState() - Push API</a>
   */
  @Nonnull
  public native Promise<String> permissionState(@Nonnull PushSubscriptionOptionsInit options);

  /**
   * The permissionState() method of the PushManager interface returns a Promise that resolves to a DOMString indicating the permission state of the push manager. Possible values are  'prompt', 'denied', or 'granted'.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushManager/permissionState">PushManager.permissionState - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushmanager-permissionstate">permissionState() - Push API</a>
   */
  @Nonnull
  public native Promise<String> permissionState();

  /**
   * The subscribe() method of the PushManager interface subscribes to a push service.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushManager/subscribe">PushManager.subscribe - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushmanager-subscribe">subscribe() - Push API</a>
   */
  @Nonnull
  public native Promise<PushSubscription> subscribe(@Nonnull PushSubscriptionOptionsInit options);

  /**
   * The subscribe() method of the PushManager interface subscribes to a push service.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushManager/subscribe">PushManager.subscribe - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushmanager-subscribe">subscribe() - Push API</a>
   */
  @Nonnull
  public native Promise<PushSubscription> subscribe();
}
