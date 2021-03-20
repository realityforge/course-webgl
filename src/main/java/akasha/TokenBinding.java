package akasha;

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
public interface TokenBinding {
  @JsOverlay
  @Nonnull
  static TokenBinding create(@TokenBindingStatus @Nonnull final String status) {
    return Js.<TokenBinding>uncheckedCast( JsPropertyMap.of() ).status( status );
  }

  @JsProperty(
      name = "id"
  )
  String id();

  @JsProperty
  void setId(@Nonnull String id);

  @JsOverlay
  @Nonnull
  default TokenBinding id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsProperty(
      name = "status"
  )
  @TokenBindingStatus
  @Nonnull
  String status();

  @JsProperty
  void setStatus(@TokenBindingStatus @Nonnull String status);

  @JsOverlay
  @Nonnull
  default TokenBinding status(@TokenBindingStatus @Nonnull final String status) {
    setStatus( status );
    return this;
  }
}
