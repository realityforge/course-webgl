package elemental3.wasm;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.JsArray;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import elemental3.ArrayBufferView;
import elemental3.BufferSource;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * A WebAssembly.Module object contains stateless WebAssembly code that has already been compiled by the browser &mdash; this can be efficiently shared with Workers, and instantiated multiple times.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Module">WebAssembly.Module - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.Module"
)
public class Module {
  public Module(@Nonnull final BufferSource bytes) {
  }

  public Module(@Nonnull final ArrayBufferView bytes) {
  }

  public Module(@Nonnull final Int8Array bytes) {
  }

  public Module(@Nonnull final Int16Array bytes) {
  }

  public Module(@Nonnull final Int32Array bytes) {
  }

  public Module(@Nonnull final Uint8Array bytes) {
  }

  public Module(@Nonnull final Uint16Array bytes) {
  }

  public Module(@Nonnull final Uint32Array bytes) {
  }

  public Module(@Nonnull final Uint8ClampedArray bytes) {
  }

  public Module(@Nonnull final Float32Array bytes) {
  }

  public Module(@Nonnull final Float64Array bytes) {
  }

  public Module(@Nonnull final DataView bytes) {
  }

  public Module(@Nonnull final ArrayBuffer bytes) {
  }

  @Nonnull
  public static native JsArray<ArrayBuffer> customSections(@Nonnull Module moduleObject,
      @Nonnull String sectionName);

  @Nonnull
  public static native JsArray<ModuleExportDescriptor> exports(@Nonnull Module moduleObject);

  @Nonnull
  public static native JsArray<ModuleImportDescriptor> imports(@Nonnull Module moduleObject);
}
