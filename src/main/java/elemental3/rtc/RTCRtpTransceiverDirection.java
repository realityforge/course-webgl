package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
}
