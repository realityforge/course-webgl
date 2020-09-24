package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceTransportPolicy.class
)
public @interface RTCIceTransportPolicy {
  @Nonnull
  String all = "all";

  @Nonnull
  String relay = "relay";
}
