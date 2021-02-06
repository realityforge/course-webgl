package elemental3.wasm;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = TableKind.class
)
public @interface TableKind {
  @Nonnull
  String anyfunc = "anyfunc";

  final class Validator {
    private Validator() {
    }

    @TableKind
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return TableKind.anyfunc.equals( value );
    }
  }
}
