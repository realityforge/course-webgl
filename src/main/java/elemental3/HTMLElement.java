package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The HTMLElement interface represents any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement">HTMLElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLElement"
)
public class HTMLElement extends Element {
  @Nonnull
  public String accessKey;

  public boolean draggable;

  /**
   * The HTMLElement property hidden is a Boolean which is true if the element is hidden; otherwise the value is false. This is quite different from using the CSS property display to control the visibility of an element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/hidden">HTMLElement.hidden - MDN</a>
   */
  public boolean hidden;

  /**
   * The innerText property of the HTMLElement interface represents the &quot;rendered&quot; text content of a node and its descendants.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/innerText">HTMLElement.innerText - MDN</a>
   */
  @Nonnull
  public String innerText;

  /**
   * The HTMLElement.lang property gets or sets the base language of an element's attribute values and text content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/lang">HTMLElement.lang - MDN</a>
   */
  @Nonnull
  public String lang;

  public boolean spellcheck;

  /**
   * The HTMLElement.title property represents the title of the element: the text usually displayed in a 'tooltip' popup when the mouse is over the node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/title">HTMLElement.title - MDN</a>
   */
  @Nonnull
  public String title;

  public boolean translate;

  @Nonnull
  @MagicConstant(
      valuesFromClass = AutocapitalizeType.class
  )
  public String autocapitalize;

  /**
   * The HTMLElement.dir property gets or sets the text writing directionality of the content of the current element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/dir">HTMLElement.dir - MDN</a>
   */
  @Nonnull
  @MagicConstant(
      valuesFromClass = DirType.class
  )
  public String dir;

  /**
   * The contentEditable property of the HTMLElement interface specifies whether or not the element is editable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/contentEditable">HTMLElement.contentEditable - MDN</a>
   */
  @Nonnull
  public String contentEditable;

  @Nonnull
  public String enterKeyHint;

  @Nonnull
  @MagicConstant(
      valuesFromClass = InputModeType.class
  )
  public String inputMode;

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
  public MouseEventHandler onauxclick;

  /**
   * The onblur property of the GlobalEventHandlers mixin is the EventHandler for processing blur events. It's available on Element, Document, and Window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onblur">GlobalEventHandlers.onblur - MDN</a>
   */
  @Nullable
  public FocusEventHandler onblur;

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
  public MouseEventHandler onclick;

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
  public MouseEventHandler oncontextmenu;

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
  public MouseEventHandler ondblclick;

  /**
   * A global event handler for the drag event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrag">GlobalEventHandlers.ondrag - MDN</a>
   */
  @Nullable
  public EventHandler ondrag;

  /**
   * A global event handler for the dragend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragend">GlobalEventHandlers.ondragend - MDN</a>
   */
  @Nullable
  public EventHandler ondragend;

  /**
   * A global event handler for the dragenter event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragenter">GlobalEventHandlers.ondragenter - MDN</a>
   */
  @Nullable
  public EventHandler ondragenter;

  /**
   * The GlobalEventHandler.ondragexit property is an event handler for the dragexit event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragexit">GlobalEventHandlers.ondragexit - MDN</a>
   */
  @Nullable
  public EventHandler ondragexit;

  /**
   * A global event handler for the dragleave event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragleave">GlobalEventHandlers.ondragleave - MDN</a>
   */
  @Nullable
  public EventHandler ondragleave;

  /**
   * A global event handler for the dragover event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragover">GlobalEventHandlers.ondragover - MDN</a>
   */
  @Nullable
  public EventHandler ondragover;

  /**
   * A global event handler for the dragstart event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragstart">GlobalEventHandlers.ondragstart - MDN</a>
   */
  @Nullable
  public EventHandler ondragstart;

  /**
   * A global event handler for the drop event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrop">GlobalEventHandlers.ondrop - MDN</a>
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
   */
  @Nullable
  public OnErrorEventHandler onerror;

  /**
   * The onfocus property of the GlobalEventHandlers mixin is an EventHandler that processes focus events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onfocus">GlobalEventHandlers.onfocus - MDN</a>
   */
  @Nullable
  public FocusEventHandler onfocus;

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
  public InputEventHandler oninput;

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
  public EventHandler onkeydown;

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
  public EventHandler onkeyup;

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
  public MouseEventHandler onmousedown;

  /**
   * The onmouseenter property of the GlobalEventHandlers mixin is the EventHandler for processing mouseenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseenter">GlobalEventHandlers.onmouseenter - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmouseenter;

  /**
   * The onmouseleave property of the GlobalEventHandlers mixin is the EventHandler for processing mouseleave events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseleave">GlobalEventHandlers.onmouseleave - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmouseleave;

  /**
   * The onmousemove property of the GlobalEventHandlers mixin is an EventHandler that processes mousemove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmousemove">GlobalEventHandlers.onmousemove - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmousemove;

  /**
   * The onmouseout property of the GlobalEventHandlers mixin is an EventHandler that processes mouseout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseout">GlobalEventHandlers.onmouseout - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmouseout;

  /**
   * The onmouseover property of the GlobalEventHandlers mixin is an EventHandler that processes mouseover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseover">GlobalEventHandlers.onmouseover - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmouseover;

  /**
   * The onmouseup property of the GlobalEventHandlers mixin is an EventHandler that processes mouseup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseup">GlobalEventHandlers.onmouseup - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmouseup;

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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectionchange">GlobalEventHandlers.onselectionchange - MDN</a>
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

  public boolean autofocus;

  @Nonnull
  public String nonce;

  public int tabIndex;

  @Nullable
  public ClipboardEventHandler oncopy;

  @Nullable
  public ClipboardEventHandler oncut;

  @Nullable
  public ClipboardEventHandler onpaste;

  public HTMLElement() {
  }

  /**
   * The HTMLElement.accessKeyLabel read-only property returns a String that represents the element's assigned access key (if any); otherwise it returns an empty string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/accessKeyLabel">HTMLElement.accessKeyLabel - MDN</a>
   */
  @JsProperty(
      name = "accessKeyLabel"
  )
  @Nonnull
  public native String accessKeyLabel();

  /**
   * The HTMLElement.offsetHeight read-only property returns the height of an element, including vertical padding and borders, as an integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetHeight">HTMLElement.offsetHeight - MDN</a>
   */
  @JsProperty(
      name = "offsetHeight"
  )
  public native int offsetHeight();

  /**
   * The HTMLElement.offsetLeft read-only property returns the number of pixels that the upper left corner of the current element is offset to the left within the HTMLElement.offsetParent node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetLeft">HTMLElement.offsetLeft - MDN</a>
   */
  @JsProperty(
      name = "offsetLeft"
  )
  public native int offsetLeft();

  /**
   * The HTMLElement.offsetParent read-only property returns a reference to the element which is the closest (nearest in the containment hierarchy) positioned ancestor element. If there is no positioned ancestor element, the nearest ancestor td, th, table will be returned, or the body if there are no ancestor table elements either.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetParent">HTMLElement.offsetParent - MDN</a>
   */
  @JsProperty(
      name = "offsetParent"
  )
  @Nullable
  public native Element offsetParent();

  /**
   * The HTMLElement.offsetTop read-only property returns the distance of the current element relative to the top of the offsetParent node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetTop">HTMLElement.offsetTop - MDN</a>
   */
  @JsProperty(
      name = "offsetTop"
  )
  public native int offsetTop();

  /**
   * The HTMLElement.offsetWidth read-only property returns the layout width of an element as an integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetWidth">HTMLElement.offsetWidth - MDN</a>
   */
  @JsProperty(
      name = "offsetWidth"
  )
  public native int offsetWidth();

  /**
   * The HTMLElement.isContentEditable read-only property returns a Boolean that is true if the contents of the element are editable; otherwise it returns false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/isContentEditable">HTMLElement.isContentEditable - MDN</a>
   */
  @JsProperty(
      name = "isContentEditable"
  )
  public native boolean isContentEditable();

  /**
   * The style property is used to get as well as set the inline style of an element. When getting, it returns a CSSStyleDeclaration object that contains a list of all styles properties for that element with values assigned for the attributes that are defined in the element's inline style attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/style">HTMLElement.style - MDN</a>
   */
  @JsProperty(
      name = "style"
  )
  @Nonnull
  public native CSSStyleDeclaration style();

  @JsProperty(
      name = "dataset"
  )
  @Nonnull
  public native DOMStringMap dataset();

  @Nonnull
  public native ElementInternals attachInternals();

  /**
   * The HTMLElement.click() method simulates a mouse click on an element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/click">HTMLElement.click - MDN</a>
   */
  public native void click();

  public native void blur();

  public native void focus(@Nonnull FocusOptions options);

  public native void focus();

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
  public final void addBeforeinputListener(@Nonnull final InputEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "beforeinput", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBeforeinputListener(@Nonnull final InputEventListener callback,
      final boolean options) {
    addEventListener( "beforeinput", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBeforeinputListener(@Nonnull final InputEventListener callback) {
    addEventListener( "beforeinput", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeBeforeinputListener(@Nonnull final InputEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "beforeinput", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBeforeinputListener(@Nonnull final InputEventListener callback,
      final boolean options) {
    removeEventListener( "beforeinput", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBeforeinputListener(@Nonnull final InputEventListener callback) {
    removeEventListener( "beforeinput", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addChangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "change", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addChangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "change", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addChangeListener(@Nonnull final EventListener callback) {
    addEventListener( "change", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeChangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "change", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeChangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "change", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeChangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "change", Js.cast( callback ) );
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
  public final void addInputListener(@Nonnull final InputEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "input", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addInputListener(@Nonnull final InputEventListener callback,
      final boolean options) {
    addEventListener( "input", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addInputListener(@Nonnull final InputEventListener callback) {
    addEventListener( "input", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeInputListener(@Nonnull final InputEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "input", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeInputListener(@Nonnull final InputEventListener callback,
      final boolean options) {
    removeEventListener( "input", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeInputListener(@Nonnull final InputEventListener callback) {
    removeEventListener( "input", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addInvalidListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "invalid", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addInvalidListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "invalid", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addInvalidListener(@Nonnull final EventListener callback) {
    addEventListener( "invalid", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeInvalidListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "invalid", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeInvalidListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "invalid", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeInvalidListener(@Nonnull final EventListener callback) {
    removeEventListener( "invalid", Js.cast( callback ) );
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
}
