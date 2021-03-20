package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFETurbulenceElement interface corresponds to the &lt;feTurbulence&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFETurbulenceElement">SVGFETurbulenceElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFETurbulenceElement">SVGFETurbulenceElement - Filter Effects Module Level 1</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFETurbulenceElement">SVGFETurbulenceElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFETurbulenceElement"
)
public class SVGFETurbulenceElement extends SVGElement {
  @JsOverlay
  public static final int SVG_STITCHTYPE_NOSTITCH = 2;

  @JsOverlay
  public static final int SVG_STITCHTYPE_STITCH = 1;

  @JsOverlay
  public static final int SVG_STITCHTYPE_UNKNOWN = 0;

  @JsOverlay
  public static final int SVG_TURBULENCE_TYPE_FRACTALNOISE = 1;

  @JsOverlay
  public static final int SVG_TURBULENCE_TYPE_TURBULENCE = 2;

  @JsOverlay
  public static final int SVG_TURBULENCE_TYPE_UNKNOWN = 0;

  protected SVGFETurbulenceElement() {
  }

  @JsProperty(
      name = "baseFrequencyX"
  )
  @Nonnull
  public native SVGAnimatedNumber baseFrequencyX();

  @JsProperty(
      name = "baseFrequencyY"
  )
  @Nonnull
  public native SVGAnimatedNumber baseFrequencyY();

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "numOctaves"
  )
  @Nonnull
  public native SVGAnimatedInteger numOctaves();

  @JsProperty(
      name = "result"
  )
  @Nonnull
  public native SVGAnimatedString result();

  @JsProperty(
      name = "seed"
  )
  @Nonnull
  public native SVGAnimatedNumber seed();

  @JsProperty(
      name = "stitchTiles"
  )
  @Nonnull
  public native SVGAnimatedEnumeration stitchTiles();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native SVGAnimatedEnumeration type();

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
