package elemental3;

import elemental3.core.AtomicsNamespace;
import elemental3.core.JsArray;
import elemental3.core.JsMathNamespace;
import elemental3.indexeddb.IDBFactory;
import elemental3.promise.Promise;
import elemental3.speech.SpeechSynthesis;
import elemental3.svg.SVGImageElement;
import elemental3.wasm.WebAssemblyNamespace;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Any;
import jsinterop.base.Js;

/**
 * Accessor for the global <b>globalThis</b> property also know as the global object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/globalThis">globalThis - MDN</a>
 */
@Generated("org.realityforge.webtack")
public final class Global {
  private static GlobalWindow globalThis;

  private Global() {
  }

  /**
   * Accessor for the global <b>globalThis</b> property contains the global <i>this</i> value, which is akin to the global object.
   *
   * @return the global object
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/globalThis">globalThis - MDN</a>
   */
  @Nonnull
  public static GlobalWindow globalThis() {
    return Js.uncheckedCast( Js.global() );
  }

  /**
   * Returns a reference to the application cache object for the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/applicationCache">Window.applicationCache - MDN</a>
   */
  @Nonnull
  public static ApplicationCache applicationCache() {
    return globalThis().applicationCache();
  }

  /**
   * The caches read-only property of the WindowOrWorkerGlobalScope interface returns the CacheStorage object associated with the current context. This object enables functionality such as storing assets for offline use, and generating custom responses to requests.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/caches">Window.caches - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#self-caches">The definition of 'caches' in the 'Service Workers' specification.</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/">Service Workers</a>
   */
  @Nonnull
  public static CacheStorage caches() {
    return globalThis().caches();
  }

  /**
   * The Window.closed read-only property indicates whether the referenced window is closed or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/closed">Window.closed - MDN</a>
   */
  public static boolean closed() {
    return globalThis().closed();
  }

  /**
   * The crossOriginIsolated read-only property of the WindowOrWorkerGlobalScope interface returns a boolean value that indicates whether a SharedArrayBuffer can be sent via a Window.postMessage() call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/crossOriginIsolated">WindowOrWorkerGlobalScope.crossOriginIsolated - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-crossoriginisolated">The definition of 'crossOriginIsolated' in the 'HTML Living Standard' specification.</a>
   */
  public static boolean crossOriginIsolated() {
    return globalThis().crossOriginIsolated();
  }

  /**
   * The read-only Window.crypto property returns the Crypto object associated to the global object. This object allows web pages access to certain cryptographic related services.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/crypto">Window.crypto - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-GlobalCrypto">The definition of 'Window.crypto' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public static Crypto crypto() {
    return globalThis().crypto();
  }

  /**
   * The customElements read-only property of the Window interface returns a reference to the CustomElementRegistry object, which can be used to register new custom elements and get information about previously registered custom elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/customElements">Window.customElements - MDN</a>
   */
  @Nonnull
  public static CustomElementRegistry customElements() {
    return globalThis().customElements();
  }

  /**
   * The devicePixelRatio of Window interface returns the ratio of the resolution in physical pixels to the resolution in CSS pixels for the current display device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio">Window.devicePixelRatio - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-devicepixelratio">The definition of 'Window.devicePixelRatio' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public static double devicePixelRatio() {
    return globalThis().devicePixelRatio();
  }

  /**
   * window.document returns a reference to the document contained in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/document">Window.document - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-2">The definition of 'Window.document' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-document-0">The definition of 'Window.document' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static Document document() {
    return globalThis().document();
  }

  /**
   * The read-only Window property event returns the Event which is currently being handled by the site's code. Outside the context of an event handler, the value is always undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/event">Window.event - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-window-event">The definition of 'Window.event' in the 'DOM' specification.</a>
   */
  @Nullable
  public static Any event() {
    return globalThis().event();
  }

  @Nonnull
  public static External external() {
    return globalThis().external();
  }

  /**
   * The Window.frameElement property returns the element (such as iframe or object) in which the window is embedded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/frameElement">Window.frameElement - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-frameelement">The definition of 'Window.frameElement' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static Element frameElement() {
    return globalThis().frameElement();
  }

  /**
   * Returns the window itself, which is an array-like object, listing the direct sub-frames of the current window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/frames">Window.frames - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-frames">The definition of 'Window.frames' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-frames">The definition of 'Window.frames' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static Window frames() {
    return globalThis().frames();
  }

  /**
   * The Window.history read-only property returns a reference to the History object, which provides an interface for manipulating the browser session history (pages visited in the tab or frame that the current page is loaded in).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/history">Window.history - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#the-history-interface">The definition of 'The History interface' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#the-history-interface">The definition of 'The History interface' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static History history() {
    return globalThis().history();
  }

  /**
   * The indexedDB read-only property of the WindowOrWorkerGlobalScope mixin provides a mechanism for applications to asynchronously access the capabilities of indexed databases.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/indexedDB">Window.indexedDB - MDN</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-windoworworkerglobalscope-indexeddb">The definition of 'indexedDB' in the 'Indexed Database API Draft' specification.</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-windoworworkerglobalscope-indexeddb">The definition of 'indexedDB' in the 'Indexed Database API 2.0' specification.</a>
   */
  @Nonnull
  public static IDBFactory indexedDB() {
    return globalThis().indexedDB();
  }

  /**
   * The read-only innerHeight property of the Window interface returns the interior height of the window in pixels, including the height of the horizontal scroll bar, if present.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/innerHeight">Window.innerHeight - MDN</a>
   */
  public static int innerHeight() {
    return globalThis().innerHeight();
  }

  /**
   * The read-only Window property innerWidth returns the interior width of the window in pixels. This includes the width of the vertical scroll bar, if one is present.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/innerWidth">Window.innerWidth - MDN</a>
   */
  public static int innerWidth() {
    return globalThis().innerWidth();
  }

  /**
   * The window.isSecureContext read-only property indicates whether a context is capable of using features that require secure contexts.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/isSecureContext">Window.isSecureContext - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-secure-contexts/">Secure Contexts</a>
   */
  public static boolean isSecureContext() {
    return globalThis().isSecureContext();
  }

  /**
   * Returns the number of frames (either frame or iframe elements) in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/length">Window.length - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-length">The definition of 'Window.length' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-length">The definition of 'Window.length' in the 'HTML5' specification.</a>
   */
  public static int length() {
    return globalThis().length();
  }

  /**
   * The read-only localStorage property allows you to access a Storage object for the Document's origin; the stored data is saved across browser sessions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/localStorage">Window.localStorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-localstorage">The definition of 'localStorage' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Storage localStorage() {
    return globalThis().localStorage();
  }

  /**
   * The Window.location read-only property returns a Location object with information about the current location of the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/location">Window.location - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/history.html#the-location-interface">The definition of 'Window.location' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#the-location-interface">The definition of 'Window.location' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static Location location() {
    return globalThis().location();
  }

  /**
   * Returns the locationbar object, whose visibility can be checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/locationbar">Window.locationbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-locationbar">The definition of 'Window.locationbar' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-locationbar">The definition of 'Window.locationbar' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static BarProp locationbar() {
    return globalThis().locationbar();
  }

  /**
   * The Window.menubar property returns the menubar object, whose visibility can be checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/menubar">Window.menubar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-menubar">The definition of 'Window.menubar' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-menubar">The definition of 'Window.menubar' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static BarProp menubar() {
    return globalThis().menubar();
  }

  /**
   * The Window.name property gets/sets the name of the window's browsing context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/name">Window.name - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-name">The definition of 'Window.name' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-name">The definition of 'Window.name' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static String name() {
    return globalThis().name;
  }

  /**
   * The Window.navigator read-only property returns a reference to the Navigator object, which has methods and properties about the application running the script.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/navigator">Window.navigator - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator">The definition of 'Window: navigator' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Navigator navigator() {
    return globalThis().navigator();
  }

  /**
   * The onabort property of the GlobalEventHandlers mixin is the EventHandler for processing abort events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onabort">Window.onabort - MDN</a>
   */
  @Nullable
  public static EventHandler onabort() {
    return globalThis().onabort;
  }

  /**
   * The onafterprint property of the WindowEventHandlers mixin is the EventHandler for processing afterprint events for the current window. These events are raised after the user prints, or if they abort the print dialog.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onafterprint">Window.onafterprint - MDN</a>
   */
  @Nullable
  public static EventHandler onafterprint() {
    return globalThis().onafterprint;
  }

  /**
   * The onanimationcancel property of the GlobalEventHandlers mixin is the EventHandler for processing animationcancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationcancel">GlobalEventHandlers.onanimationcancel - MDN</a>
   */
  @Nullable
  public static AnimationEventHandler onanimationcancel() {
    return globalThis().onanimationcancel;
  }

  /**
   * The onanimationend property of the GlobalEventHandlers mixin is the EventHandler for processing animationend events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationend">GlobalEventHandlers.onanimationend - MDN</a>
   */
  @Nullable
  public static AnimationEventHandler onanimationend() {
    return globalThis().onanimationend;
  }

  /**
   * The onanimationiteration property of the GlobalEventHandlers mixin is the EventHandler for processing animationiteration events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationiteration">GlobalEventHandlers.onanimationiteration - MDN</a>
   */
  @Nullable
  public static AnimationEventHandler onanimationiteration() {
    return globalThis().onanimationiteration;
  }

  /**
   * An event handler for the animationstart event. This event is sent when a CSS Animation starts to play.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationstart">GlobalEventHandlers.onanimationstart - MDN</a>
   */
  @Nullable
  public static AnimationEventHandler onanimationstart() {
    return globalThis().onanimationstart;
  }

  /**
   * The onauxclick property of the GlobalEventHandlers mixin is an EventHandler for processing auxclick events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onauxclick">GlobalEventHandlers.onauxclick - MDN</a>
   * @see <a href="https://w3c.github.io/uievents/#event-type-auxclick">The definition of 'onauxclick' in the 'UI Events' specification.</a>
   */
  @Nullable
  public static EventHandler onauxclick() {
    return globalThis().onauxclick;
  }

  /**
   * The onbeforeprint property of the WindowEventHandlers mixin is the EventHandler for processing beforeprint events for the current window. These events are raised before the print dialog window is opened.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onbeforeprint">Window.onbeforeprint - MDN</a>
   */
  @Nullable
  public static EventHandler onbeforeprint() {
    return globalThis().onbeforeprint;
  }

  /**
   * The onbeforeunload property of the WindowEventHandlers mixin is the EventHandler for processing beforeunload events. These events fire when a window is about to unload its resources. At this point, the document is still visible and the event is still cancelable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onbeforeunload">Window.onbeforeunload - MDN</a>
   */
  @Nullable
  public static OnBeforeUnloadEventHandler onbeforeunload() {
    return globalThis().onbeforeunload;
  }

  /**
   * The onblur property of the GlobalEventHandlers mixin is the EventHandler for processing blur events. It's available on Element, Document, and Window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onblur">Window.onblur - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onblur">The definition of 'onblur' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static FocusEventHandler onblur() {
    return globalThis().onblur;
  }

  /**
   * The oncancel property of the GlobalEventHandlers mixin is an EventHandler for processing cancel events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncancel">GlobalEventHandlers.oncancel - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-oncancel">The definition of 'oncancel' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler oncancel() {
    return globalThis().oncancel;
  }

  /**
   * The oncanplay property of the GlobalEventHandlers mixin is the EventHandler for processing canplay events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncanplay">GlobalEventHandlers.oncanplay - MDN</a>
   */
  @Nullable
  public static EventHandler oncanplay() {
    return globalThis().oncanplay;
  }

  /**
   * The oncanplaythrough property of the GlobalEventHandlers mixin is the EventHandler for processing canplaythrough events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncanplaythrough">GlobalEventHandlers.oncanplaythrough - MDN</a>
   */
  @Nullable
  public static EventHandler oncanplaythrough() {
    return globalThis().oncanplaythrough;
  }

  /**
   * The onchange property of the GlobalEventHandlers mixin is an EventHandler for processing change events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onchange">Window.onchange - MDN</a>
   */
  @Nullable
  public static EventHandler onchange() {
    return globalThis().onchange;
  }

  /**
   * The onclick property of the GlobalEventHandlers mixin is the EventHandler for processing click events on a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onclick">Window.onclick - MDN</a>
   */
  @Nullable
  public static EventHandler onclick() {
    return globalThis().onclick;
  }

  /**
   * The onclose property of the GlobalEventHandlers mixin is an EventHandler for processing close events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclose">GlobalEventHandlers.onclose - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onclose">The definition of 'onclose' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler onclose() {
    return globalThis().onclose;
  }

  @Nullable
  public static EventHandler oncompassneedscalibration() {
    return globalThis().oncompassneedscalibration;
  }

  /**
   * The oncontextmenu property of the GlobalEventHandlers mixin is an EventHandler that processes contextmenu events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/oncontextmenu">Window.oncontextmenu - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-oncontextmenu">The definition of 'oncontextmenu' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler oncontextmenu() {
    return globalThis().oncontextmenu;
  }

  /**
   * The oncuechange property of the GlobalEventHandlers mixin is the EventHandler for processing cuechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncuechange">GlobalEventHandlers.oncuechange - MDN</a>
   */
  @Nullable
  public static EventHandler oncuechange() {
    return globalThis().oncuechange;
  }

  /**
   * The ondblclick property of the GlobalEventHandlers mixin is an EventHandler that processes dblclick events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondblclick">Window.ondblclick - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-ondblclick">The definition of 'ondblclick' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler ondblclick() {
    return globalThis().ondblclick;
  }

  /**
   * An event handler for the devicemotion events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondevicemotion">Window.ondevicemotion - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @Nullable
  public static DeviceMotionEventHandler ondevicemotion() {
    return globalThis().ondevicemotion;
  }

  /**
   * An event handler for the deviceorientation event, which contains information about a relative device orientation change.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondeviceorientation">Window.ondeviceorientation - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @Nullable
  public static DeviceOrientationEventHandler ondeviceorientation() {
    return globalThis().ondeviceorientation;
  }

  /**
   * An event handler for the deviceorientationabsolute event containing information about an absolute device orientation change.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondeviceorientationabsolute">Window.ondeviceorientationabsolute - MDN</a>
   */
  @Nullable
  public static EventHandler ondeviceorientationabsolute() {
    return globalThis().ondeviceorientationabsolute;
  }

  /**
   * A global event handler for the drag event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrag">GlobalEventHandlers.ondrag - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondrag">The definition of 'ondrag' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondrag">The definition of 'ondrag' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public static EventHandler ondrag() {
    return globalThis().ondrag;
  }

  /**
   * A global event handler for the dragend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragend">GlobalEventHandlers.ondragend - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragend">The definition of 'ondragend' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragend">The definition of 'ondragend' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public static EventHandler ondragend() {
    return globalThis().ondragend;
  }

  /**
   * A global event handler for the dragenter event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragenter">GlobalEventHandlers.ondragenter - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragenter">The definition of 'ondragenter' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragenter">The definition of 'ondragenter' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public static EventHandler ondragenter() {
    return globalThis().ondragenter;
  }

  /**
   * A global event handler for the dragleave event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragleave">GlobalEventHandlers.ondragleave - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragleave">The definition of 'ondragleave' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragleave">The definition of 'ondragleave' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public static EventHandler ondragleave() {
    return globalThis().ondragleave;
  }

  /**
   * A global event handler for the dragover event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragover">GlobalEventHandlers.ondragover - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragover">The definition of 'ondragover' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragover">The definition of 'ondragover' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public static EventHandler ondragover() {
    return globalThis().ondragover;
  }

  /**
   * A global event handler for the dragstart event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragstart">GlobalEventHandlers.ondragstart - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondragstart">The definition of 'ondragstart' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondragstart">The definition of 'ondragstart' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public static EventHandler ondragstart() {
    return globalThis().ondragstart;
  }

  /**
   * A global event handler for the drop event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrop">GlobalEventHandlers.ondrop - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/indices.html#ix-handler-ondrop">The definition of 'ondrop' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/index.html#ix-handler-ondrop">The definition of 'ondrop' in the 'HTML 5.1' specification.</a>
   */
  @Nullable
  public static EventHandler ondrop() {
    return globalThis().ondrop;
  }

  /**
   * The ondurationchange property of the GlobalEventHandlers mixin is the EventHandler for processing durationchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondurationchange">GlobalEventHandlers.ondurationchange - MDN</a>
   */
  @Nullable
  public static EventHandler ondurationchange() {
    return globalThis().ondurationchange;
  }

  /**
   * The onemptied property sets and returns the event handler for the emptied event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onemptied">GlobalEventHandlers.onemptied - MDN</a>
   */
  @Nullable
  public static EventHandler onemptied() {
    return globalThis().onemptied;
  }

  /**
   * The onended property of the GlobalEventHandlers mixin is the EventHandler for processing ended events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onended">GlobalEventHandlers.onended - MDN</a>
   */
  @Nullable
  public static EventHandler onended() {
    return globalThis().onended;
  }

  /**
   * The onerror property of the GlobalEventHandlers mixin is an EventHandler that processes error events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onerror">GlobalEventHandlers.onerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onerror">The definition of 'onerror' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static OnErrorEventHandler onerror() {
    return globalThis().onerror;
  }

  /**
   * The onfocus property of the GlobalEventHandlers mixin is an EventHandler that processes focus events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onfocus">Window.onfocus - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onfocus">The definition of 'onfocus' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static FocusEventHandler onfocus() {
    return globalThis().onfocus;
  }

  /**
   * The onformdata property of the GlobalEventHandlers mixin is the EventHandler for processing formdata events, fired after the entry list representing the form's data is constructed. This happens when the form is submitted, but can also be triggered by the invocation of a FormData() constructor. onformdata is available on HTMLFormElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onformdata">GlobalEventHandlers.onformdata - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onformdata">The definition of 'onformdata' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler onformdata() {
    return globalThis().onformdata;
  }

  /**
   * The ongotpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes gotpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ongotpointercapture">GlobalEventHandlers.ongotpointercapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#the-gotpointercapture-event">The definition of 'ongotpointercapture' in the 'Pointer Events &ndash; Level 2' specification.</a>
   */
  @Nullable
  public static EventHandler ongotpointercapture() {
    return globalThis().ongotpointercapture;
  }

  /**
   * The WindowEventHandlers.onhashchange property of the WindowEventHandlers mixin is the EventHandler for processing hashchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onhashchange">Window.onhashchange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onhashchange">The definition of 'onhashchange' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML5' specification.</a>
   */
  @Nullable
  public static HashChangeEventHandler onhashchange() {
    return globalThis().onhashchange;
  }

  /**
   * The onkeydown property of the GlobalEventHandlers mixin is an EventHandler that processes keydown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/oninput">Window.oninput - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeydown">The definition of 'onkeydown' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler oninput() {
    return globalThis().oninput;
  }

  /**
   * The oninvalid property of the GlobalEventHandlers mixin is an EventHandler that processes invalid events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oninvalid">GlobalEventHandlers.oninvalid - MDN</a>
   */
  @Nullable
  public static EventHandler oninvalid() {
    return globalThis().oninvalid;
  }

  /**
   * The onkeydown property of the GlobalEventHandlers mixin is an EventHandler that processes keydown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onkeydown">Window.onkeydown - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeydown">The definition of 'onkeydown' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler onkeydown() {
    return globalThis().onkeydown;
  }

  /**
   * The onkeypress property of the GlobalEventHandlers mixin is an EventHandler that processes keypress events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onkeypress">Window.onkeypress - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeypress">The definition of 'onkeypress' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler onkeypress() {
    return globalThis().onkeypress;
  }

  /**
   * The onkeyup property of the GlobalEventHandlers mixin is an EventHandler that processes keyup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onkeyup">Window.onkeyup - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onkeyup">The definition of 'onkeyup' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler onkeyup() {
    return globalThis().onkeyup;
  }

  /**
   * The onlanguagechange property of the WindowEventHandlers mixin is the EventHandler for processing languagechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onlanguagechange">Window.onlanguagechange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onlanguagechange">The definition of 'WindowEventHandler.onlanguagechange' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler onlanguagechange() {
    return globalThis().onlanguagechange;
  }

  /**
   * The onload property of the GlobalEventHandlers mixin is an EventHandler that processes load events on a Window, XMLHttpRequest, img element, etc.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onload">Window.onload - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onload">The definition of 'onload' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler onload() {
    return globalThis().onload;
  }

  /**
   * The onloadeddata property of the GlobalEventHandlers mixin is the EventHandler for processing loadeddata events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadeddata">GlobalEventHandlers.onloadeddata - MDN</a>
   */
  @Nullable
  public static EventHandler onloadeddata() {
    return globalThis().onloadeddata;
  }

  /**
   * The onloadedmetadata property of the GlobalEventHandlers mixin is the EventHandler for processing loadedmetadata events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadedmetadata">GlobalEventHandlers.onloadedmetadata - MDN</a>
   */
  @Nullable
  public static EventHandler onloadedmetadata() {
    return globalThis().onloadedmetadata;
  }

  /**
   * The onloadstart property of the GlobalEventHandlers mixin is an EventHandler representing the code to be called when the loadstart event is raised (when progress has begun on the loading of a resource.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadstart">GlobalEventHandlers.onloadstart - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onloadstart">The definition of 'onloadstart' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler onloadstart() {
    return globalThis().onloadstart;
  }

  /**
   * The onlostpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes lostpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onlostpointercapture">GlobalEventHandlers.onlostpointercapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#the-lostpointercapture-event">The definition of 'onlostpointercapture' in the 'Pointer Events &ndash; Level 2' specification.</a>
   */
  @Nullable
  public static EventHandler onlostpointercapture() {
    return globalThis().onlostpointercapture;
  }

  /**
   * The onmessage property of the WindowEventHandlers mixin is the EventHandler called whenever an object receives a message event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessage">WindowEventHandlers.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessage">The definition of 'onmessage' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static MessageEventHandler onmessage() {
    return globalThis().onmessage;
  }

  /**
   * The onmessageerror event handler of the WindowEventHandlers interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on a window&mdash;that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessageerror">WindowEventHandlers.onmessageerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onmessageerror">The definition of 'onmessageerror' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static MessageEventHandler onmessageerror() {
    return globalThis().onmessageerror;
  }

  /**
   * The onmousedown property of the GlobalEventHandlers mixin is an EventHandler that processes mousedown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmousedown">Window.onmousedown - MDN</a>
   */
  @Nullable
  public static EventHandler onmousedown() {
    return globalThis().onmousedown;
  }

  /**
   * The onmouseenter property of the GlobalEventHandlers mixin is the EventHandler for processing mouseenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseenter">GlobalEventHandlers.onmouseenter - MDN</a>
   */
  @Nullable
  public static EventHandler onmouseenter() {
    return globalThis().onmouseenter;
  }

  /**
   * The onmouseleave property of the GlobalEventHandlers mixin is the EventHandler for processing mouseleave events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseleave">GlobalEventHandlers.onmouseleave - MDN</a>
   */
  @Nullable
  public static EventHandler onmouseleave() {
    return globalThis().onmouseleave;
  }

  /**
   * The onmousemove property of the GlobalEventHandlers mixin is an EventHandler that processes mousemove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmousemove">Window.onmousemove - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onmousemove">The definition of 'onmousemove' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler onmousemove() {
    return globalThis().onmousemove;
  }

  /**
   * The onmouseout property of the GlobalEventHandlers mixin is an EventHandler that processes mouseout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmouseout">Window.onmouseout - MDN</a>
   */
  @Nullable
  public static EventHandler onmouseout() {
    return globalThis().onmouseout;
  }

  /**
   * The onmouseover property of the GlobalEventHandlers mixin is an EventHandler that processes mouseover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmouseover">Window.onmouseover - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onmouseover">The definition of 'onmouseover' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler onmouseover() {
    return globalThis().onmouseover;
  }

  /**
   * The onmouseup property of the GlobalEventHandlers mixin is an EventHandler that processes mouseup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onmouseup">Window.onmouseup - MDN</a>
   */
  @Nullable
  public static EventHandler onmouseup() {
    return globalThis().onmouseup;
  }

  @Nullable
  public static EventHandler onoffline() {
    return globalThis().onoffline;
  }

  @Nullable
  public static EventHandler ononline() {
    return globalThis().ononline;
  }

  @Nullable
  public static EventHandler onorientationchange() {
    return globalThis().onorientationchange;
  }

  @Nullable
  public static PageTransitionEventHandler onpagehide() {
    return globalThis().onpagehide;
  }

  @Nullable
  public static PageTransitionEventHandler onpageshow() {
    return globalThis().onpageshow;
  }

  /**
   * The onpause property of the GlobalEventHandlers mixin is the EventHandler for processing pause events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpause">GlobalEventHandlers.onpause - MDN</a>
   */
  @Nullable
  public static EventHandler onpause() {
    return globalThis().onpause;
  }

  /**
   * The onplay property of the GlobalEventHandlers mixin is the EventHandler for processing play events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onplay">GlobalEventHandlers.onplay - MDN</a>
   */
  @Nullable
  public static EventHandler onplay() {
    return globalThis().onplay;
  }

  /**
   * The onplaying property of the GlobalEventHandlers mixin is the EventHandler for processing playing events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onplaying">GlobalEventHandlers.onplaying - MDN</a>
   */
  @Nullable
  public static EventHandler onplaying() {
    return globalThis().onplaying;
  }

  /**
   * The onpointercancel property of the GlobalEventHandlers mixin is an EventHandler that processes pointercancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointercancel">GlobalEventHandlers.onpointercancel - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointercancel">The definition of 'onpointercancel' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointercancel">The definition of 'onpointercancel' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public static EventHandler onpointercancel() {
    return globalThis().onpointercancel;
  }

  /**
   * The GlobalEventHandlers event handler onpointerdown is used to specify the event handler for the pointerdown event, which is fired when the pointing device is initially pressed. This event can be sent to Window, Document, and Element objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerdown">GlobalEventHandlers.onpointerdown - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerdown">The definition of 'onpointerdown' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerdown">The definition of 'onpointerdown' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public static EventHandler onpointerdown() {
    return globalThis().onpointerdown;
  }

  /**
   * The onpointerenter property of the GlobalEventHandlers mixin is an EventHandler that processes pointerenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerenter">GlobalEventHandlers.onpointerenter - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerenter">The definition of 'onpointerenter' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerenter">The definition of 'onpointerenter' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public static EventHandler onpointerenter() {
    return globalThis().onpointerenter;
  }

  /**
   * The global event handler for the pointerleave event, which is delivered to a Node when the pointer (mouse cursor, fingertip, etc.) exits its hit test area (for example, if the cursor exits an Element or Window's content area). This event is part of the Pointer Events API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerleave">GlobalEventHandlers.onpointerleave - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerleave">The definition of 'onpointerleave' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerleave">The definition of 'onpointerleave' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public static EventHandler onpointerleave() {
    return globalThis().onpointerleave;
  }

  /**
   * The onpointermove property of the GlobalEventHandlers mixin is an EventHandler that processes pointermove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointermove">GlobalEventHandlers.onpointermove - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointermove">The definition of 'onpointermove' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointermove">The definition of 'onpointermove' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public static EventHandler onpointermove() {
    return globalThis().onpointermove;
  }

  /**
   * The onpointerout property of the GlobalEventHandlers mixin is an EventHandler that processes pointerout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerout">GlobalEventHandlers.onpointerout - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerout">The definition of 'onpointerout' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerout">The definition of 'onpointerout' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public static EventHandler onpointerout() {
    return globalThis().onpointerout;
  }

  /**
   * The onpointerover property of the GlobalEventHandlers mixin is an EventHandler that processes pointerover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerover">GlobalEventHandlers.onpointerover - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerover">The definition of 'onpointerover' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerover">The definition of 'onpointerover' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public static EventHandler onpointerover() {
    return globalThis().onpointerover;
  }

  /**
   * The onpointerup property of the GlobalEventHandlers mixin is an EventHandler that processes pointerup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerup">GlobalEventHandlers.onpointerup - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-globaleventhandlers-onpointerup">The definition of 'onpointerup' in the 'Pointer Events &ndash; Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-GlobalEventHandlers-onpointerup">The definition of 'onpointerup' in the 'Pointer Events' specification.</a>
   */
  @Nullable
  public static EventHandler onpointerup() {
    return globalThis().onpointerup;
  }

  /**
   * The onpopstate property of the WindowEventHandlers mixin is the EventHandler for processing popstate events on the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onpopstate">Window.onpopstate - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onpopstate">The definition of 'onpopstate' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler onpopstate() {
    return globalThis().onpopstate;
  }

  @Nullable
  public static EventHandler onprogress() {
    return globalThis().onprogress;
  }

  @Nullable
  public static EventHandler onratechange() {
    return globalThis().onratechange;
  }

  /**
   * The onrejectionhandled property of the WindowEventHandlers mixin is the EventHandler for processing rejectionhandled events. These events are raised when Promises are rejected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onrejectionhandled">Window.onrejectionhandled - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onrejectionhandled">The definition of 'onrejectionhandled' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static PromiseRejectionEventHandler onrejectionhandled() {
    return globalThis().onrejectionhandled;
  }

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onreset">Window.onreset - MDN</a>
   */
  @Nullable
  public static EventHandler onreset() {
    return globalThis().onreset;
  }

  /**
   * The onresize property of the GlobalEventHandlers interface is an EventHandler that processes resize events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onresize">Window.onresize - MDN</a>
   */
  @Nullable
  public static UIEventHandler onresize() {
    return globalThis().onresize;
  }

  /**
   * The onscroll property of the GlobalEventHandlers mixin is an EventHandler that processes scroll events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onscroll">Window.onscroll - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-onscroll">The definition of 'onscroll' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#event-type-scroll">The definition of 'onscroll' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
   */
  @Nullable
  public static EventHandler onscroll() {
    return globalThis().onscroll;
  }

  @Nullable
  public static EventHandler onsecuritypolicyviolation() {
    return globalThis().onsecuritypolicyviolation;
  }

  @Nullable
  public static EventHandler onseeked() {
    return globalThis().onseeked;
  }

  @Nullable
  public static EventHandler onseeking() {
    return globalThis().onseeking;
  }

  /**
   * The onselect property of the GlobalEventHandlers mixin is an EventHandler that processes select events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onselect">Window.onselect - MDN</a>
   */
  @Nullable
  public static EventHandler onselect() {
    return globalThis().onselect;
  }

  /**
   * The onselectionchange property of the GlobalEventHandlers mixin is an EventHandler that processes selectionchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectionchange">GlobalEventHandlers.onselectionchange - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-globaleventhandlers-onselectionchange">The definition of 'GlobalEventHandlers.onselectionchange' in the 'Selection API' specification.</a>
   */
  @Nullable
  public static EventHandler onselectionchange() {
    return globalThis().onselectionchange;
  }

  /**
   * The onselectstart property of the GlobalEventHandlers mixin is an EventHandler that processes selectstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectstart">GlobalEventHandlers.onselectstart - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-globaleventhandlers-onselectstart">The definition of 'GlobalEventHandlers.onselectstart' in the 'Selection API' specification.</a>
   */
  @Nullable
  public static EventHandler onselectstart() {
    return globalThis().onselectstart;
  }

  @Nullable
  public static EventHandler onslotchange() {
    return globalThis().onslotchange;
  }

  @Nullable
  public static EventHandler onstalled() {
    return globalThis().onstalled;
  }

  /**
   * The onstorage property of the WindowEventHandlers mixin is an EventHandler for processing storage events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onstorage">Window.onstorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onstorage">The definition of 'onstorage' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static StorageEventHandler onstorage() {
    return globalThis().onstorage;
  }

  /**
   * The onsubmit property of the GlobalEventHandlers mixin is an EventHandler that processes submit events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onsubmit">Window.onsubmit - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onsubmit">The definition of 'onsubmit' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static EventHandler onsubmit() {
    return globalThis().onsubmit;
  }

  @Nullable
  public static EventHandler onsuspend() {
    return globalThis().onsuspend;
  }

  @Nullable
  public static EventHandler ontimeupdate() {
    return globalThis().ontimeupdate;
  }

  @Nullable
  public static EventHandler ontoggle() {
    return globalThis().ontoggle;
  }

  /**
   * The ontouchcancel property of the GlobalEventHandlers mixin is an EventHandler that processes touchcancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchcancel">GlobalEventHandlers.ontouchcancel - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchcancel">Touch Events – Level 2</a>
   */
  @Nullable
  public static EventHandler ontouchcancel() {
    return globalThis().ontouchcancel;
  }

  /**
   * A global event handler for the touchend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchend">GlobalEventHandlers.ontouchend - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchend">Touch Events – Level 2</a>
   */
  @Nullable
  public static EventHandler ontouchend() {
    return globalThis().ontouchend;
  }

  /**
   * A global event handler for the touchmove event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchmove">GlobalEventHandlers.ontouchmove - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchmove">Touch Events – Level 2</a>
   */
  @Nullable
  public static EventHandler ontouchmove() {
    return globalThis().ontouchmove;
  }

  /**
   * The ontouchstart property of the GlobalEventHandlers mixin is an EventHandler that processes touchstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchstart">GlobalEventHandlers.ontouchstart - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-globaleventhandlers-ontouchstart">Touch Events – Level 2</a>
   */
  @Nullable
  public static EventHandler ontouchstart() {
    return globalThis().ontouchstart;
  }

  /**
   * The ontransitioncancel property of the GlobalEventHandlers mixin is an EventHandler that processes transitioncancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitioncancel">GlobalEventHandlers.ontransitioncancel - MDN</a>
   */
  @Nullable
  public static TransitionEventHandler ontransitioncancel() {
    return globalThis().ontransitioncancel;
  }

  /**
   * The ontransitionend property of the GlobalEventHandlers mixin is an EventHandler that processes transitionend events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitionend">GlobalEventHandlers.ontransitionend - MDN</a>
   */
  @Nullable
  public static TransitionEventHandler ontransitionend() {
    return globalThis().ontransitionend;
  }

  @Nullable
  public static TransitionEventHandler ontransitionrun() {
    return globalThis().ontransitionrun;
  }

  @Nullable
  public static TransitionEventHandler ontransitionstart() {
    return globalThis().ontransitionstart;
  }

  /**
   * The onunhandledrejection property of the WindowEventHandlers mixin is the EventHandler for processing unhandledrejection events. These events are raised for unhandled Promise rejections.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onunhandledrejection">Window.onunhandledrejection - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-window-onunhandledrejection">The definition of 'onunhandledrejection' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static PromiseRejectionEventHandler onunhandledrejection() {
    return globalThis().onunhandledrejection;
  }

  /**
   * The onunload property of the WindowEventHandlers mixin is the EventHandler for processing unload events. These events fire when the window is unloading its content and resources. The resource removal is processed after the unload event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onunload">Window.onunload - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-window-onunload">The definition of 'onunload' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/#windoweventhandlers">The definition of 'GlobalEventHandlers' in the 'HTML5' specification.</a>
   */
  @Nullable
  public static EventHandler onunload() {
    return globalThis().onunload;
  }

  @Nullable
  public static EventHandler onvolumechange() {
    return globalThis().onvolumechange;
  }

  @Nullable
  public static EventHandler onwaiting() {
    return globalThis().onwaiting;
  }

  @Nullable
  public static EventHandler onwebkitanimationend() {
    return globalThis().onwebkitanimationend;
  }

  @Nullable
  public static EventHandler onwebkitanimationiteration() {
    return globalThis().onwebkitanimationiteration;
  }

  @Nullable
  public static EventHandler onwebkitanimationstart() {
    return globalThis().onwebkitanimationstart;
  }

  @Nullable
  public static EventHandler onwebkittransitionend() {
    return globalThis().onwebkittransitionend;
  }

  /**
   * The onwheel property of the GlobalEventHandlers mixin is an EventHandler that processes wheel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onwheel">GlobalEventHandlers.onwheel - MDN</a>
   */
  @Nullable
  public static EventHandler onwheel() {
    return globalThis().onwheel;
  }

  /**
   * The Window interface's opener property returns a reference to the window that opened the window, either with open(), or by navigating a link with a target attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/opener">Window.opener - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-opener">The definition of 'window.opener' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static Any opener() {
    return globalThis().opener;
  }

  public static short orientation() {
    return globalThis().orientation();
  }

  /**
   * The origin read-only property of the WindowOrWorkerGlobalScope interface returns the origin of the global scope, serialized as a string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/origin">WindowOrWorkerGlobalScope.origin - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-origin">The definition of 'WindowOrWorkerGlobalScope.origin' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static String origin() {
    return globalThis().origin();
  }

  public static boolean originIsolated() {
    return globalThis().originIsolated();
  }

  /**
   * The Window.outerHeight read-only property returns the height in pixels of the whole browser window, including any sidebar, window chrome, and window-resizing borders/handles.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/outerHeight">Window.outerHeight - MDN</a>
   */
  public static int outerHeight() {
    return globalThis().outerHeight();
  }

  /**
   * Window.outerWidth read-only property returns the width of the outside of the browser window. It represents the width of the whole browser window including sidebar (if expanded), window chrome and window resizing borders/handles.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/outerWidth">Window.outerWidth - MDN</a>
   */
  public static int outerWidth() {
    return globalThis().outerWidth();
  }

  /**
   * The read-only Window property pageXOffset is an alias for scrollX.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/pageXOffset">Window.pageXOffset - MDN</a>
   */
  public static double pageXOffset() {
    return globalThis().pageXOffset();
  }

  /**
   * The read-only Window property pageYOffset is an alias for scrollY; as such, it returns the number of pixels the document is currently scrolled along the vertical axis (that is, up or down) with a value of 0.0, indicating that the top edge of the Document is currently aligned with the top edge of the window's content area.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/pageYOffset">Window.pageYOffset - MDN</a>
   */
  public static double pageYOffset() {
    return globalThis().pageYOffset();
  }

  /**
   * The Window.parent property is a reference to the parent of the current window or subframe.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/parent">Window.parent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-parent">The definition of 'window.parent' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public static Window parent() {
    return globalThis().parent();
  }

  /**
   * The Window interface's performance property returns a Performance object, which can be used to gather performance information about the current document. It serves as the point of exposure for the Performance Timeline API, the High Resolution Time API, the Navigation Timing API, the User Timing API, and the Resource Timing API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/performance">Window.performance - MDN</a>
   * @see <a href="https://www.w3.org/TR/hr-time-1/#performance">The definition of 'window.performance' in the 'High Resolution Time' specification.</a>
   */
  @Nonnull
  public static Performance performance() {
    return globalThis().performance();
  }

  /**
   * Returns the personalbar object, whose visibility can be toggled in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/personalbar">Window.personalbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-personalbar">The definition of 'Window.personalbar' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-personalbar">The definition of 'Window.personalbar' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static BarProp personalbar() {
    return globalThis().personalbar();
  }

  /**
   * The Window property screen returns a reference to the screen object associated with the window. The screen object, implementing the Screen interface, is a special object for inspecting properties of the screen on which the current window is being rendered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screen">Window.screen - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screen">The definition of 'window.screen' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @Nonnull
  public static Screen screen() {
    return globalThis().screen();
  }

  /**
   * The Window.screenLeft read-only property returns the horizontal distance, in CSS pixels, from the left border of the user's browser viewport to the left side of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenLeft">Window.screenLeft - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screenx">The definition of 'Window.screenLeft' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public static int screenLeft() {
    return globalThis().screenLeft();
  }

  /**
   * The Window.screenTop read-only property returns the vertical distance, in CSS pixels, from the top border of the user's browser viewport to the top side of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenTop">Window.screenTop - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screeny">The definition of 'Window.screenTop' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public static int screenTop() {
    return globalThis().screenTop();
  }

  /**
   * The Window.screenX read-only property returns the horizontal distance, in CSS pixels, of the left border of the user's browser viewport to the left side of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenX">Window.screenX - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screenx">The definition of 'Window.screenX' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public static int screenX() {
    return globalThis().screenX();
  }

  /**
   * The Window.screenY read-only property returns the vertical distance, in CSS pixels, of the top border of the user's browser viewport to the top edge of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenY">Window.screenY - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screeny">The definition of 'Window.screenY' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public static int screenY() {
    return globalThis().screenY();
  }

  /**
   * The read-only scrollX property of the Window interface returns the number of pixels that the document is currently scrolled horizontally. This value is subpixel precise in modern browsers, meaning that it isn't necessarily a whole number. You can get the number of pixels the document is scrolled vertically from the scrollY property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollX">Window.scrollX - MDN</a>
   */
  public static double scrollX() {
    return globalThis().scrollX();
  }

  /**
   * The read-only scrollY property of the Window interface returns the number of pixels that the document is currently scrolled vertically.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollY">Window.scrollY - MDN</a>
   */
  public static double scrollY() {
    return globalThis().scrollY();
  }

  /**
   * The Window.scrollbars property returns the scrollbars object, whose visibility can be checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollbars">Window.scrollbars - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-scrollbars">The definition of 'Window.scrollbars' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-scrollbars">The definition of 'Window.scrollbars' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static BarProp scrollbars() {
    return globalThis().scrollbars();
  }

  /**
   * The Window.self read-only property returns the window itself, as a WindowProxy. It can be used with dot notation on a window object (that is, window.self) or standalone (self). The advantage of the standalone notation is that a similar notation exists for non-window contexts, such as in Web Workers. By using self, you can refer to the global scope in a way that will work not only in a window context (self will resolve to window.self) but also in a worker context (self will then resolve to WorkerGlobalScope.self).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/self">Window.self - MDN</a>
   */
  @Nonnull
  public static Window self() {
    return globalThis().self();
  }

  /**
   * The read-only sessionStorage property accesses a session Storage object for the current origin. sessionStorage is similar to localStorage; the difference is that while data in localStorage doesn't expire, data in sessionStorage is cleared when the page session ends.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/sessionStorage">Window.sessionStorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-sessionstorage">The definition of 'sessionStorage' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Storage sessionStorage() {
    return globalThis().sessionStorage();
  }

  /**
   * The speechSynthesis read-only property of the Window object returns a SpeechSynthesis object, which is the entry point into using Web Speech API speech synthesis functionality.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/speechSynthesis">Window.speechSynthesis - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#tts-section">The definition of 'SpeechSynthesis' in the 'Web Speech API' specification.</a>
   */
  @Nonnull
  public static SpeechSynthesis speechSynthesis() {
    return globalThis().speechSynthesis();
  }

  /**
   * The status property of the Window interface was originally intended to set the text in the status bar at the bottom of the browser window. However, the HTML standard now requires setting window.status to have no effect on the text displayed in the status bar.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/status">Window.status - MDN</a>
   */
  @Nonnull
  public static String status() {
    return globalThis().status;
  }

  /**
   * The Window.statusbar property returns the statusbar object, whose visibility can be toggled in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/statusbar">Window.statusbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-statusbar">The definition of 'Window.statusbar' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-statusbar">The definition of 'Window.statusbar' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static BarProp statusbar() {
    return globalThis().statusbar();
  }

  /**
   * The Window.toolbar property returns the toolbar object, whose visibility can be toggled in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/toolbar">Window.toolbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-toolbar">The definition of 'Window.toolbar' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-toolbar">The definition of 'Window.toolbar' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static BarProp toolbar() {
    return globalThis().toolbar();
  }

  /**
   * Returns a reference to the topmost window in the window hierarchy.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/top">Window.top - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-top">The definition of 'window.top' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-top">The definition of 'window.top' in the 'HTML5' specification.</a>
   */
  @Nullable
  public static Window top() {
    return globalThis().top();
  }

  /**
   * The visualViewport read-only property of the Window interface returns a VisualViewport object representing the visual viewport for a given window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/visualViewport">Window.visualViewport - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-window-visualviewport">The definition of 'visualViewport' in the 'Visual Viewport API' specification.</a>
   */
  @Nonnull
  public static VisualViewport visualViewport() {
    return globalThis().visualViewport();
  }

  /**
   * The window property of a Window object points to the window object itself.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/window">Window.window - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-window">The definition of 'Window.window' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/browsers.html#dom-window">The definition of 'Window.window' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window">The definition of 'Window.window' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static Window window() {
    return globalThis().window();
  }

  /**
   * The Window.alert() method displays an alert dialog with the optional specified content and an OK button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/alert">Window.alert - MDN</a>
   */
  public static void alert() {
    globalThis().alert();
  }

  /**
   * The Window.alert() method displays an alert dialog with the optional specified content and an OK button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/alert">Window.alert - MDN</a>
   */
  public static void alert(@Nonnull String message) {
    globalThis().alert(message);
  }

  /**
   * Shifts focus away from the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/blur">Window.blur - MDN</a>
   */
  public static void blur() {
    globalThis().blur();
  }

  /**
   * The Window.close() method closes the current window, or the window on which it was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/close">Window.close - MDN</a>
   */
  public static void close() {
    globalThis().close();
  }

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and two buttons: OK and Cancel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/confirm">Window.confirm - MDN</a>
   */
  public static boolean confirm(@Nonnull String message) {
    return globalThis().confirm(message);
  }

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and two buttons: OK and Cancel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/confirm">Window.confirm - MDN</a>
   */
  public static boolean confirm() {
    return globalThis().confirm();
  }

  /**
   * Makes a request to bring the window to the front. It may fail due to user settings and the window isn't guaranteed to be frontmost before this method returns.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/focus">Window.focus - MDN</a>
   */
  public static void focus() {
    globalThis().focus();
  }

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @Nullable
  public static Window open(@Nonnull String url, @Nonnull String target, @Nonnull String features) {
    return globalThis().open(url, target, features);
  }

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @Nullable
  public static Window open(@Nonnull String url, @Nonnull String target) {
    return globalThis().open(url, target);
  }

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @Nullable
  public static Window open(@Nonnull String url) {
    return globalThis().open(url);
  }

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @Nullable
  public static Window open() {
    return globalThis().open();
  }

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public static void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin, @Nonnull JsArray<Transferable> transfer) {
    globalThis().postMessage(message, targetOrigin, transfer);
  }

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public static void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin, @Nonnull Transferable[] transfer) {
    globalThis().postMessage(message, targetOrigin, transfer);
  }

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public static void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin) {
    globalThis().postMessage(message, targetOrigin);
  }

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public static void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull WindowPostMessageOptions options) {
    globalThis().postMessage(message, options);
  }

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in the 'HTML Living Standard' specification.</a>
   */
  public static void postMessage(@DoNotAutobox @Nullable Object message) {
    globalThis().postMessage(message);
  }

  /**
   * Opens the Print Dialog to print the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/print">Window.print - MDN</a>
   */
  public static void print() {
    globalThis().print();
  }

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   */
  @Nullable
  public static String prompt(@Nonnull String message, @Nonnull String default_) {
    return globalThis().prompt(message, default_);
  }

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   */
  @Nullable
  public static String prompt(@Nonnull String message) {
    return globalThis().prompt(message);
  }

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   */
  @Nullable
  public static String prompt() {
    return globalThis().prompt();
  }

  /**
   * The window.stop() stops further resource loading in the current browsing context, equivalent to the stop button in the browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/stop">Window.stop - MDN</a>
   */
  public static void stop() {
    globalThis().stop();
  }

  /**
   * The Window.getComputedStyle() method returns an object containing the values of all CSS properties of an element, after applying active stylesheets and resolving any basic computation those values may contain.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getComputedStyle">Window.getComputedStyle - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-window-getcomputedstyle">The definition of 'getComputedStyle()' in the 'CSS Object Model (CSSOM)' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/#CSS-CSSview-getComputedStyle">The definition of 'getComputedStyle()' in the 'Document Object Model (DOM) Level 2 Style Specification' specification.</a>
   */
  @Nonnull
  public static CSSStyleDeclaration getComputedStyle(@Nonnull Element elt,
      @Nonnull String pseudoElt) {
    return globalThis().getComputedStyle(elt, pseudoElt);
  }

  /**
   * The Window.getComputedStyle() method returns an object containing the values of all CSS properties of an element, after applying active stylesheets and resolving any basic computation those values may contain.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getComputedStyle">Window.getComputedStyle - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-window-getcomputedstyle">The definition of 'getComputedStyle()' in the 'CSS Object Model (CSSOM)' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/#CSS-CSSview-getComputedStyle">The definition of 'getComputedStyle()' in the 'Document Object Model (DOM) Level 2 Style Specification' specification.</a>
   */
  @Nonnull
  public static CSSStyleDeclaration getComputedStyle(@Nonnull Element elt) {
    return globalThis().getComputedStyle(elt);
  }

  /**
   * The Window interface's matchMedia() method returns a new MediaQueryList object that can then be used to determine if the document matches the media query string, as well as to monitor the document to detect when it matches (or stops matching) that media query.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/matchMedia">Window.matchMedia - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-matchmedia">The definition of 'Window.matchMedia()' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @Nonnull
  public static MediaQueryList matchMedia(@Nonnull String query) {
    return globalThis().matchMedia(query);
  }

  /**
   * The moveBy() method of the Window interface moves the current window by a specified amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/moveBy">Window.moveBy - MDN</a>
   */
  public static void moveBy(int x, int y) {
    globalThis().moveBy(x, y);
  }

  /**
   * The moveTo() method of the Window interface moves the current window to the specified coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/moveTo">Window.moveTo - MDN</a>
   */
  public static void moveTo(int x, int y) {
    globalThis().moveTo(x, y);
  }

  /**
   * The Window.resizeBy() method resizes the current window by a specified amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/resizeBy">Window.resizeBy - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-resizeby">The definition of 'window.resizeBy()' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public static void resizeBy(int x, int y) {
    globalThis().resizeBy(x, y);
  }

  /**
   * The Window.resizeTo() method dynamically resizes the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/resizeTo">Window.resizeTo - MDN</a>
   */
  public static void resizeTo(int width, int height) {
    globalThis().resizeTo(width, height);
  }

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   */
  public static void scroll(@Nonnull ScrollToOptions options) {
    globalThis().scroll(options);
  }

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   */
  public static void scroll() {
    globalThis().scroll();
  }

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   */
  public static void scroll(double x, double y) {
    globalThis().scroll(x, y);
  }

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   */
  public static void scrollBy(@Nonnull ScrollToOptions options) {
    globalThis().scrollBy(options);
  }

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   */
  public static void scrollBy() {
    globalThis().scrollBy();
  }

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   */
  public static void scrollBy(double x, double y) {
    globalThis().scrollBy(x, y);
  }

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">The definition of 'window.scroll()' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public static void scrollTo(@Nonnull ScrollToOptions options) {
    globalThis().scrollTo(options);
  }

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">The definition of 'window.scroll()' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public static void scrollTo() {
    globalThis().scrollTo();
  }

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">The definition of 'window.scroll()' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public static void scrollTo(double x, double y) {
    globalThis().scrollTo(x, y);
  }

  /**
   * The Window.getSelection() method returns a Selection object representing the range of text selected by the user or the current position of the caret.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getSelection">Window.getSelection - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#extensions-to-window-interface">The definition of 'Window.getSelection()' in the 'Selection API' specification.</a>
   */
  @Nullable
  public static Selection getSelection() {
    return globalThis().getSelection();
  }

  /**
   * The Window.captureEvents() method registers the window to capture all events of the specified type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/captureEvents">Window.captureEvents - MDN</a>
   */
  public static void captureEvents() {
    globalThis().captureEvents();
  }

  /**
   * Releases the window from trapping events of a specific type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/releaseEvents">Window.releaseEvents - MDN</a>
   */
  public static void releaseEvents() {
    globalThis().releaseEvents();
  }

  /**
   * The WindowOrWorkerGlobalScope.atob() function decodes a string of data which has been encoded using Base64 encoding. You can use the btoa() method to encode and transmit data which may otherwise cause communication problems, then transmit it and use the atob() method to decode the data again. For example, you can encode, transmit, and decode control characters such as ASCII values 0 through 31.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/atob">Window.atob - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-atob">The definition of 'WindowOrWorkerGlobalScope.atob()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/#dom-windowbase64-atob">The definition of 'WindowBase64.atob()' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/#dom-windowbase64-atob">The definition of 'WindowBase64.atob()' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static String atob(@Nonnull String data) {
    return globalThis().atob(data);
  }

  /**
   * The WindowOrWorkerGlobalScope.btoa() method creates a Base64-encoded ASCII string from a binary string (i.e., a String object in which each character in the string is treated as a byte of binary data).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/btoa">Window.btoa - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-btoa">The definition of 'WindowOrWorkerGlobalScope.btoa()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/#dom-windowbase64-btoa">The definition of 'WindowBase64.btoa()' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/#dom-windowbase64-btoa">The definition of 'WindowBase64.btoa()' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public static String btoa(@Nonnull String data) {
    return globalThis().btoa(data);
  }

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearInterval">Window.clearInterval - MDN</a>
   */
  public static void clearInterval(int handle) {
    globalThis().clearInterval(handle);
  }

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearInterval">Window.clearInterval - MDN</a>
   */
  public static void clearInterval() {
    globalThis().clearInterval();
  }

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearTimeout">Window.clearTimeout - MDN</a>
   */
  public static void clearTimeout(int handle) {
    globalThis().clearTimeout(handle);
  }

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearTimeout">Window.clearTimeout - MDN</a>
   */
  public static void clearTimeout() {
    globalThis().clearTimeout();
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image,
      @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image,
      @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image,
      @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image,
      @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image,
      @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image,
      @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image,
      @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image,
      @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image,
      @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image,
      @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image,
      @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image, int sx, int sy,
      int sw, int sh, @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image, int sx, int sy, int sw,
      int sh, @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image, int sx, int sy,
      int sw, int sh, @Nonnull ImageBitmapOptions options) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh, options);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image, int sx,
      int sy, int sw, int sh) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image, int sx,
      int sy, int sw, int sh) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image, int sx,
      int sy, int sw, int sh) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image, int sx,
      int sy, int sw, int sh) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image, int sx,
      int sy, int sw, int sh) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image, int sx,
      int sy, int sw, int sh) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image, int sx,
      int sy, int sw, int sh) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image, int sx, int sy,
      int sw, int sh) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image, int sx,
      int sy, int sw, int sh) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image, int sx, int sy, int sw,
      int sh) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image, int sx, int sy,
      int sw, int sh) {
    return globalThis().createImageBitmap(image, sx, sy, sw, sh);
  }

  /**
   * The queueMicrotask() method, which is exposed on the Window or Worker interface, queues a microtask to be executed at a safe time prior to control returning to the browser's event loop.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/queueMicrotask">WindowOrWorkerGlobalScope.queueMicrotask - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#microtask-queuing">The definition of 'self.queueMicrotask()' in the 'HTML Living Standard' specification.</a>
   */
  public static void queueMicrotask(@Nonnull VoidFunction callback) {
    globalThis().queueMicrotask(callback);
  }

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in the 'HTML Living Standard' specification.</a>
   */
  public static int setInterval(@Nonnull TimerHandler handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments) {
    return globalThis().setInterval(handler, timeout, arguments);
  }

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in the 'HTML Living Standard' specification.</a>
   */
  public static int setInterval(@Nonnull String handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments) {
    return globalThis().setInterval(handler, timeout, arguments);
  }

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in the 'HTML Living Standard' specification.</a>
   */
  public static int setInterval(@Nonnull Function handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments) {
    return globalThis().setInterval(handler, timeout, arguments);
  }

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in the 'HTML Living Standard' specification.</a>
   */
  public static int setInterval(@Nonnull TimerHandler handler, int timeout) {
    return globalThis().setInterval(handler, timeout);
  }

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in the 'HTML Living Standard' specification.</a>
   */
  public static int setInterval(@Nonnull String handler, int timeout) {
    return globalThis().setInterval(handler, timeout);
  }

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in the 'HTML Living Standard' specification.</a>
   */
  public static int setInterval(@Nonnull Function handler, int timeout) {
    return globalThis().setInterval(handler, timeout);
  }

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in the 'HTML Living Standard' specification.</a>
   */
  public static int setTimeout(@Nonnull TimerHandler handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments) {
    return globalThis().setTimeout(handler, timeout, arguments);
  }

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in the 'HTML Living Standard' specification.</a>
   */
  public static int setTimeout(@Nonnull String handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments) {
    return globalThis().setTimeout(handler, timeout, arguments);
  }

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in the 'HTML Living Standard' specification.</a>
   */
  public static int setTimeout(@Nonnull Function handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments) {
    return globalThis().setTimeout(handler, timeout, arguments);
  }

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in the 'HTML Living Standard' specification.</a>
   */
  public static int setTimeout(@Nonnull TimerHandler handler, int timeout) {
    return globalThis().setTimeout(handler, timeout);
  }

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in the 'HTML Living Standard' specification.</a>
   */
  public static int setTimeout(@Nonnull String handler, int timeout) {
    return globalThis().setTimeout(handler, timeout);
  }

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in the 'HTML Living Standard' specification.</a>
   */
  public static int setTimeout(@Nonnull Function handler, int timeout) {
    return globalThis().setTimeout(handler, timeout);
  }

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public static Promise<Response> fetch(@Nonnull RequestInfo input, @Nonnull RequestInit init) {
    return globalThis().fetch(input, init);
  }

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public static Promise<Response> fetch(@Nonnull Request input, @Nonnull RequestInit init) {
    return globalThis().fetch(input, init);
  }

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public static Promise<Response> fetch(@Nonnull String input, @Nonnull RequestInit init) {
    return globalThis().fetch(input, init);
  }

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public static Promise<Response> fetch(@Nonnull RequestInfo input) {
    return globalThis().fetch(input);
  }

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public static Promise<Response> fetch(@Nonnull Request input) {
    return globalThis().fetch(input);
  }

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in the 'Fetch' specification.</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public static Promise<Response> fetch(@Nonnull String input) {
    return globalThis().fetch(input);
  }

  /**
   * The window.cancelAnimationFrame() method cancels an animation frame request previously scheduled through a call to window.requestAnimationFrame().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/cancelAnimationFrame">Window.cancelAnimationFrame - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#animationframeprovider-cancelanimationframe">The definition of 'cancelAnimationFrame()' in the 'HTML Living Standard' specification.</a>
   */
  public static void cancelAnimationFrame(int handle) {
    globalThis().cancelAnimationFrame(handle);
  }

  /**
   * The window.requestAnimationFrame() method tells the browser that you wish to perform an animation and requests that the browser calls a specified function to update an animation before the next repaint. The method takes a callback as an argument to be invoked before the repaint.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/requestAnimationFrame">Window.requestAnimationFrame - MDN</a>
   */
  public static int requestAnimationFrame(@Nonnull FrameRequestCallback callback) {
    return globalThis().requestAnimationFrame(callback);
  }

  public static void addHashchangeListener(@Nonnull final HashChangeEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addHashchangeListener( callback, options );
  }

  public static void addHashchangeListener(@Nonnull final HashChangeEventListener callback,
      final boolean useCapture) {
    globalThis().addHashchangeListener( callback, useCapture );
  }

  public static void addHashchangeListener(@Nonnull final HashChangeEventListener callback) {
    globalThis().addHashchangeListener( callback );
  }

  public static void removeHashchangeListener(@Nonnull final HashChangeEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeHashchangeListener( callback, options );
  }

  public static void removeHashchangeListener(@Nonnull final HashChangeEventListener callback,
      final boolean useCapture) {
    globalThis().removeHashchangeListener( callback, useCapture );
  }

  public static void removeHashchangeListener(@Nonnull final HashChangeEventListener callback) {
    globalThis().removeHashchangeListener( callback );
  }

  public static void addMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addMessageListener( callback, options );
  }

  public static void addMessageListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    globalThis().addMessageListener( callback, useCapture );
  }

  public static void addMessageListener(@Nonnull final MessageEventListener callback) {
    globalThis().addMessageListener( callback );
  }

  public static void removeMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeMessageListener( callback, options );
  }

  public static void removeMessageListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    globalThis().removeMessageListener( callback, useCapture );
  }

  public static void removeMessageListener(@Nonnull final MessageEventListener callback) {
    globalThis().removeMessageListener( callback );
  }

  public static void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addMessageerrorListener( callback, options );
  }

  public static void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    globalThis().addMessageerrorListener( callback, useCapture );
  }

  public static void addMessageerrorListener(@Nonnull final MessageEventListener callback) {
    globalThis().addMessageerrorListener( callback );
  }

  public static void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeMessageerrorListener( callback, options );
  }

  public static void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    globalThis().removeMessageerrorListener( callback, useCapture );
  }

  public static void removeMessageerrorListener(@Nonnull final MessageEventListener callback) {
    globalThis().removeMessageerrorListener( callback );
  }

  public static void addPagehideListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addPagehideListener( callback, options );
  }

  public static void addPagehideListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    globalThis().addPagehideListener( callback, useCapture );
  }

  public static void addPagehideListener(@Nonnull final PageTransitionEventListener callback) {
    globalThis().addPagehideListener( callback );
  }

  public static void removePagehideListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removePagehideListener( callback, options );
  }

  public static void removePagehideListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    globalThis().removePagehideListener( callback, useCapture );
  }

  public static void removePagehideListener(@Nonnull final PageTransitionEventListener callback) {
    globalThis().removePagehideListener( callback );
  }

  public static void addPageshowListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addPageshowListener( callback, options );
  }

  public static void addPageshowListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    globalThis().addPageshowListener( callback, useCapture );
  }

  public static void addPageshowListener(@Nonnull final PageTransitionEventListener callback) {
    globalThis().addPageshowListener( callback );
  }

  public static void removePageshowListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removePageshowListener( callback, options );
  }

  public static void removePageshowListener(@Nonnull final PageTransitionEventListener callback,
      final boolean useCapture) {
    globalThis().removePageshowListener( callback, useCapture );
  }

  public static void removePageshowListener(@Nonnull final PageTransitionEventListener callback) {
    globalThis().removePageshowListener( callback );
  }

  public static void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addRejectionhandledListener( callback, options );
  }

  public static void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    globalThis().addRejectionhandledListener( callback, useCapture );
  }

  public static void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    globalThis().addRejectionhandledListener( callback );
  }

  public static void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeRejectionhandledListener( callback, options );
  }

  public static void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    globalThis().removeRejectionhandledListener( callback, useCapture );
  }

  public static void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    globalThis().removeRejectionhandledListener( callback );
  }

  public static void addStorageListener(@Nonnull final StorageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addStorageListener( callback, options );
  }

  public static void addStorageListener(@Nonnull final StorageEventListener callback,
      final boolean useCapture) {
    globalThis().addStorageListener( callback, useCapture );
  }

  public static void addStorageListener(@Nonnull final StorageEventListener callback) {
    globalThis().addStorageListener( callback );
  }

  public static void removeStorageListener(@Nonnull final StorageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeStorageListener( callback, options );
  }

  public static void removeStorageListener(@Nonnull final StorageEventListener callback,
      final boolean useCapture) {
    globalThis().removeStorageListener( callback, useCapture );
  }

  public static void removeStorageListener(@Nonnull final StorageEventListener callback) {
    globalThis().removeStorageListener( callback );
  }

  public static void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addUnhandledrejectionListener( callback, options );
  }

  public static void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    globalThis().addUnhandledrejectionListener( callback, useCapture );
  }

  public static void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    globalThis().addUnhandledrejectionListener( callback );
  }

  public static void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeUnhandledrejectionListener( callback, options );
  }

  public static void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean useCapture) {
    globalThis().removeUnhandledrejectionListener( callback, useCapture );
  }

  public static void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    globalThis().removeUnhandledrejectionListener( callback );
  }

  public static void addDOMContentLoadedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addDOMContentLoadedListener( callback, options );
  }

  public static void addDOMContentLoadedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().addDOMContentLoadedListener( callback, useCapture );
  }

  public static void addDOMContentLoadedListener(@Nonnull final EventListener callback) {
    globalThis().addDOMContentLoadedListener( callback );
  }

  public static void removeDOMContentLoadedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeDOMContentLoadedListener( callback, options );
  }

  public static void removeDOMContentLoadedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().removeDOMContentLoadedListener( callback, useCapture );
  }

  public static void removeDOMContentLoadedListener(@Nonnull final EventListener callback) {
    globalThis().removeDOMContentLoadedListener( callback );
  }

  public static void addAfterprintListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addAfterprintListener( callback, options );
  }

  public static void addAfterprintListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().addAfterprintListener( callback, useCapture );
  }

  public static void addAfterprintListener(@Nonnull final EventListener callback) {
    globalThis().addAfterprintListener( callback );
  }

  public static void removeAfterprintListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeAfterprintListener( callback, options );
  }

  public static void removeAfterprintListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().removeAfterprintListener( callback, useCapture );
  }

  public static void removeAfterprintListener(@Nonnull final EventListener callback) {
    globalThis().removeAfterprintListener( callback );
  }

  public static void addAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addAnimationcancelListener( callback, options );
  }

  public static void addAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    globalThis().addAnimationcancelListener( callback, useCapture );
  }

  public static void addAnimationcancelListener(@Nonnull final AnimationEventListener callback) {
    globalThis().addAnimationcancelListener( callback );
  }

  public static void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeAnimationcancelListener( callback, options );
  }

  public static void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    globalThis().removeAnimationcancelListener( callback, useCapture );
  }

  public static void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback) {
    globalThis().removeAnimationcancelListener( callback );
  }

  public static void addAnimationendListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addAnimationendListener( callback, options );
  }

  public static void addAnimationendListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    globalThis().addAnimationendListener( callback, useCapture );
  }

  public static void addAnimationendListener(@Nonnull final AnimationEventListener callback) {
    globalThis().addAnimationendListener( callback );
  }

  public static void removeAnimationendListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeAnimationendListener( callback, options );
  }

  public static void removeAnimationendListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    globalThis().removeAnimationendListener( callback, useCapture );
  }

  public static void removeAnimationendListener(@Nonnull final AnimationEventListener callback) {
    globalThis().removeAnimationendListener( callback );
  }

  public static void addAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addAnimationiterationListener( callback, options );
  }

  public static void addAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    globalThis().addAnimationiterationListener( callback, useCapture );
  }

  public static void addAnimationiterationListener(@Nonnull final AnimationEventListener callback) {
    globalThis().addAnimationiterationListener( callback );
  }

  public static void removeAnimationiterationListener(
      @Nonnull final AnimationEventListener callback, @Nonnull final EventListenerOptions options) {
    globalThis().removeAnimationiterationListener( callback, options );
  }

  public static void removeAnimationiterationListener(
      @Nonnull final AnimationEventListener callback, final boolean useCapture) {
    globalThis().removeAnimationiterationListener( callback, useCapture );
  }

  public static void removeAnimationiterationListener(
      @Nonnull final AnimationEventListener callback) {
    globalThis().removeAnimationiterationListener( callback );
  }

  public static void addAnimationstartListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addAnimationstartListener( callback, options );
  }

  public static void addAnimationstartListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    globalThis().addAnimationstartListener( callback, useCapture );
  }

  public static void addAnimationstartListener(@Nonnull final AnimationEventListener callback) {
    globalThis().addAnimationstartListener( callback );
  }

  public static void removeAnimationstartListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeAnimationstartListener( callback, options );
  }

  public static void removeAnimationstartListener(@Nonnull final AnimationEventListener callback,
      final boolean useCapture) {
    globalThis().removeAnimationstartListener( callback, useCapture );
  }

  public static void removeAnimationstartListener(@Nonnull final AnimationEventListener callback) {
    globalThis().removeAnimationstartListener( callback );
  }

  public static void addAppinstalledListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addAppinstalledListener( callback, options );
  }

  public static void addAppinstalledListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().addAppinstalledListener( callback, useCapture );
  }

  public static void addAppinstalledListener(@Nonnull final EventListener callback) {
    globalThis().addAppinstalledListener( callback );
  }

  public static void removeAppinstalledListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeAppinstalledListener( callback, options );
  }

  public static void removeAppinstalledListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().removeAppinstalledListener( callback, useCapture );
  }

  public static void removeAppinstalledListener(@Nonnull final EventListener callback) {
    globalThis().removeAppinstalledListener( callback );
  }

  public static void addBeforeprintListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addBeforeprintListener( callback, options );
  }

  public static void addBeforeprintListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().addBeforeprintListener( callback, useCapture );
  }

  public static void addBeforeprintListener(@Nonnull final EventListener callback) {
    globalThis().addBeforeprintListener( callback );
  }

  public static void removeBeforeprintListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeBeforeprintListener( callback, options );
  }

  public static void removeBeforeprintListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().removeBeforeprintListener( callback, useCapture );
  }

  public static void removeBeforeprintListener(@Nonnull final EventListener callback) {
    globalThis().removeBeforeprintListener( callback );
  }

  public static void addBeforeunloadListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addBeforeunloadListener( callback, options );
  }

  public static void addBeforeunloadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().addBeforeunloadListener( callback, useCapture );
  }

  public static void addBeforeunloadListener(@Nonnull final EventListener callback) {
    globalThis().addBeforeunloadListener( callback );
  }

  public static void removeBeforeunloadListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeBeforeunloadListener( callback, options );
  }

  public static void removeBeforeunloadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().removeBeforeunloadListener( callback, useCapture );
  }

  public static void removeBeforeunloadListener(@Nonnull final EventListener callback) {
    globalThis().removeBeforeunloadListener( callback );
  }

  public static void addBlurListener(@Nonnull final FocusEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addBlurListener( callback, options );
  }

  public static void addBlurListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    globalThis().addBlurListener( callback, useCapture );
  }

  public static void addBlurListener(@Nonnull final FocusEventListener callback) {
    globalThis().addBlurListener( callback );
  }

  public static void removeBlurListener(@Nonnull final FocusEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeBlurListener( callback, options );
  }

  public static void removeBlurListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    globalThis().removeBlurListener( callback, useCapture );
  }

  public static void removeBlurListener(@Nonnull final FocusEventListener callback) {
    globalThis().removeBlurListener( callback );
  }

  public static void addClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addClipboardchangeListener( callback, options );
  }

  public static void addClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    globalThis().addClipboardchangeListener( callback, useCapture );
  }

  public static void addClipboardchangeListener(@Nonnull final ClipboardEventListener callback) {
    globalThis().addClipboardchangeListener( callback );
  }

  public static void removeClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeClipboardchangeListener( callback, options );
  }

  public static void removeClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    globalThis().removeClipboardchangeListener( callback, useCapture );
  }

  public static void removeClipboardchangeListener(@Nonnull final ClipboardEventListener callback) {
    globalThis().removeClipboardchangeListener( callback );
  }

  public static void addCopyListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addCopyListener( callback, options );
  }

  public static void addCopyListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    globalThis().addCopyListener( callback, useCapture );
  }

  public static void addCopyListener(@Nonnull final ClipboardEventListener callback) {
    globalThis().addCopyListener( callback );
  }

  public static void removeCopyListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeCopyListener( callback, options );
  }

  public static void removeCopyListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    globalThis().removeCopyListener( callback, useCapture );
  }

  public static void removeCopyListener(@Nonnull final ClipboardEventListener callback) {
    globalThis().removeCopyListener( callback );
  }

  public static void addCutListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addCutListener( callback, options );
  }

  public static void addCutListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    globalThis().addCutListener( callback, useCapture );
  }

  public static void addCutListener(@Nonnull final ClipboardEventListener callback) {
    globalThis().addCutListener( callback );
  }

  public static void removeCutListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeCutListener( callback, options );
  }

  public static void removeCutListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    globalThis().removeCutListener( callback, useCapture );
  }

  public static void removeCutListener(@Nonnull final ClipboardEventListener callback) {
    globalThis().removeCutListener( callback );
  }

  public static void addDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addDevicemotionListener( callback, options );
  }

  public static void addDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      final boolean useCapture) {
    globalThis().addDevicemotionListener( callback, useCapture );
  }

  public static void addDevicemotionListener(@Nonnull final DeviceMotionEventListener callback) {
    globalThis().addDevicemotionListener( callback );
  }

  public static void removeDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeDevicemotionListener( callback, options );
  }

  public static void removeDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      final boolean useCapture) {
    globalThis().removeDevicemotionListener( callback, useCapture );
  }

  public static void removeDevicemotionListener(@Nonnull final DeviceMotionEventListener callback) {
    globalThis().removeDevicemotionListener( callback );
  }

  public static void addDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addDeviceorientationListener( callback, options );
  }

  public static void addDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback, final boolean useCapture) {
    globalThis().addDeviceorientationListener( callback, useCapture );
  }

  public static void addDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback) {
    globalThis().addDeviceorientationListener( callback );
  }

  public static void removeDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeDeviceorientationListener( callback, options );
  }

  public static void removeDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback, final boolean useCapture) {
    globalThis().removeDeviceorientationListener( callback, useCapture );
  }

  public static void removeDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback) {
    globalThis().removeDeviceorientationListener( callback );
  }

  public static void addFocusListener(@Nonnull final FocusEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addFocusListener( callback, options );
  }

  public static void addFocusListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    globalThis().addFocusListener( callback, useCapture );
  }

  public static void addFocusListener(@Nonnull final FocusEventListener callback) {
    globalThis().addFocusListener( callback );
  }

  public static void removeFocusListener(@Nonnull final FocusEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeFocusListener( callback, options );
  }

  public static void removeFocusListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    globalThis().removeFocusListener( callback, useCapture );
  }

  public static void removeFocusListener(@Nonnull final FocusEventListener callback) {
    globalThis().removeFocusListener( callback );
  }

  public static void addGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addGamepadconnectedListener( callback, options );
  }

  public static void addGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean useCapture) {
    globalThis().addGamepadconnectedListener( callback, useCapture );
  }

  public static void addGamepadconnectedListener(@Nonnull final GamepadEventListener callback) {
    globalThis().addGamepadconnectedListener( callback );
  }

  public static void removeGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeGamepadconnectedListener( callback, options );
  }

  public static void removeGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean useCapture) {
    globalThis().removeGamepadconnectedListener( callback, useCapture );
  }

  public static void removeGamepadconnectedListener(@Nonnull final GamepadEventListener callback) {
    globalThis().removeGamepadconnectedListener( callback );
  }

  public static void addGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addGamepaddisconnectedListener( callback, options );
  }

  public static void addGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean useCapture) {
    globalThis().addGamepaddisconnectedListener( callback, useCapture );
  }

  public static void addGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback) {
    globalThis().addGamepaddisconnectedListener( callback );
  }

  public static void removeGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeGamepaddisconnectedListener( callback, options );
  }

  public static void removeGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean useCapture) {
    globalThis().removeGamepaddisconnectedListener( callback, useCapture );
  }

  public static void removeGamepaddisconnectedListener(
      @Nonnull final GamepadEventListener callback) {
    globalThis().removeGamepaddisconnectedListener( callback );
  }

  public static void addLanguagechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addLanguagechangeListener( callback, options );
  }

  public static void addLanguagechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().addLanguagechangeListener( callback, useCapture );
  }

  public static void addLanguagechangeListener(@Nonnull final EventListener callback) {
    globalThis().addLanguagechangeListener( callback );
  }

  public static void removeLanguagechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeLanguagechangeListener( callback, options );
  }

  public static void removeLanguagechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().removeLanguagechangeListener( callback, useCapture );
  }

  public static void removeLanguagechangeListener(@Nonnull final EventListener callback) {
    globalThis().removeLanguagechangeListener( callback );
  }

  public static void addLoadListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addLoadListener( callback, options );
  }

  public static void addLoadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().addLoadListener( callback, useCapture );
  }

  public static void addLoadListener(@Nonnull final EventListener callback) {
    globalThis().addLoadListener( callback );
  }

  public static void removeLoadListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeLoadListener( callback, options );
  }

  public static void removeLoadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().removeLoadListener( callback, useCapture );
  }

  public static void removeLoadListener(@Nonnull final EventListener callback) {
    globalThis().removeLoadListener( callback );
  }

  public static void addOfflineListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addOfflineListener( callback, options );
  }

  public static void addOfflineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().addOfflineListener( callback, useCapture );
  }

  public static void addOfflineListener(@Nonnull final EventListener callback) {
    globalThis().addOfflineListener( callback );
  }

  public static void removeOfflineListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeOfflineListener( callback, options );
  }

  public static void removeOfflineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().removeOfflineListener( callback, useCapture );
  }

  public static void removeOfflineListener(@Nonnull final EventListener callback) {
    globalThis().removeOfflineListener( callback );
  }

  public static void addOnlineListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addOnlineListener( callback, options );
  }

  public static void addOnlineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().addOnlineListener( callback, useCapture );
  }

  public static void addOnlineListener(@Nonnull final EventListener callback) {
    globalThis().addOnlineListener( callback );
  }

  public static void removeOnlineListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeOnlineListener( callback, options );
  }

  public static void removeOnlineListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().removeOnlineListener( callback, useCapture );
  }

  public static void removeOnlineListener(@Nonnull final EventListener callback) {
    globalThis().removeOnlineListener( callback );
  }

  public static void addOrientationchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addOrientationchangeListener( callback, options );
  }

  public static void addOrientationchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().addOrientationchangeListener( callback, useCapture );
  }

  public static void addOrientationchangeListener(@Nonnull final EventListener callback) {
    globalThis().addOrientationchangeListener( callback );
  }

  public static void removeOrientationchangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeOrientationchangeListener( callback, options );
  }

  public static void removeOrientationchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().removeOrientationchangeListener( callback, useCapture );
  }

  public static void removeOrientationchangeListener(@Nonnull final EventListener callback) {
    globalThis().removeOrientationchangeListener( callback );
  }

  public static void addPasteListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addPasteListener( callback, options );
  }

  public static void addPasteListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    globalThis().addPasteListener( callback, useCapture );
  }

  public static void addPasteListener(@Nonnull final ClipboardEventListener callback) {
    globalThis().addPasteListener( callback );
  }

  public static void removePasteListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removePasteListener( callback, options );
  }

  public static void removePasteListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    globalThis().removePasteListener( callback, useCapture );
  }

  public static void removePasteListener(@Nonnull final ClipboardEventListener callback) {
    globalThis().removePasteListener( callback );
  }

  public static void addResizeListener(@Nonnull final UIEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addResizeListener( callback, options );
  }

  public static void addResizeListener(@Nonnull final UIEventListener callback,
      final boolean useCapture) {
    globalThis().addResizeListener( callback, useCapture );
  }

  public static void addResizeListener(@Nonnull final UIEventListener callback) {
    globalThis().addResizeListener( callback );
  }

  public static void removeResizeListener(@Nonnull final UIEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeResizeListener( callback, options );
  }

  public static void removeResizeListener(@Nonnull final UIEventListener callback,
      final boolean useCapture) {
    globalThis().removeResizeListener( callback, useCapture );
  }

  public static void removeResizeListener(@Nonnull final UIEventListener callback) {
    globalThis().removeResizeListener( callback );
  }

  public static void addTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addTransitioncancelListener( callback, options );
  }

  public static void addTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    globalThis().addTransitioncancelListener( callback, useCapture );
  }

  public static void addTransitioncancelListener(@Nonnull final TransitionEventListener callback) {
    globalThis().addTransitioncancelListener( callback );
  }

  public static void removeTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeTransitioncancelListener( callback, options );
  }

  public static void removeTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    globalThis().removeTransitioncancelListener( callback, useCapture );
  }

  public static void removeTransitioncancelListener(
      @Nonnull final TransitionEventListener callback) {
    globalThis().removeTransitioncancelListener( callback );
  }

  public static void addTransitionendListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addTransitionendListener( callback, options );
  }

  public static void addTransitionendListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    globalThis().addTransitionendListener( callback, useCapture );
  }

  public static void addTransitionendListener(@Nonnull final TransitionEventListener callback) {
    globalThis().addTransitionendListener( callback );
  }

  public static void removeTransitionendListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeTransitionendListener( callback, options );
  }

  public static void removeTransitionendListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    globalThis().removeTransitionendListener( callback, useCapture );
  }

  public static void removeTransitionendListener(@Nonnull final TransitionEventListener callback) {
    globalThis().removeTransitionendListener( callback );
  }

  public static void addTransitionrunListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addTransitionrunListener( callback, options );
  }

  public static void addTransitionrunListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    globalThis().addTransitionrunListener( callback, useCapture );
  }

  public static void addTransitionrunListener(@Nonnull final TransitionEventListener callback) {
    globalThis().addTransitionrunListener( callback );
  }

  public static void removeTransitionrunListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeTransitionrunListener( callback, options );
  }

  public static void removeTransitionrunListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    globalThis().removeTransitionrunListener( callback, useCapture );
  }

  public static void removeTransitionrunListener(@Nonnull final TransitionEventListener callback) {
    globalThis().removeTransitionrunListener( callback );
  }

  public static void addTransitionstartListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addTransitionstartListener( callback, options );
  }

  public static void addTransitionstartListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    globalThis().addTransitionstartListener( callback, useCapture );
  }

  public static void addTransitionstartListener(@Nonnull final TransitionEventListener callback) {
    globalThis().addTransitionstartListener( callback );
  }

  public static void removeTransitionstartListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeTransitionstartListener( callback, options );
  }

  public static void removeTransitionstartListener(@Nonnull final TransitionEventListener callback,
      final boolean useCapture) {
    globalThis().removeTransitionstartListener( callback, useCapture );
  }

  public static void removeTransitionstartListener(
      @Nonnull final TransitionEventListener callback) {
    globalThis().removeTransitionstartListener( callback );
  }

  public static void addUnloadListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    globalThis().addUnloadListener( callback, options );
  }

  public static void addUnloadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().addUnloadListener( callback, useCapture );
  }

  public static void addUnloadListener(@Nonnull final EventListener callback) {
    globalThis().addUnloadListener( callback );
  }

  public static void removeUnloadListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    globalThis().removeUnloadListener( callback, options );
  }

  public static void removeUnloadListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    globalThis().removeUnloadListener( callback, useCapture );
  }

  public static void removeUnloadListener(@Nonnull final EventListener callback) {
    globalThis().removeUnloadListener( callback );
  }

  /**
   * The EventTarget method addEventListener() sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">EventTarget.addEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-addeventlistener">The definition of 'EventTarget.addEventListener()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-addeventlistener">The definition of 'EventTarget.addEventListener()' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-addEventListener">The definition of 'EventTarget.addEventListener()' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  public static void addEventListener(@Nonnull String type, @Nullable EventListener callback,
      @Nonnull AddEventListenerOptions options) {
    globalThis().addEventListener(type, callback, options);
  }

  /**
   * The EventTarget method addEventListener() sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">EventTarget.addEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-addeventlistener">The definition of 'EventTarget.addEventListener()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-addeventlistener">The definition of 'EventTarget.addEventListener()' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-addEventListener">The definition of 'EventTarget.addEventListener()' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  public static void addEventListener(@Nonnull String type, @Nullable EventListener callback,
      boolean options) {
    globalThis().addEventListener(type, callback, options);
  }

  /**
   * The EventTarget method addEventListener() sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">EventTarget.addEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-addeventlistener">The definition of 'EventTarget.addEventListener()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-addeventlistener">The definition of 'EventTarget.addEventListener()' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-addEventListener">The definition of 'EventTarget.addEventListener()' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  public static void addEventListener(@Nonnull String type, @Nullable EventListener callback) {
    globalThis().addEventListener(type, callback);
  }

  /**
   * Dispatches an Event at the specified EventTarget, (synchronously) invoking the affected EventListeners in the appropriate order. The normal event processing rules (including the capturing and optional bubbling phase) also apply to events dispatched manually with dispatchEvent().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/dispatchEvent">EventTarget.dispatchEvent - MDN</a>
   */
  public static boolean dispatchEvent(@Nonnull Event event) {
    return globalThis().dispatchEvent(event);
  }

  /**
   * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously registered with EventTarget.addEventListener(). The event listener to be removed is identified using a combination of the event type, the event listener function itself, and various optional options that may affect the matching process; see Matching event listeners for removal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener">EventTarget.removeEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-removeeventlistener">The definition of 'EventTarget.removeEventListener()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-removeeventlistener">The definition of 'EventTarget.removeEventListener()' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-removeEventListener">The definition of 'EventTarget.removeEventListener()' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  public static void removeEventListener(@Nonnull String type, @Nullable EventListener callback,
      @Nonnull EventListenerOptions options) {
    globalThis().removeEventListener(type, callback, options);
  }

  /**
   * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously registered with EventTarget.addEventListener(). The event listener to be removed is identified using a combination of the event type, the event listener function itself, and various optional options that may affect the matching process; see Matching event listeners for removal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener">EventTarget.removeEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-removeeventlistener">The definition of 'EventTarget.removeEventListener()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-removeeventlistener">The definition of 'EventTarget.removeEventListener()' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-removeEventListener">The definition of 'EventTarget.removeEventListener()' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  public static void removeEventListener(@Nonnull String type, @Nullable EventListener callback,
      boolean options) {
    globalThis().removeEventListener(type, callback, options);
  }

  /**
   * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously registered with EventTarget.addEventListener(). The event listener to be removed is identified using a combination of the event type, the event listener function itself, and various optional options that may affect the matching process; see Matching event listeners for removal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener">EventTarget.removeEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-removeeventlistener">The definition of 'EventTarget.removeEventListener()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-removeeventlistener">The definition of 'EventTarget.removeEventListener()' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-removeEventListener">The definition of 'EventTarget.removeEventListener()' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  public static void removeEventListener(@Nonnull String type, @Nullable EventListener callback) {
    globalThis().removeEventListener(type, callback);
  }

  @Nonnull
  public static ConsoleNamespace console() {
    return globalThis().console();
  }

  @Nonnull
  public static CSSNamespace css() {
    return globalThis().css();
  }

  @Nonnull
  public static WebAssemblyNamespace webAssembly() {
    return globalThis().webAssembly();
  }

  @Nonnull
  public static JsMathNamespace math() {
    return globalThis().math();
  }

  @Nonnull
  public static AtomicsNamespace atomics() {
    return globalThis().atomics();
  }
}
