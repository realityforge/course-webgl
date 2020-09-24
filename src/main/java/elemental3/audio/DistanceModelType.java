package elemental3.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = DistanceModelType.class
)
public @interface DistanceModelType {
  @Nonnull
  String exponential = "exponential";

  @Nonnull
  String inverse = "inverse";

  @Nonnull
  String linear = "linear";
}
