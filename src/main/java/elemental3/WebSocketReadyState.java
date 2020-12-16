package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebSocket.CONNECTING,
        WebSocket.OPEN,
        WebSocket.CLOSING,
        WebSocket.CLOSED
    }
)
public @interface WebSocketReadyState {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WebSocket.CONNECTING == value || WebSocket.OPEN == value || WebSocket.CLOSING == value || WebSocket.CLOSED == value;
    }
  }
}
