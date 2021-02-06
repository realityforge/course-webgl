package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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

    @WebSocketReadyState
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@WebSocketReadyState annotated value must be one of [WebSocket.CONNECTING, WebSocket.OPEN, WebSocket.CLOSING, WebSocket.CLOSED] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebSocket.CONNECTING == value || WebSocket.OPEN == value || WebSocket.CLOSING == value || WebSocket.CLOSED == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebSocket.CONNECTING == value ? "CONNECTING" : WebSocket.OPEN == value ? "OPEN" : WebSocket.CLOSING == value ? "CLOSING" : WebSocket.CLOSED == value ? "CLOSED" : "Unknown value " + value;
    }
  }
}
