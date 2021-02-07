package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Error objects are thrown when runtime errors occur. The Error object can also be used as a base object for user-defined exceptions. See below for standard built-in error types.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error">Error - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-error-objects">Error - ECMAScript (ECMA-262)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Error"
)
public class JsError {
  /**
   * The Error constructor creates an error object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error/Error">Error() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-error-constructor">Error() - ECMA</a>
   */
  public JsError(@Nonnull final String message) {
  }

  /**
   * The Error constructor creates an error object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error/Error">Error() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-error-constructor">Error() - ECMA</a>
   */
  public JsError() {
  }

  /**
   * The message property is a human-readable description of the error.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error/message">Error.message - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-error.prototype.message">Error.prototype.message - ECMAScript (ECMA-262)</a>
   */
  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();

  /**
   * The name property represents a name for the type of error. The initial value is &quot;Error&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error/name">Error.name - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-error.prototype.name">Error.prototype.name - ECMAScript (ECMA-262)</a>
   */
  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  /**
   * The non-standard stack property of Error objects offer a trace of which functions were called, in what order, from which line and file, and with what arguments. The stack string proceeds from the most recent calls to earlier ones, leading back to the original global scope call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error/stack">Error.stack - MDN</a>
   */
  @JsProperty(
      name = "stack"
  )
  @Nonnull
  public native String stack();
}
