package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
   */
  public Uint16Array(final int length) {
  }

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   */
  public Uint16Array(@Nonnull final Uint16Array array) {
  }

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   */
  public Uint16Array(@Nonnull final JsArray<Double> array) {
  }

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   */
  public Uint16Array(@Nonnull final double[] array) {
  }

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   */
  public Uint16Array(@Nonnull final ArrayBuffer buffer, final int byteOffset, final int length) {
  }

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   */
  public Uint16Array(@Nonnull final ArrayBuffer buffer, final int byteOffset) {
  }

  /**
   * The Uint16Array() typed array constructor creates an array of 16-bit unsigned integers in the platform byte order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array">Uint16Array.Uint16Array - MDN</a>
   */
  public Uint16Array(@Nonnull final ArrayBuffer buffer) {
  }

  @JsProperty(
      name = "buffer"
  )
  @Nonnull
  public native ArrayBuffer buffer();

  @JsProperty(
      name = "byteLength"
  )
  public native int byteLength();

  @JsProperty(
      name = "byteOffset"
  )
  public native int byteOffset();

  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The TypedArray.of() method creates a new typed array from a variable number of arguments. This method is nearly the same as Array.of().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/of">TypedArray.of - MDN</a>
   */
  @Nonnull
  public static native Uint16Array of(int... element);

  /**
   * The copyWithin() method shallow copies part of an array to another location in the same array and returns it without modifying its length.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/copyWithin">TypedArray.prototype.copyWithin() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-array.prototype.copywithin">Array.prototype.copyWithin - ECMA</a>
   */
  @Nonnull
  public native Uint16Array copyWithin(int target, int start, int end);

  /**
   * The copyWithin() method shallow copies part of an array to another location in the same array and returns it without modifying its length.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/copyWithin">TypedArray.prototype.copyWithin() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-array.prototype.copywithin">Array.prototype.copyWithin - ECMA</a>
   */
  @Nonnull
  public native Uint16Array copyWithin(int target, int start);

  public native int get(int index);

  public native void set(int index, int value);

  public native void set(@Nonnull Uint16Array array, int offset);

  public native void set(@Nonnull Uint16Array array);

  public native void set(@Nonnull JsArray<Double> array, int offset);

  public native void set(@Nonnull double[] array, int offset);

  public native void set(@Nonnull JsArray<Double> array);

  public native void set(@Nonnull double[] array);

  @Nonnull
  public native Uint16Array subarray(int start, int end);
}
