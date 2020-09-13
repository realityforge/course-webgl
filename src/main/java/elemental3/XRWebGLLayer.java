package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRWebGLLayer interface of the WebXR Device API provides a linkage between the WebXR device (or simulated XR device, in the case of an inline session) and a WebGL context used to render the scene for display on the device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer">XRWebGLLayer - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRWebGLLayer"
)
public class XRWebGLLayer {
  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final XRWebGLRenderingContext context, @Nonnull final XRWebGLLayerInit layerInit) {
  }

  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final WebGLRenderingContext context, @Nonnull final XRWebGLLayerInit layerInit) {
  }

  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final WebGL2RenderingContext context, @Nonnull final XRWebGLLayerInit layerInit) {
  }

  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final XRWebGLRenderingContext context) {
  }

  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final WebGLRenderingContext context) {
  }

  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final WebGL2RenderingContext context) {
  }

  /**
   * The read-only XRWebGLLayer property antialias is a Boolean value which is true if the rendering layer's frame buffer supports antialiasing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/antialias">XRWebGLLayer.antialias - MDN</a>
   */
  @JsProperty(
      name = "antialias"
  )
  public native boolean antialias();

  /**
   * The read-only XRWebGLLayer property framebuffer is an opaque WebGLFramebuffer which is used to buffer the rendered image if the XR compositor is being used. Otherwise, this property's value is null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/framebuffer">XRWebGLLayer.framebuffer - MDN</a>
   */
  @JsProperty(
      name = "framebuffer"
  )
  @Nonnull
  public native WebGLFramebuffer framebuffer();

  /**
   * The read-only XRWebGLLayer property framebufferHeight indicates the height of the framebuffer, in pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/framebufferHeight">XRWebGLLayer.framebufferHeight - MDN</a>
   */
  @JsProperty(
      name = "framebufferHeight"
  )
  public native int framebufferHeight();

  /**
   * The read-only XRWebGLLayer property framebufferWidth specifies the width of the framebuffer, in pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/framebufferWidth">XRWebGLLayer.framebufferWidth - MDN</a>
   */
  @JsProperty(
      name = "framebufferWidth"
  )
  public native int framebufferWidth();

  /**
   * The read-only XRWebGLLayer property ignoreDepthValues is a Boolean value which is true if the session has been configured to ignore the values in the depth buffer while rendering the scene. If the depth buffer is being used to determine the position of vertices, this property is false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/ignoreDepthValues">XRWebGLLayer.ignoreDepthValues - MDN</a>
   */
  @JsProperty(
      name = "ignoreDepthValues"
  )
  public native boolean ignoreDepthValues();

  /**
   * The static method XRWebGLLayer.getNativeFramebufferScaleFactor() returns a floating-point scaling factor by which one can multiply the specified XRSession's resolution to get the native resolution of the WebXR device's frame buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/getNativeFramebufferScaleFactor">XRWebGLLayer.getNativeFramebufferScaleFactor - MDN</a>
   */
  public static native double getNativeFramebufferScaleFactor(@Nonnull XRSession session);

  /**
   * The XRWebGLLayer interface's getViewport() method returns the XRViewport that should be used to render the specified XRView into the WebGL layer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/getViewport">XRWebGLLayer.getViewport - MDN</a>
   */
  @Nullable
  public native XRViewport getViewport(@Nonnull XRView view);
}
