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
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final ArrayBufferView id,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final Int8Array id,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final Int16Array id,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final Int32Array id,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final Uint8Array id,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final Uint16Array id,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final Uint32Array id,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final Uint8ClampedArray id,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final Float32Array id,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final Float64Array id,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final DataView id,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    return Js.<PublicKeyCredentialDescriptor>uncheckedCast( JsPropertyMap.of() ).id( id ).type( type );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialDescriptor create(@Nonnull final ArrayBuffer id,
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
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

  @JsOverlay
  default void setId(@Nonnull final ArrayBufferView id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final ArrayBufferView id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Int8Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final Int8Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Int16Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final Int16Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Int32Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final Int32Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Uint8Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final Uint8Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Uint16Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final Uint16Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Uint32Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final Uint32Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Uint8ClampedArray id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final Uint8ClampedArray id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Float32Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final Float32Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Float64Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final Float64Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final DataView id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final DataView id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final ArrayBuffer id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor id(@Nonnull final ArrayBuffer id) {
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
  @MagicConstant(
      valuesFromClass = PublicKeyCredentialType.class
  )
  @Nonnull
  String type();

  @JsProperty
  void setType(
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull String type);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialDescriptor type(
      @MagicConstant(valuesFromClass = PublicKeyCredentialType.class) @Nonnull final String type) {
    setType( type );
    return this;
  }
}
