package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Uint8ClampedArray typed array represents an array of 8-bit unsigned integers clamped to 0-255; if you
 * specified a value that is out of the range of [0,255], 0 or 255 will be set instead; if you specify a non-integer,
 * the nearest integer will be set. The contents are initialized to 0. Once established, you can reference elements
 * in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray">Uint8ClampedArray - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-typedarray-objects">TypedArray Objects - ECMA</a>
 * @see <a href="https://heycam.github.io/webidl/#idl-Uint8ClampedArray">Uint8ClampedArray - WebIDL</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Uint8ClampedArray"
)
public class Uint8ClampedArray implements IntegerTypedArray {
  @JsOverlay
  public static final int BYTES_PER_ELEMENT = 1;

  /**
   * The Uint8ClampedArray() constructor creates a typed array of 8-bit unsigned integers clamped to 0-255; if you specified a value that is out of the range of [0,255], 0 or 255 will be set instead; if you specify a non-integer, the nearest integer will be set. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray/Uint8ClampedArray">Uint8ClampedArray.Uint8ClampedArray - MDN</a>
   */
  public Uint8ClampedArray(final int length) {
  }

  /**
   * The Uint8ClampedArray() constructor creates a typed array of 8-bit unsigned integers clamped to 0-255; if you specified a value that is out of the range of [0,255], 0 or 255 will be set instead; if you specify a non-integer, the nearest integer will be set. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray/Uint8ClampedArray">Uint8ClampedArray.Uint8ClampedArray - MDN</a>
   */
  public Uint8ClampedArray(@Nonnull final Uint8ClampedArray array) {
  }

  /**
   * The Uint8ClampedArray() constructor creates a typed array of 8-bit unsigned integers clamped to 0-255; if you specified a value that is out of the range of [0,255], 0 or 255 will be set instead; if you specify a non-integer, the nearest integer will be set. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray/Uint8ClampedArray">Uint8ClampedArray.Uint8ClampedArray - MDN</a>
   */
  public Uint8ClampedArray(@Nonnull final JsArray<Double> array) {
  }

  /**
   * The Uint8ClampedArray() constructor creates a typed array of 8-bit unsigned integers clamped to 0-255; if you specified a value that is out of the range of [0,255], 0 or 255 will be set instead; if you specify a non-integer, the nearest integer will be set. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray/Uint8ClampedArray">Uint8ClampedArray.Uint8ClampedArray - MDN</a>
   */
  public Uint8ClampedArray(@Nonnull final double[] array) {
  }

  /**
   * The Uint8ClampedArray() constructor creates a typed array of 8-bit unsigned integers clamped to 0-255; if you specified a value that is out of the range of [0,255], 0 or 255 will be set instead; if you specify a non-integer, the nearest integer will be set. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray/Uint8ClampedArray">Uint8ClampedArray.Uint8ClampedArray - MDN</a>
   */
  public Uint8ClampedArray(@Nonnull final ArrayBuffer buffer, final int byteOffset,
      final int length) {
  }

  /**
   * The Uint8ClampedArray() constructor creates a typed array of 8-bit unsigned integers clamped to 0-255; if you specified a value that is out of the range of [0,255], 0 or 255 will be set instead; if you specify a non-integer, the nearest integer will be set. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray/Uint8ClampedArray">Uint8ClampedArray.Uint8ClampedArray - MDN</a>
   */
  public Uint8ClampedArray(@Nonnull final ArrayBuffer buffer, final int byteOffset) {
  }

  /**
   * The Uint8ClampedArray() constructor creates a typed array of 8-bit unsigned integers clamped to 0-255; if you specified a value that is out of the range of [0,255], 0 or 255 will be set instead; if you specify a non-integer, the nearest integer will be set. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray/Uint8ClampedArray">Uint8ClampedArray.Uint8ClampedArray - MDN</a>
   */
  public Uint8ClampedArray(@Nonnull final ArrayBuffer buffer) {
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

  public native short get(int index);

  public native void set(int index, short value);

  public native void set(@Nonnull Uint8ClampedArray array, int offset);

  public native void set(@Nonnull Uint8ClampedArray array);

  public native void set(@Nonnull JsArray<Double> array, int offset);

  public native void set(@Nonnull double[] array, int offset);

  public native void set(@Nonnull JsArray<Double> array);

  public native void set(@Nonnull double[] array);

  @Nonnull
  public native Uint8ClampedArray subarray(int start, int end);
}
