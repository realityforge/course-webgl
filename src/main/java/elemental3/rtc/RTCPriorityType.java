package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RTCPriorityType.class
)
public @interface RTCPriorityType {
  @Nonnull
  String high = "high";

  @Nonnull
  String low = "low";

  @Nonnull
  String medium = "medium";

  @Nonnull
  String very_low = "very-low";
}
