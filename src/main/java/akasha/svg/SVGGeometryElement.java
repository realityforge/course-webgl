package akasha.svg;

import akasha.DOMPoint;
import akasha.DOMPointInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGGeometryElement interface represents SVG elements whose rendering is defined by geometry with an equivalent path, and which can be filled and stroked. This includes paths and the basic shapes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGGeometryElement">SVGGeometryElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/types.html#InterfaceSVGGeometryElement">SVGGeometryElement - Scalable Vector Graphics (SVG) 2</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGGeometryElement"
)
public class SVGGeometryElement extends SVGGraphicsElement {
  protected SVGGeometryElement() {
  }

  /**
   * The SVGGeometryElement.pathLength property reflects the pathLength attribute and returns the total length of the path, in user units.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGGeometryElement/pathLength">SVGGeometryElement.pathLength - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/types.html#__svg__SVGGeometryElement__pathLength">SVGGeometryElement.pathLength - Scalable Vector Graphics (SVG) 2</a>
   */
  @JsProperty(
      name = "pathLength"
  )
  @Nonnull
  public native SVGAnimatedNumber pathLength();

  /**
   * The SVGGeometryElement.getPointAtLength() method returns the point at a given distance along the path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGGeometryElement/getPointAtLength">SVGGeometryElement.getPointAtLength - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/types.html#__svg__SVGGeometryElement__getPointAtLength">SVGGeometryElement.getTotalLength() - Scalable Vector Graphics (SVG) 2</a>
   */
  @Nonnull
  public native DOMPoint getPointAtLength(float distance);

  /**
   * The SVGGeometryElement.getTotalLength() method returns the user agent's computed value for the total length of the path in user units.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGGeometryElement/getTotalLength">SVGGeometryElement.getTotalLength - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/types.html#__svg__SVGGeometryElement__getTotalLength">SVGGeometryElement.getTotalLength() - Scalable Vector Graphics (SVG) 2</a>
   */
  public native float getTotalLength();

  /**
   * The SVGGeometryElement.isPointInFill() method determines whether a given point is within the fill shape of an element. Normal hit testing rules apply; the value of the pointer-events property on the element determines whether a point is considered to be within the fill. The point argument is interpreted as a point in the local coordiante system of the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGGeometryElement/isPointInFill">SVGGeometryElement.isPointInFill - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/types.html#__svg__SVGGeometryElement__isPointInFill">SVGGeometryElement.isPointInFill() - Scalable Vector Graphics (SVG) 2</a>
   */
  public native boolean isPointInFill(@Nonnull DOMPointInit point);

  /**
   * The SVGGeometryElement.isPointInFill() method determines whether a given point is within the fill shape of an element. Normal hit testing rules apply; the value of the pointer-events property on the element determines whether a point is considered to be within the fill. The point argument is interpreted as a point in the local coordiante system of the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGGeometryElement/isPointInFill">SVGGeometryElement.isPointInFill - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/types.html#__svg__SVGGeometryElement__isPointInFill">SVGGeometryElement.isPointInFill() - Scalable Vector Graphics (SVG) 2</a>
   */
  public native boolean isPointInFill();

  /**
   * The SVGGeometryElement.isPointInStroke() method determines whether a given point is within the stroke shape of an element. Normal hit testing rules apply; the value of the pointer-events property on the element determines whether a point is considered to be within the stroke. The point argument is interpreted as a point in the local coordiante system of the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGGeometryElement/isPointInStroke">SVGGeometryElement.isPointInStroke - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/types.html#__svg__SVGGeometryElement__isPointInStroke">SVGGeometryElement.isPointInStroke() - Scalable Vector Graphics (SVG) 2</a>
   */
  public native boolean isPointInStroke(@Nonnull DOMPointInit point);

  /**
   * The SVGGeometryElement.isPointInStroke() method determines whether a given point is within the stroke shape of an element. Normal hit testing rules apply; the value of the pointer-events property on the element determines whether a point is considered to be within the stroke. The point argument is interpreted as a point in the local coordiante system of the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGGeometryElement/isPointInStroke">SVGGeometryElement.isPointInStroke - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/types.html#__svg__SVGGeometryElement__isPointInStroke">SVGGeometryElement.isPointInStroke() - Scalable Vector Graphics (SVG) 2</a>
   */
  public native boolean isPointInStroke();
}
