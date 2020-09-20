package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RTCSignalingState.class
)
public @interface RTCSignalingState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String have_local_offer = "have-local-offer";

  @Nonnull
  String have_local_pranswer = "have-local-pranswer";

  @Nonnull
  String have_remote_offer = "have-remote-offer";

  @Nonnull
  String have_remote_pranswer = "have-remote-pranswer";

  @Nonnull
  String stable = "stable";
}
