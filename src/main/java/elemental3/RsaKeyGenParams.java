package elemental3;

import elemental3.core.Uint8Array;
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
    name = "?"
)
public interface RsaKeyGenParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static RsaKeyGenParams create(@Nonnull final String name, final int modulusLength,
      @Nonnull final Uint8Array publicExponent) {
    return Js.<RsaKeyGenParams>uncheckedCast( JsPropertyMap.of() ).name( name ).modulusLength( modulusLength ).publicExponent( publicExponent );
  }

  @JsProperty(
      name = "modulusLength"
  )
  int modulusLength();

  @JsProperty
  void setModulusLength(int modulusLength);

  @JsOverlay
  @Nonnull
  default RsaKeyGenParams modulusLength(final int modulusLength) {
    setModulusLength( modulusLength );
    return this;
  }

  @JsProperty(
      name = "publicExponent"
  )
  @Nonnull
  Uint8Array publicExponent();

  @JsProperty
  void setPublicExponent(@Nonnull Uint8Array publicExponent);

  @JsOverlay
  @Nonnull
  default RsaKeyGenParams publicExponent(@Nonnull final Uint8Array publicExponent) {
    setPublicExponent( publicExponent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RsaKeyGenParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
