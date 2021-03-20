package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The GamepadEvent interface of the Gamepad API contains references to gamepads connected to the system, which is what the gamepad events Window.gamepadconnected and Window.gamepaddisconnected are fired in response to.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadEvent">GamepadEvent - MDN</a>
 * @see <a href="https://w3c.github.io/gamepad/#gamepadevent-interface">GamepadEvent - Gamepad</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GamepadEvent"
)
public class GamepadEvent extends Event {
  /**
   * The GamepadEvent() constructor creates a new GamepadEvent object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadEvent/GamepadEvent">GamepadEvent.GamepadEvent - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#gamepadevent-interface">GamepadEvent_ - Gamepad</a>
   */
  public GamepadEvent(@Nonnull final String type, @Nonnull final GamepadEventInit eventInitDict) {
    super( null );
  }

  /**
   * The GamepadEvent.gamepad property of the GamepadEvent interface returns a Gamepad object, providing access to the associated gamepad data for fired gamepadconnected and gamepaddisconnected events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadEvent/gamepad">GamepadEvent.gamepad - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#dom-gamepadevent-gamepad">GamepadEvent.gamepad - Gamepad</a>
   */
  @JsProperty(
      name = "gamepad"
  )
  @Nonnull
  public native Gamepad gamepad();
}
