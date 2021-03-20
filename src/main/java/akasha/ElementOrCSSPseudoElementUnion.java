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
public interface ElementOrCSSPseudoElementUnion {
  @JsOverlay
  @Nonnull
  static ElementOrCSSPseudoElementUnion of(@Nonnull final Element value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ElementOrCSSPseudoElementUnion of(@Nonnull final CSSPseudoElement value) {
    return Js.cast( value );
  }
}
