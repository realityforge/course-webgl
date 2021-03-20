package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = DocumentReadyState.class
)
public @interface DocumentReadyState {
  @Nonnull
  String complete = "complete";

  @Nonnull
  String interactive = "interactive";

  @Nonnull
  String loading = "loading";

  final class Util {
    private Util() {
    }

    @DocumentReadyState
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return DocumentReadyState.complete.equals( value ) || DocumentReadyState.interactive.equals( value ) || DocumentReadyState.loading.equals( value );
    }
  }
}
