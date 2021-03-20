package akasha.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceTransportPolicy.class
)
public @interface RTCIceTransportPolicy {
  @Nonnull
  String all = "all";

  @Nonnull
  String relay = "relay";

  final class Util {
    private Util() {
    }

    @RTCIceTransportPolicy
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCIceTransportPolicy.all.equals( value ) || RTCIceTransportPolicy.relay.equals( value );
    }
  }
}
