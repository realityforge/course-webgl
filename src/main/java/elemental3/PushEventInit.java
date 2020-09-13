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
public interface PushEventInit extends ExtendableEventInit {
  @JsOverlay
  @Nonnull
  static PushEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "data"
  )
  PushMessageDataInit data();

  @JsProperty
  void setData(@Nonnull PushMessageDataInit data);

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final PushMessageDataInit data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final BufferSource data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final BufferSource data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final ArrayBufferView data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final ArrayBufferView data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final Int8Array data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final Int8Array data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final Int16Array data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final Int16Array data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final Int32Array data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final Int32Array data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final Uint8Array data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final Uint8Array data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final Uint16Array data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final Uint16Array data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final Uint32Array data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final Uint32Array data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final Uint8ClampedArray data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final Uint8ClampedArray data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final Float32Array data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final Float32Array data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final Float64Array data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final Float64Array data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final DataView data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final DataView data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final ArrayBuffer data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final ArrayBuffer data) {
    setData( data );
    return this;
  }

  @JsOverlay
  default void setData(@Nonnull final String data) {
    setData( PushMessageDataInit.of( data ) );
  }

  @JsOverlay
  @Nonnull
  default PushEventInit data(@Nonnull final String data) {
    setData( data );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PushEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PushEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PushEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
