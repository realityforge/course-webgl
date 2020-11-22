package elemental3;

import elemental3.core.ArrayBuffer;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PushSubscription interface of the Push API provides a subcription's URL endpoint and allows unsubscription from a push service.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushSubscription">PushSubscription - MDN</a>
 * @see <a href="https://w3c.github.io/push-api/#pushsubscription-interface">The definition of 'PushSubscription' in the 'Push API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PushSubscription"
)
public class PushSubscription {
  protected PushSubscription() {
  }

  /**
   * The endpoint read-only property of the PushSubscription interface returns a USVString containing the endpoint associated with the push subscription.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushSubscription/endpoint">PushSubscription.endpoint - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushsubscription-endpoint">The definition of 'endPoint' in the 'Push API' specification.</a>
   */
  @JsProperty(
      name = "endpoint"
  )
  @Nonnull
  public native String endpoint();

  /**
   * The expirationTime read-only property of the PushSubscription interface returns a DOMHighResTimeStamp of the subscription expiration time associated with the push subscription, if there is one, or null otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushSubscription/expirationTime">PushSubscription.expirationTime - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushsubscription-expirationtime">The definition of 'expirationTime' in the 'Push API' specification.</a>
   */
  @JsProperty(
      name = "expirationTime"
  )
  @Nullable
  public native int expirationTime();

  /**
   * The options read-only property of the PushSubscription interface is an object containing containing the options used to create the subscription.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushSubscription/options">PushSubscription.options - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushsubscription-options">The definition of 'options' in the 'Push API' specification.</a>
   */
  @JsProperty(
      name = "options"
  )
  @Nonnull
  public native PushSubscriptionOptions options();

  /**
   * The getKey() method of the PushSubscription interface returns an ArrayBuffer representing a client public key, which can then be sent to a server and used in encrypting push message data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushSubscription/getKey">PushSubscription.getKey - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/">Push API</a>
   */
  @Nullable
  public native ArrayBuffer getKey(@PushEncryptionKeyName @Nonnull String name);

  /**
   * The toJSON() method of the PushSubscription interface is a standard serializer: it returns a JSON representation of the subscription properties, providing a useful shortcut.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushSubscription/toJSON">PushSubscription.toJSON - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushsubscription-tojson">The definition of 'PushSubscription: toJSON' in the 'Push API' specification.</a>
   */
  @Nonnull
  public native PushSubscriptionJSON toJSON();

  /**
   * The unsubscribe() method of the PushSubscription interface returns a Promise that resolves to a Boolean when the current subscription is successfully unsubscribed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushSubscription/unsubscribe">PushSubscription.unsubscribe - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushsubscription-unsubscribe">The definition of 'unsubscribe()' in the 'Push API' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> unsubscribe();
}
