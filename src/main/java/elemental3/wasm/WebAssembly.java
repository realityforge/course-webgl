package elemental3.wasm;

import elemental3.Global;
import elemental3.Response;
import elemental3.core.BufferSource;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * The WebAssembly JavaScript object acts as the namespace for all WebAssembly-related functionality.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly">WebAssembly - MDN</a>
 */
@Generated("org.realityforge.webtack")
public final class WebAssembly {
  private WebAssembly() {
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull BufferSource bytes) {
    return namespace().compile(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull BufferSource bytes,
      @Nonnull Object importObject) {
    return namespace().instantiate(bytes, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull BufferSource bytes) {
    return namespace().instantiate(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<Instance> instantiate(@Nonnull Module moduleObject,
      @Nonnull Object importObject) {
    return namespace().instantiate(moduleObject, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<Instance> instantiate(@Nonnull Module moduleObject) {
    return namespace().instantiate(moduleObject);
  }

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull BufferSource bytes) {
    return namespace().validate(bytes);
  }

  /**
   * The WebAssembly.compileStreaming() function compiles a WebAssembly.Module directly from a streamed underlying source.  This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiateStreaming() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compileStreaming">WebAssembly.compileStreaming - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compileStreaming(@Nonnull Promise<Response> source) {
    return namespace().compileStreaming(source);
  }

  /**
   * The WebAssembly.instantiateStreaming() function compiles and instantiates a WebAssembly module directly from a streamed underlying source. This is the most efficient, optimized way to load wasm code.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiateStreaming">WebAssembly.instantiateStreaming - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiateStreaming(
      @Nonnull Promise<Response> source, @Nonnull Object importObject) {
    return namespace().instantiateStreaming(source, importObject);
  }

  /**
   * The WebAssembly.instantiateStreaming() function compiles and instantiates a WebAssembly module directly from a streamed underlying source. This is the most efficient, optimized way to load wasm code.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiateStreaming">WebAssembly.instantiateStreaming - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiateStreaming(
      @Nonnull Promise<Response> source) {
    return namespace().instantiateStreaming(source);
  }

  /**
   * Return the 'WebAssembly' namespace object.
   *
   * @return the 'WebAssembly' namespace object
   */
  @Nonnull
  public static WebAssemblyNamespace namespace() {
    return Global.webAssembly();
  }
}
