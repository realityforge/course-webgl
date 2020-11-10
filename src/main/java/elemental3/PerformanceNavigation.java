package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The legacy PerformanceNavigation interface represents information about how the navigation to the current document was done.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigation">PerformanceNavigation - MDN</a>
 * @see <a href="https://www.w3.org/TR/navigation-timing/#performancenavigation">The definition of 'PerformanceNavigation' in the 'Navigation Timing' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PerformanceNavigation"
)
public class PerformanceNavigation {
  @JsOverlay
  public static final int TYPE_BACK_FORWARD = 2;

  @JsOverlay
  public static final int TYPE_NAVIGATE = 0;

  @JsOverlay
  public static final int TYPE_RELOAD = 1;

  @JsOverlay
  public static final int TYPE_RESERVED = 255;

  protected PerformanceNavigation() {
  }

  /**
   * The legacy PerformanceNavigation.redirectCount read-only property returns an unsigned short representing the number of REDIRECTs done before reaching the page.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigation/redirectCount">PerformanceNavigation.redirectCount - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancenavigation-redirectcount">The definition of 'PerformanceNavigation.redirectCount' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "redirectCount"
  )
  public native int redirectCount();

  /**
   * The legacy PerformanceNavigation.type read-only property returns an unsigned short containing a constant describing how the navigation to this page was done. Possible values are:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PerformanceNavigation/type">PerformanceNavigation.type - MDN</a>
   * @see <a href="https://www.w3.org/TR/navigation-timing/#dom-performancenavigation-type">The definition of 'PerformanceNavigation.type' in the 'Navigation Timing' specification.</a>
   */
  @JsProperty(
      name = "type"
  )
  @PerformanceNavigationType
  public native int type();

  @Nonnull
  public native Object toJSON();
}
