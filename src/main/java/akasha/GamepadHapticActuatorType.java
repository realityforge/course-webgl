package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GamepadHapticActuatorType.class
)
public @interface GamepadHapticActuatorType {
  @Nonnull
  String vibration = "vibration";

  final class Util {
    private Util() {
    }

    @GamepadHapticActuatorType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GamepadHapticActuatorType.vibration.equals( value );
    }
  }
}
