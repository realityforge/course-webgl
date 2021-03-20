package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEConvolveMatrixElement interface corresponds to the &lt;feConvolveMatrix&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEConvolveMatrixElement">SVGFEConvolveMatrixElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEConvolveMatrixElement">SVGFEConvolveMatrixElement - Filter Effects Module Level 1</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEConvolveMatrixElement">SVGFEConvolveMatrixElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEConvolveMatrixElement"
)
public class SVGFEConvolveMatrixElement extends SVGElement {
  @JsOverlay
  public static final int SVG_EDGEMODE_DUPLICATE = 1;

  @JsOverlay
  public static final int SVG_EDGEMODE_NONE = 3;

  @JsOverlay
  public static final int SVG_EDGEMODE_UNKNOWN = 0;

  @JsOverlay
  public static final int SVG_EDGEMODE_WRAP = 2;

  protected SVGFEConvolveMatrixElement() {
  }

  @JsProperty(
      name = "bias"
  )
  @Nonnull
  public native SVGAnimatedNumber bias();

  @JsProperty(
      name = "divisor"
  )
  @Nonnull
  public native SVGAnimatedNumber divisor();

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
      name = "kernelMatrix"
  )
  @Nonnull
  public native SVGAnimatedNumberList kernelMatrix();

  @JsProperty(
      name = "kernelUnitLengthX"
  )
  @Nonnull
  public native SVGAnimatedNumber kernelUnitLengthX();

  @JsProperty(
      name = "kernelUnitLengthY"
  )
  @Nonnull
  public native SVGAnimatedNumber kernelUnitLengthY();

  @JsProperty(
      name = "orderX"
  )
  @Nonnull
  public native SVGAnimatedInteger orderX();

  @JsProperty(
      name = "orderY"
  )
  @Nonnull
  public native SVGAnimatedInteger orderY();

  @JsProperty(
      name = "preserveAlpha"
  )
  @Nonnull
  public native SVGAnimatedBoolean preserveAlpha();

  @JsProperty(
      name = "result"
  )
  @Nonnull
  public native SVGAnimatedString result();

  @JsProperty(
      name = "targetX"
  )
  @Nonnull
  public native SVGAnimatedInteger targetX();

  @JsProperty(
      name = "targetY"
  )
  @Nonnull
  public native SVGAnimatedInteger targetY();

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
