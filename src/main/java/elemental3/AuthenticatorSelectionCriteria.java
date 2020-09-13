package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface AuthenticatorSelectionCriteria {
  @JsOverlay
  @Nonnull
  static AuthenticatorSelectionCriteria create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "authenticatorAttachment"
  )
  @MagicConstant(
      valuesFromClass = AuthenticatorAttachment.class
  )
  String authenticatorAttachment();

  @JsProperty
  void setAuthenticatorAttachment(
      @MagicConstant(valuesFromClass = AuthenticatorAttachment.class) @Nonnull String authenticatorAttachment);

  @JsOverlay
  @Nonnull
  default AuthenticatorSelectionCriteria authenticatorAttachment(
      @MagicConstant(valuesFromClass = AuthenticatorAttachment.class) @Nonnull final String authenticatorAttachment) {
    setAuthenticatorAttachment( authenticatorAttachment );
    return this;
  }

  @JsProperty(
      name = "requireResidentKey"
  )
  boolean requireResidentKey();

  @JsProperty
  void setRequireResidentKey(boolean requireResidentKey);

  @JsOverlay
  @Nonnull
  default AuthenticatorSelectionCriteria requireResidentKey(final boolean requireResidentKey) {
    setRequireResidentKey( requireResidentKey );
    return this;
  }

  @JsProperty(
      name = "userVerification"
  )
  @MagicConstant(
      valuesFromClass = UserVerificationRequirement.class
  )
  String userVerification();

  @JsProperty
  void setUserVerification(
      @MagicConstant(valuesFromClass = UserVerificationRequirement.class) @Nonnull String userVerification);

  @JsOverlay
  @Nonnull
  default AuthenticatorSelectionCriteria userVerification(
      @MagicConstant(valuesFromClass = UserVerificationRequirement.class) @Nonnull final String userVerification) {
    setUserVerification( userVerification );
    return this;
  }
}
