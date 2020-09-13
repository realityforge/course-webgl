package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public interface PushSubscriptionOptionsInit {
  @JsOverlay
  @Nonnull
  static PushSubscriptionOptionsInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "applicationServerKey"
  )
  @Nullable
  BufferSourceOrStringUnion applicationServerKey();

  @JsProperty
  void setApplicationServerKey(@Nullable BufferSourceOrStringUnion applicationServerKey);

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final BufferSource applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final BufferSource applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final ArrayBufferView applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final ArrayBufferView applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final Int8Array applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final Int8Array applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final Int16Array applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final Int16Array applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final Int32Array applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final Int32Array applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final Uint8Array applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final Uint8Array applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final Uint16Array applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final Uint16Array applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final Uint32Array applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final Uint32Array applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final Uint8ClampedArray applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final Uint8ClampedArray applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final Float32Array applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final Float32Array applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final Float64Array applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final Float64Array applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final DataView applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final DataView applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final ArrayBuffer applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final ArrayBuffer applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsOverlay
  default void setApplicationServerKey(@Nonnull final String applicationServerKey) {
    setApplicationServerKey( BufferSourceOrStringUnion.of( applicationServerKey ) );
  }

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit applicationServerKey(
      @Nonnull final String applicationServerKey) {
    setApplicationServerKey( applicationServerKey );
    return this;
  }

  @JsProperty(
      name = "userVisibleOnly"
  )
  boolean userVisibleOnly();

  @JsProperty
  void setUserVisibleOnly(boolean userVisibleOnly);

  @JsOverlay
  @Nonnull
  default PushSubscriptionOptionsInit userVisibleOnly(final boolean userVisibleOnly) {
    setUserVisibleOnly( userVisibleOnly );
    return this;
  }
}
