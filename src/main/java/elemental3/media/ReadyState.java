package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ReadyState.class
)
public @interface ReadyState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String ended = "ended";

  @Nonnull
  String open = "open";

  final class Validator {
    private Validator() {
    }

    @ReadyState
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ReadyState.closed.equals( value ) || ReadyState.ended.equals( value ) || ReadyState.open.equals( value );
    }
  }
}
