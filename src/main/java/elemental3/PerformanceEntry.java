package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PerformanceEntry object encapsulates a single performance metric that is part of the performance timeline. A performance entry can be directly created by making a performance mark or measure (for example by calling the mark() method) at an explicit point in an application. Performance entries are also created in indirect ways such as loading a resource (such as an image).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceEntry">PerformanceEntry - MDN</a>
 * @see <a href="https://w3c.github.io/resource-timing/">Resource Timing Level 3</a>
 * @see <a href="https://www.w3.org/TR/resource-timing-2/">Resource Timing Level 2</a>
 * @see <a href="https://www.w3.org/TR/resource-timing-1/">Resource Timing Level 1</a>
 * @see <a href="https://w3c.github.io/navigation-timing/">Navigation Timing Level 2</a>
 * @see <a href="https://www.w3.org/TR/navigation-timing/">Navigation Timing</a>
 * @see <a href="https://w3c.github.io/user-timing/">User Timing Level 2</a>
 * @see <a href="https://www.w3.org/TR/user-timing/">User Timing</a>
 * @see <a href="https://wicg.github.io/frame-timing/">Frame Timing</a>
 * @see <a href="https://w3c.github.io/performance-timeline/#dom-performanceentry">The definition of 'PerformanceEntry' in the 'Performance Timeline Level 2' specification.</a>
 * @see <a href="https://www.w3.org/TR/performance-timeline/#dom-performanceentry">The definition of 'PerformanceEntry' in the 'Performance Timeline' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceEntry"
)
public class PerformanceEntry {
  protected PerformanceEntry() {
  }

  /**
   * The duration property returns a timestamp that is the duration of the performance entry.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceEntry/duration">PerformanceEntry.duration - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performanceentry-duration">The definition of 'duration' in the 'Performance Timeline Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/performance-timeline/#dom-performanceentry-duration">The definition of 'duration' in the 'Performance Timeline' specification.</a>
   */
  @JsProperty(
      name = "duration"
  )
  public native double duration();

  /**
   * The entryType property returns a DOMString representing the type of performance metric such as, for example, &quot;mark&quot;. This property is read only.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceEntry/entryType">PerformanceEntry.entryType - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performanceentry-entrytype">The definition of 'entryType' in the 'Performance Timeline Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/performance-timeline/#dom-performanceentry-entrytype">The definition of 'entryType' in the 'Performance Timeline' specification.</a>
   */
  @JsProperty(
      name = "entryType"
  )
  @Nonnull
  public native String entryType();

  /**
   * The name property of the PerformanceEntry interface returns a value that further specifies the value returned by the PerformanceEntry.entryType property. This property is read only.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceEntry/name">PerformanceEntry.name - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performanceentry-name">The definition of 'name' in the 'Performance Timeline Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/performance-timeline/#dom-performanceentry-name">The definition of 'name' in the 'Performance Timeline' specification.</a>
   */
  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  /**
   * The startTime property returns the first recorded timestamp of the performance entry.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceEntry/startTime">PerformanceEntry.startTime - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performanceentry-starttime">The definition of 'startTime' in the 'Performance Timeline Level 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/performance-timeline/#dom-performanceentry-starttime">The definition of 'startTime' in the 'Performance Timeline' specification.</a>
   */
  @JsProperty(
      name = "startTime"
  )
  public native double startTime();

  /**
   * The toJSON() method is a serializer; it returns a JSON representation of the performance entry object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceEntry/toJSON">PerformanceEntry.toJSON - MDN</a>
   * @see <a href="https://w3c.github.io/performance-timeline/#dom-performanceentry-tojson">The definition of 'toJSON' in the 'Performance Timeline Level 2' specification.</a>
   */
  @Nonnull
  public native Object toJSON();
}
