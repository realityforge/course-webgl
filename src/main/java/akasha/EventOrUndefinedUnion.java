package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface EventOrUndefinedUnion {
  @JsOverlay
  @Nonnull
  static EventOrUndefinedUnion of(@Nonnull final Event value) {
    return Js.cast( value );
  }

  @JsOverlay
  static EventOrUndefinedUnion of() {
    return Js.cast( Js.undefined() );
  }
}
