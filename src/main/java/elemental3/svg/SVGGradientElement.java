package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGGradient interface is a base interface used by SVGLinearGradientElement and SVGRadialGradientElement.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGGradientElement">SVGGradientElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/pservers.html#InterfaceSVGGradientElement">The definition of 'SVGGradientElement' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/pservers.html#InterfaceSVGGradientElement">The definition of 'SVGGradientElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGGradientElement"
)
public class SVGGradientElement extends SVGElement {
  @JsOverlay
  public static final int SVG_SPREADMETHOD_PAD = 1;

  @JsOverlay
  public static final int SVG_SPREADMETHOD_REFLECT = 2;

  @JsOverlay
  public static final int SVG_SPREADMETHOD_REPEAT = 3;

  @JsOverlay
  public static final int SVG_SPREADMETHOD_UNKNOWN = 0;

  protected SVGGradientElement() {
  }

  @JsProperty(
      name = "gradientTransform"
  )
  @Nonnull
  public native SVGAnimatedTransformList gradientTransform();

  @JsProperty(
      name = "gradientUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration gradientUnits();

  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native SVGAnimatedString href();

  @JsProperty(
      name = "spreadMethod"
  )
  @Nonnull
  public native SVGAnimatedEnumeration spreadMethod();
}
