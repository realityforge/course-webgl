package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * A DOMRect represents a rectangle.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRect">DOMRect - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMRect"
)
public class DOMRect extends DOMRectReadOnly {
  public double height;

  public double width;

  public double x;

  public double y;

  /**
   * The DOMRect() constructor creates a new DOMRect object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRect/DOMRect">DOMRect.DOMRect - MDN</a>
   */
  public DOMRect(final double x, final double y, final double width, final double height) {
  }

  /**
   * The DOMRect() constructor creates a new DOMRect object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRect/DOMRect">DOMRect.DOMRect - MDN</a>
   */
  public DOMRect(final double x, final double y, final double width) {
  }

  /**
   * The DOMRect() constructor creates a new DOMRect object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRect/DOMRect">DOMRect.DOMRect - MDN</a>
   */
  public DOMRect(final double x, final double y) {
  }

  /**
   * The DOMRect() constructor creates a new DOMRect object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRect/DOMRect">DOMRect.DOMRect - MDN</a>
   */
  public DOMRect(final double x) {
  }

  /**
   * The DOMRect() constructor creates a new DOMRect object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRect/DOMRect">DOMRect.DOMRect - MDN</a>
   */
  public DOMRect() {
  }

  @Nonnull
  public static native DOMRect fromRect(@Nonnull DOMRectInit other);

  @Nonnull
  public static native DOMRect fromRect();
}