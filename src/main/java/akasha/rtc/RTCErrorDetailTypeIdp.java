package akasha.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCErrorDetailTypeIdp.class
)
public @interface RTCErrorDetailTypeIdp {
  @Nonnull
  String idp_bad_script_failure = "idp-bad-script-failure";

  @Nonnull
  String idp_execution_failure = "idp-execution-failure";

  @Nonnull
  String idp_load_failure = "idp-load-failure";

  @Nonnull
  String idp_need_login = "idp-need-login";

  @Nonnull
  String idp_timeout = "idp-timeout";

  @Nonnull
  String idp_tls_failure = "idp-tls-failure";

  @Nonnull
  String idp_token_expired = "idp-token-expired";

  @Nonnull
  String idp_token_invalid = "idp-token-invalid";

  final class Util {
    private Util() {
    }

    @RTCErrorDetailTypeIdp
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCErrorDetailTypeIdp.idp_bad_script_failure.equals( value ) || RTCErrorDetailTypeIdp.idp_execution_failure.equals( value ) || RTCErrorDetailTypeIdp.idp_load_failure.equals( value ) || RTCErrorDetailTypeIdp.idp_need_login.equals( value ) || RTCErrorDetailTypeIdp.idp_timeout.equals( value ) || RTCErrorDetailTypeIdp.idp_tls_failure.equals( value ) || RTCErrorDetailTypeIdp.idp_token_expired.equals( value ) || RTCErrorDetailTypeIdp.idp_token_invalid.equals( value );
    }
  }
}
