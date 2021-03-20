package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PositionAlignSetting.class
)
public @interface PositionAlignSetting {
  @Nonnull
  String auto = "auto";

  @Nonnull
  String center = "center";

  @Nonnull
  String line_left = "line-left";

  @Nonnull
  String line_right = "line-right";

  final class Util {
    private Util() {
    }

    @PositionAlignSetting
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return PositionAlignSetting.auto.equals( value ) || PositionAlignSetting.center.equals( value ) || PositionAlignSetting.line_left.equals( value ) || PositionAlignSetting.line_right.equals( value );
    }
  }
}
