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
public interface PageTransitionEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static PageTransitionEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "persisted"
  )
  boolean persisted();

  @JsProperty
  void setPersisted(boolean persisted);

  @JsOverlay
  @Nonnull
  default PageTransitionEventInit persisted(final boolean persisted) {
    setPersisted( persisted );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PageTransitionEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PageTransitionEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PageTransitionEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
