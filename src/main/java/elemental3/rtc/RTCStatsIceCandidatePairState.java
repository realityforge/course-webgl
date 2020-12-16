package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCStatsIceCandidatePairState.class
)
public @interface RTCStatsIceCandidatePairState {
  @Nonnull
  String failed = "failed";

  @Nonnull
  String frozen = "frozen";

  @Nonnull
  String in_progress = "in-progress";

  @Nonnull
  String succeeded = "succeeded";

  @Nonnull
  String waiting = "waiting";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCStatsIceCandidatePairState.failed.equals( value ) || RTCStatsIceCandidatePairState.frozen.equals( value ) || RTCStatsIceCandidatePairState.in_progress.equals( value ) || RTCStatsIceCandidatePairState.succeeded.equals( value ) || RTCStatsIceCandidatePairState.waiting.equals( value );
    }
  }
}
