package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEDiffuseLightingElement interface corresponds to the &lt;feDiffuseLighting&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEDiffuseLightingElement">SVGFEDiffuseLightingElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEDiffuseLightingElement">SVGFEDiffuseLightingElement - Filter Effects Module Level 1</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEDiffuseLightingElement">SVGFEDiffuseLightingElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEDiffuseLightingElement"
)
public class SVGFEDiffuseLightingElement extends SVGElement {
  protected SVGFEDiffuseLightingElement() {
  }

  @JsProperty(
      name = "diffuseConstant"
  )
  @Nonnull
  public native SVGAnimatedNumber diffuseConstant();

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
