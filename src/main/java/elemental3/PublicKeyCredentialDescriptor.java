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
public interface PublicKeyCredentialDescriptor {
  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final BufferSource id,
      @PublicKeyCredentialType @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsProperty(
      name = "id"
  )
  @Nonnull
  BufferSource id();

  @JsProperty
  void setId(@Nonnull BufferSource id);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final BufferSource id) {
    setId( id );
    return this;
  }

  @JsProperty(
      name = "transports"
  )
  JsArray<String> transports();

  @JsProperty
  void setTransports(@Nonnull JsArray<String> transports);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor transports(@Nonnull final JsArray<String> transports) {
    setTransports( transports );
    return this;
  }

  @JsOverlay
  default void setTransports(@Nonnull final String... transports) {
    setTransports( Js.<JsArray<String>>uncheckedCast( transports ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor transports(@Nonnull final String... transports) {
    setTransports( transports );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @PublicKeyCredentialType
  @Nonnull
  String type();

  @JsProperty
  void setType(@PublicKeyCredentialType @Nonnull String type);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor type(@PublicKeyCredentialType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
