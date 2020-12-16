package elemental3;

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

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return PositionAlignSetting.auto.equals( value ) || PositionAlignSetting.center.equals( value ) || PositionAlignSetting.line_left.equals( value ) || PositionAlignSetting.line_right.equals( value );
    }
  }
}
