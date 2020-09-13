package elemental3;

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

  SVGViewElement() {
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
