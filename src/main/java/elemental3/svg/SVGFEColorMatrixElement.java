package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEColorMatrixElement interface corresponds to the &lt;feColorMatrix&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEColorMatrixElement">SVGFEColorMatrixElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEColorMatrixElement">SVGFEColorMatrixElement - Filter Effects Module Level 1</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEColorMatrixElement">SVGFEColorMatrixElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEColorMatrixElement"
)
public class SVGFEColorMatrixElement extends SVGElement {
  @JsOverlay
  public static final int SVG_FECOLORMATRIX_TYPE_HUEROTATE = 3;

  @JsOverlay
  public static final int SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA = 4;

  @JsOverlay
  public static final int SVG_FECOLORMATRIX_TYPE_MATRIX = 1;

  @JsOverlay
  public static final int SVG_FECOLORMATRIX_TYPE_SATURATE = 2;

  @JsOverlay
  public static final int SVG_FECOLORMATRIX_TYPE_UNKNOWN = 0;

  protected SVGFEColorMatrixElement() {
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
      name = "result"
  )
  @Nonnull
  public native SVGAnimatedString result();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native SVGAnimatedEnumeration type();

  @JsProperty(
      name = "values"
  )
  @Nonnull
  public native SVGAnimatedNumberList values();

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
