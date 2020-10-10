package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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

  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();
}
