package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFETileElement interface corresponds to the &lt;feTile&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFETileElement">SVGFETileElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFETileElement">SVGFETileElement - Filter Effects Module Level 1</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFETileElement">SVGFETileElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFETileElement"
)
public class SVGFETileElement extends SVGElement {
  protected SVGFETileElement() {
  }

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "in1"
  )
  @Nonnull
  public native SVGAnimatedString in1();

  @JsProperty(
      name = "result"
  )
  @Nonnull
  public native SVGAnimatedString result();

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
