package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
}
