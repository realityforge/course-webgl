package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PlaybackDirection.class
)
public @interface PlaybackDirection {
  @Nonnull
  String alternate = "alternate";

  @Nonnull
  String alternate_reverse = "alternate-reverse";

  @Nonnull
  String normal = "normal";

  @Nonnull
  String reverse = "reverse";
}
