package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAnimatedNumber interface is used for attributes of basic type Number which can be animated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedNumber">SVGAnimatedNumber - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedNumber"
)
public class SVGAnimatedNumber {
  public float baseVal;

  SVGAnimatedNumber() {
  }

  @JsProperty(
      name = "animVal"
  )
  public native float animVal();
}
