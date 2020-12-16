package elemental3;

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

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return LineAlignSetting.center.equals( value ) || LineAlignSetting.end.equals( value ) || LineAlignSetting.start.equals( value );
    }
  }
}
