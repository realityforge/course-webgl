package elemental3;

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
public interface CustomElementConstructorOrUndefinedUnion {
  @JsOverlay
  @Nonnull
  static CustomElementConstructorOrUndefinedUnion of(
      @Nonnull final CustomElementConstructor value) {
    return Js.cast( value );
  }

  @JsOverlay
  static CustomElementConstructorOrUndefinedUnion of() {
    return Js.cast( Js.undefined() );
  }
}
