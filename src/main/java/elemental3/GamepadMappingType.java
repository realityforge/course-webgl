package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GamepadMappingType.class
)
public @interface GamepadMappingType {
  @Nonnull
  String unknown = "";

  @Nonnull
  String standard = "standard";

  final class Validator {
    private Validator() {
    }

    @GamepadMappingType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GamepadMappingType.unknown.equals( value ) || GamepadMappingType.standard.equals( value );
    }
  }
}
