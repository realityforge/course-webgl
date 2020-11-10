package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGEllipseElement interface provides access to the properties of ellipse elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGEllipseElement">SVGEllipseElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/shapes.html#InterfaceSVGEllipseElement">The definition of 'SVGEllipseElement' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/shapes.html#InterfaceSVGEllipseElement">The definition of 'SVGEllipseElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGEllipseElement"
)
public class SVGEllipseElement extends SVGGeometryElement {
  protected SVGEllipseElement() {
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
      name = "rx"
  )
  @Nonnull
  public native SVGAnimatedLength rx();

  @JsProperty(
      name = "ry"
  )
  @Nonnull
  public native SVGAnimatedLength ry();
}
