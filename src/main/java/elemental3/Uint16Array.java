package elemental3;

import elemental2.core.JsArray;
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
public class Uint16Array implements ArrayBufferView {
  @JsOverlay
  public static final int BYTES_PER_ELEMENT = 2;

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
