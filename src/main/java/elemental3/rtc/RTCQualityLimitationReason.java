package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RTCQualityLimitationReason.class
)
public @interface RTCQualityLimitationReason {
  @Nonnull
  String bandwidth = "bandwidth";

  @Nonnull
  String cpu = "cpu";

  @Nonnull
  String none = "none";

  @Nonnull
  String other = "other";
}
