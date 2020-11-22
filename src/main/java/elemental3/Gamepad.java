package elemental3;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Gamepad interface of the Gamepad API defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Gamepad">Gamepad - MDN</a>
 * @see <a href="https://w3c.github.io/gamepad/#gamepad-interface">The definition of 'Gamepad' in the 'Gamepad' specification.</a>
 * @see <a href="https://immersive-web.github.io/webvr/spec/1.1/#gamepad-getvrdisplays-attribute">The definition of 'displayId' in the 'WebVR 1.1' specification.</a>
 * @see <a href="https://w3c.github.io/gamepad/extensions.html#partial-gamepad-interface">The definition of 'Gamepad extensions' in the 'Gamepad Extensions' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Gamepad"
)
public class Gamepad {
  protected Gamepad() {
  }

  /**
   * The Gamepad.axes property of the Gamepad interface returns an array representing the controls with axes present on the device (e.g. analog thumb sticks).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Gamepad/axes">Gamepad.axes - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#dom-gamepad-axes">The definition of 'Gamepad.axes' in the 'Gamepad' specification.</a>
   */
  @JsProperty(
      name = "axes"
  )
  @Nonnull
  public native JsArray<Double> axes();

  /**
   * The Gamepad.buttons property of the Gamepad interface returns an array of gamepadButton objects representing the buttons present on the device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Gamepad/buttons">Gamepad.buttons - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#dom-gamepad-buttons">The definition of 'Gamepad.buttons' in the 'Gamepad' specification.</a>
   */
  @JsProperty(
      name = "buttons"
  )
  @Nonnull
  public native JsArray<GamepadButton> buttons();

  /**
   * The Gamepad.connected property of the Gamepad interface returns a boolean indicating whether the gamepad is still connected to the system.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Gamepad/connected">Gamepad.connected - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#dom-gamepad-connected">The definition of 'Gamepad.connected' in the 'Gamepad' specification.</a>
   */
  @JsProperty(
      name = "connected"
  )
  public native boolean connected();

  /**
   * The hand read-only property of the Gamepad interface returns an enum defining what hand the controller is being held in, or is most likely to be held in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Gamepad/hand">Gamepad.hand - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/extensions.html#dom-gamepad-hand">The definition of 'hand' in the 'Gamepad Extensions' specification.</a>
   */
  @JsProperty(
      name = "hand"
  )
  @Nonnull
  @GamepadHand
  public native String hand();

  /**
   * The hapticActuators read-only property of the Gamepad interface returns an array containing GamepadHapticActuator objects, each of which represents haptic feedback hardware available on the controller.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Gamepad/hapticActuators">Gamepad.hapticActuators - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/extensions.html#partial-gamepad-interface">The definition of 'hapticActuators' in the 'Gamepad Extensions' specification.</a>
   */
  @JsProperty(
      name = "hapticActuators"
  )
  @Nonnull
  public native JsArray<GamepadHapticActuator> hapticActuators();

  /**
   * The Gamepad.id property of the Gamepad interface returns a string containing some information about the controller.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Gamepad/id">Gamepad.id - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#dom-gamepad-id">The definition of 'Gamepad.id' in the 'Gamepad' specification.</a>
   */
  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  /**
   * The Gamepad.index property of the Gamepad interface returns an integer that is auto-incremented to be unique for each device currently connected to the system.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Gamepad/index">Gamepad.index - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#dom-gamepad-index">The definition of 'Gamepad.index' in the 'Gamepad' specification.</a>
   */
  @JsProperty(
      name = "index"
  )
  public native int index();

  /**
   * The Gamepad.mapping property of the Gamepad interface returns a string indicating whether the browser has remapped the controls on the device to a known layout.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Gamepad/mapping">Gamepad.mapping - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#dom-gamepad-mapping">The definition of 'Gamepad.mapping' in the 'Gamepad' specification.</a>
   */
  @JsProperty(
      name = "mapping"
  )
  @Nonnull
  @GamepadMappingType
  public native String mapping();

  /**
   * The pose read-only property of the Gamepad interface returns a GamepadPose object representing the pose information associated with a WebVR controller (e.g. its position and orientation in 3D space).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Gamepad/pose">Gamepad.pose - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/extensions.html#partial-gamepad-interface">The definition of 'pose' in the 'Gamepad Extensions' specification.</a>
   */
  @JsProperty(
      name = "pose"
  )
  @Nullable
  public native GamepadPose pose();

  /**
   * The Gamepad.timestamp property of the Gamepad interface returns a DOMHighResTimeStamp representing the last time the data for this gamepad was updated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Gamepad/timestamp">Gamepad.timestamp - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/#dom-gamepad-timestamp">The definition of 'Gamepad.timestamp' in the 'Gamepad' specification.</a>
   */
  @JsProperty(
      name = "timestamp"
  )
  public native double timestamp();
}
