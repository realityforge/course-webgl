package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WheelEvent interface represents events that occur due to the user moving a mouse wheel or similar input device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WheelEvent">WheelEvent - MDN</a>
 * @see <a href="https://w3c.github.io/uievents/#interface-wheelevent">The WheelEvent interface - UI Events</a>
 * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#interface-wheelevent">WheelEvent - Document Object Model (DOM) Level 3 Events Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WheelEvent"
)
public class WheelEvent extends MouseEvent {
  @JsOverlay
  public static final int DOM_DELTA_LINE = 0x01;

  @JsOverlay
  public static final int DOM_DELTA_PAGE = 0x02;

  @JsOverlay
  public static final int DOM_DELTA_PIXEL = 0x00;

  /**
   * The WheelEvent() constructor returns a newly created WheelEvent object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WheelEvent/WheelEvent">WheelEvent.WheelEvent - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#interface-WheelEvent">WheelEvent() - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  public WheelEvent(@Nonnull final String type, @Nonnull final WheelEventInit eventInitDict) {
    super( null );
  }

  /**
   * The WheelEvent() constructor returns a newly created WheelEvent object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WheelEvent/WheelEvent">WheelEvent.WheelEvent - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#interface-WheelEvent">WheelEvent() - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  public WheelEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The WheelEvent.deltaMode read-only property returns an unsigned long representing the unit of the delta values scroll amount. Permitted values are:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WheelEvent/deltaMode">WheelEvent.deltaMode - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-WheelEvent-deltaMode">WheelEvent.deltaMode - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  @JsProperty(
      name = "deltaMode"
  )
  @WheelEventDeltaMode
  public native int deltaMode();

  /**
   * The WheelEvent.deltaX read-only property is a double representing the horizontal scroll amount in the WheelEvent.deltaMode unit.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WheelEvent/deltaX">WheelEvent.deltaX - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-WheelEvent-deltaX">WheelEvent.deltaX - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  @JsProperty(
      name = "deltaX"
  )
  public native double deltaX();

  /**
   * The WheelEvent.deltaY read-only property is a double representing the vertical scroll amount in the WheelEvent.deltaMode unit.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WheelEvent/deltaY">WheelEvent.deltaY - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-WheelEvent-deltaY">WheelEvent.deltaY - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  @JsProperty(
      name = "deltaY"
  )
  public native double deltaY();

  /**
   * The WheelEvent.deltaZ read-only property is a double representing the scroll amount along the z-axis, in the WheelEvent.deltaMode unit.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WheelEvent/deltaZ">WheelEvent.deltaZ - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-WheelEvent-deltaZ">WheelEvent.deltaZ - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  @JsProperty(
      name = "deltaZ"
  )
  public native double deltaZ();
}
