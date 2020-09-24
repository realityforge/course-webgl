package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceConnectionState.class
)
public @interface RTCIceConnectionState {
  @Nonnull
  String checking = "checking";

  @Nonnull
  String closed = "closed";

  @Nonnull
  String completed = "completed";

  @Nonnull
  String connected = "connected";

  @Nonnull
  String disconnected = "disconnected";

  @Nonnull
  String failed = "failed";

  @Nonnull
  String new_ = "new";
}
