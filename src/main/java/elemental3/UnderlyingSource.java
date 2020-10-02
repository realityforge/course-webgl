package elemental3;

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
public interface UnderlyingSource {
  @JsOverlay
  @Nonnull
  static UnderlyingSource create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "start"
  )
  UnderlyingSourceStartCallback start();

  @JsProperty
  void setStart(@Nonnull UnderlyingSourceStartCallback start);

  @JsOverlay
  @Nonnull
  default UnderlyingSource start(@Nonnull final UnderlyingSourceStartCallback start) {
    setStart( start );
    return this;
  }

  @JsProperty(
      name = "pull"
  )
  UnderlyingSourcePullCallback pull();

  @JsProperty
  void setPull(@Nonnull UnderlyingSourcePullCallback pull);

  @JsOverlay
  @Nonnull
  default UnderlyingSource pull(@Nonnull final UnderlyingSourcePullCallback pull) {
    setPull( pull );
    return this;
  }

  @JsProperty(
      name = "cancel"
  )
  UnderlyingSourceCancelCallback cancel();

  @JsProperty
  void setCancel(@Nonnull UnderlyingSourceCancelCallback cancel);

  @JsOverlay
  @Nonnull
  default UnderlyingSource cancel(@Nonnull final UnderlyingSourceCancelCallback cancel) {
    setCancel( cancel );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @ReadableStreamType
  String type();

  @JsProperty
  void setType(@ReadableStreamType @Nonnull String type);

  @JsOverlay
  @Nonnull
  default UnderlyingSource type(@ReadableStreamType @Nonnull final String type) {
    setType( type );
    return this;
  }

  @JsProperty(
      name = "autoAllocateChunkSize"
  )
  int autoAllocateChunkSize();

  @JsProperty
  void setAutoAllocateChunkSize(int autoAllocateChunkSize);

  @JsOverlay
  @Nonnull
  default UnderlyingSource autoAllocateChunkSize(final int autoAllocateChunkSize) {
    setAutoAllocateChunkSize( autoAllocateChunkSize );
    return this;
  }
}
