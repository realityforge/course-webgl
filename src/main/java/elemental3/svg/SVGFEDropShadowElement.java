package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEDropShadowElement interface corresponds to the feDropShadow element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEDropShadowElement">SVGFEDropShadowElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEDropShadowElement">The definition of 'SVGFEDropShadowElement' in the 'Filter Effects Module Level 1' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEDropShadowElement"
)
public class SVGFEDropShadowElement extends SVGElement {
  protected SVGFEDropShadowElement() {
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
      name = "stdDeviationX"
  )
  @Nonnull
  public native SVGAnimatedNumber stdDeviationX();

  @JsProperty(
      name = "stdDeviationY"
  )
  @Nonnull
  public native SVGAnimatedNumber stdDeviationY();

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

  public native void setStdDeviation(float stdDeviationX, float stdDeviationY);
}
