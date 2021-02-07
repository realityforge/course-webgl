package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DragEvent interface is a DOM event that represents a drag and drop interaction. The user initiates a drag by placing a pointer device (such as a mouse) on the touch surface and then dragging the pointer to a new location (such as another DOM element). Applications are free to interpret a drag and drop interaction in an application-specific way.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DragEvent">DragEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#dragevent">DragEvent - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/editing.html#the-dragevent-interface">DragEvent - HTML 5.1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DragEvent"
)
public class DragEvent extends MouseEvent {
  /**
   * This constructor is used to create a synthetic DragEvent object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DragEvent/DragEvent">DragEvent.DragEvent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#the-dragevent-interface">DragEvent - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#the-dragevent-interface">DragEvent - HTML 5.1</a>
   */
  public DragEvent(@Nonnull final String type, @Nonnull final DragEventInit eventInitDict) {
    super( null );
  }

  /**
   * This constructor is used to create a synthetic DragEvent object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DragEvent/DragEvent">DragEvent.DragEvent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#the-dragevent-interface">DragEvent - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#the-dragevent-interface">DragEvent - HTML 5.1</a>
   */
  public DragEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The DragEvent.dataTransfer property holds the drag operation's data (as a DataTransfer object).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DragEvent/dataTransfer">DragEvent.dataTransfer - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-dragevent-datatransfer">DragEvent.dataTransfer - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-dragevent-datatransfer">DragEvent.dataTransfer - HTML 5.1</a>
   */
  @JsProperty(
      name = "dataTransfer"
  )
  @Nullable
  public native DataTransfer dataTransfer();
}
