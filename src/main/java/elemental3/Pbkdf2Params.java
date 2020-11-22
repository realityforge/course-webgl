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
 * The Pbkdf2Params dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.deriveKey(), when using the PBKDF2 algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Pbkdf2Params">Pbkdf2Params - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-Pbkdf2Params">The definition of 'SubtleCrypto.Pbkdf2Params' in the 'Web Cryptography API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface Pbkdf2Params extends Algorithm {
  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final BufferSource salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final BufferSource salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final BufferSource salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsProperty(
      name = "hash"
  )
  @Nonnull
  AlgorithmIdentifier hash();

  @JsProperty
  void setHash(@Nonnull AlgorithmIdentifier hash);

  @JsOverlay
  @Nonnull
  default Pbkdf2Params hash(@Nonnull final AlgorithmIdentifier hash) {
    setHash( hash );
    return this;
  }

  @JsOverlay
  default void setHash(@Nonnull final Object hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params hash(@Nonnull final Object hash) {
    setHash( hash );
    return this;
  }

  @JsOverlay
  default void setHash(@Nonnull final String hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params hash(@Nonnull final String hash) {
    setHash( hash );
    return this;
  }

  @JsProperty(
      name = "iterations"
  )
  int iterations();

  @JsProperty
  void setIterations(int iterations);

  @JsOverlay
  @Nonnull
  default Pbkdf2Params iterations(final int iterations) {
    setIterations( iterations );
    return this;
  }

  @JsProperty(
      name = "salt"
  )
  @Nonnull
  BufferSource salt();

  @JsProperty
  void setSalt(@Nonnull BufferSource salt);

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final BufferSource salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default Pbkdf2Params name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
