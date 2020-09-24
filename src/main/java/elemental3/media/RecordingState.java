package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RecordingState.class
)
public @interface RecordingState {
  @Nonnull
  String inactive = "inactive";

  @Nonnull
  String paused = "paused";

  @Nonnull
  String recording = "recording";
}
