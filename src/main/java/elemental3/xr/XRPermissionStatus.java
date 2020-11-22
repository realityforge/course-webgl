package elemental3.xr;

import elemental3.PermissionStatus;
import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The XRPermissionStatus interface defines the object returned by calling navigator.permissions.query() for the xr permission name; it indicates whether or not the app or site has permission to use WebXR, an may be monitored over time for changes to that permissions tate.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionStatus">XRPermissionStatus - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrpermissionstatus">The definition of 'XRPermissionStatus' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRPermissionStatus"
)
public class XRPermissionStatus extends PermissionStatus {
  /**
   * The WebXR Device API's XRPermissionStatus interface's granted property is an array of strings, each identifying one of the WebXR features for which permission has been granted as of the time at which the Permission API's navigator.permissions.query() method was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionStatus/granted">XRPermissionStatus.granted - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissionstatus-granted">The definition of 'XRPermissionStatus.granted' in the 'WebXR Device API' specification.</a>
   */
  @Nonnull
  public JsArray<Any> granted;

  protected XRPermissionStatus() {
  }
}
