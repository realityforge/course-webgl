package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGLinearGradientElement interface corresponds to the &lt;linearGradient&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGLinearGradientElement">SVGLinearGradientElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/pservers.html#InterfaceSVGLinearGradientElement">SVGLinearGradientElement - Scalable Vector Graphics (SVG) 2</a>
 * @see <a href="https://www.w3.org/TR/SVG11/pservers.html#InterfaceSVGLinearGradientElement">SVGLinearGradientElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGLinearGradientElement"
)
public class SVGLinearGradientElement extends SVGGradientElement {
  protected SVGLinearGradientElement() {
  }

  @JsProperty(
      name = "x1"
  )
  @Nonnull
  public native SVGAnimatedLength x1();

  @JsProperty(
      name = "x2"
  )
  @Nonnull
  public native SVGAnimatedLength x2();

  @JsProperty(
      name = "y1"
  )
  @Nonnull
  public native SVGAnimatedLength y1();

  @JsProperty(
      name = "y2"
  )
  @Nonnull
  public native SVGAnimatedLength y2();
}
