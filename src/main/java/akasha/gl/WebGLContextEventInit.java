package akasha.gl;

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
public interface WebGLContextEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static WebGLContextEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "statusMessage"
  )
  String statusMessage();

  @JsProperty
  void setStatusMessage(@Nonnull String statusMessage);

  @JsOverlay
  @Nonnull
  default WebGLContextEventInit statusMessage(@Nonnull final String statusMessage) {
    setStatusMessage( statusMessage );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WebGLContextEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WebGLContextEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WebGLContextEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
