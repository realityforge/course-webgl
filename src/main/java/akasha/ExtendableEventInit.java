package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface ExtendableEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static ExtendableEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsOverlay
  @Nonnull
  @Override
  default ExtendableEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ExtendableEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ExtendableEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
