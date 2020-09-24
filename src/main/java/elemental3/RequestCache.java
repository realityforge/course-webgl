package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RequestCache.class
)
public @interface RequestCache {
  @Nonnull
  String default_ = "default_";

  @Nonnull
  String force_cache = "force_cache";

  @Nonnull
  String no_cache = "no_cache";

  @Nonnull
  String no_store = "no_store";

  @Nonnull
  String only_if_cached = "only_if_cached";

  @Nonnull
  String reload = "reload";
}
