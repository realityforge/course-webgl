package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGClipPathElement interface provides access to the properties of &lt;clipPath&gt; elements, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGClipPathElement">SVGClipPathElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/css-masking-1/#InterfaceSVGClipPathElement">SVGClipPathElement - CSS Masking Module Level 1</a>
 * @see <a href="https://www.w3.org/TR/SVG11/masking.html#InterfaceSVGClipPathElement">SVGClipPathElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGClipPathElement"
)
public class SVGClipPathElement extends SVGElement {
  protected SVGClipPathElement() {
  }

  @JsProperty(
      name = "clipPathUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration clipPathUnits();

  @JsProperty(
      name = "transform"
  )
  @Nonnull
  public native SVGAnimatedTransformList transform();
}
