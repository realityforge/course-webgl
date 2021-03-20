package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGTextPositioningElement interface is implemented by elements that support attributes that position individual text glyphs. It is inherited by SVGTextElement, SVGTSpanElement, SVGTRefElement and SVGAltGlyphElement.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGTextPositioningElement">SVGTextPositioningElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/text.html#InterfaceSVGTextPositioningElement">SVGTextPositioningElement - Scalable Vector Graphics (SVG) 2</a>
 * @see <a href="https://www.w3.org/TR/SVG11/text.html#InterfaceSVGTextPositioningElement">SVGTextPositioningElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGTextPositioningElement"
)
public class SVGTextPositioningElement extends SVGTextContentElement {
  protected SVGTextPositioningElement() {
  }

  @JsProperty(
      name = "dx"
  )
  @Nonnull
  public native SVGAnimatedLengthList dx();

  @JsProperty(
      name = "dy"
  )
  @Nonnull
  public native SVGAnimatedLengthList dy();

  @JsProperty(
      name = "rotate"
  )
  @Nonnull
  public native SVGAnimatedNumberList rotate();

  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedLengthList x();

  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedLengthList y();
}
