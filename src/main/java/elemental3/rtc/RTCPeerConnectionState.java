package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCPeerConnectionState.class
)
public @interface RTCPeerConnectionState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String connected = "connected";

  @Nonnull
  String connecting = "connecting";

  @Nonnull
  String disconnected = "disconnected";

  @Nonnull
  String failed = "failed";

  @Nonnull
  String new_ = "new";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCPeerConnectionState.closed.equals( value ) || RTCPeerConnectionState.connected.equals( value ) || RTCPeerConnectionState.connecting.equals( value ) || RTCPeerConnectionState.disconnected.equals( value ) || RTCPeerConnectionState.failed.equals( value ) || RTCPeerConnectionState.new_.equals( value );
    }
  }
}
