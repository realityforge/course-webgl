package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSS"
)
public final class CSS {
  private CSS() {
  }

  @Nonnull
  public native String escape(@Nonnull String ident);

  public native boolean supports(@Nonnull String conditionText);

  public native boolean supports(@Nonnull String property, @Nonnull String value);
}
