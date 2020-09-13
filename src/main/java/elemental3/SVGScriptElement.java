package elemental3;

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

  SVGScriptElement() {
  }

  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native SVGAnimatedString href();
}
