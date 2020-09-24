package elemental3.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AudioContextLatencyCategory.class
)
public @interface AudioContextLatencyCategory {
  @Nonnull
  String balanced = "balanced";

  @Nonnull
  String interactive = "interactive";

  @Nonnull
  String playback = "playback";
}
