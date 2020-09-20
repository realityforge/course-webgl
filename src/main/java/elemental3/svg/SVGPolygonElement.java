package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGPolygonElement interface provides access to the properties of polygon elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGPolygonElement">SVGPolygonElement - MDN</a>
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
