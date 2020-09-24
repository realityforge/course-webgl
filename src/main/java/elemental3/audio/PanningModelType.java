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
}
