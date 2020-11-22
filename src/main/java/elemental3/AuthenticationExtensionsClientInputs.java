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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface AuthenticationExtensionsClientInputs {
  @JsOverlay
  @Nonnull
  static AuthenticationExtensionsClientInputs create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "appid"
  )
  String appid();

  @JsProperty
  void setAppid(@Nonnull String appid);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs appid(@Nonnull final String appid) {
    setAppid( appid );
    return this;
  }

  @JsProperty(
      name = "txAuthSimple"
  )
  String txAuthSimple();

  @JsProperty
  void setTxAuthSimple(@Nonnull String txAuthSimple);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs txAuthSimple(@Nonnull final String txAuthSimple) {
    setTxAuthSimple( txAuthSimple );
    return this;
  }

  @JsProperty(
      name = "txAuthGeneric"
  )
  TxAuthGenericArg txAuthGeneric();

  @JsProperty
  void setTxAuthGeneric(@Nonnull TxAuthGenericArg txAuthGeneric);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs txAuthGeneric(
      @Nonnull final TxAuthGenericArg txAuthGeneric) {
    setTxAuthGeneric( txAuthGeneric );
    return this;
  }

  @JsProperty(
      name = "authnSel"
  )
  JsArray<BufferSource> authnSel();

  @JsProperty
  void setAuthnSel(@Nonnull JsArray<BufferSource> authnSel);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs authnSel(
      @Nonnull final JsArray<BufferSource> authnSel) {
    setAuthnSel( authnSel );
    return this;
  }

  @JsOverlay
  default void setAuthnSel(@Nonnull final BufferSource... authnSel) {
    setAuthnSel( Js.<JsArray<BufferSource>>uncheckedCast( authnSel ) );
  }

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs authnSel(@Nonnull final BufferSource... authnSel) {
    setAuthnSel( authnSel );
    return this;
  }

  @JsProperty(
      name = "exts"
  )
  boolean exts();

  @JsProperty
  void setExts(boolean exts);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs exts(final boolean exts) {
    setExts( exts );
    return this;
  }

  @JsProperty(
      name = "uvi"
  )
  boolean uvi();

  @JsProperty
  void setUvi(boolean uvi);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs uvi(final boolean uvi) {
    setUvi( uvi );
    return this;
  }

  @JsProperty(
      name = "loc"
  )
  boolean loc();

  @JsProperty
  void setLoc(boolean loc);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs loc(final boolean loc) {
    setLoc( loc );
    return this;
  }

  @JsProperty(
      name = "uvm"
  )
  boolean uvm();

  @JsProperty
  void setUvm(boolean uvm);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs uvm(final boolean uvm) {
    setUvm( uvm );
    return this;
  }
}
