package akasha.xr;

import akasha.EventHandler;
import akasha.EventTarget;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API's XRSession interface represents an ongoing XR session, providing methods and properties used to interact with and control the session. To open a WebXR session, use the XRSystem interface's requestSession() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSession">XRSession - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrsession-interface">XRSession - WebXR Device API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRSession"
)
public class XRSession extends EventTarget {
  @Nullable
  public EventHandler onend;

  @Nullable
  public EventHandler oninputsourceschange;

  @Nullable
  public EventHandler onselect;

  @Nullable
  public EventHandler onselectend;

  @Nullable
  public EventHandler onselectstart;

  @Nullable
  public EventHandler onsqueeze;

  @Nullable
  public EventHandler onsqueezeend;

  @Nullable
  public EventHandler onsqueezestart;

  @Nullable
  public EventHandler onvisibilitychange;

  protected XRSession() {
  }

  /**
   * The read-only inputSources property of the XRSession interface returns an XRInputSourceArray object which lists all controllers and input devices which are expressly associated with the XR device and are currently available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSession/inputSources">XRSession.inputSources - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsession-inputsources">XRSession.inputSources - WebXR Device API</a>
   */
  @JsProperty(
      name = "inputSources"
  )
  @Nonnull
  public native XRInputSourceArray inputSources();

  /**
   * The read-only renderState property of an XRSession object indicates the returns a XRRenderState object describing how the user's environment which should be rendered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSession/renderState">XRSession.renderState - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsession-renderstate">XRSession.renderState - WebXR Device API</a>
   */
  @JsProperty(
      name = "renderState"
  )
  @Nonnull
  public native XRRenderState renderState();

  /**
   * The read-only visibilityState property of the XRSession interface is a string indicating whether the WebXR content is currently visible to the user, and if it is, whether it's the primary focus.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSession/visibilityState">XRSession.visibilityState - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsession-visibilitystate">XRSession.visibilityState - WebXR Device API</a>
   */
  @JsProperty(
      name = "visibilityState"
  )
  @Nonnull
  @XRVisibilityState
  public native String visibilityState();

  /**
   * The cancelAnimationFrame() method of the XRSession interface cancels an animation frame which was previously requested by calling requestAnimationFrame.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSession/cancelAnimationFrame">XRSession.cancelAnimationFrame - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsession-cancelanimationframe">XRSession.cancelAnimationFrame - WebXR Device API</a>
   */
  public native void cancelAnimationFrame(int handle);

  /**
   * The end() method shuts down the XRSession on which it's called, returning a promise which resolves once the session has fully shut down.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSession/end">XRSession.end - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsession-end">XRSession.end - WebXR Device API</a>
   */
  @Nonnull
  public native Promise<Void> end();

  /**
   * The XRSession method requestAnimationFrame(), much like the Window method of the same name, schedules a callback to be executed the next time the browser is ready to paint the session's virtual environment to the XR display.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSession/requestAnimationFrame">XRSession.requestAnimationFrame - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsession-requestanimationframe">XRSession.requestAnimationFrame - WebXR Device API</a>
   */
  public native int requestAnimationFrame(@Nonnull XRFrameRequestCallback callback);

  /**
   * The requestReferenceSpace() method of the XRSession interface returns a promise that resolves with an instance of either XRReferenceSpace or XRBoundedReferenceSpace as appropriate given the type of reference space requested.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSession/requestReferenceSpace">XRSession.requestReferenceSpace - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsession-requestreferencespace">requestReferenceSpace() - WebXR Device API</a>
   */
  @Nonnull
  public native Promise<XRReferenceSpace> requestReferenceSpace(
      @XRReferenceSpaceType @Nonnull String type);

  /**
   * The updateRenderState() method of the XRSession interface of WebXR API schedules changes to be applied to the active render state prior to rendering of the next frame.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSession/updateRenderState">XRSession.updateRenderState - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsession-updaterenderstate">XRSession.updateRenderState() - WebXR Device API</a>
   */
  public native void updateRenderState(@Nonnull XRRenderStateInit state);

  /**
   * The updateRenderState() method of the XRSession interface of WebXR API schedules changes to be applied to the active render state prior to rendering of the next frame.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSession/updateRenderState">XRSession.updateRenderState - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsession-updaterenderstate">XRSession.updateRenderState() - WebXR Device API</a>
   */
  public native void updateRenderState();
}
