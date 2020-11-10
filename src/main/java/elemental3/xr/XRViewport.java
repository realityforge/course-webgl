package elemental3.xr;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API's XRViewport interface provides properties used to describe the size and position of the current viewport within the XRWebGLLayer being used to render the 3D scene.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRViewport">XRViewport - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrviewport-interface">The definition of 'XRViewport' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRViewport"
)
public class XRViewport {
  protected XRViewport() {
  }

  /**
   * The read-only XRViewport property height specifies the height, in pixels, of the viewport onto the drawing surface within which the WebXR view is to be rendered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRViewport/height">XRViewport.height - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrviewport-height">The definition of 'XRViewport.height' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "height"
  )
  public native int height();

  /**
   * The read-only XRViewport property width specifies the width of the viewport, in pixels, onto the drawing surface the 3D scene is to be rendered into.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRViewport/width">XRViewport.width - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrviewport-width">The definition of 'XRViewport.width' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "width"
  )
  public native int width();

  /**
   * The read-only XRViewport interface's x property indicates the offset from the left edge of the destination surface (typically a XRWebGLLayer to the left edge of the viewport within the surface into which WebXR content is to be rendered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRViewport/x">XRViewport.x - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrviewport-x">The definition of 'XRViewport.x' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "x"
  )
  public native int x();

  /**
   * The read-only XRViewport interface's y property indicates the offset from the bottom edge of the destination surface (typically a XRWebGLLayer to the bottom edge of the viewport within the surface into which WebXR content is to be rendered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRViewport/y">XRViewport.y - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrviewport-y">The definition of 'XRViewport.y' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "y"
  )
  public native int y();
}
