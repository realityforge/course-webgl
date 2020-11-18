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
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface BlobPart {
  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final BufferSource value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final ArrayBufferView value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final Int8Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final Int16Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final Int32Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final Uint8Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final Uint16Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final Uint32Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final Uint8ClampedArray value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final Float32Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final Float64Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final DataView value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final ArrayBuffer value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final Blob value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BlobPart of(@Nonnull final String value) {
    return Js.cast( value );
  }
}
