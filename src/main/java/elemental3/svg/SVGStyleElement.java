package elemental3.svg;

import elemental3.CSSStyleSheet;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGStyleElement interface corresponds to the SVG style element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGStyleElement">SVGStyleElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/styling.html#InterfaceSVGStyleElement">The definition of 'SVGStyleElement' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/styling.html#InterfaceSVGStyleElement">The definition of 'SVGStyleElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGStyleElement"
)
public class SVGStyleElement extends SVGElement {
  @Nonnull
  public String media;

  @Nonnull
  public String title;

  @Nonnull
  public String type;

  protected SVGStyleElement() {
  }

  @JsProperty(
      name = "sheet"
  )
  @Nullable
  public native CSSStyleSheet sheet();
}
