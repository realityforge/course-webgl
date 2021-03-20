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
public interface CredentialData {
  @JsOverlay
  @Nonnull
  static CredentialData create(@Nonnull final String id) {
    return Js.<CredentialData>uncheckedCast( JsPropertyMap.of() ).id( id );
  }

  @JsProperty(
      name = "id"
  )
  @Nonnull
  String id();

  @JsProperty
  void setId(@Nonnull String id);

  @JsOverlay
  @Nonnull
  default CredentialData id(@Nonnull final String id) {
    setId( id );
    return this;
  }
}
