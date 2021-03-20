package akasha.core;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Math is a built-in object that has properties and methods for mathematical constants and functions. It&rsquo;s not a function object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math">Math - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-math-object">Math - ECMAScript (ECMA-262)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Math"
)
public final class JsMathNamespace {
  /**
   * The Math.E property represents Euler's number, the base of natural logarithms, e, which is approximately 2.718.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/E">Math.E - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.e">Math.E - ECMAScript (ECMA-262)</a>
   */
  @JsOverlay
  public static final double E = Constants.E;

  /**
   * The Math.LN10 property represents the natural logarithm of 10, approximately 2.302:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/LN10">Math.LN10 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.ln10">Math.LN10 - ECMAScript (ECMA-262)</a>
   */
  @JsOverlay
  public static final double LN10 = Constants.LN10;

  /**
   * The Math.LN2 property represents the natural logarithm of 2, approximately 0.693:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/LN2">Math.LN2 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.ln2">Math.LN2 - ECMAScript (ECMA-262)</a>
   */
  @JsOverlay
  public static final double LN2 = Constants.LN2;

  /**
   * The Math.LOG10E property represents the base 10 logarithm of e, approximately 0.434:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/LOG10E">Math.LOG10E - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.log10e">Math.LOG10E - ECMAScript (ECMA-262)</a>
   */
  @JsOverlay
  public static final double LOG10E = Constants.LOG10E;

  /**
   * The Math.LOG2E property represents the base 2 logarithm of e, approximately 1.442:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/LOG2E">Math.LOG2E - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.log2e">Math.LOG2E - ECMAScript (ECMA-262)</a>
   */
  @JsOverlay
  public static final double LOG2E = Constants.LOG2E;

  /**
   * The Math.PI property represents the ratio of the circumference of a circle to its diameter, approximately 3.14159:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/PI">Math.PI - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.pi">Math.PI - ECMAScript (ECMA-262)</a>
   */
  @JsOverlay
  public static final double PI = Constants.PI;

  /**
   * The Math.SQRT1_2 property represents the square root of 1/2 which is approximately 0.707:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/SQRT1_2">Math.SQRT1_2 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.sqrt1_2">Math.SQRT1_2 - ECMAScript (ECMA-262)</a>
   */
  @JsOverlay
  public static final double SQRT1_2 = Constants.SQRT1_2;

  /**
   * The Math.SQRT2 property represents the square root of 2, approximately 1.414:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/SQRT2">Math.SQRT2 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.sqrt2">Math.SQRT2 - ECMAScript (ECMA-262)</a>
   */
  @JsOverlay
  public static final double SQRT2 = Constants.SQRT2;

  private JsMathNamespace() {
  }

  /**
   * The Math.abs() function returns the absolute value of a number
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/abs">Math.abs - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.abs">Math.abs - ECMAScript (ECMA-262)</a>
   */
  public native double abs(double x);

  /**
   * The Math.acos() function returns the arccosine (in radians) of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/acos">Math.acos - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.acos">Math.acos - ECMAScript (ECMA-262)</a>
   */
  public native double acos(double x);

  /**
   * The Math.acosh() function returns the hyperbolic arc-cosine of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/acosh">Math.acosh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.acosh">Math.acosh - ECMAScript (ECMA-262)</a>
   */
  public native double acosh(double x);

  /**
   * The Math.asin() function returns the arcsine (in radians) of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/asin">Math.asin - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.asin">Math.asin - ECMAScript (ECMA-262)</a>
   */
  public native double asin(double x);

  /**
   * The Math.asinh() function returns the hyperbolic arcsine of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/asinh">Math.asinh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.asinh">Math.asinh - ECMAScript (ECMA-262)</a>
   */
  public native double asinh(double x);

  /**
   * The Math.atan() function returns the arctangent (in radians) of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/atan">Math.atan - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.atan">Math.atan - ECMAScript (ECMA-262)</a>
   */
  public native double atan(double x);

  /**
   * The Math.atan2() function returns the angle in the plane (in radians) between the positive x-axis and the ray from (0,0) to the point (x,y), for Math.atan2(y,x).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/atan2">Math.atan2 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.atan2">Math.atan2 - ECMAScript (ECMA-262)</a>
   */
  public native double atan2(double y, double x);

  /**
   * The Math.atanh() function returns the hyperbolic arctangent of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/atanh">Math.atanh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.atanh">Math.atanh - ECMAScript (ECMA-262)</a>
   */
  public native double atanh(double x);

  /**
   * The Math.cbrt() function returns the cube root of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/cbrt">Math.cbrt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.cbrt">Math.cbrt - ECMAScript (ECMA-262)</a>
   */
  public native double cbrt(double x);

  /**
   * The Math.ceil() function always rounds a number up to the next largest integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/ceil">Math.ceil - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.ceil">Math.ceil - ECMAScript (ECMA-262)</a>
   */
  public native int ceil(double x);

  /**
   * The Math.clz32() function returns the number of leading zero bits in the 32-bit binary representation of a number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/clz32">Math.clz32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.clz32">Math.clz32 - ECMAScript (ECMA-262)</a>
   */
  public native int clz32(int x);

  /**
   * The Math.cos() static function returns the cosine of the specified angle, which must be specified in radians. This value is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/cos">Math.cos - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.cos">Math.cos - ECMAScript (ECMA-262)</a>
   */
  public native double cos(double x);

  /**
   * The Math.cosh() function returns the hyperbolic cosine of a number, that can be expressed using the constant e:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/cosh">Math.cosh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.cosh">Math.cosh - ECMAScript (ECMA-262)</a>
   */
  public native double cosh(double x);

  /**
   * The Math.exp() function returns ex, where x is the argument, and e is Euler's number (also known as Napier's constant), the base of the natural logarithms.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/exp">Math.exp - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.exp">Math.exp - ECMAScript (ECMA-262)</a>
   */
  public native double exp(double x);

  /**
   * The Math.expm1() function returns ex - 1, where x is the argument, and e the base of the natural logarithms.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/expm1">Math.expm1 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.expm1">Math.expm1 - ECMAScript (ECMA-262)</a>
   */
  public native double expm1(double x);

  /**
   * The Math.floor() function returns the largest integer less than or equal to a given number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/floor">Math.floor - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.floor">Math.floor - ECMAScript (ECMA-262)</a>
   */
  public native int floor(double x);

  /**
   * The Math.fround() function returns the nearest 32-bit single precision float representation of a Number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/fround">Math.fround - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.fround">Math.fround - ECMAScript (ECMA-262)</a>
   */
  public native float fround(double x);

  /**
   * The Math.hypot() function returns the square root of the sum of squares of its arguments, that is:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/hypot">Math.hypot - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.hypot">Math.hypot - ECMAScript (ECMA-262)</a>
   */
  public native double hypot(double... value);

  /**
   * The Math.imul() function returns the result of the C-like 32-bit multiplication of the two parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/imul">Math.imul - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.imul">Math.imul - ECMAScript (ECMA-262)</a>
   */
  public native double imul(double... value);

  /**
   * The Math.imul() function returns the result of the C-like 32-bit multiplication of the two parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/imul">Math.imul - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.imul">Math.imul - ECMAScript (ECMA-262)</a>
   */
  public native int imul(int value1, int value2);

  /**
   * The Math.log() function returns the natural logarithm (base e) of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/log">Math.log - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.log">Math.log - ECMAScript (ECMA-262)</a>
   */
  public native double log(double x);

  /**
   * The Math.log10() function returns the base 10 logarithm of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/log10">Math.log10 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.log10">Math.log10 - ECMAScript (ECMA-262)</a>
   */
  public native double log10(double x);

  /**
   * The Math.log1p() function returns the natural logarithm (base e) of 1 + a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/log1p">Math.log1p - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.log1p">Math.log1p - ECMAScript (ECMA-262)</a>
   */
  public native double log1p(double x);

  /**
   * The Math.log2() function returns the base 2 logarithm of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/log2">Math.log2 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.log2">Math.log2 - ECMAScript (ECMA-262)</a>
   */
  public native double log2(double x);

  /**
   * The Math.max() function returns the largest of the zero or more numbers given as input parameters, or NaN if any parameter isn't a number and can't be converted into one.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/max">Math.max - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.max">Math.max - ECMAScript (ECMA-262)</a>
   */
  public native double max(double... values);

  /**
   * The static function Math.min() returns the lowest-valued number passed into it, or NaN if any parameter isn't a number and can't be converted into one.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/min">Math.min - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.min">Math.min - ECMAScript (ECMA-262)</a>
   */
  public native double min(double... values);

  /**
   * The Math.pow() function returns the base to the exponent power, that is, baseexponent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/pow">Math.pow - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.pow">Math.pow - ECMAScript (ECMA-262)</a>
   */
  public native double pow(double x, double y);

  /**
   * The Math.random() function returns a floating-point, pseudo-random number in the range 0 to less than 1 (inclusive of 0, but not 1) with approximately uniform distribution over that range &mdash; which you can then scale to your desired range. The implementation selects the initial seed to the random number generation algorithm; it cannot be chosen or reset by the user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random">Math.random - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.random">Math.random - ECMAScript (ECMA-262)</a>
   */
  public native double random();

  /**
   * The Math.round() function returns the value of a number rounded to the nearest integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/round">Math.round - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.round">Math.round - ECMAScript (ECMA-262)</a>
   */
  public native int round(double x);

  /**
   * The Math.sign() function returns either a positive or negative +/- 1, indicating the sign of a number passed into the argument. If the number passed into Math.sign() is 0, it will return a +/- 0. Note that if the number is positive, an explicit (+) will not be returned.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sign">Math.sign - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.sign">Math.sign - ECMAScript (ECMA-262)</a>
   */
  public native double sign(double x);

  /**
   * The Math.sin() function returns the sine of a number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sin">Math.sin - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.sin">Math.sin - ECMAScript (ECMA-262)</a>
   */
  public native double sin(double x);

  /**
   * The Math.sinh() function returns the hyperbolic sine of a number, that can be expressed using the constant e:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sinh">Math.sinh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.sinh">Math.sinh - ECMAScript (ECMA-262)</a>
   */
  public native double sinh(double x);

  /**
   * The Math.sqrt() function returns the square root of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sqrt">Math.sqrt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.sqrt">Math.sqrt - ECMAScript (ECMA-262)</a>
   */
  public native double sqrt(double x);

  /**
   * The Math.tan() function returns the tangent of a number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/tan">Math.tan - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.tan">Math.tan - ECMAScript (ECMA-262)</a>
   */
  public native double tan(double x);

  /**
   * The Math.tanh() function returns the hyperbolic tangent of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/tanh">Math.tanh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.tanh">Math.tanh - ECMAScript (ECMA-262)</a>
   */
  public native double tanh(double x);

  /**
   * The Math.trunc() function returns the integer part of a number by removing any fractional digits.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/trunc">Math.trunc - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.trunc">Math.trunc - ECMAScript (ECMA-262)</a>
   */
  public native int trunc(double x);

  @JsType(
      isNative = true,
      name = "Math",
      namespace = JsPackage.GLOBAL
  )
  private static final class Constants {
    @JsOverlay
    private static double E;

    @JsOverlay
    private static double LN10;

    @JsOverlay
    private static double LN2;

    @JsOverlay
    private static double LOG10E;

    @JsOverlay
    private static double LOG2E;

    @JsOverlay
    private static double PI;

    @JsOverlay
    private static double SQRT1_2;

    @JsOverlay
    private static double SQRT2;
  }
}
