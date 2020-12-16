package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PushPermissionState.class
)
public @interface PushPermissionState {
  @Nonnull
  String denied = "denied";

  @Nonnull
  String granted = "granted";

  @Nonnull
  String prompt = "prompt";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return PushPermissionState.denied.equals( value ) || PushPermissionState.granted.equals( value ) || PushPermissionState.prompt.equals( value );
    }
  }
}
