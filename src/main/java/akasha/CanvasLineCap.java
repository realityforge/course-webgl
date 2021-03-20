package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CanvasLineCap.class
)
public @interface CanvasLineCap {
  @Nonnull
  String butt = "butt";

  @Nonnull
  String round = "round";

  @Nonnull
  String square = "square";

  final class Util {
    private Util() {
    }

    @CanvasLineCap
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CanvasLineCap.butt.equals( value ) || CanvasLineCap.round.equals( value ) || CanvasLineCap.square.equals( value );
    }
  }
}
