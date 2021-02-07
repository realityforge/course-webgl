package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * A Number &mdash; the length in bits of the key to generate. This must be one of: 128, 192, or 256.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesKeyGenParams">AesKeyGenParams - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-AesKeyGenParams">SubtleCrypto.AesKeyGenParams - Web Cryptography API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface AesKeyGenParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static AesKeyGenParams create(@Nonnull final String name, final int length) {
    return Js.<AesKeyGenParams>uncheckedCast( JsPropertyMap.of() ).name( name ).length( length );
  }

  @JsProperty(
      name = "length"
  )
  int length();

  @JsProperty
  void setLength(int length);

  @JsOverlay
  @Nonnull
  default AesKeyGenParams length(final int length) {
    setLength( length );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AesKeyGenParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
