package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ScrollLogicalPosition.class
)
public @interface ScrollLogicalPosition {
  @Nonnull
  String center = "center";

  @Nonnull
  String end = "end";

  @Nonnull
  String nearest = "nearest";

  @Nonnull
  String start = "start";

  final class Util {
    private Util() {
    }

    @ScrollLogicalPosition
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ScrollLogicalPosition.center.equals( value ) || ScrollLogicalPosition.end.equals( value ) || ScrollLogicalPosition.nearest.equals( value ) || ScrollLogicalPosition.start.equals( value );
    }
  }
}
