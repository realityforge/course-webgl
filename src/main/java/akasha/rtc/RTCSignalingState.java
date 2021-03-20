package akasha.rtc;

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
  String have_local_offer = "have-local-offer";

  @Nonnull
  String have_local_pranswer = "have-local-pranswer";

  @Nonnull
  String have_remote_offer = "have-remote-offer";

  @Nonnull
  String have_remote_pranswer = "have-remote-pranswer";

  @Nonnull
  String stable = "stable";

  final class Util {
    private Util() {
    }

    @RTCSignalingState
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCSignalingState.closed.equals( value ) || RTCSignalingState.have_local_offer.equals( value ) || RTCSignalingState.have_local_pranswer.equals( value ) || RTCSignalingState.have_remote_offer.equals( value ) || RTCSignalingState.have_remote_pranswer.equals( value ) || RTCSignalingState.stable.equals( value );
    }
  }
}
