package elemental3;

import elemental3.core.Uint8ClampedArray;
import elemental3.gl.TexImageSource;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ImageData interface represents the underlying pixel data of an area of a &lt;canvas&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageData">ImageData - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/canvas.html#imagedata">ImageData - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ImageData"
)
public class ImageData implements TexImageSource {
  /**
   * The ImageData() constructor returns a newly instantiated ImageData object built from the typed array given and having the specified width and height.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageData/ImageData">ImageData.ImageData - MDN</a>
   */
  public ImageData(final int sw, final int sh) {
  }

  /**
   * The ImageData() constructor returns a newly instantiated ImageData object built from the typed array given and having the specified width and height.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageData/ImageData">ImageData.ImageData - MDN</a>
   */
  public ImageData(@Nonnull final Uint8ClampedArray data, final int sw, final int sh) {
  }

  /**
   * The ImageData() constructor returns a newly instantiated ImageData object built from the typed array given and having the specified width and height.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageData/ImageData">ImageData.ImageData - MDN</a>
   */
  public ImageData(@Nonnull final Uint8ClampedArray data, final int sw) {
  }

  /**
   * The readonly ImageData.data property returns a Uint8ClampedArray that contains the ImageData object's pixel data. Data is stored as a one-dimensional array in the RGBA order, with integer values between 0 and 255 (inclusive).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageData/data">ImageData.data - MDN</a>
   */
  @JsProperty(
      name = "data"
  )
  @Nonnull
  public native Uint8ClampedArray data();

  /**
   * The readonly ImageData.height property returns the number of rows in the ImageData object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageData/height">ImageData.height - MDN</a>
   */
  @JsProperty(
      name = "height"
  )
  public native int height();

  /**
   * The readonly ImageData.width property returns the number of pixels per row in the ImageData object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageData/width">ImageData.width - MDN</a>
   */
  @JsProperty(
      name = "width"
  )
  public native int width();
}
