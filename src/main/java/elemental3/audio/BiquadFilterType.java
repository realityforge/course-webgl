package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
}