package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEDistantLightElement interface corresponds to the feDistantLight element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEDistantLightElement">SVGFEDistantLightElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEDistantLightElement"
)
public class SVGFEDistantLightElement extends SVGElement {
  SVGFEDistantLightElement() {
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
