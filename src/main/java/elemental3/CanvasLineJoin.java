package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CanvasLineJoin.class
)
public @interface CanvasLineJoin {
  @Nonnull
  String bevel = "bevel";

  @Nonnull
  String miter = "miter";

  @Nonnull
  String round = "round";

  final class Validator {
    private Validator() {
    }

    @CanvasLineJoin
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CanvasLineJoin.bevel.equals( value ) || CanvasLineJoin.miter.equals( value ) || CanvasLineJoin.round.equals( value );
    }
  }
}
