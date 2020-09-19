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
public interface SpeechSynthesisErrorEventInit extends SpeechSynthesisEventInit {
  @JsOverlay
  @Nonnull
  static SpeechSynthesisErrorEventInit create(@Nonnull final SpeechSynthesisUtterance utterance,
      @SpeechSynthesisErrorCode @Nonnull final String error) {
    return Js.<SpeechSynthesisErrorEventInit>uncheckedCast( JsPropertyMap.of() ).utterance( utterance ).error( error );
  }

  @JsProperty(
      name = "error"
  )
  @SpeechSynthesisErrorCode
  @Nonnull
  String error();

  @JsProperty
  void setError(@SpeechSynthesisErrorCode @Nonnull String error);

  @JsOverlay
  @Nonnull
  default SpeechSynthesisErrorEventInit error(
      @SpeechSynthesisErrorCode @Nonnull final String error) {
    setError( error );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechSynthesisErrorEventInit charIndex(final int charIndex) {
    setCharIndex( charIndex );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechSynthesisErrorEventInit charLength(final int charLength) {
    setCharLength( charLength );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechSynthesisErrorEventInit elapsedTime(final float elapsedTime) {
    setElapsedTime( elapsedTime );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechSynthesisErrorEventInit name(@Nonnull final String name) {
    setName( name );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechSynthesisErrorEventInit utterance(
      @Nonnull final SpeechSynthesisUtterance utterance) {
    setUtterance( utterance );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechSynthesisErrorEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechSynthesisErrorEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechSynthesisErrorEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
