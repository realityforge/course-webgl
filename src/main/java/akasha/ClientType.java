package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ClientType.class
)
public @interface ClientType {
  @Nonnull
  String all = "all";

  @Nonnull
  String sharedworker = "sharedworker";

  @Nonnull
  String window = "window";

  @Nonnull
  String worker = "worker";

  final class Util {
    private Util() {
    }

    @ClientType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ClientType.all.equals( value ) || ClientType.sharedworker.equals( value ) || ClientType.window.equals( value ) || ClientType.worker.equals( value );
    }
  }
}
