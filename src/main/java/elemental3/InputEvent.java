package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The InputEvent interface represents an event notifying of editable content change.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/InputEvent">InputEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "InputEvent"
)
public class InputEvent extends UIEvent {
  /**
   * The InputEvent() constructor creates a new InputEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/InputEvent/InputEvent">InputEvent.InputEvent - MDN</a>
   */
  public InputEvent(@Nonnull final String type, @Nonnull final InputEventInit eventInitDict) {
    super( null );
  }

  /**
   * The InputEvent() constructor creates a new InputEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/InputEvent/InputEvent">InputEvent.InputEvent - MDN</a>
   */
  public InputEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The data read-only property of the InputEvent interface returns a DOMString with the inserted characters. This may be an empty string if the change doesn't insert text (such as when deleting characters, for example).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/InputEvent/data">InputEvent.data - MDN</a>
   */
  @JsProperty(
      name = "data"
  )
  @Nullable
  public native String data();

  /**
   * The inputType read-only property of the InputEvent interface returns the type of change made to editible content. Possible changes include for example inserting, deleting, and formatting text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/InputEvent/inputType">InputEvent.inputType - MDN</a>
   */
  @JsProperty(
      name = "inputType"
  )
  @Nonnull
  public native String inputType();

  /**
   * The InputEvent.isComposing read-only property returns a Boolean value indicating if the event is fired after compositionstart and before compositionend.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/InputEvent/isComposing">InputEvent.isComposing - MDN</a>
   */
  @JsProperty(
      name = "isComposing"
  )
  public native boolean isComposing();
}
