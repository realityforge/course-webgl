package elemental3.xr;

import elemental3.DOMPointReadOnly;
import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API's XRBoundedReferenceSpace interface describes a virtual world reference space which has preset boundaries. This extends XRReferenceSpace, which describes an essentially unrestricted space around the viewer's position.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRBoundedReferenceSpace">XRBoundedReferenceSpace - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrboundedreferencespace-interface">The definition of 'XRBoundedReferenceSpace' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRBoundedReferenceSpace"
)
public class XRBoundedReferenceSpace extends XRReferenceSpace {
  protected XRBoundedReferenceSpace() {
  }

  /**
   * The read-only XRBoundedReferenceSpace property boundsGeometry is an array of DOMPointReadOnly objects which specifies the points making up a polygon inside which the viewer is allowed to move.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRBoundedReferenceSpace/boundsGeometry">XRBoundedReferenceSpace.boundsGeometry - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrboundedreferencespace-boundsgeometry">The definition of 'boundsGeometry' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "boundsGeometry"
  )
  @Nonnull
  public native JsArray<DOMPointReadOnly> boundsGeometry();
}
