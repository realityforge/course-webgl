package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFilterElement interface provides access to the properties of filter elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFilterElement">SVGFilterElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFilterElement">The definition of 'SVGFilterElement' in the 'Filter Effects Module Level 1' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFilterElement">The definition of 'SVGFilterElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFilterElement"
)
public class SVGFilterElement extends SVGElement {
  protected SVGFilterElement() {
  }

  @JsProperty(
      name = "filterUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration filterUnits();

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native SVGAnimatedString href();

  @JsProperty(
      name = "primitiveUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration primitiveUnits();

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
