package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PerformanceTiming interface is a legacy interface kept for backwards compatibility and contains properties that offer performance timing information for various events which occur during the loading and use of the current page. You get a PerformanceTiming object describing your page using the window.performance.timing property.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming">PerformanceTiming - MDN</a>
 * @see <a href="https://www.w3.org/TR/navigation-timing/#performancetiming">The definition of 'PerformanceTiming' in the 'Navigation Timing' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceTiming"
)
public class PerformanceTiming {
  protected PerformanceTiming() {
  }

  /**
   * The legacy PerformanceTiming.connectEnd read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, where the connection is opened network. If the transport layer reports an error and the connection establishment is started again, the last connection establisment end time is given. If a persistent connection is used, the value will be the same as PerformanceTiming.fetchStart. A connection is considered as opened when all secure connection handshake, or SOCKS authentication, is terminated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/connectEnd">PerformanceTiming.connectEnd - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-connectend">The definition of 'PerformanceTiming.connectEnd' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "connectEnd"
  )
  public native int connectEnd();

  /**
   * The legacy PerformanceTiming.connectStart read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, where the request to open a connection is sent to the network. If the transport layer reports an error and the connection establishment is started again, the last connection establisment start time is given. If a persistent connection is used, the value will be the same as PerformanceTiming.fetchStart.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/connectStart">PerformanceTiming.connectStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-connectstart">The definition of 'PerformanceTiming.connectStart' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "connectStart"
  )
  public native int connectStart();

  /**
   * The legacy PerformanceTiming.domComplete read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, when the parser finished its work on the main document, that is when its Document.readyState changes to 'complete' and the corresponding readystatechange event is thrown.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/domComplete">PerformanceTiming.domComplete - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-domcomplete">The definition of 'PerformanceTiming.domComplete' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "domComplete"
  )
  public native int domComplete();

  /**
   * The legacy PerformanceTiming.domContentLoadedEventEnd read-only property returns an unsigned long long representing the moment, in milliseconds since the UNIX epoch, right after all the scripts that need to be executed as soon as possible, in order or not, has been executed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/domContentLoadedEventEnd">PerformanceTiming.domContentLoadedEventEnd - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-domcontentloadedeventend">The definition of 'PerformanceTiming.domContentLoadedEventEnd' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "domContentLoadedEventEnd"
  )
  public native int domContentLoadedEventEnd();

  /**
   * The legacy PerformanceTiming.domContentLoadedEventStart read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, right before the parser sent the DOMContentLoaded event, that is right after all the scripts that need to be executed right after parsing has been executed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/domContentLoadedEventStart">PerformanceTiming.domContentLoadedEventStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-domcontentloadedeventstart">The definition of 'PerformanceTiming.domContentLoadedEventStart' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "domContentLoadedEventStart"
  )
  public native int domContentLoadedEventStart();

  /**
   * The legacy PerformanceTiming.domInteractive read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, when the parser finished its work on the main document, that is when its Document.readyState changes to 'interactive' and the corresponding readystatechange event is thrown.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/domInteractive">PerformanceTiming.domInteractive - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-dominteractive">The definition of 'PerformanceTiming.domInteractive' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "domInteractive"
  )
  public native int domInteractive();

  /**
   * The legacy PerformanceTiming.domLoading read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, when the parser started its work, that is when its Document.readyState changes to 'loading' and the corresponding readystatechange event is thrown.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/domLoading">PerformanceTiming.domLoading - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-domloading">The definition of 'PerformanceTiming.domLoading' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "domLoading"
  )
  public native int domLoading();

  /**
   * The legacy PerformanceTiming.domainLookupEnd read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, where the domain lookup is finished. If a persistent connection is used, or the information is stored in a cache or a local resource, the value will be the same as PerformanceTiming.fetchStart.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/domainLookupEnd">PerformanceTiming.domainLookupEnd - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-domainlookupend">The definition of 'PerformanceTiming.domainLookupEnd' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "domainLookupEnd"
  )
  public native int domainLookupEnd();

  /**
   * The legacy PerformanceTiming.domainLookupStart read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, where the domain lookup starts. If a persistent connection is used, or the information is stored in a cache or a local resource, the value will be the same as PerformanceTiming.fetchStart.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/domainLookupStart">PerformanceTiming.domainLookupStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-domainlookupstart">The definition of 'PerformanceTiming.domainLookupStart' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "domainLookupStart"
  )
  public native int domainLookupStart();

  /**
   * The legacy PerformanceTiming.fetchStart read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, the browser is ready to fetch the document using an HTTP request. This moment is before the check to any application cache.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/fetchStart">PerformanceTiming.fetchStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-fetchstart">The definition of 'PerformanceTiming.fetchStart' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "fetchStart"
  )
  public native int fetchStart();

  /**
   * The legacy PerformanceTiming.loadEventEnd read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, when the load event handler terminated, that is when the load event is completed. If this event has not yet been sent, or is not yet completed, it returns 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/loadEventEnd">PerformanceTiming.loadEventEnd - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-loadedeventend">The definition of 'PerformanceTiming.loadEventEnd' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "loadEventEnd"
  )
  public native int loadEventEnd();

  /**
   * The legacy PerformanceTiming.loadEventStart read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, when the load event was sent for the current document. If this event has not yet been sent, it returns 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/loadEventStart">PerformanceTiming.loadEventStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-loadeventstart">The definition of 'PerformanceTiming.loadEventStart' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "loadEventStart"
  )
  public native int loadEventStart();

  /**
   * The legacy PerformanceTiming.navigationStart read-only property returns an unsigned long long representing the moment, in milliseconds since the UNIX epoch, right after the prompt for unload terminates on the previous document in the same browsing context. If there is no previous document, this value will be the same as PerformanceTiming.fetchStart.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/navigationStart">PerformanceTiming.navigationStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-navigationstart">The definition of 'PerformanceTiming.navigationStart' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "navigationStart"
  )
  public native int navigationStart();

  /**
   * The legacy PerformanceTiming.redirectEnd read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, the last HTTP redirect is completed, that is when the last byte of the HTTP response has been received. If there is no redirect, or if one of the redirect is not of the same origin, the value returned is 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/redirectEnd">PerformanceTiming.redirectEnd - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-redirectend">The definition of 'PerformanceTiming.redirectEnd' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "redirectEnd"
  )
  public native int redirectEnd();

  /**
   * The legacy PerformanceTiming.redirectStart read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, the first HTTP redirect starts. If there is no redirect, or if one of the redirect is not of the same origin, the value returned is 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/redirectStart">PerformanceTiming.redirectStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-redirectstart">The definition of 'PerformanceTiming.redirectStart' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "redirectStart"
  )
  public native int redirectStart();

  /**
   * The legacy PerformanceTiming.requestStart read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, when the browser sent the request to obtain the actual document, from the server or from a cache. If the transport layer fails after the start of the request and the connection is reopened, this property will be set to the time corresponding to the new request.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/requestStart">PerformanceTiming.requestStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-requeststart">The definition of 'PerformanceTiming.requestStart' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "requestStart"
  )
  public native int requestStart();

  /**
   * The legacy PerformanceTiming.responseEnd read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, when the browser received the last byte of the response, or when the connection is closed if this happened first, from the server from a cache or from a local resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/responseEnd">PerformanceTiming.responseEnd - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-responseEnd">The definition of 'PerformanceTiming.responseEnd' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "responseEnd"
  )
  public native int responseEnd();

  /**
   * The legacy PerformanceTiming.responseStart read-only property returns an unsigned long long representing the moment in time (in milliseconds since the UNIX epoch) when the browser received the first byte of the response from the server, cache, or local resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/responseStart">PerformanceTiming.responseStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-responsestart">The definition of 'PerformanceTiming.responseStart' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "responseStart"
  )
  public native int responseStart();

  /**
   * The legacy PerformanceTiming.secureConnectionStart read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, where the secure connection handshake starts. If no such connection is requested, it returns 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/secureConnectionStart">PerformanceTiming.secureConnectionStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-secureconnectionstart">The definition of 'PerformanceTiming.secureConnectionStart' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "secureConnectionStart"
  )
  public native int secureConnectionStart();

  /**
   * The legacy PerformanceTiming.unloadEventEnd read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, the unload event handler finishes. If there is no previous document, or if the previous document, or one of the needed redirects, is not of the same origin, the value returned is 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/unloadEventEnd">PerformanceTiming.unloadEventEnd - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-unloadeventend">The definition of 'PerformanceTiming.unloadEventEnd' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "unloadEventEnd"
  )
  public native int unloadEventEnd();

  /**
   * The legacy PerformanceTiming.unloadEventStart read-only property returns an unsigned long long representing the moment, in miliseconds since the UNIX epoch, the unload event has been thrown. If there is no previous document, or if the previous document, or one of the needed redirects, is not of the same origin, the value returned is 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming/unloadEventStart">PerformanceTiming.unloadEventStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancetiming-unloadeventstart">The definition of 'PerformanceTiming.unloadEventStart' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "unloadEventStart"
  )
  public native int unloadEventStart();

  @Nonnull
  public native Object toJSON();
}
