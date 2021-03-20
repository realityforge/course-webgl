package akasha.svg;

import akasha.DOMMatrix;
import akasha.DOMRect;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGGraphicsElement interface represents SVG elements whose primary purpose is to directly render graphics into a group.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGGraphicsElement">SVGGraphicsElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/types.html#InterfaceSVGGraphicsElement">SVGGraphicsElement - Scalable Vector Graphics (SVG) 2</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGGraphicsElement"
)
public class SVGGraphicsElement extends SVGElement {
  protected SVGGraphicsElement() {
  }

  @JsProperty(
      name = "requiredExtensions"
  )
  @Nonnull
  public native SVGStringList requiredExtensions();

  @JsProperty(
      name = "systemLanguage"
  )
  @Nonnull
  public native SVGStringList systemLanguage();

  @JsProperty(
      name = "transform"
  )
  @Nonnull
  public native SVGAnimatedTransformList transform();

  /**
   * The SVGGraphicsElement.getBBox() allows us to determine the coordinates of the smallest rectangle in which the object fits. The coordinates returned are with respect to the current SVG space (after the application of all geometry attributes on all the elements contained in the target element).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGGraphicsElement/getBBox">SVGGraphicsElement.getBBox - MDN</a>
   * @see <a href="https://www.w3.org/TR/SVG11/types.html#__svg__SVGLocatable__getBBox">getBBox - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
   */
  @Nonnull
  public native DOMRect getBBox(@Nonnull SVGBoundingBoxOptions options);

  /**
   * The SVGGraphicsElement.getBBox() allows us to determine the coordinates of the smallest rectangle in which the object fits. The coordinates returned are with respect to the current SVG space (after the application of all geometry attributes on all the elements contained in the target element).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGGraphicsElement/getBBox">SVGGraphicsElement.getBBox - MDN</a>
   * @see <a href="https://www.w3.org/TR/SVG11/types.html#__svg__SVGLocatable__getBBox">getBBox - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
   */
  @Nonnull
  public native DOMRect getBBox();

  @Nullable
  public native DOMMatrix getCTM();

  @Nullable
  public native DOMMatrix getScreenCTM();
}
