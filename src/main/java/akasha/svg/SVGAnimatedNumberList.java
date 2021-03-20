package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAnimatedNumber interface is used for attributes which take a list of numbers and which can be animated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedNumberList">SVGAnimatedNumberList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedNumberList"
)
public class SVGAnimatedNumberList {
  protected SVGAnimatedNumberList() {
  }

  @JsProperty(
      name = "animVal"
  )
  @Nonnull
  public native SVGNumberList animVal();

  @JsProperty(
      name = "baseVal"
  )
  @Nonnull
  public native SVGNumberList baseVal();
}
