package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
}
