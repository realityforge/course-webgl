package elemental3;

import elemental3.svg.SVGScriptElement;
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
public interface HTMLOrSVGScriptElement {
  @JsOverlay
  @Nonnull
  static HTMLOrSVGScriptElement of(@Nonnull final HTMLScriptElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static HTMLOrSVGScriptElement of(@Nonnull final SVGScriptElement value) {
    return Js.cast( value );
  }
}
