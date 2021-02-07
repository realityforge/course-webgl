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
 * The RsaPssParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.sign() or SubtleCrypto.verify(), when using the RSA-PSS algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RsaPssParams">RsaPssParams - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-RsaPssParams">SubtleCrypto.RsaPssParams - Web Cryptography API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RsaPssParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static RsaPssParams create(@Nonnull final String name, final int saltLength) {
    return Js.<RsaPssParams>uncheckedCast( JsPropertyMap.of() ).name( name ).saltLength( saltLength );
  }

  @JsProperty(
      name = "saltLength"
  )
  int saltLength();

  @JsProperty
  void setSaltLength(int saltLength);

  @JsOverlay
  @Nonnull
  default RsaPssParams saltLength(final int saltLength) {
    setSaltLength( saltLength );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RsaPssParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
