package elemental3;

import elemental3.gl.TexImageSource;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ImageBitmap interface represents a bitmap image which can be drawn to a &lt;canvas&gt; without undue latency. It can be created from a variety of source objects using the createImageBitmap() factory method. ImageBitmap provides an asynchronous and resource efficient pathway to prepare textures for rendering in WebGL.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap">ImageBitmap - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#imagebitmap">ImageBitmap - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ImageBitmap"
)
public class ImageBitmap implements TexImageSource, Transferable {
  protected ImageBitmap() {
  }

  /**
   * The read-only ImageBitmap.height property returns the ImageBitmap object's height in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap/height">ImageBitmap.height - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-imagebitmap-height">ImageBitmap.height - HTML Living Standard</a>
   */
  @JsProperty(
      name = "height"
  )
  public native int height();

  /**
   * The read-only ImageBitmap.width property returns the ImageBitmap object's width in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap/width">ImageBitmap.width - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-imagebitmap-width">ImageBitmap.height - HTML Living Standard</a>
   */
  @JsProperty(
      name = "width"
  )
  public native int width();

  /**
   * The ImageBitmap.close() method disposes of all graphical resources associated with an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap/close">ImageBitmap.close - MDN</a>
   */
  public native void close();
}
