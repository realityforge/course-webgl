package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
}
