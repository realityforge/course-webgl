package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RTCIceRole.class
)
public @interface RTCIceRole {
  @Nonnull
  String controlled = "controlled";

  @Nonnull
  String controlling = "controlling";

  @Nonnull
  String unknown = "unknown";
}
