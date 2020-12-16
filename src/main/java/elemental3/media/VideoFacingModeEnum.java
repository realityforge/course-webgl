package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = VideoFacingModeEnum.class
)
public @interface VideoFacingModeEnum {
  @Nonnull
  String environment = "environment";

  @Nonnull
  String left = "left";

  @Nonnull
  String right = "right";

  @Nonnull
  String user = "user";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return VideoFacingModeEnum.environment.equals( value ) || VideoFacingModeEnum.left.equals( value ) || VideoFacingModeEnum.right.equals( value ) || VideoFacingModeEnum.user.equals( value );
    }
  }
}
