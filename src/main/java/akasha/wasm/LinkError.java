package akasha.wasm;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WebAssembly.LinkError object indicates an error during module instantiation (besides traps from the start function).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/LinkError">WebAssembly.LinkError - MDN</a>
 * @see <a href="https://webassembly.github.io/spec/js-api/#exceptiondef-linkerror">LinkError - WebAssembly JavaScript Interface</a>
 * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard">NativeError - ECMAScript (ECMA-262)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.LinkError"
)
public class LinkError {
  protected LinkError() {
  }
}
