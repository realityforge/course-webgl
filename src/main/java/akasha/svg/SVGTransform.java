package akasha.svg;

import akasha.DOMMatrix;
import akasha.DOMMatrixReadOnly;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(&hellip;) or matrix(&hellip;)) within a transform attribute.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGTransform">SVGTransform - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGTransform"
)
public class SVGTransform {
  @JsOverlay
  public static final int SVG_TRANSFORM_MATRIX = 1;

  @JsOverlay
  public static final int SVG_TRANSFORM_ROTATE = 4;

  @JsOverlay
  public static final int SVG_TRANSFORM_SCALE = 3;

  @JsOverlay
  public static final int SVG_TRANSFORM_SKEWX = 5;

  @JsOverlay
  public static final int SVG_TRANSFORM_SKEWY = 6;

  @JsOverlay
  public static final int SVG_TRANSFORM_TRANSLATE = 2;

  @JsOverlay
  public static final int SVG_TRANSFORM_UNKNOWN = 0;

  protected SVGTransform() {
  }

  @JsProperty(
      name = "angle"
  )
  public native float angle();

  @JsProperty(
      name = "matrix"
  )
  @Nonnull
  public native DOMMatrix matrix();

  @JsProperty(
      name = "type"
  )
  public native int type();

  public native void setMatrix(@Nonnull DOMMatrixReadOnly matrix);

  public native void setRotate(float angle, float cx, float cy);

  public native void setScale(float sx, float sy);

  public native void setSkewX(float angle);

  public native void setSkewY(float angle);

  public native void setTranslate(float tx, float ty);
}
