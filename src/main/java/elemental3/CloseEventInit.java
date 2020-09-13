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
public interface CloseEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static CloseEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "code"
  )
  int code();

  @JsProperty
  void setCode(int code);

  @JsOverlay
  @Nonnull
  default CloseEventInit code(final int code) {
    setCode( code );
    return this;
  }

  @JsProperty(
      name = "reason"
  )
  String reason();

  @JsProperty
  void setReason(@Nonnull String reason);

  @JsOverlay
  @Nonnull
  default CloseEventInit reason(@Nonnull final String reason) {
    setReason( reason );
    return this;
  }

  @JsProperty(
      name = "wasClean"
  )
  boolean wasClean();

  @JsProperty
  void setWasClean(boolean wasClean);

  @JsOverlay
  @Nonnull
  default CloseEventInit wasClean(final boolean wasClean) {
    setWasClean( wasClean );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CloseEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CloseEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CloseEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
