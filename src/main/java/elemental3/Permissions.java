package elemental3;

import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Permissions interface of the Permissions API provides the core Permission API functionality, such as methods for querying and revoking permissions
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Permissions">Permissions - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Permissions"
)
public class Permissions {
  protected Permissions() {
  }

  /**
   * The Permissions.query() method of the Permissions interface returns the state of a user permission on the global scope.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Permissions/query">Permissions.query - MDN</a>
   */
  @Nonnull
  public native Promise<PermissionStatus> query(@Nonnull Object permissionDesc);
}
