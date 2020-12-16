package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCRtpTransceiverDirection.class
)
public @interface RTCRtpTransceiverDirection {
  @Nonnull
  String inactive = "inactive";

  @Nonnull
  String recvonly = "recvonly";

  @Nonnull
  String sendonly = "sendonly";

  @Nonnull
  String sendrecv = "sendrecv";

  @Nonnull
  String stopped = "stopped";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCRtpTransceiverDirection.inactive.equals( value ) || RTCRtpTransceiverDirection.recvonly.equals( value ) || RTCRtpTransceiverDirection.sendonly.equals( value ) || RTCRtpTransceiverDirection.sendrecv.equals( value ) || RTCRtpTransceiverDirection.stopped.equals( value );
    }
  }
}
