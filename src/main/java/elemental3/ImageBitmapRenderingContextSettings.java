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
 * Attributes that control the characteristics of the {@link elemental3.ImageBitmapRenderingContext} created.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">ImageBitmapRenderingContextSettings - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface ImageBitmapRenderingContextSettings {
  @JsOverlay
  @Nonnull
  static ImageBitmapRenderingContextSettings create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * A flag that indicates whether the canvas contains an alpha channel. If set to false, the browser now knows that the backdrop is always opaque, which can speed up drawing of transparent content and images.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">ImageBitmapRenderingContextSettings.alpha - MDN</a>
   */
  @JsProperty(
      name = "alpha"
  )
  boolean alpha();

  /**
   * A flag that indicates whether the canvas contains an alpha channel. If set to false, the browser now knows that the backdrop is always opaque, which can speed up drawing of transparent content and images.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">ImageBitmapRenderingContextSettings.alpha - MDN</a>
   */
  @JsProperty
  void setAlpha(boolean alpha);

  /**
   * A flag that indicates whether the canvas contains an alpha channel. If set to false, the browser now knows that the backdrop is always opaque, which can speed up drawing of transparent content and images.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">ImageBitmapRenderingContextSettings.alpha - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default ImageBitmapRenderingContextSettings alpha(final boolean alpha) {
    setAlpha( alpha );
    return this;
  }
}
