package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGImageElement interface corresponds to the image element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGImageElement">SVGImageElement - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/embedded.html#InterfaceSVGImageElement">The definition of 'SVGImageElement' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/struct.html#InterfaceSVGImageElement">The definition of 'SVGImageElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
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
   * @see <a href="https://svgwg.org/svg2-draft/single-page.html#embedded-__svg__SVGImageElement__height">The definition of 'height' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
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
   * @see <a href="https://svgwg.org/svg2-draft/coords.html#PreserveAspectRatioAttribute">The definition of 'preserveAspectRatio' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
   * @see <a href="https://www.w3.org/TR/SVG11/coords.html#PreserveAspectRatioAttribute">The definition of 'preserveAspectRatio' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
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
   * @see <a href="https://svgwg.org/svg2-draft/single-page.html#embedded-__svg__SVGImageElement__width">The definition of 'width' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
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
   * @see <a href="https://svgwg.org/svg2-draft/single-page.html#embedded-__svg__SVGImageElement__x">The definition of 'x' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
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
   * @see <a href="https://svgwg.org/svg2-draft/single-page.html#embedded-__svg__SVGImageElement__y">The definition of 'y' in the 'Scalable Vector Graphics (SVG) 2' specification.</a>
   */
  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedLength y();
}
