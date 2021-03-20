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
public interface PublicKeyCredentialEntity {
  @JsOverlay
  @Nonnull
  static PublicKeyCredentialEntity create(@Nonnull final String name) {
    return Js.<PublicKeyCredentialEntity>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "icon"
  )
  String icon();

  @JsProperty
  void setIcon(@Nonnull String icon);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialEntity icon(@Nonnull final String icon) {
    setIcon( icon );
    return this;
  }

  @JsProperty(
      name = "name"
  )
  @Nonnull
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialEntity name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
