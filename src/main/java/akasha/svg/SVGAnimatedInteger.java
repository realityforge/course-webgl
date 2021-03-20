package akasha.svg;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAnimatedInteger interface is used for attributes of basic type &lt;integer&gt; which can be animated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedInteger">SVGAnimatedInteger - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedInteger"
)
public class SVGAnimatedInteger {
  public int baseVal;

  protected SVGAnimatedInteger() {
  }

  @JsProperty(
      name = "animVal"
  )
  public native int animVal();
}
