package akasha.xr;

import akasha.EventTarget;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XRSpace interface of the WebXR Device API is an abstract interface providing a common basis for every class which represents a virtual coordinate system within the virtual world, in which its origin corresponds to a physical location. Spatial data in WebXR is always expressed relative to an object based upon one of the descendant interfaces of XRSpace, at the time at which a given XRFrame takes place.The XRSpace interface of the WebXR Device API is an abstract interface providing a common basis for every class which represents a virtual coordinate system within the virtual world, in which its origin corresponds to a physical location.Numeric values such as pose positions are thus coordinates in the corresponding XRSpace, relative to that space's origin.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSpace">XRSpace - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrspace-interface">XRSpace - WebXR Device API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRSpace"
)
public class XRSpace extends EventTarget {
  protected XRSpace() {
  }
}
