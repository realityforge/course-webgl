package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGForeignObjectElement interface provides access to the properties of &lt;foreignObject&gt; elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGForeignObjectElement">SVGForeignObjectElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/embedded.html#ForeignObjectElement">SVGForeignObjectElement - Scalable Vector Graphics (SVG) 2</a>
 * @see <a href="https://www.w3.org/TR/SVG11/extend.html#InterfaceSVGForeignObjectElement">SVGForeignObjectElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGForeignObjectElement"
)
public class SVGForeignObjectElement extends SVGGraphicsElement {
  protected SVGForeignObjectElement() {
  }

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

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
