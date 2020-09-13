package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The RTCIceServer dictionary defines how to connect to a single ICE server (such as a STUN or TURN server). Objects of this type are provided in the configuration of an RTCPeerConnection, in the iceServers array.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer">RTCIceServer - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCIceServer {
  @JsOverlay
  @Nonnull
  static RTCIceServer create(@Nonnull final String urls) {
    return Js.<RTCIceServer>uncheckedCast( JsPropertyMap.of() ).urls( urls );
  }

  @JsOverlay
  @Nonnull
  static RTCIceServer create(@Nonnull final JsArray<String> urls) {
    return Js.<RTCIceServer>uncheckedCast( JsPropertyMap.of() ).urls( urls );
  }

  @JsOverlay
  @Nonnull
  static RTCIceServer create(@Nonnull final String[] urls) {
    return Js.<RTCIceServer>uncheckedCast( JsPropertyMap.of() ).urls( urls );
  }

  /**
   * The RTCIceServer dictionary's credential property is a string providing the credential to use when connecting to the described server. This is typically a password, key, or other secret.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/credential">RTCIceServer.credential - MDN</a>
   */
  @JsProperty(
      name = "credential"
  )
  String credential();

  /**
   * The RTCIceServer dictionary's credential property is a string providing the credential to use when connecting to the described server. This is typically a password, key, or other secret.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/credential">RTCIceServer.credential - MDN</a>
   */
  @JsProperty
  void setCredential(@Nonnull String credential);

  /**
   * The RTCIceServer dictionary's credential property is a string providing the credential to use when connecting to the described server. This is typically a password, key, or other secret.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/credential">RTCIceServer.credential - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceServer credential(@Nonnull final String credential) {
    setCredential( credential );
    return this;
  }

  /**
   * The RTCIceServer dictionary's credentialType property is a string value from the RTCIceCredentialType enum which indicates what type of credential the RTCIceServer.credential value is. The default is password.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/credentialType">RTCIceServer.credentialType - MDN</a>
   */
  @JsProperty(
      name = "credentialType"
  )
  @MagicConstant(
      valuesFromClass = RTCIceCredentialType.class
  )
  String credentialType();

  /**
   * The RTCIceServer dictionary's credentialType property is a string value from the RTCIceCredentialType enum which indicates what type of credential the RTCIceServer.credential value is. The default is password.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/credentialType">RTCIceServer.credentialType - MDN</a>
   */
  @JsProperty
  void setCredentialType(
      @MagicConstant(valuesFromClass = RTCIceCredentialType.class) @Nonnull String credentialType);

  /**
   * The RTCIceServer dictionary's credentialType property is a string value from the RTCIceCredentialType enum which indicates what type of credential the RTCIceServer.credential value is. The default is password.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/credentialType">RTCIceServer.credentialType - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceServer credentialType(
      @MagicConstant(valuesFromClass = RTCIceCredentialType.class) @Nonnull final String credentialType) {
    setCredentialType( credentialType );
    return this;
  }

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   */
  @JsProperty(
      name = "urls"
  )
  @Nonnull
  StringOrStringArrayUnion urls();

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   */
  @JsProperty
  void setUrls(@Nonnull StringOrStringArrayUnion urls);

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   */
  @JsOverlay
  default void setUrls(@Nonnull final String urls) {
    setUrls( StringOrStringArrayUnion.of( urls ) );
  }

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceServer urls(@Nonnull final String urls) {
    setUrls( urls );
    return this;
  }

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   */
  @JsOverlay
  default void setUrls(@Nonnull final JsArray<String> urls) {
    setUrls( StringOrStringArrayUnion.of( urls ) );
  }

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceServer urls(@Nonnull final JsArray<String> urls) {
    setUrls( urls );
    return this;
  }

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   */
  @JsOverlay
  default void setUrls(@Nonnull final String... urls) {
    setUrls( StringOrStringArrayUnion.of( urls ) );
  }

  /**
   * The RTCIceServer dictionary's urls property specifies the URL or URLs of the servers to be used for ICE negotiations. These are typically STUN and/or TURN servers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/urls">RTCIceServer.urls - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceServer urls(@Nonnull final String... urls) {
    setUrls( urls );
    return this;
  }

  /**
   * The RTCIceServer dictionary's username property is a string which specifies the username to use when authenticating with the ICE server being described.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/username">RTCIceServer.username - MDN</a>
   */
  @JsProperty(
      name = "username"
  )
  String username();

  /**
   * The RTCIceServer dictionary's username property is a string which specifies the username to use when authenticating with the ICE server being described.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/username">RTCIceServer.username - MDN</a>
   */
  @JsProperty
  void setUsername(@Nonnull String username);

  /**
   * The RTCIceServer dictionary's username property is a string which specifies the username to use when authenticating with the ICE server being described.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer/username">RTCIceServer.username - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceServer username(@Nonnull final String username) {
    setUsername( username );
    return this;
  }
}
