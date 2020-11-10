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
 * The EcKeyGenParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.generateKey(), when generating any elliptic-curve-based key pair: that is, when the algorithm is identified as either of ECDSA or ECDH.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EcKeyGenParams">EcKeyGenParams - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-EcKeyGenParams">The definition of 'SubtleCrypto.EcKeyGenParams' in the 'Web Cryptography API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface EcKeyGenParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static EcKeyGenParams create(@Nonnull final String name, @Nonnull final String namedCurve) {
    return Js.<EcKeyGenParams>uncheckedCast( JsPropertyMap.of() ).name( name ).namedCurve( namedCurve );
  }

  @JsProperty(
      name = "namedCurve"
  )
  @Nonnull
  String namedCurve();

  @JsProperty
  void setNamedCurve(@Nonnull String namedCurve);

  @JsOverlay
  @Nonnull
  default EcKeyGenParams namedCurve(@Nonnull final String namedCurve) {
    setNamedCurve( namedCurve );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default EcKeyGenParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
