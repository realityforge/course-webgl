package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DOMRectReadOnly interface specifies the standard properties used by DOMRect to define a rectangle whose properties are immutable.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly">DOMRectReadOnly - MDN</a>
 * @see <a href="https://drafts.fxtf.org/geometry/#DOMRect">DOMRectReadOnly - Geometry Interfaces Module Level 1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMRectReadOnly"
)
public class DOMRectReadOnly {
  /**
   * The DOMRectReadOnly() constructor creates a new DOMRectReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/DOMRectReadOnly">DOMRectReadOnly.DOMRectReadOnly - MDN</a>
   */
  public DOMRectReadOnly(final double x, final double y, final double width, final double height) {
  }

  /**
   * The DOMRectReadOnly() constructor creates a new DOMRectReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/DOMRectReadOnly">DOMRectReadOnly.DOMRectReadOnly - MDN</a>
   */
  public DOMRectReadOnly(final double x, final double y, final double width) {
  }

  /**
   * The DOMRectReadOnly() constructor creates a new DOMRectReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/DOMRectReadOnly">DOMRectReadOnly.DOMRectReadOnly - MDN</a>
   */
  public DOMRectReadOnly(final double x, final double y) {
  }

  /**
   * The DOMRectReadOnly() constructor creates a new DOMRectReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/DOMRectReadOnly">DOMRectReadOnly.DOMRectReadOnly - MDN</a>
   */
  public DOMRectReadOnly(final double x) {
  }

  /**
   * The DOMRectReadOnly() constructor creates a new DOMRectReadOnly object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/DOMRectReadOnly">DOMRectReadOnly.DOMRectReadOnly - MDN</a>
   */
  public DOMRectReadOnly() {
  }

  /**
   * The bottom read-only property of the DOMRectReadOnly interface returns the bottom coordinate value of the DOMRect. (Has the same value as y + height, or y if height is negative.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/bottom">DOMRectReadOnly.bottom - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-domrectreadonly-bottom">bottom - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty(
      name = "bottom"
  )
  public native double bottom();

  /**
   * The height read-only property of the DOMRectReadOnly interface represents the height of the DOMRect.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/height">DOMRectReadOnly.height - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-domrectreadonly-height">height - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty(
      name = "height"
  )
  public native double height();

  /**
   * The left read-only property of the DOMRectReadOnly interface returns the left coordinate value of the DOMRect. (Has the same value as x, or x + width if width is negative.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/left">DOMRectReadOnly.left - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-domrectreadonly-left">left - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty(
      name = "left"
  )
  public native double left();

  /**
   * The right read-only property of the DOMRectReadOnly interface returns the right coordinate value of the DOMRect. (Has the same value as x + width, or x if width is negative.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/right">DOMRectReadOnly.right - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-domrectreadonly-right">right - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty(
      name = "right"
  )
  public native double right();

  /**
   * The top read-only property of the DOMRectReadOnly interface returns the top coordinate value of the DOMRect. (Has the same value as y, or y + height if height is negative.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/top">DOMRectReadOnly.top - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-domrectreadonly-top">top - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty(
      name = "top"
  )
  public native double top();

  /**
   * The width read-only property of the DOMRectReadOnly interface represents the width of the DOMRect.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/width">DOMRectReadOnly.width - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-domrectreadonly-width">width - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty(
      name = "width"
  )
  public native double width();

  /**
   * The x read-only property of the DOMRectReadOnly interface represents the x coordinate of the DOMRect's origin.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/x">DOMRectReadOnly.x - MDN</a>
   */
  @JsProperty(
      name = "x"
  )
  public native double x();

  /**
   * The y read-only property of the DOMRectReadOnly interface represents the y coordinate of the DOMRect's origin.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/y">DOMRectReadOnly.y - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-domrectreadonly-y">y - Geometry Interfaces Module Level 1</a>
   */
  @JsProperty(
      name = "y"
  )
  public native double y();

  /**
   * The fromRect() property of the DOMRectReadOnly interface creates a new DOMRectReadOnly object with a given location and dimensions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/fromRect">DOMRectReadOnly.fromRect - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-domrect-fromrect">fromRect() - Geometry Interfaces Module Level 1</a>
   */
  @Nonnull
  public static native DOMRectReadOnly fromRect(@Nonnull DOMRectInit other);

  /**
   * The fromRect() property of the DOMRectReadOnly interface creates a new DOMRectReadOnly object with a given location and dimensions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/fromRect">DOMRectReadOnly.fromRect - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-domrect-fromrect">fromRect() - Geometry Interfaces Module Level 1</a>
   */
  @Nonnull
  public static native DOMRectReadOnly fromRect();

  @Nonnull
  public native Object toJSON();
}
