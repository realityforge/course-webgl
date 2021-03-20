package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CanvasDirection.class
)
public @interface CanvasDirection {
  @Nonnull
  String inherit = "inherit";

  @Nonnull
  String ltr = "ltr";

  @Nonnull
  String rtl = "rtl";

  final class Util {
    private Util() {
    }

    @CanvasDirection
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CanvasDirection.inherit.equals( value ) || CanvasDirection.ltr.equals( value ) || CanvasDirection.rtl.equals( value );
    }
  }
}
