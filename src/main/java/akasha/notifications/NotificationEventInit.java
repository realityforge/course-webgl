package akasha.notifications;

import akasha.ExtendableEventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface NotificationEventInit extends ExtendableEventInit {
  @JsOverlay
  @Nonnull
  static NotificationEventInit create(@Nonnull final Notification notification) {
    return Js.<NotificationEventInit>uncheckedCast( JsPropertyMap.of() ).notification( notification );
  }

  @JsProperty(
      name = "action"
  )
  String action();

  @JsProperty
  void setAction(@Nonnull String action);

  @JsOverlay
  @Nonnull
  default NotificationEventInit action(@Nonnull final String action) {
    setAction( action );
    return this;
  }

  @JsProperty(
      name = "notification"
  )
  @Nonnull
  Notification notification();

  @JsProperty
  void setNotification(@Nonnull Notification notification);

  @JsOverlay
  @Nonnull
  default NotificationEventInit notification(@Nonnull final Notification notification) {
    setNotification( notification );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default NotificationEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default NotificationEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default NotificationEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
