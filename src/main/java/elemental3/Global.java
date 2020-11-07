package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import elemental3.indexeddb.IDBFactory;
import elemental3.speech.SpeechSynthesis;
import elemental3.svg.SVGImageElement;
import elemental3.wasm.WebAssembly;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * Accessor for the global <b>globalThis</b> property also know as the global object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/globalThis">globalThis - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "goog.global"
)
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
  @JsOverlay
  @Nonnull
  public static GlobalWindow globalThis() {
    return globalThis;
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
   * @see <a href="https://w3c.github.io/ServiceWorker/#self-caches">The definition of 'caches' in Service Workers.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-window-closed">The definition of 'window.closed' in HTML Living Standard.</a>
   */
  public static boolean closed() {
    return globalThis().closed();
  }

  /**
   * The crossOriginIsolated read-only property of the WindowOrWorkerGlobalScope interface returns a boolean value that indicates whether a SharedArrayBuffer can be sent via a Window.postMessage() call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/crossOriginIsolated">WindowOrWorkerGlobalScope.crossOriginIsolated - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-crossoriginisolated">The definition of 'crossOriginIsolated' in HTML Living Standard.</a>
   */
  public static boolean crossOriginIsolated() {
    return globalThis().crossOriginIsolated();
  }

  /**
   * The read-only Window.crypto property returns the Crypto object associated to the global object. This object allows web pages access to certain cryptographic related services.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/crypto">Window.crypto - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-GlobalCrypto">The definition of 'Window.crypto' in Web Cryptography API.</a>
   */
  @Nonnull
  public static Crypto crypto() {
    return globalThis().crypto();
  }

  /**
   * The customElements read-only property of the Window interface returns a reference to the CustomElementRegistry object, which can be used to register new custom elements and get information about previously registered custom elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/customElements">Window.customElements - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/custom-elements.html#dom-window-customelements">The definition of 'window.customElements' in HTML Living Standard.</a>
   */
  @Nonnull
  public static CustomElementRegistry customElements() {
    return globalThis().customElements();
  }

  /**
   * The devicePixelRatio of Window interface returns the ratio of the resolution in physical pixels to the resolution in CSS pixels for the current display device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio">Window.devicePixelRatio - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-devicepixelratio">The definition of 'Window.devicePixelRatio' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static double devicePixelRatio() {
    return globalThis().devicePixelRatio();
  }

  /**
   * window.document returns a reference to the document contained in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/document">Window.document - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-document-2">The definition of 'Window.document' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-document-0">The definition of 'Window.document' in HTML5.</a>
   */
  @Nonnull
  public static Document document() {
    return globalThis().document();
  }

  /**
   * The read-only Window property event returns the Event which is currently being handled by the site's code. Outside the context of an event handler, the value is always undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/event">Window.event - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-window-event">The definition of 'Window.event' in DOM.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-frameelement">The definition of 'Window.frameElement' in HTML Living Standard.</a>
   */
  @Nullable
  public static Element frameElement() {
    return globalThis().frameElement();
  }

  /**
   * Returns the window itself, which is an array-like object, listing the direct sub-frames of the current window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/frames">Window.frames - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-frames">The definition of 'Window.frames' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-frames">The definition of 'Window.frames' in HTML5.</a>
   */
  @Nonnull
  public static Window frames() {
    return globalThis().frames();
  }

  /**
   * The Window.history read-only property returns a reference to the History object, which provides an interface for manipulating the browser session history (pages visited in the tab or frame that the current page is loaded in).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/history">Window.history - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#the-history-interface">The definition of 'The History interface' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#the-history-interface">The definition of 'The History interface' in HTML5.</a>
   */
  @Nonnull
  public static History history() {
    return globalThis().history();
  }

  /**
   * The indexedDB read-only property of the WindowOrWorkerGlobalScope mixin provides a mechanism for applications to asynchronously access the capabilities of indexed databases.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/indexedDB">Window.indexedDB - MDN</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-windoworworkerglobalscope-indexeddb">The definition of 'indexedDB' in Indexed Database API Draft.</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-windoworworkerglobalscope-indexeddb">The definition of 'indexedDB' in Indexed Database API 2.0.</a>
   */
  @Nonnull
  public static IDBFactory indexedDB() {
    return globalThis().indexedDB();
  }

  /**
   * The read-only innerHeight property of the Window interface returns the interior height of the window in pixels, including the height of the horizontal scroll bar, if present.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/innerHeight">Window.innerHeight - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-innerheight">The definition of 'window.innerHeight' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static int innerHeight() {
    return globalThis().innerHeight();
  }

  /**
   * The read-only Window property innerWidth returns the interior width of the window in pixels. This includes the width of the vertical scroll bar, if one is present.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/innerWidth">Window.innerWidth - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-innerwidth">The definition of 'window.innerWidth' in CSS Object Model (CSSOM) View Module.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-length">The definition of 'Window.length' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-length">The definition of 'Window.length' in HTML5.</a>
   */
  public static int length() {
    return globalThis().length();
  }

  /**
   * The read-only localStorage property allows you to access a Storage object for the Document's origin; the stored data is saved across browser sessions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/localStorage">Window.localStorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-localstorage">The definition of 'localStorage' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Storage localStorage() {
    return globalThis().localStorage();
  }

  /**
   * The Window.location read-only property returns a Location object with information about the current location of the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/location">Window.location - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/history.html#the-location-interface">The definition of 'Window.location' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#the-location-interface">The definition of 'Window.location' in HTML5.</a>
   */
  @Nonnull
  public static Location location() {
    return globalThis().location();
  }

  /**
   * Returns the locationbar object, whose visibility can be checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/locationbar">Window.locationbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-locationbar">The definition of 'Window.locationbar' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-locationbar">The definition of 'Window.locationbar' in HTML5.</a>
   */
  @Nonnull
  public static BarProp locationbar() {
    return globalThis().locationbar();
  }

  /**
   * The Window.menubar property returns the menubar object, whose visibility can be checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/menubar">Window.menubar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-menubar">The definition of 'Window.menubar' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-menubar">The definition of 'Window.menubar' in HTML5.</a>
   */
  @Nonnull
  public static BarProp menubar() {
    return globalThis().menubar();
  }

  /**
   * The Window.navigator read-only property returns a reference to the Navigator object, which has methods and properties about the application running the script.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/navigator">Window.navigator - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator">The definition of 'Window: navigator' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Navigator navigator() {
    return globalThis().navigator();
  }

  public static short orientation() {
    return globalThis().orientation();
  }

  /**
   * The origin read-only property of the WindowOrWorkerGlobalScope interface returns the origin of the global scope, serialized as a string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/origin">WindowOrWorkerGlobalScope.origin - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-origin">The definition of 'WindowOrWorkerGlobalScope.origin' in HTML Living Standard.</a>
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
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-outerheight">The definition of 'Window.outerHeight' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static int outerHeight() {
    return globalThis().outerHeight();
  }

  /**
   * Window.outerWidth read-only property returns the width of the outside of the browser window. It represents the width of the whole browser window including sidebar (if expanded), window chrome and window resizing borders/handles.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/outerWidth">Window.outerWidth - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-outerwidth">The definition of 'Window.outerWidth' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static int outerWidth() {
    return globalThis().outerWidth();
  }

  /**
   * The read-only Window property pageXOffset is an alias for scrollX.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/pageXOffset">Window.pageXOffset - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-pagexoffset">The definition of 'window.pageXOffset' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static double pageXOffset() {
    return globalThis().pageXOffset();
  }

  /**
   * The read-only Window property pageYOffset is an alias for scrollY; as such, it returns the number of pixels the document is currently scrolled along the vertical axis (that is, up or down) with a value of 0.0, indicating that the top edge of the Document is currently aligned with the top edge of the window's content area.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/pageYOffset">Window.pageYOffset - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-pageyoffset">The definition of 'window.pageYOffset' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static double pageYOffset() {
    return globalThis().pageYOffset();
  }

  /**
   * The Window.parent property is a reference to the parent of the current window or subframe.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/parent">Window.parent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-parent">The definition of 'window.parent' in HTML Living Standard.</a>
   */
  @Nullable
  public static Window parent() {
    return globalThis().parent();
  }

  /**
   * The Window interface's performance property returns a Performance object, which can be used to gather performance information about the current document. It serves as the point of exposure for the Performance Timeline API, the High Resolution Time API, the Navigation Timing API, the User Timing API, and the Resource Timing API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/performance">Window.performance - MDN</a>
   * @see <a href="https://www.w3.org/TR/hr-time-1/#performance">The definition of 'window.performance' in High Resolution Time.</a>
   */
  @Nonnull
  public static Performance performance() {
    return globalThis().performance();
  }

  /**
   * Returns the personalbar object, whose visibility can be toggled in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/personalbar">Window.personalbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-personalbar">The definition of 'Window.personalbar' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-personalbar">The definition of 'Window.personalbar' in HTML5.</a>
   */
  @Nonnull
  public static BarProp personalbar() {
    return globalThis().personalbar();
  }

  /**
   * The Window property screen returns a reference to the screen object associated with the window. The screen object, implementing the Screen interface, is a special object for inspecting properties of the screen on which the current window is being rendered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screen">Window.screen - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screen">The definition of 'window.screen' in CSS Object Model (CSSOM) View Module.</a>
   */
  @Nonnull
  public static Screen screen() {
    return globalThis().screen();
  }

  /**
   * The Window.screenLeft read-only property returns the horizontal distance, in CSS pixels, from the left border of the user's browser viewport to the left side of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenLeft">Window.screenLeft - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screenx">The definition of 'Window.screenLeft' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static int screenLeft() {
    return globalThis().screenLeft();
  }

  /**
   * The Window.screenTop read-only property returns the vertical distance, in CSS pixels, from the top border of the user's browser viewport to the top side of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenTop">Window.screenTop - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screeny">The definition of 'Window.screenTop' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static int screenTop() {
    return globalThis().screenTop();
  }

  /**
   * The Window.screenX read-only property returns the horizontal distance, in CSS pixels, of the left border of the user's browser viewport to the left side of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenX">Window.screenX - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screenx">The definition of 'Window.screenX' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static int screenX() {
    return globalThis().screenX();
  }

  /**
   * The Window.screenY read-only property returns the vertical distance, in CSS pixels, of the top border of the user's browser viewport to the top edge of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/screenY">Window.screenY - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-screeny">The definition of 'Window.screenY' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static int screenY() {
    return globalThis().screenY();
  }

  /**
   * The read-only scrollX property of the Window interface returns the number of pixels that the document is currently scrolled horizontally. This value is subpixel precise in modern browsers, meaning that it isn't necessarily a whole number. You can get the number of pixels the document is scrolled vertically from the scrollY property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollX">Window.scrollX - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scrollx">The definition of 'window.scrollX' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static double scrollX() {
    return globalThis().scrollX();
  }

  /**
   * The read-only scrollY property of the Window interface returns the number of pixels that the document is currently scrolled vertically.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollY">Window.scrollY - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scrolly">The definition of 'window.scrollY' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static double scrollY() {
    return globalThis().scrollY();
  }

  /**
   * The Window.scrollbars property returns the scrollbars object, whose visibility can be checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollbars">Window.scrollbars - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-scrollbars">The definition of 'Window.scrollbars' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-scrollbars">The definition of 'Window.scrollbars' in HTML5.</a>
   */
  @Nonnull
  public static BarProp scrollbars() {
    return globalThis().scrollbars();
  }

  /**
   * The Window.self read-only property returns the window itself, as a WindowProxy. It can be used with dot notation on a window object (that is, window.self) or standalone (self). The advantage of the standalone notation is that a similar notation exists for non-window contexts, such as in Web Workers. By using self, you can refer to the global scope in a way that will work not only in a window context (self will resolve to window.self) but also in a worker context (self will then resolve to WorkerGlobalScope.self).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/self">Window.self - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-self">The definition of 'Window.self' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html51/browsers.html#dom-self">The definition of 'Window.self' in HTML 5.1.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-self">The definition of 'Window.self' in HTML5.</a>
   */
  @Nonnull
  public static Window self() {
    return globalThis().self();
  }

  /**
   * The read-only sessionStorage property accesses a session Storage object for the current origin. sessionStorage is similar to localStorage; the difference is that while data in localStorage doesn't expire, data in sessionStorage is cleared when the page session ends.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/sessionStorage">Window.sessionStorage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-sessionstorage">The definition of 'sessionStorage' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Storage sessionStorage() {
    return globalThis().sessionStorage();
  }

  /**
   * The speechSynthesis read-only property of the Window object returns a SpeechSynthesis object, which is the entry point into using Web Speech API speech synthesis functionality.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/speechSynthesis">Window.speechSynthesis - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#tts-section">The definition of 'SpeechSynthesis' in Web Speech API.</a>
   */
  @Nonnull
  public static SpeechSynthesis speechSynthesis() {
    return globalThis().speechSynthesis();
  }

  /**
   * The Window.statusbar property returns the statusbar object, whose visibility can be toggled in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/statusbar">Window.statusbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-statusbar">The definition of 'Window.statusbar' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-statusbar">The definition of 'Window.statusbar' in HTML5.</a>
   */
  @Nonnull
  public static BarProp statusbar() {
    return globalThis().statusbar();
  }

  /**
   * The Window.toolbar property returns the toolbar object, whose visibility can be toggled in the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/toolbar">Window.toolbar - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-toolbar">The definition of 'Window.toolbar' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-toolbar">The definition of 'Window.toolbar' in HTML5.</a>
   */
  @Nonnull
  public static BarProp toolbar() {
    return globalThis().toolbar();
  }

  /**
   * Returns a reference to the topmost window in the window hierarchy.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/top">Window.top - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-top">The definition of 'window.top' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-top">The definition of 'window.top' in HTML5.</a>
   */
  @Nullable
  public static Window top() {
    return globalThis().top();
  }

  /**
   * The visualViewport read-only property of the Window interface returns a VisualViewport object representing the visual viewport for a given window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/visualViewport">Window.visualViewport - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-window-visualviewport">The definition of 'visualViewport' in Visual Viewport API.</a>
   */
  @Nonnull
  public static VisualViewport visualViewport() {
    return globalThis().visualViewport();
  }

  /**
   * The window property of a Window object points to the window object itself.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/window">Window.window - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-window">The definition of 'Window.window' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html51/browsers.html#dom-window">The definition of 'Window.window' in HTML 5.1.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window">The definition of 'Window.window' in HTML5.</a>
   */
  @Nonnull
  public static Window window() {
    return globalThis().window();
  }

  /**
   * The Window.alert() method displays an alert dialog with the optional specified content and an OK button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/alert">Window.alert - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#dom-alert">The definition of 'alert()' in HTML Living Standard.</a>
   */
  public static void alert() {
    globalThis().alert();
  }

  /**
   * The Window.alert() method displays an alert dialog with the optional specified content and an OK button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/alert">Window.alert - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#dom-alert">The definition of 'alert()' in HTML Living Standard.</a>
   */
  public static void alert(@Nonnull String message) {
    globalThis().alert(message);
  }

  /**
   * Shifts focus away from the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/blur">Window.blur - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-window-blur">The definition of 'Window.blur()' in HTML Living Standard.</a>
   */
  public static void blur() {
    globalThis().blur();
  }

  /**
   * The Window.close() method closes the current window, or the window on which it was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/close">Window.close - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-window-close">The definition of 'window.close()' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-close">The definition of 'Window.close()' in HTML5.</a>
   */
  public static void close() {
    globalThis().close();
  }

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and two buttons: OK and Cancel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/confirm">Window.confirm - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#dom-confirm">The definition of 'confirm()' in HTML Living Standard.</a>
   */
  public static boolean confirm(@Nonnull String message) {
    return globalThis().confirm(message);
  }

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and two buttons: OK and Cancel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/confirm">Window.confirm - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#dom-confirm">The definition of 'confirm()' in HTML Living Standard.</a>
   */
  public static boolean confirm() {
    return globalThis().confirm();
  }

  /**
   * Makes a request to bring the window to the front. It may fail due to user settings and the window isn't guaranteed to be frontmost before this method returns.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/focus">Window.focus - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-window-focus">The definition of 'Window.focus()' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in HTML Living Standard.</a>
   */
  public static void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin, @Nonnull JsArray<Transferable> transfer) {
    globalThis().postMessage(message, targetOrigin, transfer);
  }

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in HTML Living Standard.</a>
   */
  public static void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin, @Nonnull Transferable[] transfer) {
    globalThis().postMessage(message, targetOrigin, transfer);
  }

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in HTML Living Standard.</a>
   */
  public static void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin) {
    globalThis().postMessage(message, targetOrigin);
  }

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in HTML Living Standard.</a>
   */
  public static void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull WindowPostMessageOptions options) {
    globalThis().postMessage(message, options);
  }

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/web-messaging.html#dom-window-postmessage">The definition of 'postMessage()' in HTML Living Standard.</a>
   */
  public static void postMessage(@DoNotAutobox @Nullable Object message) {
    globalThis().postMessage(message);
  }

  /**
   * Opens the Print Dialog to print the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/print">Window.print - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#printing">The definition of 'print()' in HTML Living Standard.</a>
   */
  public static void print() {
    globalThis().print();
  }

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#dom-prompt">The definition of 'prompt()' in HTML Living Standard.</a>
   */
  @Nullable
  public static String prompt(@Nonnull String message, @Nonnull String default_) {
    return globalThis().prompt(message, default_);
  }

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#dom-prompt">The definition of 'prompt()' in HTML Living Standard.</a>
   */
  @Nullable
  public static String prompt(@Nonnull String message) {
    return globalThis().prompt(message);
  }

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#dom-prompt">The definition of 'prompt()' in HTML Living Standard.</a>
   */
  @Nullable
  public static String prompt() {
    return globalThis().prompt();
  }

  /**
   * The window.stop() stops further resource loading in the current browsing context, equivalent to the stop button in the browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/stop">Window.stop - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-window-stop">The definition of 'Window.stop()' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/browsers.html#dom-window-stop">The definition of 'Window.stop' in HTML5.</a>
   */
  public static void stop() {
    globalThis().stop();
  }

  /**
   * The Window.getComputedStyle() method returns an object containing the values of all CSS properties of an element, after applying active stylesheets and resolving any basic computation those values may contain.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getComputedStyle">Window.getComputedStyle - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-window-getcomputedstyle">The definition of 'getComputedStyle()' in CSS Object Model (CSSOM).</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/#CSS-CSSview-getComputedStyle">The definition of 'getComputedStyle()' in Document Object Model (DOM) Level 2 Style Specification.</a>
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
   * @see <a href="https://drafts.csswg.org/cssom/#dom-window-getcomputedstyle">The definition of 'getComputedStyle()' in CSS Object Model (CSSOM).</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Style/#CSS-CSSview-getComputedStyle">The definition of 'getComputedStyle()' in Document Object Model (DOM) Level 2 Style Specification.</a>
   */
  @Nonnull
  public static CSSStyleDeclaration getComputedStyle(@Nonnull Element elt) {
    return globalThis().getComputedStyle(elt);
  }

  /**
   * The Window interface's matchMedia() method returns a new MediaQueryList object that can then be used to determine if the document matches the media query string, as well as to monitor the document to detect when it matches (or stops matching) that media query.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/matchMedia">Window.matchMedia - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-matchmedia">The definition of 'Window.matchMedia()' in CSS Object Model (CSSOM) View Module.</a>
   */
  @Nonnull
  public static MediaQueryList matchMedia(@Nonnull String query) {
    return globalThis().matchMedia(query);
  }

  /**
   * The moveBy() method of the Window interface moves the current window by a specified amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/moveBy">Window.moveBy - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-moveby">The definition of 'window.moveBy()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void moveBy(int x, int y) {
    globalThis().moveBy(x, y);
  }

  /**
   * The moveTo() method of the Window interface moves the current window to the specified coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/moveTo">Window.moveTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-moveto">The definition of 'window.moveTo()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void moveTo(int x, int y) {
    globalThis().moveTo(x, y);
  }

  /**
   * The Window.resizeBy() method resizes the current window by a specified amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/resizeBy">Window.resizeBy - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-resizeby">The definition of 'window.resizeBy()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void resizeBy(int x, int y) {
    globalThis().resizeBy(x, y);
  }

  /**
   * The Window.resizeTo() method dynamically resizes the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/resizeTo">Window.resizeTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-resizeto">The definition of 'window.resizeTo()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void resizeTo(int width, int height) {
    globalThis().resizeTo(width, height);
  }

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">The definition of 'window.scroll()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void scroll(@Nonnull ScrollToOptions options) {
    globalThis().scroll(options);
  }

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">The definition of 'window.scroll()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void scroll() {
    globalThis().scroll();
  }

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">The definition of 'window.scroll()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void scroll(double x, double y) {
    globalThis().scroll(x, y);
  }

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scrollby">The definition of 'window.scrollBy()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void scrollBy(@Nonnull ScrollToOptions options) {
    globalThis().scrollBy(options);
  }

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scrollby">The definition of 'window.scrollBy()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void scrollBy() {
    globalThis().scrollBy();
  }

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scrollby">The definition of 'window.scrollBy()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void scrollBy(double x, double y) {
    globalThis().scrollBy(x, y);
  }

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">The definition of 'window.scroll()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void scrollTo(@Nonnull ScrollToOptions options) {
    globalThis().scrollTo(options);
  }

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">The definition of 'window.scroll()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void scrollTo() {
    globalThis().scrollTo();
  }

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-window-scroll">The definition of 'window.scroll()' in CSS Object Model (CSSOM) View Module.</a>
   */
  public static void scrollTo(double x, double y) {
    globalThis().scrollTo(x, y);
  }

  /**
   * The Window.getSelection() method returns a Selection object representing the range of text selected by the user or the current position of the caret.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getSelection">Window.getSelection - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#extensions-to-window-interface">The definition of 'Window.getSelection()' in Selection API.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-atob">The definition of 'WindowOrWorkerGlobalScope.atob()' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html51/#dom-windowbase64-atob">The definition of 'WindowBase64.atob()' in HTML 5.1.</a>
   * @see <a href="https://www.w3.org/TR/html52/#dom-windowbase64-atob">The definition of 'WindowBase64.atob()' in HTML5.</a>
   */
  @Nonnull
  public static String atob(@Nonnull String data) {
    return globalThis().atob(data);
  }

  /**
   * The WindowOrWorkerGlobalScope.btoa() method creates a Base64-encoded ASCII string from a binary string (i.e., a String object in which each character in the string is treated as a byte of binary data).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/btoa">Window.btoa - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-btoa">The definition of 'WindowOrWorkerGlobalScope.btoa()' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html51/#dom-windowbase64-btoa">The definition of 'WindowBase64.btoa()' in HTML 5.1.</a>
   * @see <a href="https://www.w3.org/TR/html52/#dom-windowbase64-btoa">The definition of 'WindowBase64.btoa()' in HTML5.</a>
   */
  @Nonnull
  public static String btoa(@Nonnull String data) {
    return globalThis().btoa(data);
  }

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearInterval">Window.clearInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-clearinterval">The definition of 'WindowOrWorkerGlobalScope.clearInterval()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-clearinterval">The definition of 'clearInterval()' in HTML Living Standard.</a>
   */
  public static void clearInterval(int handle) {
    globalThis().clearInterval(handle);
  }

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearInterval">Window.clearInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-clearinterval">The definition of 'WindowOrWorkerGlobalScope.clearInterval()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-clearinterval">The definition of 'clearInterval()' in HTML Living Standard.</a>
   */
  public static void clearInterval() {
    globalThis().clearInterval();
  }

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearTimeout">Window.clearTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-cleartimeout">The definition of 'WindowOrWorkerGlobalScope.clearTimeout()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-cleartimeout">The definition of 'clearTimeout()' in HTML Living Standard.</a>
   */
  public static void clearTimeout(int handle) {
    globalThis().clearTimeout(handle);
  }

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/clearTimeout">Window.clearTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-cleartimeout">The definition of 'WindowOrWorkerGlobalScope.clearTimeout()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-cleartimeout">The definition of 'clearTimeout()' in HTML Living Standard.</a>
   */
  public static void clearTimeout() {
    globalThis().clearTimeout();
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
   */
  @Nonnull
  public static Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image) {
    return globalThis().createImageBitmap(image);
  }

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-createimagebitmap">The definition of 'createImageBitmap' in HTML Living Standard.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/timers-and-user-prompts.html#microtask-queuing">The definition of 'self.queueMicrotask()' in HTML Living Standard.</a>
   */
  public static void queueMicrotask(@Nonnull VoidFunction callback) {
    globalThis().queueMicrotask(callback);
  }

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in HTML Living Standard.</a>
   */
  public static int setInterval(@Nonnull TimerHandler handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments) {
    return globalThis().setInterval(handler, timeout, arguments);
  }

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in HTML Living Standard.</a>
   */
  public static int setInterval(@Nonnull String handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments) {
    return globalThis().setInterval(handler, timeout, arguments);
  }

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in HTML Living Standard.</a>
   */
  public static int setInterval(@Nonnull Function handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments) {
    return globalThis().setInterval(handler, timeout, arguments);
  }

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in HTML Living Standard.</a>
   */
  public static int setInterval(@Nonnull TimerHandler handler, int timeout) {
    return globalThis().setInterval(handler, timeout);
  }

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in HTML Living Standard.</a>
   */
  public static int setInterval(@Nonnull String handler, int timeout) {
    return globalThis().setInterval(handler, timeout);
  }

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setInterval">Window.setInterval - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowOrWorkerGlobalScope.setInterval()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-setinterval">The definition of 'WindowTimers.setInterval()' in HTML Living Standard.</a>
   */
  public static int setInterval(@Nonnull Function handler, int timeout) {
    return globalThis().setInterval(handler, timeout);
  }

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in HTML Living Standard.</a>
   */
  public static int setTimeout(@Nonnull TimerHandler handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments) {
    return globalThis().setTimeout(handler, timeout, arguments);
  }

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in HTML Living Standard.</a>
   */
  public static int setTimeout(@Nonnull String handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments) {
    return globalThis().setTimeout(handler, timeout, arguments);
  }

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in HTML Living Standard.</a>
   */
  public static int setTimeout(@Nonnull Function handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments) {
    return globalThis().setTimeout(handler, timeout, arguments);
  }

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in HTML Living Standard.</a>
   */
  public static int setTimeout(@Nonnull TimerHandler handler, int timeout) {
    return globalThis().setTimeout(handler, timeout);
  }

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in HTML Living Standard.</a>
   */
  public static int setTimeout(@Nonnull String handler, int timeout) {
    return globalThis().setTimeout(handler, timeout);
  }

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/setTimeout">Window.setTimeout - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowOrWorkerGlobalScope.setTimeout()' in HTML Living Standard.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-settimeout">The definition of 'WindowTimers.setTimeout()' in HTML Living Standard.</a>
   */
  public static int setTimeout(@Nonnull Function handler, int timeout) {
    return globalThis().setTimeout(handler, timeout);
  }

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/fetch">Window.fetch - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in Fetch.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in Fetch.</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in Fetch.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in Fetch.</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in Fetch.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in Fetch.</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in Fetch.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in Fetch.</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in Fetch.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in Fetch.</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#fetch-method">The definition of 'fetch()' in Fetch.</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-global-fetch">The definition of 'fetch()' in Fetch.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/#animationframeprovider-cancelanimationframe">The definition of 'cancelAnimationFrame()' in HTML Living Standard.</a>
   */
  public static void cancelAnimationFrame(int handle) {
    globalThis().cancelAnimationFrame(handle);
  }

  /**
   * The window.requestAnimationFrame() method tells the browser that you wish to perform an animation and requests that the browser calls a specified function to update an animation before the next repaint. The method takes a callback as an argument to be invoked before the repaint.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/requestAnimationFrame">Window.requestAnimationFrame - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#animation-frames">The definition of 'requestAnimationFrame' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/animation-timing/#dom-windowanimationtiming-requestanimationframe">The definition of 'requestAnimationFrame' in Timing control for script-based animations.</a>
   */
  public static int requestAnimationFrame(@Nonnull FrameRequestCallback callback) {
    return globalThis().requestAnimationFrame(callback);
  }

  /**
   * The EventTarget method addEventListener() sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">EventTarget.addEventListener - MDN</a>
   */
  public static void addEventListener(@Nonnull String type, @Nullable EventListener callback,
      @Nonnull AddEventListenerOptions options) {
    globalThis().addEventListener(type, callback, options);
  }

  /**
   * The EventTarget method addEventListener() sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">EventTarget.addEventListener - MDN</a>
   */
  public static void addEventListener(@Nonnull String type, @Nullable EventListener callback,
      boolean options) {
    globalThis().addEventListener(type, callback, options);
  }

  /**
   * The EventTarget method addEventListener() sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">EventTarget.addEventListener - MDN</a>
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
   */
  public static void removeEventListener(@Nonnull String type, @Nullable EventListener callback,
      @Nonnull EventListenerOptions options) {
    globalThis().removeEventListener(type, callback, options);
  }

  /**
   * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously registered with EventTarget.addEventListener(). The event listener to be removed is identified using a combination of the event type, the event listener function itself, and various optional options that may affect the matching process; see Matching event listeners for removal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener">EventTarget.removeEventListener - MDN</a>
   */
  public static void removeEventListener(@Nonnull String type, @Nullable EventListener callback,
      boolean options) {
    globalThis().removeEventListener(type, callback, options);
  }

  /**
   * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously registered with EventTarget.addEventListener(). The event listener to be removed is identified using a combination of the event type, the event listener function itself, and various optional options that may affect the matching process; see Matching event listeners for removal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener">EventTarget.removeEventListener - MDN</a>
   */
  public static void removeEventListener(@Nonnull String type, @Nullable EventListener callback) {
    globalThis().removeEventListener(type, callback);
  }

  @Nonnull
  public static Console console() {
    return globalThis().console();
  }

  @Nonnull
  public static CSS css() {
    return globalThis().css();
  }

  @Nonnull
  public static WebAssembly webAssembly() {
    return globalThis().webAssembly();
  }

  @Nonnull
  public static Atomics atomics() {
    return globalThis().atomics();
  }
}
