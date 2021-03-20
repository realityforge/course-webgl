package akasha;

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

  final class Util {
    private Util() {
    }

    @RequestCache
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RequestCache.default_.equals( value ) || RequestCache.force_cache.equals( value ) || RequestCache.no_cache.equals( value ) || RequestCache.no_store.equals( value ) || RequestCache.only_if_cached.equals( value ) || RequestCache.reload.equals( value );
    }
  }
}
