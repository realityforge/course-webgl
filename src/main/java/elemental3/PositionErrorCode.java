package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        PositionError.PERMISSION_DENIED,
        PositionError.POSITION_UNAVAILABLE,
        PositionError.TIMEOUT
    }
)
public @interface PositionErrorCode {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return PositionError.PERMISSION_DENIED == value || PositionError.POSITION_UNAVAILABLE == value || PositionError.TIMEOUT == value;
    }
  }
}
