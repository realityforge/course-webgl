package elemental3.core;

import elemental3.Transferable;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ArrayBuffer object is used to represent a generic, fixed-length raw binary data buffer.
 * <p>It is an array of bytes, often referred to in other languages as a "byte array". You cannot
 * directly manipulate the contents of an ArrayBuffer; instead, you create one of the typed array
 * objects or a {@link elemental3.core.DataView} object which represents the buffer in a specific format, and use
 * that to read and write the contents of the buffer.</p>
 * <p>The ArrayBuffer() constructor creates a new ArrayBuffer of the given length in bytes. You can
 * also get an array buffer from existing data, for example from a <a href="https://developer.mozilla.org/en-US/docs/Glossary/Base64#Appendix_to_Solution_1_Decode_a_Base64_string_to_Uint8Array_or_ArrayBuffer">Base64 string</a>
 * or from a <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readAsArrayBuffer">local file</a>.</p>
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer">ArrayBuffer - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-arraybuffer-objects">ArrayBuffer - ECMA</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ArrayBuffer"
)
public class ArrayBuffer implements BufferSource, Transferable {
  /**
   * The ArrayBuffer() constructor is used to create ArrayBuffer objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/ArrayBuffer">ArrayBuffer() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-arraybuffer-constructor">The ArrayBuffer Constructor - ECMA</a>
   */
  public ArrayBuffer(final int length) {
  }

  /**
   * The byteLength accessor property represents the length of an ArrayBuffer in bytes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/byteLength">ArrayBuffer.byteLength - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-get-arraybuffer.prototype.bytelength">ArrayBuffer.prototype.byteLength - ECMA</a>
   */
  @JsProperty(
      name = "byteLength"
  )
  public native int byteLength();

  /**
   * The ArrayBuffer.isView() method determines whether the passed value is one of the ArrayBuffer views, such as typed array objects or a DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/isView">ArrayBuffer.isView - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-arraybuffer.isview">ArrayBuffer.isView - ECMA</a>
   */
  public static native boolean isView(@DoNotAutobox @Nullable Object value);

  /**
   * The slice() method returns a new ArrayBuffer whose contents are a copy of this ArrayBuffer's bytes from begin, inclusive, up to end, exclusive.
   *
   * @return A new ArrayBuffer containing the extracted elements.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/slice">ArrayBuffer.slice - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-arraybuffer.prototype.slice">ArrayBuffer.slice - ECMA</a>
   */
  @Nonnull
  public native ArrayBuffer slice(int begin, int end);

  /**
   * The slice() method returns a new ArrayBuffer whose contents are a copy of this ArrayBuffer's bytes from begin, inclusive, up to end, exclusive.
   *
   * @return A new ArrayBuffer containing the extracted elements.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer/slice">ArrayBuffer.slice - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-arraybuffer.prototype.slice">ArrayBuffer.slice - ECMA</a>
   */
  @Nonnull
  public native ArrayBuffer slice(int begin);
}
