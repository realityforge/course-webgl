package akasha.core;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Int8Array typed array represents an array of twos-complement 8-bit signed integers.
 * The contents are initialized to 0. Once established, you can reference elements in the
 * array using the object's methods, or using standard array index syntax (that is, using
 * bracket notation).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int8Array">Int8Array - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-typedarray-objects">TypedArray Objects - ECMA</a>
 * @see <a href="https://heycam.github.io/webidl/#idl-Int8Array">Int8Array - WebIDL</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Int8Array"
)
public class Int8Array implements IntegerTypedArray {
  /**
   * The BYTES_PER_ELEMENT property represents the size in bytes of each element in an typed array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/BYTES_PER_ELEMENT">TypedArray.BYTES_PER_ELEMENT - MDN</a>
   */
  @JsOverlay
  public static final int BYTES_PER_ELEMENT = 1;

  /**
   * The name property represents a string value of the typed array constructor name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/name">TypedArray.name - MDN</a>
   */
  @JsOverlay
  public static final String name = "Int8Array";

  /**
   * The Int8Array() constructor creates a typed array of twos-complement 8-bit signed integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int8Array/Int8Array">Int8Array.Int8Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">TypedArray constructors - ECMAScript (ECMA-262)</a>
   */
  public Int8Array(final int length) {
  }

  /**
   * The Int8Array() constructor creates a typed array of twos-complement 8-bit signed integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int8Array/Int8Array">Int8Array.Int8Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">TypedArray constructors - ECMAScript (ECMA-262)</a>
   */
  public Int8Array(@Nonnull final Int8Array array) {
  }

  /**
   * The Int8Array() constructor creates a typed array of twos-complement 8-bit signed integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int8Array/Int8Array">Int8Array.Int8Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">TypedArray constructors - ECMAScript (ECMA-262)</a>
   */
  public Int8Array(@Nonnull final JsArray<Double> array) {
  }

  /**
   * The Int8Array() constructor creates a typed array of twos-complement 8-bit signed integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int8Array/Int8Array">Int8Array.Int8Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">TypedArray constructors - ECMAScript (ECMA-262)</a>
   */
  public Int8Array(@Nonnull final double[] array) {
  }

  /**
   * The Int8Array() constructor creates a typed array of twos-complement 8-bit signed integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int8Array/Int8Array">Int8Array.Int8Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">TypedArray constructors - ECMAScript (ECMA-262)</a>
   */
  public Int8Array(@Nonnull final ArrayBuffer buffer, final int byteOffset, final int length) {
  }

  /**
   * The Int8Array() constructor creates a typed array of twos-complement 8-bit signed integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int8Array/Int8Array">Int8Array.Int8Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">TypedArray constructors - ECMAScript (ECMA-262)</a>
   */
  public Int8Array(@Nonnull final ArrayBuffer buffer, final int byteOffset) {
  }

  /**
   * The Int8Array() constructor creates a typed array of twos-complement 8-bit signed integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int8Array/Int8Array">Int8Array.Int8Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">TypedArray constructors - ECMAScript (ECMA-262)</a>
   */
  public Int8Array(@Nonnull final ArrayBuffer buffer) {
  }

  /**
   * The buffer accessor property represents the ArrayBuffer referenced by a TypedArray at construction time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/buffer">TypedArray.buffer - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-get-%25typedarray%25.prototype.buffer">TypedArray.prototype.buffer - ECMAScript (ECMA-262)</a>
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
   * @see <a href="https://tc39.es/ecma262/#sec-get-%25typedarray%25.prototype.bytelength">TypedArray.prototype.byteLength - ECMAScript (ECMA-262)</a>
   */
  @JsProperty(
      name = "byteLength"
  )
  public native int byteLength();

  /**
   * The byteOffset accessor property represents the offset (in bytes) of a typed array from the start of its ArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/byteOffset">TypedArray.byteOffset - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-get-%25typedarray%25.prototype.byteoffset">TypedArray.prototype.byteOffset - ECMAScript (ECMA-262)</a>
   */
  @JsProperty(
      name = "byteOffset"
  )
  public native int byteOffset();

  /**
   * The length accessor property represents the length (in elements) of a typed array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/length">TypedArray.length - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-get-%25typedarray%25.prototype.length">TypedArray.prototype.length - ECMAScript (ECMA-262)</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The TypedArray.of() method creates a new typed array from a variable number of arguments. This method is nearly the same as Array.of().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/of">TypedArray.of - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%25typedarray%25.of">%TypedArray%.of - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public static native Int8Array of(byte... element);

  /**
   * The copyWithin() method shallow copies part of an array to another location in the same array and returns it without modifying its length.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/copyWithin">TypedArray.prototype.copyWithin() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%25typedarray%25.prototype.copywithin">%TypedArray%.prototype.copyWithin - ECMA</a>
   */
  @Nonnull
  public native Int8Array copyWithin(int target, int start, int end);

  /**
   * The copyWithin() method shallow copies part of an array to another location in the same array and returns it without modifying its length.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/copyWithin">TypedArray.prototype.copyWithin() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%25typedarray%25.prototype.copywithin">%TypedArray%.prototype.copyWithin - ECMA</a>
   */
  @Nonnull
  public native Int8Array copyWithin(int target, int start);

  public native byte get(int index);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%25typedarray%25.prototype.set-array-offset">TypedArray.prototype.set - ECMAScript (ECMA-262)</a>
   */
  public native void set(int index, byte value);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%25typedarray%25.prototype.set-array-offset">TypedArray.prototype.set - ECMAScript (ECMA-262)</a>
   */
  public native void set(@Nonnull Int8Array array, int offset);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%25typedarray%25.prototype.set-array-offset">TypedArray.prototype.set - ECMAScript (ECMA-262)</a>
   */
  public native void set(@Nonnull Int8Array array);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%25typedarray%25.prototype.set-array-offset">TypedArray.prototype.set - ECMAScript (ECMA-262)</a>
   */
  public native void set(@Nonnull JsArray<Double> array, int offset);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%25typedarray%25.prototype.set-array-offset">TypedArray.prototype.set - ECMAScript (ECMA-262)</a>
   */
  public native void set(@Nonnull double[] array, int offset);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%25typedarray%25.prototype.set-array-offset">TypedArray.prototype.set - ECMAScript (ECMA-262)</a>
   */
  public native void set(@Nonnull JsArray<Double> array);

  /**
   * The set() method stores multiple values in the typed array, reading input values from a specified array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set">TypedArray.set - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%25typedarray%25.prototype.set-array-offset">TypedArray.prototype.set - ECMAScript (ECMA-262)</a>
   */
  public native void set(@Nonnull double[] array);

  /**
   * The subarray() method returns a new TypedArray on the same ArrayBuffer store and with the same element types as for this TypedArray object. The begin offset is inclusive and the end offset is exclusive. TypedArray is one of the typed array types.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/subarray">TypedArray.subarray - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%25typedarray%25.prototype.subarray">TypedArray.prototype.subarray - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native Int8Array subarray(int start, int end);

  /**
   * The toString() method returns a string representing the specified array and its elements. This method has the same algorithm as Array.prototype.toString(). TypedArray is one of the typed array types here.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/toString">TypedArray.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%25typedarray%25.prototype.tostring">Array.prototype.toString - ECMAScript (ECMA-262)</a>
   */
  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();
}
