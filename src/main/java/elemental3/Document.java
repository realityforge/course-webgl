package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The Document interface represents any web page loaded in the browser and serves as an entry point into the web page's content, which is the DOM tree.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document">Document - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Document"
)
public class Document extends Node {
  /**
   * The Document.onvisibilitychange property represents the event handler that is called when a visibilitychange event reaches this object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onvisibilitychange">Document.onvisibilitychange - MDN</a>
   */
  @Nullable
  public EventHandler onvisibilitychange;

  @Nullable
  public EventHandler onpointerlockchange;

  @Nullable
  public EventHandler onpointerlockerror;

  /**
   * The Document interface's onfullscreenchange property is an event handler for the fullscreenchange event that is fired immediately before a document transitions into or out of full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onfullscreenchange">Document.onfullscreenchange - MDN</a>
   */
  @Nullable
  public EventHandler onfullscreenchange;

  @Nullable
  public EventHandler onfullscreenerror;

  /**
   * The Document.body property represents the body or frameset node of the current document, or null if no such element exists.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/body">Document.body - MDN</a>
   */
  @Nullable
  public HTMLElement body;

  @Nonnull
  public String cookie;

  @Nonnull
  public String designMode;

  @Nonnull
  public String dir;

  @Nonnull
  public String domain;

  @Nullable
  public EventHandler onreadystatechange;

  @Nonnull
  public String title;

  @Nonnull
  public String alinkColor;

  @Nonnull
  public String bgColor;

  @Nonnull
  public String fgColor;

  @Nonnull
  public String linkColor;

  @Nonnull
  public String vlinkColor;

  /**
   * The onabort property of the GlobalEventHandlers mixin is the EventHandler for processing abort events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onabort">GlobalEventHandlers.onabort - MDN</a>
   */
  @Nullable
  public EventHandler onabort;

  /**
   * The onauxclick property of the GlobalEventHandlers mixin is an EventHandler for processing auxclick events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onauxclick">GlobalEventHandlers.onauxclick - MDN</a>
   */
  @Nullable
  public EventHandler onauxclick;

  /**
   * The onblur property of the GlobalEventHandlers mixin is the EventHandler for processing blur events. It's available on Element, Document, and Window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onblur">GlobalEventHandlers.onblur - MDN</a>
   */
  @Nullable
  public EventHandler onblur;

  /**
   * The oncancel property of the GlobalEventHandlers mixin is an EventHandler for processing cancel events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncancel">GlobalEventHandlers.oncancel - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onchange">GlobalEventHandlers.onchange - MDN</a>
   */
  @Nullable
  public EventHandler onchange;

  /**
   * The onclick property of the GlobalEventHandlers mixin is the EventHandler for processing click events on a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclick">GlobalEventHandlers.onclick - MDN</a>
   */
  @Nullable
  public EventHandler onclick;

  /**
   * The onclose property of the GlobalEventHandlers mixin is an EventHandler for processing close events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclose">GlobalEventHandlers.onclose - MDN</a>
   */
  @Nullable
  public EventHandler onclose;

  /**
   * The oncontextmenu property of the GlobalEventHandlers mixin is an EventHandler that processes contextmenu events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncontextmenu">GlobalEventHandlers.oncontextmenu - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondblclick">GlobalEventHandlers.ondblclick - MDN</a>
   */
  @Nullable
  public EventHandler ondblclick;

  /**
   * A global event handler for the drag event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrag">GlobalEventHandlers.ondrag - MDN</a>
   */
  @Nullable
  public DragEventHandler ondrag;

  /**
   * A global event handler for the dragend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragend">GlobalEventHandlers.ondragend - MDN</a>
   */
  @Nullable
  public DragEventHandler ondragend;

  /**
   * A global event handler for the dragenter event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragenter">GlobalEventHandlers.ondragenter - MDN</a>
   */
  @Nullable
  public DragEventHandler ondragenter;

  /**
   * The GlobalEventHandler.ondragexit property is an event handler for the dragexit event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragexit">GlobalEventHandlers.ondragexit - MDN</a>
   */
  @Nullable
  public DragEventHandler ondragexit;

  /**
   * A global event handler for the dragleave event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragleave">GlobalEventHandlers.ondragleave - MDN</a>
   */
  @Nullable
  public DragEventHandler ondragleave;

  /**
   * A global event handler for the dragover event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragover">GlobalEventHandlers.ondragover - MDN</a>
   */
  @Nullable
  public DragEventHandler ondragover;

  /**
   * A global event handler for the dragstart event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragstart">GlobalEventHandlers.ondragstart - MDN</a>
   */
  @Nullable
  public DragEventHandler ondragstart;

  /**
   * A global event handler for the drop event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrop">GlobalEventHandlers.ondrop - MDN</a>
   */
  @Nullable
  public DragEventHandler ondrop;

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
   */
  @Nullable
  public OnErrorEventHandler onerror;

  /**
   * The onfocus property of the GlobalEventHandlers mixin is an EventHandler that processes focus events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onfocus">GlobalEventHandlers.onfocus - MDN</a>
   */
  @Nullable
  public EventHandler onfocus;

  /**
   * The onformdata property of the GlobalEventHandlers mixin is the EventHandler for processing formdata events, fired after the entry list representing the form's data is constructed. This happens when the form is submitted, but can also be triggered by the invocation of a FormData() constructor. onformdata is available on HTMLFormElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onformdata">GlobalEventHandlers.onformdata - MDN</a>
   */
  @Nullable
  public EventHandler onformdata;

  /**
   * The oninput property of the GlobalEventHandlers mixin is an EventHandler that processes input events on the input, select, and textarea elements. It also handles these events on elements where contenteditable or designMode are turned on.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oninput">GlobalEventHandlers.oninput - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onkeydown">GlobalEventHandlers.onkeydown - MDN</a>
   */
  @Nullable
  public KeyboardEventHandler onkeydown;

  /**
   * The onkeypress property of the GlobalEventHandlers mixin is an EventHandler that processes keypress events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onkeypress">GlobalEventHandlers.onkeypress - MDN</a>
   */
  @Nullable
  public EventHandler onkeypress;

  /**
   * The onkeyup property of the GlobalEventHandlers mixin is an EventHandler that processes keyup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onkeyup">GlobalEventHandlers.onkeyup - MDN</a>
   */
  @Nullable
  public KeyboardEventHandler onkeyup;

  /**
   * The onload property of the GlobalEventHandlers mixin is an EventHandler that processes load events on a Window, XMLHttpRequest, img element, etc.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onload">GlobalEventHandlers.onload - MDN</a>
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
   */
  @Nullable
  public EventHandler onloadstart;

  /**
   * The onmousedown property of the GlobalEventHandlers mixin is an EventHandler that processes mousedown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmousedown">GlobalEventHandlers.onmousedown - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmousemove">GlobalEventHandlers.onmousemove - MDN</a>
   */
  @Nullable
  public EventHandler onmousemove;

  /**
   * The onmouseout property of the GlobalEventHandlers mixin is an EventHandler that processes mouseout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseout">GlobalEventHandlers.onmouseout - MDN</a>
   */
  @Nullable
  public EventHandler onmouseout;

  /**
   * The onmouseover property of the GlobalEventHandlers mixin is an EventHandler that processes mouseover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseover">GlobalEventHandlers.onmouseover - MDN</a>
   */
  @Nullable
  public EventHandler onmouseover;

  /**
   * The onmouseup property of the GlobalEventHandlers mixin is an EventHandler that processes mouseup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseup">GlobalEventHandlers.onmouseup - MDN</a>
   */
  @Nullable
  public EventHandler onmouseup;

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

  @Nullable
  public EventHandler onprogress;

  @Nullable
  public EventHandler onratechange;

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onreset">GlobalEventHandlers.onreset - MDN</a>
   */
  @Nullable
  public EventHandler onreset;

  /**
   * The onresize property of the GlobalEventHandlers interface is an EventHandler that processes resize events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onresize">GlobalEventHandlers.onresize - MDN</a>
   */
  @Nullable
  public EventHandler onresize;

  /**
   * The onscroll property of the GlobalEventHandlers mixin is an EventHandler that processes scroll events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onscroll">GlobalEventHandlers.onscroll - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselect">GlobalEventHandlers.onselect - MDN</a>
   */
  @Nullable
  public EventHandler onselect;

  @Nullable
  public EventHandler onslotchange;

  @Nullable
  public EventHandler onstalled;

  /**
   * The onsubmit property of the GlobalEventHandlers mixin is an EventHandler that processes submit events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onsubmit">GlobalEventHandlers.onsubmit - MDN</a>
   */
  @Nullable
  public EventHandler onsubmit;

  @Nullable
  public EventHandler onsuspend;

  @Nullable
  public EventHandler ontimeupdate;

  @Nullable
  public EventHandler ontoggle;

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
  public WheelEventHandler onwheel;

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
   * The ongotpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes gotpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ongotpointercapture">GlobalEventHandlers.ongotpointercapture - MDN</a>
   */
  @Nullable
  public PointerEventHandler ongotpointercapture;

  /**
   * The onlostpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes lostpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onlostpointercapture">GlobalEventHandlers.onlostpointercapture - MDN</a>
   */
  @Nullable
  public PointerEventHandler onlostpointercapture;

  /**
   * The onpointercancel property of the GlobalEventHandlers mixin is an EventHandler that processes pointercancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointercancel">GlobalEventHandlers.onpointercancel - MDN</a>
   */
  @Nullable
  public PointerEventHandler onpointercancel;

  /**
   * The GlobalEventHandlers event handler onpointerdown is used to specify the event handler for the pointerdown event, which is fired when the pointing device is initially pressed. This event can be sent to Window, Document, and Element objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerdown">GlobalEventHandlers.onpointerdown - MDN</a>
   */
  @Nullable
  public PointerEventHandler onpointerdown;

  /**
   * The onpointerenter property of the GlobalEventHandlers mixin is an EventHandler that processes pointerenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerenter">GlobalEventHandlers.onpointerenter - MDN</a>
   */
  @Nullable
  public PointerEventHandler onpointerenter;

  /**
   * The global event handler for the pointerleave event, which is delivered to a Node when the pointer (mouse cursor, fingertip, etc.) exits its hit test area (for example, if the cursor exits an Element or Window's content area). This event is part of the Pointer Events API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerleave">GlobalEventHandlers.onpointerleave - MDN</a>
   */
  @Nullable
  public PointerEventHandler onpointerleave;

  /**
   * The onpointermove property of the GlobalEventHandlers mixin is an EventHandler that processes pointermove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointermove">GlobalEventHandlers.onpointermove - MDN</a>
   */
  @Nullable
  public PointerEventHandler onpointermove;

  /**
   * The onpointerout property of the GlobalEventHandlers mixin is an EventHandler that processes pointerout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerout">GlobalEventHandlers.onpointerout - MDN</a>
   */
  @Nullable
  public PointerEventHandler onpointerout;

  /**
   * The onpointerover property of the GlobalEventHandlers mixin is an EventHandler that processes pointerover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerover">GlobalEventHandlers.onpointerover - MDN</a>
   */
  @Nullable
  public PointerEventHandler onpointerover;

  /**
   * The onpointerup property of the GlobalEventHandlers mixin is an EventHandler that processes pointerup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerup">GlobalEventHandlers.onpointerup - MDN</a>
   */
  @Nullable
  public PointerEventHandler onpointerup;

  /**
   * The onselectionchange property of the GlobalEventHandlers mixin is an EventHandler that processes selectionchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onselectionchange">Document.onselectionchange - MDN</a>
   */
  @Nullable
  public EventHandler onselectionchange;

  /**
   * The onselectstart property of the GlobalEventHandlers mixin is an EventHandler that processes selectstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectstart">GlobalEventHandlers.onselectstart - MDN</a>
   */
  @Nullable
  public EventHandler onselectstart;

  /**
   * The ontouchcancel property of the GlobalEventHandlers mixin is an EventHandler that processes touchcancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchcancel">GlobalEventHandlers.ontouchcancel - MDN</a>
   */
  @Nullable
  public TouchEventHandler ontouchcancel;

  /**
   * A global event handler for the touchend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchend">GlobalEventHandlers.ontouchend - MDN</a>
   */
  @Nullable
  public TouchEventHandler ontouchend;

  /**
   * A global event handler for the touchmove event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchmove">GlobalEventHandlers.ontouchmove - MDN</a>
   */
  @Nullable
  public TouchEventHandler ontouchmove;

  /**
   * The ontouchstart property of the GlobalEventHandlers mixin is an EventHandler that processes touchstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchstart">GlobalEventHandlers.ontouchstart - MDN</a>
   */
  @Nullable
  public TouchEventHandler ontouchstart;

  @Nullable
  public ClipboardEventHandler oncopy;

  @Nullable
  public ClipboardEventHandler oncut;

  @Nullable
  public ClipboardEventHandler onpaste;

  /**
   * The Document constructor creates a new Document object that is a web page loaded in the browser and serving as an entry point into the page's content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/Document">Document.Document - MDN</a>
   */
  public Document() {
  }

  @JsProperty(
      name = "URL"
  )
  @Nonnull
  public native String URL();

  /**
   * The Document.characterSet read-only property returns the character encoding of the document that it's currently rendered with.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/characterSet">Document.characterSet - MDN</a>
   */
  @JsProperty(
      name = "characterSet"
  )
  @Nonnull
  public native String characterSet();

  @JsProperty(
      name = "charset"
  )
  @Nonnull
  public native String charset();

  /**
   * The Document.compatMode property indicates whether the document is rendered in Quirks mode or Standards mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/compatMode">Document.compatMode - MDN</a>
   */
  @JsProperty(
      name = "compatMode"
  )
  @Nonnull
  public native String compatMode();

  /**
   * The Document.contentType read-only property returns the MIME type that the document is being rendered as. This may come from HTTP headers or other sources of MIME information, and might be affected by automatic type conversions performed by either the browser or extensions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/contentType">Document.contentType - MDN</a>
   */
  @JsProperty(
      name = "contentType"
  )
  @Nonnull
  public native String contentType();

  /**
   * Returns the Document Type Declaration (DTD) associated with current document. The returned object implements the DocumentType interface. Use DOMImplementation.createDocumentType() to create a DocumentType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/doctype">Document.doctype - MDN</a>
   */
  @JsProperty(
      name = "doctype"
  )
  @Nullable
  public native DocumentType doctype();

  /**
   * Document.documentElement returns the Element that is the root element of the document (for example, the html element for HTML documents).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/documentElement">Document.documentElement - MDN</a>
   */
  @JsProperty(
      name = "documentElement"
  )
  @Nullable
  public native Element documentElement();

  /**
   * The documentURI read-only property of the Document interface returns the document location as a string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/documentURI">Document.documentURI - MDN</a>
   */
  @JsProperty(
      name = "documentURI"
  )
  @Nonnull
  public native String documentURI();

  /**
   * The Document.implementation property returns a DOMImplementation object associated with the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/implementation">Document.implementation - MDN</a>
   */
  @JsProperty(
      name = "implementation"
  )
  @Nonnull
  public native DOMImplementation implementation();

  @JsProperty(
      name = "inputEncoding"
  )
  @Nonnull
  public native String inputEncoding();

  /**
   * The scrollingElement read-only property of the Document interface returns a reference to the Element that scrolls the document. In standards mode, this is the root element of the document, document.documentElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/scrollingElement">Document.scrollingElement - MDN</a>
   */
  @JsProperty(
      name = "scrollingElement"
  )
  @Nullable
  public native Element scrollingElement();

  /**
   * The Document.hidden read-only property returns a Boolean value indicating if the page is considered hidden or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/hidden">Document.hidden - MDN</a>
   */
  @JsProperty(
      name = "hidden"
  )
  public native boolean hidden();

  /**
   * The Document.visibilityState read-only property returns the visibility of the document, that is in which context this element is now visible. It is useful to know if the document is in the background or an invisible tab, or only loaded for pre-rendering.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/visibilityState">Document.visibilityState - MDN</a>
   */
  @JsProperty(
      name = "visibilityState"
  )
  @Nonnull
  public native String visibilityState();

  @JsProperty(
      name = "rootElement"
  )
  @Nullable
  public native SVGSVGElement rootElement();

  /**
   * The timeline readonly property of the Document interface represents the default timeline of the current document. This timeline is a special instance of DocumentTimeline that is automatically created on page load.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/timeline">Document.timeline - MDN</a>
   */
  @JsProperty(
      name = "timeline"
  )
  @Nonnull
  public native DocumentTimeline timeline();

  @JsProperty(
      name = "fullscreen"
  )
  public native boolean fullscreen();

  @JsProperty(
      name = "fullscreenEnabled"
  )
  public native boolean fullscreenEnabled();

  @JsProperty(
      name = "currentScript"
  )
  @Nullable
  public native HTMLOrSVGScriptElement currentScript();

  @JsProperty(
      name = "defaultView"
  )
  @Nullable
  public native Window defaultView();

  /**
   * The embeds read-only property of the Document interface returns a list of the embedded object elements within the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/embeds">Document.embeds - MDN</a>
   */
  @JsProperty(
      name = "embeds"
  )
  @Nonnull
  public native HTMLCollection embeds();

  /**
   * The forms read-only property of the Document interface returns an HTMLCollection listing all the form elements contained in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/forms">Document.forms - MDN</a>
   */
  @JsProperty(
      name = "forms"
  )
  @Nonnull
  public native HTMLCollection forms();

  /**
   * The head read-only property of the Document interface returns the head element of the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/head">Document.head - MDN</a>
   */
  @JsProperty(
      name = "head"
  )
  @Nullable
  public native HTMLHeadElement head();

  /**
   * The images read-only property of the Document interface returns a collection of the images in the current HTML document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/images">Document.images - MDN</a>
   */
  @JsProperty(
      name = "images"
  )
  @Nonnull
  public native HTMLCollection images();

  @JsProperty(
      name = "lastModified"
  )
  @Nonnull
  public native String lastModified();

  /**
   * The links read-only property of the Document interface returns a collection of all area elements and a elements in a document with a value for the href attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/links">Document.links - MDN</a>
   */
  @JsProperty(
      name = "links"
  )
  @Nonnull
  public native HTMLCollection links();

  @JsProperty(
      name = "location"
  )
  @Nullable
  public native Location location();

  /**
   * The plugins read-only property of the Document interface returns an HTMLCollection object containing one or more HTMLEmbedElements representing the embed elements in the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/plugins">Document.plugins - MDN</a>
   */
  @JsProperty(
      name = "plugins"
  )
  @Nonnull
  public native HTMLCollection plugins();

  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  public native String readyState();

  @JsProperty(
      name = "referrer"
  )
  @Nonnull
  public native String referrer();

  /**
   * The scripts property of the Document interface returns a list of the script elements in the document. The returned object is an HTMLCollection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/scripts">Document.scripts - MDN</a>
   */
  @JsProperty(
      name = "scripts"
  )
  @Nonnull
  public native HTMLCollection scripts();

  @JsProperty(
      name = "all"
  )
  @Nonnull
  public native HTMLAllCollection all();

  /**
   * The anchors read-only property of the Document interface returns a list of all of the anchors in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/anchors">Document.anchors - MDN</a>
   */
  @JsProperty(
      name = "anchors"
  )
  @Nonnull
  public native HTMLCollection anchors();

  @JsProperty(
      name = "applets"
  )
  @Nonnull
  public native HTMLCollection applets();

  /**
   * The ParentNode.childElementCount read-only property returns an unsigned long representing the number of child elements of the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/childElementCount">ParentNode.childElementCount - MDN</a>
   */
  @JsProperty(
      name = "childElementCount"
  )
  public native int childElementCount();

  /**
   * The ParentNode property children is a read-only property that returns a live HTMLCollection which contains all of the child elements of the node upon which it was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/children">ParentNode.children - MDN</a>
   */
  @JsProperty(
      name = "children"
  )
  @Nonnull
  public native HTMLCollection children();

  /**
   * The ParentNode.firstElementChild read-only property returns the object's first child Element, or null if there are no child elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/firstElementChild">ParentNode.firstElementChild - MDN</a>
   */
  @JsProperty(
      name = "firstElementChild"
  )
  @Nullable
  public native Element firstElementChild();

  /**
   * The ParentNode.lastElementChild read-only property returns the object's last child Element or null if there are no child elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/lastElementChild">ParentNode.lastElementChild - MDN</a>
   */
  @JsProperty(
      name = "lastElementChild"
  )
  @Nullable
  public native Element lastElementChild();

  /**
   * The styleSheets read-only property of the DocumentOrShadowRoot interface returns a StyleSheetList of CSSStyleSheet objects, for stylesheets explicitly linked into or embedded in a document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/styleSheets">DocumentOrShadowRoot.styleSheets - MDN</a>
   */
  @JsProperty(
      name = "styleSheets"
  )
  @Nonnull
  public native StyleSheetList styleSheets();

  /**
   * The pointerLockElement property of the Document and ShadowRoot interfaces provides the element set as the target for mouse events while the pointer is locked. It is null if lock is pending, pointer is unlocked, or the target is in another document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/pointerLockElement">DocumentOrShadowRoot.pointerLockElement - MDN</a>
   */
  @JsProperty(
      name = "pointerLockElement"
  )
  @Nullable
  public native Element pointerLockElement();

  /**
   * The DocumentOrShadowRoot.fullscreenElement read-only property returns the Element that is currently being presented in full-screen mode in this document, or null if full-screen mode is not currently in use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/fullscreenElement">DocumentOrShadowRoot.fullscreenElement - MDN</a>
   */
  @JsProperty(
      name = "fullscreenElement"
  )
  @Nullable
  public native Element fullscreenElement();

  /**
   * The activeElement read-only property of the Document and ShadowRoot interfaces returns the Element within the DOM or shadow DOM tree that currently has focus.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/activeElement">DocumentOrShadowRoot.activeElement - MDN</a>
   */
  @JsProperty(
      name = "activeElement"
  )
  @Nullable
  public native Element activeElement();

  /**
   * Document.adoptNode() transfers a node from another document into the method's document. The adopted node and its subtree is removed from its original document (if any), and its ownerDocument is changed to the current document. The node can then be inserted into the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/adoptNode">Document.adoptNode - MDN</a>
   */
  @Nonnull
  public native Node adoptNode(@Nonnull Node node);

  /**
   * The Document.createAttribute() method creates a new attribute node, and returns it. The object created a node implementing the Attr interface. The DOM does not enforce what sort of attributes can be added to a particular element in this manner.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createAttribute">Document.createAttribute - MDN</a>
   */
  @Nonnull
  public native Attr createAttribute(@Nonnull String localName);

  @Nonnull
  public native Attr createAttributeNS(@Nullable String namespace, @Nonnull String qualifiedName);

  /**
   * createCDATASection() creates a new CDATA section node, and returns it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createCDATASection">Document.createCDATASection - MDN</a>
   */
  @Nonnull
  public native CDATASection createCDATASection(@Nonnull String data);

  /**
   * createComment() creates a new comment node, and returns it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createComment">Document.createComment - MDN</a>
   */
  @Nonnull
  public native Comment createComment(@Nonnull String data);

  /**
   * Creates a new empty DocumentFragment into which DOM nodes can be added to build an offscreen DOM tree.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createDocumentFragment">Document.createDocumentFragment - MDN</a>
   */
  @Nonnull
  public native DocumentFragment createDocumentFragment();

  /**
   * In an HTML document, the document.createElement() method creates the HTML element specified by tagName, or an HTMLUnknownElement if tagName isn't recognized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement">Document.createElement - MDN</a>
   */
  @Nonnull
  public native Element createElement(@Nonnull String localName, @Nonnull String options);

  /**
   * In an HTML document, the document.createElement() method creates the HTML element specified by tagName, or an HTMLUnknownElement if tagName isn't recognized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement">Document.createElement - MDN</a>
   */
  @Nonnull
  public native Element createElement(@Nonnull String localName,
      @Nonnull ElementCreationOptions options);

  /**
   * In an HTML document, the document.createElement() method creates the HTML element specified by tagName, or an HTMLUnknownElement if tagName isn't recognized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement">Document.createElement - MDN</a>
   */
  @Nonnull
  public native Element createElement(@Nonnull String localName);

  /**
   * Creates an element with the specified namespace URI and qualified name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElementNS">Document.createElementNS - MDN</a>
   */
  @Nonnull
  public native Element createElementNS(@Nullable String namespace, @Nonnull String qualifiedName,
      @Nonnull String options);

  /**
   * Creates an element with the specified namespace URI and qualified name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElementNS">Document.createElementNS - MDN</a>
   */
  @Nonnull
  public native Element createElementNS(@Nullable String namespace, @Nonnull String qualifiedName,
      @Nonnull ElementCreationOptions options);

  /**
   * Creates an element with the specified namespace URI and qualified name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElementNS">Document.createElementNS - MDN</a>
   */
  @Nonnull
  public native Element createElementNS(@Nullable String namespace, @Nonnull String qualifiedName);

  /**
   * Creates an event of the type specified. The returned object should be first initialized and can then be passed to EventTarget.dispatchEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createEvent">Document.createEvent - MDN</a>
   */
  @Nonnull
  public native Event createEvent(@Nonnull String interface_);

  /**
   * Returns a new NodeIterator object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createNodeIterator">Document.createNodeIterator - MDN</a>
   */
  @Nonnull
  public native NodeIterator createNodeIterator(@Nonnull Node root, int whatToShow,
      @Nullable NodeFilter filter);

  /**
   * Returns a new NodeIterator object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createNodeIterator">Document.createNodeIterator - MDN</a>
   */
  @Nonnull
  public native NodeIterator createNodeIterator(@Nonnull Node root, int whatToShow);

  /**
   * Returns a new NodeIterator object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createNodeIterator">Document.createNodeIterator - MDN</a>
   */
  @Nonnull
  public native NodeIterator createNodeIterator(@Nonnull Node root);

  /**
   * createProcessingInstruction() generates a new processing instruction node and returns it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createProcessingInstruction">Document.createProcessingInstruction - MDN</a>
   */
  @Nonnull
  public native ProcessingInstruction createProcessingInstruction(@Nonnull String target,
      @Nonnull String data);

  /**
   * The Document.createRange() method returns a new Range object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createRange">Document.createRange - MDN</a>
   */
  @Nonnull
  public native Range createRange();

  /**
   * Creates a new Text node. This method can be used to escape HTML characters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createTextNode">Document.createTextNode - MDN</a>
   */
  @Nonnull
  public native Text createTextNode(@Nonnull String data);

  /**
   * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createTreeWalker">Document.createTreeWalker - MDN</a>
   */
  @Nonnull
  public native TreeWalker createTreeWalker(@Nonnull Node root, int whatToShow,
      @Nullable NodeFilter filter);

  /**
   * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createTreeWalker">Document.createTreeWalker - MDN</a>
   */
  @Nonnull
  public native TreeWalker createTreeWalker(@Nonnull Node root, int whatToShow);

  /**
   * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createTreeWalker">Document.createTreeWalker - MDN</a>
   */
  @Nonnull
  public native TreeWalker createTreeWalker(@Nonnull Node root);

  /**
   * returns an array-like object of all child elements which have all of the given class name(s).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementsByClassName">Document.getElementsByClassName - MDN</a>
   */
  @Nonnull
  public native HTMLCollection getElementsByClassName(@Nonnull String classNames);

  /**
   * returns an HTMLCollection of elements with the given tag name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementsByTagName">Document.getElementsByTagName - MDN</a>
   */
  @Nonnull
  public native HTMLCollection getElementsByTagName(@Nonnull String qualifiedName);

  /**
   * Returns a list of elements with the given tag name belonging to the given namespace. The complete document is searched, including the root node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementsByTagNameNS">Document.getElementsByTagNameNS - MDN</a>
   */
  @Nonnull
  public native HTMLCollection getElementsByTagNameNS(@Nullable String namespace,
      @Nonnull String localName);

  /**
   * The Document object's importNode() method creates a copy of a Node or DocumentFragment from another document, to be inserted into the current document later.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/importNode">Document.importNode - MDN</a>
   */
  @Nonnull
  public native Node importNode(@Nonnull Node node, boolean deep);

  /**
   * The Document object's importNode() method creates a copy of a Node or DocumentFragment from another document, to be inserted into the current document later.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/importNode">Document.importNode - MDN</a>
   */
  @Nonnull
  public native Node importNode(@Nonnull Node node);

  @Nullable
  public native CaretPosition caretPositionFromPoint(double x, double y);

  @Nullable
  public native Element elementFromPoint(double x, double y);

  @Nonnull
  public native JsArray<Element> elementsFromPoint(double x, double y);

  /**
   * The exitPointerLock() method asynchronously releases a pointer lock previously requested through Element.requestPointerLock.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/exitPointerLock">Document.exitPointerLock - MDN</a>
   */
  public native void exitPointerLock();

  @Nullable
  public native Selection getSelection();

  /**
   * The getAnimations() method of the Document interface returns an array of all Animation objects currently in effect whose target elements are descendants of the document. This array includes CSS Animations, CSS Transitions, and Web Animations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getAnimations">Document.getAnimations - MDN</a>
   */
  @Nonnull
  public native JsArray<Animation> getAnimations();

  @Nonnull
  public native Promise<Void> exitFullscreen();

  public native void close();

  public native boolean execCommand(@Nonnull String commandId, boolean showUI,
      @Nonnull String value);

  public native boolean execCommand(@Nonnull String commandId, boolean showUI);

  public native boolean execCommand(@Nonnull String commandId);

  @Nonnull
  public native NodeList getElementsByName(@Nonnull String elementName);

  public native boolean hasFocus();

  @Nonnull
  public native Document open(@Nonnull String unused1, @Nonnull String unused2);

  @Nonnull
  public native Document open(@Nonnull String unused1);

  @Nonnull
  public native Document open();

  @Nullable
  public native Window open(@Nonnull String url, @Nonnull String name, @Nonnull String features);

  public native boolean queryCommandEnabled(@Nonnull String commandId);

  public native boolean queryCommandIndeterm(@Nonnull String commandId);

  public native boolean queryCommandState(@Nonnull String commandId);

  public native boolean queryCommandSupported(@Nonnull String commandId);

  @Nonnull
  public native String queryCommandValue(@Nonnull String commandId);

  public native void write(@Nonnull String... text);

  public native void writeln(@Nonnull String... text);

  public native void captureEvents();

  public native void clear();

  public native void releaseEvents();

  /**
   * The ParentNode.append() method inserts a set of Node objects or DOMString objects after the last child of the ParentNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/append">ParentNode.append - MDN</a>
   */
  public native void append(@Nonnull Node... nodes);

  /**
   * The ParentNode.append() method inserts a set of Node objects or DOMString objects after the last child of the ParentNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/append">ParentNode.append - MDN</a>
   */
  public native void append(@Nonnull String... nodes);

  /**
   * The ParentNode.prepend() method inserts a set of Node objects or DOMString objects before the first child of the ParentNode. DOMString objects are inserted as equivalent Text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/prepend">ParentNode.prepend - MDN</a>
   */
  public native void prepend(@Nonnull Node... nodes);

  /**
   * The ParentNode.prepend() method inserts a set of Node objects or DOMString objects before the first child of the ParentNode. DOMString objects are inserted as equivalent Text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/prepend">ParentNode.prepend - MDN</a>
   */
  public native void prepend(@Nonnull String... nodes);

  /**
   * The ParentNode mixin defines the querySelector() method as returning an Element representing the first element matching the specified group of selectors which are descendants of the object on which the method was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/querySelector">ParentNode.querySelector - MDN</a>
   */
  @Nullable
  public native Element querySelector(@Nonnull String selectors);

  /**
   * The ParentNode mixin defines the querySelectorAll() method as returning a NodeList representing a list of elements matching the specified group of selectors which are descendants of the object on which the method was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/querySelectorAll">ParentNode.querySelectorAll - MDN</a>
   */
  @Nonnull
  public native NodeList querySelectorAll(@Nonnull String selectors);

  /**
   * The ParentNode.replaceChildren() method replaces the existing children of a Node with a specified new set of children. These can be DOMString or Node objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/replaceChildren">ParentNode.replaceChildren - MDN</a>
   */
  public native void replaceChildren(@Nonnull Node... nodes);

  /**
   * The ParentNode.replaceChildren() method replaces the existing children of a Node with a specified new set of children. These can be DOMString or Node objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/replaceChildren">ParentNode.replaceChildren - MDN</a>
   */
  public native void replaceChildren(@Nonnull String... nodes);

  @Nonnull
  public native XPathExpression createExpression(@Nonnull String expression,
      @Nullable XPathNSResolver resolver);

  @Nonnull
  public native XPathExpression createExpression(@Nonnull String expression);

  @Nonnull
  public native XPathNSResolver createNSResolver(@Nonnull Node nodeResolver);

  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode,
      @Nullable XPathNSResolver resolver, int type, @Nullable XPathResult result);

  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode,
      @Nullable XPathNSResolver resolver, int type);

  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode,
      @Nullable XPathNSResolver resolver);

  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode);

  @Nullable
  public native Element getElementById(@Nonnull String elementId);

  @JsOverlay
  public final void addDOMContentLoadedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "DOMContentLoaded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDOMContentLoadedListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "DOMContentLoaded", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "DOMContentLoaded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDOMContentLoadedListener(@Nonnull final EventListener callback) {
    removeEventListener( "DOMContentLoaded", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addFullscreenchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "fullscreenchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFullscreenchangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "fullscreenchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFullscreenchangeListener(@Nonnull final EventListener callback) {
    addEventListener( "fullscreenchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeFullscreenchangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "fullscreenchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeFullscreenchangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "fullscreenchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeFullscreenchangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "fullscreenchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointerlockchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerlockchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerlockchangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "pointerlockchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerlockchangeListener(@Nonnull final EventListener callback) {
    addEventListener( "pointerlockchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointerlockchangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerlockchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerlockchangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "pointerlockchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerlockchangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "pointerlockchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointerlockerrorListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerlockerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerlockerrorListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "pointerlockerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerlockerrorListener(@Nonnull final EventListener callback) {
    addEventListener( "pointerlockerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointerlockerrorListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerlockerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerlockerrorListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "pointerlockerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerlockerrorListener(@Nonnull final EventListener callback) {
    removeEventListener( "pointerlockerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addReadystatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "readystatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addReadystatechangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "readystatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addReadystatechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "readystatechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeReadystatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "readystatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeReadystatechangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "readystatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeReadystatechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "readystatechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addScrollListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "scroll", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addScrollListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "scroll", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addScrollListener(@Nonnull final EventListener callback) {
    addEventListener( "scroll", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeScrollListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "scroll", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeScrollListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "scroll", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeScrollListener(@Nonnull final EventListener callback) {
    removeEventListener( "scroll", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSelectionchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "selectionchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSelectionchangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "selectionchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSelectionchangeListener(@Nonnull final EventListener callback) {
    addEventListener( "selectionchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSelectionchangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "selectionchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSelectionchangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "selectionchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSelectionchangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "selectionchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSelectstartListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "selectstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSelectstartListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "selectstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSelectstartListener(@Nonnull final EventListener callback) {
    addEventListener( "selectstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSelectstartListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "selectstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSelectstartListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "selectstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSelectstartListener(@Nonnull final EventListener callback) {
    removeEventListener( "selectstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addVisibilitychangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "visibilitychange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addVisibilitychangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "visibilitychange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addVisibilitychangeListener(@Nonnull final EventListener callback) {
    addEventListener( "visibilitychange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeVisibilitychangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "visibilitychange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeVisibilitychangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "visibilitychange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeVisibilitychangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "visibilitychange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      final boolean options) {
    addEventListener( "animationcancel", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "animationcancel", Js.cast( callback ), options );
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
      final boolean options) {
    addEventListener( "animationend", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "animationend", Js.cast( callback ), options );
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
      final boolean options) {
    addEventListener( "animationiteration", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "animationiteration", Js.cast( callback ), options );
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
      final boolean options) {
    addEventListener( "animationstart", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "animationstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationstartListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCopyListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "copy", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCopyListener(@Nonnull final ClipboardEventListener callback,
      final boolean options) {
    addEventListener( "copy", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "copy", Js.cast( callback ), options );
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
      final boolean options) {
    addEventListener( "cut", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "cut", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCutListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "cut", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDragListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "drag", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    addEventListener( "drag", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragListener(@Nonnull final DragEventListener callback) {
    addEventListener( "drag", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "drag", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    removeEventListener( "drag", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "drag", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDragendListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragendListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    addEventListener( "dragend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragendListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragendListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragendListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    removeEventListener( "dragend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragendListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDragenterListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragenterListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    addEventListener( "dragenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragenterListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragenter", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragenterListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragenterListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    removeEventListener( "dragenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragenterListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragenter", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDragexitListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragexit", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragexitListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    addEventListener( "dragexit", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragexitListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragexit", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragexitListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragexit", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragexitListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    removeEventListener( "dragexit", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragexitListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragexit", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDragleaveListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragleaveListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    addEventListener( "dragleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragleaveListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragleave", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragleaveListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragleaveListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    removeEventListener( "dragleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragleaveListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragleave", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDragoverListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragoverListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    addEventListener( "dragover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragoverListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragover", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragoverListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragoverListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    removeEventListener( "dragover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragoverListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragover", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDragstartListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dragstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragstartListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    addEventListener( "dragstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragstartListener(@Nonnull final DragEventListener callback) {
    addEventListener( "dragstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDragstartListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dragstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragstartListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    removeEventListener( "dragstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDragstartListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "dragstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDropListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "drop", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDropListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    addEventListener( "drop", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDropListener(@Nonnull final DragEventListener callback) {
    addEventListener( "drop", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDropListener(@Nonnull final DragEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "drop", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDropListener(@Nonnull final DragEventListener callback,
      final boolean options) {
    removeEventListener( "drop", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDropListener(@Nonnull final DragEventListener callback) {
    removeEventListener( "drop", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addGotpointercaptureListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "gotpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addGotpointercaptureListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    addEventListener( "gotpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addGotpointercaptureListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "gotpointercapture", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeGotpointercaptureListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "gotpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeGotpointercaptureListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    removeEventListener( "gotpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeGotpointercaptureListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "gotpointercapture", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addKeydownListener(@Nonnull final KeyboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "keydown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addKeydownListener(@Nonnull final KeyboardEventListener callback,
      final boolean options) {
    addEventListener( "keydown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addKeydownListener(@Nonnull final KeyboardEventListener callback) {
    addEventListener( "keydown", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeKeydownListener(@Nonnull final KeyboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "keydown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeKeydownListener(@Nonnull final KeyboardEventListener callback,
      final boolean options) {
    removeEventListener( "keydown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeKeydownListener(@Nonnull final KeyboardEventListener callback) {
    removeEventListener( "keydown", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addKeypressListener(@Nonnull final KeyboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "keypress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addKeypressListener(@Nonnull final KeyboardEventListener callback,
      final boolean options) {
    addEventListener( "keypress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addKeypressListener(@Nonnull final KeyboardEventListener callback) {
    addEventListener( "keypress", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeKeypressListener(@Nonnull final KeyboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "keypress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeKeypressListener(@Nonnull final KeyboardEventListener callback,
      final boolean options) {
    removeEventListener( "keypress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeKeypressListener(@Nonnull final KeyboardEventListener callback) {
    removeEventListener( "keypress", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addKeyupListener(@Nonnull final KeyboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "keyup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addKeyupListener(@Nonnull final KeyboardEventListener callback,
      final boolean options) {
    addEventListener( "keyup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addKeyupListener(@Nonnull final KeyboardEventListener callback) {
    addEventListener( "keyup", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeKeyupListener(@Nonnull final KeyboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "keyup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeKeyupListener(@Nonnull final KeyboardEventListener callback,
      final boolean options) {
    removeEventListener( "keyup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeKeyupListener(@Nonnull final KeyboardEventListener callback) {
    removeEventListener( "keyup", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLostpointercaptureListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "lostpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLostpointercaptureListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    addEventListener( "lostpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLostpointercaptureListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "lostpointercapture", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLostpointercaptureListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "lostpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLostpointercaptureListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    removeEventListener( "lostpointercapture", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLostpointercaptureListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "lostpointercapture", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPasteListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "paste", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPasteListener(@Nonnull final ClipboardEventListener callback,
      final boolean options) {
    addEventListener( "paste", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "paste", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePasteListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "paste", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointercancelListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointercancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointercancelListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    addEventListener( "pointercancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointercancelListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointercancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointercancelListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointercancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointercancelListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    removeEventListener( "pointercancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointercancelListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointercancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointerdownListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerdown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerdownListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    addEventListener( "pointerdown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerdownListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerdown", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointerdownListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerdown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerdownListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    removeEventListener( "pointerdown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerdownListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerdown", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointerenterListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerenterListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    addEventListener( "pointerenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerenterListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerenter", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointerenterListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerenterListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    removeEventListener( "pointerenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerenterListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerenter", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointerleaveListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerleaveListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    addEventListener( "pointerleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerleaveListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerleave", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointerleaveListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerleaveListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    removeEventListener( "pointerleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerleaveListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerleave", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointermoveListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointermove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointermoveListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    addEventListener( "pointermove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointermoveListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointermove", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointermoveListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointermove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointermoveListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    removeEventListener( "pointermove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointermoveListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointermove", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointeroutListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointeroutListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    addEventListener( "pointerout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointeroutListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerout", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointeroutListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointeroutListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    removeEventListener( "pointerout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointeroutListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerout", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointeroverListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointeroverListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    addEventListener( "pointerover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointeroverListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerover", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointeroverListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointeroverListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    removeEventListener( "pointerover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointeroverListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerover", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPointerupListener(@Nonnull final PointerEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pointerup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerupListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    addEventListener( "pointerup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPointerupListener(@Nonnull final PointerEventListener callback) {
    addEventListener( "pointerup", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePointerupListener(@Nonnull final PointerEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pointerup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerupListener(@Nonnull final PointerEventListener callback,
      final boolean options) {
    removeEventListener( "pointerup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePointerupListener(@Nonnull final PointerEventListener callback) {
    removeEventListener( "pointerup", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTouchcancelListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchcancelListener(@Nonnull final TouchEventListener callback,
      final boolean options) {
    addEventListener( "touchcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchcancelListener(@Nonnull final TouchEventListener callback) {
    addEventListener( "touchcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTouchcancelListener(@Nonnull final TouchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "touchcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTouchcancelListener(@Nonnull final TouchEventListener callback,
      final boolean options) {
    removeEventListener( "touchcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTouchcancelListener(@Nonnull final TouchEventListener callback) {
    removeEventListener( "touchcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTouchendListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchendListener(@Nonnull final TouchEventListener callback,
      final boolean options) {
    addEventListener( "touchend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchendListener(@Nonnull final TouchEventListener callback) {
    addEventListener( "touchend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTouchendListener(@Nonnull final TouchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "touchend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTouchendListener(@Nonnull final TouchEventListener callback,
      final boolean options) {
    removeEventListener( "touchend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTouchendListener(@Nonnull final TouchEventListener callback) {
    removeEventListener( "touchend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTouchmoveListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchmove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchmoveListener(@Nonnull final TouchEventListener callback,
      final boolean options) {
    addEventListener( "touchmove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchmoveListener(@Nonnull final TouchEventListener callback) {
    addEventListener( "touchmove", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTouchmoveListener(@Nonnull final TouchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "touchmove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTouchmoveListener(@Nonnull final TouchEventListener callback,
      final boolean options) {
    removeEventListener( "touchmove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTouchmoveListener(@Nonnull final TouchEventListener callback) {
    removeEventListener( "touchmove", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTouchstartListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchstartListener(@Nonnull final TouchEventListener callback,
      final boolean options) {
    addEventListener( "touchstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchstartListener(@Nonnull final TouchEventListener callback) {
    addEventListener( "touchstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTouchstartListener(@Nonnull final TouchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "touchstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTouchstartListener(@Nonnull final TouchEventListener callback,
      final boolean options) {
    removeEventListener( "touchstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTouchstartListener(@Nonnull final TouchEventListener callback) {
    removeEventListener( "touchstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitioncancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      final boolean options) {
    addEventListener( "transitioncancel", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "transitioncancel", Js.cast( callback ), options );
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
      final boolean options) {
    addEventListener( "transitionend", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "transitionend", Js.cast( callback ), options );
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
      final boolean options) {
    addEventListener( "transitionrun", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "transitionrun", Js.cast( callback ), options );
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
      final boolean options) {
    addEventListener( "transitionstart", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "transitionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionstartListener(@Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addWheelListener(@Nonnull final WheelEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "wheel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addWheelListener(@Nonnull final WheelEventListener callback,
      final boolean options) {
    addEventListener( "wheel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addWheelListener(@Nonnull final WheelEventListener callback) {
    addEventListener( "wheel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeWheelListener(@Nonnull final WheelEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "wheel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeWheelListener(@Nonnull final WheelEventListener callback,
      final boolean options) {
    removeEventListener( "wheel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeWheelListener(@Nonnull final WheelEventListener callback) {
    removeEventListener( "wheel", Js.cast( callback ) );
  }
}
