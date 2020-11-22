package elemental3.wasm;

import elemental3.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebAssembly.Memory object is a resizable ArrayBuffer or SharedArrayBuffer that holds the raw bytes of memory accessed by a WebAssembly Instance.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Memory">WebAssembly.Memory - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.Memory"
)
public class Memory {
  public Memory(@Nonnull final MemoryDescriptor descriptor) {
  }

  /**
   * The buffer prototype property of the WebAssembly.Memory object returns the buffer contained in the memory.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Memory/buffer">WebAssembly.Memory.buffer - MDN</a>
   */
  @JsProperty(
      name = "buffer"
  )
  @Nonnull
  public native ArrayBuffer buffer();

  /**
   * The grow() protoype method of the Memory object increases the size of the memory instance by a specified number of WebAssembly pages.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Memory/grow">WebAssembly.Memory.grow - MDN</a>
   */
  public native int grow(int delta);
}
