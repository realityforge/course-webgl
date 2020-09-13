package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFESpotLightElement interface corresponds to the feSpotLight element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFESpotLightElement">SVGFESpotLightElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFESpotLightElement"
)
public class SVGFESpotLightElement extends SVGElement {
  SVGFESpotLightElement() {
  }

  @JsProperty(
      name = "limitingConeAngle"
  )
  @Nonnull
  public native SVGAnimatedNumber limitingConeAngle();

  @JsProperty(
      name = "pointsAtX"
  )
  @Nonnull
  public native SVGAnimatedNumber pointsAtX();

  @JsProperty(
      name = "pointsAtY"
  )
  @Nonnull
  public native SVGAnimatedNumber pointsAtY();

  @JsProperty(
      name = "pointsAtZ"
  )
  @Nonnull
  public native SVGAnimatedNumber pointsAtZ();

  @JsProperty(
      name = "specularExponent"
  )
  @Nonnull
  public native SVGAnimatedNumber specularExponent();

  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedNumber x();

  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedNumber y();

  @JsProperty(
      name = "z"
  )
  @Nonnull
  public native SVGAnimatedNumber z();
}
