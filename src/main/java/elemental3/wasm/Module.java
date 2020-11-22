package elemental3.wasm;

import elemental3.core.ArrayBuffer;
import elemental3.core.BufferSource;
import elemental3.core.JsArray;
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

  @Nonnull
  public static native JsArray<ArrayBuffer> customSections(@Nonnull Module moduleObject,
      @Nonnull String sectionName);

  @Nonnull
  public static native JsArray<ModuleExportDescriptor> exports(@Nonnull Module moduleObject);

  @Nonnull
  public static native JsArray<ModuleImportDescriptor> imports(@Nonnull Module moduleObject);
}
