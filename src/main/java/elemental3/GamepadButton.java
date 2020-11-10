package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The GamepadButton interface defines an individual button of a gamepad or other controller, allowing access to the current state of different types of buttons available on the control device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadButton">GamepadButton - MDN</a>
 * @see <a href="https://w3c.github.io/gamepad/#gamepadbutton-interface">The definition of 'GamepadButton' in the 'Gamepad' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GamepadButton"
)
public class GamepadButton {
  protected GamepadButton() {
  }

  /**
   * The GamepadButton.pressed property of the GamepadButton interface returns a boolean indicating whether the button is currently pressed (true) or unpressed (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadButton/pressed">GamepadButton.pressed - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#dom-gamepadbutton-pressed">The definition of 'GamepadButton.pressed' in the 'Gamepad' specification.</a>
   */
  @JsProperty(
      name = "pressed"
  )
  public native boolean pressed();

  @JsProperty(
      name = "touched"
  )
  public native boolean touched();

  /**
   * The GamepadButton.value property of the GamepadButton interface returns a double value used to represent the current state of analog buttons on many modern gamepads, such as the triggers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadButton/value">GamepadButton.value - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#dom-gamepadbutton-value">The definition of 'GamepadButton.value' in the 'Gamepad' specification.</a>
   */
  @JsProperty(
      name = "value"
  )
  public native double value();
}
