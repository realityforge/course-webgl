package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGTextPathElement interface corresponds to the &lt;textPath&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGTextPathElement">SVGTextPathElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/text.html#InterfaceSVGTextPathElement">SVGTextPathElement - Scalable Vector Graphics (SVG) 2</a>
 * @see <a href="https://www.w3.org/TR/SVG11/text.html#InterfaceSVGTextPathElement">SVGTextPathElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGTextPathElement"
)
public class SVGTextPathElement extends SVGTextContentElement {
  @JsOverlay
  public static final int TEXTPATH_METHODTYPE_ALIGN = 1;

  @JsOverlay
  public static final int TEXTPATH_METHODTYPE_STRETCH = 2;

  @JsOverlay
  public static final int TEXTPATH_METHODTYPE_UNKNOWN = 0;

  @JsOverlay
  public static final int TEXTPATH_SPACINGTYPE_AUTO = 1;

  @JsOverlay
  public static final int TEXTPATH_SPACINGTYPE_EXACT = 2;

  @JsOverlay
  public static final int TEXTPATH_SPACINGTYPE_UNKNOWN = 0;

  protected SVGTextPathElement() {
  }

  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native SVGAnimatedString href();

  @JsProperty(
      name = "method"
  )
  @Nonnull
  public native SVGAnimatedEnumeration method();

  @JsProperty(
      name = "spacing"
  )
  @Nonnull
  public native SVGAnimatedEnumeration spacing();

  @JsProperty(
      name = "startOffset"
  )
  @Nonnull
  public native SVGAnimatedLength startOffset();
}
