package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGPolylineElement interface provides access to the properties of polyline elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGPolylineElement">SVGPolylineElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/shapes.html#InterfaceSVGPolylineElement">The definition of 'SVGPolylineElement' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/shapes.html#InterfaceSVGPolylineElement">The definition of 'SVGPolylineElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGPolylineElement"
)
public class SVGPolylineElement extends SVGGeometryElement {
  protected SVGPolylineElement() {
  }

  @JsProperty(
      name = "animatedPoints"
  )
  @Nonnull
  public native SVGPointList animatedPoints();

  @JsProperty(
      name = "points"
  )
  @Nonnull
  public native SVGPointList points();
}
