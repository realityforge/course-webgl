package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAnimatedLengthList interface is used for attributes of type SVGLengthList which can be animated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedLengthList">SVGAnimatedLengthList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedLengthList"
)
public class SVGAnimatedLengthList {
  protected SVGAnimatedLengthList() {
  }

  @JsProperty(
      name = "animVal"
  )
  @Nonnull
  public native SVGLengthList animVal();

  @JsProperty(
      name = "baseVal"
  )
  @Nonnull
  public native SVGLengthList baseVal();
}
