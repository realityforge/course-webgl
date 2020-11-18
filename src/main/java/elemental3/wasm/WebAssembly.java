package elemental3.wasm;

import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import elemental2.promise.Promise;
import elemental3.ArrayBuffer;
import elemental3.ArrayBufferView;
import elemental3.BufferSource;
import elemental3.DataView;
import elemental3.Global;
import elemental3.Response;
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
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull ArrayBufferView bytes) {
    return namespace().compile(bytes);
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull Int8Array bytes) {
    return namespace().compile(bytes);
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull Int16Array bytes) {
    return namespace().compile(bytes);
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull Int32Array bytes) {
    return namespace().compile(bytes);
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull Uint8Array bytes) {
    return namespace().compile(bytes);
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull Uint16Array bytes) {
    return namespace().compile(bytes);
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull Uint32Array bytes) {
    return namespace().compile(bytes);
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull Uint8ClampedArray bytes) {
    return namespace().compile(bytes);
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull Float32Array bytes) {
    return namespace().compile(bytes);
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull Float64Array bytes) {
    return namespace().compile(bytes);
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull DataView bytes) {
    return namespace().compile(bytes);
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   */
  @Nonnull
  public static Promise<Module> compile(@Nonnull ArrayBuffer bytes) {
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
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull ArrayBufferView bytes,
      @Nonnull Object importObject) {
    return namespace().instantiate(bytes, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Int8Array bytes,
      @Nonnull Object importObject) {
    return namespace().instantiate(bytes, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Int16Array bytes,
      @Nonnull Object importObject) {
    return namespace().instantiate(bytes, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Int32Array bytes,
      @Nonnull Object importObject) {
    return namespace().instantiate(bytes, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Uint8Array bytes,
      @Nonnull Object importObject) {
    return namespace().instantiate(bytes, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Uint16Array bytes,
      @Nonnull Object importObject) {
    return namespace().instantiate(bytes, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Uint32Array bytes,
      @Nonnull Object importObject) {
    return namespace().instantiate(bytes, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Uint8ClampedArray bytes,
      @Nonnull Object importObject) {
    return namespace().instantiate(bytes, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Float32Array bytes,
      @Nonnull Object importObject) {
    return namespace().instantiate(bytes, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Float64Array bytes,
      @Nonnull Object importObject) {
    return namespace().instantiate(bytes, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull DataView bytes,
      @Nonnull Object importObject) {
    return namespace().instantiate(bytes, importObject);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull ArrayBuffer bytes,
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
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull ArrayBufferView bytes) {
    return namespace().instantiate(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Int8Array bytes) {
    return namespace().instantiate(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Int16Array bytes) {
    return namespace().instantiate(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Int32Array bytes) {
    return namespace().instantiate(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Uint8Array bytes) {
    return namespace().instantiate(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Uint16Array bytes) {
    return namespace().instantiate(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Uint32Array bytes) {
    return namespace().instantiate(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(
      @Nonnull Uint8ClampedArray bytes) {
    return namespace().instantiate(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Float32Array bytes) {
    return namespace().instantiate(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull Float64Array bytes) {
    return namespace().instantiate(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull DataView bytes) {
    return namespace().instantiate(bytes);
  }

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   */
  @Nonnull
  public static Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull ArrayBuffer bytes) {
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
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull ArrayBufferView bytes) {
    return namespace().validate(bytes);
  }

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull Int8Array bytes) {
    return namespace().validate(bytes);
  }

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull Int16Array bytes) {
    return namespace().validate(bytes);
  }

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull Int32Array bytes) {
    return namespace().validate(bytes);
  }

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull Uint8Array bytes) {
    return namespace().validate(bytes);
  }

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull Uint16Array bytes) {
    return namespace().validate(bytes);
  }

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull Uint32Array bytes) {
    return namespace().validate(bytes);
  }

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull Uint8ClampedArray bytes) {
    return namespace().validate(bytes);
  }

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull Float32Array bytes) {
    return namespace().validate(bytes);
  }

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull Float64Array bytes) {
    return namespace().validate(bytes);
  }

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull DataView bytes) {
    return namespace().validate(bytes);
  }

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   */
  public static boolean validate(@Nonnull ArrayBuffer bytes) {
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
