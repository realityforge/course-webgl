package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCSignalingState.class
)
public @interface RTCSignalingState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String have_local_offer = "have_local_offer";

  @Nonnull
  String have_local_pranswer = "have_local_pranswer";

  @Nonnull
  String have_remote_offer = "have_remote_offer";

  @Nonnull
  String have_remote_pranswer = "have_remote_pranswer";

  @Nonnull
  String stable = "stable";
}
