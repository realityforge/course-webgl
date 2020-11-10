package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEGaussianBlurElement interface corresponds to the feGaussianBlur element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEGaussianBlurElement">SVGFEGaussianBlurElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEGaussianBlurElement">The definition of 'SVGFEGaussianBlurElement' in the 'Filter Effects Module Level 1' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEGaussianBlurElement">The definition of 'SVGFEGaussianBlurElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEGaussianBlurElement"
)
public class SVGFEGaussianBlurElement extends SVGElement {
  @JsOverlay
  public static final int SVG_EDGEMODE_DUPLICATE = 1;

  @JsOverlay
  public static final int SVG_EDGEMODE_NONE = 3;

  @JsOverlay
  public static final int SVG_EDGEMODE_UNKNOWN = 0;

  @JsOverlay
  public static final int SVG_EDGEMODE_WRAP = 2;

  protected SVGFEGaussianBlurElement() {
  }

  @JsProperty(
      name = "edgeMode"
  )
  @Nonnull
  public native SVGAnimatedEnumeration edgeMode();

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
