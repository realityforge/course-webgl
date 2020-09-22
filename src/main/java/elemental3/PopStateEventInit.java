package elemental3;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface PopStateEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static PopStateEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "state"
  )
  @Nullable
  Any state();

  @JsProperty
  void setState(@DoNotAutobox @Nullable Object state);

  @JsOverlay
  @Nonnull
  default PopStateEventInit state(@DoNotAutobox @Nullable final Object state) {
    setState( state );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PopStateEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PopStateEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PopStateEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
