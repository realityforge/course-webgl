package akasha;

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
public interface ReadableWritablePair {
  @JsOverlay
  @Nonnull
  static ReadableWritablePair create(@Nonnull final ReadableStream readable,
      @Nonnull final WritableStream writable) {
    return Js.<ReadableWritablePair>uncheckedCast( JsPropertyMap.of() ).readable( readable ).writable( writable );
  }

  @JsProperty(
      name = "readable"
  )
  @Nonnull
  ReadableStream readable();

  @JsProperty
  void setReadable(@Nonnull ReadableStream readable);

  @JsOverlay
  @Nonnull
  default ReadableWritablePair readable(@Nonnull final ReadableStream readable) {
    setReadable( readable );
    return this;
  }

  @JsProperty(
      name = "writable"
  )
  @Nonnull
  WritableStream writable();

  @JsProperty
  void setWritable(@Nonnull WritableStream writable);

  @JsOverlay
  @Nonnull
  default ReadableWritablePair writable(@Nonnull final WritableStream writable) {
    setWritable( writable );
    return this;
  }
}
