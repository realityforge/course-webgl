package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGPolylineElement interface provides access to the properties of polyline elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGPolylineElement">SVGPolylineElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGPolylineElement"
)
public class SVGPolylineElement extends SVGGeometryElement {
  SVGPolylineElement() {
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
