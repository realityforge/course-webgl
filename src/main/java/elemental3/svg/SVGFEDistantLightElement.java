package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEDistantLightElement interface corresponds to the feDistantLight element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEDistantLightElement">SVGFEDistantLightElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEDistantLightElement">The definition of 'SVGFEDistantLightElement' in the 'Filter Effects Module Level 1' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEDistantLightElement">The definition of 'SVGFEDistantLightElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEDistantLightElement"
)
public class SVGFEDistantLightElement extends SVGElement {
  protected SVGFEDistantLightElement() {
  }

  @JsProperty(
      name = "azimuth"
  )
  @Nonnull
  public native SVGAnimatedNumber azimuth();

  @JsProperty(
      name = "elevation"
  )
  @Nonnull
  public native SVGAnimatedNumber elevation();
}
