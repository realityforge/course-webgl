package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Number constructor contains constants and methods for working with numbers. Values of other types can be converted to numbers using the Number() function.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number">Number - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-number-objects">The definition of 'Number' in the 'ECMAScript (ECMA-262)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Number"
)
public class JsNumber {
  /**
   * The Number.EPSILON property represents the difference between 1 and the smallest floating point number greater than 1.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/EPSILON">Number.EPSILON - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.epsilon">The definition of 'Number.EPSILON' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsOverlay
  public static final double EPSILON = Constants.EPSILON;

  /**
   * The Number.MAX_SAFE_INTEGER constant represents the maximum safe integer in JavaScript (253 - 1).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MAX_SAFE_INTEGER">Number.MAX_SAFE_INTEGER - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.max_safe_integer">The definition of 'Number.MAX_SAFE_INTEGER' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsOverlay
  public static final double MAX_SAFE_INTEGER = Constants.MAX_SAFE_INTEGER;

  /**
   * The Number.MAX_VALUE property represents the maximum numeric value representable in JavaScript.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MAX_VALUE">Number.MAX_VALUE - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.max_value">The definition of 'Number.MAX_VALUE' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsOverlay
  public static final double MAX_VALUE = Constants.MAX_VALUE;

  /**
   * The Number.MIN_SAFE_INTEGER constant represents the minimum safe integer in JavaScript (-(253 - 1)).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MIN_SAFE_INTEGER">Number.MIN_SAFE_INTEGER - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.min_safe_integer">The definition of 'Number.MIN_SAFE_INTEGER' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsOverlay
  public static final double MIN_SAFE_INTEGER = Constants.MIN_SAFE_INTEGER;

  /**
   * The Number.MIN_VALUE property represents the smallest positive numeric value representable in JavaScript.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MIN_VALUE">Number.MIN_VALUE - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.min_value">The definition of 'Number.MIN_VALUE' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsOverlay
  public static final double MIN_VALUE = Constants.MIN_VALUE;

  /**
   * The Number.NEGATIVE_INFINITY property represents the negative Infinity value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/NEGATIVE_INFINITY">Number.NEGATIVE_INFINITY - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.negative_infinity">The definition of 'Number.NEGATIVE_INFINITY' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsOverlay
  public static final double NEGATIVE_INFINITY = Constants.NEGATIVE_INFINITY;

  /**
   * The Number.NaN property represents Not-A-Number. Equivalent of NaN.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/NaN">Number.NaN - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.nan">The definition of 'Number.NaN' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsOverlay
  public static final double NaN = Constants.NaN;

  /**
   * The Number.POSITIVE_INFINITY property represents the positive Infinity value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/POSITIVE_INFINITY">Number.POSITIVE_INFINITY - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.positive_infinity">The definition of 'Number.POSITIVE_INFINITY' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsOverlay
  public static final double POSITIVE_INFINITY = Constants.POSITIVE_INFINITY;

  /**
   * The Number() constructor creates a Number object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/Number">Number.Number - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number-constructor">The definition of 'Number constructor' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public JsNumber(final double value) {
  }

  /**
   * The Number() constructor creates a Number object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/Number">Number.Number - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number-constructor">The definition of 'Number constructor' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public JsNumber() {
  }

  /**
   * The Number.isFinite() method determines whether the passed value is a finite number &mdash; that is, it checks that a number is neither positive nor negative Infinity, since JavaScript has both.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isFinite">Number.isFinite - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.isfinite">The definition of 'Number.isInteger' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static native boolean isFinite(double value);

  /**
   * The Number.isInteger() method determines whether the passed value is an integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isInteger">Number.isInteger - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.isinteger">The definition of 'Number.isInteger' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static native boolean isInteger(double value);

  /**
   * The Number.isNaN() method determines whether the passed value is NaN and its type is Number. It is a more robust version of the original, global isNaN().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isNaN">Number.isNaN - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.isnan">The definition of 'Number.isnan' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static native boolean isNaN(double value);

  /**
   * The Number.isSafeInteger() method determines whether the provided value is a number that is a safe integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isSafeInteger">Number.isSafeInteger - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.issafeinteger">The definition of 'Number.isSafeInteger' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static native boolean isSafeInteger(double value);

  /**
   * The Number.parseFloat() method parses an argument and returns a floating point number. If a number cannot be parsed from the argument, it returns NaN.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/parseFloat">Number.parseFloat - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.parsefloat">The definition of 'Number.parseFloat' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static native double parseFloat(@Nonnull String string);

  /**
   * The Number.parseInt() method parses a string argument and returns an integer of the specified radix or base.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/parseInt">Number.parseInt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.parseint">The definition of 'Number.parseInt' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public static native int parseInt(@Nonnull String string, int radix);

  /**
   * The toExponential() method returns a string representing the Number object in exponential notation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toExponential">Number.toExponential - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.prototype.toexponential">The definition of 'Number.prototype.toExponential' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @Nonnull
  public native String toExponential(int fractionDigits);

  /**
   * The toExponential() method returns a string representing the Number object in exponential notation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toExponential">Number.toExponential - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.prototype.toexponential">The definition of 'Number.prototype.toExponential' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @Nonnull
  public native String toExponential();

  /**
   * The toFixed() method formats a number using fixed-point notation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toFixed">Number.toFixed - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.prototype.tofixed">The definition of 'Number.prototype.toFixed' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @Nonnull
  public native String toFixed(int digits);

  /**
   * The toFixed() method formats a number using fixed-point notation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toFixed">Number.toFixed - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.prototype.tofixed">The definition of 'Number.prototype.toFixed' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @Nonnull
  public native String toFixed();

  /**
   * The toPrecision() method returns a string representing the Number object to the specified precision.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toPrecision">Number.toPrecision - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.prototype.toprecision">The definition of 'Number.prototype.toPrecision' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @Nonnull
  public native String toPrecision(int precision);

  /**
   * The toPrecision() method returns a string representing the Number object to the specified precision.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toPrecision">Number.toPrecision - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.prototype.toprecision">The definition of 'Number.prototype.toPrecision' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @Nonnull
  public native String toPrecision();

  /**
   * The toString() method returns a string representing the specified Number object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toString">Number.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.prototype.tostring">The definition of 'Number.prototype.tostring' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_(int radix);

  /**
   * The toString() method returns a string representing the specified Number object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toString">Number.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.prototype.tostring">The definition of 'Number.prototype.tostring' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();

  /**
   * The valueOf() method returns the wrapped primitive value of a Number object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/valueOf">Number.valueOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number.prototype.valueof">The definition of 'Number.prototype.valueOf' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
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
