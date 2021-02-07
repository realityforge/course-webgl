package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGImageElement interface corresponds to the &lt;image&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGImageElement">SVGImageElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/embedded.html#InterfaceSVGImageElement">SVGImageElement - Scalable Vector Graphics (SVG) 2</a>
 * @see <a href="https://www.w3.org/TR/SVG11/struct.html#InterfaceSVGImageElement">SVGImageElement - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGImageElement"
)
public class SVGImageElement extends SVGGraphicsElement {
  @Nullable
  public String crossOrigin;

  protected SVGImageElement() {
  }

  /**
   * The height read-only property of the SVGImageElement interface returns an SVGAnimatedLength corresponding to the height attribute of the given image element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGImageElement/height">SVGImageElement.height - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/single-page.html#embedded-__svg__SVGImageElement__height">height - Scalable Vector Graphics (SVG) 2</a>
   */
  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native SVGAnimatedString href();

  /**
   * The preserveAspectRatio read-only property of the SVGImageElement interface returns an SVGAnimatedPreserveAspectRatio corresponding to the preserveAspectRatio attribute of the given image element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGImageElement/preserveAspectRatio">SVGImageElement.preserveAspectRatio - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/coords.html#PreserveAspectRatioAttribute">preserveAspectRatio - Scalable Vector Graphics (SVG) 2</a>
   * @see <a href="https://www.w3.org/TR/SVG11/coords.html#PreserveAspectRatioAttribute">preserveAspectRatio - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
   */
  @JsProperty(
      name = "preserveAspectRatio"
  )
  @Nonnull
  public native SVGAnimatedPreserveAspectRatio preserveAspectRatio();

  /**
   * The width read-only property of the SVGImageElement interface returns an SVGAnimatedLength corresponding to the width attribute of the given image element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGImageElement/width">SVGImageElement.width - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/single-page.html#embedded-__svg__SVGImageElement__width">width - Scalable Vector Graphics (SVG) 2</a>
   */
  @JsProperty(
      name = "width"
  )
  @Nonnull
  public native SVGAnimatedLength width();

  /**
   * The x read-only property of the SVGImageElement interface returns an SVGAnimatedLength corresponding to the x attribute of the given image element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGImageElement/x">SVGImageElement.x - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/single-page.html#embedded-__svg__SVGImageElement__x">x - Scalable Vector Graphics (SVG) 2</a>
   */
  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedLength x();

  /**
   * The y read-only property of the SVGImageElement interface returns an SVGAnimatedLength corresponding to the y attribute of the given image element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGImageElement/y">SVGImageElement.y - MDN</a>
   * @see <a href="https://svgwg.org/svg2-draft/single-page.html#embedded-__svg__SVGImageElement__y">y - Scalable Vector Graphics (SVG) 2</a>
   */
  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedLength y();
}
