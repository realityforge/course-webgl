package elemental3.xr;

import elemental3.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API's XRView interface provides information describing a single view into the XR scene for a specific frame, providing orientation and position information for the viewpoint.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRView">XRView - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrview-interface">The definition of 'XRView' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRView"
)
public class XRView {
  protected XRView() {
  }

  /**
   * The XRView interface's read-only eye property is a string taken from the XREye enumerated type, indicating which eye's viewpoint the XRView represents: left or right. For views which represent neither eye, such as monoscopic views, this property's value is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRView/eye">XRView.eye - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrview-eye">The definition of 'XRView.eye' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "eye"
  )
  @Nonnull
  @XREye
  public native String eye();

  /**
   * The XRView interface's read-only projectionMatrix property specifies the projection matrix to apply to the underlying view. This should be used to integrate perspective to everything in the scene, in order to ensure the result is consistent with what the eye expects to see.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRView/projectionMatrix">XRView.projectionMatrix - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrview-projectionmatrix">The definition of 'XRView.projectionMatrix' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "projectionMatrix"
  )
  @Nonnull
  public native Float32Array projectionMatrix();

  /**
   * The read-only transform property of the XRView interface is an XRRigidTransform object which provides the position and orientation of the viewpoint relative to the XRReferenceSpace specified when the XRFrame.getViewerPose() method was called to obtain the view object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRView/transform">XRView.transform - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrview-transform">The definition of 'XRView.transform' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "transform"
  )
  @Nonnull
  public native XRRigidTransform transform();
}
