package akasha.speech;

import akasha.EventInit;
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
    name = "Object"
)
public interface SpeechRecognitionErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static SpeechRecognitionErrorEventInit create(
      @SpeechRecognitionErrorCode @Nonnull final String error) {
    return Js.<SpeechRecognitionErrorEventInit>uncheckedCast( JsPropertyMap.of() ).error( error );
  }

  @JsProperty(
      name = "error"
  )
  @SpeechRecognitionErrorCode
  @Nonnull
  String error();

  @JsProperty
  void setError(@SpeechRecognitionErrorCode @Nonnull String error);

  @JsOverlay
  @Nonnull
  default SpeechRecognitionErrorEventInit error(
      @SpeechRecognitionErrorCode @Nonnull final String error) {
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
