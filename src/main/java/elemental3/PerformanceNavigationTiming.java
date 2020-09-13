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
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceNavigationTiming"
)
public class PerformanceNavigationTiming extends PerformanceResourceTiming {
  PerformanceNavigationTiming() {
  }

  @JsProperty(
      name = "domComplete"
  )
  public native double domComplete();

  @JsProperty(
      name = "domContentLoadedEventEnd"
  )
  public native double domContentLoadedEventEnd();

  @JsProperty(
      name = "domContentLoadedEventStart"
  )
  public native double domContentLoadedEventStart();

  @JsProperty(
      name = "domInteractive"
  )
  public native double domInteractive();

  @JsProperty(
      name = "loadEventEnd"
  )
  public native double loadEventEnd();

  @JsProperty(
      name = "loadEventStart"
  )
  public native double loadEventStart();

  @JsProperty(
      name = "redirectCount"
  )
  public native int redirectCount();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  @JsProperty(
      name = "unloadEventEnd"
  )
  public native double unloadEventEnd();

  @JsProperty(
      name = "unloadEventStart"
  )
  public native double unloadEventStart();

  /**
   * The toJSON() method is a serializer - it returns a JSON representation of the PerformanceNavigationTiming object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigationTiming/toJSON">PerformanceNavigationTiming.toJSON - MDN</a>
   */
  @Nonnull
  public native Object toJSON();
}
