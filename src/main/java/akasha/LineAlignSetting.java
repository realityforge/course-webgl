package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = LineAlignSetting.class
)
public @interface LineAlignSetting {
  @Nonnull
  String center = "center";

  @Nonnull
  String end = "end";

  @Nonnull
  String start = "start";

  final class Util {
    private Util() {
    }

    @LineAlignSetting
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return LineAlignSetting.center.equals( value ) || LineAlignSetting.end.equals( value ) || LineAlignSetting.start.equals( value );
    }
  }
}
