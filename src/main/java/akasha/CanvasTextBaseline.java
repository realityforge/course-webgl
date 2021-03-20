package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CanvasTextBaseline.class
)
public @interface CanvasTextBaseline {
  @Nonnull
  String alphabetic = "alphabetic";

  @Nonnull
  String bottom = "bottom";

  @Nonnull
  String hanging = "hanging";

  @Nonnull
  String ideographic = "ideographic";

  @Nonnull
  String middle = "middle";

  @Nonnull
  String top = "top";

  final class Util {
    private Util() {
    }

    @CanvasTextBaseline
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CanvasTextBaseline.alphabetic.equals( value ) || CanvasTextBaseline.bottom.equals( value ) || CanvasTextBaseline.hanging.equals( value ) || CanvasTextBaseline.ideographic.equals( value ) || CanvasTextBaseline.middle.equals( value ) || CanvasTextBaseline.top.equals( value );
    }
  }
}
