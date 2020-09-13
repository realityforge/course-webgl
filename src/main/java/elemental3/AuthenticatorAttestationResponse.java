package elemental3;

import elemental2.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AuthenticatorAttestationResponse interface of the Web Authentication API is returned by CredentialsContainer.create() when a PublicKeyCredential is passed, and provides a cryptographic root of trust for the new key pair that has been generated. This response should be sent to the relying party's server to complete the creation of the credential.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AuthenticatorAttestationResponse">AuthenticatorAttestationResponse - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AuthenticatorAttestationResponse"
)
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
  AuthenticatorAttestationResponse() {
  }

  /**
   * The attestationObject property of the AuthenticatorAttestationResponse interface returns an ArrayBuffer containing the new public key, as well as signature over the entire attestationObject with a private key that is stored in the authenticator when it is manufactured.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AuthenticatorAttestationResponse/attestationObject">AuthenticatorAttestationResponse.attestationObject - MDN</a>
   */
  @JsProperty(
      name = "attestationObject"
  )
  @Nonnull
  public native ArrayBuffer attestationObject();
}
