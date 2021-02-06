package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = VideoResizeModeEnum.class
)
public @interface VideoResizeModeEnum {
  @Nonnull
  String crop_and_scale = "crop-and-scale";

  @Nonnull
  String none = "none";

  final class Validator {
    private Validator() {
    }

    @VideoResizeModeEnum
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return VideoResizeModeEnum.crop_and_scale.equals( value ) || VideoResizeModeEnum.none.equals( value );
    }
  }
}
