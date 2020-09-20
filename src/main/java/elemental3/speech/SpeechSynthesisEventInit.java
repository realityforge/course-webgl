package elemental3.speech;

import elemental3.EventInit;
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
public interface SpeechSynthesisEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static SpeechSynthesisEventInit create(@Nonnull final SpeechSynthesisUtterance utterance) {
    return Js.<SpeechSynthesisEventInit>uncheckedCast( JsPropertyMap.of() ).utterance( utterance );
  }

  @JsProperty(
      name = "charIndex"
  )
  int charIndex();

  @JsProperty
  void setCharIndex(int charIndex);

  @JsOverlay
  @Nonnull
  default SpeechSynthesisEventInit charIndex(final int charIndex) {
    setCharIndex( charIndex );
    return this;
  }

  @JsProperty(
      name = "charLength"
  )
  int charLength();

  @JsProperty
  void setCharLength(int charLength);

  @JsOverlay
  @Nonnull
  default SpeechSynthesisEventInit charLength(final int charLength) {
    setCharLength( charLength );
    return this;
  }

  @JsProperty(
      name = "elapsedTime"
  )
  float elapsedTime();

  @JsProperty
  void setElapsedTime(float elapsedTime);

  @JsOverlay
  @Nonnull
  default SpeechSynthesisEventInit elapsedTime(final float elapsedTime) {
    setElapsedTime( elapsedTime );
    return this;
  }

  @JsProperty(
      name = "name"
  )
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default SpeechSynthesisEventInit name(@Nonnull final String name) {
    setName( name );
    return this;
  }

  @JsProperty(
      name = "utterance"
  )
  @Nonnull
  SpeechSynthesisUtterance utterance();

  @JsProperty
  void setUtterance(@Nonnull SpeechSynthesisUtterance utterance);

  @JsOverlay
  @Nonnull
  default SpeechSynthesisEventInit utterance(@Nonnull final SpeechSynthesisUtterance utterance) {
    setUtterance( utterance );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechSynthesisEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechSynthesisEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechSynthesisEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
