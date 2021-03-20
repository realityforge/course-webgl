package akasha.xr;

import akasha.gl.WebGL2RenderingContext;
import akasha.gl.WebGLFramebuffer;
import akasha.gl.WebGLRenderingContext;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRWebGLLayer interface of the WebXR Device API provides a linkage between the WebXR device (or simulated XR device, in the case of an inline session) and a WebGL context used to render the scene for display on the device. In particular, it provides access to the WebGL framebuffer and viewport to ease access to the context.The XRWebGLLayer interface of the WebXR Device API provides a linkage between the WebXR device (or simulated XR device, in the case of an inline session) and a WebGL context used to render the scene for display on the device.Although XRWebGLLayer is currently the only type of framebuffer layer supported by WebGL, it's entirely possible that future updates to the WebXR specification may allow for other layer types and corresponding image sources.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer">XRWebGLLayer - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrwebgllayer-interface">XRWebGLLayer - WebXR Device API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRWebGLLayer"
)
public class XRWebGLLayer extends XRLayer {
  /**
   * The WebXR Device API XRWebGLLayer() constructor creates and returns a new XRWebGLLayer object, providing the linkage between the WebXR device and the WebGL graphics layer used to render the 3D scene.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/XRWebGLLayer">XRWebGLLayer.XRWebGLLayer - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-xrwebgllayer">XRWebGLLayer() - WebXR Device API</a>
   */
  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final XRWebGLRenderingContext context, @Nonnull final XRWebGLLayerInit layerInit) {
  }

  /**
   * The WebXR Device API XRWebGLLayer() constructor creates and returns a new XRWebGLLayer object, providing the linkage between the WebXR device and the WebGL graphics layer used to render the 3D scene.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/XRWebGLLayer">XRWebGLLayer.XRWebGLLayer - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-xrwebgllayer">XRWebGLLayer() - WebXR Device API</a>
   */
  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final WebGLRenderingContext context, @Nonnull final XRWebGLLayerInit layerInit) {
  }

  /**
   * The WebXR Device API XRWebGLLayer() constructor creates and returns a new XRWebGLLayer object, providing the linkage between the WebXR device and the WebGL graphics layer used to render the 3D scene.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/XRWebGLLayer">XRWebGLLayer.XRWebGLLayer - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-xrwebgllayer">XRWebGLLayer() - WebXR Device API</a>
   */
  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final WebGL2RenderingContext context, @Nonnull final XRWebGLLayerInit layerInit) {
  }

  /**
   * The WebXR Device API XRWebGLLayer() constructor creates and returns a new XRWebGLLayer object, providing the linkage between the WebXR device and the WebGL graphics layer used to render the 3D scene.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/XRWebGLLayer">XRWebGLLayer.XRWebGLLayer - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-xrwebgllayer">XRWebGLLayer() - WebXR Device API</a>
   */
  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final XRWebGLRenderingContext context) {
  }

  /**
   * The WebXR Device API XRWebGLLayer() constructor creates and returns a new XRWebGLLayer object, providing the linkage between the WebXR device and the WebGL graphics layer used to render the 3D scene.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/XRWebGLLayer">XRWebGLLayer.XRWebGLLayer - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-xrwebgllayer">XRWebGLLayer() - WebXR Device API</a>
   */
  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final WebGLRenderingContext context) {
  }

  /**
   * The WebXR Device API XRWebGLLayer() constructor creates and returns a new XRWebGLLayer object, providing the linkage between the WebXR device and the WebGL graphics layer used to render the 3D scene.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/XRWebGLLayer">XRWebGLLayer.XRWebGLLayer - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-xrwebgllayer">XRWebGLLayer() - WebXR Device API</a>
   */
  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final WebGL2RenderingContext context) {
  }

  /**
   * The read-only XRWebGLLayer property antialias is a Boolean value which is true if the rendering layer's frame buffer supports antialiasing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/antialias">XRWebGLLayer.antialias - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-antialias">XRWebGLLayer.antialias - WebXR Device API</a>
   */
  @JsProperty(
      name = "antialias"
  )
  public native boolean antialias();

  /**
   * The read-only XRWebGLLayer property framebuffer is an opaque WebGLFramebuffer which is used to buffer the rendered image if the XR compositor is being used. Otherwise, this property's value is null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/framebuffer">XRWebGLLayer.framebuffer - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-framebuffer">XRWebGLLayer.framebuffer - WebXR Device API</a>
   */
  @JsProperty(
      name = "framebuffer"
  )
  @Nullable
  public native WebGLFramebuffer framebuffer();

  /**
   * The read-only XRWebGLLayer property framebufferHeight indicates the height of the framebuffer, in pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/framebufferHeight">XRWebGLLayer.framebufferHeight - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-framebufferheight">XRWebGLLayer.framebufferHeight - WebXR Device API</a>
   */
  @JsProperty(
      name = "framebufferHeight"
  )
  public native int framebufferHeight();

  /**
   * The read-only XRWebGLLayer property framebufferWidth specifies the width of the framebuffer, in pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/framebufferWidth">XRWebGLLayer.framebufferWidth - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-framebufferwidth">XRWebGLLayer.framebufferWidth - WebXR Device API</a>
   */
  @JsProperty(
      name = "framebufferWidth"
  )
  public native int framebufferWidth();

  /**
   * The read-only XRWebGLLayer property ignoreDepthValues is a Boolean value which is true if the session has been configured to ignore the values in the depth buffer while rendering the scene. If the depth buffer is being used to determine the position of vertices, this property is false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/ignoreDepthValues">XRWebGLLayer.ignoreDepthValues - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-ignoredepthvalues">XRWebGLLayer.ignoreDepthValues - WebXR Device API</a>
   */
  @JsProperty(
      name = "ignoreDepthValues"
  )
  public native boolean ignoreDepthValues();

  /**
   * The static method XRWebGLLayer.getNativeFramebufferScaleFactor() returns a floating-point scaling factor by which one can multiply the specified XRSession's resolution to get the native resolution of the WebXR device's frame buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/getNativeFramebufferScaleFactor">XRWebGLLayer.getNativeFramebufferScaleFactor - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-getnativeframebufferscalefactor">static XRWebGLLayer.getNativeFramebufferScaleFactor() - WebXR Device API</a>
   */
  public static native double getNativeFramebufferScaleFactor(@Nonnull XRSession session);

  /**
   * The XRWebGLLayer interface's getViewport() method returns the XRViewport that should be used to render the specified XRView into the WebGL layer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayer/getViewport">XRWebGLLayer.getViewport - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayer-getviewport">XRWebGLLayer.getViewport() - WebXR Device API</a>
   */
  @Nullable
  public native XRViewport getViewport(@Nonnull XRView view);
}
