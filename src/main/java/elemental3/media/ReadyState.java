package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ReadyState.class
)
public @interface ReadyState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String ended = "ended";

  @Nonnull
  String open = "open";
}
