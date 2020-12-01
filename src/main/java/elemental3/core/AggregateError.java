package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The AggregateError object represents an error when several errors need to be wrapped in a single error. It is thrown when multiple errors need to be reported by an operation, for example by Promise.any(), when all promises passed to it reject.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/AggregateError">AggregateError - MDN</a>
 * @see <a href="https://tc39.es/proposal-promise-any/#sec-aggregate-error-objects">The definition of 'AggregateError' in the 'Promise.any' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AggregateError"
)
public class AggregateError extends JsError {
  /**
   * The AggregateError() constructor creates an error for several errors that need to be wrapped in a single error.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/URIError/URIError">URIError() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-urierror">URIError() - ECMA</a>
   */
  public AggregateError(@Nonnull final JsIterable<Any> errors, @Nonnull final String message) {
  }

  /**
   * The AggregateError() constructor creates an error for several errors that need to be wrapped in a single error.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/URIError/URIError">URIError() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-urierror">URIError() - ECMA</a>
   */
  public AggregateError(@Nonnull final JsIterable<Any> errors) {
  }

  @JsProperty(
      name = "errors"
  )
  @Nonnull
  public native JsIterable<Any> errors();
}
