package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceProtocol.class
)
public @interface RTCIceProtocol {
  @Nonnull
  String tcp = "tcp";

  @Nonnull
  String udp = "udp";

  final class Validator {
    private Validator() {
    }

    @RTCIceProtocol
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCIceProtocol.tcp.equals( value ) || RTCIceProtocol.udp.equals( value );
    }
  }
}
