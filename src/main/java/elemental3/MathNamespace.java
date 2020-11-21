package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Math is a built-in object that has properties and methods for mathematical constants and functions. It&rsquo;s not a function object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math">Math - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Math"
)
public final class MathNamespace {
  private MathNamespace() {
  }

  /**
   * The Math.abs() function returns the absolute value of a number
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/abs">Math.abs - MDN</a>
   */
  public native double abs(@Nonnull String x);

  /**
   * The Math.abs() function returns the absolute value of a number
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/abs">Math.abs - MDN</a>
   */
  public native double abs(double x);
}
