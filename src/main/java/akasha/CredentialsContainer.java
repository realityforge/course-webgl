package akasha;

import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The CredentialsContainer interface of the Credential Management API exposes methods to request credentials and notify the user agent when events such as successful sign in or sign out happen. This interface is accessible from Navigator.credentials.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CredentialsContainer">CredentialsContainer - MDN</a>
 * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
 * @see <a href="https://w3c.github.io/webauthn/">Web Authentication: An API for accessing Public Key Credentials Level 1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CredentialsContainer"
)
public class CredentialsContainer {
  protected CredentialsContainer() {
  }

  /**
   * The create() method of the CredentialsContainer interface returns a Promise that resolves with a new Credential instance based on the provided options, or null if no Credential object can be created.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CredentialsContainer/create">CredentialsContainer.create - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/#dom-credentialscontainer-get">get() - Credential Management Level 1</a>
   * @see <a href="https://w3c.github.io/webauthn/">Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @Nonnull
  public native Promise<Credential> create(@Nonnull CredentialCreationOptions options);

  /**
   * The create() method of the CredentialsContainer interface returns a Promise that resolves with a new Credential instance based on the provided options, or null if no Credential object can be created.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CredentialsContainer/create">CredentialsContainer.create - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/#dom-credentialscontainer-get">get() - Credential Management Level 1</a>
   * @see <a href="https://w3c.github.io/webauthn/">Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @Nonnull
  public native Promise<Credential> create();

  /**
   * The get() method of the CredentialsContainer interface returns a Promise to a single Credential instance that matches the provided parameters. If no match is found the Promise will resolve to null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CredentialsContainer/get">CredentialsContainer.get - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/#dom-credentialscontainer-get">get() - Credential Management Level 1</a>
   * @see <a href="https://w3c.github.io/webauthn/">Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @Nonnull
  public native Promise<Credential> get(@Nonnull CredentialRequestOptions options);

  /**
   * The get() method of the CredentialsContainer interface returns a Promise to a single Credential instance that matches the provided parameters. If no match is found the Promise will resolve to null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CredentialsContainer/get">CredentialsContainer.get - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/#dom-credentialscontainer-get">get() - Credential Management Level 1</a>
   * @see <a href="https://w3c.github.io/webauthn/">Web Authentication: An API for accessing Public Key Credentials Level 1</a>
   */
  @Nonnull
  public native Promise<Credential> get();

  /**
   * The preventSilentAccess() method of the CredentialsContainer interface sets a flag that specifies whether automatic log in is allowed for future visits to the current origin, then returns an empty Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CredentialsContainer/preventSilentAccess">CredentialsContainer.preventSilentAccess - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/#dom-credentialscontainer-preventsilentaccess">preventSilentAccess() - Credential Management Level 1</a>
   */
  @Nonnull
  public native Promise<Void> preventSilentAccess();

  /**
   * The store() method of the CredentialsContainer stores a set of credentials for the user inside a Credential instance, returning this in a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CredentialsContainer/store">CredentialsContainer.store - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @Nonnull
  public native Promise<Credential> store(@Nonnull Credential credential);
}
