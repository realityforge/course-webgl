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
public interface SpeechRecognitionEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static SpeechRecognitionEventInit create(@Nonnull final SpeechRecognitionResultList results) {
    return Js.<SpeechRecognitionEventInit>uncheckedCast( JsPropertyMap.of() ).results( results );
  }

  @JsProperty(
      name = "resultIndex"
  )
  int resultIndex();

  @JsProperty
  void setResultIndex(int resultIndex);

  @JsOverlay
  @Nonnull
  default SpeechRecognitionEventInit resultIndex(final int resultIndex) {
    setResultIndex( resultIndex );
    return this;
  }

  @JsProperty(
      name = "results"
  )
  @Nonnull
  SpeechRecognitionResultList results();

  @JsProperty
  void setResults(@Nonnull SpeechRecognitionResultList results);

  @JsOverlay
  @Nonnull
  default SpeechRecognitionEventInit results(@Nonnull final SpeechRecognitionResultList results) {
    setResults( results );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechRecognitionEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechRecognitionEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SpeechRecognitionEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
