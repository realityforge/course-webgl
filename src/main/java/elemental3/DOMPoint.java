package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * A DOMPoint object represents a 2D or 3D point in a coordinate system; it includes values for the coordinates in up to three dimensions, as well as an optional perspective value.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint">DOMPoint - MDN</a>
 * @see <a href="https://drafts.fxtf.org/geometry/#DOMPoint">DOMPoint - Geometry Interfaces Module Level 1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMPoint"
)
public class DOMPoint extends DOMPointReadOnly {
  /**
   * The DOMPoint interface's w property holds the point's perspective value, w, for a point in space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/w">DOMPoint.w - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompoint-w">w - Geometry Interfaces Module Level 1</a>
   */
  public double w;

  /**
   * The DOMPoint interface's x property holds the horizontal coordinate, x, for a point in space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/x">DOMPoint.x - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompoint-x">x - Geometry Interfaces Module Level 1</a>
   */
  public double x;

  /**
   * The DOMPoint interface's y property holds the vertical coordinate, y, for a point in space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/y">DOMPoint.y - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompoint-y">y - Geometry Interfaces Module Level 1</a>
   */
  public double y;

  /**
   * The DOMPoint interface's z property specifies the depth coordinate of a point in space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/z">DOMPoint.z - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompoint-z">z - Geometry Interfaces Module Level 1</a>
   */
  public double z;

  /**
   * The DOMPoint() constructor creates and returns a new DOMPoint object, given the values for some or all of its properties.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint">DOMPoint.DOMPoint - MDN</a>
   */
  public DOMPoint(final double x, final double y, final double z, final double w) {
  }

  /**
   * The DOMPoint() constructor creates and returns a new DOMPoint object, given the values for some or all of its properties.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint">DOMPoint.DOMPoint - MDN</a>
   */
  public DOMPoint(final double x, final double y, final double z) {
  }

  /**
   * The DOMPoint() constructor creates and returns a new DOMPoint object, given the values for some or all of its properties.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint">DOMPoint.DOMPoint - MDN</a>
   */
  public DOMPoint(final double x, final double y) {
  }

  /**
   * The DOMPoint() constructor creates and returns a new DOMPoint object, given the values for some or all of its properties.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint">DOMPoint.DOMPoint - MDN</a>
   */
  public DOMPoint(final double x) {
  }

  /**
   * The DOMPoint() constructor creates and returns a new DOMPoint object, given the values for some or all of its properties.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/DOMPoint">DOMPoint.DOMPoint - MDN</a>
   */
  public DOMPoint() {
  }

  @Nonnull
  public static native DOMPoint fromPoint(@Nonnull DOMPointInit other);

  @Nonnull
  public static native DOMPoint fromPoint();
}
