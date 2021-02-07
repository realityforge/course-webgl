package elemental3.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A WebXR Device API XRFrame object is passed into the requestAnimationFrame() callback function and provides access to the information needed in order to render a single frame of animation for an XRSession describing a VR or AR sccene. Events which communicate the tracking state of objects also provide an XRFrame reference as part of their structure.A WebXR Device API XRFrame object is passed into the requestAnimationFrame() callback function and provides access to the information needed in order to render a single frame of animation for an XRSession describing a VR or AR sccene.In addition to providing a reference to the XRSession for which this frame is to be rendered, the getViewerPose() method is provided to obtain the XRViewerPose describing the viewer's position and orientation in space, and getPose() can be used to create an XRPose describing the relative position of one XRSpace relative to another.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRFrame">XRFrame - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrframe-interface">XRFrame - WebXR Device API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRFrame"
)
public class XRFrame {
  protected XRFrame() {
  }

  /**
   * An XRFrame object's read-only session property returns the XRSession object that generated the frame.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRFrame/session">XRFrame.session - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrframe-session">XRFrame.session - WebXR Device API</a>
   */
  @JsProperty(
      name = "session"
  )
  @Nonnull
  public native XRSession session();

  /**
   * The XRFrame method getPose() returns the relative position and orientation&mdash;the pose&mdash;of one XRSpace to that of another space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRFrame/getPose">XRFrame.getPose - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrframe-getpose">XRFrame.getPose() - WebXR Device API</a>
   */
  @Nullable
  public native XRPose getPose(@Nonnull XRSpace space, @Nonnull XRSpace baseSpace);

  /**
   * The getViewerPose() method, a member of the XRFrame interface, returns a XRViewerPose object which describes the viewer's pose (position and orientation) relative to the specified reference space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRFrame/getViewerPose">XRFrame.getViewerPose - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrframe-getviewerpose">XRFrame.getViewerPose() - WebXR Device API</a>
   */
  @Nullable
  public native XRViewerPose getViewerPose(@Nonnull XRReferenceSpace referenceSpace);
}
