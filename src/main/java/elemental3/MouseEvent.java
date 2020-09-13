package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MouseEvent interface represents events that occur due to the user interacting with a pointing device (such as a mouse). Common events using this interface include click, dblclick, mouseup, mousedown.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent">MouseEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MouseEvent"
)
public class MouseEvent extends UIEvent {
  /**
   * The MouseEvent() constructor creates a new MouseEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/MouseEvent">MouseEvent.MouseEvent - MDN</a>
   */
  public MouseEvent(@Nonnull final String type, @Nonnull final MouseEventInit eventInitDict) {
    super( null );
  }

  /**
   * The MouseEvent() constructor creates a new MouseEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/MouseEvent">MouseEvent.MouseEvent - MDN</a>
   */
  public MouseEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The MouseEvent.altKey read-only property is a Boolean that indicates whether the alt key was pressed or not when a given mouse event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/altKey">MouseEvent.altKey - MDN</a>
   */
  @JsProperty(
      name = "altKey"
  )
  public native boolean altKey();

  /**
   * The MouseEvent.button read-only property indicates which button was pressed on the mouse to trigger the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/button">MouseEvent.button - MDN</a>
   */
  @JsProperty(
      name = "button"
  )
  public native short button();

  /**
   * The MouseEvent.buttons read-only property indicates which buttons are pressed on the mouse (or other input device) when a mouse event is triggered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/buttons">MouseEvent.buttons - MDN</a>
   */
  @JsProperty(
      name = "buttons"
  )
  public native int buttons();

  /**
   * The MouseEvent.ctrlKey read-only property is a Boolean that indicates whether the ctrl key was pressed or not when a given mouse event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/ctrlKey">MouseEvent.ctrlKey - MDN</a>
   */
  @JsProperty(
      name = "ctrlKey"
  )
  public native boolean ctrlKey();

  /**
   * The MouseEvent.metaKey read-only property is a Boolean that indicates whether the meta key was pressed or not when a given mouse event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/metaKey">MouseEvent.metaKey - MDN</a>
   */
  @JsProperty(
      name = "metaKey"
  )
  public native boolean metaKey();

  /**
   * The MouseEvent.relatedTarget read-only property is the secondary target for the mouse event, if there is one. That is:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/relatedTarget">MouseEvent.relatedTarget - MDN</a>
   */
  @JsProperty(
      name = "relatedTarget"
  )
  @Nullable
  public native EventTarget relatedTarget();

  /**
   * The MouseEvent.shiftKey read-only property is a Boolean that indicates whether the shift key was pressed or not when a given mouse event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/shiftKey">MouseEvent.shiftKey - MDN</a>
   */
  @JsProperty(
      name = "shiftKey"
  )
  public native boolean shiftKey();

  /**
   * The clientX read-only property of the MouseEvent interface provides the horizontal coordinate within the application's client area at which the event occurred (as opposed to the coordinate within the page).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/clientX">MouseEvent.clientX - MDN</a>
   */
  @JsProperty(
      name = "clientX"
  )
  public native double clientX();

  /**
   * The clientY read-only property of the MouseEvent interface provides the vertical coordinate within the application's client area at which the event occurred (as opposed to the coordinate within the page).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/clientY">MouseEvent.clientY - MDN</a>
   */
  @JsProperty(
      name = "clientY"
  )
  public native double clientY();

  /**
   * The offsetX read-only property of the MouseEvent interface provides the offset in the X coordinate of the mouse pointer between that event and the padding edge of the target node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/offsetX">MouseEvent.offsetX - MDN</a>
   */
  @JsProperty(
      name = "offsetX"
  )
  public native double offsetX();

  /**
   * The offsetY read-only property of the MouseEvent interface provides the offset in the Y coordinate of the mouse pointer between that event and the padding edge of the target node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/offsetY">MouseEvent.offsetY - MDN</a>
   */
  @JsProperty(
      name = "offsetY"
  )
  public native double offsetY();

  /**
   * The pageX read-only property of the MouseEvent interface returns the X (horizontal) coordinate (in pixels) at which the mouse was clicked, relative to the left edge of the entire document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/pageX">MouseEvent.pageX - MDN</a>
   */
  @JsProperty(
      name = "pageX"
  )
  public native double pageX();

  /**
   * The pageY read-only property of the MouseEvent interface returns the Y (vertical) coordinate in pixels of the event relative to the whole document. This property takes into account any vertical scrolling of the page.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/pageY">MouseEvent.pageY - MDN</a>
   */
  @JsProperty(
      name = "pageY"
  )
  public native double pageY();

  /**
   * The screenX read-only property of the MouseEvent interface provides the horizontal coordinate (offset) of the mouse pointer in global (screen) coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/screenX">MouseEvent.screenX - MDN</a>
   */
  @JsProperty(
      name = "screenX"
  )
  public native double screenX();

  /**
   * The screenY read-only property of the MouseEvent interface provides the vertical coordinate (offset) of the mouse pointer in global (screen) coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/screenY">MouseEvent.screenY - MDN</a>
   */
  @JsProperty(
      name = "screenY"
  )
  public native double screenY();

  /**
   * The MouseEvent.x property is an alias for the MouseEvent.clientX property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/x">MouseEvent.x - MDN</a>
   */
  @JsProperty(
      name = "x"
  )
  public native double x();

  /**
   * The MouseEvent.y property is an alias for the MouseEvent.clientY property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/y">MouseEvent.y - MDN</a>
   */
  @JsProperty(
      name = "y"
  )
  public native double y();

  /**
   * The movementX read-only property of the MouseEvent interface provides the difference in the X coordinate of the mouse pointer between the given event and the previous mousemove event. In other words, the value of the property is computed like this: currentEvent.movementX = currentEvent.screenX - previousEvent.screenX.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/movementX">MouseEvent.movementX - MDN</a>
   */
  @JsProperty(
      name = "movementX"
  )
  public native int movementX();

  /**
   * The movementY read-only property of the MouseEvent interface provides the difference in the Y coordinate of the mouse pointer between the given event and the previous mousemove event. In other words, the value of the property is computed like this: currentEvent.movementY = currentEvent.screenY - previousEvent.screenY.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/movementY">MouseEvent.movementY - MDN</a>
   */
  @JsProperty(
      name = "movementY"
  )
  public native int movementY();

  /**
   * The MouseEvent.getModifierState() method returns the current state of the specified modifier key: true if the modifier is active (i.e., the modifier key is pressed or locked), otherwise, false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/getModifierState">MouseEvent.getModifierState - MDN</a>
   */
  public native boolean getModifierState(@Nonnull String keyArg);
}
