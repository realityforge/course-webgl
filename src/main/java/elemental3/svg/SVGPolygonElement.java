package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGPolygonElement interface provides access to the properties of &lt;polygon&gt; elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGPolygonElement">SVGPolygonElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/shapes.html#InterfaceSVGPolygonElement">SVGPolygonElement - Scalable Vector Graphics (SVG) 2</a>
 * @see <a href="https://www.w3.org/TR/SVG11/shapes.html#InterfaceSVGPolygonElement">SVGPolygonElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGPolygonElement"
)
public class SVGPolygonElement extends SVGGeometryElement {
  protected SVGPolygonElement() {
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
