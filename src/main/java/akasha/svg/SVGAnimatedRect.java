package akasha.svg;

import akasha.DOMRect;
import akasha.DOMRectReadOnly;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAnimatedRect interface is used for attributes of basic SVGRect which can be animated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedRect">SVGAnimatedRect - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedRect"
)
public class SVGAnimatedRect {
  protected SVGAnimatedRect() {
  }

  @JsProperty(
      name = "animVal"
  )
  @Nonnull
  public native DOMRectReadOnly animVal();

  @JsProperty(
      name = "baseVal"
  )
  @Nonnull
  public native DOMRect baseVal();
}
