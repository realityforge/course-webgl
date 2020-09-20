package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RTCIceCandidateType.class
)
public @interface RTCIceCandidateType {
  @Nonnull
  String host = "host";

  @Nonnull
  String prflx = "prflx";

  @Nonnull
  String relay = "relay";

  @Nonnull
  String srflx = "srflx";
}
