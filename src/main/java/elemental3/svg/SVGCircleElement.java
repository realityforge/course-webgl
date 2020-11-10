package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGCircleElement interface is an interface for the circle element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGCircleElement">SVGCircleElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/shapes.html#InterfaceSVGCircleElement">The definition of 'SVGCircleElement' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/shapes.html#InterfaceSVGCircleElement">The definition of 'SVGCircleElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGCircleElement"
)
public class SVGCircleElement extends SVGGeometryElement {
  protected SVGCircleElement() {
  }

  /**
   * The cx read-only property of the SVGCircleElement interface reflects the cx attribute of a circle element and by that defines the x-coordinate of the circleʼs center.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGCircleElement/cx">SVGCircleElement.cx - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/shapes.html#__svg__SVGCircleElement__cx">The definition of 'SVGCircleElement.cx' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/SVG11/shapes.html#__svg__SVGCircleElement__cx">The definition of 'SVGCircleElement.cx' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
   */
  @JsProperty(
      name = "cx"
  )
  @Nonnull
  public native SVGAnimatedLength cx();

  /**
   * The cy read-only property of the SVGCircleElement interface reflects the cy attribute of a circle element and by that defines the y-coordinate of the circleʼs center.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGCircleElement/cy">SVGCircleElement.cy - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/shapes.html#__svg__SVGCircleElement__cy">The definition of 'SVGCircleElement.cy' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/SVG11/shapes.html#__svg__SVGCircleElement__cy">The definition of 'SVGCircleElement.cy' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
   */
  @JsProperty(
      name = "cy"
  )
  @Nonnull
  public native SVGAnimatedLength cy();

  /**
   * The r read-only property of the SVGCircleElement interface reflects the r attribute of a circle element and by that defines the radius of the circle.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGCircleElement/r">SVGCircleElement.r - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/shapes.html#__svg__SVGCircleElement__r">The definition of 'SVGCircleElement.r' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/SVG11/shapes.html#__svg__SVGCircleElement__r">The definition of 'SVGCircleElement.r' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
   */
  @JsProperty(
      name = "r"
  )
  @Nonnull
  public native SVGAnimatedLength r();
}
