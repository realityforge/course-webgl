package elemental3.notifications;

import elemental3.VibratePattern;
import elemental3.core.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface NotificationOptions {
  @JsOverlay
  @Nonnull
  static NotificationOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "actions"
  )
  JsArray<NotificationAction> actions();

  @JsProperty
  void setActions(@Nonnull JsArray<NotificationAction> actions);

  @JsOverlay
  @Nonnull
  default NotificationOptions actions(@Nonnull final JsArray<NotificationAction> actions) {
    setActions( actions );
    return this;
  }

  @JsOverlay
  default void setActions(@Nonnull final NotificationAction... actions) {
    setActions( Js.<JsArray<NotificationAction>>uncheckedCast( actions ) );
  }

  @JsOverlay
  @Nonnull
  default NotificationOptions actions(@Nonnull final NotificationAction... actions) {
    setActions( actions );
    return this;
  }

  @JsProperty(
      name = "badge"
  )
  String badge();

  @JsProperty
  void setBadge(@Nonnull String badge);

  @JsOverlay
  @Nonnull
  default NotificationOptions badge(@Nonnull final String badge) {
    setBadge( badge );
    return this;
  }

  @JsProperty(
      name = "body"
  )
  String body();

  @JsProperty
  void setBody(@Nonnull String body);

  @JsOverlay
  @Nonnull
  default NotificationOptions body(@Nonnull final String body) {
    setBody( body );
    return this;
  }

  @JsProperty(
      name = "data"
  )
  @Nullable
  Any data();

  @JsProperty
  void setData(@DoNotAutobox @Nullable Object data);

  @JsOverlay
  @Nonnull
  default NotificationOptions data(@DoNotAutobox @Nullable final Object data) {
    setData( data );
    return this;
  }

  @JsProperty(
      name = "dir"
  )
  @NotificationDirection
  String dir();

  @JsProperty
  void setDir(@NotificationDirection @Nonnull String dir);

  @JsOverlay
  @Nonnull
  default NotificationOptions dir(@NotificationDirection @Nonnull final String dir) {
    setDir( dir );
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
  default NotificationOptions icon(@Nonnull final String icon) {
    setIcon( icon );
    return this;
  }

  @JsProperty(
      name = "image"
  )
  String image();

  @JsProperty
  void setImage(@Nonnull String image);

  @JsOverlay
  @Nonnull
  default NotificationOptions image(@Nonnull final String image) {
    setImage( image );
    return this;
  }

  @JsProperty(
      name = "lang"
  )
  String lang();

  @JsProperty
  void setLang(@Nonnull String lang);

  @JsOverlay
  @Nonnull
  default NotificationOptions lang(@Nonnull final String lang) {
    setLang( lang );
    return this;
  }

  @JsProperty(
      name = "renotify"
  )
  boolean renotify();

  @JsProperty
  void setRenotify(boolean renotify);

  @JsOverlay
  @Nonnull
  default NotificationOptions renotify(final boolean renotify) {
    setRenotify( renotify );
    return this;
  }

  @JsProperty(
      name = "requireInteraction"
  )
  boolean requireInteraction();

  @JsProperty
  void setRequireInteraction(boolean requireInteraction);

  @JsOverlay
  @Nonnull
  default NotificationOptions requireInteraction(final boolean requireInteraction) {
    setRequireInteraction( requireInteraction );
    return this;
  }

  @JsProperty(
      name = "silent"
  )
  boolean silent();

  @JsProperty
  void setSilent(boolean silent);

  @JsOverlay
  @Nonnull
  default NotificationOptions silent(final boolean silent) {
    setSilent( silent );
    return this;
  }

  @JsProperty(
      name = "tag"
  )
  String tag();

  @JsProperty
  void setTag(@Nonnull String tag);

  @JsOverlay
  @Nonnull
  default NotificationOptions tag(@Nonnull final String tag) {
    setTag( tag );
    return this;
  }

  @JsProperty(
      name = "timestamp"
  )
  int timestamp();

  @JsProperty
  void setTimestamp(int timestamp);

  @JsOverlay
  @Nonnull
  default NotificationOptions timestamp(final int timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsProperty(
      name = "vibrate"
  )
  VibratePattern vibrate();

  @JsProperty
  void setVibrate(@Nonnull VibratePattern vibrate);

  @JsOverlay
  @Nonnull
  default NotificationOptions vibrate(@Nonnull final VibratePattern vibrate) {
    setVibrate( vibrate );
    return this;
  }

  @JsOverlay
  default void setVibrate(final int vibrate) {
    setVibrate( VibratePattern.of( vibrate ) );
  }

  @JsOverlay
  @Nonnull
  default NotificationOptions vibrate(final int vibrate) {
    setVibrate( vibrate );
    return this;
  }

  @JsOverlay
  default void setVibrate(@Nonnull final JsArray<Double> vibrate) {
    setVibrate( VibratePattern.of( vibrate ) );
  }

  @JsOverlay
  @Nonnull
  default NotificationOptions vibrate(@Nonnull final JsArray<Double> vibrate) {
    setVibrate( vibrate );
    return this;
  }

  @JsOverlay
  default void setVibrate(@Nonnull final double... vibrate) {
    setVibrate( VibratePattern.of( vibrate ) );
  }

  @JsOverlay
  @Nonnull
  default NotificationOptions vibrate(@Nonnull final double... vibrate) {
    setVibrate( vibrate );
    return this;
  }
}
