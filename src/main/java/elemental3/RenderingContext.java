package elemental3;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLRenderingContext;
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
public interface RenderingContext {
  @JsOverlay
  @Nonnull
  static RenderingContext of(@Nonnull final CanvasRenderingContext2D value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static RenderingContext of(@Nonnull final ImageBitmapRenderingContext value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static RenderingContext of(@Nonnull final WebGLRenderingContext value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static RenderingContext of(@Nonnull final WebGL2RenderingContext value) {
    return Js.cast( value );
  }
}
