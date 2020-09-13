package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface MultiCacheQueryOptions extends CacheQueryOptions {
  @JsOverlay
  @Nonnull
  static MultiCacheQueryOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "cacheName"
  )
  String cacheName();

  @JsProperty
  void setCacheName(@Nonnull String cacheName);

  @JsOverlay
  @Nonnull
  default MultiCacheQueryOptions cacheName(@Nonnull final String cacheName) {
    setCacheName( cacheName );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MultiCacheQueryOptions ignoreMethod(final boolean ignoreMethod) {
    setIgnoreMethod( ignoreMethod );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MultiCacheQueryOptions ignoreSearch(final boolean ignoreSearch) {
    setIgnoreSearch( ignoreSearch );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MultiCacheQueryOptions ignoreVary(final boolean ignoreVary) {
    setIgnoreVary( ignoreVary );
    return this;
  }
}
