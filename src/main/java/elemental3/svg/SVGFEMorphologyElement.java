package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEMorphologyElement interface corresponds to the feMorphology element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEMorphologyElement">SVGFEMorphologyElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEMorphologyElement">The definition of 'SVGFEMorphologyElement' in the 'Filter Effects Module Level 1' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEMorphologyElement">The definition of 'SVGFEMorphologyElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEMorphologyElement"
)
public class SVGFEMorphologyElement extends SVGElement {
  @JsOverlay
  public static final int SVG_MORPHOLOGY_OPERATOR_DILATE = 2;

  @JsOverlay
  public static final int SVG_MORPHOLOGY_OPERATOR_ERODE = 1;

  @JsOverlay
  public static final int SVG_MORPHOLOGY_OPERATOR_UNKNOWN = 0;

  protected SVGFEMorphologyElement() {
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
      name = "operator"
  )
  @Nonnull
  public native SVGAnimatedEnumeration operator();

  @JsProperty(
      name = "radiusX"
  )
  @Nonnull
  public native SVGAnimatedNumber radiusX();

  @JsProperty(
      name = "radiusY"
  )
  @Nonnull
  public native SVGAnimatedNumber radiusY();

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
