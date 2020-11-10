package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGViewElement interface provides access to the properties of view elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGViewElement">SVGViewElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/linking.html#InterfaceSVGViewElement">The definition of 'SVGViewElement' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/linking.html#InterfaceSVGViewElement">The definition of 'SVGViewElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGViewElement"
)
public class SVGViewElement extends SVGElement {
  @JsOverlay
  public static final int SVG_ZOOMANDPAN_DISABLE = 1;

  @JsOverlay
  public static final int SVG_ZOOMANDPAN_MAGNIFY = 2;

  @JsOverlay
  public static final int SVG_ZOOMANDPAN_UNKNOWN = 0;

  public int zoomAndPan;

  protected SVGViewElement() {
  }

  @JsProperty(
      name = "preserveAspectRatio"
  )
  @Nonnull
  public native SVGAnimatedPreserveAspectRatio preserveAspectRatio();

  @JsProperty(
      name = "viewBox"
  )
  @Nonnull
  public native SVGAnimatedRect viewBox();
}
