package akasha.notifications;

import akasha.EventHandler;
import akasha.EventTarget;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The Notification interface of the Notifications API is used to configure and display desktop notifications to the user.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification">Notification - MDN</a>
 * @see <a href="https://notifications.spec.whatwg.org/">Notifications API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Notification"
)
public class Notification extends EventTarget {
  /**
   * The onclick property of the Notification interface specifies an event listener to receive click events. These events occur when the user clicks on a displayed Notification.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/onclick">Notification.onclick - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-onclick">onclick - Notifications API</a>
   */
  @Nullable
  public EventHandler onclick;

  /**
   * The onclose property of the Notification interface specifies an event listener to receive close events. These events occur when a Notification is closed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/onclose">Notification.onclose - MDN</a>
   */
  @Nullable
  public EventHandler onclose;

  /**
   * The onerror property of the Notification interface specifies an event listener to receive error events. These events occur when something goes wrong with a Notification (in many cases an error preventing the notification from being displayed.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/onerror">Notification.onerror - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-onerror">onerror - Notifications API</a>
   */
  @Nullable
  public EventHandler onerror;

  /**
   * The onshow property of the Notification interface specifies an event listener to receive show events. These events occur when a Notification is displayed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/onshow">Notification.onshow - MDN</a>
   */
  @Nullable
  public EventHandler onshow;

  /**
   * The Notification() constructor creates a new Notification object instance, which represents a user notification.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification">Notification.Notification - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-notification">Notification() constructor - Notifications API</a>
   */
  public Notification(@Nonnull final String title, @Nonnull final NotificationOptions options) {
  }

  /**
   * The Notification() constructor creates a new Notification object instance, which represents a user notification.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification">Notification.Notification - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-notification">Notification() constructor - Notifications API</a>
   */
  public Notification(@Nonnull final String title) {
  }

  /**
   * The actions read-only property of the Notification interface returns the list of NotificationAction objects set using the actions option when creating the notification using the Notification() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/actions">Notification.actions - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-actions">actions - Notifications API</a>
   */
  @JsProperty(
      name = "actions"
  )
  @Nonnull
  public native JsArray<NotificationAction> actions();

  /**
   * The badge property of the Notification interface returns the URL of the image used to represent the notification when there is not enough space to display the notification itself.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/badge">Notification.badge - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-badge">badge - Notifications API</a>
   */
  @JsProperty(
      name = "badge"
  )
  @Nonnull
  public native String badge();

  /**
   * The body read-only property of the Notification interface indicates the body string of the notification, as specified in the body option of the Notification() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/body">Notification.body - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-body">body - Notifications API</a>
   */
  @JsProperty(
      name = "body"
  )
  @Nonnull
  public native String body();

  /**
   * The data read-only property of the Notification interface returns a structured clone of the notification's data, as specified in the data option of the Notification() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/data">Notification.data - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-data">data - Notifications API</a>
   */
  @JsProperty(
      name = "data"
  )
  @Nullable
  public native Any data();

  /**
   * The dir read-only property of the Notification interface indicates the text direction of the notification, as specified in the dir option of the Notification() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/dir">Notification.dir - MDN</a>
   */
  @JsProperty(
      name = "dir"
  )
  @Nonnull
  @NotificationDirection
  public native String dir();

  /**
   * The icon read-only property of the Notification interface contains the URL of an icon to be displayed as part of the notification, as specified in the icon option of the Notification() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/icon">Notification.icon - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-icon">icon - Notifications API</a>
   */
  @JsProperty(
      name = "icon"
  )
  @Nonnull
  public native String icon();

  /**
   * The image read-only property of the Notification interface contains the URL of an image to be displayed as part of the notification
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/image">Notification.image - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#image-resource">image - Notifications API</a>
   */
  @JsProperty(
      name = "image"
  )
  @Nonnull
  public native String image();

  /**
   * The lang read-only property of the Notification interface indicates the language used in the notification, as specified in the lang option of the Notification() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/lang">Notification.lang - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-lang">lang - Notifications API</a>
   */
  @JsProperty(
      name = "lang"
  )
  @Nonnull
  public native String lang();

  /**
   * The maxActions attribute of the Notification interface returns the maximum number of actions supported by the device and the User Agent. Effectively, this is the maximum number of elements in Notification.actions array which will be respected by the User Agent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/maxActions">Notification.maxActions - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/">Notifications API</a>
   */
  @JsProperty(
      name = "maxActions"
  )
  public static native int maxActions();

  /**
   * The permission read-only property of the Notification interface indicates the current permission granted by the user for the current origin to display web notifications.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/permission">Notification.permission - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-permission">permission - Notifications API</a>
   */
  @JsProperty(
      name = "permission"
  )
  @Nonnull
  @NotificationPermission
  public static native String permission();

  /**
   * The renotify read-only property of the Notification interface specifies whether the user should be notified after a new notification replaces an old one, as specified in the renotify option of the Notification() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/renotify">Notification.renotify - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-renotify">renotify - Notifications API</a>
   */
  @JsProperty(
      name = "renotify"
  )
  public native boolean renotify();

  /**
   * The requireInteraction read-only property of the Notification interface returns a Boolean indicating that a notification should remain active until the user clicks or dismisses it, rather than closing automatically.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/requireInteraction">Notification.requireInteraction - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-requireinteraction">requireInteraction - Notifications API</a>
   */
  @JsProperty(
      name = "requireInteraction"
  )
  public native boolean requireInteraction();

  /**
   * The silent read-only property of the Notification interface specifies whether the notification should be silent, i.e., no sounds or vibrations should be issued, regardless of the device settings. This is specified in the silent option of the Notification() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/silent">Notification.silent - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-silent">silent - Notifications API</a>
   */
  @JsProperty(
      name = "silent"
  )
  public native boolean silent();

  /**
   * The tag read-only property of the Notification interface signifies an identifying tag for the notification, as specified in the tag option of the Notification() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/tag">Notification.tag - MDN</a>
   */
  @JsProperty(
      name = "tag"
  )
  @Nonnull
  public native String tag();

  /**
   * The timestamp read-only property of the Notification interface returns a DOMTimeStamp, as specified in the timestamp option of the Notification() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/timestamp">Notification.timestamp - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-timestamp">timestamp - Notifications API</a>
   */
  @JsProperty(
      name = "timestamp"
  )
  public native int timestamp();

  /**
   * The title read-only property of the Notification interface indicates the title of the notification, as specified in the title parameter of the Notification() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/title">Notification.title - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-title">title - Notifications API</a>
   */
  @JsProperty(
      name = "title"
  )
  @Nonnull
  public native String title();

  /**
   * The vibrate read-only property of the Notification interface specifies a a vibration pattern for the device's vibration hardware to emit when the notification fires. This is specified in the vibrate option of the Notification() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/vibrate">Notification.vibrate - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/#dom-notification-vibrate">vibrate - Notifications API</a>
   */
  @JsProperty(
      name = "vibrate"
  )
  @Nonnull
  public native JsArray<Double> vibrate();

  /**
   * The requestPermission() method of the Notification interface requests permission from the user for the current origin to display notifications.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/requestPermission">Notification.requestPermission - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/">Notifications API</a>
   */
  @Nonnull
  public static native Promise<String> requestPermission(
      @Nonnull NotificationPermissionCallback deprecatedCallback);

  /**
   * The requestPermission() method of the Notification interface requests permission from the user for the current origin to display notifications.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/requestPermission">Notification.requestPermission - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/">Notifications API</a>
   */
  @Nonnull
  public static native Promise<String> requestPermission();

  /**
   * The close() method of the Notification interface is used to close/remove a previously displayed notification.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/close">Notification.close - MDN</a>
   * @see <a href="https://notifications.spec.whatwg.org/">Notifications API</a>
   */
  public native void close();
}
