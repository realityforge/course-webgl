package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGScriptElement interface corresponds to the SVG script element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGScriptElement">SVGScriptElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/interact.html#InterfaceSVGScriptElement">The definition of 'SVGScriptElement' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/script.html#InterfaceSVGScriptElement">The definition of 'SVGScriptElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGScriptElement"
)
public class SVGScriptElement extends SVGElement {
  @Nullable
  public String crossOrigin;

  @Nonnull
  public String type;

  protected SVGScriptElement() {
  }

  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native SVGAnimatedString href();
}
