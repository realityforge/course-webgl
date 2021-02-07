package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The TypeError object represents an error when an operation could not be performed, typically (but not exclusively) when a value is not of the expected type.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypeError">TypeError - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-typeerror">TypeError - ECMAScript (ECMA-262)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TypeError"
)
public class TypeError extends JsError {
  /**
   * The TypeError() constructor creates a new error when an operation could not be performed, typically (but not exclusively) when a value is not of the expected type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypeError/TypeError">TypeError() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-typeerror">TypeError() - ECMA</a>
   */
  public TypeError(@Nonnull final String message) {
  }

  /**
   * The TypeError() constructor creates a new error when an operation could not be performed, typically (but not exclusively) when a value is not of the expected type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypeError/TypeError">TypeError() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-typeerror">TypeError() - ECMA</a>
   */
  public TypeError() {
  }
}
