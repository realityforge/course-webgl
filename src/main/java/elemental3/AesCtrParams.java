package elemental3;

import elemental3.core.BufferSource;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The AesCtrParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the AES-CTR algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesCtrParams">AesCtrParams - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-AesCtrParams">The definition of 'SubtleCrypto.AesCtrParams' in the 'Web Cryptography API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface AesCtrParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final BufferSource counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsProperty(
      name = "counter"
  )
  @Nonnull
  BufferSource counter();

  @JsProperty
  void setCounter(@Nonnull BufferSource counter);

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final BufferSource counter) {
    setCounter( counter );
    return this;
  }

  @JsProperty(
      name = "length"
  )
  short length();

  @JsProperty
  void setLength(short length);

  @JsOverlay
  @Nonnull
  default AesCtrParams length(final short length) {
    setLength( length );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AesCtrParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
