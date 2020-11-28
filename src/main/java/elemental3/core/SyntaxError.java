package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The SyntaxError object represents an error when trying to interpret syntactically invalid code. It is thrown when the JavaScript engine encounters tokens or token order that does not conform to the syntax of the language when parsing code.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SyntaxError">SyntaxError - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-syntaxerror">The definition of 'SyntaxError' in the 'ECMAScript (ECMA-262)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SyntaxError"
)
public class SyntaxError extends JsError {
  /**
   * The SyntaxError constructor creates a new error object that represents an error when trying to interpret syntactically invalid code.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SyntaxError/SyntaxError">SyntaxError() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-syntaxerror">SyntaxError() - ECMA</a>
   */
  public SyntaxError(@Nonnull final String message) {
  }

  /**
   * The SyntaxError constructor creates a new error object that represents an error when trying to interpret syntactically invalid code.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SyntaxError/SyntaxError">SyntaxError() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-syntaxerror">SyntaxError() - ECMA</a>
   */
  public SyntaxError() {
  }
}
