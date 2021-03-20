package akasha;

import akasha.core.ArrayBuffer;
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
public interface MediaKeyMessageEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static MediaKeyMessageEventInit create(@Nonnull final ArrayBuffer message,
      @MediaKeyMessageType @Nonnull final String messageType) {
    return Js.<MediaKeyMessageEventInit>uncheckedCast( JsPropertyMap.of() ).message( message ).messageType( messageType );
  }

  @JsProperty(
      name = "message"
  )
  @Nonnull
  ArrayBuffer message();

  @JsProperty
  void setMessage(@Nonnull ArrayBuffer message);

  @JsOverlay
  @Nonnull
  default MediaKeyMessageEventInit message(@Nonnull final ArrayBuffer message) {
    setMessage( message );
    return this;
  }

  @JsProperty(
      name = "messageType"
  )
  @MediaKeyMessageType
  @Nonnull
  String messageType();

  @JsProperty
  void setMessageType(@MediaKeyMessageType @Nonnull String messageType);

  @JsOverlay
  @Nonnull
  default MediaKeyMessageEventInit messageType(
      @MediaKeyMessageType @Nonnull final String messageType) {
    setMessageType( messageType );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaKeyMessageEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaKeyMessageEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaKeyMessageEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
