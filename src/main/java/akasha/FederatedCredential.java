package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The FederatedCredential interface of the Credential Management API provides information about credentials from a federated identity provider. A federated identity provider is an entity that a website trusts to correctly authenticate a user, and that provides an API for that purpose. OpenID Connect is an example of a federated identity provider framework.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FederatedCredential">FederatedCredential - MDN</a>
 * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FederatedCredential"
)
public class FederatedCredential extends Credential {
  /**
   * The FederatedCredential constructor creates a new FederatedCredential object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FederatedCredential/FederatedCredential">FederatedCredential.FederatedCredential - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  public FederatedCredential(@Nonnull final FederatedCredentialInit data) {
  }

  @JsProperty(
      name = "iconURL"
  )
  @Nonnull
  public native String iconURL();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  /**
   * The protocol property of the FederatedCredential interface returns a read-only DOMString containing a credential's federated identity protocol. If this property is null, the protocol may be inferred from the FederatedCredential.provider property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FederatedCredential/protocol">FederatedCredential.protocol - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/#dom-federatedcredential-protocol">protocol - Credential Management Level 1</a>
   */
  @JsProperty(
      name = "protocol"
  )
  @Nullable
  public native String protocol();

  /**
   * The provider property of the FederatedCredential interface returns a USVString containing a credential's federated identity provider.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FederatedCredential/provider">FederatedCredential.provider - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsProperty(
      name = "provider"
  )
  @Nonnull
  public native String provider();
}
