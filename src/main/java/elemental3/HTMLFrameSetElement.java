package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLFrameSetElement interface provides special properties (beyond those of the regular HTMLElement interface they also inherit) for manipulating frameset elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFrameSetElement">HTMLFrameSetElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlframesetelement">The definition of 'HTMLFrameSetElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/obsolete.html#htmlframesetelement">The definition of 'HTMLFrameSetElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-ID-43829095">The definition of 'HTMLBodyElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-43829095">The definition of 'HTMLBodyElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLFrameSetElement"
)
public class HTMLFrameSetElement extends HTMLElement {
  @Nonnull
  public String cols;

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFrameSetElement/onafterprint">HTMLFrameSetElement.onafterprint - MDN</a>
   */
  @Nullable
  public EventHandler onafterprint;

  /**
   * The onbeforeprint property of the WindowEventHandlers mixin is the EventHandler for processing beforeprint events for the current window. These events are raised before the print dialog window is opened.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onbeforeprint">WindowEventHandlers.onbeforeprint - MDN</a>
   */
  @Nullable
  public EventHandler onbeforeprint;

  /**
   * The onbeforeunload property of the WindowEventHandlers mixin is the EventHandler for processing beforeunload events. These events fire when a window is about to unload its resources. At this point, the document is still visible and the event is still cancelable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFrameSetElement/onbeforeunload">HTMLFrameSetElement.onbeforeunload - MDN</a>
   */
  @Nullable
  public OnBeforeUnloadEventHandler onbeforeunload;

  /**
   * The WindowEventHandlers.onhashchange property of the WindowEventHandlers mixin is the EventHandler for processing hashchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFrameSetElement/onhashchange">HTMLFrameSetElement.onhashchange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onhashchange">The definition of 'onhashchange' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML5' specification.</a>
   */
  @Nullable
  public EventHandler onhashchange;

  /**
   * The onlanguagechange property of the WindowEventHandlers mixin is the EventHandler for processing languagechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFrameSetElement/onlanguagechange">HTMLFrameSetElement.onlanguagechange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onlanguagechange">The definition of 'WindowEventHandler.onlanguagechange' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onlanguagechange;

  /**
   * The onmessage property of the WindowEventHandlers mixin is the EventHandler called whenever an object receives a message event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessage">WindowEventHandlers.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessage">The definition of 'onmessage' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onmessage;

  /**
   * The onmessageerror event handler of the WindowEventHandlers interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on a window&mdash;that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessageerror">WindowEventHandlers.onmessageerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessageerror">The definition of 'onmessageerror' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onmessageerror;

  @Nullable
  public EventHandler onoffline;

  @Nullable
  public EventHandler ononline;

  @Nullable
  public EventHandler onpagehide;

  @Nullable
  public EventHandler onpageshow;

  /**
   * The onpopstate property of the WindowEventHandlers mixin is the EventHandler for processing popstate events on the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFrameSetElement/onpopstate">HTMLFrameSetElement.onpopstate - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onpopstate">The definition of 'onpopstate' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onpopstate;

  /**
   * The onrejectionhandled property of the WindowEventHandlers mixin is the EventHandler for processing rejectionhandled events. These events are raised when Promises are rejected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onrejectionhandled">WindowEventHandlers.onrejectionhandled - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onrejectionhandled">The definition of 'onrejectionhandled' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onrejectionhandled;

  /**
   * The onstorage property of the WindowEventHandlers mixin is an EventHandler for processing storage events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onstorage">WindowEventHandlers.onstorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onstorage">The definition of 'onstorage' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onstorage;

  /**
   * The onunhandledrejection property of the WindowEventHandlers mixin is the EventHandler for processing unhandledrejection events. These events are raised for unhandled Promise rejections.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onunhandledrejection">WindowEventHandlers.onunhandledrejection - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onunhandledrejection">The definition of 'onunhandledrejection' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onunhandledrejection;

  /**
   * The onunload property of the WindowEventHandlers mixin is the EventHandler for processing unload events. These events fire when the window is unloading its content and resources. The resource removal is processed after the unload event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFrameSetElement/onunload">HTMLFrameSetElement.onunload - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onunload">The definition of 'onunload' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML5' specification.</a>
   */
  @Nullable
  public EventHandler onunload;

  @Nonnull
  public String rows;

  protected HTMLFrameSetElement() {
  }
}
