package akasha.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCSctpTransportState.class
)
public @interface RTCSctpTransportState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String connected = "connected";

  @Nonnull
  String connecting = "connecting";

  final class Util {
    private Util() {
    }

    @RTCSctpTransportState
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCSctpTransportState.closed.equals( value ) || RTCSctpTransportState.connected.equals( value ) || RTCSctpTransportState.connecting.equals( value );
    }
  }
}
