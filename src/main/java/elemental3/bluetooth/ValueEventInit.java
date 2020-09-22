package elemental3.bluetooth;

import elemental3.EventInit;
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
public interface ValueEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static ValueEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "value"
  )
  @Nullable
  Any value();

  @JsProperty
  void setValue(@DoNotAutobox @Nullable Object value);

  @JsOverlay
  @Nonnull
  default ValueEventInit value(@DoNotAutobox @Nullable final Object value) {
    setValue( value );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ValueEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ValueEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ValueEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
