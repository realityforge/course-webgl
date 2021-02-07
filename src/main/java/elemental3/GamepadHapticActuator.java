package elemental3;

import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The GamepadHapticActuator interface of the Gamepad API represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadHapticActuator">GamepadHapticActuator - MDN</a>
 * @see <a href="https://w3c.github.io/gamepad/extensions.html#gamepadhapticactuator-interface">GamepadHapticActuator - Gamepad Extensions</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GamepadHapticActuator"
)
public class GamepadHapticActuator {
  protected GamepadHapticActuator() {
  }

  /**
   * The type read-only property of the GamepadHapticActuator interface returns an enum representing the type of the haptic hardware.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadHapticActuator/type">GamepadHapticActuator.type - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/extensions.html#dom-gamepadhapticactuatortype">GamepadHapticActuatorType - Gamepad Extensions</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  @GamepadHapticActuatorType
  public native String type();

  /**
   * The pulse() method of the GamepadHapticActuator interface makes the hardware pulse at a certain intensity for a specified duration.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadHapticActuator/pulse">GamepadHapticActuator.pulse - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/extensions.html#dom-gamepadhapticactuator-pulse">pulse() - Gamepad Extensions</a>
   */
  @Nonnull
  public native Promise<Boolean> pulse(double value, double duration);
}
