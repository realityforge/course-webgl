package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLBodyElement interface provides special properties (beyond those inherited from the regular HTMLElement interface) for manipulating body elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBodyElement">HTMLBodyElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlbodyelement">The definition of 'HTMLBodyElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/sections.html#the-body-element">The definition of 'HTMLBodyElement' in the 'HTML 5.1' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/sections.html#the-body-element">The definition of 'HTMLBodyElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-62018039">The definition of 'HTMLBodyElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-62018039">The definition of 'HTMLBodyElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLBodyElement"
)
public class HTMLBodyElement extends HTMLElement {
  @Nonnull
  public String aLink;

  @Nonnull
  public String background;

  @Nonnull
  public String bgColor;

  @Nonnull
  public String link;

  /**
   * The onafterprint property of the WindowEventHandlers mixin is the EventHandler for processing afterprint events for the current window. These events are raised after the user prints, or if they abort the print dialog.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBodyElement/onafterprint">HTMLBodyElement.onafterprint - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBodyElement/onbeforeunload">HTMLBodyElement.onbeforeunload - MDN</a>
   */
  @Nullable
  public OnBeforeUnloadEventHandler onbeforeunload;

  /**
   * The WindowEventHandlers.onhashchange property of the WindowEventHandlers mixin is the EventHandler for processing hashchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBodyElement/onhashchange">HTMLBodyElement.onhashchange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onhashchange">The definition of 'onhashchange' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML5' specification.</a>
   */
  @Nullable
  public EventHandler onhashchange;

  /**
   * The onlanguagechange property of the WindowEventHandlers mixin is the EventHandler for processing languagechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBodyElement/onlanguagechange">HTMLBodyElement.onlanguagechange - MDN</a>
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
  public EventHandler onorientationchange;

  @Nullable
  public EventHandler onpagehide;

  @Nullable
  public EventHandler onpageshow;

  /**
   * The onpopstate property of the WindowEventHandlers mixin is the EventHandler for processing popstate events on the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBodyElement/onpopstate">HTMLBodyElement.onpopstate - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBodyElement/onunload">HTMLBodyElement.onunload - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onunload">The definition of 'onunload' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML5' specification.</a>
   */
  @Nullable
  public EventHandler onunload;

  @Nonnull
  public String text;

  @Nonnull
  public String vLink;

  protected HTMLBodyElement() {
  }
}
