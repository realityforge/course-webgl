package elemental3;

import elemental3.core.Float32Array;
import elemental3.core.Float64Array;
import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The DOMMatrix interface represents 4&times;4 matrices, suitable for 2D and 3D operations including rotation and translation. It is a mutable version of the DOMMatrixReadOnly interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix">DOMMatrix - MDN</a>
 * @see <a href="https://drafts.fxtf.org/geometry/#DOMMatrix">DOMMatrix - Geometry Interfaces Module Level 1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMMatrix"
)
public class DOMMatrix extends DOMMatrixReadOnly {
  public double a;

  public double b;

  public double c;

  public double d;

  public double e;

  public double f;

  public double m11;

  public double m12;

  public double m13;

  public double m14;

  public double m21;

  public double m22;

  public double m23;

  public double m24;

  public double m31;

  public double m32;

  public double m33;

  public double m34;

  public double m41;

  public double m42;

  public double m43;

  public double m44;

  /**
   * The DOMMatrix constructor creates a new DOMMatrix object which represents 4x4 matrices, suitable for 2D and 3D operations..
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix/DOMMatrix">DOMMatrix.DOMMatrix - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-dommatrixreadonly">DOMMatrix - Geometry Interfaces Module Level 1</a>
   */
  public DOMMatrix(@Nonnull final String init) {
  }

  /**
   * The DOMMatrix constructor creates a new DOMMatrix object which represents 4x4 matrices, suitable for 2D and 3D operations..
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix/DOMMatrix">DOMMatrix.DOMMatrix - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-dommatrixreadonly">DOMMatrix - Geometry Interfaces Module Level 1</a>
   */
  public DOMMatrix(@Nonnull final JsArray<Double> init) {
  }

  /**
   * The DOMMatrix constructor creates a new DOMMatrix object which represents 4x4 matrices, suitable for 2D and 3D operations..
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix/DOMMatrix">DOMMatrix.DOMMatrix - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-dommatrixreadonly">DOMMatrix - Geometry Interfaces Module Level 1</a>
   */
  public DOMMatrix(@Nonnull final double[] init) {
  }

  /**
   * The DOMMatrix constructor creates a new DOMMatrix object which represents 4x4 matrices, suitable for 2D and 3D operations..
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix/DOMMatrix">DOMMatrix.DOMMatrix - MDN</a>
   * @see <a href="https://drafts.fxtf.org/geometry/#dom-dommatrixreadonly-dommatrixreadonly">DOMMatrix - Geometry Interfaces Module Level 1</a>
   */
  public DOMMatrix() {
  }

  @Nonnull
  public static native DOMMatrix fromFloat32Array(@Nonnull Float32Array array32);

  @Nonnull
  public static native DOMMatrix fromFloat64Array(@Nonnull Float64Array array64);

  @Nonnull
  public static native DOMMatrix fromMatrix(@Nonnull DOMMatrixInit other);

  @Nonnull
  public static native DOMMatrix fromMatrix();

  @Nonnull
  public native DOMMatrix invertSelf();

  @Nonnull
  public native DOMMatrix multiplySelf(@Nonnull DOMMatrixInit other);

  @Nonnull
  public native DOMMatrix multiplySelf();

  @Nonnull
  public native DOMMatrix preMultiplySelf(@Nonnull DOMMatrixInit other);

  @Nonnull
  public native DOMMatrix preMultiplySelf();

  @Nonnull
  public native DOMMatrix rotateAxisAngleSelf(double x, double y, double z, double angle);

  @Nonnull
  public native DOMMatrix rotateAxisAngleSelf(double x, double y, double z);

  @Nonnull
  public native DOMMatrix rotateAxisAngleSelf(double x, double y);

  @Nonnull
  public native DOMMatrix rotateAxisAngleSelf(double x);

  @Nonnull
  public native DOMMatrix rotateAxisAngleSelf();

  @Nonnull
  public native DOMMatrix rotateFromVectorSelf(double x, double y);

  @Nonnull
  public native DOMMatrix rotateFromVectorSelf(double x);

  @Nonnull
  public native DOMMatrix rotateFromVectorSelf();

  @Nonnull
  public native DOMMatrix rotateSelf(double rotX, double rotY, double rotZ);

  @Nonnull
  public native DOMMatrix rotateSelf(double rotX, double rotY);

  @Nonnull
  public native DOMMatrix rotateSelf(double rotX);

  @Nonnull
  public native DOMMatrix rotateSelf();

  @Nonnull
  public native DOMMatrix scale3dSelf(double scale, double originX, double originY, double originZ);

  @Nonnull
  public native DOMMatrix scale3dSelf(double scale, double originX, double originY);

  @Nonnull
  public native DOMMatrix scale3dSelf(double scale, double originX);

  @Nonnull
  public native DOMMatrix scale3dSelf(double scale);

  @Nonnull
  public native DOMMatrix scale3dSelf();

  @Nonnull
  public native DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX,
      double originY, double originZ);

  @Nonnull
  public native DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX,
      double originY);

  @Nonnull
  public native DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX);

  @Nonnull
  public native DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ);

  @Nonnull
  public native DOMMatrix scaleSelf(double scaleX, double scaleY);

  @Nonnull
  public native DOMMatrix scaleSelf(double scaleX);

  @Nonnull
  public native DOMMatrix scaleSelf();

  @Nonnull
  public native DOMMatrix setMatrixValue(@Nonnull String transformList);

  @Nonnull
  public native DOMMatrix skewXSelf(double sx);

  @Nonnull
  public native DOMMatrix skewXSelf();

  @Nonnull
  public native DOMMatrix skewYSelf(double sy);

  @Nonnull
  public native DOMMatrix skewYSelf();

  @Nonnull
  public native DOMMatrix translateSelf(double tx, double ty, double tz);

  @Nonnull
  public native DOMMatrix translateSelf(double tx, double ty);

  @Nonnull
  public native DOMMatrix translateSelf(double tx);

  @Nonnull
  public native DOMMatrix translateSelf();
}
