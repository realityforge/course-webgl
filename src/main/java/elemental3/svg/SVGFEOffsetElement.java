package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEOffsetElement interface corresponds to the feOffset element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEOffsetElement">SVGFEOffsetElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEOffsetElement">The definition of 'SVGFEOffsetElement' in the 'Filter Effects Module Level 1' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEOffsetElement">The definition of 'SVGFEOffsetElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEOffsetElement"
)
public class SVGFEOffsetElement extends SVGElement {
  protected SVGFEOffsetElement() {
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
