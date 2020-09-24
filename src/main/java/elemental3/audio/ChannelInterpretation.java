package elemental3.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ChannelInterpretation.class
)
public @interface ChannelInterpretation {
  @Nonnull
  String discrete = "discrete";

  @Nonnull
  String speakers = "speakers";
}
