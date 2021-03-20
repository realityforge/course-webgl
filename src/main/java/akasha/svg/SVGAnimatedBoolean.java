package akasha.svg;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAnimatedBoolean interface is used for attributes of type boolean which can be animated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedBoolean">SVGAnimatedBoolean - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedBoolean"
)
public class SVGAnimatedBoolean {
  public boolean baseVal;

  protected SVGAnimatedBoolean() {
  }

  @JsProperty(
      name = "animVal"
  )
  public native boolean animVal();
}
