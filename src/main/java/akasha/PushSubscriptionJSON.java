package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public interface PushSubscriptionJSON {
  @JsOverlay
  @Nonnull
  static PushSubscriptionJSON create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "endpoint"
  )
  String endpoint();

  @JsProperty
  void setEndpoint(@Nonnull String endpoint);

  @JsOverlay
  @Nonnull
  default PushSubscriptionJSON endpoint(@Nonnull final String endpoint) {
    setEndpoint( endpoint );
    return this;
  }

  @JsProperty(
      name = "expirationTime"
  )
  @Nullable
  int expirationTime();

  @JsProperty
  void setExpirationTime(@Nullable int expirationTime);

  @JsOverlay
  @Nonnull
  default PushSubscriptionJSON expirationTime(final int expirationTime) {
    setExpirationTime( expirationTime );
    return this;
  }

  @JsProperty(
      name = "keys"
  )
  JsPropertyMap<String> keys();

  @JsProperty
  void setKeys(@Nonnull JsPropertyMap<String> keys);

  @JsOverlay
  @Nonnull
  default PushSubscriptionJSON keys(@Nonnull final JsPropertyMap<String> keys) {
    setKeys( keys );
    return this;
  }
}
