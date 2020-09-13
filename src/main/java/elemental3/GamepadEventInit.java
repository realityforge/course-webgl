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
public interface GamepadEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static GamepadEventInit create(@Nonnull final Gamepad gamepad) {
    return Js.<GamepadEventInit>uncheckedCast( JsPropertyMap.of() ).gamepad( gamepad );
  }

  @JsProperty(
      name = "gamepad"
  )
  @Nonnull
  Gamepad gamepad();

  @JsProperty
  void setGamepad(@Nonnull Gamepad gamepad);

  @JsOverlay
  @Nonnull
  default GamepadEventInit gamepad(@Nonnull final Gamepad gamepad) {
    setGamepad( gamepad );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default GamepadEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default GamepadEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default GamepadEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
