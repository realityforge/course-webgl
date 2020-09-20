package elemental3.wasm;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A WebAssembly.Instance object is a stateful, executable instance of a WebAssembly.Module. Instance objects contain all the Exported WebAssembly functions that allow calling into WebAssembly code from JavaScript.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Instance">WebAssembly.Instance - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.Instance"
)
public class Instance {
  public Instance(@Nonnull final Module module, @Nonnull final Object importObject) {
  }

  public Instance(@Nonnull final Module module) {
  }

  /**
   * The exports readonly property of the WebAssembly.Instance object prototype returns an object containing as its members all the functions exported from the WebAssembly module instance, to allow them to be accessed and used by JavaScript.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Instance/exports">WebAssembly.Instance.exports - MDN</a>
   */
  @JsProperty(
      name = "exports"
  )
  @Nonnull
  public native Object exports();
}
