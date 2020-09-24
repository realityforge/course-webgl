package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCErrorDetailType.class
)
public @interface RTCErrorDetailType {
  @Nonnull
  String data_channel_failure = "data_channel_failure";

  @Nonnull
  String dtls_failure = "dtls_failure";

  @Nonnull
  String fingerprint_failure = "fingerprint_failure";

  @Nonnull
  String hardware_encoder_error = "hardware_encoder_error";

  @Nonnull
  String hardware_encoder_not_available = "hardware_encoder_not_available";

  @Nonnull
  String sctp_failure = "sctp_failure";

  @Nonnull
  String sdp_syntax_error = "sdp_syntax_error";
}
