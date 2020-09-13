package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.JsArray;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
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
 * The PublicKeyCredentialRequestOptions dictionary of the Web Authentication API holds the options passed to navigator.credentials.get() in order to fetch a given PublicKeyCredential.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions">PublicKeyCredentialRequestOptions - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface PublicKeyCredentialRequestOptions {
  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final BufferSource challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final ArrayBufferView challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Int8Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Int16Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Int32Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Uint8Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Uint16Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Uint32Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Uint8ClampedArray challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Float32Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Float64Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final DataView challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final ArrayBuffer challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  /**
   * allowCredentials is an optional property of the PublicKeyCredentialRequestOptions dictionary which indicates the existing credentials acceptable for retrieval. This is an Array of credential descriptors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/allowCredentials">PublicKeyCredentialRequestOptions.allowCredentials - MDN</a>
   */
  @JsProperty(
      name = "allowCredentials"
  )
  JsArray<PublicKeyCredentialDescriptor> allowCredentials();

  /**
   * allowCredentials is an optional property of the PublicKeyCredentialRequestOptions dictionary which indicates the existing credentials acceptable for retrieval. This is an Array of credential descriptors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/allowCredentials">PublicKeyCredentialRequestOptions.allowCredentials - MDN</a>
   */
  @JsProperty
  void setAllowCredentials(@Nonnull JsArray<PublicKeyCredentialDescriptor> allowCredentials);

  /**
   * allowCredentials is an optional property of the PublicKeyCredentialRequestOptions dictionary which indicates the existing credentials acceptable for retrieval. This is an Array of credential descriptors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/allowCredentials">PublicKeyCredentialRequestOptions.allowCredentials - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions allowCredentials(
      @Nonnull final JsArray<PublicKeyCredentialDescriptor> allowCredentials) {
    setAllowCredentials( allowCredentials );
    return this;
  }

  /**
   * allowCredentials is an optional property of the PublicKeyCredentialRequestOptions dictionary which indicates the existing credentials acceptable for retrieval. This is an Array of credential descriptors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/allowCredentials">PublicKeyCredentialRequestOptions.allowCredentials - MDN</a>
   */
  @JsOverlay
  default void setAllowCredentials(
      @Nonnull final PublicKeyCredentialDescriptor... allowCredentials) {
    setAllowCredentials( Js.<JsArray<PublicKeyCredentialDescriptor>>uncheckedCast( allowCredentials ) );
  }

  /**
   * allowCredentials is an optional property of the PublicKeyCredentialRequestOptions dictionary which indicates the existing credentials acceptable for retrieval. This is an Array of credential descriptors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/allowCredentials">PublicKeyCredentialRequestOptions.allowCredentials - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions allowCredentials(
      @Nonnull final PublicKeyCredentialDescriptor... allowCredentials) {
    setAllowCredentials( allowCredentials );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsProperty(
      name = "challenge"
  )
  @Nonnull
  BufferSource challenge();

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsProperty
  void setChallenge(@Nonnull BufferSource challenge);

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final BufferSource challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final ArrayBufferView challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final ArrayBufferView challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Int8Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Int8Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Int16Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Int16Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Int32Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Int32Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Uint8Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Uint8Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Uint16Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Uint16Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Uint32Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Uint32Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Uint8ClampedArray challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Uint8ClampedArray challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Float32Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Float32Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Float64Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Float64Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final DataView challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final DataView challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final ArrayBuffer challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialRequestOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator's private key and produce AuthenticatorAssertionResponse.signature which should be sent back to the server as part of the response.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/challenge">PublicKeyCredentialRequestOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final ArrayBuffer challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * extensions, an optional property of the PublicKeyCredentialRequestOptions dictionary, is an object providing the client extensions and their input values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/extensions">PublicKeyCredentialRequestOptions.extensions - MDN</a>
   */
  @JsProperty(
      name = "extensions"
  )
  AuthenticationExtensionsClientInputs extensions();

  /**
   * extensions, an optional property of the PublicKeyCredentialRequestOptions dictionary, is an object providing the client extensions and their input values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/extensions">PublicKeyCredentialRequestOptions.extensions - MDN</a>
   */
  @JsProperty
  void setExtensions(@Nonnull AuthenticationExtensionsClientInputs extensions);

  /**
   * extensions, an optional property of the PublicKeyCredentialRequestOptions dictionary, is an object providing the client extensions and their input values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/extensions">PublicKeyCredentialRequestOptions.extensions - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions extensions(
      @Nonnull final AuthenticationExtensionsClientInputs extensions) {
    setExtensions( extensions );
    return this;
  }

  /**
   * The rpId property, of the PublicKeyCredentialRequestOptions dictionary, is an optional property which indicates the relying party's identifier as a USVString. Its value can only be a suffix of the current origin's domain. For example, if you are browsing on foo.example.com, the rpId value may be &quot;example.com&quot; but not &quot;bar.org&quot; or &quot;baz.example.com&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/rpId">PublicKeyCredentialRequestOptions.rpId - MDN</a>
   */
  @JsProperty(
      name = "rpId"
  )
  String rpId();

  /**
   * The rpId property, of the PublicKeyCredentialRequestOptions dictionary, is an optional property which indicates the relying party's identifier as a USVString. Its value can only be a suffix of the current origin's domain. For example, if you are browsing on foo.example.com, the rpId value may be &quot;example.com&quot; but not &quot;bar.org&quot; or &quot;baz.example.com&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/rpId">PublicKeyCredentialRequestOptions.rpId - MDN</a>
   */
  @JsProperty
  void setRpId(@Nonnull String rpId);

  /**
   * The rpId property, of the PublicKeyCredentialRequestOptions dictionary, is an optional property which indicates the relying party's identifier as a USVString. Its value can only be a suffix of the current origin's domain. For example, if you are browsing on foo.example.com, the rpId value may be &quot;example.com&quot; but not &quot;bar.org&quot; or &quot;baz.example.com&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/rpId">PublicKeyCredentialRequestOptions.rpId - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions rpId(@Nonnull final String rpId) {
    setRpId( rpId );
    return this;
  }

  /**
   * The timeout property, of the PublicKeyCredentialRequestOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the retrieval operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/timeout">PublicKeyCredentialRequestOptions.timeout - MDN</a>
   */
  @JsProperty(
      name = "timeout"
  )
  int timeout();

  /**
   * The timeout property, of the PublicKeyCredentialRequestOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the retrieval operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/timeout">PublicKeyCredentialRequestOptions.timeout - MDN</a>
   */
  @JsProperty
  void setTimeout(int timeout);

  /**
   * The timeout property, of the PublicKeyCredentialRequestOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the retrieval operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/timeout">PublicKeyCredentialRequestOptions.timeout - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions timeout(final int timeout) {
    setTimeout( timeout );
    return this;
  }

  /**
   * userVerification is an optional property of the PublicKeyCredentialRequestOptions. This is a string which indicates how the user verification should be part of the authentication process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/userVerification">PublicKeyCredentialRequestOptions.userVerification - MDN</a>
   */
  @JsProperty(
      name = "userVerification"
  )
  @MagicConstant(
      valuesFromClass = UserVerificationRequirement.class
  )
  String userVerification();

  /**
   * userVerification is an optional property of the PublicKeyCredentialRequestOptions. This is a string which indicates how the user verification should be part of the authentication process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/userVerification">PublicKeyCredentialRequestOptions.userVerification - MDN</a>
   */
  @JsProperty
  void setUserVerification(
      @MagicConstant(valuesFromClass = UserVerificationRequirement.class) @Nonnull String userVerification);

  /**
   * userVerification is an optional property of the PublicKeyCredentialRequestOptions. This is a string which indicates how the user verification should be part of the authentication process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialRequestOptions/userVerification">PublicKeyCredentialRequestOptions.userVerification - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions userVerification(
      @MagicConstant(valuesFromClass = UserVerificationRequirement.class) @Nonnull final String userVerification) {
    setUserVerification( userVerification );
    return this;
  }
}
