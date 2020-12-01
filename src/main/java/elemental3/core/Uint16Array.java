package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Uint16Array typed array represents an array of 16-bit unsigned integers in the platform byte order.
 * If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once
 * established, you can reference elements in the array using the object's methods, or using standard array
 * index syntax (that is, using bracket notation).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array">Uint16Array - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-typedarray-objects">TypedArray Objects - ECMA</a>
 * @see <a href="https://heycam.github.io/webidl/#idl-Uint16Array">Uint16Array - WebIDL</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Uint16Array"
)
public class Uint16Array implements IntegerTypedArray {
  /**
   * The BYTES_PER_ELEMENT property represents the size in bytes of each element in an typed array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/BYTES_PER_ELEMENT">TypedArray.BYTES_PER_ELEMENT - MDN</a>
   */
  @JsOverlay
  public static final int BYTES_PER_ELEMENT = 2;

  /**
   * The name property represents a string value of the typed array constructor name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/name">TypedArray.name - MDN</a>
   */
  @JsOverlay
  public static final String name = "Uint16Array";

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Uint16Array(final int length) {
  }

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Uint16Array(@Nonnull final Uint16Array array) {
  }

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Uint16Array(@Nonnull final JsArray<Double> array) {
  }

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Uint16Array(@Nonnull final double[] array) {
  }

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Uint16Array(@Nonnull final ArrayBuffer buffer, final int byteOffset, final int length) {
  }

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Uint16Array(@Nonnull final ArrayBuffer buffer, final int byteOffset) {
  }

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Uint16Array(@Nonnull final ArrayBuffer buffer) {
  }

  /**
   * The buffer accessor property represents the ArrayBuffer referenced by a TypedArray at construction time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/buffer">TypedArray.buffer - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-get-%typedarray%.prototype.buffer">The definition of 'TypedArray.prototype.buffer' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsProperty(
      name = "buffer"
  )
  @Nonnull
  public native ArrayBuffer buffer();

  /**
   * The byteLength accessor property represents the length (in bytes) of a typed array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/byteLength">TypedArray.byteLength - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-get-%typedarray%.prototype.bytelength">The definition of 'TypedArray.prototype.byteLength' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsProperty(
      name = "byteLength"
  )
  public native int byteLength();

  /**
   * The byteOffset accessor property represents the offset (in bytes) of a typed array from the start of its ArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/byteOffset">TypedArray.byteOffset - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-get-%typedarray%.prototype.byteoffset">The definition of 'TypedArray.prototype.byteOffset' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsProperty(
      name = "byteOffset"
  )
  public native int byteOffset();

  /**
   * The length accessor property represents the length (in elements) of a typed array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/length">TypedArray.length - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-get-%typedarray%.prototype.length">The definition of 'TypedArray.prototype.length' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The TypedArray.of() method creates a new typed array from a variable number of arguments. This method is nearly the same as Array.of().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/of">TypedArray.of - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.of">The definition of '%TypedArray%.of' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @Nonnull
  public static native Uint16Array of(int... element);

  /**
   * The copyWithin() method shallow copies part of an array to another location in the same array and returns it without modifying its length.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/copyWithin">Typed%TypedArray%.prototype.copyWithin() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.copywithin">%TypedArray%.prototype.copyWithin - ECMA</a>
   */
  @Nonnull
  public native Uint16Array copyWithin(int target, int start, int end);

  /**
   * The copyWithin() method shallow copies part of an array to another location in the same array and returns it without modifying its length.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/copyWithin">Typed%TypedArray%.prototype.copyWithin() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.copywithin">%TypedArray%.prototype.copyWithin - ECMA</a>
   */
  @Nonnull
  public native Uint16Array copyWithin(int target, int start);

  public native int get(int index);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.set-array-offset">The definition of 'TypedArray.prototype.set' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public native void set(int index, int value);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.set-array-offset">The definition of 'TypedArray.prototype.set' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public native void set(@Nonnull Uint16Array array, int offset);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.set-array-offset">The definition of 'TypedArray.prototype.set' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public native void set(@Nonnull Uint16Array array);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.set-array-offset">The definition of 'TypedArray.prototype.set' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public native void set(@Nonnull JsArray<Double> array, int offset);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.set-array-offset">The definition of 'TypedArray.prototype.set' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public native void set(@Nonnull double[] array, int offset);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.set-array-offset">The definition of 'TypedArray.prototype.set' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public native void set(@Nonnull JsArray<Double> array);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.set-array-offset">The definition of 'TypedArray.prototype.set' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public native void set(@Nonnull double[] array);

  /**
   * The subarray() method returns a new TypedArray on the same ArrayBuffer store and with the same element types as for this TypedArray object. The begin offset is inclusive and the end offset is exclusive. TypedArray is one of the typed array types.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/subarray">TypedArray.subarray - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.subarray">The definition of 'TypedArray.prototype.subarray' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @Nonnull
  public native Uint16Array subarray(int start, int end);

  /**
   * The toString() method returns a string representing the specified array and its elements. This method has the same algorithm as Array.prototype.toString(). TypedArray is one of the typed array types here.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/toString">TypedArray.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.tostring">The definition of 'Array.prototype.toString' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();
}
