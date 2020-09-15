package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The CanvasPattern interface represents an opaque object describing a pattern, based on an image, a canvas, or a video, created by the CanvasRenderingContext2D.createPattern() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasPattern">CanvasPattern - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CanvasPattern"
)
public class CanvasPattern {
  CanvasPattern() {
  }

  /**
   * The CanvasPattern.setTransform() method uses an SVGMatrix or DOMMatrix object as the pattern's transformation matrix and invokes it on the pattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasPattern/setTransform">CanvasPattern.setTransform - MDN</a>
   */
  public native void setTransform(@Nonnull DOMMatrix2DInit transform);

  /**
   * The CanvasPattern.setTransform() method uses an SVGMatrix or DOMMatrix object as the pattern's transformation matrix and invokes it on the pattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasPattern/setTransform">CanvasPattern.setTransform - MDN</a>
   */
  public native void setTransform();
}