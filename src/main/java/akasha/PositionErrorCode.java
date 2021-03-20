package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
  final class Util {
    private Util() {
    }

    @PositionErrorCode
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@PositionErrorCode annotated value must be one of [PositionError.PERMISSION_DENIED, PositionError.POSITION_UNAVAILABLE, PositionError.TIMEOUT] but is " + value;
    }

    public static boolean isValid(final int value) {
      return PositionError.PERMISSION_DENIED == value || PositionError.POSITION_UNAVAILABLE == value || PositionError.TIMEOUT == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return PositionError.PERMISSION_DENIED == value ? "PERMISSION_DENIED" : PositionError.POSITION_UNAVAILABLE == value ? "POSITION_UNAVAILABLE" : PositionError.TIMEOUT == value ? "TIMEOUT" : "Unknown value " + value;
    }
  }
}
