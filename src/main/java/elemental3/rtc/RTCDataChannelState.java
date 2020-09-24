package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCDataChannelState.class
)
public @interface RTCDataChannelState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String closing = "closing";

  @Nonnull
  String connecting = "connecting";

  @Nonnull
  String open = "open";
}
