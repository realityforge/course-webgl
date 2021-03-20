package akasha.perf;

import akasha.AddEventListenerOptions;
import akasha.EventHandler;
import akasha.EventListener;
import akasha.EventListenerOptions;
import akasha.EventTarget;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The Performance interface provides access to performance-related information for the current page. It's part of the High Resolution Time API, but is enhanced by the Performance Timeline API, the Navigation Timing API, the User Timing API, and the Resource Timing API.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance">Performance - MDN</a>
 * @see <a href="https://www.w3.org/TR/hr-time-2/#sec-performance">Performance - High Resolution Time Level 2</a>
 * @see <a href="https://www.w3.org/TR/hr-time-1/#performance">Performance - High Resolution Time</a>
 * @see <a href="https://w3c.github.io/performance-timeline/#extensions-to-the-performance-interface">Performance extensions - Performance Timeline Level 2</a>
 * @see <a href="https://www.w3.org/TR/performance-timeline/#extensions-to-the-performance-interface">Performance extensions - Performance Timeline</a>
 * @see <a href="https://www.w3.org/TR/resource-timing-1/#extensions-performance-interface">Performance extensions - Resource Timing Level 1</a>
 * @see <a href="https://w3c.github.io/user-timing/#extensions-performance-interface">Performance extensions - User Timing Level 2</a>
 * @see <a href="https://www.w3.org/TR/user-timing/#extensions-performance-interface">Performance extensions - User Timing</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Performance"
)
public class Performance extends EventTarget {
  /**
   * The onresourcetimingbufferfull property is an event handler that will be called when the resourcetimingbufferfull event is fired. This event is fired when the browser's resource timing performance buffer is full.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/onresourcetimingbufferfull">Performance.onresourcetimingbufferfull - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performance-onresourcetimingbufferfull">onresourcetimingbufferfull - Resource Timing Level 1</a>
   */
  @Nullable
  public EventHandler onresourcetimingbufferfull;

  protected Performance() {
  }

  /**
   * The legacy Performance.navigation read-only property returns a PerformanceNavigation object representing the type of navigation that occurs in the given browsing context, such as the number of redirections needed to fetch the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/navigation">Performance.navigation - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#sec-window.performance-attribute">Performance.navigation - Navigation Timing</a>
   */
  @JsProperty(
      name = "navigation"
  )
  @Nonnull
  public native PerformanceNavigation navigation();

  /**
   * The timeOrigin read-only property of the Performance interface returns the high resolution timestamp of the start time of the performance measurement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/timeOrigin">Performance.timeOrigin - MDN</a>
   */
  @JsProperty(
      name = "timeOrigin"
  )
  public native double timeOrigin();

  /**
   * The legacy Performance.timing read-only property returns a PerformanceTiming object containing latency-related performance information.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/timing">Performance.timing - MDN</a>
   * @see <a href="https://w3c.github.io/navigation-timing/#obsolete">Navigation Timing Level 2</a>
   */
  @JsProperty(
      name = "timing"
  )
  @Nonnull
  public native PerformanceTiming timing();

  /**
   * The performance.now() method returns a DOMHighResTimeStamp, measured in milliseconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/now">Performance.now - MDN</a>
   * @see <a href="https://www.w3.org/TR/hr-time-2/#dom-performance-now">performance.now() - High Resolution Time Level 2</a>
   * @see <a href="https://www.w3.org/TR/hr-time-1/#dom-performance-now">performance.now() - High Resolution Time</a>
   */
  public native double now();

  /**
   * The toJSON() method of the Performance interface is a standard serializer: it returns a JSON representation of the performance object's properties.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/toJSON">Performance.toJSON - MDN</a>
   * @see <a href="https://www.w3.org/TR/hr-time-2/#dom-performance-tojson">toJSON() serializer - High Resolution Time Level 2</a>
   */
  @Nonnull
  public native Object toJSON();

  /**
   * The getEntries() method returns a list of all PerformanceEntry objects for the page. The list's members (entries) can be created by making performance marks or measures (for example by calling the mark() method) at explicit points in time. If you are only interested in performance entries of certain types or that have certain names, see getEntriesByType() and getEntriesByName().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/getEntries">Performance.getEntries - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performance-getentries">getEntries() - Performance Timeline Level 2</a>
   * @see <a href="https://www.w3.org/TR/performance-timeline/#dom-performance-getentries">getEntries() - Performance Timeline</a>
   */
  @Nonnull
  public native JsArray<PerformanceEntry> getEntries();

  /**
   * The getEntriesByName() method returns a list of PerformanceEntry objects for the given name and type. The list's members (entries) can be created by making performance marks or measures (for example by calling the mark() method) at explicit points in time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/getEntriesByName">Performance.getEntriesByName - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performance-getentriesbyname">getEntriesByName() - Performance Timeline Level 2</a>
   * @see <a href="https://www.w3.org/TR/performance-timeline/#dom-performance-getentriesbyname">getEntriesByName() - Performance Timeline</a>
   */
  @Nonnull
  public native JsArray<PerformanceEntry> getEntriesByName(@Nonnull String name,
      @Nonnull String type);

  /**
   * The getEntriesByName() method returns a list of PerformanceEntry objects for the given name and type. The list's members (entries) can be created by making performance marks or measures (for example by calling the mark() method) at explicit points in time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/getEntriesByName">Performance.getEntriesByName - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performance-getentriesbyname">getEntriesByName() - Performance Timeline Level 2</a>
   * @see <a href="https://www.w3.org/TR/performance-timeline/#dom-performance-getentriesbyname">getEntriesByName() - Performance Timeline</a>
   */
  @Nonnull
  public native JsArray<PerformanceEntry> getEntriesByName(@Nonnull String name);

  /**
   * The getEntriesByType() method returns a list of PerformanceEntry objects for a given type. The list's members (entries) can be created by making performance marks or measures (for example by calling the mark() method) at explicit points in time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/getEntriesByType">Performance.getEntriesByType - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performance-getentriesbytype">getEntriesByType() - Performance Timeline Level 2</a>
   * @see <a href="https://www.w3.org/TR/performance-timeline/#dom-performance-getentriesbytype">getEntriesByType() - Performance Timeline</a>
   */
  @Nonnull
  public native JsArray<PerformanceEntry> getEntriesByType(@Nonnull String type);

  /**
   * The clearResourceTimings() method removes all performance entries with an entryType of &quot;resource&quot; from the browser's performance data buffer and sets the size of the performance data buffer to zero. To set the size of the browser's performance data buffer, use the Performance.setResourceTimingBufferSize() method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/clearResourceTimings">Performance.clearResourceTimings - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performance-clearresourcetimings">clearResourceTimings() - Resource Timing Level 1</a>
   */
  public native void clearResourceTimings();

  /**
   * The setResourceTimingBufferSize() method sets the browser's resource timing buffer size to the specified number of &quot;resource&quot; performance entry type objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/setResourceTimingBufferSize">Performance.setResourceTimingBufferSize - MDN</a>
   * @see <a href="https://www.w3.org/TR/resource-timing-1/#dom-performance-setresourcetimingbuffersize">setResourceTimingBufferSize() - Resource Timing Level 1</a>
   */
  public native void setResourceTimingBufferSize(int maxSize);

  /**
   * The clearMarks() method removes the named mark from the browser's performance entry buffer. If the method is called with no arguments, all performance entries with an entry type of &quot;mark&quot; will be removed from the performance entry buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/clearMarks">Performance.clearMarks - MDN</a>
   * @see <a href="https://w3c.github.io/user-timing/#dom-performance-clearmarks">clearMarks() - User Timing Level 2</a>
   * @see <a href="https://www.w3.org/TR/user-timing/#dom-performance-clearmarks">clearMarks() - User Timing</a>
   */
  public native void clearMarks(@Nonnull String markName);

  /**
   * The clearMarks() method removes the named mark from the browser's performance entry buffer. If the method is called with no arguments, all performance entries with an entry type of &quot;mark&quot; will be removed from the performance entry buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/clearMarks">Performance.clearMarks - MDN</a>
   * @see <a href="https://w3c.github.io/user-timing/#dom-performance-clearmarks">clearMarks() - User Timing Level 2</a>
   * @see <a href="https://www.w3.org/TR/user-timing/#dom-performance-clearmarks">clearMarks() - User Timing</a>
   */
  public native void clearMarks();

  /**
   * The clearMeasures() method removes the named measure from the browser's performance entry buffer. If the method is called with no arguments, all performance entries with an entry type of &quot;measure&quot; will be removed from the performance entry buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/clearMeasures">Performance.clearMeasures - MDN</a>
   * @see <a href="https://w3c.github.io/user-timing/#dom-performance-clearmeasures">clearMeasures() - User Timing Level 2</a>
   * @see <a href="https://www.w3.org/TR/user-timing/#dom-performance-clearmeasures">clearMeasures() - User Timing</a>
   */
  public native void clearMeasures(@Nonnull String measureName);

  /**
   * The clearMeasures() method removes the named measure from the browser's performance entry buffer. If the method is called with no arguments, all performance entries with an entry type of &quot;measure&quot; will be removed from the performance entry buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/clearMeasures">Performance.clearMeasures - MDN</a>
   * @see <a href="https://w3c.github.io/user-timing/#dom-performance-clearmeasures">clearMeasures() - User Timing Level 2</a>
   * @see <a href="https://www.w3.org/TR/user-timing/#dom-performance-clearmeasures">clearMeasures() - User Timing</a>
   */
  public native void clearMeasures();

  /**
   * The mark() method creates a timestamp in the browser's performance entry buffer with the given name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/mark">Performance.mark - MDN</a>
   * @see <a href="https://w3c.github.io/user-timing/#dom-performance-mark">mark() - User Timing Level 2</a>
   * @see <a href="https://www.w3.org/TR/user-timing/#dom-performance-mark">mark() - User Timing</a>
   */
  public native void mark(@Nonnull String markName);

  /**
   * The measure() method creates a named timestamp in the browser's performance entry buffer between marks, the navigation start time, or the current time. When measuring between two marks, there is a start mark and end mark, respectively. The named timestamp is referred to as a measure.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/measure">Performance.measure - MDN</a>
   * @see <a href="https://w3c.github.io/user-timing/#dom-performance-measure">measure() - User Timing Level 2</a>
   * @see <a href="https://www.w3.org/TR/user-timing/#dom-performance-measure">measure() - User Timing</a>
   */
  public native void measure(@Nonnull String measureName, @Nonnull String startMark,
      @Nonnull String endMark);

  /**
   * The measure() method creates a named timestamp in the browser's performance entry buffer between marks, the navigation start time, or the current time. When measuring between two marks, there is a start mark and end mark, respectively. The named timestamp is referred to as a measure.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/measure">Performance.measure - MDN</a>
   * @see <a href="https://w3c.github.io/user-timing/#dom-performance-measure">measure() - User Timing Level 2</a>
   * @see <a href="https://www.w3.org/TR/user-timing/#dom-performance-measure">measure() - User Timing</a>
   */
  public native void measure(@Nonnull String measureName, @Nonnull String startMark);

  /**
   * The measure() method creates a named timestamp in the browser's performance entry buffer between marks, the navigation start time, or the current time. When measuring between two marks, there is a start mark and end mark, respectively. The named timestamp is referred to as a measure.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Performance/measure">Performance.measure - MDN</a>
   * @see <a href="https://w3c.github.io/user-timing/#dom-performance-measure">measure() - User Timing Level 2</a>
   * @see <a href="https://www.w3.org/TR/user-timing/#dom-performance-measure">measure() - User Timing</a>
   */
  public native void measure(@Nonnull String measureName);

  @JsOverlay
  public final void addResourcetimingbufferfullListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "resourcetimingbufferfull", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addResourcetimingbufferfullListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "resourcetimingbufferfull", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addResourcetimingbufferfullListener(@Nonnull final EventListener callback) {
    addEventListener( "resourcetimingbufferfull", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeResourcetimingbufferfullListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "resourcetimingbufferfull", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeResourcetimingbufferfullListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "resourcetimingbufferfull", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeResourcetimingbufferfullListener(@Nonnull final EventListener callback) {
    removeEventListener( "resourcetimingbufferfull", Js.cast( callback ) );
  }
}
