package elemental3;

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
public interface ReadableStreamBYOBReadResult {
  @JsOverlay
  @Nonnull
  static ReadableStreamBYOBReadResult create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "value"
  )
  ArrayBufferView value();

  @JsProperty
  void setValue(@Nonnull ArrayBufferView value);

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult value(@Nonnull final ArrayBufferView value) {
    setValue( value );
    return this;
  }

  @JsOverlay
  default void setValue(@Nonnull final Int8Array value) {
    setValue( ArrayBufferView.of( value ) );
  }

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult value(@Nonnull final Int8Array value) {
    setValue( value );
    return this;
  }

  @JsOverlay
  default void setValue(@Nonnull final Int16Array value) {
    setValue( ArrayBufferView.of( value ) );
  }

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult value(@Nonnull final Int16Array value) {
    setValue( value );
    return this;
  }

  @JsOverlay
  default void setValue(@Nonnull final Int32Array value) {
    setValue( ArrayBufferView.of( value ) );
  }

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult value(@Nonnull final Int32Array value) {
    setValue( value );
    return this;
  }

  @JsOverlay
  default void setValue(@Nonnull final Uint8Array value) {
    setValue( ArrayBufferView.of( value ) );
  }

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult value(@Nonnull final Uint8Array value) {
    setValue( value );
    return this;
  }

  @JsOverlay
  default void setValue(@Nonnull final Uint16Array value) {
    setValue( ArrayBufferView.of( value ) );
  }

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult value(@Nonnull final Uint16Array value) {
    setValue( value );
    return this;
  }

  @JsOverlay
  default void setValue(@Nonnull final Uint32Array value) {
    setValue( ArrayBufferView.of( value ) );
  }

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult value(@Nonnull final Uint32Array value) {
    setValue( value );
    return this;
  }

  @JsOverlay
  default void setValue(@Nonnull final Uint8ClampedArray value) {
    setValue( ArrayBufferView.of( value ) );
  }

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult value(@Nonnull final Uint8ClampedArray value) {
    setValue( value );
    return this;
  }

  @JsOverlay
  default void setValue(@Nonnull final Float32Array value) {
    setValue( ArrayBufferView.of( value ) );
  }

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult value(@Nonnull final Float32Array value) {
    setValue( value );
    return this;
  }

  @JsOverlay
  default void setValue(@Nonnull final Float64Array value) {
    setValue( ArrayBufferView.of( value ) );
  }

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult value(@Nonnull final Float64Array value) {
    setValue( value );
    return this;
  }

  @JsOverlay
  default void setValue(@Nonnull final DataView value) {
    setValue( ArrayBufferView.of( value ) );
  }

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult value(@Nonnull final DataView value) {
    setValue( value );
    return this;
  }

  @JsProperty(
      name = "done"
  )
  boolean done();

  @JsProperty
  void setDone(boolean done);

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult done(final boolean done) {
    setDone( done );
    return this;
  }
}
