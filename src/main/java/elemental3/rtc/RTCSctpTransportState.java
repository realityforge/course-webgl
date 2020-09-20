package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RTCSctpTransportState.class
)
public @interface RTCSctpTransportState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String connected = "connected";

  @Nonnull
  String connecting = "connecting";
}
