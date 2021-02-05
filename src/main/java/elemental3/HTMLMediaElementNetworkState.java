package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        HTMLMediaElement.NETWORK_EMPTY,
        HTMLMediaElement.NETWORK_IDLE,
        HTMLMediaElement.NETWORK_LOADING,
        HTMLMediaElement.NETWORK_NO_SOURCE
    }
)
public @interface HTMLMediaElementNetworkState {
  final class Validator {
    private Validator() {
    }

    @HTMLMediaElementNetworkState
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@HTMLMediaElementNetworkState annotated value must be one of [HTMLMediaElement.NETWORK_EMPTY, HTMLMediaElement.NETWORK_IDLE, HTMLMediaElement.NETWORK_LOADING, HTMLMediaElement.NETWORK_NO_SOURCE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return HTMLMediaElement.NETWORK_EMPTY == value || HTMLMediaElement.NETWORK_IDLE == value || HTMLMediaElement.NETWORK_LOADING == value || HTMLMediaElement.NETWORK_NO_SOURCE == value;
    }
  }
}
