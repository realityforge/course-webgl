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

  final class Validator {
    private Validator() {
    }

    @RTCErrorDetailType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCErrorDetailType.data_channel_failure.equals( value ) || RTCErrorDetailType.dtls_failure.equals( value ) || RTCErrorDetailType.fingerprint_failure.equals( value ) || RTCErrorDetailType.hardware_encoder_error.equals( value ) || RTCErrorDetailType.hardware_encoder_not_available.equals( value ) || RTCErrorDetailType.sctp_failure.equals( value ) || RTCErrorDetailType.sdp_syntax_error.equals( value );
    }
  }
}
