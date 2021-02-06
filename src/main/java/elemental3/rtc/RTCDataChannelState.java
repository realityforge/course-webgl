package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCDataChannelState.class
)
public @interface RTCDataChannelState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String closing = "closing";

  @Nonnull
  String connecting = "connecting";

  @Nonnull
  String open = "open";

  final class Validator {
    private Validator() {
    }

    @RTCDataChannelState
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCDataChannelState.closed.equals( value ) || RTCDataChannelState.closing.equals( value ) || RTCDataChannelState.connecting.equals( value ) || RTCDataChannelState.open.equals( value );
    }
  }
}
