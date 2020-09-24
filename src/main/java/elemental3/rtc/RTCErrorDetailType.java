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
  String data_channel_failure = "data-channel-failure";

  @Nonnull
  String dtls_failure = "dtls-failure";

  @Nonnull
  String fingerprint_failure = "fingerprint-failure";

  @Nonnull
  String hardware_encoder_error = "hardware-encoder-error";

  @Nonnull
  String hardware_encoder_not_available = "hardware-encoder-not-available";

  @Nonnull
  String sctp_failure = "sctp-failure";

  @Nonnull
  String sdp_syntax_error = "sdp-syntax-error";
}
