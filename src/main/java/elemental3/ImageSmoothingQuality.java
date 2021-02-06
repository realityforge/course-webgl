package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ImageSmoothingQuality.class
)
public @interface ImageSmoothingQuality {
  @Nonnull
  String high = "high";

  @Nonnull
  String low = "low";

  @Nonnull
  String medium = "medium";

  final class Validator {
    private Validator() {
    }

    @ImageSmoothingQuality
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ImageSmoothingQuality.high.equals( value ) || ImageSmoothingQuality.low.equals( value ) || ImageSmoothingQuality.medium.equals( value );
    }
  }
}
