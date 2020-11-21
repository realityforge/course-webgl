package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

@Generated("org.realityforge.webtack")
public final class Math {
  private Math() {
  }

  public static double abs(double x) {
    return namespace().abs(x);
  }

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
