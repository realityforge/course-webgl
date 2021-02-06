package elemental3.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PanningModelType.class
)
public @interface PanningModelType {
  @Nonnull
  String HRTF = "HRTF";

  @Nonnull
  String equalpower = "equalpower";

  final class Validator {
    private Validator() {
    }

    @PanningModelType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return PanningModelType.HRTF.equals( value ) || PanningModelType.equalpower.equals( value );
    }
  }
}
