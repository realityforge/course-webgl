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
public interface PublicKeyCredentialParameters {
  @JsOverlay
  @Nonnull
  static PublicKeyCredentialParameters create(final int alg,
      @PublicKeyCredentialType @Nonnull final String type) {
    return Js.<PublicKeyCredentialParameters>uncheckedCast( JsPropertyMap.of() ).alg( alg ).type( type );
  }

  @JsProperty(
      name = "alg"
  )
  int alg();

  @JsProperty
  void setAlg(int alg);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialParameters alg(final int alg) {
    setAlg( alg );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @PublicKeyCredentialType
  @Nonnull
  String type();

  @JsProperty
  void setType(@PublicKeyCredentialType @Nonnull String type);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialParameters type(@PublicKeyCredentialType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
