package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface PublicKeyCredentialParameters {
  @JsOverlay
  @Nonnull
  static PublicKeyCredentialParameters create(final int alg,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
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
  @MagicConstant(
      valuesFromClass = PublicKeyCredentialType.class
  )
  @Nonnull
  String type();

  @JsProperty
  void setType(
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull String type);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialParameters type(
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    setType( type );
    return this;
  }
}
