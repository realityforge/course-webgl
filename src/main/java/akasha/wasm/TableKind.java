package akasha.wasm;

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

  final class Util {
    private Util() {
    }

    @TableKind
    public static String requireValid(final String value) {
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
