package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Uint8Array typed array represents an array of 8-bit unsigned integers. The contents are initialized to 0.
 * Once established, you can reference elements in the array using the object's methods, or using standard array
 * index syntax (that is, using bracket notation).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array">Uint8Array - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-typedarray-objects">TypedArray Objects - ECMA</a>
 * @see <a href="https://heycam.github.io/webidl/#idl-Uint8Array">Uint8Array - WebIDL</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Uint8Array"
)
public class Uint8Array implements ArrayBufferView {
  @JsOverlay
  public static final int BYTES_PER_ELEMENT = 1;

  /**
   * The Uint8Array() constructor creates a typed array of 8-bit unsigned integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/Uint8Array">Uint8Array.Uint8Array - MDN</a>
   */
  public Uint8Array(final int length) {
  }

  /**
   * The Uint8Array() constructor creates a typed array of 8-bit unsigned integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/Uint8Array">Uint8Array.Uint8Array - MDN</a>
   */
  public Uint8Array(@Nonnull final Uint8Array array) {
  }

  /**
   * The Uint8Array() constructor creates a typed array of 8-bit unsigned integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/Uint8Array">Uint8Array.Uint8Array - MDN</a>
   */
  public Uint8Array(@Nonnull final JsArray<Double> array) {
  }

  /**
   * The Uint8Array() constructor creates a typed array of 8-bit unsigned integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/Uint8Array">Uint8Array.Uint8Array - MDN</a>
   */
  public Uint8Array(@Nonnull final Double[] array) {
  }

  /**
   * The Uint8Array() constructor creates a typed array of 8-bit unsigned integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/Uint8Array">Uint8Array.Uint8Array - MDN</a>
   */
  public Uint8Array(@Nonnull final ArrayBuffer buffer, final int byteOffset, final int length) {
  }

  /**
   * The Uint8Array() constructor creates a typed array of 8-bit unsigned integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/Uint8Array">Uint8Array.Uint8Array - MDN</a>
   */
  public Uint8Array(@Nonnull final ArrayBuffer buffer, final int byteOffset) {
  }

  /**
   * The Uint8Array() constructor creates a typed array of 8-bit unsigned integers. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/Uint8Array">Uint8Array.Uint8Array - MDN</a>
   */
  public Uint8Array(@Nonnull final ArrayBuffer buffer) {
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

  public native void set(@Nonnull Uint8Array array, int offset);

  public native void set(@Nonnull Uint8Array array);

  public native void set(@Nonnull JsArray<Double> array, int offset);

  public native void set(@Nonnull Double[] array, int offset);

  public native void set(@Nonnull JsArray<Double> array);

  public native void set(@Nonnull Double[] array);

  @Nonnull
  public native Uint8Array subarray(int start, int end);
}
