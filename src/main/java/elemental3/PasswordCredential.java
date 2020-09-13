package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The interface of the Credential Management API provides information about a username/password pair. In supporting browsers an instance of this class may be passed in the credential member of the init object for global fetch.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PasswordCredential">PasswordCredential - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PasswordCredential"
)
public class PasswordCredential extends Credential {
  /**
   * The PasswordCredential constructor creates a new PasswordCredential object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PasswordCredential/PasswordCredential">PasswordCredential.PasswordCredential - MDN</a>
   */
  public PasswordCredential(@Nonnull final HTMLFormElement form) {
  }

  /**
   * The PasswordCredential constructor creates a new PasswordCredential object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PasswordCredential/PasswordCredential">PasswordCredential.PasswordCredential - MDN</a>
   */
  public PasswordCredential(@Nonnull final PasswordCredentialData data) {
  }

  /**
   * The password read-only property of the PasswordCredential interface returns a USVString containing the password of the credential.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PasswordCredential/password">PasswordCredential.password - MDN</a>
   */
  @JsProperty(
      name = "password"
  )
  @Nonnull
  public native String password();

  /**
   * The iconURL read-only property of the PasswordCredential interface returns a USVString containing a URL pointing to an image for an icon. This image is intended for display in a credential chooser. The URL must be accessible without authentication.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PasswordCredential/iconURL">PasswordCredential.iconURL - MDN</a>
   */
  @JsProperty(
      name = "iconURL"
  )
  @Nonnull
  public native String iconURL();

  /**
   * The name read-only property of the PasswordCredential interface returns a USVSTring containing a human-readable public name for display in a credential chooser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PasswordCredential/name">PasswordCredential.name - MDN</a>
   */
  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();
}
