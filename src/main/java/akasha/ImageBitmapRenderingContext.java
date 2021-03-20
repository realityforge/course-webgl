package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ImageBitmapRenderingContext interface is a canvas rendering context that provides the functionality to replace the canvas's contents with the given ImageBitmap. Its context id (the first argument to HTMLCanvasElement.getContext() or OffscreenCanvas.getContext()) is &quot;bitmaprenderer&quot;.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmapRenderingContext">ImageBitmapRenderingContext - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/canvas.html#the-imagebitmaprenderingcontext-interface">ImageBitmapRenderingContext - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ImageBitmapRenderingContext"
)
public class ImageBitmapRenderingContext implements RenderingContext {
  protected ImageBitmapRenderingContext() {
  }

  @JsProperty(
      name = "canvas"
  )
  @Nonnull
  public native HTMLCanvasElementOrOffscreenCanvasUnion canvas();

  /**
   * The ImageBitmapRenderingContext.transferFromImageBitmap() method displays the given ImageBitmap in the canvas associated with this rendering context. The ownership of the ImageBitmap is transferred to the canvas as well.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmapRenderingContext/transferFromImageBitmap">ImageBitmapRenderingContext.transferFromImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-imagebitmaprenderingcontext-transferfromimagebitmap">transferFromImageBitmap() - HTML Living Standard</a>
   */
  public native void transferFromImageBitmap(@Nullable ImageBitmap bitmap);
}
