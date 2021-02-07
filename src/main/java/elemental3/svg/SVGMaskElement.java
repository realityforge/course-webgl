package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGMaskElement interface provides access to the properties of &lt;mask&gt; elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGMaskElement">SVGMaskElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/css-masking-1/#InterfaceSVGMaskElement">SVGMaskElement - CSS Masking Module Level 1</a>
 * @see <a href="https://www.w3.org/TR/SVG11/masking.html#InterfaceSVGMaskElement">SVGMaskElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGMaskElement"
)
public class SVGMaskElement extends SVGElement {
  protected SVGMaskElement() {
  }

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "maskContentUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration maskContentUnits();

  @JsProperty(
      name = "maskUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration maskUnits();

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
