package elemental3.indexeddb;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = IDBRequestReadyState.class
)
public @interface IDBRequestReadyState {
  @Nonnull
  String done = "done";

  @Nonnull
  String pending = "pending";

  final class Validator {
    private Validator() {
    }

    @IDBRequestReadyState
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return IDBRequestReadyState.done.equals( value ) || IDBRequestReadyState.pending.equals( value );
    }
  }
}
