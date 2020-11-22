package elemental3;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * Fired on an HTMLSlotElement instance (slot element) when the node(s) contained in that slot change.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement">HTMLSlotElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#htmlslotelement">The definition of 'HTMLSlotElement' in the 'HTML Living Standard' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLSlotElement"
)
public class HTMLSlotElement extends HTMLElement {
  /**
   * The name property of the HTMLSlotElement interface returns or sets the slot name. A slot is a placeholder inside a web component that users can fill with their own markup.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/name">HTMLSlotElement.name - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-slot-name">The definition of 'name' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public String name;

  protected HTMLSlotElement() {
  }

  /**
   * The assignedElements() property of the HTMLSlotElement interface returns a sequence of the elements assigned to this slot (and no other nodes). If the flatten option is set to true, it also returns the assigned elements of any other slots that are descendants of this slot. If no assigned nodes are found, it returns the slot's fallback content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/assignedElements">HTMLSlotElement.assignedElements - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-slot-assignedelements">The definition of 'assignedElements()' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native JsArray<Element> assignedElements(@Nonnull AssignedNodesOptions options);

  /**
   * The assignedElements() property of the HTMLSlotElement interface returns a sequence of the elements assigned to this slot (and no other nodes). If the flatten option is set to true, it also returns the assigned elements of any other slots that are descendants of this slot. If no assigned nodes are found, it returns the slot's fallback content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/assignedElements">HTMLSlotElement.assignedElements - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-slot-assignedelements">The definition of 'assignedElements()' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native JsArray<Element> assignedElements();

  /**
   * The assignedNodes() property of the HTMLSlotElement interface returns a sequence of the nodes assigned to this slot, and if the flatten option is set to true, the assigned nodes of any other slots that are descendants of this slot. If no assigned nodes are found, it returns the slot's fallback content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/assignedNodes">HTMLSlotElement.assignedNodes - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-slot-assignednodes">The definition of 'assignedNodes' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native JsArray<Node> assignedNodes(@Nonnull AssignedNodesOptions options);

  /**
   * The assignedNodes() property of the HTMLSlotElement interface returns a sequence of the nodes assigned to this slot, and if the flatten option is set to true, the assigned nodes of any other slots that are descendants of this slot. If no assigned nodes are found, it returns the slot's fallback content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/assignedNodes">HTMLSlotElement.assignedNodes - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-slot-assignednodes">The definition of 'assignedNodes' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native JsArray<Node> assignedNodes();

  @JsOverlay
  public final void addSlotchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "slotchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSlotchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "slotchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSlotchangeListener(@Nonnull final EventListener callback) {
    addEventListener( "slotchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSlotchangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "slotchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSlotchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "slotchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSlotchangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "slotchange", Js.cast( callback ) );
  }
}
