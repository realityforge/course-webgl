package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGStopElement interface corresponds to the &lt;stop&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGStopElement">SVGStopElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/pservers.html#InterfaceSVGStopElement">SVGStopElement - Scalable Vector Graphics (SVG) 2</a>
 * @see <a href="https://www.w3.org/TR/SVG11/pservers.html#InterfaceSVGStopElement">SVGStopElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGStopElement"
)
public class SVGStopElement extends SVGElement {
  protected SVGStopElement() {
  }

  @JsProperty(
      name = "offset"
  )
  @Nonnull
  public native SVGAnimatedNumber offset();
}
