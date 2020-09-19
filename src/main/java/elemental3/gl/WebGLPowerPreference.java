package elemental3.gl;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
}
