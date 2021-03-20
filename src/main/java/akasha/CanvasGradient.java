package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The CanvasGradient interface represents an opaque object describing a gradient. It is returned by the methods CanvasRenderingContext2D.createLinearGradient(), CanvasRenderingContext2D.createConicGradient() or CanvasRenderingContext2D.createRadialGradient().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasGradient">CanvasGradient - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/the-canvas-element.html#canvasgradient">CanvasGradient - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CanvasGradient"
)
public class CanvasGradient {
  protected CanvasGradient() {
  }

  /**
   * The CanvasGradient.addColorStop() method adds a new color stop, defined by an offset and a color, to a given canvas gradient.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasGradient/addColorStop">CanvasGradient.addColorStop - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-canvasgradient-addcolorstop">CanvasGradient.addColorStop - HTML Living Standard</a>
   */
  public native void addColorStop(double offset, @Nonnull String color);
}
