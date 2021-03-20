package akasha;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The HTMLSlotElement interface of the Shadow DOM API enables access to the name and assigned nodes of an HTML &lt;slot&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement">HTMLSlotElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#htmlslotelement">HTMLSlotElement - HTML Living Standard</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-slot-name">name - HTML Living Standard</a>
   */
  @Nonnull
  public String name;

  protected HTMLSlotElement() {
  }

  /**
   * The assignedElements() property of the HTMLSlotElement interface returns a sequence of the elements assigned to this slot (and no other nodes). If the flatten option is set to true, it also returns the assigned elements of any other slots that are descendants of this slot. If no assigned nodes are found, it returns the slot's fallback content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/assignedElements">HTMLSlotElement.assignedElements - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-slot-assignedelements">assignedElements() - HTML Living Standard</a>
   */
  @Nonnull
  public native JsArray<Element> assignedElements(@Nonnull AssignedNodesOptions options);

  /**
   * The assignedElements() property of the HTMLSlotElement interface returns a sequence of the elements assigned to this slot (and no other nodes). If the flatten option is set to true, it also returns the assigned elements of any other slots that are descendants of this slot. If no assigned nodes are found, it returns the slot's fallback content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/assignedElements">HTMLSlotElement.assignedElements - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-slot-assignedelements">assignedElements() - HTML Living Standard</a>
   */
  @Nonnull
  public native JsArray<Element> assignedElements();

  /**
   * The assignedNodes() property of the HTMLSlotElement interface returns a sequence of the nodes assigned to this slot, and if the flatten option is set to true, the assigned nodes of any other slots that are descendants of this slot. If no assigned nodes are found, it returns the slot's fallback content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/assignedNodes">HTMLSlotElement.assignedNodes - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-slot-assignednodes">assignedNodes - HTML Living Standard</a>
   */
  @Nonnull
  public native JsArray<Node> assignedNodes(@Nonnull AssignedNodesOptions options);

  /**
   * The assignedNodes() property of the HTMLSlotElement interface returns a sequence of the nodes assigned to this slot, and if the flatten option is set to true, the assigned nodes of any other slots that are descendants of this slot. If no assigned nodes are found, it returns the slot's fallback content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/assignedNodes">HTMLSlotElement.assignedNodes - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-slot-assignednodes">assignedNodes - HTML Living Standard</a>
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
