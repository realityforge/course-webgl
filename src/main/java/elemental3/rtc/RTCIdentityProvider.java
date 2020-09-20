package elemental3.rtc;

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
public interface RTCIdentityProvider {
  @JsOverlay
  @Nonnull
  static RTCIdentityProvider create(@Nonnull final GenerateAssertionCallback generateAssertion,
      @Nonnull final ValidateAssertionCallback validateAssertion) {
    return Js.<RTCIdentityProvider>uncheckedCast( JsPropertyMap.of() ).generateAssertion( generateAssertion ).validateAssertion( validateAssertion );
  }

  @JsProperty(
      name = "generateAssertion"
  )
  @Nonnull
  GenerateAssertionCallback generateAssertion();

  @JsProperty
  void setGenerateAssertion(@Nonnull GenerateAssertionCallback generateAssertion);

  @JsOverlay
  @Nonnull
  default RTCIdentityProvider generateAssertion(
      @Nonnull final GenerateAssertionCallback generateAssertion) {
    setGenerateAssertion( generateAssertion );
    return this;
  }

  @JsProperty(
      name = "validateAssertion"
  )
  @Nonnull
  ValidateAssertionCallback validateAssertion();

  @JsProperty
  void setValidateAssertion(@Nonnull ValidateAssertionCallback validateAssertion);

  @JsOverlay
  @Nonnull
  default RTCIdentityProvider validateAssertion(
      @Nonnull final ValidateAssertionCallback validateAssertion) {
    setValidateAssertion( validateAssertion );
    return this;
  }
}
