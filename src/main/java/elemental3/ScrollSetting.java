package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ScrollSetting.class
)
public @interface ScrollSetting {
  @Nonnull
  String none = "";

  @Nonnull
  String up = "up";

  final class Validator {
    private Validator() {
    }

    @ScrollSetting
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ScrollSetting.none.equals( value ) || ScrollSetting.up.equals( value );
    }
  }
}
