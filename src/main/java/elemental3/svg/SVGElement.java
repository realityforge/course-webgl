package elemental3.svg;

import elemental3.CSSStyleDeclaration;
import elemental3.ClipboardEventHandler;
import elemental3.DOMStringMap;
import elemental3.Element;
import elemental3.EventHandler;
import elemental3.FocusEventHandler;
import elemental3.FocusOptions;
import elemental3.MouseEventHandler;
import elemental3.OnErrorEventHandler;
import elemental3.TouchEventHandler;
import elemental3.WheelEventHandler;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * All of the SVG DOM interfaces that correspond directly to elements in the SVG language derive from the SVGElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement">SVGElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGElement"
)
public class SVGElement extends Element {
  public boolean autofocus;

  @Nonnull
  public String nonce;

  /**
   * The onabort property of the GlobalEventHandlers mixin is the EventHandler for processing abort events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onabort">SVGElement.onabort - MDN</a>
   */
  @Nullable
  public EventHandler onabort;

  /**
   * The onanimationcancel property of the GlobalEventHandlers mixin is the EventHandler for processing animationcancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationcancel">GlobalEventHandlers.onanimationcancel - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-animations/#eventdef-animationevent-animationcancel">The definition of 'onanimationcancel' in CSS Animations.</a>
   */
  @Nullable
  public EventHandler onanimationcancel;

  /**
   * The onanimationend property of the GlobalEventHandlers mixin is the EventHandler for processing animationend events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationend">GlobalEventHandlers.onanimationend - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-animations/#eventdef-animationevent-animationend">The definition of 'onanimationend' in CSS Animations.</a>
   */
  @Nullable
  public EventHandler onanimationend;

  /**
   * The onanimationiteration property of the GlobalEventHandlers mixin is the EventHandler for processing animationiteration events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationiteration">GlobalEventHandlers.onanimationiteration - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-animations/#eventdef-animationevent-animationiteration">The definition of 'onanimationiteration' in CSS Animations.</a>
   */
  @Nullable
  public EventHandler onanimationiteration;

  /**
   * An event handler for the animationstart event. This event is sent when a CSS Animation starts to play.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationstart">GlobalEventHandlers.onanimationstart - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-animations/#eventdef-animationevent-animationstart">The definition of 'onanimationstart' in CSS Animations.</a>
   */
  @Nullable
  public EventHandler onanimationstart;

  /**
   * The onauxclick property of the GlobalEventHandlers mixin is an EventHandler for processing auxclick events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onauxclick">GlobalEventHandlers.onauxclick - MDN</a>
   * @see <a href="https://w3c.github.io/uievents/#event-type-auxclick">The definition of 'onauxclick' in UI Events.</a>
   */
  @Nullable
  public MouseEventHandler onauxclick;

  /**
   * The onblur property of the GlobalEventHandlers mixin is the EventHandler for processing blur events. It's available on Element, Document, and Window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onblur">SVGElement.onblur - MDN</a>
   */
  @Nullable
  public FocusEventHandler onblur;

  /**
   * The oncancel property of the GlobalEventHandlers mixin is an EventHandler for processing cancel events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncancel">GlobalEventHandlers.oncancel - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-oncancel">The definition of 'oncancel' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler oncancel;

  /**
   * The oncanplay property of the GlobalEventHandlers mixin is the EventHandler for processing canplay events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncanplay">GlobalEventHandlers.oncanplay - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-oncanplay">The definition of 'oncanplay' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler oncanplay;

  /**
   * The oncanplaythrough property of the GlobalEventHandlers mixin is the EventHandler for processing canplaythrough events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncanplaythrough">GlobalEventHandlers.oncanplaythrough - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-oncanplaythrough">The definition of 'oncanplaythrough' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler oncanplaythrough;

  /**
   * The onchange property of the GlobalEventHandlers mixin is an EventHandler for processing change events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onchange">SVGElement.onchange - MDN</a>
   */
  @Nullable
  public EventHandler onchange;

  /**
   * The onclick property of the GlobalEventHandlers mixin is the EventHandler for processing click events on a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onclick">SVGElement.onclick - MDN</a>
   */
  @Nullable
  public MouseEventHandler onclick;

  /**
   * The onclose property of the GlobalEventHandlers mixin is an EventHandler for processing close events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclose">GlobalEventHandlers.onclose - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onclose">The definition of 'onclose' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler onclose;

  /**
   * The oncontextmenu property of the GlobalEventHandlers mixin is an EventHandler that processes contextmenu events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/oncontextmenu">SVGElement.oncontextmenu - MDN</a>
   */
  @Nullable
  public MouseEventHandler oncontextmenu;

  @Nullable
  public ClipboardEventHandler oncopy;

  /**
   * The oncuechange property of the GlobalEventHandlers mixin is the EventHandler for processing cuechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncuechange">GlobalEventHandlers.oncuechange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-oncuechange">The definition of 'oncuechange' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler oncuechange;

  @Nullable
  public ClipboardEventHandler oncut;

  /**
   * The ondblclick property of the GlobalEventHandlers mixin is an EventHandler that processes dblclick events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/ondblclick">SVGElement.ondblclick - MDN</a>
   */
  @Nullable
  public MouseEventHandler ondblclick;

  /**
   * A global event handler for the drag event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrag">GlobalEventHandlers.ondrag - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondrag">The definition of 'ondrag' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondrag">The definition of 'ondrag' in HTML 5.1.</a>
   */
  @Nullable
  public EventHandler ondrag;

  /**
   * A global event handler for the dragend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragend">GlobalEventHandlers.ondragend - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragend">The definition of 'ondragend' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragend">The definition of 'ondragend' in HTML 5.1.</a>
   */
  @Nullable
  public EventHandler ondragend;

  /**
   * A global event handler for the dragenter event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragenter">GlobalEventHandlers.ondragenter - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragenter">The definition of 'ondragenter' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragenter">The definition of 'ondragenter' in HTML 5.1.</a>
   */
  @Nullable
  public EventHandler ondragenter;

  /**
   * A global event handler for the dragleave event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragleave">GlobalEventHandlers.ondragleave - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragleave">The definition of 'ondragleave' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragleave">The definition of 'ondragleave' in HTML 5.1.</a>
   */
  @Nullable
  public EventHandler ondragleave;

  /**
   * A global event handler for the dragover event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragover">GlobalEventHandlers.ondragover - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragover">The definition of 'ondragover' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragover">The definition of 'ondragover' in HTML 5.1.</a>
   */
  @Nullable
  public EventHandler ondragover;

  /**
   * A global event handler for the dragstart event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragstart">GlobalEventHandlers.ondragstart - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragstart">The definition of 'ondragstart' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragstart">The definition of 'ondragstart' in HTML 5.1.</a>
   */
  @Nullable
  public EventHandler ondragstart;

  /**
   * A global event handler for the drop event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrop">GlobalEventHandlers.ondrop - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondrop">The definition of 'ondrop' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondrop">The definition of 'ondrop' in HTML 5.1.</a>
   */
  @Nullable
  public EventHandler ondrop;

  /**
   * The ondurationchange property of the GlobalEventHandlers mixin is the EventHandler for processing durationchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondurationchange">GlobalEventHandlers.ondurationchange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-ondurationchange">The definition of 'ondurationchange' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler ondurationchange;

  /**
   * The onemptied property sets and returns the event handler for the emptied event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onemptied">GlobalEventHandlers.onemptied - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onemptied">The definition of 'onemptied' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler onemptied;

  /**
   * The onended property of the GlobalEventHandlers mixin is the EventHandler for processing ended events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onended">GlobalEventHandlers.onended - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onended">The definition of 'onended' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler onended;

  /**
   * The onerror property of the GlobalEventHandlers mixin is an EventHandler that processes error events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onerror">GlobalEventHandlers.onerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onerror">The definition of 'onerror' in HTML Living Standard.</a>
   */
  @Nullable
  public OnErrorEventHandler onerror;

  /**
   * The onfocus property of the GlobalEventHandlers mixin is an EventHandler that processes focus events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onfocus">SVGElement.onfocus - MDN</a>
   */
  @Nullable
  public FocusEventHandler onfocus;

  /**
   * The onformdata property of the GlobalEventHandlers mixin is the EventHandler for processing formdata events, fired after the entry list representing the form's data is constructed. This happens when the form is submitted, but can also be triggered by the invocation of a FormData() constructor. onformdata is available on HTMLFormElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onformdata">GlobalEventHandlers.onformdata - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onformdata">The definition of 'onformdata' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler onformdata;

  /**
   * The ongotpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes gotpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ongotpointercapture">GlobalEventHandlers.ongotpointercapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#the-gotpointercapture-event">The definition of 'ongotpointercapture' in Pointer Events – Level 2.</a>
   */
  @Nullable
  public EventHandler ongotpointercapture;

  /**
   * The oninput property of the GlobalEventHandlers mixin is an EventHandler that processes input events on the input, select, and textarea elements. It also handles these events on elements where contenteditable or designMode are turned on.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/oninput">SVGElement.oninput - MDN</a>
   */
  @Nullable
  public EventHandler oninput;

  /**
   * The oninvalid property of the GlobalEventHandlers mixin is an EventHandler that processes invalid events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oninvalid">GlobalEventHandlers.oninvalid - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-oninvalid">The definition of 'oninvalid' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler oninvalid;

  /**
   * The onkeydown property of the GlobalEventHandlers mixin is an EventHandler that processes keydown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onkeydown">SVGElement.onkeydown - MDN</a>
   */
  @Nullable
  public EventHandler onkeydown;

  /**
   * The onkeypress property of the GlobalEventHandlers mixin is an EventHandler that processes keypress events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onkeypress">SVGElement.onkeypress - MDN</a>
   */
  @Nullable
  public EventHandler onkeypress;

  /**
   * The onkeyup property of the GlobalEventHandlers mixin is an EventHandler that processes keyup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onkeyup">SVGElement.onkeyup - MDN</a>
   */
  @Nullable
  public EventHandler onkeyup;

  /**
   * The onload property of the GlobalEventHandlers mixin is an EventHandler that processes load events on a Window, XMLHttpRequest, img element, etc.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onload">SVGElement.onload - MDN</a>
   */
  @Nullable
  public EventHandler onload;

  /**
   * The onloadeddata property of the GlobalEventHandlers mixin is the EventHandler for processing loadeddata events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadeddata">GlobalEventHandlers.onloadeddata - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onloadeddata">The definition of 'onloadeddata' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler onloadeddata;

  /**
   * The onloadedmetadata property of the GlobalEventHandlers mixin is the EventHandler for processing loadedmetadata events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadedmetadata">GlobalEventHandlers.onloadedmetadata - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onloadedmetadata">The definition of 'onloadedmetadata' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler onloadedmetadata;

  /**
   * The onloadstart property of the GlobalEventHandlers mixin is an EventHandler representing the code to be called when the loadstart event is raised (when progress has begun on the loading of a resource.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadstart">GlobalEventHandlers.onloadstart - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onloadstart">The definition of 'onloadstart' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler onloadstart;

  /**
   * The onlostpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes lostpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onlostpointercapture">GlobalEventHandlers.onlostpointercapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#the-lostpointercapture-event">The definition of 'onlostpointercapture' in Pointer Events – Level 2.</a>
   */
  @Nullable
  public EventHandler onlostpointercapture;

  /**
   * The onmousedown property of the GlobalEventHandlers mixin is an EventHandler that processes mousedown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onmousedown">SVGElement.onmousedown - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmousedown;

  /**
   * The onmouseenter property of the GlobalEventHandlers mixin is the EventHandler for processing mouseenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseenter">GlobalEventHandlers.onmouseenter - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onmouseenter">The definition of 'onmouseenter' in HTML Living Standard.</a>
   */
  @Nullable
  public MouseEventHandler onmouseenter;

  /**
   * The onmouseleave property of the GlobalEventHandlers mixin is the EventHandler for processing mouseleave events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseleave">GlobalEventHandlers.onmouseleave - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onmouseleave">The definition of 'onmouseleave' in HTML Living Standard.</a>
   */
  @Nullable
  public MouseEventHandler onmouseleave;

  /**
   * The onmousemove property of the GlobalEventHandlers mixin is an EventHandler that processes mousemove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onmousemove">SVGElement.onmousemove - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmousemove;

  /**
   * The onmouseout property of the GlobalEventHandlers mixin is an EventHandler that processes mouseout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onmouseout">SVGElement.onmouseout - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmouseout;

  /**
   * The onmouseover property of the GlobalEventHandlers mixin is an EventHandler that processes mouseover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onmouseover">SVGElement.onmouseover - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmouseover;

  /**
   * The onmouseup property of the GlobalEventHandlers mixin is an EventHandler that processes mouseup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onmouseup">SVGElement.onmouseup - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmouseup;

  @Nullable
  public ClipboardEventHandler onpaste;

  /**
   * The onpause property of the GlobalEventHandlers mixin is the EventHandler for processing pause events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpause">GlobalEventHandlers.onpause - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onpause">The definition of 'onpause' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler onpause;

  /**
   * The onplay property of the GlobalEventHandlers mixin is the EventHandler for processing play events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onplay">GlobalEventHandlers.onplay - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onplay">The definition of 'onplay' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler onplay;

  /**
   * The onplaying property of the GlobalEventHandlers mixin is the EventHandler for processing playing events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onplaying">GlobalEventHandlers.onplaying - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onplaying">The definition of 'onplaying' in HTML Living Standard.</a>
   */
  @Nullable
  public EventHandler onplaying;

  /**
   * The onpointercancel property of the GlobalEventHandlers mixin is an EventHandler that processes pointercancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointercancel">GlobalEventHandlers.onpointercancel - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointercancel">The definition of 'onpointercancel' in Pointer Events – Level 2.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointercancel">The definition of 'onpointercancel' in Pointer Events.</a>
   */
  @Nullable
  public EventHandler onpointercancel;

  /**
   * The GlobalEventHandlers event handler onpointerdown is used to specify the event handler for the pointerdown event, which is fired when the pointing device is initially pressed. This event can be sent to Window, Document, and Element objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerdown">GlobalEventHandlers.onpointerdown - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerdown">The definition of 'onpointerdown' in Pointer Events – Level 2.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerdown">The definition of 'onpointerdown' in Pointer Events.</a>
   */
  @Nullable
  public EventHandler onpointerdown;

  /**
   * The onpointerenter property of the GlobalEventHandlers mixin is an EventHandler that processes pointerenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerenter">GlobalEventHandlers.onpointerenter - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerenter">The definition of 'onpointerenter' in Pointer Events – Level 2.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerenter">The definition of 'onpointerenter' in Pointer Events.</a>
   */
  @Nullable
  public EventHandler onpointerenter;

  /**
   * The global event handler for the pointerleave event, which is delivered to a Node when the pointer (mouse cursor, fingertip, etc.) exits its hit test area (for example, if the cursor exits an Element or Window's content area). This event is part of the Pointer Events API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerleave">GlobalEventHandlers.onpointerleave - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerleave">The definition of 'onpointerleave' in Pointer Events – Level 2.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerleave">The definition of 'onpointerleave' in Pointer Events.</a>
   */
  @Nullable
  public EventHandler onpointerleave;

  /**
   * The onpointermove property of the GlobalEventHandlers mixin is an EventHandler that processes pointermove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointermove">GlobalEventHandlers.onpointermove - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointermove">The definition of 'onpointermove' in Pointer Events – Level 2.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointermove">The definition of 'onpointermove' in Pointer Events.</a>
   */
  @Nullable
  public EventHandler onpointermove;

  /**
   * The onpointerout property of the GlobalEventHandlers mixin is an EventHandler that processes pointerout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerout">GlobalEventHandlers.onpointerout - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerout">The definition of 'onpointerout' in Pointer Events – Level 2.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerout">The definition of 'onpointerout' in Pointer Events.</a>
   */
  @Nullable
  public EventHandler onpointerout;

  /**
   * The onpointerover property of the GlobalEventHandlers mixin is an EventHandler that processes pointerover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerover">GlobalEventHandlers.onpointerover - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerover">The definition of 'onpointerover' in Pointer Events – Level 2.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerover">The definition of 'onpointerover' in Pointer Events.</a>
   */
  @Nullable
  public EventHandler onpointerover;

  /**
   * The onpointerup property of the GlobalEventHandlers mixin is an EventHandler that processes pointerup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerup">GlobalEventHandlers.onpointerup - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerup">The definition of 'onpointerup' in Pointer Events – Level 2.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerup">The definition of 'onpointerup' in Pointer Events.</a>
   */
  @Nullable
  public EventHandler onpointerup;

  @Nullable
  public EventHandler onprogress;

  @Nullable
  public EventHandler onratechange;

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onreset">SVGElement.onreset - MDN</a>
   */
  @Nullable
  public EventHandler onreset;

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onresize">SVGElement.onresize - MDN</a>
   */
  @Nullable
  public EventHandler onresize;

  /**
   * The onscroll property of the GlobalEventHandlers mixin is an EventHandler that processes scroll events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onscroll">SVGElement.onscroll - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onselect">SVGElement.onselect - MDN</a>
   */
  @Nullable
  public EventHandler onselect;

  /**
   * The onselectionchange property of the GlobalEventHandlers mixin is an EventHandler that processes selectionchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectionchange">GlobalEventHandlers.onselectionchange - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-globaleventhandlers-onselectionchange">The definition of 'GlobalEventHandlers.onselectionchange' in Selection API.</a>
   */
  @Nullable
  public EventHandler onselectionchange;

  /**
   * The onselectstart property of the GlobalEventHandlers mixin is an EventHandler that processes selectstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectstart">GlobalEventHandlers.onselectstart - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-globaleventhandlers-onselectstart">The definition of 'GlobalEventHandlers.onselectstart' in Selection API.</a>
   */
  @Nullable
  public EventHandler onselectstart;

  @Nullable
  public EventHandler onslotchange;

  @Nullable
  public EventHandler onstalled;

  /**
   * The onsubmit property of the GlobalEventHandlers mixin is an EventHandler that processes submit events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/onsubmit">SVGElement.onsubmit - MDN</a>
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
  public TouchEventHandler ontouchcancel;

  /**
   * A global event handler for the touchend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchend">GlobalEventHandlers.ontouchend - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchend">Touch Events – Level 2</a>
   */
  @Nullable
  public TouchEventHandler ontouchend;

  /**
   * A global event handler for the touchmove event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchmove">GlobalEventHandlers.ontouchmove - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchmove">Touch Events – Level 2</a>
   */
  @Nullable
  public TouchEventHandler ontouchmove;

  /**
   * The ontouchstart property of the GlobalEventHandlers mixin is an EventHandler that processes touchstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchstart">GlobalEventHandlers.ontouchstart - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchstart">Touch Events – Level 2</a>
   */
  @Nullable
  public TouchEventHandler ontouchstart;

  /**
   * The ontransitioncancel property of the GlobalEventHandlers mixin is an EventHandler that processes transitioncancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitioncancel">GlobalEventHandlers.ontransitioncancel - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-transitions/#dom-globaleventhandlers-ontransitioncancel">The definition of 'ontransitioncancel' in CSS Transitions.</a>
   */
  @Nullable
  public EventHandler ontransitioncancel;

  /**
   * The ontransitionend property of the GlobalEventHandlers mixin is an EventHandler that processes transitionend events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitionend">GlobalEventHandlers.ontransitionend - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-transitions/#dom-globaleventhandlers-ontransitionend">The definition of 'ontransitionend' in CSS Transitions.</a>
   */
  @Nullable
  public EventHandler ontransitionend;

  @Nullable
  public EventHandler ontransitionrun;

  @Nullable
  public EventHandler ontransitionstart;

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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onwheel">The definition of 'onwheel' in HTML Living Standard.</a>
   */
  @Nullable
  public WheelEventHandler onwheel;

  public int tabIndex;

  protected SVGElement() {
  }

  @JsProperty(
      name = "className"
  )
  @Nonnull
  public native SVGAnimatedString className();

  @JsProperty(
      name = "correspondingElement"
  )
  @Nullable
  public native SVGElement correspondingElement();

  @JsProperty(
      name = "correspondingUseElement"
  )
  @Nullable
  public native SVGUseElement correspondingUseElement();

  /**
   * The dataset read-only property of the HTMLOrForeignElement interface provides read/write access to all the custom data attributes (data-*) set on the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGElement/dataset">SVGElement.dataset - MDN</a>
   */
  @JsProperty(
      name = "dataset"
  )
  @Nonnull
  public native DOMStringMap dataset();

  @JsProperty(
      name = "ownerSVGElement"
  )
  @Nullable
  public native SVGSVGElement ownerSVGElement();

  /**
   * The style property is used to get as well as set the inline style of an element. When getting, it returns a CSSStyleDeclaration object that contains a list of all styles properties for that element with values assigned for the attributes that are defined in the element's inline style attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ElementCSSInlineStyle/style">ElementCSSInlineStyle.style - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-elementcssinlinestyle-style">The definition of 'the ElementCSSInlineStyle.style property' in CSS Object Model (CSSOM).</a>
   */
  @JsProperty(
      name = "style"
  )
  @Nonnull
  public native CSSStyleDeclaration style();

  @JsProperty(
      name = "viewportElement"
  )
  @Nullable
  public native SVGElement viewportElement();

  public native void blur();

  public native void focus(@Nonnull FocusOptions options);

  public native void focus();
}
