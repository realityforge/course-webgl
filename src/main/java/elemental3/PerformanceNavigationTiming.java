package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PerformanceNavigationTiming interface provides methods and properties to store and retrieve metrics regarding the browser's document navigation events. For example, this interface can be used to determine how much time it takes to load or unload a document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming">PerformanceNavigationTiming - MDN</a>
 * @see <a href="https://w3c.github.io/navigation-timing/#sec-PerformanceNavigationTiming">PerformanceNavigationTiming - Navigation Timing Level 2</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceNavigationTiming"
)
public class PerformanceNavigationTiming extends PerformanceResourceTiming {
  protected PerformanceNavigationTiming() {
  }

  /**
   * The domComplete read-only property returns a timestamp representing the time value equal to the time immediately before the user agent sets the current document readiness of the current document to complete.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming/domComplete">PerformanceNavigationTiming.domComplete - MDN</a>
   * @see <a href="https://w3c.github.io/navigation-timing/#dom-performancenavigationtiming-domcomplete">domComplete - Navigation Timing Level 2</a>
   */
  @JsProperty(
      name = "domComplete"
  )
  public native double domComplete();

  /**
   * The domContentLoadedEventEnd read-only property returns a timestamp representing the time value equal to the time immediately after the current document's DOMContentLoaded event completes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming/domContentLoadedEventEnd">PerformanceNavigationTiming.domContentLoadedEventEnd - MDN</a>
   * @see <a href="https://w3c.github.io/navigation-timing/#dom-performancenavigationtiming-domcontentloadedeventend">domContentLoadedEventEnd - Navigation Timing Level 2</a>
   */
  @JsProperty(
      name = "domContentLoadedEventEnd"
  )
  public native double domContentLoadedEventEnd();

  /**
   * The domContentLoadedEventStart read-only property returns a timestamp representing the time value equal to the time immediately before the user agent fires the DOMContentLoaded event at the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming/domContentLoadedEventStart">PerformanceNavigationTiming.domContentLoadedEventStart - MDN</a>
   * @see <a href="https://w3c.github.io/navigation-timing/#dom-performancenavigationtiming-domcontentloadedeventstart">domContentLoadedEventStart - Navigation Timing Level 2</a>
   */
  @JsProperty(
      name = "domContentLoadedEventStart"
  )
  public native double domContentLoadedEventStart();

  /**
   * The domInteractive read-only property returns a timestamp representing the time value equal to the time immediately before the user agent sets the current document readiness of the current document to interactive.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming/domInteractive">PerformanceNavigationTiming.domInteractive - MDN</a>
   * @see <a href="https://w3c.github.io/navigation-timing/#dom-performancenavigationtiming-dominteractive">domInteractive - Navigation Timing Level 2</a>
   */
  @JsProperty(
      name = "domInteractive"
  )
  public native double domInteractive();

  /**
   * The loadEventEnd read-only property returns a timestamp which is equal to the time when the load event of the current document is completed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming/loadEventEnd">PerformanceNavigationTiming.loadEventEnd - MDN</a>
   * @see <a href="https://w3c.github.io/navigation-timing/#dom-performancenavigationtiming-loadeventend">loadEventEnd - Navigation Timing Level 2</a>
   */
  @JsProperty(
      name = "loadEventEnd"
  )
  public native double loadEventEnd();

  /**
   * The loadEventStart read-only property returns a timestamp representing the time value equal to the time immediately before the load event of the current document is fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming/loadEventStart">PerformanceNavigationTiming.loadEventStart - MDN</a>
   * @see <a href="https://w3c.github.io/navigation-timing/#dom-performancenavigationtiming-loadeventstart">loadEventStart - Navigation Timing Level 2</a>
   */
  @JsProperty(
      name = "loadEventStart"
  )
  public native double loadEventStart();

  /**
   * The redirectCount property returns a timestamp representing the number of redirects since the last non-redirect navigation under the current browsing context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming/redirectCount">PerformanceNavigationTiming.redirectCount - MDN</a>
   * @see <a href="https://w3c.github.io/navigation-timing/#dom-performancenavigationtiming-redirectcount">redirectCount - Navigation Timing Level 2</a>
   */
  @JsProperty(
      name = "redirectCount"
  )
  public native int redirectCount();

  /**
   * The type read-only property returns a string representing the type of navigation. The value must be one of the following:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming/type">PerformanceNavigationTiming.type - MDN</a>
   * @see <a href="https://w3c.github.io/navigation-timing/#dom-performancenavigationtiming-type">type - Navigation Timing Level 2</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  @NavigationType
  public native String type();

  /**
   * The unloadEventEnd read-only property returns a timestamp representing the time value equal to the time immediately after the user agent finishes the unload event of the previous document. If there is no previous document, this property value is 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming/unloadEventEnd">PerformanceNavigationTiming.unloadEventEnd - MDN</a>
   * @see <a href="https://w3c.github.io/navigation-timing/#dom-performancenavigationtiming-unloadeventend">unloadEventEnd - Navigation Timing Level 2</a>
   */
  @JsProperty(
      name = "unloadEventEnd"
  )
  public native double unloadEventEnd();

  /**
   * The unloadEventStart read-only property returns a timestamp representing the time value equal to the time immediately before the user agent starts the unload event of the previous document. If there is no previous document, this property returns 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming/unloadEventStart">PerformanceNavigationTiming.unloadEventStart - MDN</a>
   * @see <a href="https://w3c.github.io/navigation-timing/#dom-performancenavigationtiming-unloadeventstart">unloadEventStart - Navigation Timing Level 2</a>
   */
  @JsProperty(
      name = "unloadEventStart"
  )
  public native double unloadEventStart();

  /**
   * The toJSON() method is a serializer - it returns a JSON representation of the PerformanceNavigationTiming object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming/toJSON">PerformanceNavigationTiming.toJSON - MDN</a>
   * @see <a href="https://w3c.github.io/navigation-timing/#dom-performancenavigationtiming-tojson">toJSON() - Navigation Timing Level 2</a>
   */
  @Nonnull
  public native Object toJSON();
}
