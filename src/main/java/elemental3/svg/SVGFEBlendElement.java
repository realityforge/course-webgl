package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEBlendElement interface corresponds to the feBlend element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEBlendElement">SVGFEBlendElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEBlendElement">The definition of 'SVGFEBlendElement' in the 'Filter Effects Module Level 1' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEBlendElement">The definition of 'SVGFEBlendElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEBlendElement"
)
public class SVGFEBlendElement extends SVGElement {
  @JsOverlay
  public static final int SVG_FEBLEND_MODE_COLOR = 15;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_COLOR_BURN = 8;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_COLOR_DODGE = 7;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_DARKEN = 4;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_DIFFERENCE = 11;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_EXCLUSION = 12;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_HARD_LIGHT = 9;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_HUE = 13;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_LIGHTEN = 5;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_LUMINOSITY = 16;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_MULTIPLY = 2;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_NORMAL = 1;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_OVERLAY = 6;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_SATURATION = 14;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_SCREEN = 3;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_SOFT_LIGHT = 10;

  @JsOverlay
  public static final int SVG_FEBLEND_MODE_UNKNOWN = 0;

  protected SVGFEBlendElement() {
  }

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
      name = "in2"
  )
  @Nonnull
  public native SVGAnimatedString in2();

  @JsProperty(
      name = "mode"
  )
  @Nonnull
  public native SVGAnimatedEnumeration mode();

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
