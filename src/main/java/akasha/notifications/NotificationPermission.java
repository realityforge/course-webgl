package akasha.notifications;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = NotificationPermission.class
)
public @interface NotificationPermission {
  @Nonnull
  String default_ = "default";

  @Nonnull
  String denied = "denied";

  @Nonnull
  String granted = "granted";

  final class Util {
    private Util() {
    }

    @NotificationPermission
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return NotificationPermission.default_.equals( value ) || NotificationPermission.denied.equals( value ) || NotificationPermission.granted.equals( value );
    }
  }
}
