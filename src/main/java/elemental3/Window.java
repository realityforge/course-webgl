package elemental3;

import elemental3.core.JsArray;
import elemental3.indexeddb.IDBFactory;
import elemental3.promise.Promise;
import elemental3.speech.SpeechSynthesis;
import elemental3.svg.SVGImageElement;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The Window interface represents a window containing a DOM document; the document property points to the DOM document loaded in that window.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window">Window - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Window"
)
public class Window extends EventTarget {
  /**
   * The Window.name property gets/sets the name of the window's browsing context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/name">Window.name - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-name">The definition of 'Window.name' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-name">The definition of 'Window.name' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public String name;

  /**
   * The onabort property of the GlobalEventHandlers mixin is the EventHandler for processing abort events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onabort">Window.onabort - MDN</a>
   */
  @Nullable
  public EventHandler onabort;

  /**
   * The onafterprint property of the WindowEventHandlers mixin is the EventHandler for processing afterprint events for the current window. These events are raised after the user prints, or if they abort the print dialog.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onafterprint">Window.onafterprint - MDN</a>
   */
  @Nullable
  public EventHandler onafterprint;

  /**
   * The onanimationcancel property of the GlobalEventHandlers mixin is the EventHandler for processing animationcancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationcancel">GlobalEventHandlers.onanimationcancel - MDN</a>
   */
  @Nullable
  public AnimationEventHandler onanimationcancel;

  /**
   * The onanimationend property of the GlobalEventHandlers mixin is the EventHandler for processing animationend events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationend">GlobalEventHandlers.onanimationend - MDN</a>
   */
  @Nullable
  public AnimationEventHandler onanimationend;

  /**
   * The onanimationiteration property of the GlobalEventHandlers mixin is the EventHandler for processing animationiteration events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationiteration">GlobalEventHandlers.onanimationiteration - MDN</a>
   */
  @Nullable
  public AnimationEventHandler onanimationiteration;

  /**
   * An event handler for the animationstart event. This event is sent when a CSS Animation starts to play.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationstart">GlobalEventHandlers.onanimationstart - MDN</a>
   */
  @Nullable
  public AnimationEventHandler onanimationstart;

  /**
   * The onauxclick property of the GlobalEventHandlers mixin is an EventHandler for processing auxclick events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onauxclick">GlobalEventHandlers.onauxclick - MDN</a>
   * @see <a href="https://w3c.github.io/uievents/#event-type-auxclick">The definition of 'onauxclick' in the 'UI Events' specification.</a>
   */
  @Nullable
  public EventHandler onauxclick;

  /**
   * The onbeforeprint property of the WindowEventHandlers mixin is the EventHandler for processing beforeprint events for the current window. These events are raised before the print dialog window is opened.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onbeforeprint">Window.onbeforeprint - MDN</a>
   */
  @Nullable
  public EventHandler onbeforeprint;

  /**
   * The onbeforeunload property of the WindowEventHandlers mixin is the EventHandler for processing beforeunload events. These events fire when a window is about to unload its resources. At this point, the document is still visible and the event is still cancelable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onbeforeunload">Window.onbeforeunload - MDN</a>
   */
  @Nullable
  public OnBeforeUnloadEventHandler onbeforeunload;

  /**
   * The onblur property of the GlobalEventHandlers mixin is the EventHandler for processing blur events. It's available on Element, Document, and Window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onblur">Window.onblur - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onblur">The definition of 'onblur' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public FocusEventHandler onblur;

  /**
   * The oncancel property of the GlobalEventHandlers mixin is an EventHandler for processing cancel events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncancel">GlobalEventHandlers.oncancel - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-oncancel">The definition of 'oncancel' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler oncancel;

  /**
   * The oncanplay property of the GlobalEventHandlers mixin is the EventHandler for processing canplay events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncanplay">GlobalEventHandlers.oncanplay - MDN</a>
   */
  @Nullable
  public EventHandler oncanplay;

  /**
   * The oncanplaythrough property of the GlobalEventHandlers mixin is the EventHandler for processing canplaythrough events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncanplaythrough">GlobalEventHandlers.oncanplaythrough - MDN</a>
   */
  @Nullable
  public EventHandler oncanplaythrough;

  /**
   * The onchange property of the GlobalEventHandlers mixin is an EventHandler for processing change events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onchange">Window.onchange - MDN</a>
   */
  @Nullable
  public EventHandler onchange;

  /**
   * The onclick property of the GlobalEventHandlers mixin is the EventHandler for processing click events on a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onclick">Window.onclick - MDN</a>
   */
  @Nullable
  public EventHandler onclick;

  /**
   * The onclose property of the GlobalEventHandlers mixin is an EventHandler for processing close events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclose">GlobalEventHandlers.onclose - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onclose">The definition of 'onclose' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onclose;

  @Nullable
  public EventHandler oncompassneedscalibration;

  /**
   * The oncontextmenu property of the GlobalEventHandlers mixin is an EventHandler that processes contextmenu events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/oncontextmenu">Window.oncontextmenu - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-oncontextmenu">The definition of 'oncontextmenu' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler oncontextmenu;

  /**
   * The oncuechange property of the GlobalEventHandlers mixin is the EventHandler for processing cuechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncuechange">GlobalEventHandlers.oncuechange - MDN</a>
   */
  @Nullable
  public EventHandler oncuechange;

  /**
   * The ondblclick property of the GlobalEventHandlers mixin is an EventHandler that processes dblclick events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondblclick">Window.ondblclick - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-ondblclick">The definition of 'ondblclick' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler ondblclick;

  /**
   * An event handler for the devicemotion events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondevicemotion">Window.ondevicemotion - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @Nullable
  public DeviceMotionEventHandler ondevicemotion;

  /**
   * An event handler for the deviceorientation event, which contains information about a relative device orientation change.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondeviceorientation">Window.ondeviceorientation - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @Nullable
  public DeviceOrientationEventHandler ondeviceorientation;

  /**
   * An event handler for the deviceorientationabsolute event containing information about an absolute device orientation change.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondeviceorientationabsolute">Window.ondeviceorientationabsolute - MDN</a>
   */
  @Nullable
  public EventHandler ondeviceorientationabsolute;

  /**
   * A global event handler for the drag event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrag">GlobalEventHandlers.ondrag - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondrag">The definition of 'ondrag' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondrag">The definition of 'ondrag' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public EventHandler ondrag;

  /**
   * A global event handler for the dragend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragend">GlobalEventHandlers.ondragend - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragend">The definition of 'ondragend' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragend">The definition of 'ondragend' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public EventHandler ondragend;

  /**
   * A global event handler for the dragenter event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragenter">GlobalEventHandlers.ondragenter - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragenter">The definition of 'ondragenter' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragenter">The definition of 'ondragenter' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public EventHandler ondragenter;

  /**
   * A global event handler for the dragleave event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragleave">GlobalEventHandlers.ondragleave - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragleave">The definition of 'ondragleave' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragleave">The definition of 'ondragleave' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public EventHandler ondragleave;

  /**
   * A global event handler for the dragover event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragover">GlobalEventHandlers.ondragover - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragover">The definition of 'ondragover' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragover">The definition of 'ondragover' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public EventHandler ondragover;

  /**
   * A global event handler for the dragstart event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragstart">GlobalEventHandlers.ondragstart - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragstart">The definition of 'ondragstart' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragstart">The definition of 'ondragstart' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public EventHandler ondragstart;

  /**
   * A global event handler for the drop event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrop">GlobalEventHandlers.ondrop - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondrop">The definition of 'ondrop' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondrop">The definition of 'ondrop' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public EventHandler ondrop;

  /**
   * The ondurationchange property of the GlobalEventHandlers mixin is the EventHandler for processing durationchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondurationchange">GlobalEventHandlers.ondurationchange - MDN</a>
   */
  @Nullable
  public EventHandler ondurationchange;

  /**
   * The onemptied property sets and returns the event handler for the emptied event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onemptied">GlobalEventHandlers.onemptied - MDN</a>
   */
  @Nullable
  public EventHandler onemptied;

  /**
   * The onended property of the GlobalEventHandlers mixin is the EventHandler for processing ended events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onended">GlobalEventHandlers.onended - MDN</a>
   */
  @Nullable
  public EventHandler onended;

  /**
   * The onerror property of the GlobalEventHandlers mixin is an EventHandler that processes error events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onerror">GlobalEventHandlers.onerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onerror">The definition of 'onerror' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public OnErrorEventHandler onerror;

  /**
   * The onfocus property of the GlobalEventHandlers mixin is an EventHandler that processes focus events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onfocus">Window.onfocus - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onfocus">The definition of 'onfocus' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public FocusEventHandler onfocus;

  /**
   * The onformdata property of the GlobalEventHandlers mixin is the EventHandler for processing formdata events, fired after the entry list representing the form's data is constructed. This happens when the form is submitted, but can also be triggered by the invocation of a FormData() constructor. onformdata is available on HTMLFormElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onformdata">GlobalEventHandlers.onformdata - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onformdata">The definition of 'onformdata' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onformdata;

  /**
   * The ongotpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes gotpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ongotpointercapture">GlobalEventHandlers.ongotpointercapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#the-gotpointercapture-event">The definition of 'ongotpointercapture' in the 'Pointer Events &ndash; Level 2' specification.</a>
   */
  @Nullable
  public EventHandler ongotpointercapture;

  /**
   * The WindowEventHandlers.onhashchange property of the WindowEventHandlers mixin is the EventHandler for processing hashchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onhashchange">Window.onhashchange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onhashchange">The definition of 'onhashchange' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML5' specification.</a>
   */
  @Nullable
  public HashChangeEventHandler onhashchange;

  /**
   * The onkeydown property of the GlobalEventHandlers mixin is an EventHandler that processes keydown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/oninput">Window.oninput - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeydown">The definition of 'onkeydown' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler oninput;

  /**
   * The oninvalid property of the GlobalEventHandlers mixin is an EventHandler that processes invalid events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oninvalid">GlobalEventHandlers.oninvalid - MDN</a>
   */
  @Nullable
  public EventHandler oninvalid;

  /**
   * The onkeydown property of the GlobalEventHandlers mixin is an EventHandler that processes keydown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onkeydown">Window.onkeydown - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeydown">The definition of 'onkeydown' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onkeydown;

  /**
   * The onkeypress property of the GlobalEventHandlers mixin is an EventHandler that processes keypress events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onkeypress">Window.onkeypress - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeypress">The definition of 'onkeypress' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onkeypress;

  /**
   * The onkeyup property of the GlobalEventHandlers mixin is an EventHandler that processes keyup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onkeyup">Window.onkeyup - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeyup">The definition of 'onkeyup' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onkeyup;

  /**
   * The onlanguagechange property of the WindowEventHandlers mixin is the EventHandler for processing languagechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onlanguagechange">Window.onlanguagechange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onlanguagechange">The definition of 'WindowEventHandler.onlanguagechange' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onlanguagechange;

  /**
   * The onload property of the GlobalEventHandlers mixin is an EventHandler that processes load events on a Window, XMLHttpRequest, img element, etc.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onload">Window.onload - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onload">The definition of 'onload' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onload;

  /**
   * The onloadeddata property of the GlobalEventHandlers mixin is the EventHandler for processing loadeddata events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadeddata">GlobalEventHandlers.onloadeddata - MDN</a>
   */
  @Nullable
  public EventHandler onloadeddata;

  /**
   * The onloadedmetadata property of the GlobalEventHandlers mixin is the EventHandler for processing loadedmetadata events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadedmetadata">GlobalEventHandlers.onloadedmetadata - MDN</a>
   */
  @Nullable
  public EventHandler onloadedmetadata;

  /**
   * The onloadstart property of the GlobalEventHandlers mixin is an EventHandler representing the code to be called when the loadstart event is raised (when progress has begun on the loading of a resource.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadstart">GlobalEventHandlers.onloadstart - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onloadstart">The definition of 'onloadstart' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onloadstart;

  /**
   * The onlostpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes lostpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onlostpointercapture">GlobalEventHandlers.onlostpointercapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#the-lostpointercapture-event">The definition of 'onlostpointercapture' in the 'Pointer Events &ndash; Level 2' specification.</a>
   */
  @Nullable
  public EventHandler onlostpointercapture;

  /**
   * The onmessage property of the WindowEventHandlers mixin is the EventHandler called whenever an object receives a message event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessage">WindowEventHandlers.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessage">The definition of 'onmessage' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public MessageEventHandler onmessage;

  /**
   * The onmessageerror event handler of the WindowEventHandlers interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on a window&mdash;that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessageerror">WindowEventHandlers.onmessageerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessageerror">The definition of 'onmessageerror' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public MessageEventHandler onmessageerror;

  /**
   * The onmousedown property of the GlobalEventHandlers mixin is an EventHandler that processes mousedown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmousedown">Window.onmousedown - MDN</a>
   */
  @Nullable
  public EventHandler onmousedown;

  /**
   * The onmouseenter property of the GlobalEventHandlers mixin is the EventHandler for processing mouseenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseenter">GlobalEventHandlers.onmouseenter - MDN</a>
   */
  @Nullable
  public EventHandler onmouseenter;

  /**
   * The onmouseleave property of the GlobalEventHandlers mixin is the EventHandler for processing mouseleave events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseleave">GlobalEventHandlers.onmouseleave - MDN</a>
   */
  @Nullable
  public EventHandler onmouseleave;

  /**
   * The onmousemove property of the GlobalEventHandlers mixin is an EventHandler that processes mousemove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmousemove">Window.onmousemove - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onmousemove">The definition of 'onmousemove' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onmousemove;

  /**
   * The onmouseout property of the GlobalEventHandlers mixin is an EventHandler that processes mouseout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmouseout">Window.onmouseout - MDN</a>
   */
  @Nullable
  public EventHandler onmouseout;

  /**
   * The onmouseover property of the GlobalEventHandlers mixin is an EventHandler that processes mouseover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmouseover">Window.onmouseover - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onmouseover">The definition of 'onmouseover' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onmouseover;

  /**
   * The onmouseup property of the GlobalEventHandlers mixin is an EventHandler that processes mouseup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmouseup">Window.onmouseup - MDN</a>
   */
  @Nullable
  public EventHandler onmouseup;

  @Nullable
  public EventHandler onoffline;

  @Nullable
  public EventHandler ononline;

  @Nullable
  public EventHandler onorientationchange;

  @Nullable
  public PageTransitionEventHandler onpagehide;

  @Nullable
  public PageTransitionEventHandler onpageshow;

  /**
   * The onpause property of the GlobalEventHandlers mixin is the EventHandler for processing pause events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpause">GlobalEventHandlers.onpause - MDN</a>
   */
  @Nullable
  public EventHandler onpause;

  /**
   * The onplay property of the GlobalEventHandlers mixin is the EventHandler for processing play events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onplay">GlobalEventHandlers.onplay - MDN</a>
   */
  @Nullable
  public EventHandler onplay;

  /**
   * The onplaying property of the GlobalEventHandlers mixin is the EventHandler for processing playing events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onplaying">GlobalEventHandlers.onplaying - MDN</a>
   */
  @Nullable
  public EventHandler onplaying;

  /**
   * The onpointercancel property of the GlobalEventHandlers mixin is an EventHandler that processes pointercancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointercancel">GlobalEventHandlers.onpointercancel - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointercancel">The definition of 'onpointercancel' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointercancel">The definition of 'onpointercancel' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public EventHandler onpointercancel;

  /**
   * The GlobalEventHandlers event handler onpointerdown is used to specify the event handler for the pointerdown event, which is fired when the pointing device is initially pressed. This event can be sent to Window, Document, and Element objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerdown">GlobalEventHandlers.onpointerdown - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerdown">The definition of 'onpointerdown' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerdown">The definition of 'onpointerdown' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public EventHandler onpointerdown;

  /**
   * The onpointerenter property of the GlobalEventHandlers mixin is an EventHandler that processes pointerenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerenter">GlobalEventHandlers.onpointerenter - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerenter">The definition of 'onpointerenter' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerenter">The definition of 'onpointerenter' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public EventHandler onpointerenter;

  /**
   * The global event handler for the pointerleave event, which is delivered to a Node when the pointer (mouse cursor, fingertip, etc.) exits its hit test area (for example, if the cursor exits an Element or Window's content area). This event is part of the Pointer Events API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerleave">GlobalEventHandlers.onpointerleave - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerleave">The definition of 'onpointerleave' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerleave">The definition of 'onpointerleave' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public EventHandler onpointerleave;

  /**
   * The onpointermove property of the GlobalEventHandlers mixin is an EventHandler that processes pointermove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointermove">GlobalEventHandlers.onpointermove - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointermove">The definition of 'onpointermove' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointermove">The definition of 'onpointermove' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public EventHandler onpointermove;

  /**
   * The onpointerout property of the GlobalEventHandlers mixin is an EventHandler that processes pointerout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerout">GlobalEventHandlers.onpointerout - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerout">The definition of 'onpointerout' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerout">The definition of 'onpointerout' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public EventHandler onpointerout;

  /**
   * The onpointerover property of the GlobalEventHandlers mixin is an EventHandler that processes pointerover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerover">GlobalEventHandlers.onpointerover - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerover">The definition of 'onpointerover' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerover">The definition of 'onpointerover' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public EventHandler onpointerover;

  /**
   * The onpointerup property of the GlobalEventHandlers mixin is an EventHandler that processes pointerup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerup">GlobalEventHandlers.onpointerup - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerup">The definition of 'onpointerup' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerup">The definition of 'onpointerup' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public EventHandler onpointerup;

  /**
   * The onpopstate property of the WindowEventHandlers mixin is the EventHandler for processing popstate events on the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onpopstate">Window.onpopstate - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onpopstate">The definition of 'onpopstate' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onpopstate;

  @Nullable
  public EventHandler onprogress;

  @Nullable
  public EventHandler onratechange;

  /**
   * The onrejectionhandled property of the WindowEventHandlers mixin is the EventHandler for processing rejectionhandled events. These events are raised when Promises are rejected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onrejectionhandled">Window.onrejectionhandled - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onrejectionhandled">The definition of 'onrejectionhandled' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public PromiseRejectionEventHandler onrejectionhandled;

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onreset">Window.onreset - MDN</a>
   */
  @Nullable
  public EventHandler onreset;

  /**
   * The onresize property of the GlobalEventHandlers interface is an EventHandler that processes resize events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onresize">Window.onresize - MDN</a>
   */
  @Nullable
  public UIEventHandler onresize;

  /**
   * The onscroll property of the GlobalEventHandlers mixin is an EventHandler that processes scroll events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onscroll">Window.onscroll - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onscroll">The definition of 'onscroll' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#event-type-scroll">The definition of 'onscroll' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   */
  @Nullable
  public EventHandler onscroll;

  @Nullable
  public EventHandler onsecuritypolicyviolation;

  @Nullable
  public EventHandler onseeked;

  @Nullable
  public EventHandler onseeking;

  /**
   * The onselect property of the GlobalEventHandlers mixin is an EventHandler that processes select events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onselect">Window.onselect - MDN</a>
   */
  @Nullable
  public EventHandler onselect;

  /**
   * The onselectionchange property of the GlobalEventHandlers mixin is an EventHandler that processes selectionchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectionchange">GlobalEventHandlers.onselectionchange - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-globaleventhandlers-onselectionchange">The definition of 'GlobalEventHandlers.onselectionchange' in the 'Selection API' specification.</a>
   */
  @Nullable
  public EventHandler onselectionchange;

  /**
   * The onselectstart property of the GlobalEventHandlers mixin is an EventHandler that processes selectstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectstart">GlobalEventHandlers.onselectstart - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-globaleventhandlers-onselectstart">The definition of 'GlobalEventHandlers.onselectstart' in the 'Selection API' specification.</a>
   */
  @Nullable
  public EventHandler onselectstart;

  @Nullable
  public EventHandler onslotchange;

  @Nullable
  public EventHandler onstalled;

  /**
   * The onstorage property of the WindowEventHandlers mixin is an EventHandler for processing storage events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onstorage">Window.onstorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onstorage">The definition of 'onstorage' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public StorageEventHandler onstorage;

  /**
   * The onsubmit property of the GlobalEventHandlers mixin is an EventHandler that processes submit events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onsubmit">Window.onsubmit - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onsubmit">The definition of 'onsubmit' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onsubmit;

  @Nullable
  public EventHandler onsuspend;

  @Nullable
  public EventHandler ontimeupdate;

  @Nullable
  public EventHandler ontoggle;

  /**
   * The ontouchcancel property of the GlobalEventHandlers mixin is an EventHandler that processes touchcancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchcancel">GlobalEventHandlers.ontouchcancel - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchcancel">Touch Events – Level 2</a>
   */
  @Nullable
  public EventHandler ontouchcancel;

  /**
   * A global event handler for the touchend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchend">GlobalEventHandlers.ontouchend - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchend">Touch Events – Level 2</a>
   */
  @Nullable
  public EventHandler ontouchend;

  /**
   * A global event handler for the touchmove event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchmove">GlobalEventHandlers.ontouchmove - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchmove">Touch Events – Level 2</a>
   */
  @Nullable
  public EventHandler ontouchmove;

  /**
   * The ontouchstart property of the GlobalEventHandlers mixin is an EventHandler that processes touchstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchstart">GlobalEventHandlers.ontouchstart - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchstart">Touch Events – Level 2</a>
   */
  @Nullable
  public EventHandler ontouchstart;

  /**
   * The ontransitioncancel property of the GlobalEventHandlers mixin is an EventHandler that processes transitioncancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitioncancel">GlobalEventHandlers.ontransitioncancel - MDN</a>
   */
  @Nullable
  public TransitionEventHandler ontransitioncancel;

  /**
   * The ontransitionend property of the GlobalEventHandlers mixin is an EventHandler that processes transitionend events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitionend">GlobalEventHandlers.ontransitionend - MDN</a>
   */
  @Nullable
  public TransitionEventHandler ontransitionend;

  @Nullable
  public TransitionEventHandler ontransitionrun;

  @Nullable
  public TransitionEventHandler ontransitionstart;

  /**
   * The onunhandledrejection property of the WindowEventHandlers mixin is the EventHandler for processing unhandledrejection events. These events are raised for unhandled Promise rejections.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onunhandledrejection">Window.onunhandledrejection - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onunhandledrejection">The definition of 'onunhandledrejection' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public PromiseRejectionEventHandler onunhandledrejection;

  /**
   * The onunload property of the WindowEventHandlers mixin is the EventHandler for processing unload events. These events fire when the window is unloading its content and resources. The resource removal is processed after the unload event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onunload">Window.onunload - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onunload">The definition of 'onunload' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML5' specification.</a>
   */
  @Nullable
  public EventHandler onunload;

  @Nullable
  public EventHandler onvolumechange;

  @Nullable
  public EventHandler onwaiting;

  @Nullable
  public EventHandler onwebkitanimationend;

  @Nullable
  public EventHandler onwebkitanimationiteration;

  @Nullable
  public EventHandler onwebkitanimationstart;

  @Nullable
  public EventHandler onwebkittransitionend;

  /**
   * The onwheel property of the GlobalEventHandlers mixin is an EventHandler that processes wheel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onwheel">GlobalEventHandlers.onwheel - MDN</a>
   */
  @Nullable
  public EventHandler onwheel;

  /**
   * The Window interface's opener property returns a reference to the window that opened the window, either with open(), or by navigating a link with a target attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/opener">Window.opener - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-opener">The definition of 'window.opener' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public Any opener;

  /**
   * The status property of the Window interface was originally intended to set the text in the status bar at the bottom of the browser window. However, the HTML standard now requires setting window.status to have no effect on the text displayed in the status bar.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/status">Window.status - MDN</a>
   */
  @Nonnull
  public String status;

  protected Window() {
  }

  /**
   * Returns a reference to the application cache object for the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/applicationCache">Window.applicationCache - MDN</a>
   */
  @JsProperty(
      name = "applicationCache"
  )
  @Nonnull
  public native ApplicationCache applicationCache();

  /**
   * The caches read-only property of the WindowOrWorkerGlobalScope interface returns the CacheStorage object associated with the current context. This object enables functionality such as storing assets for offline use, and generating custom responses to requests.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/caches">Window.caches - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#self-caches">The definition of 'caches' in the 'Service Workers' specification.</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/">Service Workers</a>
   */
  @JsProperty(
      name = "caches"
  )
  @Nonnull
  public native CacheStorage caches();

  /**
   * The Window.closed read-only property indicates whether the referenced window is closed or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/closed">Window.closed - MDN</a>
   */
  @JsProperty(
      name = "closed"
  )
  public native boolean closed();

  /**
   * The crossOriginIsolated read-only property of the WindowOrWorkerGlobalScope interface returns a boolean value that indicates whether a SharedArrayBuffer can be sent via a Window.postMessage() call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/crossOriginIsolated">WindowOrWorkerGlobalScope.crossOriginIsolated - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-crossoriginisolated">The definition of 'crossOriginIsolated' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "crossOriginIsolated"
  )
  public native boolean crossOriginIsolated();

  /**
   * The read-only Window.crypto property returns the Crypto object associated to the global object. This object allows web pages access to certain cryptographic related services.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/crypto">Window.crypto - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-GlobalCrypto">The definition of 'Window.crypto' in the 'Web Cryptography API' specification.</a>
   */
  @JsProperty(
      name = "crypto"
  )
  @Nonnull
  public native Crypto crypto();

  /**
   * The customElements read-only property of the Window interface returns a reference to the CustomElementRegistry object, which can be used to register new custom elements and get information about previously registered custom elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/customElements">Window.customElements - MDN</a>
   */
  @JsProperty(
      name = "customElements"
  )
  @Nonnull
  public native CustomElementRegistry customElements();

  /**
   * The devicePixelRatio of Window interface returns the ratio of the resolution in physical pixels to the resolution in CSS pixels for the current display device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio">Window.devicePixelRatio - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-devicepixelratio">The definition of 'Window.devicePixelRatio' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @JsProperty(
      name = "devicePixelRatio"
  )
  public native double devicePixelRatio();

  /**
   * window.document returns a reference to the document contained in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/document">Window.document - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-2">The definition of 'Window.document' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-document-0">The definition of 'Window.document' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "document"
  )
  @Nonnull
  public native Document document();

  /**
   * The read-only Window property event returns the Event which is currently being handled by the site's code. Outside the context of an event handler, the value is always undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/event">Window.event - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-window-event">The definition of 'Window.event' in the 'DOM' specification.</a>
   */
  @JsProperty(
      name = "event"
  )
  @Nullable
  public native Any event();

  @JsProperty(
      name = "external"
  )
  @Nonnull
  public native External external();

  /**
   * The Window.frameElement property returns the element (such as iframe or object) in which the window is embedded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/frameElement">Window.frameElement - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-frameelement">The definition of 'Window.frameElement' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "frameElement"
  )
  @Nullable
  public native Element frameElement();

  /**
   * Returns the window itself, which is an array-like object, listing the direct sub-frames of the current window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/frames">Window.frames - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-frames">The definition of 'Window.frames' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-frames">The definition of 'Window.frames' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "frames"
  )
  @Nonnull
  public native Window frames();

  /**
   * The Window.history read-only property returns a reference to the History object, which provides an interface for manipulating the browser session history (pages visited in the tab or frame that the current page is loaded in).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/history">Window.history - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#the-history-interface">The definition of 'The History interface' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#the-history-interface">The definition of 'The History interface' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "history"
  )
  @Nonnull
  public native History history();

  /**
   * The indexedDB read-only property of the WindowOrWorkerGlobalScope mixin provides a mechanism for applications to asynchronously access the capabilities of indexed databases.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/indexedDB">Window.indexedDB - MDN</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-windoworworkerglobalscope-indexeddb">The definition of 'indexedDB' in the 'Indexed Database API Draft' specification.</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-windoworworkerglobalscope-indexeddb">The definition of 'indexedDB' in the 'Indexed Database API 2.0' specification.</a>
   */
  @JsProperty(
      name = "indexedDB"
  )
  @Nonnull
  public native IDBFactory indexedDB();

  /**
   * The read-only innerHeight property of the Window interface returns the interior height of the window in pixels, including the height of the horizontal scroll bar, if present.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/innerHeight">Window.innerHeight - MDN</a>
   */
  @JsProperty(
      name = "innerHeight"
  )
  public native int innerHeight();

  /**
   * The read-only Window property innerWidth returns the interior width of the window in pixels. This includes the width of the vertical scroll bar, if one is present.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/innerWidth">Window.innerWidth - MDN</a>
   */
  @JsProperty(
      name = "innerWidth"
  )
  public native int innerWidth();

  /**
   * The window.isSecureContext read-only property indicates whether a context is capable of using features that require secure contexts.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/isSecureContext">Window.isSecureContext - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-secure-contexts/">Secure Contexts</a>
   */
  @JsProperty(
      name = "isSecureContext"
  )
  public native boolean isSecureContext();

  /**
   * Returns the number of frames (either frame or iframe elements) in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/length">Window.length - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-length">The definition of 'Window.length' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-length">The definition of 'Window.length' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The read-only localStorage property allows you to access a Storage object for the Document's origin; the stored data is saved across browser sessions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/localStorage">Window.localStorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-localstorage">The definition of 'localStorage' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "localStorage"
  )
  @Nonnull
  public native Storage localStorage();

  /**
   * The Window.location read-only property returns a Location object with information about the current location of the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/location">Window.location - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/history.html#the-location-interface">The definition of 'Window.location' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#the-location-interface">The definition of 'Window.location' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "location"
  )
  @Nonnull
  public native Location location();

  /**
   * Returns the locationbar object, whose visibility can be checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/locationbar">Window.locationbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-locationbar">The definition of 'Window.locationbar' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-locationbar">The definition of 'Window.locationbar' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "locationbar"
  )
  @Nonnull
  public native BarProp locationbar();

  /**
   * The Window.menubar property returns the menubar object, whose visibility can be checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/menubar">Window.menubar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-menubar">The definition of 'Window.menubar' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-menubar">The definition of 'Window.menubar' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "menubar"
  )
  @Nonnull
  public native BarProp menubar();

  /**
   * The Window.navigator read-only property returns a reference to the Navigator object, which has methods and properties about the application running the script.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/navigator">Window.navigator - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator">The definition of 'Window: navigator' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "navigator"
  )
  @Nonnull
  public native Navigator navigator();

  @JsProperty(
      name = "orientation"
  )
  public native short orientation();

  /**
   * The origin read-only property of the WindowOrWorkerGlobalScope interface returns the origin of the global scope, serialized as a string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/origin">WindowOrWorkerGlobalScope.origin - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-origin">The definition of 'WindowOrWorkerGlobalScope.origin' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  @JsProperty(
      name = "originIsolated"
  )
  public native boolean originIsolated();

  /**
   * The Window.outerHeight read-only property returns the height in pixels of the whole browser window, including any sidebar, window chrome, and window-resizing borders/handles.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/outerHeight">Window.outerHeight - MDN</a>
   */
  @JsProperty(
      name = "outerHeight"
  )
  public native int outerHeight();

  /**
   * Window.outerWidth read-only property returns the width of the outside of the browser window. It represents the width of the whole browser window including sidebar (if expanded), window chrome and window resizing borders/handles.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/outerWidth">Window.outerWidth - MDN</a>
   */
  @JsProperty(
      name = "outerWidth"
  )
  public native int outerWidth();

  /**
   * The read-only Window property pageXOffset is an alias for scrollX.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/pageXOffset">Window.pageXOffset - MDN</a>
   */
  @JsProperty(
      name = "pageXOffset"
  )
  public native double pageXOffset();

  /**
   * The read-only Window property pageYOffset is an alias for scrollY; as such, it returns the number of pixels the document is currently scrolled along the vertical axis (that is, up or down) with a value of 0.0, indicating that the top edge of the Document is currently aligned with the top edge of the window's content area.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/pageYOffset">Window.pageYOffset - MDN</a>
   */
  @JsProperty(
      name = "pageYOffset"
  )
  public native double pageYOffset();

  /**
   * The Window.parent property is a reference to the parent of the current window or subframe.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/parent">Window.parent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-parent">The definition of 'window.parent' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "parent"
  )
  @Nullable
  public native Window parent();

  /**
   * The Window interface's performance property returns a Performance object, which can be used to gather performance information about the current document. It serves as the point of exposure for the Performance Timeline API, the High Resolution Time API, the Navigation Timing API, the User Timing API, and the Resource Timing API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/performance">Window.performance - MDN</a>
   * @see <a href="https://www.w3.org/TR/hr-time-1/#performance">The definition of 'window.performance' in the 'High Resolution Time' specification.</a>
   */
  @JsProperty(
      name = "performance"
  )
  @Nonnull
  public native Performance performance();

  /**
   * Returns the personalbar object, whose visibility can be toggled in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/personalbar">Window.personalbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-personalbar">The definition of 'Window.personalbar' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-personalbar">The definition of 'Window.personalbar' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "personalbar"
  )
  @Nonnull
  public native BarProp personalbar();

  /**
   * The Window property screen returns a reference to the screen object associated with the window. The screen object, implementing the Screen interface, is a special object for inspecting properties of the screen on which the current window is being rendered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screen">Window.screen - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screen">The definition of 'window.screen' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @JsProperty(
      name = "screen"
  )
  @Nonnull
  public native Screen screen();

  /**
   * The Window.screenLeft read-only property returns the horizontal distance, in CSS pixels, from the left border of the user's browser viewport to the left side of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenLeft">Window.screenLeft - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screenx">The definition of 'Window.screenLeft' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @JsProperty(
      name = "screenLeft"
  )
  public native int screenLeft();

  /**
   * The Window.screenTop read-only property returns the vertical distance, in CSS pixels, from the top border of the user's browser viewport to the top side of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenTop">Window.screenTop - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screeny">The definition of 'Window.screenTop' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @JsProperty(
      name = "screenTop"
  )
  public native int screenTop();

  /**
   * The Window.screenX read-only property returns the horizontal distance, in CSS pixels, of the left border of the user's browser viewport to the left side of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenX">Window.screenX - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screenx">The definition of 'Window.screenX' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @JsProperty(
      name = "screenX"
  )
  public native int screenX();

  /**
   * The Window.screenY read-only property returns the vertical distance, in CSS pixels, of the top border of the user's browser viewport to the top edge of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenY">Window.screenY - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screeny">The definition of 'Window.screenY' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @JsProperty(
      name = "screenY"
  )
  public native int screenY();

  /**
   * The read-only scrollX property of the Window interface returns the number of pixels that the document is currently scrolled horizontally. This value is subpixel precise in modern browsers, meaning that it isn't necessarily a whole number. You can get the number of pixels the document is scrolled vertically from the scrollY property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollX">Window.scrollX - MDN</a>
   */
  @JsProperty(
      name = "scrollX"
  )
  public native double scrollX();

  /**
   * The read-only scrollY property of the Window interface returns the number of pixels that the document is currently scrolled vertically.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollY">Window.scrollY - MDN</a>
   */
  @JsProperty(
      name = "scrollY"
  )
  public native double scrollY();

  /**
   * The Window.scrollbars property returns the scrollbars object, whose visibility can be checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollbars">Window.scrollbars - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-scrollbars">The definition of 'Window.scrollbars' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-scrollbars">The definition of 'Window.scrollbars' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "scrollbars"
  )
  @Nonnull
  public native BarProp scrollbars();

  /**
   * The Window.self read-only property returns the window itself, as a WindowProxy. It can be used with dot notation on a window object (that is, window.self) or standalone (self). The advantage of the standalone notation is that a similar notation exists for non-window contexts, such as in Web Workers. By using self, you can refer to the global scope in a way that will work not only in a window context (self will resolve to window.self) but also in a worker context (self will then resolve to WorkerGlobalScope.self).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/self">Window.self - MDN</a>
   */
  @JsProperty(
      name = "self"
  )
  @Nonnull
  public native Window self();

  /**
   * The read-only sessionStorage property accesses a session Storage object for the current origin. sessionStorage is similar to localStorage; the difference is that while data in localStorage doesn't expire, data in sessionStorage is cleared when the page session ends.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/sessionStorage">Window.sessionStorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-sessionstorage">The definition of 'sessionStorage' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "sessionStorage"
  )
  @Nonnull
  public native Storage sessionStorage();

  /**
   * The speechSynthesis read-only property of the Window object returns a SpeechSynthesis object, which is the entry point into using Web Speech API speech synthesis functionality.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/speechSynthesis">Window.speechSynthesis - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#tts-section">The definition of 'SpeechSynthesis' in the 'Web Speech API' specification.</a>
   */
  @JsProperty(
      name = "speechSynthesis"
  )
  @Nonnull
  public native SpeechSynthesis speechSynthesis();

  /**
   * The Window.statusbar property returns the statusbar object, whose visibility can be toggled in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/statusbar">Window.statusbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-statusbar">The definition of 'Window.statusbar' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-statusbar">The definition of 'Window.statusbar' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "statusbar"
  )
  @Nonnull
  public native BarProp statusbar();

  /**
   * The Window.toolbar property returns the toolbar object, whose visibility can be toggled in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/toolbar">Window.toolbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-toolbar">The definition of 'Window.toolbar' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-toolbar">The definition of 'Window.toolbar' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "toolbar"
  )
  @Nonnull
  public native BarProp toolbar();

  /**
   * Returns a reference to the topmost window in the window hierarchy.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/top">Window.top - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-top">The definition of 'window.top' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-top">The definition of 'window.top' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "top"
  )
  @Nullable
  public native Window top();

  /**
   * The visualViewport read-only property of the Window interface returns a VisualViewport object representing the visual viewport for a given window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/visualViewport">Window.visualViewport - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-window-visualviewport">The definition of 'visualViewport' in the 'Visual Viewport API' specification.</a>
   */
  @JsProperty(
      name = "visualViewport"
  )
  @Nonnull
  public native VisualViewport visualViewport();

  /**
   * The window property of a Window object points to the window object itself.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/window">Window.window - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-window">The definition of 'Window.window' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/browsers.html#dom-window">The definition of 'Window.window' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window">The definition of 'Window.window' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "window"
  )
  @Nonnull
  public native Window window();

  /**
   * The Window.alert() method displays an alert dialog with the optional specified content and an OK button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/alert">Window.alert - MDN</a>
   */
  public native void alert();

  /**
   * The Window.alert() method displays an alert dialog with the optional specified content and an OK button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/alert">Window.alert - MDN</a>
   */
  public native void alert(@Nonnull String message);

  /**
   * Shifts focus away from the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/blur">Window.blur - MDN</a>
   */
  public native void blur();

  /**
   * The Window.close() method closes the current window, or the window on which it was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/close">Window.close - MDN</a>
   */
  public native void close();

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and two buttons: OK and Cancel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/confirm">Window.confirm - MDN</a>
   */
  public native boolean confirm(@Nonnull String message);

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and two buttons: OK and Cancel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/confirm">Window.confirm - MDN</a>
   */
  public native boolean confirm();

  /**
   * Makes a request to bring the window to the front. It may fail due to user settings and the window isn't guaranteed to be frontmost before this method returns.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/focus">Window.focus - MDN</a>
   */
  public native void focus();

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @Nullable
  public native Window open(@Nonnull String url, @Nonnull String target, @Nonnull String features);

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @Nullable
  public native Window open(@Nonnull String url, @Nonnull String target);

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @Nullable
  public native Window open(@Nonnull String url);

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @Nullable
  public native Window open();

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin, @Nonnull JsArray<Transferable> transfer);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin, @Nonnull Transferable[] transfer);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull WindowPostMessageOptions options);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message);

  /**
   * Opens the Print Dialog to print the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/print">Window.print - MDN</a>
   */
  public native void print();

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   */
  @Nullable
  public native String prompt(@Nonnull String message, @Nonnull String default_);

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   */
  @Nullable
  public native String prompt(@Nonnull String message);

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   */
  @Nullable
  public native String prompt();

  /**
   * The window.stop() stops further resource loading in the current browsing context, equivalent to the stop button in the browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/stop">Window.stop - MDN</a>
   */
  public native void stop();

  @JsOverlay
  @Nonnull
  public final Object get(@Nonnull final String name) {
    return Js.<JsPropertyMap<Object>>cast( this ).get( name );
  }

  /**
   * The Window.getComputedStyle() method returns an object containing the values of all CSS properties of an element, after applying active stylesheets and resolving any basic computation those values may contain.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getComputedStyle">Window.getComputedStyle - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-window-getcomputedstyle">The definition of 'getComputedStyle()' in the 'CSS Object Model (CSSOM)' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/#CSS-CSSview-getComputedStyle">The definition of 'getComputedStyle()' in the 'Document Object Model (DOM) Level 2 Style Specification' specification.</a>
   */
  @Nonnull
  public native CSSStyleDeclaration getComputedStyle(@Nonnull Element elt,
      @Nonnull String pseudoElt);

  /**
   * The Window.getComputedStyle() method returns an object containing the values of all CSS properties of an element, after applying active stylesheets and resolving any basic computation those values may contain.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getComputedStyle">Window.getComputedStyle - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-window-getcomputedstyle">The definition of 'getComputedStyle()' in the 'CSS Object Model (CSSOM)' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/#CSS-CSSview-getComputedStyle">The definition of 'getComputedStyle()' in the 'Document Object Model (DOM) Level 2 Style Specification' specification.</a>
   */
  @Nonnull
  public native CSSStyleDeclaration getComputedStyle(@Nonnull Element elt);

  /**
   * The Window interface's matchMedia() method returns a new MediaQueryList object that can then be used to determine if the document matches the media query string, as well as to monitor the document to detect when it matches (or stops matching) that media query.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/matchMedia">Window.matchMedia - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-matchmedia">The definition of 'Window.matchMedia()' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @Nonnull
  public native MediaQueryList matchMedia(@Nonnull String query);

  /**
   * The moveBy() method of the Window interface moves the current window by a specified amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/moveBy">Window.moveBy - MDN</a>
   */
  public native void moveBy(int x, int y);

  /**
   * The moveTo() method of the Window interface moves the current window to the specified coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/moveTo">Window.moveTo - MDN</a>
   */
  public native void moveTo(int x, int y);

  /**
   * The Window.resizeBy() method resizes the current window by a specified amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/resizeBy">Window.resizeBy - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-resizeby">The definition of 'window.resizeBy()' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public native void resizeBy(int x, int y);

  /**
   * The Window.resizeTo() method dynamically resizes the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/resizeTo">Window.resizeTo - MDN</a>
   */
  public native void resizeTo(int width, int height);

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   */
  public native void scroll(@Nonnull ScrollToOptions options);

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   */
  public native void scroll();

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   */
  public native void scroll(double x, double y);

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   */
  public native void scrollBy(@Nonnull ScrollToOptions options);

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   */
  public native void scrollBy();

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   */
  public native void scrollBy(double x, double y);

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">The definition of 'window.scroll()' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public native void scrollTo(@Nonnull ScrollToOptions options);

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">The definition of 'window.scroll()' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public native void scrollTo();

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">The definition of 'window.scroll()' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public native void scrollTo(double x, double y);

  /**
   * The Window.getSelection() method returns a Selection object representing the range of text selected by the user or the current position of the caret.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getSelection">Window.getSelection - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#extensions-to-window-interface">The definition of 'Window.getSelection()' in the 'Selection API' specification.</a>
   */
  @Nullable
  public native Selection getSelection();

  /**
   * The Window.captureEvents() method registers the window to capture all events of the specified type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/captureEvents">Window.captureEvents - MDN</a>
   */
  public native void captureEvents();

  /**
   * Releases the window from trapping events of a specific type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/releaseEvents">Window.releaseEvents - MDN</a>
   */
  public native void releaseEvents();

  /**
   * The WindowOrWorkerGlobalScope.atob() function decodes a string of data which has been encoded using Base64 encoding. You can use the btoa() method to encode and transmit data which may otherwise cause communication problems, then transmit it and use the atob() method to decode the data again. For example, you can encode, transmit, and decode control characters such as ASCII values 0 through 31.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/atob">Window.atob - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-atob">The definition of 'WindowOrWorkerGlobalScope.atob()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/#dom-windowbase64-atob">The definition of 'WindowBase64.atob()' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/#dom-windowbase64-atob">The definition of 'WindowBase64.atob()' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public native String atob(@Nonnull String data);

  /**
   * The WindowOrWorkerGlobalScope.btoa() method creates a Base64-encoded ASCII string from a binary string (i.e., a String object in which each character in the string is treated as a byte of binary data).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/btoa">Window.btoa - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-btoa">The definition of 'WindowOrWorkerGlobalScope.btoa()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/#dom-windowbase64-btoa">The definition of 'WindowBase64.btoa()' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/#dom-windowbase64-btoa">The definition of 'WindowBase64.btoa()' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public native String btoa(@Nonnull String data);

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearInterval">Window.clearInterval - MDN</a>
   */
  public native void clearInterval(int handle);

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearInterval">Window.clearInterval - MDN</a>
   */
  public native void clearInterval();

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearTimeout">Window.clearTimeout - MDN</a>
   */
  public native void clearTimeout(int handle);

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearTimeout">Window.clearTimeout - MDN</a>
   */
  public native void clearTimeout();

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image, int sx, int sy,
      int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image, int sx, int sy, int sw,
      int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image, int sx, int sy,
      int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image, int sx, int sy,
      int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image, int sx, int sy, int sw,
      int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image, int sx, int sy,
      int sw, int sh);

  /**
   * The queueMicrotask() method, which is exposed on the Window or Worker interface, queues a microtask to be executed at a safe time prior to control returning to the browser's event loop.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/queueMicrotask">WindowOrWorkerGlobalScope.queueMicrotask - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#microtask-queuing">The definition of 'self.queueMicrotask()' in the 'HTML Living Standard' specification.</a>
   */
  public native void queueMicrotask(@Nonnull VoidFunction callback);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in the 'HTML Living Standard' specification.</a>
   */
  public native int setInterval(@Nonnull TimerHandler handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in the 'HTML Living Standard' specification.</a>
   */
  public native int setInterval(@Nonnull String handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in the 'HTML Living Standard' specification.</a>
   */
  public native int setInterval(@Nonnull Function handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in the 'HTML Living Standard' specification.</a>
   */
  public native int setInterval(@Nonnull TimerHandler handler, int timeout);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in the 'HTML Living Standard' specification.</a>
   */
  public native int setInterval(@Nonnull String handler, int timeout);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in the 'HTML Living Standard' specification.</a>
   */
  public native int setInterval(@Nonnull Function handler, int timeout);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in the 'HTML Living Standard' specification.</a>
   */
  public native int setTimeout(@Nonnull TimerHandler handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in the 'HTML Living Standard' specification.</a>
   */
  public native int setTimeout(@Nonnull String handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in the 'HTML Living Standard' specification.</a>
   */
  public native int setTimeout(@Nonnull Function handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in the 'HTML Living Standard' specification.</a>
   */
  public native int setTimeout(@Nonnull TimerHandler handler, int timeout);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in the 'HTML Living Standard' specification.</a>
   */
  public native int setTimeout(@Nonnull String handler, int timeout);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in the 'HTML Living Standard' specification.</a>
   */
  public native int setTimeout(@Nonnull Function handler, int timeout);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public native Promise<Response> fetch(@Nonnull RequestInfo input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public native Promise<Response> fetch(@Nonnull Request input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public native Promise<Response> fetch(@Nonnull String input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public native Promise<Response> fetch(@Nonnull RequestInfo input);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public native Promise<Response> fetch(@Nonnull Request input);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public native Promise<Response> fetch(@Nonnull String input);

  /**
   * The window.cancelAnimationFrame() method cancels an animation frame request previously scheduled through a call to window.requestAnimationFrame().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/cancelAnimationFrame">Window.cancelAnimationFrame - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#animationframeprovider-cancelanimationframe">The definition of 'cancelAnimationFrame()' in the 'HTML Living Standard' specification.</a>
   */
  public native void cancelAnimationFrame(int handle);

  /**
   * The window.requestAnimationFrame() method tells the browser that you wish to perform an animation and requests that the browser calls a specified function to update an animation before the next repaint. The method takes a callback as an argument to be invoked before the repaint.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/requestAnimationFrame">Window.requestAnimationFrame - MDN</a>
   */
  public native int requestAnimationFrame(@Nonnull FrameRequestCallback callback);

  @JsOverlay
  public final void addHashchangeListener(@Nonnull final HashChangeEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "hashchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addHashchangeListener(@Nonnull final HashChangeEventListener callback,
      final boolean useCapture) {
    addEventListener( "hashchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addHashchangeListener(@Nonnull final HashChangeEventListener callback) {
    addEventListener( "hashchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeHashchangeListener(@Nonnull final HashChangeEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "hashchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeHashchangeListener(@Nonnull final HashChangeEventListener callback,
      final boolean useCapture) {
    removeEventListener( "hashchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeHashchangeListener(@Nonnull final HashChangeEventListener callback) {
    removeEventListener( "hashchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "messageerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "messageerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "messageerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "messageerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPagehideListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pagehide", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPagehideListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "pagehide", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPagehideListener(@Nonnull final PageTransitionEventListener callback) {
    addEventListener( "pagehide", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePagehideListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pagehide", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePagehideListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pagehide", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePagehideListener(@Nonnull final PageTransitionEventListener callback) {
    removeEventListener( "pagehide", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPageshowListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pageshow", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPageshowListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "pageshow", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPageshowListener(@Nonnull final PageTransitionEventListener callback) {
    addEventListener( "pageshow", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePageshowListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pageshow", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePageshowListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "pageshow", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePageshowListener(@Nonnull final PageTransitionEventListener callback) {
    removeEventListener( "pageshow", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "rejectionhandled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    addEventListener( "rejectionhandled", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    addEventListener( "rejectionhandled", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "rejectionhandled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    removeEventListener( "rejectionhandled", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    removeEventListener( "rejectionhandled", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addStorageListener(@Nonnull final StorageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "storage", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addStorageListener(@Nonnull final StorageEventListener callback,
      final boolean useCapture) {
    addEventListener( "storage", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addStorageListener(@Nonnull final StorageEventListener callback) {
    addEventListener( "storage", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeStorageListener(@Nonnull final StorageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "storage", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeStorageListener(@Nonnull final StorageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "storage", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeStorageListener(@Nonnull final StorageEventListener callback) {
    removeEventListener( "storage", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "unhandledrejection", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    addEventListener( "unhandledrejection", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    addEventListener( "unhandledrejection", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "unhandledrejection", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    removeEventListener( "unhandledrejection", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    removeEventListener( "unhandledrejection", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDOMContentLoadedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "DOMContentLoaded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDOMContentLoadedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "DOMContentLoaded", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDOMContentLoadedListener(@Nonnull final EventListener callback) {
    addEventListener( "DOMContentLoaded", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDOMContentLoadedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "DOMContentLoaded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDOMContentLoadedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "DOMContentLoaded", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDOMContentLoadedListener(@Nonnull final EventListener callback) {
    removeEventListener( "DOMContentLoaded", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAfterprintListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "afterprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAfterprintListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "afterprint", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAfterprintListener(@Nonnull final EventListener callback) {
    addEventListener( "afterprint", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAfterprintListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "afterprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAfterprintListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "afterprint", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAfterprintListener(@Nonnull final EventListener callback) {
    removeEventListener( "afterprint", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    addEventListener( "animationcancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAnimationcancelListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    removeEventListener( "animationcancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationendListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationendListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    addEventListener( "animationend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAnimationendListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAnimationendListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationendListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    removeEventListener( "animationend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAnimationendListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationiteration", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    addEventListener( "animationiteration", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAnimationiterationListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationiteration", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationiteration", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    removeEventListener( "animationiteration", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAnimationiterationListener(
      @Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationiteration", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationstartListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationstartListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    addEventListener( "animationstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAnimationstartListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAnimationstartListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationstartListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    removeEventListener( "animationstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAnimationstartListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAppinstalledListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "appinstalled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAppinstalledListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "appinstalled", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAppinstalledListener(@Nonnull final EventListener callback) {
    addEventListener( "appinstalled", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAppinstalledListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "appinstalled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAppinstalledListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "appinstalled", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAppinstalledListener(@Nonnull final EventListener callback) {
    removeEventListener( "appinstalled", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addBeforeprintListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "beforeprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBeforeprintListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "beforeprint", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addBeforeprintListener(@Nonnull final EventListener callback) {
    addEventListener( "beforeprint", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeBeforeprintListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "beforeprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBeforeprintListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "beforeprint", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeBeforeprintListener(@Nonnull final EventListener callback) {
    removeEventListener( "beforeprint", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addBeforeunloadListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "beforeunload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBeforeunloadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "beforeunload", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addBeforeunloadListener(@Nonnull final EventListener callback) {
    addEventListener( "beforeunload", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeBeforeunloadListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "beforeunload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBeforeunloadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "beforeunload", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeBeforeunloadListener(@Nonnull final EventListener callback) {
    removeEventListener( "beforeunload", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addBlurListener(@Nonnull final FocusEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "blur", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBlurListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    addEventListener( "blur", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addBlurListener(@Nonnull final FocusEventListener callback) {
    addEventListener( "blur", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeBlurListener(@Nonnull final FocusEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "blur", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBlurListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    removeEventListener( "blur", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeBlurListener(@Nonnull final FocusEventListener callback) {
    removeEventListener( "blur", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "clipboardchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    addEventListener( "clipboardchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addClipboardchangeListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "clipboardchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "clipboardchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    removeEventListener( "clipboardchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeClipboardchangeListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "clipboardchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCopyListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "copy", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCopyListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    addEventListener( "copy", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCopyListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "copy", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCopyListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "copy", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCopyListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    removeEventListener( "copy", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCopyListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "copy", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCutListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "cut", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCutListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    addEventListener( "cut", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCutListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "cut", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCutListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "cut", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCutListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    removeEventListener( "cut", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCutListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "cut", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "devicemotion", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      final boolean useCapture) {
    addEventListener( "devicemotion", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDevicemotionListener(@Nonnull final DeviceMotionEventListener callback) {
    addEventListener( "devicemotion", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "devicemotion", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "devicemotion", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDevicemotionListener(@Nonnull final DeviceMotionEventListener callback) {
    removeEventListener( "devicemotion", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "deviceorientation", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback, final boolean useCapture) {
    addEventListener( "deviceorientation", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback) {
    addEventListener( "deviceorientation", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "deviceorientation", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback, final boolean useCapture) {
    removeEventListener( "deviceorientation", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback) {
    removeEventListener( "deviceorientation", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addFocusListener(@Nonnull final FocusEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "focus", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFocusListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    addEventListener( "focus", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addFocusListener(@Nonnull final FocusEventListener callback) {
    addEventListener( "focus", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeFocusListener(@Nonnull final FocusEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "focus", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeFocusListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    removeEventListener( "focus", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeFocusListener(@Nonnull final FocusEventListener callback) {
    removeEventListener( "focus", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "gamepadconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean useCapture) {
    addEventListener( "gamepadconnected", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addGamepadconnectedListener(@Nonnull final GamepadEventListener callback) {
    addEventListener( "gamepadconnected", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "gamepadconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean useCapture) {
    removeEventListener( "gamepadconnected", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeGamepadconnectedListener(@Nonnull final GamepadEventListener callback) {
    removeEventListener( "gamepadconnected", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "gamepaddisconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean useCapture) {
    addEventListener( "gamepaddisconnected", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback) {
    addEventListener( "gamepaddisconnected", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "gamepaddisconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean useCapture) {
    removeEventListener( "gamepaddisconnected", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeGamepaddisconnectedListener(
      @Nonnull final GamepadEventListener callback) {
    removeEventListener( "gamepaddisconnected", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLanguagechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "languagechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLanguagechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "languagechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLanguagechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "languagechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLanguagechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "languagechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLanguagechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "languagechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLanguagechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "languagechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "load", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final EventListener callback) {
    addEventListener( "load", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "load", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final EventListener callback) {
    removeEventListener( "load", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addOfflineListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "offline", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOfflineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "offline", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addOfflineListener(@Nonnull final EventListener callback) {
    addEventListener( "offline", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeOfflineListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "offline", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOfflineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "offline", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeOfflineListener(@Nonnull final EventListener callback) {
    removeEventListener( "offline", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addOnlineListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "online", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOnlineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "online", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addOnlineListener(@Nonnull final EventListener callback) {
    addEventListener( "online", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeOnlineListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "online", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOnlineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "online", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeOnlineListener(@Nonnull final EventListener callback) {
    removeEventListener( "online", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addOrientationchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "orientationchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOrientationchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "orientationchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addOrientationchangeListener(@Nonnull final EventListener callback) {
    addEventListener( "orientationchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeOrientationchangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "orientationchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOrientationchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "orientationchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeOrientationchangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "orientationchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPasteListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "paste", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPasteListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    addEventListener( "paste", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPasteListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "paste", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePasteListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "paste", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePasteListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    removeEventListener( "paste", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePasteListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "paste", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addResizeListener(@Nonnull final UIEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "resize", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addResizeListener(@Nonnull final UIEventListener callback,
      final boolean useCapture) {
    addEventListener( "resize", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addResizeListener(@Nonnull final UIEventListener callback) {
    addEventListener( "resize", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeResizeListener(@Nonnull final UIEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "resize", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeResizeListener(@Nonnull final UIEventListener callback,
      final boolean useCapture) {
    removeEventListener( "resize", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeResizeListener(@Nonnull final UIEventListener callback) {
    removeEventListener( "resize", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitioncancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "transitioncancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTransitioncancelListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitioncancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitioncancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "transitioncancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTransitioncancelListener(
      @Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitioncancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitionendListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitionend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitionendListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "transitionend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTransitionendListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitionend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTransitionendListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitionend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionendListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "transitionend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTransitionendListener(@Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitionrunListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitionrun", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitionrunListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "transitionrun", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTransitionrunListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitionrun", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTransitionrunListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitionrun", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionrunListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "transitionrun", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTransitionrunListener(@Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionrun", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitionstartListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitionstartListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "transitionstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTransitionstartListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitionstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTransitionstartListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionstartListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "transitionstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTransitionstartListener(@Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addUnloadListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "unload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUnloadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "unload", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addUnloadListener(@Nonnull final EventListener callback) {
    addEventListener( "unload", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeUnloadListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "unload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUnloadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "unload", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeUnloadListener(@Nonnull final EventListener callback) {
    removeEventListener( "unload", Js.cast( callback ) );
  }
}
