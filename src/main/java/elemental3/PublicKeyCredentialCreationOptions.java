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
 * The PublicKeyCredentialCreationOptions dictionary of the Web Authentication API holds options passed to navigators.credentials.create() in order to create a PublicKeyCredential.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions">PublicKeyCredentialCreationOptions - MDN</a>
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
  static PublicKeyCredentialCreationOptions create(@Nonnull final ArrayBufferView challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Int8Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Int16Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Int32Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint8Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint16Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint32Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint8ClampedArray challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Float32Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Float64Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final DataView challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final ArrayBuffer challenge,
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

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final ArrayBufferView challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Int8Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Int16Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Int32Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint8Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint16Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint32Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint8ClampedArray challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Float32Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Float64Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final DataView challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final ArrayBuffer challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  /**
   * attestation is an optional property of the PublicKeyCredentialCreationOptions dictionary. This is a string whose value indicates the preference regarding the attestation transport, between the authenticator, the client and the relying party.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/attestation">PublicKeyCredentialCreationOptions.attestation - MDN</a>
   */
  @JsProperty(
      name = "attestation"
  )
  @MagicConstant(
      valuesFromClass = AttestationConveyancePreference.class
  )
  String attestation();

  /**
   * attestation is an optional property of the PublicKeyCredentialCreationOptions dictionary. This is a string whose value indicates the preference regarding the attestation transport, between the authenticator, the client and the relying party.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/attestation">PublicKeyCredentialCreationOptions.attestation - MDN</a>
   */
  @JsProperty
  void setAttestation(
      @MagicConstant(valuesFromClass = AttestationConveyancePreference.class) @Nonnull String attestation);

  /**
   * attestation is an optional property of the PublicKeyCredentialCreationOptions dictionary. This is a string whose value indicates the preference regarding the attestation transport, between the authenticator, the client and the relying party.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/attestation">PublicKeyCredentialCreationOptions.attestation - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions attestation(
      @MagicConstant(valuesFromClass = AttestationConveyancePreference.class) @Nonnull final String attestation) {
    setAttestation( attestation );
    return this;
  }

  /**
   * authenticatorSelection, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object giving criteria to filter out the authenticators to be used for the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/authenticatorSelection">PublicKeyCredentialCreationOptions.authenticatorSelection - MDN</a>
   */
  @JsProperty(
      name = "authenticatorSelection"
  )
  AuthenticatorSelectionCriteria authenticatorSelection();

  /**
   * authenticatorSelection, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object giving criteria to filter out the authenticators to be used for the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/authenticatorSelection">PublicKeyCredentialCreationOptions.authenticatorSelection - MDN</a>
   */
  @JsProperty
  void setAuthenticatorSelection(@Nonnull AuthenticatorSelectionCriteria authenticatorSelection);

  /**
   * authenticatorSelection, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object giving criteria to filter out the authenticators to be used for the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/authenticatorSelection">PublicKeyCredentialCreationOptions.authenticatorSelection - MDN</a>
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
   */
  @JsProperty
  void setChallenge(@Nonnull BufferSource challenge);

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final BufferSource challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final ArrayBufferView challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final ArrayBufferView challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Int8Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Int8Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Int16Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Int16Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Int32Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Int32Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Uint8Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Uint8Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Uint16Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Uint16Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Uint32Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Uint32Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Uint8ClampedArray challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Uint8ClampedArray challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Float32Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Float32Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final Float64Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Float64Array challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final DataView challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final DataView challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  default void setChallenge(@Nonnull final ArrayBuffer challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  /**
   * The challenge property of the PublicKeyCredentialCreationOptions dictionary is a BufferSource used as a cryptographic challenge. This is randomly generated then sent from the relying party's server. This value (among other client data) will be signed by the authenticator, using its private key, and must be sent back for verification to the server as part of AuthenticatorAttestationResponse.attestationObject.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/challenge">PublicKeyCredentialCreationOptions.challenge - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final ArrayBuffer challenge) {
    setChallenge( challenge );
    return this;
  }

  /**
   * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
   */
  @JsProperty(
      name = "excludeCredentials"
  )
  JsArray<PublicKeyCredentialDescriptor> excludeCredentials();

  /**
   * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
   */
  @JsProperty
  void setExcludeCredentials(@Nonnull JsArray<PublicKeyCredentialDescriptor> excludeCredentials);

  /**
   * excludeCredentials, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an Array whose elements are descriptors for the public keys already existing for a given user. This is provided by the relying party's server if it wants to prevent creation of new credentials for an existing user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/excludeCredentials">PublicKeyCredentialCreationOptions.excludeCredentials - MDN</a>
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
   */
  @JsProperty(
      name = "extensions"
  )
  AuthenticationExtensionsClientInputs extensions();

  /**
   * extensions, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object providing the client extensions and their input values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/extensions">PublicKeyCredentialCreationOptions.extensions - MDN</a>
   */
  @JsProperty
  void setExtensions(@Nonnull AuthenticationExtensionsClientInputs extensions);

  /**
   * extensions, an optional property of the PublicKeyCredentialCreationOptions dictionary, is an object providing the client extensions and their input values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/extensions">PublicKeyCredentialCreationOptions.extensions - MDN</a>
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
   */
  @JsProperty
  void setPubKeyCredParams(@Nonnull JsArray<PublicKeyCredentialParameters> pubKeyCredParams);

  /**
   * The pubKeyCredParams property of the PublicKeyCredentialCreationOptions dictionary is an Array whose elements are objects describing the desired features of the credential to be created. These objects define the type of public-key and the algorithm used for cryptographic signature operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/pubKeyCredParams">PublicKeyCredentialCreationOptions.pubKeyCredParams - MDN</a>
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
   */
  @JsProperty
  void setRp(@Nonnull PublicKeyCredentialRpEntity rp);

  /**
   * The rp property of the PublicKeyCredentialCreationOptions dictionary is an object describing the relying party which requested the credential creation (via navigator.credentials.create()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/rp">PublicKeyCredentialCreationOptions.rp - MDN</a>
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
   */
  @JsProperty(
      name = "timeout"
  )
  int timeout();

  /**
   * The timeout property, of the PublicKeyCredentialCreationOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/timeout">PublicKeyCredentialCreationOptions.timeout - MDN</a>
   */
  @JsProperty
  void setTimeout(int timeout);

  /**
   * The timeout property, of the PublicKeyCredentialCreationOptions dictionary, represents an hint, given in milliseconds, for the time the script is willing to wait for the completion of the creation operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/timeout">PublicKeyCredentialCreationOptions.timeout - MDN</a>
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
   */
  @JsProperty
  void setUser(@Nonnull PublicKeyCredentialUserEntity user);

  /**
   * The user property of the PublicKeyCredentialCreationOptions dictionary is an object describing the user account for which the credentials are generated (via navigator.credentials.create()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PublicKeyCredentialCreationOptions/user">PublicKeyCredentialCreationOptions.user - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions user(
      @Nonnull final PublicKeyCredentialUserEntity user) {
    setUser( user );
    return this;
  }
}
