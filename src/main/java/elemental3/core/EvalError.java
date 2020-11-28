package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The EvalError object indicates an error regarding the global eval() function. This exception is not thrown by JavaScript anymore, however the EvalError object remains for compatibility.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/EvalError">EvalError - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-evalerror">The definition of 'EvalError' in the 'ECMAScript (ECMA-262)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EvalError"
)
public class EvalError extends JsError {
  /**
   * The EvalError constructor creates a new error regarding the global eval() function. This exception is not thrown by JavaScript anymore, however the EvalError object remains for compatibility.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/EvalError/EvalError">EvalError() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-evalerror">EvalError() - ECMA</a>
   */
  public EvalError(@Nonnull final String message) {
  }

  /**
   * The EvalError constructor creates a new error regarding the global eval() function. This exception is not thrown by JavaScript anymore, however the EvalError object remains for compatibility.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/EvalError/EvalError">EvalError() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-evalerror">EvalError() - ECMA</a>
   */
  public EvalError() {
  }
}
