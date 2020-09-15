package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLAllCollection"
)
public class HTMLAllCollection {
  HTMLAllCollection() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native HTMLCollectionOrElementUnion item(@Nonnull String nameOrIndex);

  @Nullable
  public native HTMLCollectionOrElementUnion item();

  @Nullable
  public native HTMLCollectionOrElementUnion namedItem(@Nonnull String name);
}