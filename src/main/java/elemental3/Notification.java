package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
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
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Notification"
)
public class Notification extends EventTarget {
  @Nullable
  public EventHandler onclick;

  @Nullable
  public EventHandler onclose;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onshow;

  /**
   * The Notification() constructor creates a new Notification object instance, which represents a user notification.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification">Notification.Notification - MDN</a>
   */
  public Notification(@Nonnull final String title, @Nonnull final NotificationOptions options) {
  }

  /**
   * The Notification() constructor creates a new Notification object instance, which represents a user notification.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/Notification">Notification.Notification - MDN</a>
   */
  public Notification(@Nonnull final String title) {
  }

  @JsProperty(
      name = "actions"
  )
  @Nonnull
  public native JsArray<NotificationAction> actions();

  @JsProperty(
      name = "badge"
  )
  @Nonnull
  public native String badge();

  @JsProperty(
      name = "body"
  )
  @Nonnull
  public native String body();

  @JsProperty(
      name = "data"
  )
  @Nullable
  public native Any data();

  @JsProperty(
      name = "dir"
  )
  @Nonnull
  public native String dir();

  @JsProperty(
      name = "icon"
  )
  @Nonnull
  public native String icon();

  @JsProperty(
      name = "image"
  )
  @Nonnull
  public native String image();

  @JsProperty(
      name = "lang"
  )
  @Nonnull
  public native String lang();

  @JsProperty(
      name = "maxActions"
  )
  public native int maxActions();

  @JsProperty(
      name = "permission"
  )
  @Nonnull
  public native String permission();

  @JsProperty(
      name = "renotify"
  )
  public native boolean renotify();

  @JsProperty(
      name = "requireInteraction"
  )
  public native boolean requireInteraction();

  @JsProperty(
      name = "silent"
  )
  public native boolean silent();

  @JsProperty(
      name = "tag"
  )
  @Nonnull
  public native String tag();

  @JsProperty(
      name = "timestamp"
  )
  public native int timestamp();

  @JsProperty(
      name = "title"
  )
  @Nonnull
  public native String title();

  @JsProperty(
      name = "vibrate"
  )
  @Nonnull
  public native JsArray<Double> vibrate();

  /**
   * The requestPermission() method of the Notification interface requests permission from the user for the current origin to display notifications.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/requestPermission">Notification.requestPermission - MDN</a>
   */
  @Nonnull
  public static native Promise<String> requestPermission(
      @Nonnull NotificationPermissionCallback deprecatedCallback);

  /**
   * The requestPermission() method of the Notification interface requests permission from the user for the current origin to display notifications.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Notification/requestPermission">Notification.requestPermission - MDN</a>
   */
  @Nonnull
  public static native Promise<String> requestPermission();

  public native void close();
}
