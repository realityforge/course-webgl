package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceCandidateType.class
)
public @interface RTCIceCandidateType {
  @Nonnull
  String host = "host";

  @Nonnull
  String prflx = "prflx";

  @Nonnull
  String relay = "relay";

  @Nonnull
  String srflx = "srflx";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCIceCandidateType.host.equals( value ) || RTCIceCandidateType.prflx.equals( value ) || RTCIceCandidateType.relay.equals( value ) || RTCIceCandidateType.srflx.equals( value );
    }
  }
}
