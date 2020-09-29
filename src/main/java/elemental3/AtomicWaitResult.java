package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The result of waiting on a value.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AtomicWaitResult.class
)
public @interface AtomicWaitResult {
  @Nonnull
  String not_equal = "not-equal";

  @Nonnull
  String ok = "ok";

  @Nonnull
  String timed_out = "timed-out";
}
