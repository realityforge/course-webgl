package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGLineElement interface provides access to the properties of line elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGLineElement">SVGLineElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/shapes.html#InterfaceSVGLineElement">The definition of 'SVGLineElement' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/shapes.html#InterfaceSVGLineElement">The definition of 'SVGLineElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGLineElement"
)
public class SVGLineElement extends SVGGeometryElement {
  protected SVGLineElement() {
  }

  @JsProperty(
      name = "x1"
  )
  @Nonnull
  public native SVGAnimatedLength x1();

  @JsProperty(
      name = "x2"
  )
  @Nonnull
  public native SVGAnimatedLength x2();

  @JsProperty(
      name = "y1"
  )
  @Nonnull
  public native SVGAnimatedLength y1();

  @JsProperty(
      name = "y2"
  )
  @Nonnull
  public native SVGAnimatedLength y2();
}
