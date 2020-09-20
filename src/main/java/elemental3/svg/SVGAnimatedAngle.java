package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAnimatedAngle interface is used for attributes of basic type angle which can be animated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedAngle">SVGAnimatedAngle - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedAngle"
)
public class SVGAnimatedAngle {
  protected SVGAnimatedAngle() {
  }

  @JsProperty(
      name = "animVal"
  )
  @Nonnull
  public native SVGAngle animVal();

  @JsProperty(
      name = "baseVal"
  )
  @Nonnull
  public native SVGAngle baseVal();
}
