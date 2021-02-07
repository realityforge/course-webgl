package elemental3;

import elemental3.gl.TexImageSource;
import elemental3.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The OffscreenCanvas interface provides a canvas that can be rendered off screen. It is available in both the window and worker contexts.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas">OffscreenCanvas - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#the-offscreencanvas-interface">OffscreenCanvas - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OffscreenCanvas"
)
public class OffscreenCanvas extends EventTarget implements TexImageSource, Transferable {
  /**
   * The height property returns and sets the height of an OffscreenCanvas object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/height">OffscreenCanvas.height - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-offscreencanvas-height">OffscreenCanvas.height - HTML Living Standard</a>
   */
  public int height;

  /**
   * The width property returns and sets the width of an OffscreenCanvas object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/width">OffscreenCanvas.width - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-offscreencanvas-width">OffscreenCanvas.width - HTML Living Standard</a>
   */
  public int width;

  /**
   * The OffscreenCanvas() constructor returns a newly instantiated OffscreenCanvas object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/OffscreenCanvas">OffscreenCanvas.OffscreenCanvas - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-offscreencanvas">OffscreenCanvas() - HTML Living Standard</a>
   */
  public OffscreenCanvas(final int width, final int height) {
  }

  /**
   * The OffscreenCanvas.convertToBlob()method creates a Blob object representing the image contained in the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/convertToBlob">OffscreenCanvas.convertToBlob - MDN</a>
   */
  @Nonnull
  public native Promise<Blob> convertToBlob(@Nonnull ImageEncodeOptions options);

  /**
   * The OffscreenCanvas.convertToBlob()method creates a Blob object representing the image contained in the canvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/convertToBlob">OffscreenCanvas.convertToBlob - MDN</a>
   */
  @Nonnull
  public native Promise<Blob> convertToBlob();

  /**
   * The OffscreenCanvas.getContext() method returns a drawing context for an offscreen canvas, or null if the context identifier is not supported.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext">OffscreenCanvas.getContext - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-offscreencanvas-getcontext">OffscreenCanvas.getContext() - HTML Living Standard</a>
   */
  @Nullable
  public native OffscreenRenderingContext getContext(
      @OffscreenRenderingContextId @Nonnull String contextId,
      @DoNotAutobox @Nullable Object options);

  /**
   * The OffscreenCanvas.getContext() method returns a drawing context for an offscreen canvas, or null if the context identifier is not supported.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext">OffscreenCanvas.getContext - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-offscreencanvas-getcontext">OffscreenCanvas.getContext() - HTML Living Standard</a>
   */
  @Nullable
  public native OffscreenRenderingContext getContext(
      @OffscreenRenderingContextId @Nonnull String contextId);

  /**
   * The OffscreenCanvas.transferToImageBitmap() method creates an ImageBitmap object from the most recently rendered image of the OffscreenCanvas.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/transferToImageBitmap">OffscreenCanvas.transferToImageBitmap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-offscreencanvas-transfertoimagebitmap">OffscreenCanvas.transferToImageBitmap() - HTML Living Standard</a>
   */
  @Nonnull
  public native ImageBitmap transferToImageBitmap();
}
