package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEDiffuseLightingElement interface corresponds to the feDiffuseLighting element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEDiffuseLightingElement">SVGFEDiffuseLightingElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEDiffuseLightingElement"
)
public class SVGFEDiffuseLightingElement extends SVGElement {
  SVGFEDiffuseLightingElement() {
  }

  @JsProperty(
      name = "diffuseConstant"
  )
  @Nonnull
  public native SVGAnimatedNumber diffuseConstant();

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
      name = "surfaceScale"
  )
  @Nonnull
  public native SVGAnimatedNumber surfaceScale();

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "result"
  )
  @Nonnull
  public native SVGAnimatedString result();

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
