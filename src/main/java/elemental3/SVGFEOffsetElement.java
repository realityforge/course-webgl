package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEOffsetElement interface corresponds to the feOffset element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEOffsetElement">SVGFEOffsetElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEOffsetElement"
)
public class SVGFEOffsetElement extends SVGElement {
  SVGFEOffsetElement() {
  }

  @JsProperty(
      name = "dx"
  )
  @Nonnull
  public native SVGAnimatedNumber dx();

  @JsProperty(
      name = "dy"
  )
  @Nonnull
  public native SVGAnimatedNumber dy();

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "in1"
  )
  @Nonnull
  public native SVGAnimatedString in1();

  @JsProperty(
      name = "result"
  )
  @Nonnull
  public native SVGAnimatedString result();

  @JsProperty(
      name = "width"
  )
  @Nonnull
  public native SVGAnimatedLength width();

  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedLength x();

  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedLength y();
}
