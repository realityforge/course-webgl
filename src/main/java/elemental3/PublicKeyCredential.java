package elemental3;

import elemental3.core.ArrayBuffer;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PublicKeyCredential interface provides information about a public key / private key pair, which is a credential for logging in to a service using an un-phishable and data-breach resistant asymmetric key pair instead of a password. It inherits from Credential, and was created by the Web Authentication API extension to the Credential Management API. Other interfaces that inherit from Credential are PasswordCredential and FederatedCredential.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredential">PublicKeyCredential - MDN</a>
 * @see <a href="https://w3c.github.io/webauthn/#iface-pkcredential">PublicKeyCredential interface - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PublicKeyCredential"
)
public class PublicKeyCredential extends Credential {
  protected PublicKeyCredential() {
  }

  /**
   * The rawId read-only property of the PublicKeyCredential interface is an ArrayBuffer object containing the identifier of the credentials.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredential/rawId">PublicKeyCredential.rawId - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredential-rawid">rawId - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "rawId"
  )
  @Nonnull
  public native ArrayBuffer rawId();

  /**
   * The response read-only property of the PublicKeyCredential interface is an AuthenticatorResponse object which is sent from the authenticator to the user agent for the creation/fetching of credentials. The information contained in this response will be used by the relying party's server to verify the demand is legitimate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredential/response">PublicKeyCredential.response - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredential-response">response - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "response"
  )
  @Nonnull
  public native AuthenticatorResponse response();

  /**
   * getClientExtensionResults() is a method of the PublicKeyCredential interface that returns an ArrayBuffer which contains a map between the extensions identifiers and their results after having being processed by the client.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredential/getClientExtensionResults">PublicKeyCredential.getClientExtensionResults - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredential-getclientextensionresults">getClientExtensionResults() - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @Nonnull
  public native AuthenticationExtensionsClientOutputs getClientExtensionResults();

  /**
   * isUserVerifyingPlatformAuthenticatorAvailable() is a static method of the PublicKeyCredential interface that returns a Promise which resolves to true if a user-verifying platform authenticator is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredential/isUserVerifyingPlatformAuthenticatorAvailable">PublicKeyCredential.isUserVerifyingPlatformAuthenticatorAvailable - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredential-isuserverifyingplatformauthenticatoravailable">isUserVerifyingPlatformAuthenticatorAvailable - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @Nonnull
  public static native Promise<Boolean> isUserVerifyingPlatformAuthenticatorAvailable();
}
