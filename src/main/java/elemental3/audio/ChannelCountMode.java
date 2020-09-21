package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = ChannelCountMode.class
)
public @interface ChannelCountMode {
  @Nonnull
  String clamped_max = "clamped-max";

  @Nonnull
  String explicit = "explicit";

  @Nonnull
  String max = "max";
}
