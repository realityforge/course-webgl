package akasha.xr;

import akasha.AddEventListenerOptions;
import akasha.EventHandler;
import akasha.EventListener;
import akasha.EventListenerOptions;
import akasha.EventTarget;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The WebXR Device API interface XRSystem provides methods which let you get access to an XRSession object representing a WebXR session. With that XRSession in hand, you can use it to interact with the Augmented Reality (AR) or Virtual Reality (VR) device.The WebXR Device API interface XRSystem provides methods which let you get access to an XRSession object representing a WebXR session. With that XRSession in hand, you can use it to interact with the Augmented Reality (AR) or Virtual Reality (VR) device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSystem">XRSystem - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrsystem-interface">XRSystem - WebXR Device API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRSystem"
)
public class XRSystem extends EventTarget {
  /**
   * The ondevicechange property of the XRSystem interface is passed a devicechange event whenever availability of an immersive device changes. The event that is fired is a &quot;simple event&quot; that implements the Event interface.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSystem/ondevicechange">XRSystem.ondevicechange - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsystem-ondevicechange">ondevicechange  - WebXR Device API</a>
   */
  @Nullable
  public EventHandler ondevicechange;

  protected XRSystem() {
  }

  /**
   * The XRSystem method isSessionSupported() returns a promise which resolves to true if the specified WebXR session mode is supported by the user's WebXR device. Otherwise, the promise resolves with false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSystem/isSessionSupported">XRSystem.isSessionSupported - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsystem-issessionsupported">isSessionSupported() - WebXR Device API</a>
   */
  @Nonnull
  public native Promise<Boolean> isSessionSupported(@XRSessionMode @Nonnull String mode);

  /**
   * The XRSystem interface's requestSession() method returns a promise which resolves to an XRSession object through which you can manage the requested type of WebXR session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSystem/requestSession">XRSystem.requestSession - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsystem-requestsession">requestSession() - WebXR Device API</a>
   */
  @Nonnull
  public native Promise<XRSession> requestSession(@XRSessionMode @Nonnull String mode,
      @Nonnull XRSessionInit options);

  /**
   * The XRSystem interface's requestSession() method returns a promise which resolves to an XRSession object through which you can manage the requested type of WebXR session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSystem/requestSession">XRSystem.requestSession - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsystem-requestsession">requestSession() - WebXR Device API</a>
   */
  @Nonnull
  public native Promise<XRSession> requestSession(@XRSessionMode @Nonnull String mode);

  @JsOverlay
  public final void addDevicechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "devicechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDevicechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "devicechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDevicechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "devicechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDevicechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "devicechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDevicechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "devicechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDevicechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "devicechange", Js.cast( callback ) );
  }
}
