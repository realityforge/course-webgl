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

  @JsProperty(
      name = "bottom"
  )
  public native double bottom();

  @JsProperty(
      name = "height"
  )
  public native double height();

  @JsProperty(
      name = "left"
  )
  public native double left();

  @JsProperty(
      name = "right"
  )
  public native double right();

  @JsProperty(
      name = "top"
  )
  public native double top();

  @JsProperty(
      name = "width"
  )
  public native double width();

  @JsProperty(
      name = "x"
  )
  public native double x();

  @JsProperty(
      name = "y"
  )
  public native double y();

  /**
   * The fromRect() property of the DOMRectReadOnly interface creates a new DOMRectReadOnly object with a given location and dimensions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/fromRect">DOMRectReadOnly.fromRect - MDN</a>
   */
  @Nonnull
  public static native DOMRectReadOnly fromRect(@Nonnull DOMRectInit other);

  /**
   * The fromRect() property of the DOMRectReadOnly interface creates a new DOMRectReadOnly object with a given location and dimensions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMRectReadOnly/fromRect">DOMRectReadOnly.fromRect - MDN</a>
   */
  @Nonnull
  public static native DOMRectReadOnly fromRect();

  @Nonnull
  public native Object toJSON();
}
