package akasha.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SharedArrayBuffer object is used to represent a generic, fixed-length raw binary data buffer, similar to the ArrayBuffer object, but in a way that they can be used to create views on shared memory.
 * Unlike an ArrayBuffer, a SharedArrayBuffer cannot become detached.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer">SharedArrayBuffer - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-sharedarraybuffer-objects">SharedArrayBuffer - ECMA</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SharedArrayBuffer"
)
public class SharedArrayBuffer {
  /**
   * The SharedArrayBuffer() constructor is used to create a SharedArrayBuffer object representing a generic, fixed-length raw binary data buffer, similar to the ArrayBuffer object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer/SharedArrayBuffer">SharedArrayBuffer() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-sharedarraybuffer-constructor">The SharedArrayBuffer Constructor - ECMA</a>
   */
  public SharedArrayBuffer(final int length) {
  }

  /**
   * The byteLength accessor property represents the length of an SharedArrayBuffer in bytes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer/byteLength">SharedArrayBuffer.byteLength - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-get-sharedarraybuffer.prototype.bytelength">SharedArrayBuffer.prototype.byteLength - ECMA</a>
   */
  @JsProperty(
      name = "byteLength"
  )
  public native int byteLength();

  /**
   * The SharedArrayBuffer.prototype.slice() method returns a new SharedArrayBuffer whose contents are a copy of this SharedArrayBuffer's bytes from begin, inclusive, up to end, exclusive. If either begin or end is negative, it refers to an index from the end of the array, as opposed to from the beginning. This method has the same algorithm as Array.prototype.slice().
   *
   * @return A new SharedArrayBuffer containing the extracted elements.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer/slice">SharedArrayBuffer.slice - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-sharedarraybuffer.prototype.slice">SharedArrayBuffer.slice - ECMA</a>
   */
  @Nonnull
  public native SharedArrayBuffer slice(int begin, int end);

  /**
   * The SharedArrayBuffer.prototype.slice() method returns a new SharedArrayBuffer whose contents are a copy of this SharedArrayBuffer's bytes from begin, inclusive, up to end, exclusive. If either begin or end is negative, it refers to an index from the end of the array, as opposed to from the beginning. This method has the same algorithm as Array.prototype.slice().
   *
   * @return A new SharedArrayBuffer containing the extracted elements.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer/slice">SharedArrayBuffer.slice - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-sharedarraybuffer.prototype.slice">SharedArrayBuffer.slice - ECMA</a>
   */
  @Nonnull
  public native SharedArrayBuffer slice(int begin);

  /**
   * The SharedArrayBuffer.prototype.slice() method returns a new SharedArrayBuffer whose contents are a copy of this SharedArrayBuffer's bytes from begin, inclusive, up to end, exclusive. If either begin or end is negative, it refers to an index from the end of the array, as opposed to from the beginning. This method has the same algorithm as Array.prototype.slice().
   *
   * @return A new SharedArrayBuffer containing the extracted elements.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer/slice">SharedArrayBuffer.slice - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-sharedarraybuffer.prototype.slice">SharedArrayBuffer.slice - ECMA</a>
   */
  @Nonnull
  public native SharedArrayBuffer slice();
}
