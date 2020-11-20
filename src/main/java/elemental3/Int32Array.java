package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Int32Array() typed array constructor creates an array of twos-complement 32-bit signed integers in
 * the platform byte order. If control over byte order is needed, use DataView instead. The contents are
 * initialized to 0. Once established, you can reference elements in the array using the object's methods,
 * or using standard array index syntax (that is, using bracket notation).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array">Int32Array - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-typedarray-objects">TypedArray Objects - ECMA</a>
 * @see <a href="https://heycam.github.io/webidl/#idl-Int32Array">Int32Array - WebIDL</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Int32Array"
)
public class Int32Array implements IntegerTypedArray, ArrayBufferView {
  @JsOverlay
  public static final int BYTES_PER_ELEMENT = 4;

  public Int32Array(final int length) {
  }

  public Int32Array(@Nonnull final Int32Array array) {
  }

  public Int32Array(@Nonnull final JsArray<Double> array) {
  }

  public Int32Array(@Nonnull final double[] array) {
  }

  public Int32Array(@Nonnull final ArrayBuffer buffer, final int byteOffset, final int length) {
  }

  public Int32Array(@Nonnull final ArrayBuffer buffer, final int byteOffset) {
  }

  public Int32Array(@Nonnull final ArrayBuffer buffer) {
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

  public native void set(@Nonnull Int32Array array, int offset);

  public native void set(@Nonnull Int32Array array);

  public native void set(@Nonnull JsArray<Double> array, int offset);

  public native void set(@Nonnull double[] array, int offset);

  public native void set(@Nonnull JsArray<Double> array);

  public native void set(@Nonnull double[] array);

  @Nonnull
  public native Int32Array subarray(int start, int end);
}
