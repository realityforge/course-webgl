package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface CredentialRequestOptions {
  @JsOverlay
  @Nonnull
  static CredentialRequestOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "mediation"
  )
  @CredentialMediationRequirement
  String mediation();

  @JsProperty
  void setMediation(@CredentialMediationRequirement @Nonnull String mediation);

  @JsOverlay
  @Nonnull
  default CredentialRequestOptions mediation(
      @CredentialMediationRequirement @Nonnull final String mediation) {
    setMediation( mediation );
    return this;
  }

  @JsProperty(
      name = "signal"
  )
  AbortSignal signal();

  @JsProperty
  void setSignal(@Nonnull AbortSignal signal);

  @JsOverlay
  @Nonnull
  default CredentialRequestOptions signal(@Nonnull final AbortSignal signal) {
    setSignal( signal );
    return this;
  }

  @JsProperty(
      name = "password"
  )
  boolean password();

  @JsProperty
  void setPassword(boolean password);

  @JsOverlay
  @Nonnull
  default CredentialRequestOptions password(final boolean password) {
    setPassword( password );
    return this;
  }

  @JsProperty(
      name = "federated"
  )
  FederatedCredentialRequestOptions federated();

  @JsProperty
  void setFederated(@Nonnull FederatedCredentialRequestOptions federated);

  @JsOverlay
  @Nonnull
  default CredentialRequestOptions federated(
      @Nonnull final FederatedCredentialRequestOptions federated) {
    setFederated( federated );
    return this;
  }

  @JsProperty(
      name = "publicKey"
  )
  PublicKeyCredentialRequestOptions publicKey();

  @JsProperty
  void setPublicKey(@Nonnull PublicKeyCredentialRequestOptions publicKey);

  @JsOverlay
  @Nonnull
  default CredentialRequestOptions publicKey(
      @Nonnull final PublicKeyCredentialRequestOptions publicKey) {
    setPublicKey( publicKey );
    return this;
  }
}
