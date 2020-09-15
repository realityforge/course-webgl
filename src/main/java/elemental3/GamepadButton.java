package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The GamepadButton interface defines an individual button of a gamepad or other controller, allowing access to the current state of different types of buttons available on the control device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadButton">GamepadButton - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GamepadButton"
)
public class GamepadButton {
  GamepadButton() {
  }

  /**
   * The GamepadButton.pressed property of the GamepadButton interface returns a boolean indicating whether the button is currently pressed (true) or unpressed (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadButton/pressed">GamepadButton.pressed - MDN</a>
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
   */
  @JsProperty(
      name = "value"
  )
  public native double value();
}