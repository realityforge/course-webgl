package elemental3;

import elemental3.core.JsArray;
import elemental3.svg.SVGImageElement;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OffscreenCanvasRenderingContext2D"
)
public class OffscreenCanvasRenderingContext2D {
  @Nonnull
  @CanvasDirection
  public String direction;

  @Nonnull
  public StringOrCanvasGradientOrCanvasPatternUnion fillStyle;

  @Nonnull
  public String filter;

  @Nonnull
  public String font;

  public double globalAlpha;

  @Nonnull
  public String globalCompositeOperation;

  public boolean imageSmoothingEnabled;

  @Nonnull
  @ImageSmoothingQuality
  public String imageSmoothingQuality;

  @Nonnull
  @CanvasLineCap
  public String lineCap;

  public double lineDashOffset;

  @Nonnull
  @CanvasLineJoin
  public String lineJoin;

  public double lineWidth;

  public double miterLimit;

  public double shadowBlur;

  @Nonnull
  public String shadowColor;

  public double shadowOffsetX;

  public double shadowOffsetY;

  @Nonnull
  public StringOrCanvasGradientOrCanvasPatternUnion strokeStyle;

  @Nonnull
  @CanvasTextAlign
  public String textAlign;

  @Nonnull
  @CanvasTextBaseline
  public String textBaseline;

  protected OffscreenCanvasRenderingContext2D() {
  }

  @JsProperty(
      name = "canvas"
  )
  @Nonnull
  public native OffscreenCanvas canvas();

  public native void commit();

  public native void beginPath();

  public native void clip(@CanvasFillRule @Nonnull String fillRule);

  public native void clip();

  public native void clip(@Nonnull Path2D path, @CanvasFillRule @Nonnull String fillRule);

  public native void clip(@Nonnull Path2D path);

  public native void fill(@CanvasFillRule @Nonnull String fillRule);

  public native void fill();

  public native void fill(@Nonnull Path2D path, @CanvasFillRule @Nonnull String fillRule);

  public native void fill(@Nonnull Path2D path);

  public native boolean isPointInPath(double x, double y, @CanvasFillRule @Nonnull String fillRule);

  public native boolean isPointInPath(double x, double y);

  public native boolean isPointInPath(@Nonnull Path2D path, double x, double y,
      @CanvasFillRule @Nonnull String fillRule);

  public native boolean isPointInPath(@Nonnull Path2D path, double x, double y);

  public native boolean isPointInStroke(double x, double y);

  public native boolean isPointInStroke(@Nonnull Path2D path, double x, double y);

  public native void stroke();

  public native void stroke(@Nonnull Path2D path);

  @Nonnull
  public native ImageData createImageData(int sw, int sh);

  @Nonnull
  public native ImageData createImageData(@Nonnull ImageData imagedata);

  @Nonnull
  public native ImageData getImageData(int sx, int sy, int sw, int sh);

  public native void putImageData(@Nonnull ImageData imagedata, int dx, int dy);

  public native void putImageData(@Nonnull ImageData imagedata, int dx, int dy, int dirtyX,
      int dirtyY, int dirtyWidth, int dirtyHeight);

  public native void restore();

  public native void save();

  public native void clearRect(double x, double y, double w, double h);

  public native void fillRect(double x, double y, double w, double h);

  public native void strokeRect(double x, double y, double w, double h);

  @Nonnull
  public native CanvasGradient createLinearGradient(double x0, double y0, double x1, double y1);

  @Nullable
  public native CanvasPattern createPattern(@Nonnull CanvasImageSource image,
      @Nonnull String repetition);

  @Nullable
  public native CanvasPattern createPattern(@Nonnull HTMLOrSVGImageElement image,
      @Nonnull String repetition);

  @Nullable
  public native CanvasPattern createPattern(@Nonnull HTMLImageElement image,
      @Nonnull String repetition);

  @Nullable
  public native CanvasPattern createPattern(@Nonnull SVGImageElement image,
      @Nonnull String repetition);

  @Nullable
  public native CanvasPattern createPattern(@Nonnull HTMLVideoElement image,
      @Nonnull String repetition);

  @Nullable
  public native CanvasPattern createPattern(@Nonnull HTMLCanvasElement image,
      @Nonnull String repetition);

  @Nullable
  public native CanvasPattern createPattern(@Nonnull ImageBitmap image, @Nonnull String repetition);

  @Nullable
  public native CanvasPattern createPattern(@Nonnull OffscreenCanvas image,
      @Nonnull String repetition);

  @Nonnull
  public native CanvasGradient createRadialGradient(double x0, double y0, double r0, double x1,
      double y1, double r1);

  @Nonnull
  public native JsArray<Double> getLineDash();

  public native void setLineDash(@Nonnull JsArray<Double> segments);

  public native void setLineDash(@Nonnull double[] segments);

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

  @Nonnull
  public native DOMMatrix getTransform();

  public native void resetTransform();

  public native void rotate(double angle);

  public native void scale(double x, double y);

  public native void setTransform(double a, double b, double c, double d, double e, double f);

  public native void setTransform(@Nonnull DOMMatrix2DInit transform);

  public native void setTransform();

  public native void transform(double a, double b, double c, double d, double e, double f);

  public native void translate(double x, double y);

  public native void fillText(@Nonnull String text, double x, double y, double maxWidth);

  public native void fillText(@Nonnull String text, double x, double y);

  @Nonnull
  public native TextMetrics measureText(@Nonnull String text);

  public native void strokeText(@Nonnull String text, double x, double y, double maxWidth);

  public native void strokeText(@Nonnull String text, double x, double y);

  public native void drawImage(@Nonnull CanvasImageSource image, double dx, double dy);

  public native void drawImage(@Nonnull HTMLOrSVGImageElement image, double dx, double dy);

  public native void drawImage(@Nonnull HTMLImageElement image, double dx, double dy);

  public native void drawImage(@Nonnull SVGImageElement image, double dx, double dy);

  public native void drawImage(@Nonnull HTMLVideoElement image, double dx, double dy);

  public native void drawImage(@Nonnull HTMLCanvasElement image, double dx, double dy);

  public native void drawImage(@Nonnull ImageBitmap image, double dx, double dy);

  public native void drawImage(@Nonnull OffscreenCanvas image, double dx, double dy);

  public native void drawImage(@Nonnull CanvasImageSource image, double dx, double dy, double dw,
      double dh);

  public native void drawImage(@Nonnull HTMLOrSVGImageElement image, double dx, double dy,
      double dw, double dh);

  public native void drawImage(@Nonnull HTMLImageElement image, double dx, double dy, double dw,
      double dh);

  public native void drawImage(@Nonnull SVGImageElement image, double dx, double dy, double dw,
      double dh);

  public native void drawImage(@Nonnull HTMLVideoElement image, double dx, double dy, double dw,
      double dh);

  public native void drawImage(@Nonnull HTMLCanvasElement image, double dx, double dy, double dw,
      double dh);

  public native void drawImage(@Nonnull ImageBitmap image, double dx, double dy, double dw,
      double dh);

  public native void drawImage(@Nonnull OffscreenCanvas image, double dx, double dy, double dw,
      double dh);

  public native void drawImage(@Nonnull CanvasImageSource image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  public native void drawImage(@Nonnull HTMLOrSVGImageElement image, double sx, double sy,
      double sw, double sh, double dx, double dy, double dw, double dh);

  public native void drawImage(@Nonnull HTMLImageElement image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  public native void drawImage(@Nonnull SVGImageElement image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  public native void drawImage(@Nonnull HTMLVideoElement image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  public native void drawImage(@Nonnull HTMLCanvasElement image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  public native void drawImage(@Nonnull ImageBitmap image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);

  public native void drawImage(@Nonnull OffscreenCanvas image, double sx, double sy, double sw,
      double sh, double dx, double dy, double dw, double dh);
}
