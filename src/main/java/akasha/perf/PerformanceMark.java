package akasha.perf;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * PerformanceMark is an abstract interface for PerformanceEntry objects with an entryType of &quot;mark&quot;. Entries of this type are created by calling performance.mark() to add a named DOMHighResTimeStamp (the mark) to the browser's performance timeline.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceMark">PerformanceMark - MDN</a>
 * @see <a href="https://w3c.github.io/user-timing/#performancemark">PerformanceMark - User Timing Level 2</a>
 * @see <a href="https://www.w3.org/TR/user-timing/#performancemark">PerformanceMark - User Timing</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceMark"
)
public class PerformanceMark extends PerformanceEntry {
  protected PerformanceMark() {
  }
}
