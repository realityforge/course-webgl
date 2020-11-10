package elemental3.notifications;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The NotificationAction interface of the Notifications API is used to represent action buttons the user can click to interact with notifications.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NotificationAction">NotificationAction - MDN</a>
 * @see <a href="https://notifications.spec.whatwg.org/">Notifications API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface NotificationAction {
  @JsOverlay
  @Nonnull
  static NotificationAction create(@Nonnull final String action, @Nonnull final String title) {
    return Js.<NotificationAction>uncheckedCast( JsPropertyMap.of() ).action( action ).title( title );
  }

  @JsProperty(
      name = "action"
  )
  @Nonnull
  String action();

  @JsProperty
  void setAction(@Nonnull String action);

  @JsOverlay
  @Nonnull
  default NotificationAction action(@Nonnull final String action) {
    setAction( action );
    return this;
  }

  @JsProperty(
      name = "icon"
  )
  String icon();

  @JsProperty
  void setIcon(@Nonnull String icon);

  @JsOverlay
  @Nonnull
  default NotificationAction icon(@Nonnull final String icon) {
    setIcon( icon );
    return this;
  }

  @JsProperty(
      name = "title"
  )
  @Nonnull
  String title();

  @JsProperty
  void setTitle(@Nonnull String title);

  @JsOverlay
  @Nonnull
  default NotificationAction title(@Nonnull final String title) {
    setTitle( title );
    return this;
  }
}
