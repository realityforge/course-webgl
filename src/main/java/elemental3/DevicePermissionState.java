package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = DevicePermissionState.class
)
public @interface DevicePermissionState {
  @Nonnull
  String denied = "denied";

  @Nonnull
  String granted = "granted";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return DevicePermissionState.denied.equals( value ) || DevicePermissionState.granted.equals( value );
    }
  }
}
