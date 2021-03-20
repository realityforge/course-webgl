package akasha.perf;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PerformanceResourceTiming interface enables retrieval and analysis of detailed network timing data regarding the loading of an application's resources. An application can use the timing metrics to determine, for example, the length of time it takes to fetch a specific resource, such as an XMLHttpRequest, &lt;SVG&gt;, image, or script.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming">PerformanceResourceTiming - MDN</a>
 * @see <a href="https://www.w3.org/TR/resource-timing-1/#performanceresourcetiming">PerformanceResourceTiming - Resource Timing Level 1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceResourceTiming"
)
public class PerformanceResourceTiming extends PerformanceEntry {
  protected PerformanceResourceTiming() {
  }

  /**
   * The connectEnd read-only property returns the timestamp immediately after the browser finishes establishing the connection to the server to retrieve the resource. The timestamp value includes the time interval to establish the transport connection, as well as other time intervals such as SSL handshake and SOCKS authentication.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/connectEnd">PerformanceResourceTiming.connectEnd - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performanceresourcetiming-connectend">connectEnd - Resource Timing Level 1</a>
   */
  @JsProperty(
      name = "connectEnd"
  )
  public native double connectEnd();

  /**
   * The connectStart read-only property returns the timestamp immediately before the user agent starts establishing the connection to the server to retrieve the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/connectStart">PerformanceResourceTiming.connectStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performanceresourcetiming-connectstart">connectStart - Resource Timing Level 1</a>
   */
  @JsProperty(
      name = "connectStart"
  )
  public native double connectStart();

  /**
   * The decodedBodySize read-only property returns the size (in octets) received from the fetch (HTTP or cache) of the message body, after removing any applied content-codings. If the resource is retrieved from an application cache or local resources, it returns the size of the payload after removing any applied content-codings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/decodedBodySize">PerformanceResourceTiming.decodedBodySize - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-2/#dom-performanceresourcetiming-decodedbodysize">decodedBodySize - Resource Timing Level 2</a>
   */
  @JsProperty(
      name = "decodedBodySize"
  )
  public native int decodedBodySize();

  /**
   * The domainLookupEnd read-only property returns the timestamp immediately after the browser finishes the domain name lookup for the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/domainLookupEnd">PerformanceResourceTiming.domainLookupEnd - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performanceresourcetiming-domainlookupend">domainLookupEnd - Resource Timing Level 1</a>
   */
  @JsProperty(
      name = "domainLookupEnd"
  )
  public native double domainLookupEnd();

  /**
   * The domainLookupStart read-only property returns the timestamp immediately before the browser starts the domain name lookup for the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/domainLookupStart">PerformanceResourceTiming.domainLookupStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performanceresourcetiming-domainlookupstart">domainLookupStart - Resource Timing Level 1</a>
   */
  @JsProperty(
      name = "domainLookupStart"
  )
  public native double domainLookupStart();

  /**
   * The encodedBodySize read-only property represents the size (in octets) received from the fetch (HTTP or cache), of the payload body, before removing any applied content-codings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/encodedBodySize">PerformanceResourceTiming.encodedBodySize - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-2/#dom-performanceresourcetiming-encodedbodysize">encodedBodySize - Resource Timing Level 2</a>
   */
  @JsProperty(
      name = "encodedBodySize"
  )
  public native int encodedBodySize();

  /**
   * The fetchStart read-only property represents a timestamp immediately before the browser starts to fetch the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/fetchStart">PerformanceResourceTiming.fetchStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performanceresourcetiming-fetchstart">fetchStart - Resource Timing Level 1</a>
   */
  @JsProperty(
      name = "fetchStart"
  )
  public native double fetchStart();

  /**
   * The initiatorType read-only property is a string that represents the type of resource that initiated the performance event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/initiatorType">PerformanceResourceTiming.initiatorType - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performanceresourcetiming-initiatortype">initiatorType - Resource Timing Level 1</a>
   */
  @JsProperty(
      name = "initiatorType"
  )
  @Nonnull
  public native String initiatorType();

  /**
   * The nextHopProtocol read-only property is a string representing the network protocol used to fetch the resource, as identified by the ALPN Protocol ID (RFC7301).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/nextHopProtocol">PerformanceResourceTiming.nextHopProtocol - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-2/#dom-performanceresourcetiming-nexthopprotocol">nextHopProtocol - Resource Timing Level 2</a>
   */
  @JsProperty(
      name = "nextHopProtocol"
  )
  @Nonnull
  public native String nextHopProtocol();

  /**
   * The redirectEnd read-only property returns a timestamp immediately after receiving the last byte of the response of the last redirect.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/redirectEnd">PerformanceResourceTiming.redirectEnd - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performanceresourcetiming-redirectend">redirectEnd - Resource Timing Level 1</a>
   */
  @JsProperty(
      name = "redirectEnd"
  )
  public native double redirectEnd();

  /**
   * The redirectStart read-only property returns a timestamp representing the start time of the fetch which that initiates the redirect.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/redirectStart">PerformanceResourceTiming.redirectStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performanceresourcetiming-redirectstart">redirectStart - Resource Timing Level 1</a>
   */
  @JsProperty(
      name = "redirectStart"
  )
  public native double redirectStart();

  /**
   * The requestStart read-only property returns a timestamp of the time immediately before the browser starts requesting the resource from the server, cache, or local resource. If the transport connection fails and the browser retires the request, the value returned will be the start of the retry request.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/requestStart">PerformanceResourceTiming.requestStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performanceresourcetiming-requeststart">requestStart - Resource Timing Level 1</a>
   */
  @JsProperty(
      name = "requestStart"
  )
  public native double requestStart();

  /**
   * The responseEnd read-only property returns a timestamp immediately after the browser receives the last byte of the resource or immediately before the transport connection is closed, whichever comes first.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/responseEnd">PerformanceResourceTiming.responseEnd - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performanceresourcetiming-responseend">responseEnd - Resource Timing Level 1</a>
   */
  @JsProperty(
      name = "responseEnd"
  )
  public native double responseEnd();

  /**
   * The responseStart read-only property returns a timestamp immediately after the browser receives the first byte of the response from the server, cache, or local resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/responseStart">PerformanceResourceTiming.responseStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performanceresourcetiming-responsestart">responseStart - Resource Timing Level 1</a>
   */
  @JsProperty(
      name = "responseStart"
  )
  public native double responseStart();

  /**
   * The secureConnectionStart read-only property returns a timestamp immediately before the browser starts the handshake process to secure the current connection. If a secure connection is not used, the property returns zero.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/secureConnectionStart">PerformanceResourceTiming.secureConnectionStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performanceresourcetiming-secureconnectionstart">secureConnectionStart - Resource Timing Level 1</a>
   */
  @JsProperty(
      name = "secureConnectionStart"
  )
  public native double secureConnectionStart();

  /**
   * The transferSize read-only property represents the size (in octets) of the fetched resource. The size includes the response header fields plus the response payload body (as defined by RFC7230).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/transferSize">PerformanceResourceTiming.transferSize - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-2/#dom-performanceresourcetiming-transfersize">transferSize - Resource Timing Level 2</a>
   */
  @JsProperty(
      name = "transferSize"
  )
  public native int transferSize();

  /**
   * The workerStart read-only property of the PerformanceResourceTiming interface returns a DOMHighResTimeStamp immediately before dispatching the FetchEvent if a Service Worker thread is already running, or immediately before starting the Service Worker thread if it is not already running. If the resource is not intercepted by a Service Worker the property will always return 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/workerStart">PerformanceResourceTiming.workerStart - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-2/#dom-performanceresourcetiming-workerstart">workerStart - Resource Timing Level 2</a>
   */
  @JsProperty(
      name = "workerStart"
  )
  public native double workerStart();

  /**
   * The toJSON() method is a serializer that returns a JSON representation of the PerformanceResourceTiming object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceResourceTiming/toJSON">PerformanceResourceTiming.toJSON - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-2/#dom-performanceresourcetiming-tojson">toJSON - Resource Timing Level 2</a>
   */
  @Nonnull
  public native Object toJSON();
}
