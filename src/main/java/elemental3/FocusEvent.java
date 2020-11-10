package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The FocusEvent interface represents focus-related events, including focus, blur, focusin, and focusout.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FocusEvent">FocusEvent - MDN</a>
 * @see <a href="https://w3c.github.io/uievents/#interface-focusevent">The definition of 'FocusEvent' in the 'UI Events' specification.</a>
 * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#interface-focusevent">The definition of 'FocusEvent' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FocusEvent"
)
public class FocusEvent extends UIEvent {
  /**
   * The FocusEvent() constructor returns a newly created FocusEvent object with an optional EventTarget. When the event has both a source and a destination, the relatedTarget value must be set to the other target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FocusEvent/FocusEvent">FocusEvent.FocusEvent - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#interface-FocusEvent">The definition of 'FocusEvent()' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   */
  public FocusEvent(@Nonnull final String type, @Nonnull final FocusEventInit eventInitDict) {
    super( null );
  }

  /**
   * The FocusEvent() constructor returns a newly created FocusEvent object with an optional EventTarget. When the event has both a source and a destination, the relatedTarget value must be set to the other target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FocusEvent/FocusEvent">FocusEvent.FocusEvent - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#interface-FocusEvent">The definition of 'FocusEvent()' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   */
  public FocusEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The FocusEvent.relatedTarget read-only property is the secondary target, depending on the type of event:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FocusEvent/relatedTarget">FocusEvent.relatedTarget - MDN</a>
   * @see <a href="https://w3c.github.io/uievents/#idl-focusevent">The definition of 'FocusEvent.relatedTarget' in the 'UI Events' specification.</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-FocusEvent-relatedTarget">The definition of 'FocusEvent.relatedTarget' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   */
  @JsProperty(
      name = "relatedTarget"
  )
  @Nullable
  public native EventTarget relatedTarget();
}
