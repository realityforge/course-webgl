package elemental3.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = OscillatorType.class
)
public @interface OscillatorType {
  @Nonnull
  String custom = "custom";

  @Nonnull
  String sawtooth = "sawtooth";

  @Nonnull
  String sine = "sine";

  @Nonnull
  String square = "square";

  @Nonnull
  String triangle = "triangle";

  final class Validator {
    private Validator() {
    }

    @OscillatorType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return OscillatorType.custom.equals( value ) || OscillatorType.sawtooth.equals( value ) || OscillatorType.sine.equals( value ) || OscillatorType.square.equals( value ) || OscillatorType.triangle.equals( value );
    }
  }
}
