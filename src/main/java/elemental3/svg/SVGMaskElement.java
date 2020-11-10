package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGMaskElement interface provides access to the properties of mask elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGMaskElement">SVGMaskElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/css-masking-1/#InterfaceSVGMaskElement">The definition of 'SVGMaskElement' in the 'CSS Masking Module Level 1' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/masking.html#InterfaceSVGMaskElement">The definition of 'SVGMaskElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGMaskElement"
)
public class SVGMaskElement extends SVGElement {
  protected SVGMaskElement() {
  }

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "maskContentUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration maskContentUnits();

  @JsProperty(
      name = "maskUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration maskUnits();

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
