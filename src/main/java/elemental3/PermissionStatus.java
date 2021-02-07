package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PermissionStatus interface of the Permissions API provides the state of an object and an event handler for monitoring changes to said state.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PermissionStatus">PermissionStatus - MDN</a>
 * @see <a href="https://w3c.github.io/permissions/#status-of-a-permission">PermissionStatus - Permissions</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PermissionStatus"
)
public class PermissionStatus extends EventTarget {
  /**
   * The onchange event handler of the PermissionStatus interface is called whenever the PermissionStatus.state property changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PermissionStatus/onchange">PermissionStatus.onchange - MDN</a>
   */
  @Nullable
  public EventHandler onchange;

  protected PermissionStatus() {
  }

  /**
   * The state read-only property of the PermissionStatus interface returns the state of a requested permission. This property returns one of 'granted', 'denied', or 'prompt'.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PermissionStatus/state">PermissionStatus.state - MDN</a>
   */
  @JsProperty(
      name = "state"
  )
  @Nonnull
  @PermissionState
  public native String state();
}
