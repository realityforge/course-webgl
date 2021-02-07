package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Path2D interface of the Canvas 2D API is used to declare a path that can then be used on a CanvasRenderingContext2D object. The path methods of the CanvasRenderingContext2D interface are also present on this interface, which gives you the convenience of being able to retain and replay your path whenever desired.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Path2D">Path2D - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#path2d-objects">Path2D - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Path2D"
)
public class Path2D {
  /**
   * The Path2D() constructor returns a newly instantiated Path2D object, optionally with another path as an argument (creates a copy), or optionally with a string consisting of SVG path data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Path2D/Path2D">Path2D.Path2D - MDN</a>
   */
  public Path2D(@Nonnull final Path2D path) {
  }

  /**
   * The Path2D() constructor returns a newly instantiated Path2D object, optionally with another path as an argument (creates a copy), or optionally with a string consisting of SVG path data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Path2D/Path2D">Path2D.Path2D - MDN</a>
   */
  public Path2D(@Nonnull final String path) {
  }

  /**
   * The Path2D() constructor returns a newly instantiated Path2D object, optionally with another path as an argument (creates a copy), or optionally with a string consisting of SVG path data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Path2D/Path2D">Path2D.Path2D - MDN</a>
   */
  public Path2D() {
  }

  /**
   * The Path2D.addPath() method of the Canvas 2D API adds one Path2D object to another Path2D object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Path2D/addPath">Path2D.addPath - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-path2d-addpath">Path2D.addPath() - HTML Living Standard</a>
   */
  public native void addPath(@Nonnull Path2D path, @Nonnull DOMMatrix2DInit transform);

  /**
   * The Path2D.addPath() method of the Canvas 2D API adds one Path2D object to another Path2D object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Path2D/addPath">Path2D.addPath - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-path2d-addpath">Path2D.addPath() - HTML Living Standard</a>
   */
  public native void addPath(@Nonnull Path2D path);

  public native void arc(double x, double y, double radius, double startAngle, double endAngle,
      boolean anticlockwise);

  public native void arc(double x, double y, double radius, double startAngle, double endAngle);

  public native void arcTo(double x1, double y1, double x2, double y2, double radius);

  public native void bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x,
      double y);

  public native void closePath();

  public native void ellipse(double x, double y, double radiusX, double radiusY, double rotation,
      double startAngle, double endAngle, boolean anticlockwise);

  public native void ellipse(double x, double y, double radiusX, double radiusY, double rotation,
      double startAngle, double endAngle);

  public native void lineTo(double x, double y);

  public native void moveTo(double x, double y);

  public native void quadraticCurveTo(double cpx, double cpy, double x, double y);

  public native void rect(double x, double y, double w, double h);
}
