package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceGathererState.class
)
public @interface RTCIceGathererState {
  @Nonnull
  String complete = "complete";

  @Nonnull
  String gathering = "gathering";

  @Nonnull
  String new_ = "new_";
}
