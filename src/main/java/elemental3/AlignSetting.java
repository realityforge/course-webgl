package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AlignSetting.class
)
public @interface AlignSetting {
  @Nonnull
  String center = "center";

  @Nonnull
  String end = "end";

  @Nonnull
  String left = "left";

  @Nonnull
  String right = "right";

  @Nonnull
  String start = "start";

  final class Validator {
    private Validator() {
    }

    @AlignSetting
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AlignSetting.center.equals( value ) || AlignSetting.end.equals( value ) || AlignSetting.left.equals( value ) || AlignSetting.right.equals( value ) || AlignSetting.start.equals( value );
    }
  }
}
