package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAnimatedPreserveAspectRatio interface is used for attributes of type SVGPreserveAspectRatio which can be animated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedPreserveAspectRatio">SVGAnimatedPreserveAspectRatio - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedPreserveAspectRatio"
)
public class SVGAnimatedPreserveAspectRatio {
  protected SVGAnimatedPreserveAspectRatio() {
  }

  @JsProperty(
      name = "animVal"
  )
  @Nonnull
  public native SVGPreserveAspectRatio animVal();

  @JsProperty(
      name = "baseVal"
  )
  @Nonnull
  public native SVGPreserveAspectRatio baseVal();
}
