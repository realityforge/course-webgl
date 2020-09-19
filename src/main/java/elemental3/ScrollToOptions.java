package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The ScrollToOptions dictionary of the CSSOM View spec contains properties specifying where an element should be scrolled to, and whether the scrolling should be smooth.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions">ScrollToOptions - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface ScrollToOptions extends ScrollOptions {
  @JsOverlay
  @Nonnull
  static ScrollToOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions/left">ScrollToOptions.left - MDN</a>
   */
  @JsProperty(
      name = "left"
  )
  double left();

  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions/left">ScrollToOptions.left - MDN</a>
   */
  @JsProperty
  void setLeft(double left);

  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions/left">ScrollToOptions.left - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default ScrollToOptions left(final double left) {
    setLeft( left );
    return this;
  }

  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions/top">ScrollToOptions.top - MDN</a>
   */
  @JsProperty(
      name = "top"
  )
  double top();

  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions/top">ScrollToOptions.top - MDN</a>
   */
  @JsProperty
  void setTop(double top);

  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions/top">ScrollToOptions.top - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default ScrollToOptions top(final double top) {
    setTop( top );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ScrollToOptions behavior(@ScrollBehavior @Nonnull final String behavior) {
    setBehavior( behavior );
    return this;
  }
}
