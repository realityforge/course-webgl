package akasha.svg;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAnimatedEnumeration interface is used for attributes whose value must be a constant from a particular enumeration and which can be animated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedEnumeration">SVGAnimatedEnumeration - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedEnumeration"
)
public class SVGAnimatedEnumeration {
  public int baseVal;

  protected SVGAnimatedEnumeration() {
  }

  @JsProperty(
      name = "animVal"
  )
  public native int animVal();
}
