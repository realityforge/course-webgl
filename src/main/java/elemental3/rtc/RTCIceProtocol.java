package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RTCIceProtocol.class
)
public @interface RTCIceProtocol {
  @Nonnull
  String tcp = "tcp";

  @Nonnull
  String udp = "udp";
}
