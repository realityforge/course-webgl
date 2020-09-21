package elemental3.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
