package elemental3;

import elemental3.core.JsArray;
import elemental3.promise.Promise;
import elemental3.svg.SVGSVGElement;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The Document interface represents any web page loaded in the browser and serves as an entry point into the web page's content, which is the DOM tree.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document">Document - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-document">Document - DOM</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/dom.html#the-document-object">Document - HTML Living Standard</a>
 * @see <a href="https://drafts.csswg.org/cssom-view/#extensions-to-the-document-interface">Document - CSS Object Model (CSSOM) View Module</a>
 * @see <a href="https://w3c.github.io/pointerlock/#extensions-to-the-document-interface">Document - Pointer Lock</a>
 * @see <a href="https://www.w3.org/TR/page-visibility/#extensions-to-the-document-interface">Document - Page Visibility (Second Edition)</a>
 * @see <a href="https://w3c.github.io/selection-api/#extensions-to-document-interface">Document - Selection API</a>
 * @see <a href="https://www.w3.org/TR/dom/#interface-document">Document - DOM4</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/#i-Document">Document - Document Object Model (DOM) Level 3 Core Specification</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator">XPathEvaluator - Document Object Model (DOM) Level 3 XPath Specification</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/#i-Document">Document - Document Object Model (DOM) Level 2 Core Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/#i-Document">Document - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Document"
)
public class Document extends Node {
  /**
   * Returns or sets the color of an active link in the document body. A link is active during the time between mousedown and mouseup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/alinkColor">Document.alinkColor - MDN</a>
   */
  @Nonnull
  public String alinkColor;

  /**
   * The deprecated  bgColor property gets or sets the background color of the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/bgColor">Document.bgColor - MDN</a>
   */
  @Nonnull
  public String bgColor;

  /**
   * The Document.body property represents the body or frameset node of the current document, or null if no such element exists.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/body">Document.body - MDN</a>
   */
  @Nullable
  public HTMLElement body;

  @Nonnull
  public String cookie;

  /**
   * document.designMode controls whether the entire document is editable. Valid values are &quot;on&quot; and &quot;off&quot;. According to the specification, this property is meant to default to &quot;off&quot;. Firefox follows this standard. The earlier versions of Chrome and IE default to &quot;inherit&quot;. Starting in Chrome 43, the default is &quot;off&quot; and &quot;inherit&quot; is no longer supported. In IE6-10, the value is capitalized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/designMode">Document.designMode - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#making-entire-documents-editable:-the-designmode-idl-attribute">designMode - HTML Living Standard</a>
   */
  @Nonnull
  public String designMode;

  /**
   * The Document.dir property is a DOMString representing the directionality of the text of the document, whether left to right (default) or right to left. Possible values are 'rtl', right to left, and 'ltr', left to right.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/dir">Document.dir - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-dir">Document.dir - HTML Living Standard</a>
   */
  @Nonnull
  public String dir;

  /**
   * The domain property of the Document interface gets/sets the domain portion of the origin of the current document, as used by the same-origin policy.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/domain">Document.domain - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/origin.html#relaxing-the-same-origin-restriction">document.domain - HTML Living Standard</a>
   */
  @Nonnull
  public String domain;

  /**
   * fgColor gets/sets the foreground color, or text color, of the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/fgColor">Document.fgColor - MDN</a>
   */
  @Nonnull
  public String fgColor;

  /**
   * The Document.linkColor property gets/sets the color of links within the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/linkColor">Document.linkColor - MDN</a>
   */
  @Nonnull
  public String linkColor;

  /**
   * The onabort property of the GlobalEventHandlers mixin is the EventHandler for processing abort events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onabort">Document.onabort - MDN</a>
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
   * @see <a href="https://w3c.github.io/uievents/#event-type-auxclick">onauxclick - UI Events</a>
   */
  @Nullable
  public EventHandler onauxclick;

  /**
   * The onblur property of the GlobalEventHandlers mixin is the EventHandler for processing blur events. It's available on Element, Document, and Window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onblur">Document.onblur - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onblur">onblur - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onblur;

  /**
   * The oncancel property of the GlobalEventHandlers mixin is an EventHandler for processing cancel events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncancel">GlobalEventHandlers.oncancel - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-oncancel">oncancel - HTML Living Standard</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onchange">Document.onchange - MDN</a>
   */
  @Nullable
  public EventHandler onchange;

  /**
   * The onclick property of the GlobalEventHandlers mixin is the EventHandler for processing click events on a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onclick">Document.onclick - MDN</a>
   */
  @Nullable
  public EventHandler onclick;

  /**
   * The onclose property of the GlobalEventHandlers mixin is an EventHandler for processing close events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclose">GlobalEventHandlers.onclose - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onclose">onclose - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onclose;

  /**
   * The oncontextmenu property of the GlobalEventHandlers mixin is an EventHandler that processes contextmenu events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/oncontextmenu">Document.oncontextmenu - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-oncontextmenu">oncontextmenu - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler oncontextmenu;

  @Nullable
  public ClipboardEventHandler oncopy;

  /**
   * The oncuechange property of the GlobalEventHandlers mixin is the EventHandler for processing cuechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncuechange">GlobalEventHandlers.oncuechange - MDN</a>
   */
  @Nullable
  public EventHandler oncuechange;

  @Nullable
  public ClipboardEventHandler oncut;

  /**
   * The ondblclick property of the GlobalEventHandlers mixin is an EventHandler that processes dblclick events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/ondblclick">Document.ondblclick - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-ondblclick">ondblclick - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler ondblclick;

  /**
   * A global event handler for the drag event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrag">GlobalEventHandlers.ondrag - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondrag">ondrag - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondrag">ondrag - HTML 5.1</a>
   */
  @Nullable
  public DragEventHandler ondrag;

  /**
   * A global event handler for the dragend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragend">GlobalEventHandlers.ondragend - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragend">ondragend - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragend">ondragend - HTML 5.1</a>
   */
  @Nullable
  public DragEventHandler ondragend;

  /**
   * A global event handler for the dragenter event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragenter">GlobalEventHandlers.ondragenter - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragenter">ondragenter - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragenter">ondragenter - HTML 5.1</a>
   */
  @Nullable
  public DragEventHandler ondragenter;

  /**
   * A global event handler for the dragleave event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragleave">GlobalEventHandlers.ondragleave - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragleave">ondragleave - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragleave">ondragleave - HTML 5.1</a>
   */
  @Nullable
  public DragEventHandler ondragleave;

  /**
   * A global event handler for the dragover event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragover">GlobalEventHandlers.ondragover - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragover">ondragover - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragover">ondragover - HTML 5.1</a>
   */
  @Nullable
  public DragEventHandler ondragover;

  /**
   * A global event handler for the dragstart event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragstart">GlobalEventHandlers.ondragstart - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragstart">ondragstart - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragstart">ondragstart - HTML 5.1</a>
   */
  @Nullable
  public DragEventHandler ondragstart;

  /**
   * A global event handler for the drop event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrop">GlobalEventHandlers.ondrop - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondrop">ondrop - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondrop">ondrop - HTML 5.1</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onerror">onerror - HTML Living Standard</a>
   */
  @Nullable
  public OnErrorEventHandler onerror;

  /**
   * The onfocus property of the GlobalEventHandlers mixin is an EventHandler that processes focus events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onfocus">Document.onfocus - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onfocus">onfocus - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onfocus;

  /**
   * The onformdata property of the GlobalEventHandlers mixin is the EventHandler for processing formdata events, fired after the entry list representing the form's data is constructed. This happens when the form is submitted, but can also be triggered by the invocation of a FormData() constructor. onformdata is available on HTMLFormElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onformdata">GlobalEventHandlers.onformdata - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onformdata">onformdata - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onformdata;

  /**
   * The Document interface's onfullscreenchange property is an event handler for the fullscreenchange event that is fired immediately before a document transitions into or out of full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onfullscreenchange">Document.onfullscreenchange - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#handler-document-onfullscreenchange">onfullscreenchange - Fullscreen API</a>
   */
  @Nullable
  public EventHandler onfullscreenchange;

  /**
   * The Document.onfullscreenerror property is an event handler for the fullscreenerror event that is sent to the  document when it fails to transition into full-screen mode after a prior call to Element.requestFullscreen().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onfullscreenerror">Document.onfullscreenerror - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#handler-document-onfullscreenerror">onfullscreenerror - Fullscreen API</a>
   */
  @Nullable
  public EventHandler onfullscreenerror;

  /**
   * The ongotpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes gotpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ongotpointercapture">GlobalEventHandlers.ongotpointercapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#the-gotpointercapture-event">ongotpointercapture - Pointer Events &ndash; Level 2</a>
   */
  @Nullable
  public PointerEventHandler ongotpointercapture;

  /**
   * The oninput property of the GlobalEventHandlers mixin is an EventHandler that processes input events on the input, select, and textarea elements. It also handles these events on elements where contenteditable or designMode are turned on.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/oninput">Document.oninput - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#ix-handler-oninput">oninput - HTML Living Standard</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onkeydown">Document.onkeydown - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeydown">onkeydown - HTML Living Standard</a>
   */
  @Nullable
  public KeyboardEventHandler onkeydown;

  /**
   * The onkeypress property of the GlobalEventHandlers mixin is an EventHandler that processes keypress events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onkeypress">Document.onkeypress - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeypress">onkeypress - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onkeypress;

  /**
   * The onkeyup property of the GlobalEventHandlers mixin is an EventHandler that processes keyup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onkeyup">Document.onkeyup - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeyup">onkeyup - HTML Living Standard</a>
   */
  @Nullable
  public KeyboardEventHandler onkeyup;

  /**
   * The onload property of the GlobalEventHandlers mixin is an EventHandler that processes load events on a Window, XMLHttpRequest, img element, etc.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onload">Document.onload - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onload">onload - HTML Living Standard</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onloadstart">onloadstart - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onloadstart;

  /**
   * The onlostpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes lostpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onlostpointercapture">GlobalEventHandlers.onlostpointercapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#the-lostpointercapture-event">onlostpointercapture - Pointer Events &ndash; Level 2</a>
   */
  @Nullable
  public PointerEventHandler onlostpointercapture;

  /**
   * The onmousedown property of the GlobalEventHandlers mixin is an EventHandler that processes mousedown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onmousedown">Document.onmousedown - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onmousemove">Document.onmousemove - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onmousemove">onmousemove - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onmousemove;

  /**
   * The onmouseout property of the GlobalEventHandlers mixin is an EventHandler that processes mouseout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onmouseout">Document.onmouseout - MDN</a>
   */
  @Nullable
  public EventHandler onmouseout;

  /**
   * The onmouseover property of the GlobalEventHandlers mixin is an EventHandler that processes mouseover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onmouseover">Document.onmouseover - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onmouseover">onmouseover - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onmouseover;

  /**
   * The onmouseup property of the GlobalEventHandlers mixin is an EventHandler that processes mouseup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onmouseup">Document.onmouseup - MDN</a>
   */
  @Nullable
  public EventHandler onmouseup;

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
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointercancel">onpointercancel - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointercancel">onpointercancel - Pointer Events</a>
   */
  @Nullable
  public PointerEventHandler onpointercancel;

  /**
   * The GlobalEventHandlers event handler onpointerdown is used to specify the event handler for the pointerdown event, which is fired when the pointing device is initially pressed. This event can be sent to Window, Document, and Element objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerdown">GlobalEventHandlers.onpointerdown - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerdown">onpointerdown - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerdown">onpointerdown - Pointer Events</a>
   */
  @Nullable
  public PointerEventHandler onpointerdown;

  /**
   * The onpointerenter property of the GlobalEventHandlers mixin is an EventHandler that processes pointerenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerenter">GlobalEventHandlers.onpointerenter - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerenter">onpointerenter - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerenter">onpointerenter - Pointer Events</a>
   */
  @Nullable
  public PointerEventHandler onpointerenter;

  /**
   * The global event handler for the pointerleave event, which is delivered to a Node when the pointer (mouse cursor, fingertip, etc.) exits its hit test area (for example, if the cursor exits an Element or Window's content area). This event is part of the Pointer Events API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerleave">GlobalEventHandlers.onpointerleave - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerleave">onpointerleave - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerleave">onpointerleave - Pointer Events</a>
   */
  @Nullable
  public PointerEventHandler onpointerleave;

  @Nullable
  public EventHandler onpointerlockchange;

  @Nullable
  public EventHandler onpointerlockerror;

  /**
   * The onpointermove property of the GlobalEventHandlers mixin is an EventHandler that processes pointermove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointermove">GlobalEventHandlers.onpointermove - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointermove">onpointermove - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointermove">onpointermove - Pointer Events</a>
   */
  @Nullable
  public PointerEventHandler onpointermove;

  /**
   * The onpointerout property of the GlobalEventHandlers mixin is an EventHandler that processes pointerout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerout">GlobalEventHandlers.onpointerout - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerout">onpointerout - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerout">onpointerout - Pointer Events</a>
   */
  @Nullable
  public PointerEventHandler onpointerout;

  /**
   * The onpointerover property of the GlobalEventHandlers mixin is an EventHandler that processes pointerover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerover">GlobalEventHandlers.onpointerover - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerover">onpointerover - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerover">onpointerover - Pointer Events</a>
   */
  @Nullable
  public PointerEventHandler onpointerover;

  /**
   * The onpointerup property of the GlobalEventHandlers mixin is an EventHandler that processes pointerup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerup">GlobalEventHandlers.onpointerup - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerup">onpointerup - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerup">onpointerup - Pointer Events</a>
   */
  @Nullable
  public PointerEventHandler onpointerup;

  @Nullable
  public EventHandler onprogress;

  @Nullable
  public EventHandler onratechange;

  @Nullable
  public EventHandler onreadystatechange;

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onreset">Document.onreset - MDN</a>
   */
  @Nullable
  public EventHandler onreset;

  /**
   * The onresize property of the GlobalEventHandlers interface is an EventHandler that processes resize events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onresize">Document.onresize - MDN</a>
   */
  @Nullable
  public EventHandler onresize;

  /**
   * The onscroll property of the GlobalEventHandlers mixin is an EventHandler that processes scroll events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onscroll">Document.onscroll - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onscroll">onscroll - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#event-type-scroll">onscroll - Document Object Model (DOM) Level 3 Events Specification</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onselect">Document.onselect - MDN</a>
   */
  @Nullable
  public EventHandler onselect;

  /**
   * The onselectionchange property of the GlobalEventHandlers mixin is an EventHandler that processes selectionchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onselectionchange">Document.onselectionchange - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-globaleventhandlers-onselectionchange">GlobalEventHandlers.onselectionchange - Selection API</a>
   */
  @Nullable
  public EventHandler onselectionchange;

  /**
   * The onselectstart property of the GlobalEventHandlers mixin is an EventHandler that processes selectstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectstart">GlobalEventHandlers.onselectstart - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-globaleventhandlers-onselectstart">GlobalEventHandlers.onselectstart - Selection API</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onsubmit">Document.onsubmit - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onsubmit">onsubmit - HTML Living Standard</a>
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

  /**
   * The Document.onvisibilitychange property represents the event handler that is called when a visibilitychange event reaches this object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onvisibilitychange">Document.onvisibilitychange - MDN</a>
   * @see <a href="https://www.w3.org/TR/page-visibility/#onvisiblitychange-event-handler">onvisibilitychange - Page Visibility (Second Edition)</a>
   */
  @Nullable
  public EventHandler onvisibilitychange;

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
   * The document.title property gets or sets the current title of the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/title">Document.title - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#document.title">document.title - HTML Living Standard</a>
   */
  @Nonnull
  public String title;

  /**
   * The Document.vlinkColor property gets/sets the color of links that the user has visited in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/vlinkColor">Document.vlinkColor - MDN</a>
   */
  @Nonnull
  public String vlinkColor;

  /**
   * The Document constructor creates a new Document object that is a web page loaded in the browser and serving as an entry point into the page's content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/Document">Document.Document - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-document">Document - DOM</a>
   */
  public Document() {
  }

  /**
   * The URL read-only property of the Document interface returns the document location as a string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/URL">Document.URL - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-url">Document.URL - DOM</a>
   */
  @JsProperty(
      name = "URL"
  )
  @Nonnull
  public native String URL();

  /**
   * The activeElement read-only property of the Document and ShadowRoot interfaces returns the Element within the DOM or shadow DOM tree that currently has focus.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/activeElement">DocumentOrShadowRoot.activeElement - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-document-activeelement">activeElement - HTML Living Standard</a>
   */
  @JsProperty(
      name = "activeElement"
  )
  @Nullable
  public native Element activeElement();

  /**
   * The Document interface's read-only all property returns an HTMLAllCollection rooted at the document node. In other words, it returns all of the document's elements, accessible by order (like an array) and by ID (like a regular object).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/all">Document.all - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/obsolete.html#dom-document-all">all - HTML Living Standard</a>
   */
  @JsProperty(
      name = "all"
  )
  @Nonnull
  public native HTMLAllCollection all();

  /**
   * The anchors read-only property of the Document interface returns a list of all of the anchors in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/anchors">Document.anchors - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-anchors">Document.anchors - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-7577272">Document.anchors - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  @JsProperty(
      name = "anchors"
  )
  @Nonnull
  public native HTMLCollection anchors();

  /**
   * The applets property of the Document interface returns a list of the applets within a document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/applets">Document.applets - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-applets">Document.applets - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-85113862">Document.applets - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  @JsProperty(
      name = "applets"
  )
  @Nonnull
  public native HTMLCollection applets();

  /**
   * The Document.characterSet read-only property returns the character encoding of the document that it's currently rendered with.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/characterSet">Document.characterSet - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-characterset">characterSet - DOM</a>
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
   * The ParentNode.childElementCount read-only property returns an unsigned long representing the number of child elements of the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/childElementCount">Document.childElementCount - MDN</a>
   */
  @JsProperty(
      name = "childElementCount"
  )
  public native int childElementCount();

  /**
   * The ParentNode property children is a read-only property that returns a live HTMLCollection which contains all of the child elements of the node upon which it was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/children">Document.children - MDN</a>
   */
  @JsProperty(
      name = "children"
  )
  @Nonnull
  public native HTMLCollection children();

  /**
   * The Document.compatMode read-only property indicates whether the document is rendered in Quirks mode or Standards mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/compatMode">Document.compatMode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-compatmode">compatMode - DOM</a>
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
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-contenttype">Document.contentType - DOM</a>
   */
  @JsProperty(
      name = "contentType"
  )
  @Nonnull
  public native String contentType();

  /**
   * The Document.currentScript property returns the script element whose script is currently being processed and isn't a JavaScript module. (For modules use import.meta instead.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/currentScript">Document.currentScript - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/dom.html#dom-document-currentscript">Document.currentScript - HTML Living Standard</a>
   */
  @JsProperty(
      name = "currentScript"
  )
  @Nullable
  public native HTMLOrSVGScriptElement currentScript();

  /**
   * In browsers, document.defaultView returns the window object associated with a document, or null if none is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/defaultView">Document.defaultView - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-defaultview">Document.defaultView - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-document-defaultview">Document.defaultView - HTML5</a>
   */
  @JsProperty(
      name = "defaultView"
  )
  @Nullable
  public native Window defaultView();

  /**
   * Returns the Document Type Declaration (DTD) associated with current document. The returned object implements the DocumentType interface. Use DOMImplementation.createDocumentType() to create a DocumentType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/doctype">Document.doctype - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-doctype">Document: doctype - DOM</a>
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
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-documentelement">Document.documentElement - DOM</a>
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
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-documenturi">documentURI - DOM</a>
   */
  @JsProperty(
      name = "documentURI"
  )
  @Nonnull
  public native String documentURI();

  /**
   * The embeds read-only property of the Document interface returns a list of the embedded object elements within the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/embeds">Document.embeds - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-embeds">Document.embeds - HTML Living Standard</a>
   */
  @JsProperty(
      name = "embeds"
  )
  @Nonnull
  public native HTMLCollection embeds();

  /**
   * The ParentNode.firstElementChild read-only property returns the object's first child Element, or null if there are no child elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/firstElementChild">Document.firstElementChild - MDN</a>
   */
  @JsProperty(
      name = "firstElementChild"
  )
  @Nullable
  public native Element firstElementChild();

  /**
   * The forms read-only property of the Document interface returns an HTMLCollection listing all the form elements contained in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/forms">Document.forms - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-forms">Document.forms - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-1689064">Document.forms - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  @JsProperty(
      name = "forms"
  )
  @Nonnull
  public native HTMLCollection forms();

  /**
   * The obsolete Document interface's fullscreen read-only property reports whether or not the document is currently displaying content in full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/fullscreen">Document.fullscreen - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dom-document-fullscreen">Document.fullscreen - Fullscreen API</a>
   */
  @JsProperty(
      name = "fullscreen"
  )
  public native boolean fullscreen();

  /**
   * The DocumentOrShadowRoot.fullscreenElement read-only property returns the Element that is currently being presented in full-screen mode in this document, or null if full-screen mode is not currently in use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/fullscreenElement">DocumentOrShadowRoot.fullscreenElement - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dom-document-fullscreenelement">Document.fullscreenElement - Fullscreen API</a>
   */
  @JsProperty(
      name = "fullscreenElement"
  )
  @Nullable
  public native Element fullscreenElement();

  /**
   * The read-only fullscreenEnabled property on the Document interface indicates whether or not full-screen mode is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/fullscreenEnabled">Document.fullscreenEnabled - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dom-document-fullscreenenabled">Document.fullscreenEnabled - Fullscreen API</a>
   */
  @JsProperty(
      name = "fullscreenEnabled"
  )
  public native boolean fullscreenEnabled();

  /**
   * The head read-only property of the Document interface returns the head element of the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/head">Document.head - MDN</a>
   * @see <a href="https://www.w3.org/TR/html51/dom.html#dom-document-head">Document.head - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/dom.html#dom-document-head">Document.head - HTML5</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/dom.html#dom-document-head">Document.head - HTML Living Standard</a>
   */
  @JsProperty(
      name = "head"
  )
  @Nullable
  public native HTMLHeadElement head();

  /**
   * The Document.hidden read-only property returns a Boolean value indicating if the page is considered hidden or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/hidden">Document.hidden - MDN</a>
   * @see <a href="https://www.w3.org/TR/page-visibility/#dom-document-hidden">Document.hidden - Page Visibility (Second Edition)</a>
   */
  @JsProperty(
      name = "hidden"
  )
  public native boolean hidden();

  /**
   * The images read-only property of the Document interface returns a collection of the images in the current HTML document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/images">Document.images - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-images">Document.images - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-90379117">Document.images - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  @JsProperty(
      name = "images"
  )
  @Nonnull
  public native HTMLCollection images();

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
   * The ParentNode.lastElementChild read-only property returns the object's last child Element or null if there are no child elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/lastElementChild">Document.lastElementChild - MDN</a>
   */
  @JsProperty(
      name = "lastElementChild"
  )
  @Nullable
  public native Element lastElementChild();

  /**
   * The lastModified property of the Document interface returns a string containing the date and time on which the current document was last modified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/lastModified">Document.lastModified - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-lastmodified">document.lastModified - HTML Living Standard</a>
   */
  @JsProperty(
      name = "lastModified"
  )
  @Nonnull
  public native String lastModified();

  /**
   * The links read-only property of the Document interface returns a collection of all area elements and a elements in a document with a value for the href attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/links">Document.links - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-links">Document.links - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-7068919">document.links - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  @JsProperty(
      name = "links"
  )
  @Nonnull
  public native HTMLCollection links();

  /**
   * The Document.location read-only property returns a Location object, which contains information about the URL of the document and provides methods for changing that URL and loading another URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/location">Document.location - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/history.html#the-location-interface">Document.location - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#the-location-interface">Document.location - HTML5</a>
   */
  @JsProperty(
      name = "location"
  )
  @Nullable
  public native Location location();

  /**
   * The plugins read-only property of the Document interface returns an HTMLCollection object containing one or more HTMLEmbedElements representing the embed elements in the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/plugins">Document.plugins - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-plugins">Document.plugins - HTML Living Standard</a>
   */
  @JsProperty(
      name = "plugins"
  )
  @Nonnull
  public native HTMLCollection plugins();

  /**
   * The pointerLockElement property of the Document and ShadowRoot interfaces provides the element set as the target for mouse events while the pointer is locked. It is null if lock is pending, pointer is unlocked, or the target is in another document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/pointerLockElement">DocumentOrShadowRoot.pointerLockElement - MDN</a>
   * @see <a href="https://w3c.github.io/pointerlock/#extensions-to-the-documentorshadowroot-mixin">pointerLockElement - Pointer Lock</a>
   */
  @JsProperty(
      name = "pointerLockElement"
  )
  @Nullable
  public native Element pointerLockElement();

  /**
   * The Document.readyState property describes the loading state of the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/readyState">Document.readyState - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#current-document-readiness">Document readiness - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/#current-document-readiness">Document readiness - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/#current-document-readiness">Document readiness - HTML5</a>
   */
  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  @DocumentReadyState
  public native String readyState();

  /**
   * The Document.referrer property returns the URI of the page that linked to this page.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/referrer">Document.referrer - MDN</a>
   */
  @JsProperty(
      name = "referrer"
  )
  @Nonnull
  public native String referrer();

  @JsProperty(
      name = "rootElement"
  )
  @Nullable
  public native SVGSVGElement rootElement();

  /**
   * The scripts property of the Document interface returns a list of the script elements in the document. The returned object is an HTMLCollection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/scripts">Document.scripts - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-scripts">Document.scripts - HTML Living Standard</a>
   */
  @JsProperty(
      name = "scripts"
  )
  @Nonnull
  public native HTMLCollection scripts();

  /**
   * The scrollingElement read-only property of the Document interface returns a reference to the Element that scrolls the document. In standards mode, this is the root element of the document, document.documentElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/scrollingElement">Document.scrollingElement - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-document-scrollingelement">scrollingElement - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "scrollingElement"
  )
  @Nullable
  public native Element scrollingElement();

  /**
   * The styleSheets read-only property of the DocumentOrShadowRoot interface returns a StyleSheetList of CSSStyleSheet objects, for stylesheets explicitly linked into or embedded in a document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/styleSheets">DocumentOrShadowRoot.styleSheets - MDN</a>
   * @see <a href="https://w3c.github.io/webcomponents/spec/shadow/#extensions-to-the-documentorshadowroot-mixin">DocumentOrShadowRoot - Shadow DOM</a>
   */
  @JsProperty(
      name = "styleSheets"
  )
  @Nonnull
  public native StyleSheetList styleSheets();

  /**
   * The timeline readonly property of the Document interface represents the default timeline of the current document. This timeline is a special instance of DocumentTimeline that is automatically created on page load.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/timeline">Document.timeline - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-document-timeline">document.timeline - Web Animations</a>
   */
  @JsProperty(
      name = "timeline"
  )
  @Nonnull
  public native DocumentTimeline timeline();

  /**
   * The Document.visibilityState read-only property returns the visibility of the document, that is in which context this element is now visible. It is useful to know if the document is in the background or an invisible tab, or only loaded for pre-rendering.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/visibilityState">Document.visibilityState - MDN</a>
   * @see <a href="https://www.w3.org/TR/page-visibility/#visibility-states-and-the-visibilitystate-enum">Document.visibilityState - Page Visibility (Second Edition)</a>
   */
  @JsProperty(
      name = "visibilityState"
  )
  @Nonnull
  @VisibilityState
  public native String visibilityState();

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
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createcdatasection">document.createCDATASection - DOM</a>
   */
  @Nonnull
  public native CDATASection createCDATASection(@Nonnull String data);

  /**
   * createComment() creates a new comment node, and returns it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createComment">Document.createComment - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createcomment">document.createComment - DOM</a>
   */
  @Nonnull
  public native Comment createComment(@Nonnull String data);

  /**
   * Creates a new empty DocumentFragment into which DOM nodes can be added to build an offscreen DOM tree.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createDocumentFragment">Document.createDocumentFragment - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createdocumentfragment">Document.createDocumentFragment() - DOM</a>
   */
  @Nonnull
  public native DocumentFragment createDocumentFragment();

  /**
   * In an HTML document, the document.createElement() method creates the HTML element specified by tagName, or an HTMLUnknownElement if tagName isn't recognized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement">Document.createElement - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createelement">Document.createElement - DOM</a>
   */
  @Nonnull
  public native Element createElement(@Nonnull String localName, @Nonnull String options);

  /**
   * In an HTML document, the document.createElement() method creates the HTML element specified by tagName, or an HTMLUnknownElement if tagName isn't recognized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement">Document.createElement - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createelement">Document.createElement - DOM</a>
   */
  @Nonnull
  public native Element createElement(@Nonnull String localName,
      @Nonnull ElementCreationOptions options);

  /**
   * In an HTML document, the document.createElement() method creates the HTML element specified by tagName, or an HTMLUnknownElement if tagName isn't recognized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement">Document.createElement - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createelement">Document.createElement - DOM</a>
   */
  @Nonnull
  public native Element createElement(@Nonnull String localName);

  /**
   * Creates an element with the specified namespace URI and qualified name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElementNS">Document.createElementNS - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createelementns">Document.createElementNS() - DOM</a>
   */
  @Nonnull
  public native Element createElementNS(@Nullable String namespace, @Nonnull String qualifiedName,
      @Nonnull String options);

  /**
   * Creates an element with the specified namespace URI and qualified name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElementNS">Document.createElementNS - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createelementns">Document.createElementNS() - DOM</a>
   */
  @Nonnull
  public native Element createElementNS(@Nullable String namespace, @Nonnull String qualifiedName,
      @Nonnull ElementCreationOptions options);

  /**
   * Creates an element with the specified namespace URI and qualified name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElementNS">Document.createElementNS - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createelementns">Document.createElementNS() - DOM</a>
   */
  @Nonnull
  public native Element createElementNS(@Nullable String namespace, @Nonnull String qualifiedName);

  /**
   * Creates an event of the type specified. The returned object should be first initialized and can then be passed to EventTarget.dispatchEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createEvent">Document.createEvent - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createevent">document.createEvent - DOM</a>
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
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createprocessinginstruction">createProcessingInstruction() - DOM</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-document-createprocessinginstruction">createProcessingInstruction() - DOM4</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-135944439">createProcessingInstruction() - Document Object Model (DOM) Level 3 Core Specification</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-135944439">createProcessingInstruction() - Document Object Model (DOM) Level 2 Core Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-135944439">createProcessingInstruction() - Document Object Model (DOM) Level 1 Specification</a>
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
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createtextnode">Document: createTextNode - DOM</a>
   */
  @Nonnull
  public native Text createTextNode(@Nonnull String data);

  /**
   * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createTreeWalker">Document.createTreeWalker - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createtreewalker">Document.createTreeWalker - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/traversal.html#NodeIteratorFactory-createTreeWalker">Document.createTreeWalker - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  @Nonnull
  public native TreeWalker createTreeWalker(@Nonnull Node root, int whatToShow,
      @Nullable NodeFilter filter);

  /**
   * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createTreeWalker">Document.createTreeWalker - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createtreewalker">Document.createTreeWalker - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/traversal.html#NodeIteratorFactory-createTreeWalker">Document.createTreeWalker - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  @Nonnull
  public native TreeWalker createTreeWalker(@Nonnull Node root, int whatToShow);

  /**
   * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createTreeWalker">Document.createTreeWalker - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-createtreewalker">Document.createTreeWalker - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/traversal.html#NodeIteratorFactory-createTreeWalker">Document.createTreeWalker - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  @Nonnull
  public native TreeWalker createTreeWalker(@Nonnull Node root);

  /**
   * returns an array-like object of all child elements which have all of the given class name(s).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementsByClassName">Document.getElementsByClassName - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-getelementsbyclassname">document.getElementsByClassName - DOM</a>
   */
  @Nonnull
  public native HTMLCollection getElementsByClassName(@Nonnull String classNames);

  /**
   * returns an HTMLCollection of elements with the given tag name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementsByTagName">Document.getElementsByTagName - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-getelementsbytagname">document.getElementsByTagName - DOM</a>
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
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-importnode">document.importNode() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#Core-Document-importNode">document.importNode() - Document Object Model (DOM) Level 2 Core Specification</a>
   */
  @Nonnull
  public native Node importNode(@Nonnull Node node, boolean deep);

  /**
   * The Document object's importNode() method creates a copy of a Node or DocumentFragment from another document, to be inserted into the current document later.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/importNode">Document.importNode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-document-importnode">document.importNode() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#Core-Document-importNode">document.importNode() - Document Object Model (DOM) Level 2 Core Specification</a>
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
   * @see <a href="https://w3c.github.io/pointerlock/#extensions-to-the-document-interface">Document - Pointer Lock</a>
   */
  public native void exitPointerLock();

  @Nullable
  public native Selection getSelection();

  /**
   * The getAnimations() method of the Document interface returns an array of all Animation objects currently in effect whose target elements are descendants of the document. This array includes CSS Animations, CSS Transitions, and Web Animations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getAnimations">Document.getAnimations - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-documentorshadowroot-getanimations">The definition of 'document.getAnimations()' in Web Animations.</a>
   */
  @Nonnull
  public native JsArray<Animation> getAnimations();

  /**
   * The Document method exitFullscreen() requests that the element on this document which is currently being presented in full-screen mode be taken out of full-screen mode, restoring the previous state of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/exitFullscreen">Document.exitFullscreen - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dom-document-exitfullscreen">Document.exitFullscreen() - Fullscreen API</a>
   */
  @Nonnull
  public native Promise<Void> exitFullscreen();

  /**
   * The Document.close() method finishes writing to a document, opened with Document.open().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/close">Document.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-close">document.close() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-98948567">document.close() - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  public native void close();

  /**
   * When an HTML document has been switched to designMode, its document object exposes an execCommand method to run commands that manipulate the current editable region, such as form inputs or contentEditable elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/execCommand">Document.execCommand - MDN</a>
   * @see <a href="https://w3c.github.io/editing/docs/execCommand/">execCommand</a>
   */
  public native boolean execCommand(@Nonnull String commandId, boolean showUI,
      @Nonnull String value);

  /**
   * When an HTML document has been switched to designMode, its document object exposes an execCommand method to run commands that manipulate the current editable region, such as form inputs or contentEditable elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/execCommand">Document.execCommand - MDN</a>
   * @see <a href="https://w3c.github.io/editing/docs/execCommand/">execCommand</a>
   */
  public native boolean execCommand(@Nonnull String commandId, boolean showUI);

  /**
   * When an HTML document has been switched to designMode, its document object exposes an execCommand method to run commands that manipulate the current editable region, such as form inputs or contentEditable elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/execCommand">Document.execCommand - MDN</a>
   * @see <a href="https://w3c.github.io/editing/docs/execCommand/">execCommand</a>
   */
  public native boolean execCommand(@Nonnull String commandId);

  /**
   * The getElementsByName() method of the Document object returns a NodeList Collection of elements with a given name in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementsByName">Document.getElementsByName - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-getelementsbyname">Document.getElementsByName() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-71555259">Document.getElementsByName() - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  @Nonnull
  public native NodeList getElementsByName(@Nonnull String elementName);

  /**
   * The hasFocus() method of the Document interface returns a Boolean value indicating whether the document or any element inside the document has focus. This method can be used to determine whether the active element in a document has focus.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/hasFocus">Document.hasFocus - MDN</a>
   */
  public native boolean hasFocus();

  /**
   * The Document.open() method opens a document for writing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/open">Document.open - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-open">document.open() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-72161170">document.open() - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  @Nonnull
  public native Document open(@Nonnull String unused1, @Nonnull String unused2);

  /**
   * The Document.open() method opens a document for writing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/open">Document.open - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-open">document.open() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-72161170">document.open() - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  @Nonnull
  public native Document open(@Nonnull String unused1);

  /**
   * The Document.open() method opens a document for writing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/open">Document.open - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-open">document.open() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-72161170">document.open() - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  @Nonnull
  public native Document open();

  /**
   * The Document.open() method opens a document for writing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/open">Document.open - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-open">document.open() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-72161170">document.open() - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  @Nullable
  public native Window open(@Nonnull String url, @Nonnull String name, @Nonnull String features);

  /**
   * The Document.queryCommandEnabled() method reports whether or not the specified editor command is enabled by the browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/queryCommandEnabled">Document.queryCommandEnabled - MDN</a>
   * @see <a href="https://w3c.github.io/editing/execCommand.html#querycommandenabled()">execCommand</a>
   */
  public native boolean queryCommandEnabled(@Nonnull String commandId);

  public native boolean queryCommandIndeterm(@Nonnull String commandId);

  public native boolean queryCommandState(@Nonnull String commandId);

  /**
   * The Document.queryCommandSupported() method reports whether or not the specified editor command is supported by the browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/queryCommandSupported">Document.queryCommandSupported - MDN</a>
   * @see <a href="https://w3c.github.io/editing/execCommand.html#querycommandsupported()">execCommand</a>
   */
  public native boolean queryCommandSupported(@Nonnull String commandId);

  @Nonnull
  public native String queryCommandValue(@Nonnull String commandId);

  /**
   * The Document.write() method writes a string of text to a document stream opened by document.open().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/write">Document.write - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-write">document.write(...) - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-75233634">document.write(...) - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  public native void write(@Nonnull String... text);

  /**
   * Writes a string of text followed by a newline character to a document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/writeln">Document.writeln - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-writeln">document.writeln() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-35318390">document.writeln() - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  public native void writeln(@Nonnull String... text);

  @JsOverlay
  @Nonnull
  public final Object get(@Nonnull final String name) {
    return Js.<JsPropertyMap<Object>>cast( this ).get( name );
  }

  public native void captureEvents();

  /**
   * The Document.clear() method clears the whole specified document in early (pre-1.0) versions of Mozilla.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/clear">Document.clear - MDN</a>
   */
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
   * The Document method querySelector() returns the first Element within the document that matches the specified selector, or group of selectors. If no matches are found, null is returned.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/querySelector">Document.querySelector - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-parentnode-queryselector">document.querySelector() - DOM</a>
   */
  @Nullable
  public native Element querySelector(@Nonnull String selectors);

  /**
   * The Document method querySelectorAll() returns a static (not live) NodeList representing a list of the document's elements that match the specified group of selectors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/querySelectorAll">Document.querySelectorAll - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-parentnode-queryselectorall">ParentNode.querySelectorAll() - DOM</a>
   * @see <a href="https://dev.w3.org/2006/webapi/selectors-api2/#dom-parentnode-queryselectorall">ParentNode.querySelectorAll() - Selectors API Level 2</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-parentnode-queryselectorall">ParentNode.querySelectorAll() - DOM4</a>
   * @see <a href="https://www.w3.org/TR/selectors-api/#interface-definitions">document.querySelector() - Selectors API Level 1</a>
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

  /**
   * This method compiles an XPathExpression which can then be used for (repeated) evaluations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createExpression">Document.createExpression - MDN</a>
   */
  @Nonnull
  public native XPathExpression createExpression(@Nonnull String expression,
      @Nullable XPathNSResolver resolver);

  /**
   * This method compiles an XPathExpression which can then be used for (repeated) evaluations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createExpression">Document.createExpression - MDN</a>
   */
  @Nonnull
  public native XPathExpression createExpression(@Nonnull String expression);

  /**
   * Creates an XPathNSResolver which resolves namespaces with respect to the definitions in scope for a specified node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createNSResolver">Document.createNSResolver - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator-createNSResolver">document.createNSResolver - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathNSResolver createNSResolver(@Nonnull Node nodeResolver);

  /**
   * Returns an XPathResult based on an XPath expression and other given parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/evaluate">Document.evaluate - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator-evaluate">Document.evaluate - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode,
      @Nullable XPathNSResolver resolver, int type, @Nullable XPathResult result);

  /**
   * Returns an XPathResult based on an XPath expression and other given parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/evaluate">Document.evaluate - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator-evaluate">Document.evaluate - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode,
      @Nullable XPathNSResolver resolver, int type);

  /**
   * Returns an XPathResult based on an XPath expression and other given parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/evaluate">Document.evaluate - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator-evaluate">Document.evaluate - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode,
      @Nullable XPathNSResolver resolver);

  /**
   * Returns an XPathResult based on an XPath expression and other given parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/evaluate">Document.evaluate - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator-evaluate">Document.evaluate - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode);

  /**
   * The Document method getElementById() returns an Element object representing the element whose id property matches the specified string. Since element IDs are required to be unique if specified, they're a useful way to get access to a specific element quickly.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementById">Document.getElementById - MDN</a>
   */
  @Nullable
  public native Element getElementById(@Nonnull String elementId);

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
  public final void addFullscreenchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "fullscreenchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFullscreenchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "fullscreenchange", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "fullscreenchange", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "pointerlockchange", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "pointerlockchange", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "pointerlockerror", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "pointerlockerror", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "readystatechange", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "readystatechange", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "scroll", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "scroll", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "selectionchange", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "selectionchange", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "selectstart", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "selectstart", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "visibilitychange", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "visibilitychange", Js.cast( callback ), useCapture );
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
  public final void addDragListener(@Nonnull final DragEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "drag", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDragListener(@Nonnull final DragEventListener callback,
      final boolean useCapture) {
    addEventListener( "drag", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "drag", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "dragend", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "dragend", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "dragenter", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "dragenter", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "dragexit", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "dragexit", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "dragleave", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "dragleave", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "dragover", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "dragover", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "dragstart", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "dragstart", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "drop", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "drop", Js.cast( callback ), useCapture );
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
  public final void addKeydownListener(@Nonnull final KeyboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "keydown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addKeydownListener(@Nonnull final KeyboardEventListener callback,
      final boolean useCapture) {
    addEventListener( "keydown", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "keydown", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "keypress", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "keypress", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "keyup", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "keyup", Js.cast( callback ), useCapture );
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
  public final void addTouchcancelListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchcancelListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    addEventListener( "touchcancel", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "touchcancel", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "touchend", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "touchend", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "touchmove", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "touchmove", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "touchstart", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "touchstart", Js.cast( callback ), useCapture );
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
  public final void addWheelListener(@Nonnull final WheelEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "wheel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addWheelListener(@Nonnull final WheelEventListener callback,
      final boolean useCapture) {
    addEventListener( "wheel", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "wheel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeWheelListener(@Nonnull final WheelEventListener callback) {
    removeEventListener( "wheel", Js.cast( callback ) );
  }
}
