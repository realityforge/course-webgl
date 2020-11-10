package elemental3.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * XRPose is a WebXR API interface representing a position and orientation in the 3D space, relative to the XRSpace within which it resides.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPose">XRPose - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrpose-interface">The definition of 'XRPose' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRPose"
)
public class XRPose {
  protected XRPose() {
  }

  /**
   * The emulatedPosition read-only attribute of the XRPose interface is a Boolean value indicating whether or not both the the position component of the pose's transform is directly taken from the XR device, or it's simulated or computed based on other sources.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPose/emulatedPosition">XRPose.emulatedPosition - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpose-emulatedposition">The definition of 'XRPose.emulatedPosition' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "emulatedPosition"
  )
  public native boolean emulatedPosition();

  /**
   * The transform read-only attribute of the XRPose interface is a XRRigidTransform object providing the position and orientation of the pose relative to the base XRSpace as specified when the pose was obtained by calling XRFrame.getPose().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPose/transform">XRPose.transform - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpose-transform">The definition of 'XRPose.transform' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "transform"
  )
  @Nonnull
  public native XRRigidTransform transform();
}
