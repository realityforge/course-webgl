package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceTransportState.class
)
public @interface RTCIceTransportState {
  @Nonnull
  String checking = "checking";

  @Nonnull
  String closed = "closed";

  @Nonnull
  String completed = "completed";

  @Nonnull
  String connected = "connected";

  @Nonnull
  String disconnected = "disconnected";

  @Nonnull
  String failed = "failed";

  @Nonnull
  String new_ = "new";

  final class Validator {
    private Validator() {
    }

    @RTCIceTransportState
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCIceTransportState.checking.equals( value ) || RTCIceTransportState.closed.equals( value ) || RTCIceTransportState.completed.equals( value ) || RTCIceTransportState.connected.equals( value ) || RTCIceTransportState.disconnected.equals( value ) || RTCIceTransportState.failed.equals( value ) || RTCIceTransportState.new_.equals( value );
    }
  }
}
