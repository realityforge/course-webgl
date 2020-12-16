package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = WebGLPowerPreference.class
)
public @interface WebGLPowerPreference {
  @Nonnull
  String default_ = "default";

  @Nonnull
  String high_performance = "high-performance";

  @Nonnull
  String low_power = "low-power";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return WebGLPowerPreference.default_.equals( value ) || WebGLPowerPreference.high_performance.equals( value ) || WebGLPowerPreference.low_power.equals( value );
    }
  }
}
