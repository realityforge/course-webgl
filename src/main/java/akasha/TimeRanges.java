package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TimeRanges interface is used to represent a set of time ranges, primarily for the purpose of tracking which portions of media have been buffered when loading it for use by the &lt;audio&gt; and &lt;video&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TimeRanges">TimeRanges - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#time-ranges">TimeRanges - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TimeRanges"
)
public class TimeRanges {
  protected TimeRanges() {
  }

  /**
   * The TimeRanges.length read-only property returns the number of ranges in the object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TimeRanges/length">TimeRanges.length - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-timeranges-length">TimeRanges.length() - HTML Living Standard</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * Returns the time offset at which a specified time range ends.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TimeRanges/end">TimeRanges.end - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-timeranges-end">TimeRanges.end() - HTML Living Standard</a>
   */
  public native double end(int index);

  /**
   * Returns the time offset at which a specified time range begins.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TimeRanges/start">TimeRanges.start - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-timeranges-start">TimeRanges.start() - HTML Living Standard</a>
   */
  public native double start(int index);
}
