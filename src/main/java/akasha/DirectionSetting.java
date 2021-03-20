package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = DirectionSetting.class
)
public @interface DirectionSetting {
  @Nonnull
  String horizontal = "";

  @Nonnull
  String lr = "lr";

  @Nonnull
  String rl = "rl";

  final class Util {
    private Util() {
    }

    @DirectionSetting
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return DirectionSetting.horizontal.equals( value ) || DirectionSetting.lr.equals( value ) || DirectionSetting.rl.equals( value );
    }
  }
}
