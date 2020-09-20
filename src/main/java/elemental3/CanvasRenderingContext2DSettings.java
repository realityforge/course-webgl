package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * Attributes that control the characteristics of the {@link elemental3.gl.WebGLRenderingContext} created. This should only be supplied when creating a {@link elemental3.gl.WebGLRenderingContext} context.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">CanvasRenderingContext2DSettings - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface CanvasRenderingContext2DSettings {
  @JsOverlay
  @Nonnull
  static CanvasRenderingContext2DSettings create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * A flag that indicates whether the canvas contains an alpha channel. If set to false, the browser now knows that the backdrop is always opaque, which can speed up drawing of transparent content and images.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">CanvasRenderingContext2DSettings.alpha - MDN</a>
   */
  @JsProperty(
      name = "alpha"
  )
  boolean alpha();

  /**
   * A flag that indicates whether the canvas contains an alpha channel. If set to false, the browser now knows that the backdrop is always opaque, which can speed up drawing of transparent content and images.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">CanvasRenderingContext2DSettings.alpha - MDN</a>
   */
  @JsProperty
  void setAlpha(boolean alpha);

  /**
   * A flag that indicates whether the canvas contains an alpha channel. If set to false, the browser now knows that the backdrop is always opaque, which can speed up drawing of transparent content and images.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">CanvasRenderingContext2DSettings.alpha - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default CanvasRenderingContext2DSettings alpha(final boolean alpha) {
    setAlpha( alpha );
    return this;
  }

  /**
   * A flag that provides a hint to the user agent to reduce the latency by desynchronizing the canvas paint cycle from the event loop.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">CanvasRenderingContext2DSettings.desynchronized - MDN</a>
   */
  @JsProperty(
      name = "desynchronized"
  )
  boolean desynchronized();

  /**
   * A flag that provides a hint to the user agent to reduce the latency by desynchronizing the canvas paint cycle from the event loop.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">CanvasRenderingContext2DSettings.desynchronized - MDN</a>
   */
  @JsProperty
  void setDesynchronized(boolean desynchronized);

  /**
   * A flag that provides a hint to the user agent to reduce the latency by desynchronizing the canvas paint cycle from the event loop.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">CanvasRenderingContext2DSettings.desynchronized - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default CanvasRenderingContext2DSettings desynchronized(final boolean desynchronized) {
    setDesynchronized( desynchronized );
    return this;
  }
}
