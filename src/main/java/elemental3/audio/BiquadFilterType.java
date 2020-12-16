package elemental3.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = BiquadFilterType.class
)
public @interface BiquadFilterType {
  @Nonnull
  String allpass = "allpass";

  @Nonnull
  String bandpass = "bandpass";

  @Nonnull
  String highpass = "highpass";

  @Nonnull
  String highshelf = "highshelf";

  @Nonnull
  String lowpass = "lowpass";

  @Nonnull
  String lowshelf = "lowshelf";

  @Nonnull
  String notch = "notch";

  @Nonnull
  String peaking = "peaking";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return BiquadFilterType.allpass.equals( value ) || BiquadFilterType.bandpass.equals( value ) || BiquadFilterType.highpass.equals( value ) || BiquadFilterType.highshelf.equals( value ) || BiquadFilterType.lowpass.equals( value ) || BiquadFilterType.lowshelf.equals( value ) || BiquadFilterType.notch.equals( value ) || BiquadFilterType.peaking.equals( value );
    }
  }
}
