package elemental3.core;

import elemental3.Global;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;

/**
 * Math is a built-in object that has properties and methods for mathematical constants and functions. It&rsquo;s not a function object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math">Math - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-math-object">The definition of 'Math' in the 'ECMAScript (ECMA-262)' specification.</a>
 */
@Generated("org.realityforge.webtack")
public final class JsMath {
  @JsOverlay
  public static final double E = JsMathNamespace.E;

  @JsOverlay
  public static final double LN10 = JsMathNamespace.LN10;

  @JsOverlay
  public static final double LN2 = JsMathNamespace.LN2;

  @JsOverlay
  public static final double LOG10E = JsMathNamespace.LOG10E;

  @JsOverlay
  public static final double LOG2E = JsMathNamespace.LOG2E;

  @JsOverlay
  public static final double PI = JsMathNamespace.PI;

  @JsOverlay
  public static final double SQRT1_2 = JsMathNamespace.SQRT1_2;

  @JsOverlay
  public static final double SQRT2 = JsMathNamespace.SQRT2;

  private JsMath() {
  }

  /**
   * The Math.abs() function returns the absolute value of a number
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/abs">Math.abs - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.abs">The definition of 'Math.abs' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double abs(double x) {
    return namespace().abs(x);
  }

  /**
   * The Math.acos() function returns the arccosine (in radians) of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/acos">Math.acos - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.acos">The definition of 'Math.acos' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double acos(double x) {
    return namespace().acos(x);
  }

  /**
   * The Math.acosh() function returns the hyperbolic arc-cosine of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/acosh">Math.acosh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.acosh">The definition of 'Math.acosh' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double acosh(double x) {
    return namespace().acosh(x);
  }

  /**
   * The Math.asin() function returns the arcsine (in radians) of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/asin">Math.asin - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.asin">The definition of 'Math.asin' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double asin(double x) {
    return namespace().asin(x);
  }

  /**
   * The Math.asinh() function returns the hyperbolic arcsine of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/asinh">Math.asinh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.asinh">The definition of 'Math.asinh' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double asinh(double x) {
    return namespace().asinh(x);
  }

  /**
   * The Math.atan() function returns the arctangent (in radians) of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/atan">Math.atan - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.atan">The definition of 'Math.atan' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double atan(double x) {
    return namespace().atan(x);
  }

  /**
   * The Math.atan2() function returns the angle in the plane (in radians) between the positive x-axis and the ray from (0,0) to the point (x,y), for Math.atan2(y,x).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/atan2">Math.atan2 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.atan2">The definition of 'Math.atan2' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double atan2(double y, double x) {
    return namespace().atan2(y, x);
  }

  /**
   * The Math.atanh() function returns the hyperbolic arctangent of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/atanh">Math.atanh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.atanh">The definition of 'Math.atanh' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double atanh(double x) {
    return namespace().atanh(x);
  }

  /**
   * The Math.cbrt() function returns the cube root of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/cbrt">Math.cbrt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.cbrt">The definition of 'Math.cbrt' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double cbrt(double x) {
    return namespace().cbrt(x);
  }

  /**
   * The Math.ceil() function always rounds a number up to the next largest integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/ceil">Math.ceil - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.ceil">The definition of 'Math.ceil' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static int ceil(double x) {
    return namespace().ceil(x);
  }

  /**
   * The Math.clz32() function returns the number of leading zero bits in the 32-bit binary representation of a number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/clz32">Math.clz32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.clz32">The definition of 'Math.clz32' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static int clz32(int x) {
    return namespace().clz32(x);
  }

  /**
   * The Math.cos() static function returns the cosine of the specified angle, which must be specified in radians. This value is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/cos">Math.cos - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.cos">The definition of 'Math.cos' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double cos(double x) {
    return namespace().cos(x);
  }

  /**
   * The Math.cosh() function returns the hyperbolic cosine of a number, that can be expressed using the constant e:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/cosh">Math.cosh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.cosh">The definition of 'Math.cosh' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double cosh(double x) {
    return namespace().cosh(x);
  }

  /**
   * The Math.exp() function returns ex, where x is the argument, and e is Euler's number (also known as Napier's constant), the base of the natural logarithms.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/exp">Math.exp - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.exp">The definition of 'Math.exp' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double exp(double x) {
    return namespace().exp(x);
  }

  /**
   * The Math.expm1() function returns ex - 1, where x is the argument, and e the base of the natural logarithms.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/expm1">Math.expm1 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.expm1">The definition of 'Math.expm1' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double expm1(double x) {
    return namespace().expm1(x);
  }

  /**
   * The Math.floor() function returns the largest integer less than or equal to a given number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/floor">Math.floor - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.floor">The definition of 'Math.floor' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static int floor(double x) {
    return namespace().floor(x);
  }

  /**
   * The Math.fround() function returns the nearest 32-bit single precision float representation of a Number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/fround">Math.fround - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.fround">The definition of 'Math.fround' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static float fround(double x) {
    return namespace().fround(x);
  }

  /**
   * The Math.hypot() function returns the square root of the sum of squares of its arguments, that is:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/hypot">Math.hypot - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.hypot">The definition of 'Math.hypot' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double hypot(double... value) {
    return namespace().hypot(value);
  }

  /**
   * The Math.imul() function returns the result of the C-like 32-bit multiplication of the two parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/imul">Math.imul - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.imul">The definition of 'Math.imul' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double imul(double... value) {
    return namespace().imul(value);
  }

  /**
   * The Math.imul() function returns the result of the C-like 32-bit multiplication of the two parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/imul">Math.imul - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.imul">The definition of 'Math.imul' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static int imul(int value1, int value2) {
    return namespace().imul(value1, value2);
  }

  /**
   * The Math.log() function returns the natural logarithm (base e) of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/log">Math.log - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.log">The definition of 'Math.log' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double log(double x) {
    return namespace().log(x);
  }

  /**
   * The Math.log10() function returns the base 10 logarithm of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/log10">Math.log10 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.log10">The definition of 'Math.log10' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double log10(double x) {
    return namespace().log10(x);
  }

  /**
   * The Math.log1p() function returns the natural logarithm (base e) of 1 + a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/log1p">Math.log1p - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.log1p">The definition of 'Math.log1p' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double log1p(double x) {
    return namespace().log1p(x);
  }

  /**
   * The Math.log2() function returns the base 2 logarithm of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/log2">Math.log2 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.log2">The definition of 'Math.log2' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double log2(double x) {
    return namespace().log2(x);
  }

  /**
   * The Math.max() function returns the largest of the zero or more numbers given as input parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/max">Math.max - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.max">The definition of 'Math.max' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double max(double... values) {
    return namespace().max(values);
  }

  /**
   * The static function Math.min() returns the lowest-valued number passed into it, or NaN if any parameter isn't a number and can't be converted into one.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/min">Math.min - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.min">The definition of 'Math.min' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double min(double... values) {
    return namespace().min(values);
  }

  /**
   * The Math.pow() function returns the base to the exponent power, that is, baseexponent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/pow">Math.pow - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.pow">The definition of 'Math.pow' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double pow(double x, double y) {
    return namespace().pow(x, y);
  }

  /**
   * The Math.random() function returns a floating-point, pseudo-random number in the range 0 to less than 1 (inclusive of 0, but not 1) with approximately uniform distribution over that range &mdash; which you can then scale to your desired range. The implementation selects the initial seed to the random number generation algorithm; it cannot be chosen or reset by the user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random">Math.random - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.random">The definition of 'Math.random' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double random() {
    return namespace().random();
  }

  /**
   * The Math.round() function returns the value of a number rounded to the nearest integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/round">Math.round - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.round">The definition of 'Math.round' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static int round(double x) {
    return namespace().round(x);
  }

  /**
   * The Math.sign() function returns either a positive or negative +/- 1, indicating the sign of a number passed into the argument. If the number passed into Math.sign() is 0, it will return a +/- 0. Note that if the number is positive, an explicit (+) will not be returned.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sign">Math.sign - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.sign">The definition of 'Math.sign' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double sign(double x) {
    return namespace().sign(x);
  }

  /**
   * The Math.sin() function returns the sine of a number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sin">Math.sin - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.sin">The definition of 'Math.sin' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double sin(double x) {
    return namespace().sin(x);
  }

  /**
   * The Math.sinh() function returns the hyperbolic sine of a number, that can be expressed using the constant e:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sinh">Math.sinh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.sinh">The definition of 'Math.sinh' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double sinh(double x) {
    return namespace().sinh(x);
  }

  /**
   * The Math.sqrt() function returns the square root of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sqrt">Math.sqrt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.sqrt">The definition of 'Math.sqrt' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double sqrt(double x) {
    return namespace().sqrt(x);
  }

  /**
   * The Math.tan() function returns the tangent of a number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/tan">Math.tan - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.tan">The definition of 'Math.tan' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double tan(double x) {
    return namespace().tan(x);
  }

  /**
   * The Math.tanh() function returns the hyperbolic tangent of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/tanh">Math.tanh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.tanh">The definition of 'Math.tanh' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static double tanh(double x) {
    return namespace().tanh(x);
  }

  /**
   * The Math.trunc() function returns the integer part of a number by removing any fractional digits.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/trunc">Math.trunc - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-math.trunc">The definition of 'Math.trunc' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static int trunc(double x) {
    return namespace().trunc(x);
  }

  /**
   * Return the 'Math' namespace object.
   *
   * @return the 'Math' namespace object
   */
  @Nonnull
  public static JsMathNamespace namespace() {
    return Global.math();
  }
}
