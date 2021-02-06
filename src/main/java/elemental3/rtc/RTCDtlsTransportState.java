package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCDtlsTransportState.class
)
public @interface RTCDtlsTransportState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String connected = "connected";

  @Nonnull
  String connecting = "connecting";

  @Nonnull
  String failed = "failed";

  @Nonnull
  String new_ = "new";

  final class Validator {
    private Validator() {
    }

    @RTCDtlsTransportState
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCDtlsTransportState.closed.equals( value ) || RTCDtlsTransportState.connected.equals( value ) || RTCDtlsTransportState.connecting.equals( value ) || RTCDtlsTransportState.failed.equals( value ) || RTCDtlsTransportState.new_.equals( value );
    }
  }
}
