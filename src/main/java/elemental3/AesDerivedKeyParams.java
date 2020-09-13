package elemental3;

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
public interface AesDerivedKeyParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static AesDerivedKeyParams create(@Nonnull final String name, final int length) {
    return Js.<AesDerivedKeyParams>uncheckedCast( JsPropertyMap.of() ).name( name ).length( length );
  }

  @JsProperty(
      name = "length"
  )
  int length();

  @JsProperty
  void setLength(int length);

  @JsOverlay
  @Nonnull
  default AesDerivedKeyParams length(final int length) {
    setLength( length );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AesDerivedKeyParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
