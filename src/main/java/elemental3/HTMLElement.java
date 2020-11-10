package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The HTMLElement interface represents any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement">HTMLElement - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom-view/#extensions-to-the-htmlelement-interface">The definition of 'HTMLElement' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/elements.html#htmlelement">The definition of 'HTMLElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/dom.html#htmlelement">The definition of 'HTMLElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-011100101">The definition of 'HTMLElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-011100101">The definition of 'HTMLElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLElement"
)
public class HTMLElement extends Element {
  /**
   * The HTMLElement.accessKey property sets the keystroke which a user can press to jump to a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/accessKey">HTMLElement.accessKey - MDN</a>
   */
  @Nonnull
  public String accessKey;

  @Nonnull
  @AutocapitalizeType
  public String autocapitalize;

  public boolean autofocus;

  /**
   * The contentEditable property of the HTMLElement interface specifies whether or not the element is editable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/contentEditable">HTMLElement.contentEditable - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#contenteditable">The definition of 'contenteditable' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public String contentEditable;

  /**
   * The HTMLElement.dir property gets or sets the text writing directionality of the content of the current element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/dir">HTMLElement.dir - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dir">The definition of 'dir' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-52460740">The definition of 'dir' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-52460740">The definition of 'dir' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @Nonnull
  @DirType
  public String dir;

  public boolean draggable;

  @Nonnull
  public String enterKeyHint;

  /**
   * The HTMLElement property hidden is a Boolean which is true if the element is hidden; otherwise the value is false. This is quite different from using the CSS property display to control the visibility of an element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/hidden">HTMLElement.hidden - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-hidden">The definition of 'HTMLElement.hidden' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#the-hidden-attribute">The definition of 'HTMLElement.hidden' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/editing.html#the-hidden-attribute">The definition of 'HTMLElement.hidden' in the 'HTML5' specification.</a>
   */
  public boolean hidden;

  /**
   * The innerText property of the HTMLElement interface represents the &quot;rendered&quot; text content of a node and its descendants.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/innerText">HTMLElement.innerText - MDN</a>
   */
  @Nonnull
  public String innerText;

  @Nonnull
  @InputModeType
  public String inputMode;

  /**
   * The HTMLElement.lang property gets or sets the base language of an element's attribute values and text content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/lang">HTMLElement.lang - MDN</a>
   */
  @Nonnull
  public String lang;

  @Nonnull
  public String nonce;

  /**
   * The onabort property of the GlobalEventHandlers mixin is the EventHandler for processing abort events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onabort">HTMLElement.onabort - MDN</a>
   */
  @Nullable
  public EventHandler onabort;

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
  public MouseEventHandler onauxclick;

  /**
   * The onblur property of the GlobalEventHandlers mixin is the EventHandler for processing blur events. It's available on Element, Document, and Window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onblur">HTMLElement.onblur - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onchange">HTMLElement.onchange - MDN</a>
   */
  @Nullable
  public EventHandler onchange;

  /**
   * The onclick property of the GlobalEventHandlers mixin is the EventHandler for processing click events on a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onclick">HTMLElement.onclick - MDN</a>
   */
  @Nullable
  public MouseEventHandler onclick;

  /**
   * The onclose property of the GlobalEventHandlers mixin is an EventHandler for processing close events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclose">GlobalEventHandlers.onclose - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onclose">The definition of 'onclose' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onclose;

  /**
   * The oncontextmenu property of the GlobalEventHandlers mixin is an EventHandler that processes contextmenu events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/oncontextmenu">HTMLElement.oncontextmenu - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-oncontextmenu">The definition of 'oncontextmenu' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public MouseEventHandler oncontextmenu;

  /**
   * The oncopy property of the HTMLElement interface is an EventHandler that processes copy events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/oncopy">HTMLElement.oncopy - MDN</a>
   */
  @Nullable
  public ClipboardEventHandler oncopy;

  /**
   * The oncuechange property of the GlobalEventHandlers mixin is the EventHandler for processing cuechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncuechange">GlobalEventHandlers.oncuechange - MDN</a>
   */
  @Nullable
  public EventHandler oncuechange;

  /**
   * The HTMLElement.oncut property of the HTMLElement interface is an EventHandler that processes cut events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/oncut">HTMLElement.oncut - MDN</a>
   */
  @Nullable
  public ClipboardEventHandler oncut;

  /**
   * The ondblclick property of the GlobalEventHandlers mixin is an EventHandler that processes dblclick events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/ondblclick">HTMLElement.ondblclick - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-ondblclick">The definition of 'ondblclick' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public MouseEventHandler ondblclick;

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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onfocus">HTMLElement.onfocus - MDN</a>
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
  public PointerEventHandler ongotpointercapture;

  /**
   * The oninput property of the GlobalEventHandlers mixin is an EventHandler that processes input events on the input, select, and textarea elements. It also handles these events on elements where contenteditable or designMode are turned on.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/oninput">HTMLElement.oninput - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#ix-handler-oninput">The definition of 'oninput' in the 'HTML Living Standard' specification.</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onkeydown">HTMLElement.onkeydown - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeydown">The definition of 'onkeydown' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onkeydown;

  /**
   * The onkeypress property of the GlobalEventHandlers mixin is an EventHandler that processes keypress events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onkeypress">HTMLElement.onkeypress - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeypress">The definition of 'onkeypress' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onkeypress;

  /**
   * The onkeyup property of the GlobalEventHandlers mixin is an EventHandler that processes keyup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onkeyup">HTMLElement.onkeyup - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeyup">The definition of 'onkeyup' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public EventHandler onkeyup;

  /**
   * The onload property of the GlobalEventHandlers mixin is an EventHandler that processes load events on a Window, XMLHttpRequest, img element, etc.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onload">HTMLElement.onload - MDN</a>
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
  public PointerEventHandler onlostpointercapture;

  /**
   * The onmousedown property of the GlobalEventHandlers mixin is an EventHandler that processes mousedown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onmousedown">HTMLElement.onmousedown - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onmousemove">HTMLElement.onmousemove - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onmousemove">The definition of 'onmousemove' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public MouseEventHandler onmousemove;

  /**
   * The onmouseout property of the GlobalEventHandlers mixin is an EventHandler that processes mouseout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onmouseout">HTMLElement.onmouseout - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmouseout;

  /**
   * The onmouseover property of the GlobalEventHandlers mixin is an EventHandler that processes mouseover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onmouseover">HTMLElement.onmouseover - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onmouseover">The definition of 'onmouseover' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public MouseEventHandler onmouseover;

  /**
   * The onmouseup property of the GlobalEventHandlers mixin is an EventHandler that processes mouseup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onmouseup">HTMLElement.onmouseup - MDN</a>
   */
  @Nullable
  public MouseEventHandler onmouseup;

  /**
   * The HTMLElement.onpaste property of the HTMLElement interface is an EventHandler that processes paste events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onpaste">HTMLElement.onpaste - MDN</a>
   */
  @Nullable
  public ClipboardEventHandler onpaste;

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
  public PointerEventHandler onpointercancel;

  /**
   * The GlobalEventHandlers event handler onpointerdown is used to specify the event handler for the pointerdown event, which is fired when the pointing device is initially pressed. This event can be sent to Window, Document, and Element objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerdown">GlobalEventHandlers.onpointerdown - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerdown">The definition of 'onpointerdown' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerdown">The definition of 'onpointerdown' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public PointerEventHandler onpointerdown;

  /**
   * The onpointerenter property of the GlobalEventHandlers mixin is an EventHandler that processes pointerenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerenter">GlobalEventHandlers.onpointerenter - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerenter">The definition of 'onpointerenter' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerenter">The definition of 'onpointerenter' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public PointerEventHandler onpointerenter;

  /**
   * The global event handler for the pointerleave event, which is delivered to a Node when the pointer (mouse cursor, fingertip, etc.) exits its hit test area (for example, if the cursor exits an Element or Window's content area). This event is part of the Pointer Events API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerleave">GlobalEventHandlers.onpointerleave - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerleave">The definition of 'onpointerleave' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerleave">The definition of 'onpointerleave' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public PointerEventHandler onpointerleave;

  /**
   * The onpointermove property of the GlobalEventHandlers mixin is an EventHandler that processes pointermove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointermove">GlobalEventHandlers.onpointermove - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointermove">The definition of 'onpointermove' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointermove">The definition of 'onpointermove' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public PointerEventHandler onpointermove;

  /**
   * The onpointerout property of the GlobalEventHandlers mixin is an EventHandler that processes pointerout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerout">GlobalEventHandlers.onpointerout - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerout">The definition of 'onpointerout' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerout">The definition of 'onpointerout' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public PointerEventHandler onpointerout;

  /**
   * The onpointerover property of the GlobalEventHandlers mixin is an EventHandler that processes pointerover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerover">GlobalEventHandlers.onpointerover - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerover">The definition of 'onpointerover' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerover">The definition of 'onpointerover' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public PointerEventHandler onpointerover;

  /**
   * The onpointerup property of the GlobalEventHandlers mixin is an EventHandler that processes pointerup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerup">GlobalEventHandlers.onpointerup - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerup">The definition of 'onpointerup' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerup">The definition of 'onpointerup' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public PointerEventHandler onpointerup;

  @Nullable
  public EventHandler onprogress;

  @Nullable
  public EventHandler onratechange;

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onreset">HTMLElement.onreset - MDN</a>
   */
  @Nullable
  public EventHandler onreset;

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onresize">HTMLElement.onresize - MDN</a>
   */
  @Nullable
  public EventHandler onresize;

  /**
   * The onscroll property of the GlobalEventHandlers mixin is an EventHandler that processes scroll events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onscroll">HTMLElement.onscroll - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onselect">HTMLElement.onselect - MDN</a>
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
   * The onsubmit property of the GlobalEventHandlers mixin is an EventHandler that processes submit events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onsubmit">HTMLElement.onsubmit - MDN</a>
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

  public boolean spellcheck;

  public int tabIndex;

  /**
   * The HTMLElement.title property represents the title of the element: the text usually displayed in a 'tooltip' popup when the mouse is over the node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/title">HTMLElement.title - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-title">The definition of 'title' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-78276800">The definition of 'title' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-78276800">The definition of 'title' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @Nonnull
  public String title;

  public boolean translate;

  protected HTMLElement() {
  }

  /**
   * The HTMLElement.accessKeyLabel read-only property returns a String containing the element's browser-assigned access key (if any); otherwise it returns an empty string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/accessKeyLabel">HTMLElement.accessKeyLabel - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-accesskeylabel">The definition of 'HTMLElement.accessKeyLabel' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/">HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/editing.html#dom-accesskeylabel">The definition of 'HTMLElement.accessKeyLabel' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "accessKeyLabel"
  )
  @Nonnull
  public native String accessKeyLabel();

  @JsProperty(
      name = "dataset"
  )
  @Nonnull
  public native DOMStringMap dataset();

  /**
   * The HTMLElement.isContentEditable read-only property returns a Boolean that is true if the contents of the element are editable; otherwise it returns false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/isContentEditable">HTMLElement.isContentEditable - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/editing.html#dom-iscontenteditable">The definition of 'HTMLElement.contenteditable' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/editing.html#dom-iscontenteditable">The definition of 'HTMLElement.contenteditable' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/editing.html#dom-iscontenteditable">The definition of 'HTMLElement.contenteditable' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "isContentEditable"
  )
  public native boolean isContentEditable();

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
   * The style property is used to get as well as set the inline style of an element. When getting, it returns a CSSStyleDeclaration object that contains a list of all styles properties for that element with values assigned for the attributes that are defined in the element's inline style attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/style">HTMLElement.style - MDN</a>
   */
  @JsProperty(
      name = "style"
  )
  @Nonnull
  public native CSSStyleDeclaration style();

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
  public final void addBeforeinputListener(@Nonnull final InputEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "beforeinput", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBeforeinputListener(@Nonnull final InputEventListener callback,
      final boolean useCapture) {
    addEventListener( "beforeinput", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "beforeinput", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "change", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "change", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "gotpointercapture", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "gotpointercapture", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "input", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "input", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "invalid", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "invalid", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "lostpointercapture", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "lostpointercapture", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "pointercancel", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "pointercancel", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "pointerdown", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "pointerdown", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "pointerenter", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "pointerenter", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "pointerleave", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "pointerleave", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "pointermove", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "pointermove", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "pointerout", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "pointerout", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "pointerover", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "pointerover", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "pointerup", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "pointerup", Js.cast( callback ), useCapture );
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
}
