package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DataView view provides a low-level interface for reading and writing multiple number types in a binary ArrayBuffer, without having to care about the platform's endianness.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView">DataView - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DataView"
)
public class DataView implements ArrayBufferView {
  /**
   * The DataView() constructor is used to create DataView objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/DataView">DataView.DataView - MDN</a>
   */
  public DataView(@Nonnull final ArrayBuffer buffer, final int byteOffset, final int byteLength) {
  }

  /**
   * The DataView() constructor is used to create DataView objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/DataView">DataView.DataView - MDN</a>
   */
  public DataView(@Nonnull final ArrayBuffer buffer, final int byteOffset) {
  }

  /**
   * The DataView() constructor is used to create DataView objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/DataView">DataView.DataView - MDN</a>
   */
  public DataView(@Nonnull final ArrayBuffer buffer) {
  }

  /**
   * The DataView() constructor is used to create DataView objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/DataView">DataView.DataView - MDN</a>
   */
  public DataView(@Nonnull final SharedArrayBuffer buffer, final int byteOffset,
      final int byteLength) {
  }

  /**
   * The DataView() constructor is used to create DataView objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/DataView">DataView.DataView - MDN</a>
   */
  public DataView(@Nonnull final SharedArrayBuffer buffer, final int byteOffset) {
  }

  /**
   * The DataView() constructor is used to create DataView objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/DataView">DataView.DataView - MDN</a>
   */
  public DataView(@Nonnull final SharedArrayBuffer buffer) {
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

  public native byte getInt8(int byteOffset);

  public native short getUint8(int byteOffset);

  public native short getInt16(int byteOffset, boolean littleEndian);

  public native short getInt16(int byteOffset);

  public native int getUint16(int byteOffset, boolean littleEndian);

  public native int getUint16(int byteOffset);

  public native int getInt32(int byteOffset, boolean littleEndian);

  public native int getInt32(int byteOffset);

  public native int getUint32(int byteOffset, boolean littleEndian);

  public native int getUint32(int byteOffset);

  public native float getFloat32(int byteOffset, boolean littleEndian);

  public native float getFloat32(int byteOffset);

  public native double getFloat64(int byteOffset, boolean littleEndian);

  public native double getFloat64(int byteOffset);

  public native void setInt8(int byteOffset, byte value);

  public native void setUint8(int byteOffset, int value);

  public native void setInt16(int byteOffset, int value, boolean littleEndian);

  public native void setInt16(int byteOffset, int value);

  public native void setUint16(int byteOffset, int value, boolean littleEndian);

  public native void setUint16(int byteOffset, int value);

  public native void setInt32(int byteOffset, int value, boolean littleEndian);

  public native void setInt32(int byteOffset, int value);

  public native void setUint32(int byteOffset, int value, boolean littleEndian);

  public native void setUint32(int byteOffset, int value);

  public native void setFloat32(int byteOffset, float value, boolean littleEndian);

  public native void setFloat32(int byteOffset, float value);

  public native void setFloat64(int byteOffset, double value, boolean littleEndian);

  public native void setFloat64(int byteOffset, double value);

  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();
}
