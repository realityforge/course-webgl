package elemental3;

import elemental3.core.BufferSource;
import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The PublicKeyCredentialCreationOptions dictionary of the Web Authentication API holds options passed to navigators.credentials.create() in order to create a PublicKeyCredential.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions">PublicKeyCredentialCreationOptions - MDN</a>
 * @see <a href="https://w3c.github.io/webauthn/#dictdef-publickeycredentialcreationoptions">The definition of 'PublicKeyCredentialCreationOptions dictionary' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface PublicKeyCredentialCreationOptions {
  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final BufferSource challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final BufferSource challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  /**
   * attestation is an optional property of the PublicKeyCredentialCreationOptions dictionary. This is a string whose value indicates the preference regarding the attestation transport, between the authenticator, the client and the relying party.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/attestation">PublicKeyCredentialCreationOptions.attestation - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-attestation">The definition of 'attestation' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty(
      name = "attestation"
  )
  @AttestationConveyancePreference
  String attestation();

  /**
   * attestation is an optional property of the PublicKeyCredentialCreationOptions dictionary. This is a string whose value indicates the preference regarding the attestation transport, between the authenticator, the client and the relying party.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/attestation">PublicKeyCredentialCreationOptions.attestation - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-attestation">The definition of 'attestation' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty
  void setAttestation(@AttestationConveyancePreference @Nonnull String attestation);

  /**
   * attestation is an optional property of the PublicKeyCredentialCreationOptions dictionary. This is a string whose value indicates the preference regarding the attestation transport, between the authenticator, the client and the relying party.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/attestation">PublicKeyCredentialCreationOptions.attestation - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-attestation">The definition of 'attestation' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions attestation(
      @AttestationConveyancePreference @Nonnull final String attestation) {
    setAttestation( attestation );
    return this;
  }

  /**
   * authenticatorSelection, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object giving criteria to filter out the authenticators to be used for the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/authenticatorSelection">PublicKeyCredentialCreationOptions.authenticatorSelection - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-authenticatorselection">The definition of 'authenticatorSelection' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty(
      name = "authenticatorSelection"
  )
  AuthenticatorSelectionCriteria authenticatorSelection();

  /**
   * authenticatorSelection, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object giving criteria to filter out the authenticators to be used for the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/authenticatorSelection">PublicKeyCredentialCreationOptions.authenticatorSelection - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-authenticatorselection">The definition of 'authenticatorSelection' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty
  void setAuthenticatorSelection(@Nonnull AuthenticatorSelectionCriteria authenticatorSelection);

  /**
   * authenticatorSelection, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object giving criteria to filter out the authenticators to be used for the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/authenticatorSelection">PublicKeyCredentialCreationOptions.authenticatorSelection - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-authenticatorselection">The definition of 'authenticatorSelection' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions authenticatorSelection(
      @Nonnull final AuthenticatorSelectionCriteria authenticatorSelection) {
    setAuthenticatorSelection( authenticatorSelection );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-challenge">The definition of 'challenge' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty(
      name = "challenge"
  )
  @Nonnull
  BufferSource challenge();

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-challenge">The definition of 'challenge' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty
  void setChallenge(@Nonnull BufferSource challenge);

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-challenge">The definition of 'challenge' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final BufferSource challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-excludecredentials">The definition of 'excludeCredentials' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty(
      name = "excludeCredentials"
  )
  JsArray<PublicKeyCredentialDescriptor> excludeCredentials();

  /**
   * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-excludecredentials">The definition of 'excludeCredentials' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty
  void setExcludeCredentials(@Nonnull JsArray<PublicKeyCredentialDescriptor> excludeCredentials);

  /**
   * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-excludecredentials">The definition of 'excludeCredentials' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions excludeCredentials(
      @Nonnull final JsArray<PublicKeyCredentialDescriptor> excludeCredentials) {
    setExcludeCredentials( excludeCredentials );
    return this;
  }

  /**
   * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-excludecredentials">The definition of 'excludeCredentials' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  default void setExcludeCredentials(
      @Nonnull final PublicKeyCredentialDescriptor... excludeCredentials) {
    setExcludeCredentials( Js.<JsArray<PublicKeyCredentialDescriptor>>uncheckedCast( excludeCredentials ) );
  }

  /**
   * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-excludecredentials">The definition of 'excludeCredentials' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions excludeCredentials(
      @Nonnull final PublicKeyCredentialDescriptor... excludeCredentials) {
    setExcludeCredentials( excludeCredentials );
    return this;
  }

  /**
   * extensions, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object providing the client extensions and their input values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/extensions">PublicKeyCredentialCreationOptions.extensions - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-extensions">The definition of 'extensions' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty(
      name = "extensions"
  )
  AuthenticationExtensionsClientInputs extensions();

  /**
   * extensions, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object providing the client extensions and their input values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/extensions">PublicKeyCredentialCreationOptions.extensions - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-extensions">The definition of 'extensions' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty
  void setExtensions(@Nonnull AuthenticationExtensionsClientInputs extensions);

  /**
   * extensions, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object providing the client extensions and their input values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/extensions">PublicKeyCredentialCreationOptions.extensions - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialrequestoptions-extensions">The definition of 'extensions' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions extensions(
      @Nonnull final AuthenticationExtensionsClientInputs extensions) {
    setExtensions( extensions );
    return this;
  }

  /**
   * The pubKeyCredParams property of the PublicKeyCredentialCreationOptions dictionary is an Array whose elements are objects describing the desired features of the credential to be created. These objects define the type of public-key and the algorithm used for cryptographic signature operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/pubKeyCredParams">PublicKeyCredentialCreationOptions.pubKeyCredParams - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-pubkeycredparams">The definition of 'pubKeyCredParams' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty(
      name = "pubKeyCredParams"
  )
  @Nonnull
  JsArray<PublicKeyCredentialParameters> pubKeyCredParams();

  /**
   * The pubKeyCredParams property of the PublicKeyCredentialCreationOptions dictionary is an Array whose elements are objects describing the desired features of the credential to be created. These objects define the type of public-key and the algorithm used for cryptographic signature operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/pubKeyCredParams">PublicKeyCredentialCreationOptions.pubKeyCredParams - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-pubkeycredparams">The definition of 'pubKeyCredParams' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty
  void setPubKeyCredParams(@Nonnull JsArray<PublicKeyCredentialParameters> pubKeyCredParams);

  /**
   * The pubKeyCredParams property of the PublicKeyCredentialCreationOptions dictionary is an Array whose elements are objects describing the desired features of the credential to be created. These objects define the type of public-key and the algorithm used for cryptographic signature operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/pubKeyCredParams">PublicKeyCredentialCreationOptions.pubKeyCredParams - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-pubkeycredparams">The definition of 'pubKeyCredParams' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions pubKeyCredParams(
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams) {
    setPubKeyCredParams( pubKeyCredParams );
    return this;
  }

  /**
   * The pubKeyCredParams property of the PublicKeyCredentialCreationOptions dictionary is an Array whose elements are objects describing the desired features of the credential to be created. These objects define the type of public-key and the algorithm used for cryptographic signature operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/pubKeyCredParams">PublicKeyCredentialCreationOptions.pubKeyCredParams - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-pubkeycredparams">The definition of 'pubKeyCredParams' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  default void setPubKeyCredParams(
      @Nonnull final PublicKeyCredentialParameters... pubKeyCredParams) {
    setPubKeyCredParams( Js.<JsArray<PublicKeyCredentialParameters>>uncheckedCast( pubKeyCredParams ) );
  }

  /**
   * The pubKeyCredParams property of the PublicKeyCredentialCreationOptions dictionary is an Array whose elements are objects describing the desired features of the credential to be created. These objects define the type of public-key and the algorithm used for cryptographic signature operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/pubKeyCredParams">PublicKeyCredentialCreationOptions.pubKeyCredParams - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-pubkeycredparams">The definition of 'pubKeyCredParams' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions pubKeyCredParams(
      @Nonnull final PublicKeyCredentialParameters... pubKeyCredParams) {
    setPubKeyCredParams( pubKeyCredParams );
    return this;
  }

  /**
   * The rp property of the PublicKeyCredentialCreationOptions dictionary is an object describing the relying party which requested the credential creation (via navigator.credentials.create()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/rp">PublicKeyCredentialCreationOptions.rp - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-rp">The definition of 'rp' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty(
      name = "rp"
  )
  @Nonnull
  PublicKeyCredentialRpEntity rp();

  /**
   * The rp property of the PublicKeyCredentialCreationOptions dictionary is an object describing the relying party which requested the credential creation (via navigator.credentials.create()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/rp">PublicKeyCredentialCreationOptions.rp - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-rp">The definition of 'rp' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty
  void setRp(@Nonnull PublicKeyCredentialRpEntity rp);

  /**
   * The rp property of the PublicKeyCredentialCreationOptions dictionary is an object describing the relying party which requested the credential creation (via navigator.credentials.create()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/rp">PublicKeyCredentialCreationOptions.rp - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-rp">The definition of 'rp' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions rp(@Nonnull final PublicKeyCredentialRpEntity rp) {
    setRp( rp );
    return this;
  }

  /**
   * The timeout property, of the PublicKeyCredentialCreationOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/timeout">PublicKeyCredentialCreationOptions.timeout - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-timeout">The definition of 'timeout' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty(
      name = "timeout"
  )
  int timeout();

  /**
   * The timeout property, of the PublicKeyCredentialCreationOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/timeout">PublicKeyCredentialCreationOptions.timeout - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-timeout">The definition of 'timeout' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty
  void setTimeout(int timeout);

  /**
   * The timeout property, of the PublicKeyCredentialCreationOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/timeout">PublicKeyCredentialCreationOptions.timeout - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-timeout">The definition of 'timeout' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions timeout(final int timeout) {
    setTimeout( timeout );
    return this;
  }

  /**
   * The user property of the PublicKeyCredentialCreationOptions dictionary is an object describing the user account for which the credentials are generated (via navigator.credentials.create()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/user">PublicKeyCredentialCreationOptions.user - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-user">The definition of 'user' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty(
      name = "user"
  )
  @Nonnull
  PublicKeyCredentialUserEntity user();

  /**
   * The user property of the PublicKeyCredentialCreationOptions dictionary is an object describing the user account for which the credentials are generated (via navigator.credentials.create()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/user">PublicKeyCredentialCreationOptions.user - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-user">The definition of 'user' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsProperty
  void setUser(@Nonnull PublicKeyCredentialUserEntity user);

  /**
   * The user property of the PublicKeyCredentialCreationOptions dictionary is an object describing the user account for which the credentials are generated (via navigator.credentials.create()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/user">PublicKeyCredentialCreationOptions.user - MDN</a>
   * @see <a href="https://w3c.github.io/webauthn/#dom-publickeycredentialcreationoptions-user">The definition of 'user' in the 'Web Authentication: An API for accessing Public Key Credentials Level 1' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions user(
      @Nonnull final PublicKeyCredentialUserEntity user) {
    setUser( user );
    return this;
  }
}
