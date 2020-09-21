package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = PanningModelType.class
)
public @interface PanningModelType {
  @Nonnull
  String HRTF = "HRTF";

  @Nonnull
  String equalpower = "equalpower";
}
