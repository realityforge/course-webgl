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
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceTiming"
)
public class PerformanceTiming {
  PerformanceTiming() {
  }

  @JsProperty(
      name = "connectEnd"
  )
  public native int connectEnd();

  @JsProperty(
      name = "connectStart"
  )
  public native int connectStart();

  @JsProperty(
      name = "domComplete"
  )
  public native int domComplete();

  @JsProperty(
      name = "domContentLoadedEventEnd"
  )
  public native int domContentLoadedEventEnd();

  @JsProperty(
      name = "domContentLoadedEventStart"
  )
  public native int domContentLoadedEventStart();

  @JsProperty(
      name = "domInteractive"
  )
  public native int domInteractive();

  @JsProperty(
      name = "domLoading"
  )
  public native int domLoading();

  @JsProperty(
      name = "domainLookupEnd"
  )
  public native int domainLookupEnd();

  @JsProperty(
      name = "domainLookupStart"
  )
  public native int domainLookupStart();

  @JsProperty(
      name = "fetchStart"
  )
  public native int fetchStart();

  @JsProperty(
      name = "loadEventEnd"
  )
  public native int loadEventEnd();

  @JsProperty(
      name = "loadEventStart"
  )
  public native int loadEventStart();

  @JsProperty(
      name = "navigationStart"
  )
  public native int navigationStart();

  @JsProperty(
      name = "redirectEnd"
  )
  public native int redirectEnd();

  @JsProperty(
      name = "redirectStart"
  )
  public native int redirectStart();

  @JsProperty(
      name = "requestStart"
  )
  public native int requestStart();

  @JsProperty(
      name = "responseEnd"
  )
  public native int responseEnd();

  @JsProperty(
      name = "responseStart"
  )
  public native int responseStart();

  @JsProperty(
      name = "secureConnectionStart"
  )
  public native int secureConnectionStart();

  @JsProperty(
      name = "unloadEventEnd"
  )
  public native int unloadEventEnd();

  @JsProperty(
      name = "unloadEventStart"
  )
  public native int unloadEventStart();

  @Nonnull
  public native Object toJSON();
}
