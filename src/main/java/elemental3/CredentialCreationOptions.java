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
public interface CredentialCreationOptions {
  @JsOverlay
  @Nonnull
  static CredentialCreationOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "signal"
  )
  AbortSignal signal();

  @JsProperty
  void setSignal(@Nonnull AbortSignal signal);

  @JsOverlay
  @Nonnull
  default CredentialCreationOptions signal(@Nonnull final AbortSignal signal) {
    setSignal( signal );
    return this;
  }

  @JsProperty(
      name = "password"
  )
  PasswordCredentialInit password();

  @JsProperty
  void setPassword(@Nonnull PasswordCredentialInit password);

  @JsOverlay
  @Nonnull
  default CredentialCreationOptions password(@Nonnull final PasswordCredentialInit password) {
    setPassword( password );
    return this;
  }

  @JsOverlay
  default void setPassword(@Nonnull final PasswordCredentialData password) {
    setPassword( PasswordCredentialInit.of( password ) );
  }

  @JsOverlay
  @Nonnull
  default CredentialCreationOptions password(@Nonnull final PasswordCredentialData password) {
    setPassword( password );
    return this;
  }

  @JsOverlay
  default void setPassword(@Nonnull final HTMLFormElement password) {
    setPassword( PasswordCredentialInit.of( password ) );
  }

  @JsOverlay
  @Nonnull
  default CredentialCreationOptions password(@Nonnull final HTMLFormElement password) {
    setPassword( password );
    return this;
  }

  @JsProperty(
      name = "federated"
  )
  FederatedCredentialInit federated();

  @JsProperty
  void setFederated(@Nonnull FederatedCredentialInit federated);

  @JsOverlay
  @Nonnull
  default CredentialCreationOptions federated(@Nonnull final FederatedCredentialInit federated) {
    setFederated( federated );
    return this;
  }

  @JsProperty(
      name = "publicKey"
  )
  PublicKeyCredentialCreationOptions publicKey();

  @JsProperty
  void setPublicKey(@Nonnull PublicKeyCredentialCreationOptions publicKey);

  @JsOverlay
  @Nonnull
  default CredentialCreationOptions publicKey(
      @Nonnull final PublicKeyCredentialCreationOptions publicKey) {
    setPublicKey( publicKey );
    return this;
  }
}
