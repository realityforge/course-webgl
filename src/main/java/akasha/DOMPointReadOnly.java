package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DOMPointReadOnly interface specifies the coordinate and perspective fields used by DOMPoint to define a 2D or 3D point in a coordinate system.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly">DOMPointReadOnly - MDN</a>
 * @see <a href="https://drafts.fxtf.org/geometry/#DOMPoint">DOMPoint - Geometry Interfaces Module Level 1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMPointReadOnly"
)
public class DOMPointReadOnly {
  /**
   * The DOMPointReadOnly() constructor returns a new DOMPointReadOnly object representing a point in 2D or 3D space, optionally with perspective, whose values cannot be altered by script code.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/DOMPointReadOnly">DOMPointReadOnly.DOMPointReadOnly - MDN</a>
   */
  public DOMPointReadOnly(final double x, final double y, final double z, final double w) {
  }

  /**
   * The DOMPointReadOnly() constructor returns a new DOMPointReadOnly object representing a point in 2D or 3D space, optionally with perspective, whose values cannot be altered by script code.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/DOMPointReadOnly">DOMPointReadOnly.DOMPointReadOnly - MDN</a>
   */
  public DOMPointReadOnly(final double x, final double y, final double z) {
  }

  /**
   * The DOMPointReadOnly() constructor returns a new DOMPointReadOnly object representing a point in 2D or 3D space, optionally with perspective, whose values cannot be altered by script code.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/DOMPointReadOnly">DOMPointReadOnly.DOMPointReadOnly - MDN</a>
   */
  public DOMPointReadOnly(final double x, final double y) {
  }

  /**
   * The DOMPointReadOnly() constructor returns a new DOMPointReadOnly object representing a point in 2D or 3D space, optionally with perspective, whose values cannot be altered by script code.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/DOMPointReadOnly">DOMPointReadOnly.DOMPointReadOnly - MDN</a>
   */
  public DOMPointReadOnly(final double x) {
  }

  /**
   * The DOMPointReadOnly() constructor returns a new DOMPointReadOnly object representing a point in 2D or 3D space, optionally with perspective, whose values cannot be altered by script code.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/DOMPointReadOnly">DOMPointReadOnly.DOMPointReadOnly - MDN</a>
   */
  public DOMPointReadOnly() {
  }

  /**
   * The DOMPointReadOnly interface's w property holds the point's perspective value, w, for a read-only point in space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/w">DOMPointReadOnly.w - MDN</a>
   */
  @JsProperty(
      name = "w"
  )
  public native double w();

  /**
   * The DOMPointReadOnly interface's x property holds the horizontal coordinate, x, for a read-only point in space. This property cannot be changed by JavaScript code in this read-only version of the DOMPoint object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/x">DOMPointReadOnly.x - MDN</a>
   */
  @JsProperty(
      name = "x"
  )
  public native double x();

  /**
   * The DOMPointReadOnly interface's y property holds the vertical coordinate, y, for a read-only point in space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/y">DOMPointReadOnly.y - MDN</a>
   */
  @JsProperty(
      name = "y"
  )
  public native double y();

  /**
   * The DOMPointReadOnly interface's z property holds the depth coordinate, z, for a read-only point in space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/z">DOMPointReadOnly.z - MDN</a>
   */
  @JsProperty(
      name = "z"
  )
  public native double z();

  /**
   * The static DOMPointReadOnly method fromPoint() creates and returns a new DOMPointReadOnly object given a source point.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/fromPoint">DOMPointReadOnly.fromPoint - MDN</a>
   */
  @Nonnull
  public static native DOMPointReadOnly fromPoint(@Nonnull DOMPointInit other);

  /**
   * The static DOMPointReadOnly method fromPoint() creates and returns a new DOMPointReadOnly object given a source point.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/fromPoint">DOMPointReadOnly.fromPoint - MDN</a>
   */
  @Nonnull
  public static native DOMPointReadOnly fromPoint();

  @Nonnull
  public native DOMPoint matrixTransform(@Nonnull DOMMatrixInit matrix);

  @Nonnull
  public native DOMPoint matrixTransform();

  /**
   * The DOMPointReadOnly method toJSON() returns a DOMPointInit object giving the JSON form of the point object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointReadOnly/toJSON">DOMPointReadOnly.toJSON - MDN</a>
   */
  @Nonnull
  public native Object toJSON();
}
