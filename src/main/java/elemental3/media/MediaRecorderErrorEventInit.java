package elemental3.media;

import elemental3.DOMException;
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
public interface MediaRecorderErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static MediaRecorderErrorEventInit create(@Nonnull final DOMException error) {
    return Js.<MediaRecorderErrorEventInit>uncheckedCast( JsPropertyMap.of() ).error( error );
  }

  @JsProperty(
      name = "error"
  )
  @Nonnull
  DOMException error();

  @JsProperty
  void setError(@Nonnull DOMException error);

  @JsOverlay
  @Nonnull
  default MediaRecorderErrorEventInit error(@Nonnull final DOMException error) {
    setError( error );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaRecorderErrorEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaRecorderErrorEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaRecorderErrorEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
