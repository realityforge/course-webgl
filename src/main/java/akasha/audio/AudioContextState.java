package akasha.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AudioContextState.class
)
public @interface AudioContextState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String running = "running";

  @Nonnull
  String suspended = "suspended";

  final class Util {
    private Util() {
    }

    @AudioContextState
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AudioContextState.closed.equals( value ) || AudioContextState.running.equals( value ) || AudioContextState.suspended.equals( value );
    }
  }
}
