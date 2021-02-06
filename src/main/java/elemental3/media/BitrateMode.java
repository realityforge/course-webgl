package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = BitrateMode.class
)
public @interface BitrateMode {
  @Nonnull
  String cbr = "cbr";

  @Nonnull
  String vbr = "vbr";

  final class Validator {
    private Validator() {
    }

    @BitrateMode
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return BitrateMode.cbr.equals( value ) || BitrateMode.vbr.equals( value );
    }
  }
}
