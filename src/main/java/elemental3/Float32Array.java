package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Float32Array typed array represents an array of 32-bit floating point numbers (corresponding to
 * the C float data type) in the platform byte order. If control over byte order is needed, use DataView
 * instead. The contents are initialized to 0. Once established, you can reference elements in the array
 * using the object's methods, or using standard array index syntax (that is, using bracket notation).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array">Float32Array - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-typedarray-objects">TypedArray Objects - ECMA</a>
 * @see <a href="https://heycam.github.io/webidl/#idl-Float32Array">Float32Array - WebIDL</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Float32Array"
)
public class Float32Array implements ArrayBufferView {
  @JsOverlay
  public static final int BYTES_PER_ELEMENT = 4;

  /**
   * The Float32Array() typed array constructor creates a new Float32Array object, which is, an array of 32-bit floating point numbers (corresponding to the C float data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array/Float32Array">Float32Array.Float32Array - MDN</a>
   */
  public Float32Array(final int length) {
  }

  /**
   * The Float32Array() typed array constructor creates a new Float32Array object, which is, an array of 32-bit floating point numbers (corresponding to the C float data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array/Float32Array">Float32Array.Float32Array - MDN</a>
   */
  public Float32Array(@Nonnull final Float32Array array) {
  }

  /**
   * The Float32Array() typed array constructor creates a new Float32Array object, which is, an array of 32-bit floating point numbers (corresponding to the C float data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array/Float32Array">Float32Array.Float32Array - MDN</a>
   */
  public Float32Array(@Nonnull final JsArray<Double> array) {
  }

  /**
   * The Float32Array() typed array constructor creates a new Float32Array object, which is, an array of 32-bit floating point numbers (corresponding to the C float data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array/Float32Array">Float32Array.Float32Array - MDN</a>
   */
  public Float32Array(@Nonnull final Double[] array) {
  }

  /**
   * The Float32Array() typed array constructor creates a new Float32Array object, which is, an array of 32-bit floating point numbers (corresponding to the C float data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array/Float32Array">Float32Array.Float32Array - MDN</a>
   */
  public Float32Array(@Nonnull final ArrayBuffer buffer, final int byteOffset, final int length) {
  }

  /**
   * The Float32Array() typed array constructor creates a new Float32Array object, which is, an array of 32-bit floating point numbers (corresponding to the C float data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array/Float32Array">Float32Array.Float32Array - MDN</a>
   */
  public Float32Array(@Nonnull final ArrayBuffer buffer, final int byteOffset) {
  }

  /**
   * The Float32Array() typed array constructor creates a new Float32Array object, which is, an array of 32-bit floating point numbers (corresponding to the C float data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array/Float32Array">Float32Array.Float32Array - MDN</a>
   */
  public Float32Array(@Nonnull final ArrayBuffer buffer) {
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

  public native float get(int index);

  public native void set(int index, float value);

  public native void set(@Nonnull Float32Array array, int offset);

  public native void set(@Nonnull Float32Array array);

  public native void set(@Nonnull JsArray<Double> array, int offset);

  public native void set(@Nonnull Double[] array, int offset);

  public native void set(@Nonnull JsArray<Double> array);

  public native void set(@Nonnull Double[] array);

  @Nonnull
  public native Float32Array subarray(int start, int end);
}
