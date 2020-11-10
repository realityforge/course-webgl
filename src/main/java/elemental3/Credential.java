package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Credential interface of the Credential Management API provides information about an entity (usually a user) as a prerequisite to a trust decision.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Credential">Credential - MDN</a>
 * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Credential"
)
public class Credential {
  protected Credential() {
  }

  /**
   * The id property of the Credential interface returns a DOMString containing the credential's identifier. This might be any one of a GUID, username, or email address.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Credential/id">Credential.id - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  /**
   * The type property of the Credential interface returns a DOMString containing the credential's type. Valid values are password, federated and public-key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Credential/type">Credential.type - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();
}
