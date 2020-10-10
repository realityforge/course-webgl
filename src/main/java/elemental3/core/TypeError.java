package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The TypeError object represents an error when an operation could not be performed, typically (but not exclusively) when a value is not of the expected type.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypeError">TypeError - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypeError/TypeError">TypeError.TypeError - MDN</a>
   */
  public TypeError(@Nonnull final String message) {
  }

  /**
   * The TypeError() constructor creates a new error when an operation could not be performed, typically (but not exclusively) when a value is not of the expected type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypeError/TypeError">TypeError.TypeError - MDN</a>
   */
  public TypeError() {
  }
}
