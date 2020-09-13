package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAnimatedLength interface is used for attributes of basic type length which can be animated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedLength">SVGAnimatedLength - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedLength"
)
public class SVGAnimatedLength {
  SVGAnimatedLength() {
  }

  @JsProperty(
      name = "animVal"
  )
  @Nonnull
  public native SVGLength animVal();

  @JsProperty(
      name = "baseVal"
  )
  @Nonnull
  public native SVGLength baseVal();
}
