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
public interface HmacKeyAlgorithm extends KeyAlgorithm {
  @JsOverlay
  @Nonnull
  static HmacKeyAlgorithm create(@Nonnull final String name, @Nonnull final KeyAlgorithm hash,
      final int length) {
    return Js.<HmacKeyAlgorithm>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).length( length );
  }

  @JsProperty(
      name = "hash"
  )
  @Nonnull
  KeyAlgorithm hash();

  @JsProperty
  void setHash(@Nonnull KeyAlgorithm hash);

  @JsOverlay
  @Nonnull
  default HmacKeyAlgorithm hash(@Nonnull final KeyAlgorithm hash) {
    setHash( hash );
    return this;
  }

  @JsProperty(
      name = "length"
  )
  int length();

  @JsProperty
  void setLength(int length);

  @JsOverlay
  @Nonnull
  default HmacKeyAlgorithm length(final int length) {
    setLength( length );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default HmacKeyAlgorithm name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
