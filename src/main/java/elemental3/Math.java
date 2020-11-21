package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * Math is a built-in object that has properties and methods for mathematical constants and functions. It&rsquo;s not a function object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math">Math - MDN</a>
 */
@Generated("org.realityforge.webtack")
public final class Math {
  private Math() {
  }

  /**
   * The Math.abs() function returns the absolute value of a number
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/abs">Math.abs - MDN</a>
   */
  public static double abs(double x) {
    return namespace().abs(x);
  }

  /**
   * The Math.abs() function returns the absolute value of a number
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/abs">Math.abs - MDN</a>
   */
  public static double abs(@Nonnull String x) {
    return namespace().abs(x);
  }

  /**
   * Return the 'Math' namespace object.
   *
   * @return the 'Math' namespace object
   */
  @Nonnull
  public static MathNamespace namespace() {
    return Global.math();
  }
}
