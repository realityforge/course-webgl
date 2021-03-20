package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ServiceWorkerState.class
)
public @interface ServiceWorkerState {
  @Nonnull
  String activated = "activated";

  @Nonnull
  String activating = "activating";

  @Nonnull
  String installed = "installed";

  @Nonnull
  String installing = "installing";

  @Nonnull
  String parsed = "parsed";

  @Nonnull
  String redundant = "redundant";

  final class Util {
    private Util() {
    }

    @ServiceWorkerState
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ServiceWorkerState.activated.equals( value ) || ServiceWorkerState.activating.equals( value ) || ServiceWorkerState.installed.equals( value ) || ServiceWorkerState.installing.equals( value ) || ServiceWorkerState.parsed.equals( value ) || ServiceWorkerState.redundant.equals( value );
    }
  }
}
