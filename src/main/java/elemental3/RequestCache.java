package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RequestCache.class
)
public @interface RequestCache {
  @Nonnull
  String default_ = "default";

  @Nonnull
  String force_cache = "force-cache";

  @Nonnull
  String no_cache = "no-cache";

  @Nonnull
  String no_store = "no-store";

  @Nonnull
  String only_if_cached = "only-if-cached";

  @Nonnull
  String reload = "reload";
}
