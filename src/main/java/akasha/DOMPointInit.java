package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The DOMPointInit dictionary is used to provide the values of the coordinates and perspective when creating and JSONifying a DOMPoint or DOMPointReadOnly object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit">DOMPointInit - MDN</a>
 * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointreadonly-frompoint">DOMPointReadOnly.fromPoint() - Geometry Interfaces Module Level 1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface DOMPointInit {
  @JsOverlay
  @Nonnull
  static DOMPointInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The DOMPointInit dictionary's w property is used to specify the w perspective value of a point in space when either creating or serializing to JSON a DOMPoint or DOMPointReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit/w">DOMPointInit.w - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointinit-w">w - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty(
      name = "w"
  )
  double w();

  /**
   * The DOMPointInit dictionary's w property is used to specify the w perspective value of a point in space when either creating or serializing to JSON a DOMPoint or DOMPointReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit/w">DOMPointInit.w - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointinit-w">w - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty
  void setW(double w);

  /**
   * The DOMPointInit dictionary's w property is used to specify the w perspective value of a point in space when either creating or serializing to JSON a DOMPoint or DOMPointReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit/w">DOMPointInit.w - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointinit-w">w - Geometry Interfaces Module Level 1</a>
   */
  @JsOverlay
  @Nonnull
  default DOMPointInit w(final double w) {
    setW( w );
    return this;
  }

  /**
   * The DOMPointInit dictionary's x property is used to specify the x component of a point in 2D or 3D space when either creating or serializing a DOMPoint or DOMPointReadOnly.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit/x">DOMPointInit.x - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointinit-x">x - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty(
      name = "x"
  )
  double x();

  /**
   * The DOMPointInit dictionary's x property is used to specify the x component of a point in 2D or 3D space when either creating or serializing a DOMPoint or DOMPointReadOnly.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit/x">DOMPointInit.x - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointinit-x">x - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty
  void setX(double x);

  /**
   * The DOMPointInit dictionary's x property is used to specify the x component of a point in 2D or 3D space when either creating or serializing a DOMPoint or DOMPointReadOnly.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit/x">DOMPointInit.x - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointinit-x">x - Geometry Interfaces Module Level 1</a>
   */
  @JsOverlay
  @Nonnull
  default DOMPointInit x(final double x) {
    setX( x );
    return this;
  }

  /**
   * The DOMPointInit dictionary's y property is used to specify the y-coordinate of a point in 2D or 3D space when either creating or serializing to JSON a DOMPoint or DOMPointReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit/y">DOMPointInit.y - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointinit-y">y - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty(
      name = "y"
  )
  double y();

  /**
   * The DOMPointInit dictionary's y property is used to specify the y-coordinate of a point in 2D or 3D space when either creating or serializing to JSON a DOMPoint or DOMPointReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit/y">DOMPointInit.y - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointinit-y">y - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty
  void setY(double y);

  /**
   * The DOMPointInit dictionary's y property is used to specify the y-coordinate of a point in 2D or 3D space when either creating or serializing to JSON a DOMPoint or DOMPointReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit/y">DOMPointInit.y - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointinit-y">y - Geometry Interfaces Module Level 1</a>
   */
  @JsOverlay
  @Nonnull
  default DOMPointInit y(final double y) {
    setY( y );
    return this;
  }

  /**
   * The DOMPointInit dictionary's z property is used to specify the z-coordinate of a point in 2D or 3D space when either creating or serializing to JSON a DOMPoint or DOMPointReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit/z">DOMPointInit.z - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointinit-z">z - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty(
      name = "z"
  )
  double z();

  /**
   * The DOMPointInit dictionary's z property is used to specify the z-coordinate of a point in 2D or 3D space when either creating or serializing to JSON a DOMPoint or DOMPointReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit/z">DOMPointInit.z - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointinit-z">z - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty
  void setZ(double z);

  /**
   * The DOMPointInit dictionary's z property is used to specify the z-coordinate of a point in 2D or 3D space when either creating or serializing to JSON a DOMPoint or DOMPointReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPointInit/z">DOMPointInit.z - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dompointinit-z">z - Geometry Interfaces Module Level 1</a>
   */
  @JsOverlay
  @Nonnull
  default DOMPointInit z(final double z) {
    setZ( z );
    return this;
  }
}
