package elemental3.rtc;

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
  String idp_bad_script_failure = "idp_bad_script_failure";

  @Nonnull
  String idp_execution_failure = "idp_execution_failure";

  @Nonnull
  String idp_load_failure = "idp_load_failure";

  @Nonnull
  String idp_need_login = "idp_need_login";

  @Nonnull
  String idp_timeout = "idp_timeout";

  @Nonnull
  String idp_tls_failure = "idp_tls_failure";

  @Nonnull
  String idp_token_expired = "idp_token_expired";

  @Nonnull
  String idp_token_invalid = "idp_token_invalid";
}
