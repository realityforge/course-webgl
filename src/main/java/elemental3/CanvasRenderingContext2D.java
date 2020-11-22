package elemental3;

import elemental3.core.JsArray;
import elemental3.svg.SVGImageElement;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CanvasRenderingContext2D interface, part of the Canvas API, provides the 2D rendering context for the drawing surface of a canvas element. It is used for drawing shapes, text, images, and other objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D">CanvasRenderingContext2D - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#2dcontext">The definition of 'CanvasRenderingContext2D' in the 'HTML Living Standard' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CanvasRenderingContext2D"
)
public class CanvasRenderingContext2D {
  /**
   * The CanvasRenderingContext2D.direction property of the Canvas 2D API specifies the current text direction used to draw text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/direction">CanvasRenderingContext2D.direction - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-direction">The definition of 'CanvasRenderingContext2D.direction' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  @CanvasDirection
  public String direction;

  /**
   * The CanvasRenderingContext2D.fillStyle property of the Canvas 2D API specifies the color, gradient, or pattern to use inside shapes. The default style is #000 (black).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillStyle">CanvasRenderingContext2D.fillStyle - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-fillstyle">The definition of 'CanvasRenderingContext2D.fillStyle' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public StringOrCanvasGradientOrCanvasPatternUnion fillStyle;

  /**
   * The CanvasRenderingContext2D.filter property of the Canvas 2D API provides filter effects such as blurring and grayscaling. It is similar to the CSS filter property and accepts the same values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/filter">CanvasRenderingContext2D.filter - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#filters">The definition of 'CanvasRenderingContext2D.filter' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public String filter;

  /**
   * The CanvasRenderingContext2D.font property of the Canvas 2D API specifies the current text style to use when drawing text. This string uses the same syntax as the CSS font specifier.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/font">CanvasRenderingContext2D.font - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-font">The definition of 'CanvasRenderingContext2D.font' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public String font;

  /**
   * The CanvasRenderingContext2D.globalAlpha property of the Canvas 2D API specifies the alpha (transparency) value that is applied to shapes and images before they are drawn onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/globalAlpha">CanvasRenderingContext2D.globalAlpha - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-globalalpha">The definition of 'CanvasRenderingContext2D.globalAlpha' in the 'HTML Living Standard' specification.</a>
   */
  public double globalAlpha;

  /**
   * The CanvasRenderingContext2D.globalCompositeOperation property of the Canvas 2D API sets the type of compositing operation to apply when drawing new shapes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation">CanvasRenderingContext2D.globalCompositeOperation - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-globalcompositeoperation">The definition of 'CanvasRenderingContext2D.globalCompositeOperation' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://drafts.fxtf.org/compositing-1/">Compositing and Blending Level 1</a>
   */
  @Nonnull
  public String globalCompositeOperation;

  /**
   * The imageSmoothingEnabled property of the CanvasRenderingContext2D interface, part of the Canvas API, determines whether scaled images are smoothed (true, default) or not (false). On getting the imageSmoothingEnabled property, the last value it was set to is returned.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/imageSmoothingEnabled">CanvasRenderingContext2D.imageSmoothingEnabled - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-imagesmoothingenabled">The definition of 'CanvasRenderingContext2D.imageSmoothingEnabled' in the 'HTML Living Standard' specification.</a>
   */
  public boolean imageSmoothingEnabled;

  /**
   * The imageSmoothingQuality property of the CanvasRenderingContext2D interface, part of the Canvas API, lets you set the quality of image smoothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/imageSmoothingQuality">CanvasRenderingContext2D.imageSmoothingQuality - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#imagesmoothingquality">The definition of 'imageSmoothingQuality' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  @ImageSmoothingQuality
  public String imageSmoothingQuality;

  /**
   * The CanvasRenderingContext2D.lineCap property of the Canvas 2D API determines the shape used to draw the end points of lines.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineCap">CanvasRenderingContext2D.lineCap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-linecap">The definition of 'CanvasRenderingContext2D.lineCap' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  @CanvasLineCap
  public String lineCap;

  /**
   * The CanvasRenderingContext2D.lineDashOffset property of the Canvas 2D API sets the line dash offset, or &quot;phase.&quot;
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineDashOffset">CanvasRenderingContext2D.lineDashOffset - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-linedashoffset">The definition of 'CanvasRenderingContext2D.lineDashOffset' in the 'HTML Living Standard' specification.</a>
   */
  public double lineDashOffset;

  /**
   * The CanvasRenderingContext2D.lineJoin property of the Canvas 2D API determines the shape used to join two line segments where they meet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineJoin">CanvasRenderingContext2D.lineJoin - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-linejoin">The definition of 'CanvasRenderingContext2D.lineJoin' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  @CanvasLineJoin
  public String lineJoin;

  /**
   * The CanvasRenderingContext2D.lineWidth property of the Canvas 2D API sets the thickness of lines.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineWidth">CanvasRenderingContext2D.lineWidth - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-linewidth">The definition of 'CanvasRenderingContext2D.lineWidth' in the 'HTML Living Standard' specification.</a>
   */
  public double lineWidth;

  /**
   * The CanvasRenderingContext2D.miterLimit property of the Canvas 2D API sets the miter limit ratio.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/miterLimit">CanvasRenderingContext2D.miterLimit - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-miterlimit">The definition of 'CanvasRenderingContext2D.miterLimit' in the 'HTML Living Standard' specification.</a>
   */
  public double miterLimit;

  /**
   * The CanvasRenderingContext2D.shadowBlur property of the Canvas 2D API specifies the amount of blur applied to shadows. The default is 0 (no blur).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/shadowBlur">CanvasRenderingContext2D.shadowBlur - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-shadowblur">The definition of 'CanvasRenderingContext2D.shadowBlur' in the 'HTML Living Standard' specification.</a>
   */
  public double shadowBlur;

  /**
   * The CanvasRenderingContext2D.shadowColor property of the Canvas 2D API specifies the color of shadows.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/shadowColor">CanvasRenderingContext2D.shadowColor - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-shadowcolor">The definition of 'CanvasRenderingContext2D.shadowColor' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public String shadowColor;

  /**
   * The CanvasRenderingContext2D.shadowOffsetX property of the Canvas 2D API specifies the distance that shadows will be offset horizontally.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/shadowOffsetX">CanvasRenderingContext2D.shadowOffsetX - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-shadowoffsetx">The definition of 'CanvasRenderingContext2D.shadowOffsetX' in the 'HTML Living Standard' specification.</a>
   */
  public double shadowOffsetX;

  /**
   * The CanvasRenderingContext2D.shadowOffsetY property of the Canvas 2D API specifies the distance that shadows will be offset vertically.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/shadowOffsetY">CanvasRenderingContext2D.shadowOffsetY - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-shadowoffsety">The definition of 'CanvasRenderingContext2D.shadowOffsetY' in the 'HTML Living Standard' specification.</a>
   */
  public double shadowOffsetY;

  /**
   * The CanvasRenderingContext2D.strokeStyle property of the Canvas 2D API specifies the color, gradient, or pattern to use for the strokes (outlines) around shapes. The default is #000 (black).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/strokeStyle">CanvasRenderingContext2D.strokeStyle - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-strokestyle">The definition of 'CanvasRenderingContext2D.strokeStyle' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public StringOrCanvasGradientOrCanvasPatternUnion strokeStyle;

  /**
   * The CanvasRenderingContext2D.textAlign property of the Canvas 2D API specifies the current text alignment used when drawing text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/textAlign">CanvasRenderingContext2D.textAlign - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-textalign">The definition of 'CanvasRenderingContext2D.textAlign' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  @CanvasTextAlign
  public String textAlign;

  /**
   * The CanvasRenderingContext2D.textBaseline property of the Canvas 2D API specifies the current text baseline used when drawing text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/textBaseline">CanvasRenderingContext2D.textBaseline - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-textbaseline">The definition of 'CanvasRenderingContext2D.textBaseline' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  @CanvasTextBaseline
  public String textBaseline;

  protected CanvasRenderingContext2D() {
  }

  /**
   * The CanvasRenderingContext2D.canvas property, part of the Canvas API, is a read-only reference to the HTMLCanvasElement object that is associated with a given context. It might be null if there is no associated canvas element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/canvas">CanvasRenderingContext2D.canvas - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-canvas">The definition of 'CanvasRenderingContext2D.canvas' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "canvas"
  )
  @Nonnull
  public native HTMLCanvasElement canvas();

  @Nonnull
  public native CanvasRenderingContext2DSettings getContextAttributes();

  /**
   * The CanvasRenderingContext2D.createImageData() method of the Canvas 2D API creates a new, blank ImageData object with the specified dimensions. All of the pixels in the new object are transparent black.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createImageData">CanvasRenderingContext2D.createImageData - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-createimagedata">The definition of 'CanvasRenderingContext2D.createImageData' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native ImageData createImageData(int sw, int sh);

  /**
   * The CanvasRenderingContext2D.createImageData() method of the Canvas 2D API creates a new, blank ImageData object with the specified dimensions. All of the pixels in the new object are transparent black.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createImageData">CanvasRenderingContext2D.createImageData - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-createimagedata">The definition of 'CanvasRenderingContext2D.createImageData' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native ImageData createImageData(@Nonnull ImageData imagedata);

  /**
   * The CanvasRenderingContext2D method getImageData() of the Canvas 2D API returns an ImageData object representing the underlying pixel data for a specified portion of the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/getImageData">CanvasRenderingContext2D.getImageData - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-getimagedata">The definition of 'CanvasRenderingContext2D.getImageData' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native ImageData getImageData(int sx, int sy, int sw, int sh);

  /**
   * The CanvasRenderingContext2D.putImageData() method of the Canvas 2D API paints data from the given ImageData object onto the canvas. If a dirty rectangle is provided, only the pixels from that rectangle are painted. This method is not affected by the canvas transformation matrix.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/putImageData">CanvasRenderingContext2D.putImageData - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-putimagedata">The definition of 'CanvasRenderingContext2D.putImageData' in the 'HTML Living Standard' specification.</a>
   */
  public native void putImageData(@Nonnull ImageData imagedata, int dx, int dy);

  /**
   * The CanvasRenderingContext2D.putImageData() method of the Canvas 2D API paints data from the given ImageData object onto the canvas. If a dirty rectangle is provided, only the pixels from that rectangle are painted. This method is not affected by the canvas transformation matrix.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/putImageData">CanvasRenderingContext2D.putImageData - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-putimagedata">The definition of 'CanvasRenderingContext2D.putImageData' in the 'HTML Living Standard' specification.</a>
   */
  public native void putImageData(@Nonnull ImageData imagedata, int dx, int dy, int dirtyX,
      int dirtyY, int dirtyWidth, int dirtyHeight);

  /**
   * The CanvasRenderingContext2D.arc() method of the Canvas 2D API adds a circular arc to the current sub-path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/arc">CanvasRenderingContext2D.arc - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-arc">The definition of 'CanvasRenderingContext2D.arc' in the 'HTML Living Standard' specification.</a>
   */
  public native void arc(double x, double y, double radius, double startAngle, double endAngle,
      boolean anticlockwise);

  /**
   * The CanvasRenderingContext2D.arc() method of the Canvas 2D API adds a circular arc to the current sub-path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/arc">CanvasRenderingContext2D.arc - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-arc">The definition of 'CanvasRenderingContext2D.arc' in the 'HTML Living Standard' specification.</a>
   */
  public native void arc(double x, double y, double radius, double startAngle, double endAngle);

  /**
   * The CanvasRenderingContext2D.arcTo() method of the Canvas 2D API adds a circular arc to the current sub-path, using the given control points and radius. The arc is automatically connected to the path's latest point with a straight line, if necessary for the specified parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/arcTo">CanvasRenderingContext2D.arcTo - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-arcto">The definition of 'CanvasRenderingContext2D.arcTo' in the 'HTML Living Standard' specification.</a>
   */
  public native void arcTo(double x1, double y1, double x2, double y2, double radius);

  /**
   * The CanvasRenderingContext2D.bezierCurveTo() method of the Canvas 2D API adds a cubic B&eacute;zier curve to the current sub-path. It requires three points: the first two are control points and the third one is the end point. The starting point is the latest point in the current path, which can be changed using moveTo() before creating the B&eacute;zier curve.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/bezierCurveTo">CanvasRenderingContext2D.bezierCurveTo - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-beziercurveto">The definition of 'CanvasRenderingContext2D.beziercurveto' in the 'HTML Living Standard' specification.</a>
   */
  public native void bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x,
      double y);

  /**
   * The CanvasRenderingContext2D.closePath() method of the Canvas 2D API attempts to add a straight line from the current point to the start of the current sub-path. If the shape has already been closed or has only one point, this function does nothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/closePath">CanvasRenderingContext2D.closePath - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-closepath">The definition of 'CanvasRenderingContext2D.closePath' in the 'HTML Living Standard' specification.</a>
   */
  public native void closePath();

  /**
   * The CanvasRenderingContext2D.ellipse() method of the Canvas 2D API adds an elliptical arc to the current sub-path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/ellipse">CanvasRenderingContext2D.ellipse - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-ellipse">The definition of 'CanvasRenderingContext2D.ellipse' in the 'HTML Living Standard' specification.</a>
   */
  public native void ellipse(double x, double y, double radiusX, double radiusY, double rotation,
      double startAngle, double endAngle, boolean anticlockwise);

  /**
   * The CanvasRenderingContext2D.ellipse() method of the Canvas 2D API adds an elliptical arc to the current sub-path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/ellipse">CanvasRenderingContext2D.ellipse - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-ellipse">The definition of 'CanvasRenderingContext2D.ellipse' in the 'HTML Living Standard' specification.</a>
   */
  public native void ellipse(double x, double y, double radiusX, double radiusY, double rotation,
      double startAngle, double endAngle);

  /**
   * The CanvasRenderingContext2D method lineTo(), part of the Canvas 2D API, adds a straight line to the current sub-path by connecting the sub-path's last point to the specified (x, y) coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineTo">CanvasRenderingContext2D.lineTo - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-lineto">The definition of 'CanvasRenderingContext2D.lineTo' in the 'HTML Living Standard' specification.</a>
   */
  public native void lineTo(double x, double y);

  /**
   * The CanvasRenderingContext2D.moveTo() method of the Canvas 2D API begins a new sub-path at the point specified by the given (x, y) coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/moveTo">CanvasRenderingContext2D.moveTo - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-moveto">The definition of 'CanvasRenderingContext2D.moveTo' in the 'HTML Living Standard' specification.</a>
   */
  public native void moveTo(double x, double y);

  /**
   * The CanvasRenderingContext2D.quadraticCurveTo() method of the Canvas 2D API adds a quadratic B&eacute;zier curve to the current sub-path. It requires two points: the first one is a control point and the second one is the end point. The starting point is the latest point in the current path, which can be changed using moveTo() before creating the quadratic B&eacute;zier curve.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/quadraticCurveTo">CanvasRenderingContext2D.quadraticCurveTo - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-quadraticcurveto">The definition of 'CanvasRenderingContext2D.quadraticCurveTo' in the 'HTML Living Standard' specification.</a>
   */
  public native void quadraticCurveTo(double cpx, double cpy, double x, double y);

  /**
   * The CanvasRenderingContext2D.rect() method of the Canvas 2D API adds a rectangle to the current path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/rect">CanvasRenderingContext2D.rect - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-rect">The definition of 'CanvasRenderingContext2D.rect' in the 'HTML Living Standard' specification.</a>
   */
  public native void rect(double x, double y, double w, double h);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull CanvasImageSource image, double dx, double dy);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull HTMLOrSVGImageElement image, double dx, double dy);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull HTMLImageElement image, double dx, double dy);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull SVGImageElement image, double dx, double dy);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull HTMLVideoElement image, double dx, double dy);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull HTMLCanvasElement image, double dx, double dy);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull ImageBitmap image, double dx, double dy);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull OffscreenCanvas image, double dx, double dy);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull CanvasImageSource image, double dx, double dy, double dw,
      double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull HTMLOrSVGImageElement image, double dx, double dy,
      double dw, double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull HTMLImageElement image, double dx, double dy, double dw,
      double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull SVGImageElement image, double dx, double dy, double dw,
      double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull HTMLVideoElement image, double dx, double dy, double dw,
      double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull HTMLCanvasElement image, double dx, double dy, double dw,
      double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull ImageBitmap image, double dx, double dy, double dw,
      double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull OffscreenCanvas image, double dx, double dy, double dw,
      double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull CanvasImageSource image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull HTMLOrSVGImageElement image, double sx, double sy,
      double sw, double sh, double dx, double dy, double dw, double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull HTMLImageElement image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull SVGImageElement image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull HTMLVideoElement image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull HTMLCanvasElement image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull ImageBitmap image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  /**
   * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image onto the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawImage">CanvasRenderingContext2D.drawImage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-context-2d-drawimage">The definition of 'CanvasRenderingContext2D: drawImage' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawImage(@Nonnull OffscreenCanvas image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  /**
   * The CanvasRenderingContext2D method fillText(), part of the Canvas 2D API, draws a text string at the specified coordinates, filling the string's characters with the current fillStyle. An optional parameter allows specifying a maximum width for the rendered text, which the user agent will achieve by condensing the text or by using a lower font size.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillText">CanvasRenderingContext2D.fillText - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-filltext">The definition of 'CanvasRenderingContext2D.fillText' in the 'HTML Living Standard' specification.</a>
   */
  public native void fillText(@Nonnull String text, double x, double y, double maxWidth);

  /**
   * The CanvasRenderingContext2D method fillText(), part of the Canvas 2D API, draws a text string at the specified coordinates, filling the string's characters with the current fillStyle. An optional parameter allows specifying a maximum width for the rendered text, which the user agent will achieve by condensing the text or by using a lower font size.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillText">CanvasRenderingContext2D.fillText - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-filltext">The definition of 'CanvasRenderingContext2D.fillText' in the 'HTML Living Standard' specification.</a>
   */
  public native void fillText(@Nonnull String text, double x, double y);

  /**
   * The CanvasRenderingContext2D.measureText() method returns a TextMetrics object that contains information about the measured text (such as its width, for example).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/measureText">CanvasRenderingContext2D.measureText - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-measuretext">The definition of 'CanvasRenderingContext2D.measureText' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native TextMetrics measureText(@Nonnull String text);

  /**
   * The CanvasRenderingContext2D method strokeText(), part of the Canvas 2D API, strokes &mdash; that is, draws the outlines of &mdash; the characters of a text string at the specified coordinates. An optional parameter allows specifying a maximum width for the rendered text, which the user agent will achieve by condensing the text or by using a lower font size.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/strokeText">CanvasRenderingContext2D.strokeText - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-stroketext">The definition of 'CanvasRenderingContext2D.strokeText' in the 'HTML Living Standard' specification.</a>
   */
  public native void strokeText(@Nonnull String text, double x, double y, double maxWidth);

  /**
   * The CanvasRenderingContext2D method strokeText(), part of the Canvas 2D API, strokes &mdash; that is, draws the outlines of &mdash; the characters of a text string at the specified coordinates. An optional parameter allows specifying a maximum width for the rendered text, which the user agent will achieve by condensing the text or by using a lower font size.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/strokeText">CanvasRenderingContext2D.strokeText - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-stroketext">The definition of 'CanvasRenderingContext2D.strokeText' in the 'HTML Living Standard' specification.</a>
   */
  public native void strokeText(@Nonnull String text, double x, double y);

  /**
   * The CanvasRenderingContext2D.clearRect() method of the Canvas 2D API erases the pixels in a rectangular area by setting them to transparent black.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/clearRect">CanvasRenderingContext2D.clearRect - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-clearrect">The definition of 'CanvasRenderingContext2D.clearRect' in the 'HTML Living Standard' specification.</a>
   */
  public native void clearRect(double x, double y, double w, double h);

  /**
   * The CanvasRenderingContext2D.fillRect() method of the Canvas 2D API draws a rectangle that is filled according to the current fillStyle.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillRect">CanvasRenderingContext2D.fillRect - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-fillrect">The definition of 'CanvasRenderingContext2D.fillRect' in the 'HTML Living Standard' specification.</a>
   */
  public native void fillRect(double x, double y, double w, double h);

  /**
   * The CanvasRenderingContext2D.strokeRect() method of the Canvas 2D API draws a rectangle that is stroked (outlined) according to the current strokeStyle and other context settings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/strokeRect">CanvasRenderingContext2D.strokeRect - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-strokerect">The definition of 'CanvasRenderingContext2D.strokeRect' in the 'HTML Living Standard' specification.</a>
   */
  public native void strokeRect(double x, double y, double w, double h);

  /**
   * The CanvasRenderingContext2D.restore() method of the Canvas 2D API restores the most recently saved canvas state by popping the top entry in the drawing state stack. If there is no saved state, this method does nothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/restore">CanvasRenderingContext2D.restore - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-restore">The definition of 'CanvasRenderingContext2D.restore' in the 'HTML Living Standard' specification.</a>
   */
  public native void restore();

  /**
   * The CanvasRenderingContext2D.save() method of the Canvas 2D API saves the entire state of the canvas by pushing the current state onto a stack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/save">CanvasRenderingContext2D.save - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-save">The definition of 'CanvasRenderingContext2D.save' in the 'HTML Living Standard' specification.</a>
   */
  public native void save();

  /**
   * The getLineDash() method of the Canvas 2D API's CanvasRenderingContext2D interface gets the current line dash pattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/getLineDash">CanvasRenderingContext2D.getLineDash - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-getlinedash">The definition of 'CanvasRenderingContext2D.getLineDash' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native JsArray<Double> getLineDash();

  /**
   * The setLineDash() method of the Canvas 2D API's CanvasRenderingContext2D interface sets the line dash pattern used when stroking lines. It uses an array of values that specify alternating lengths of lines and gaps which describe the pattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash">CanvasRenderingContext2D.setLineDash - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-setlinedash">The definition of 'CanvasRenderingContext2D.setLineDash' in the 'HTML Living Standard' specification.</a>
   */
  public native void setLineDash(@Nonnull JsArray<Double> segments);

  /**
   * The setLineDash() method of the Canvas 2D API's CanvasRenderingContext2D interface sets the line dash pattern used when stroking lines. It uses an array of values that specify alternating lengths of lines and gaps which describe the pattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash">CanvasRenderingContext2D.setLineDash - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-setlinedash">The definition of 'CanvasRenderingContext2D.setLineDash' in the 'HTML Living Standard' specification.</a>
   */
  public native void setLineDash(@Nonnull double[] segments);

  /**
   * The CanvasRenderingContext2D.drawFocusIfNeeded() method of the Canvas 2D API draws a focus ring around the current or given path, if the specified element is focused.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded">CanvasRenderingContext2D.drawFocusIfNeeded - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-drawfocusifneeded">The definition of 'CanvasRenderingContext2D.drawFocusIfNeeded' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawFocusIfNeeded(@Nonnull Element element);

  /**
   * The CanvasRenderingContext2D.drawFocusIfNeeded() method of the Canvas 2D API draws a focus ring around the current or given path, if the specified element is focused.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded">CanvasRenderingContext2D.drawFocusIfNeeded - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-drawfocusifneeded">The definition of 'CanvasRenderingContext2D.drawFocusIfNeeded' in the 'HTML Living Standard' specification.</a>
   */
  public native void drawFocusIfNeeded(@Nonnull Path2D path, @Nonnull Element element);

  /**
   * The CanvasRenderingContext2D.scrollPathIntoView() method of the Canvas 2D API scrolls the current or given path into view. It is similar to Element.scrollIntoView().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/scrollPathIntoView">CanvasRenderingContext2D.scrollPathIntoView - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-scrollpathintoview">The definition of 'CanvasRenderingContext2D.scrollPathIntoView' in the 'HTML Living Standard' specification.</a>
   */
  public native void scrollPathIntoView();

  /**
   * The CanvasRenderingContext2D.scrollPathIntoView() method of the Canvas 2D API scrolls the current or given path into view. It is similar to Element.scrollIntoView().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/scrollPathIntoView">CanvasRenderingContext2D.scrollPathIntoView - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-scrollpathintoview">The definition of 'CanvasRenderingContext2D.scrollPathIntoView' in the 'HTML Living Standard' specification.</a>
   */
  public native void scrollPathIntoView(@Nonnull Path2D path);

  /**
   * The CanvasRenderingContext2D.getTransform() method of the Canvas 2D API retrieves the current transformation matrix being applied to the context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/getTransform">CanvasRenderingContext2D.getTransform - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-gettransform">The definition of 'CanvasRenderingContext2D.getTransform' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native DOMMatrix getTransform();

  /**
   * The CanvasRenderingContext2D.resetTransform() method of the Canvas 2D API resets the current transform to the identity matrix.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/resetTransform">CanvasRenderingContext2D.resetTransform - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-resettransform">The definition of 'CanvasRenderingContext2D.resetTransform' in the 'HTML Living Standard' specification.</a>
   */
  public native void resetTransform();

  /**
   * The CanvasRenderingContext2D.rotate() method of the Canvas 2D API adds a rotation to the transformation matrix.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/rotate">CanvasRenderingContext2D.rotate - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-rotate">The definition of 'CanvasRenderingContext2D.rotate' in the 'HTML Living Standard' specification.</a>
   */
  public native void rotate(double angle);

  /**
   * The CanvasRenderingContext2D.scale() method of the Canvas 2D API adds a scaling transformation to the canvas units horizontally and/or vertically.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/scale">CanvasRenderingContext2D.scale - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-scale">The definition of 'CanvasRenderingContext2D.scale' in the 'HTML Living Standard' specification.</a>
   */
  public native void scale(double x, double y);

  /**
   * The CanvasRenderingContext2D.setTransform() method of the Canvas 2D API resets (overrides) the current transformation to the identity matrix, and then invokes a transformation described by the arguments of this method. This lets you scale, rotate, translate (move), and skew the context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setTransform">CanvasRenderingContext2D.setTransform - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-settransform">The definition of 'CanvasRenderingContext2D.setTransform' in the 'HTML Living Standard' specification.</a>
   */
  public native void setTransform(double a, double b, double c, double d, double e, double f);

  /**
   * The CanvasRenderingContext2D.setTransform() method of the Canvas 2D API resets (overrides) the current transformation to the identity matrix, and then invokes a transformation described by the arguments of this method. This lets you scale, rotate, translate (move), and skew the context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setTransform">CanvasRenderingContext2D.setTransform - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-settransform">The definition of 'CanvasRenderingContext2D.setTransform' in the 'HTML Living Standard' specification.</a>
   */
  public native void setTransform(@Nonnull DOMMatrix2DInit transform);

  /**
   * The CanvasRenderingContext2D.setTransform() method of the Canvas 2D API resets (overrides) the current transformation to the identity matrix, and then invokes a transformation described by the arguments of this method. This lets you scale, rotate, translate (move), and skew the context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setTransform">CanvasRenderingContext2D.setTransform - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-settransform">The definition of 'CanvasRenderingContext2D.setTransform' in the 'HTML Living Standard' specification.</a>
   */
  public native void setTransform();

  /**
   * The CanvasRenderingContext2D.transform() method of the Canvas 2D API multiplies the current transformation with the matrix described by the arguments of this method. This lets you scale, rotate, translate (move), and skew the context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/transform">CanvasRenderingContext2D.transform - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-transform">The definition of 'CanvasRenderingContext2D.transform' in the 'HTML Living Standard' specification.</a>
   */
  public native void transform(double a, double b, double c, double d, double e, double f);

  /**
   * The CanvasRenderingContext2D.translate() method of the Canvas 2D API adds a translation transformation to the current matrix.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/translate">CanvasRenderingContext2D.translate - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-translate">The definition of 'CanvasRenderingContext2D.translate' in the 'HTML Living Standard' specification.</a>
   */
  public native void translate(double x, double y);

  /**
   * The CanvasRenderingContext2D.createLinearGradient() method of the Canvas 2D API creates a gradient along the line connecting two given coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createLinearGradient">CanvasRenderingContext2D.createLinearGradient - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-createlineargradient">The definition of 'CanvasRenderingContext2D.createLinearGradient' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native CanvasGradient createLinearGradient(double x0, double y0, double x1, double y1);

  /**
   * The CanvasRenderingContext2D.createPattern() method of the Canvas 2D API creates a pattern using the specified image and repetition. This method returns a CanvasPattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createPattern">CanvasRenderingContext2D.createPattern - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-createpattern">The definition of 'CanvasRenderingContext2D.createPattern' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public native CanvasPattern createPattern(@Nonnull CanvasImageSource image,
      @Nonnull String repetition);

  /**
   * The CanvasRenderingContext2D.createPattern() method of the Canvas 2D API creates a pattern using the specified image and repetition. This method returns a CanvasPattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createPattern">CanvasRenderingContext2D.createPattern - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-createpattern">The definition of 'CanvasRenderingContext2D.createPattern' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public native CanvasPattern createPattern(@Nonnull HTMLOrSVGImageElement image,
      @Nonnull String repetition);

  /**
   * The CanvasRenderingContext2D.createPattern() method of the Canvas 2D API creates a pattern using the specified image and repetition. This method returns a CanvasPattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createPattern">CanvasRenderingContext2D.createPattern - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-createpattern">The definition of 'CanvasRenderingContext2D.createPattern' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public native CanvasPattern createPattern(@Nonnull HTMLImageElement image,
      @Nonnull String repetition);

  /**
   * The CanvasRenderingContext2D.createPattern() method of the Canvas 2D API creates a pattern using the specified image and repetition. This method returns a CanvasPattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createPattern">CanvasRenderingContext2D.createPattern - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-createpattern">The definition of 'CanvasRenderingContext2D.createPattern' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public native CanvasPattern createPattern(@Nonnull SVGImageElement image,
      @Nonnull String repetition);

  /**
   * The CanvasRenderingContext2D.createPattern() method of the Canvas 2D API creates a pattern using the specified image and repetition. This method returns a CanvasPattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createPattern">CanvasRenderingContext2D.createPattern - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-createpattern">The definition of 'CanvasRenderingContext2D.createPattern' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public native CanvasPattern createPattern(@Nonnull HTMLVideoElement image,
      @Nonnull String repetition);

  /**
   * The CanvasRenderingContext2D.createPattern() method of the Canvas 2D API creates a pattern using the specified image and repetition. This method returns a CanvasPattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createPattern">CanvasRenderingContext2D.createPattern - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-createpattern">The definition of 'CanvasRenderingContext2D.createPattern' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public native CanvasPattern createPattern(@Nonnull HTMLCanvasElement image,
      @Nonnull String repetition);

  /**
   * The CanvasRenderingContext2D.createPattern() method of the Canvas 2D API creates a pattern using the specified image and repetition. This method returns a CanvasPattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createPattern">CanvasRenderingContext2D.createPattern - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-createpattern">The definition of 'CanvasRenderingContext2D.createPattern' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public native CanvasPattern createPattern(@Nonnull ImageBitmap image, @Nonnull String repetition);

  /**
   * The CanvasRenderingContext2D.createPattern() method of the Canvas 2D API creates a pattern using the specified image and repetition. This method returns a CanvasPattern.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createPattern">CanvasRenderingContext2D.createPattern - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-createpattern">The definition of 'CanvasRenderingContext2D.createPattern' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public native CanvasPattern createPattern(@Nonnull OffscreenCanvas image,
      @Nonnull String repetition);

  /**
   * The CanvasRenderingContext2D.createRadialGradient() method of the Canvas 2D API creates a radial gradient using the size and coordinates of two circles.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/createRadialGradient">CanvasRenderingContext2D.createRadialGradient - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-createradialgradient">The definition of 'CanvasRenderingContext2D.createRadialGradient' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  public native CanvasGradient createRadialGradient(double x0, double y0, double r0, double x1,
      double y1, double r1);

  /**
   * The CanvasRenderingContext2D.beginPath() method of the Canvas 2D API starts a new path by emptying the list of sub-paths. Call this method when you want to create a new path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/beginPath">CanvasRenderingContext2D.beginPath - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-beginpath">The definition of 'CanvasRenderingContext2D.beginPath' in the 'HTML Living Standard' specification.</a>
   */
  public native void beginPath();

  /**
   * The CanvasRenderingContext2D.clip() method of the Canvas 2D API turns the current or given path into the current clipping region. The previous clipping region, if any, is intersected with the current or given path to create the new clipping region.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/clip">CanvasRenderingContext2D.clip - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-clip">The definition of 'CanvasRenderingContext2D.clip' in the 'HTML Living Standard' specification.</a>
   */
  public native void clip(@CanvasFillRule @Nonnull String fillRule);

  /**
   * The CanvasRenderingContext2D.clip() method of the Canvas 2D API turns the current or given path into the current clipping region. The previous clipping region, if any, is intersected with the current or given path to create the new clipping region.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/clip">CanvasRenderingContext2D.clip - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-clip">The definition of 'CanvasRenderingContext2D.clip' in the 'HTML Living Standard' specification.</a>
   */
  public native void clip();

  /**
   * The CanvasRenderingContext2D.clip() method of the Canvas 2D API turns the current or given path into the current clipping region. The previous clipping region, if any, is intersected with the current or given path to create the new clipping region.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/clip">CanvasRenderingContext2D.clip - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-clip">The definition of 'CanvasRenderingContext2D.clip' in the 'HTML Living Standard' specification.</a>
   */
  public native void clip(@Nonnull Path2D path, @CanvasFillRule @Nonnull String fillRule);

  /**
   * The CanvasRenderingContext2D.clip() method of the Canvas 2D API turns the current or given path into the current clipping region. The previous clipping region, if any, is intersected with the current or given path to create the new clipping region.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/clip">CanvasRenderingContext2D.clip - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-clip">The definition of 'CanvasRenderingContext2D.clip' in the 'HTML Living Standard' specification.</a>
   */
  public native void clip(@Nonnull Path2D path);

  /**
   * The CanvasRenderingContext2D.fill() method of the Canvas 2D API fills the current or given path with the current fillStyle.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fill">CanvasRenderingContext2D.fill - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-fill">The definition of 'CanvasRenderingContext2D.fill' in the 'HTML Living Standard' specification.</a>
   */
  public native void fill(@CanvasFillRule @Nonnull String fillRule);

  /**
   * The CanvasRenderingContext2D.fill() method of the Canvas 2D API fills the current or given path with the current fillStyle.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fill">CanvasRenderingContext2D.fill - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-fill">The definition of 'CanvasRenderingContext2D.fill' in the 'HTML Living Standard' specification.</a>
   */
  public native void fill();

  /**
   * The CanvasRenderingContext2D.fill() method of the Canvas 2D API fills the current or given path with the current fillStyle.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fill">CanvasRenderingContext2D.fill - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-fill">The definition of 'CanvasRenderingContext2D.fill' in the 'HTML Living Standard' specification.</a>
   */
  public native void fill(@Nonnull Path2D path, @CanvasFillRule @Nonnull String fillRule);

  /**
   * The CanvasRenderingContext2D.fill() method of the Canvas 2D API fills the current or given path with the current fillStyle.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fill">CanvasRenderingContext2D.fill - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-fill">The definition of 'CanvasRenderingContext2D.fill' in the 'HTML Living Standard' specification.</a>
   */
  public native void fill(@Nonnull Path2D path);

  /**
   * The CanvasRenderingContext2D.isPointInPath() method of the Canvas 2D API reports whether or not the specified point is contained in the current path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/isPointInPath">CanvasRenderingContext2D.isPointInPath - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-ispointinpath">The definition of 'CanvasRenderingContext2D.isPointInPath' in the 'HTML Living Standard' specification.</a>
   */
  public native boolean isPointInPath(double x, double y, @CanvasFillRule @Nonnull String fillRule);

  /**
   * The CanvasRenderingContext2D.isPointInPath() method of the Canvas 2D API reports whether or not the specified point is contained in the current path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/isPointInPath">CanvasRenderingContext2D.isPointInPath - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-ispointinpath">The definition of 'CanvasRenderingContext2D.isPointInPath' in the 'HTML Living Standard' specification.</a>
   */
  public native boolean isPointInPath(double x, double y);

  /**
   * The CanvasRenderingContext2D.isPointInPath() method of the Canvas 2D API reports whether or not the specified point is contained in the current path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/isPointInPath">CanvasRenderingContext2D.isPointInPath - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-ispointinpath">The definition of 'CanvasRenderingContext2D.isPointInPath' in the 'HTML Living Standard' specification.</a>
   */
  public native boolean isPointInPath(@Nonnull Path2D path, double x, double y,
      @CanvasFillRule @Nonnull String fillRule);

  /**
   * The CanvasRenderingContext2D.isPointInPath() method of the Canvas 2D API reports whether or not the specified point is contained in the current path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/isPointInPath">CanvasRenderingContext2D.isPointInPath - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-ispointinpath">The definition of 'CanvasRenderingContext2D.isPointInPath' in the 'HTML Living Standard' specification.</a>
   */
  public native boolean isPointInPath(@Nonnull Path2D path, double x, double y);

  /**
   * The CanvasRenderingContext2D.isPointInStroke() method of the Canvas 2D API reports whether or not the specified point is inside the area contained by the stroking of a path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/isPointInStroke">CanvasRenderingContext2D.isPointInStroke - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-ispointinstroke">The definition of 'CanvasRenderingContext2D.isPointInStroke' in the 'HTML Living Standard' specification.</a>
   */
  public native boolean isPointInStroke(double x, double y);

  /**
   * The CanvasRenderingContext2D.isPointInStroke() method of the Canvas 2D API reports whether or not the specified point is inside the area contained by the stroking of a path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/isPointInStroke">CanvasRenderingContext2D.isPointInStroke - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-ispointinstroke">The definition of 'CanvasRenderingContext2D.isPointInStroke' in the 'HTML Living Standard' specification.</a>
   */
  public native boolean isPointInStroke(@Nonnull Path2D path, double x, double y);

  /**
   * The CanvasRenderingContext2D.stroke() method of the Canvas 2D API strokes (outlines) the current or given path with the current stroke style.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/stroke">CanvasRenderingContext2D.stroke - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-stroke">The definition of 'CanvasRenderingContext2D.stroke' in the 'HTML Living Standard' specification.</a>
   */
  public native void stroke();

  /**
   * The CanvasRenderingContext2D.stroke() method of the Canvas 2D API strokes (outlines) the current or given path with the current stroke style.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/stroke">CanvasRenderingContext2D.stroke - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-context-2d-stroke">The definition of 'CanvasRenderingContext2D.stroke' in the 'HTML Living Standard' specification.</a>
   */
  public native void stroke(@Nonnull Path2D path);
}
