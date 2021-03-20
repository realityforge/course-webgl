package akasha;

import akasha.core.ArrayBuffer;
import akasha.lang.JsArray;
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
    name = "Object"
)
public interface AuthenticationExtensionsClientOutputs {
  @JsOverlay
  @Nonnull
  static AuthenticationExtensionsClientOutputs create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "appid"
  )
  boolean appid();

  @JsProperty
  void setAppid(boolean appid);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs appid(final boolean appid) {
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
  default AuthenticationExtensionsClientOutputs txAuthSimple(@Nonnull final String txAuthSimple) {
    setTxAuthSimple( txAuthSimple );
    return this;
  }

  @JsProperty(
      name = "txAuthGeneric"
  )
  ArrayBuffer txAuthGeneric();

  @JsProperty
  void setTxAuthGeneric(@Nonnull ArrayBuffer txAuthGeneric);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs txAuthGeneric(
      @Nonnull final ArrayBuffer txAuthGeneric) {
    setTxAuthGeneric( txAuthGeneric );
    return this;
  }

  @JsProperty(
      name = "authnSel"
  )
  boolean authnSel();

  @JsProperty
  void setAuthnSel(boolean authnSel);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs authnSel(final boolean authnSel) {
    setAuthnSel( authnSel );
    return this;
  }

  @JsProperty(
      name = "exts"
  )
  JsArray<String> exts();

  @JsProperty
  void setExts(@Nonnull JsArray<String> exts);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs exts(@Nonnull final JsArray<String> exts) {
    setExts( exts );
    return this;
  }

  @JsOverlay
  default void setExts(@Nonnull final String... exts) {
    setExts( Js.<JsArray<String>>uncheckedCast( exts ) );
  }

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs exts(@Nonnull final String... exts) {
    setExts( exts );
    return this;
  }

  @JsProperty(
      name = "uvi"
  )
  ArrayBuffer uvi();

  @JsProperty
  void setUvi(@Nonnull ArrayBuffer uvi);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs uvi(@Nonnull final ArrayBuffer uvi) {
    setUvi( uvi );
    return this;
  }

  @JsProperty(
      name = "loc"
  )
  Coordinates loc();

  @JsProperty
  void setLoc(@Nonnull Coordinates loc);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs loc(@Nonnull final Coordinates loc) {
    setLoc( loc );
    return this;
  }

  @JsProperty(
      name = "uvm"
  )
  JsArray<JsArray<Double>> uvm();

  @JsProperty
  void setUvm(@Nonnull JsArray<JsArray<Double>> uvm);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs uvm(@Nonnull final JsArray<JsArray<Double>> uvm) {
    setUvm( uvm );
    return this;
  }

  @JsOverlay
  @SuppressWarnings("unchecked")
  default void setUvm(@Nonnull final JsArray<Double>... uvm) {
    setUvm( Js.<JsArray<JsArray<Double>>>uncheckedCast( uvm ) );
  }

  @JsOverlay
  @Nonnull
  @SuppressWarnings("unchecked")
  default AuthenticationExtensionsClientOutputs uvm(@Nonnull final JsArray<Double>... uvm) {
    setUvm( uvm );
    return this;
  }
}
