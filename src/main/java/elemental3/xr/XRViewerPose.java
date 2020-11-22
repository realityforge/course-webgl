package elemental3.xr;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API interface XRViewerPose represents the pose (the position and orientation) of a viewer's point of view on the scene. Each XRViewerPose can have multiple views to represent, for example, the slight separation between the left and right eye.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRViewerPose">XRViewerPose - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrviewerpose-interface">The definition of 'XRViewerPose' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRViewerPose"
)
public class XRViewerPose extends XRPose {
  protected XRViewerPose() {
  }

  /**
   * The read-only XRViewerPose property views returns an array which contains every XRView which must be rendered in order to fully represent the scene from the viewpoint defined by the viewer pose. For monoscopic devices, this array contains a single view.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRViewerPose/views">XRViewerPose.views - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrviewerpose-views">The definition of 'XRViewerPose.views' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "views"
  )
  @Nonnull
  public native JsArray<XRView> views();
}
