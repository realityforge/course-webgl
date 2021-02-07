package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The HTMLDialogElement interface provides methods to manipulate &lt;dialog&gt; elements. It inherits properties and methods from the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDialogElement">HTMLDialogElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmldialogelement">HTMLDialogElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/interactive-elements.html#the-dialog-element">&lt;dialog&gt; - HTML 5.2</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLDialogElement"
)
public class HTMLDialogElement extends HTMLElement {
  /**
   * A Boolean representing the state of the open HTML attribute. true means it is set, and therefore the dialog is shown. false means it not set, and therefore the dialog is not shown.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDialogElement/open">HTMLDialogElement.open - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-dialog-open">open - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/interactive-elements.html#dom-htmldialogelement-open">open - HTML 5.1</a>
   */
  public boolean open;

  /**
   * The returnValue property of the HTMLDialogElement interface gets or sets the return value for the dialog, usually to indicate which button the user pressed to close it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDialogElement/returnValue">HTMLDialogElement.returnValue - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-dialog-returnvalue">returnvalue - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/interactive-elements.html#dom-htmldialogelement-returnvalue">returnvalue - HTML 5.1</a>
   */
  @Nonnull
  public String returnValue;

  protected HTMLDialogElement() {
  }

  /**
   * Void.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDialogElement/close">HTMLDialogElement.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-dialog-close">close() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/interactive-elements.html#dom-htmldialogelement-close">close() - HTML 5.1</a>
   */
  public native void close(@Nonnull String returnValue);

  /**
   * Void.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDialogElement/close">HTMLDialogElement.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-dialog-close">close() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/interactive-elements.html#dom-htmldialogelement-close">close() - HTML 5.1</a>
   */
  public native void close();

  /**
   * The show() method of the HTMLDialogElement interface displays the dialog modelessly, i.e. still allowing interaction with content outside of the dialog.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDialogElement/show">HTMLDialogElement.show - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-dialog-show">show() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/interactive-elements.html#dom-htmldialogelement-show">show() - HTML 5.1</a>
   */
  public native void show();

  /**
   * The showModal() method of the HTMLDialogElement interface displays the dialog as a modal, over the top of any other dialogs that might be present. It displays into the top layer, along with a ::backdrop pseudo-element. Interaction outside the dialog is blocked and the content outside it is rendered inert.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDialogElement/showModal">HTMLDialogElement.showModal - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-dialog-showmodal">showModal() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/interactive-elements.html#dom-htmldialogelement-showmodal">showModal() - HTML 5.1</a>
   */
  public native void showModal();

  @JsOverlay
  public final void addCloseListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "close", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCloseListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "close", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCloseListener(@Nonnull final EventListener callback) {
    addEventListener( "close", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCloseListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "close", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCloseListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "close", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCloseListener(@Nonnull final EventListener callback) {
    removeEventListener( "close", Js.cast( callback ) );
  }
}
