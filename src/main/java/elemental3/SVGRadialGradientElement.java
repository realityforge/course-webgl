package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGRadialGradientElement interface corresponds to the RadialGradient element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGRadialGradientElement">SVGRadialGradientElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGRadialGradientElement"
)
public class SVGRadialGradientElement extends SVGGradientElement {
  SVGRadialGradientElement() {
  }

  @JsProperty(
      name = "cx"
  )
  @Nonnull
  public native SVGAnimatedLength cx();

  @JsProperty(
      name = "cy"
  )
  @Nonnull
  public native SVGAnimatedLength cy();

  @JsProperty(
      name = "fr"
  )
  @Nonnull
  public native SVGAnimatedLength fr();

  @JsProperty(
      name = "fx"
  )
  @Nonnull
  public native SVGAnimatedLength fx();

  @JsProperty(
      name = "fy"
  )
  @Nonnull
  public native SVGAnimatedLength fy();

  @JsProperty(
      name = "r"
  )
  @Nonnull
  public native SVGAnimatedLength r();
}
