package elemental3;

import elemental2.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The OffscreenCanvas interface provides a canvas that can be rendered off screen. It is available in both the window and worker contexts.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas">OffscreenCanvas - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OffscreenCanvas"
)
public class OffscreenCanvas extends EventTarget {
  /**
   * The height property returns and sets the height of an OffscreenCanvas object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/height">OffscreenCanvas.height - MDN</a>
   */
  public int height;

  /**
   * The width property returns and sets the width of an OffscreenCanvas object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/width">OffscreenCanvas.width - MDN</a>
   */
  public int width;

  /**
   * The OffscreenCanvas() constructor returns a newly instantiated OffscreenCanvas object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/OffscreenCanvas">OffscreenCanvas.OffscreenCanvas - MDN</a>
   */
  public OffscreenCanvas(final int width, final int height) {
  }

  @Nonnull
  public native Promise<Blob> convertToBlob(@Nonnull ImageEncodeOptions options);

  @Nonnull
  public native Promise<Blob> convertToBlob();

  /**
   * The OffscreenCanvas.getContext() method returns a drawing context for an offscreen canvas, or null if the context identifier is not supported.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext">OffscreenCanvas.getContext - MDN</a>
   */
  @Nullable
  public native OffscreenRenderingContext getContext(
      @MagicConstant(valuesFromClass = OffscreenRenderingContextId.class) @Nonnull String contextId,
      @Nullable Any options);

  /**
   * The OffscreenCanvas.getContext() method returns a drawing context for an offscreen canvas, or null if the context identifier is not supported.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext">OffscreenCanvas.getContext - MDN</a>
   */
  @Nullable
  public native OffscreenRenderingContext getContext(
      @MagicConstant(valuesFromClass = OffscreenRenderingContextId.class) @Nonnull String contextId,
      @DoNotAutobox @Nullable Object options);

  /**
   * The OffscreenCanvas.getContext() method returns a drawing context for an offscreen canvas, or null if the context identifier is not supported.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas/getContext">OffscreenCanvas.getContext - MDN</a>
   */
  @Nullable
  public native OffscreenRenderingContext getContext(
      @MagicConstant(valuesFromClass = OffscreenRenderingContextId.class) @Nonnull String contextId);

  @Nonnull
  public native ImageBitmap transferToImageBitmap();
}
