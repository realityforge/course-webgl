package elemental3;

import elemental3.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AuthenticatorAssertionResponse interface of the Web Authentication API is returned by CredentialsContainer.get() when a PublicKeyCredential is passed, and provides proof to a service that it has a key pair and that the authentication request is valid and approved.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AuthenticatorAssertionResponse">AuthenticatorAssertionResponse - MDN</a>
 * @see <a href="https://w3c.github.io/webauthn/#iface-authenticatorassertionresponse">AuthenticatorAssertionResponse interface - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AuthenticatorAssertionResponse"
)
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
  protected AuthenticatorAssertionResponse() {
  }

  /**
   * The authenticatorData property of the AuthenticatorAssertionResponse interface returns an ArrayBuffer containing information from the authenticator such as the Relying Party ID Hash (rpIdHash), a signature counter, test of user presence, user verification flags, and any extensions processed by the authenticator.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AuthenticatorAssertionResponse/authenticatorData">AuthenticatorAssertionResponse.authenticatorData - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-authenticatorassertionresponse-authenticatordata">authenticatorData - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "authenticatorData"
  )
  @Nonnull
  public native ArrayBuffer authenticatorData();

  /**
   * The signature read-only property of the AuthenticatorAssertionResponse interface is an ArrayBuffer object which is the signature of the authenticator for both AuthenticatorAssertionResponse.authenticatorData and a SHA-256 hash of the client data (AuthenticatorAssertionResponse.clientDataJSON).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AuthenticatorAssertionResponse/signature">AuthenticatorAssertionResponse.signature - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-authenticatorassertionresponse-signature">signature - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "signature"
  )
  @Nonnull
  public native ArrayBuffer signature();

  /**
   * The userHandle read-only property of the AuthenticatorAssertionResponse interface is an ArrayBuffer object which is an opaque identifier for the given user. Such an identifier can be used by the relying party's server to link the user account with its corresponding credentials and other data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AuthenticatorAssertionResponse/userHandle">AuthenticatorAssertionResponse.userHandle - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-authenticatorassertionresponse-userhandle">userHandle - Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @JsProperty(
      name = "userHandle"
  )
  @Nullable
  public native ArrayBuffer userHandle();
}
