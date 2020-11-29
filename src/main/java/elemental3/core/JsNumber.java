package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Number"
)
public class JsNumber {
  @JsOverlay
  public static final double EPSILON = Constants.EPSILON;

  @JsOverlay
  public static final double MAX_SAFE_INTEGER = Constants.MAX_SAFE_INTEGER;

  @JsOverlay
  public static final double MAX_VALUE = Constants.MAX_VALUE;

  @JsOverlay
  public static final double MIN_SAFE_INTEGER = Constants.MIN_SAFE_INTEGER;

  @JsOverlay
  public static final double MIN_VALUE = Constants.MIN_VALUE;

  @JsOverlay
  public static final double NEGATIVE_INFINITY = Constants.NEGATIVE_INFINITY;

  @JsOverlay
  public static final double NaN = Constants.NaN;

  @JsOverlay
  public static final double POSITIVE_INFINITY = Constants.POSITIVE_INFINITY;

  public JsNumber(final double value) {
  }

  public JsNumber() {
  }

  public static native boolean isFinite(double value);

  public static native boolean isInteger(double value);

  public static native boolean isNaN(double value);

  public static native boolean isSafeInteger(double value);

  public static native double parseFloat(@Nonnull String string);

  public static native int parseInt(@Nonnull String string, int radix);

  @Nonnull
  public native String toExponential(int fractionDigits);

  @Nonnull
  public native String toExponential();

  @Nonnull
  public native String toFixed(int digits);

  @Nonnull
  public native String toFixed();

  @Nonnull
  public native String toPrecision(int precision);

  @Nonnull
  public native String toPrecision();

  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_(int radix);

  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();

  public native double valueOf();

  @JsType(
      isNative = true,
      name = "Number",
      namespace = JsPackage.GLOBAL
  )
  private static final class Constants {
    @JsOverlay
    private static double EPSILON;

    @JsOverlay
    private static double MAX_SAFE_INTEGER;

    @JsOverlay
    private static double MAX_VALUE;

    @JsOverlay
    private static double MIN_SAFE_INTEGER;

    @JsOverlay
    private static double MIN_VALUE;

    @JsOverlay
    private static double NEGATIVE_INFINITY;

    @JsOverlay
    private static double NaN;

    @JsOverlay
    private static double POSITIVE_INFINITY;
  }
}
