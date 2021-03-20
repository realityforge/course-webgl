package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ResizeQuality.class
)
public @interface ResizeQuality {
  @Nonnull
  String high = "high";

  @Nonnull
  String low = "low";

  @Nonnull
  String medium = "medium";

  @Nonnull
  String pixelated = "pixelated";

  final class Util {
    private Util() {
    }

    @ResizeQuality
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ResizeQuality.high.equals( value ) || ResizeQuality.low.equals( value ) || ResizeQuality.medium.equals( value ) || ResizeQuality.pixelated.equals( value );
    }
  }
}
