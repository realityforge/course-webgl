package akasha;

import akasha.core.BufferSource;
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
