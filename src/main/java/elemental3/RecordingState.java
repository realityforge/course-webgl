package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
