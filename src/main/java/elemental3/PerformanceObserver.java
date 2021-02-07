package elemental3;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PerformanceObserver interface is used to observe performance measurement events and be notified of new performance entries as they are recorded in the browser's performance timeline.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceObserver">PerformanceObserver - MDN</a>
 * @see <a href="https://w3c.github.io/performance-timeline/#dom-performanceobserver">PerformanceObserver - Performance Timeline Level 2</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceObserver"
)
public class PerformanceObserver {
  /**
   * The PerformanceObserver() constructor creates a new PerformanceObserver object with the given observer callback. The observer callback is invoked when performance entry events are recorded for the entry types that have been registered, via the observe() method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceObserver/PerformanceObserver">PerformanceObserver.PerformanceObserver - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#idl-def-performanceobservercallback">PerformanceObserver() - Performance Timeline Level 2</a>
   */
  public PerformanceObserver(@Nonnull final PerformanceObserverCallback callback) {
  }

  @JsProperty(
      name = "supportedEntryTypes"
  )
  @Nonnull
  public static native JsArray<String> supportedEntryTypes();

  /**
   * The disconnect() method of the PerformanceObserver interface is used to stop the performance observer from receiving any performance entry events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceObserver/disconnect">PerformanceObserver.disconnect - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performanceobserver-disconnect">disconnect() - Performance Timeline Level 2</a>
   */
  public native void disconnect();

  /**
   * The observe() method of the PerformanceObserver interface is used to specify the set of performance entry types to observe.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceObserver/observe">PerformanceObserver.observe - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performanceobserver-observe">observe() - Performance Timeline Level 2</a>
   */
  public native void observe(@Nonnull PerformanceObserverInit options);

  /**
   * The observe() method of the PerformanceObserver interface is used to specify the set of performance entry types to observe.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceObserver/observe">PerformanceObserver.observe - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performanceobserver-observe">observe() - Performance Timeline Level 2</a>
   */
  public native void observe();

  /**
   * The takeRecords() method of the PerformanceObserver interface returns the current list of performance entries stored in the performance observer, emptying it out.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceObserver/takeRecords">PerformanceObserver.takeRecords - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performanceobserver-takerecords">takeRecords() - Performance Timeline Level 2</a>
   */
  @Nonnull
  public native JsArray<PerformanceEntry> takeRecords();
}
