package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CompositeOperation.class
)
public @interface CompositeOperation {
  @Nonnull
  String accumulate = "accumulate";

  @Nonnull
  String add = "add";

  @Nonnull
  String replace = "replace";

  final class Util {
    private Util() {
    }

    @CompositeOperation
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CompositeOperation.accumulate.equals( value ) || CompositeOperation.add.equals( value ) || CompositeOperation.replace.equals( value );
    }
  }
}
