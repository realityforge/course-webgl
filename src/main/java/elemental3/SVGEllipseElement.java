package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGEllipseElement interface provides access to the properties of ellipse elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGEllipseElement">SVGEllipseElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGEllipseElement"
)
public class SVGEllipseElement extends SVGGeometryElement {
  SVGEllipseElement() {
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
