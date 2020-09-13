package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface SpeechRecognitionErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static SpeechRecognitionErrorEventInit create(
      @MagicConstant(valuesFromClass = SpeechRecognitionErrorCode.class) @Nonnull final String error) {
    return Js.<SpeechRecognitionErrorEventInit>uncheckedCast( JsPropertyMap.of() ).error( error );
  }

  @JsProperty(
      name = "error"
  )
  @MagicConstant(
      valuesFromClass = SpeechRecognitionErrorCode.class
  )
  @Nonnull
  String error();

  @JsProperty
  void setError(
      @MagicConstant(valuesFromClass = SpeechRecognitionErrorCode.class) @Nonnull String error);

  @JsOverlay
  @Nonnull
  default SpeechRecognitionErrorEventInit error(
      @MagicConstant(valuesFromClass = SpeechRecognitionErrorCode.class) @Nonnull final String error) {
    setError( error );
    return this;
  }

  @JsProperty(
      name = "message"
  )
  String message();

  @JsProperty
  void setMessage(@Nonnull String message);

  @JsOverlay
  @Nonnull
  default SpeechRecognitionErrorEventInit message(@Nonnull final String message) {
    setMessage( message );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechRecognitionErrorEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechRecognitionErrorEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechRecognitionErrorEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
