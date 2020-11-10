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
 * @see <a href="https://drafts.csswg.org/cssom-view/#extensions-to-the-mouseevent-interface">The definition of 'MouseEvent' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
 * @see <a href="https://w3c.github.io/pointerlock/#extensions-to-the-mouseevent-interface">The definition of 'MouseEvent' in the 'Pointer Lock' specification.</a>
 * @see <a href="https://drafts.csswg.org/cssom-view/#extensions-to-the-mouseevent-interface">The definition of 'MouseEvent' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
 * @see <a href="https://w3c.github.io/uievents/#interface-mouseevent">The definition of 'MouseEvent' in the 'UI Events' specification.</a>
 * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#events-mouseevents">The definition of 'MouseEvent' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-MouseEvent">The definition of 'MouseEvent' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
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
   * @see <a href="https://drafts.csswg.org/cssom-view/#extensions-to-the-mouseevent-interface">The definition of 'MouseEvent' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#interface-MouseEvent">The definition of 'MouseEvent()' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   */
  public MouseEvent(@Nonnull final String type, @Nonnull final MouseEventInit eventInitDict) {
    super( null );
  }

  /**
   * The MouseEvent() constructor creates a new MouseEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/MouseEvent">MouseEvent.MouseEvent - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#extensions-to-the-mouseevent-interface">The definition of 'MouseEvent' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#interface-MouseEvent">The definition of 'MouseEvent()' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   */
  public MouseEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The MouseEvent.altKey read-only property is a Boolean that indicates whether the alt key was pressed or not when a given mouse event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/altKey">MouseEvent.altKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-MouseEvent-altKey">The definition of 'MouseEvent.altkey' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-MouseEvent">The definition of 'MouseEvent.altkey' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  @JsProperty(
      name = "altKey"
  )
  public native boolean altKey();

  /**
   * The MouseEvent.button read-only property indicates which button was pressed on the mouse to trigger the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/button">MouseEvent.button - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-MouseEvent-button">The definition of 'MouseEvent.button' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-MouseEvent">The definition of 'MouseEvent.button' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  @JsProperty(
      name = "button"
  )
  public native short button();

  /**
   * The MouseEvent.buttons read-only property indicates which buttons are pressed on the mouse (or other input device) when a mouse event is triggered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/buttons">MouseEvent.buttons - MDN</a>
   * @see <a href="https://w3c.github.io/uievents/#dom-mouseevent-buttons">The definition of 'MouseEvent.buttons' in the 'UI Events' specification.</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-MouseEvent-buttons">The definition of 'MouseEvent.buttons' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   */
  @JsProperty(
      name = "buttons"
  )
  public native int buttons();

  /**
   * The clientX read-only property of the MouseEvent interface provides the horizontal coordinate within the application's viewport at which the event occurred (as opposed to the coordinate within the page).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/clientX">MouseEvent.clientX - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mouseevent-clientx">The definition of 'clientX' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-MouseEvent-clientX">The definition of 'MouseEvent.clientX' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-MouseEvent">The definition of 'MouseEvent.clientX' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  @JsProperty(
      name = "clientX"
  )
  public native double clientX();

  /**
   * The clientY read-only property of the MouseEvent interface provides the vertical coordinate within the application's viewport at which the event occurred (as opposed to the coordinate within the page).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/clientY">MouseEvent.clientY - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mouseevent-clienty">The definition of 'clientY' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-MouseEvent-clientY">The definition of 'MouseEvent.clientY' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-MouseEvent">The definition of 'MouseEvent.clientY' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  @JsProperty(
      name = "clientY"
  )
  public native double clientY();

  /**
   * The MouseEvent.ctrlKey read-only property is a Boolean that indicates whether the ctrl key was pressed or not when a given mouse event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/ctrlKey">MouseEvent.ctrlKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-MouseEvent-ctrlKey">The definition of 'MouseEvent.ctrlKey' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-MouseEvent">The definition of 'MouseEvent.ctrlKey' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  @JsProperty(
      name = "ctrlKey"
  )
  public native boolean ctrlKey();

  /**
   * The MouseEvent.metaKey read-only property is a Boolean that indicates whether the meta key was pressed or not when a given mouse event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/metaKey">MouseEvent.metaKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-MouseEvent-metaKey">The definition of 'MouseEvent.metaKey' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-MouseEvent">The definition of 'MouseEvent.metaKey' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  @JsProperty(
      name = "metaKey"
  )
  public native boolean metaKey();

  /**
   * The movementX read-only property of the MouseEvent interface provides the difference in the X coordinate of the mouse pointer between the given event and the previous mousemove event. In other words, the value of the property is computed like this: currentEvent.movementX = currentEvent.screenX - previousEvent.screenX.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/movementX">MouseEvent.movementX - MDN</a>
   * @see <a href="https://w3c.github.io/pointerlock/#dom-mouseevent-movementx">The definition of 'MouseEvent.movementX' in the 'Pointer Lock' specification.</a>
   */
  @JsProperty(
      name = "movementX"
  )
  public native int movementX();

  /**
   * The movementY read-only property of the MouseEvent interface provides the difference in the Y coordinate of the mouse pointer between the given event and the previous mousemove event. In other words, the value of the property is computed like this: currentEvent.movementY = currentEvent.screenY - previousEvent.screenY.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/movementY">MouseEvent.movementY - MDN</a>
   * @see <a href="https://w3c.github.io/pointerlock/#dom-mouseevent-movementy">The definition of 'MouseEvent.movementY' in the 'Pointer Lock' specification.</a>
   */
  @JsProperty(
      name = "movementY"
  )
  public native int movementY();

  /**
   * The offsetX read-only property of the MouseEvent interface provides the offset in the X coordinate of the mouse pointer between that event and the padding edge of the target node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/offsetX">MouseEvent.offsetX - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mouseevent-offsetx">The definition of 'MouseEvent' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @JsProperty(
      name = "offsetX"
  )
  public native double offsetX();

  /**
   * The offsetY read-only property of the MouseEvent interface provides the offset in the Y coordinate of the mouse pointer between that event and the padding edge of the target node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/offsetY">MouseEvent.offsetY - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mouseevent-offsety">The definition of 'MouseEvent' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @JsProperty(
      name = "offsetY"
  )
  public native double offsetY();

  /**
   * The pageX read-only property of the MouseEvent interface returns the X (horizontal) coordinate (in pixels) at which the mouse was clicked, relative to the left edge of the entire document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/pageX">MouseEvent.pageX - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mouseevent-pagex">The definition of 'pageX' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   * @see <a href="https://www.w3.org/TR/touch-events/#widl-Touch-pageX">The definition of 'pageX' in the 'Touch Events' specification.</a>
   */
  @JsProperty(
      name = "pageX"
  )
  public native double pageX();

  /**
   * The pageY read-only property of the MouseEvent interface returns the Y (vertical) coordinate in pixels of the event relative to the whole document. This property takes into account any vertical scrolling of the page.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/pageY">MouseEvent.pageY - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mouseevent-pagey">The definition of 'pageY' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   * @see <a href="https://www.w3.org/TR/touch-events/#widl-Touch-pageY">The definition of 'pageY' in the 'Touch Events' specification.</a>
   */
  @JsProperty(
      name = "pageY"
  )
  public native double pageY();

  /**
   * The MouseEvent.relatedTarget read-only property is the secondary target for the mouse event, if there is one. That is:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/relatedTarget">MouseEvent.relatedTarget - MDN</a>
   * @see <a href="https://w3c.github.io/uievents/#dom-mouseevent-relatedtarget">The definition of 'MouseEvent.relatedTarget' in the 'UI Events' specification.</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-MouseEvent-relatedTarget">The definition of 'MouseEvent.relatedTarget' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-MouseEvent">The definition of 'MouseEvent.altkey' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  @JsProperty(
      name = "relatedTarget"
  )
  @Nullable
  public native EventTarget relatedTarget();

  /**
   * The screenX read-only property of the MouseEvent interface provides the horizontal coordinate (offset) of the mouse pointer in global (screen) coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/screenX">MouseEvent.screenX - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mouseevent-screenx">The definition of 'screenX' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-MouseEvent-screenX">The definition of 'MouseEvent.screenX' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-MouseEvent">The definition of 'MouseEvent.sceenX' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  @JsProperty(
      name = "screenX"
  )
  public native double screenX();

  /**
   * The screenY read-only property of the MouseEvent interface provides the vertical coordinate (offset) of the mouse pointer in global (screen) coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/screenY">MouseEvent.screenY - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mouseevent-screeny">The definition of 'screenY' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-MouseEvent-screenY">The definition of 'MouseEvent.screenY' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-MouseEvent">The definition of 'MouseEvent.sceenY' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  @JsProperty(
      name = "screenY"
  )
  public native double screenY();

  /**
   * The MouseEvent.shiftKey read-only property is a Boolean that indicates whether the shift key was pressed or not when a given mouse event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/shiftKey">MouseEvent.shiftKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-MouseEvent-shiftKey">The definition of 'MouseEvent.shiftKey' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-MouseEvent">The definition of 'MouseEvent.shiftKey' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  @JsProperty(
      name = "shiftKey"
  )
  public native boolean shiftKey();

  /**
   * The MouseEvent.x property is an alias for the MouseEvent.clientX property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/x">MouseEvent.x - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mouseevent-x">The definition of 'MouseEvent.x' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @JsProperty(
      name = "x"
  )
  public native double x();

  /**
   * The MouseEvent.y property is an alias for the MouseEvent.clientY property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/y">MouseEvent.y - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mouseevent-y">The definition of 'MouseEvent.y' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @JsProperty(
      name = "y"
  )
  public native double y();

  /**
   * The MouseEvent.getModifierState() method returns the current state of the specified modifier key: true if the modifier is active (i.e., the modifier key is pressed or locked), otherwise, false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/getModifierState">MouseEvent.getModifierState - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-MouseEvent-getModifierState">The definition of 'getModifierState()' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   */
  public native boolean getModifierState(@Nonnull String keyArg);
}
