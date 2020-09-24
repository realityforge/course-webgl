package elemental3.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
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
