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
  String default_ = "default_";

  @Nonnull
  String high_performance = "high_performance";

  @Nonnull
  String low_power = "low_power";
}
