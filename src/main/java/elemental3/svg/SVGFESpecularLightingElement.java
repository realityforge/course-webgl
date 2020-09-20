package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFESpecularLightingElement interface corresponds to the feSpecularLighting element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFESpecularLightingElement">SVGFESpecularLightingElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFESpecularLightingElement"
)
public class SVGFESpecularLightingElement extends SVGElement {
  protected SVGFESpecularLightingElement() {
  }

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "in1"
  )
  @Nonnull
  public native SVGAnimatedString in1();

  @JsProperty(
      name = "kernelUnitLengthX"
  )
  @Nonnull
  public native SVGAnimatedNumber kernelUnitLengthX();

  @JsProperty(
      name = "kernelUnitLengthY"
  )
  @Nonnull
  public native SVGAnimatedNumber kernelUnitLengthY();

  @JsProperty(
      name = "result"
  )
  @Nonnull
  public native SVGAnimatedString result();

  @JsProperty(
      name = "specularConstant"
  )
  @Nonnull
  public native SVGAnimatedNumber specularConstant();

  @JsProperty(
      name = "specularExponent"
  )
  @Nonnull
  public native SVGAnimatedNumber specularExponent();

  @JsProperty(
      name = "surfaceScale"
  )
  @Nonnull
  public native SVGAnimatedNumber surfaceScale();

  @JsProperty(
      name = "width"
  )
  @Nonnull
  public native SVGAnimatedLength width();

  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedLength x();

  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedLength y();
}
