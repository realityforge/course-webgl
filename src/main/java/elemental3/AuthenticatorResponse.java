package elemental3;

import elemental2.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AuthenticatorResponse interface of the Web Authentication API is the base interface for interfaces that provide a cryptographic root of trust for a key pair. The child interfaces include information from the browser such as the challenge origin and either may be returned from PublicKeyCredential.response.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AuthenticatorResponse">AuthenticatorResponse - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AuthenticatorResponse"
)
public class AuthenticatorResponse {
  AuthenticatorResponse() {
  }

  /**
   * The clientDataJSON property of the AuthenticatorResponse interface stores a JSON string in an ArrayBuffer, representing the client data that was passed to CredentialsContainer.create() or CredentialsContainer.get(). This property is only accessed on one of the child objects of AuthenticatorResponse, specifically AuthenticatorAttestationResponse or AuthenticatorAssertionResponse.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AuthenticatorResponse/clientDataJSON">AuthenticatorResponse.clientDataJSON - MDN</a>
   */
  @JsProperty(
      name = "clientDataJSON"
  )
  @Nonnull
  public native ArrayBuffer clientDataJSON();
}
