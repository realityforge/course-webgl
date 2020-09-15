package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The PerformanceObserverEntryList interface is a list of peformance events that were explicitly observed via the observe() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceObserverEntryList">PerformanceObserverEntryList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceObserverEntryList"
)
public class PerformanceObserverEntryList {
  PerformanceObserverEntryList() {
  }

  /**
   * The getEntries() method of the PerformanceObserverEntryList interface returns a list of explicitly observed performance entry objects for a given filter. The list's members are determined by the set of entry types specified in the call to the observe() method. The list is available in the observer's callback function (as the first parameter in the callback).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceObserverEntryList/getEntries">PerformanceObserverEntryList.getEntries - MDN</a>
   */
  @Nonnull
  public native JsArray<PerformanceEntry> getEntries();

  /**
   * The getEntriesByName() method of the PerformanceObserverEntryList interface returns a list of explicitly observed performance entry objects for a given name and entry type. The list's members are determined by the set of entry types specified in the call to the observe() method. The list is available in the observer's callback function (as the first parameter in the callback).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceObserverEntryList/getEntriesByName">PerformanceObserverEntryList.getEntriesByName - MDN</a>
   */
  @Nonnull
  public native JsArray<PerformanceEntry> getEntriesByName(@Nonnull String name,
      @Nonnull String type);

  /**
   * The getEntriesByName() method of the PerformanceObserverEntryList interface returns a list of explicitly observed performance entry objects for a given name and entry type. The list's members are determined by the set of entry types specified in the call to the observe() method. The list is available in the observer's callback function (as the first parameter in the callback).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceObserverEntryList/getEntriesByName">PerformanceObserverEntryList.getEntriesByName - MDN</a>
   */
  @Nonnull
  public native JsArray<PerformanceEntry> getEntriesByName(@Nonnull String name);

  /**
   * The getEntriesByType() method of the PerformanceObserverEntryList returns a list of explicitly observed performance entry objects for a given performance entry type. The list's members are determined by the set of entry types specified in the call to the observe() method. The list is available in the observer's callback function (as the first parameter in the callback).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceObserverEntryList/getEntriesByType">PerformanceObserverEntryList.getEntriesByType - MDN</a>
   */
  @Nonnull
  public native JsArray<PerformanceEntry> getEntriesByType(@Nonnull String type);
}