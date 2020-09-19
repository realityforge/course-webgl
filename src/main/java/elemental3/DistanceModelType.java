package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
