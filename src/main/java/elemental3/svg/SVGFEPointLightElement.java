package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEPointLightElement interface corresponds to the &lt;fePointLight&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEPointLightElement">SVGFEPointLightElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEPointLightElement">SVGFEPointLightElement - Filter Effects Module Level 1</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEPointLightElement">SVGFEPointLightElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEPointLightElement"
)
public class SVGFEPointLightElement extends SVGElement {
  protected SVGFEPointLightElement() {
  }

  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedNumber x();

  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedNumber y();

  @JsProperty(
      name = "z"
  )
  @Nonnull
  public native SVGAnimatedNumber z();
}
