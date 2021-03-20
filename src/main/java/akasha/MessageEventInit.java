package akasha;

import akasha.lang.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface MessageEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static MessageEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "data"
  )
  @Nullable
  Any data();

  @JsProperty
  void setData(@DoNotAutobox @Nullable Object data);

  @JsOverlay
  @Nonnull
  default MessageEventInit data(@DoNotAutobox @Nullable final Object data) {
    setData( data );
    return this;
  }

  @JsProperty(
      name = "lastEventId"
  )
  String lastEventId();

  @JsProperty
  void setLastEventId(@Nonnull String lastEventId);

  @JsOverlay
  @Nonnull
  default MessageEventInit lastEventId(@Nonnull final String lastEventId) {
    setLastEventId( lastEventId );
    return this;
  }

  @JsProperty(
      name = "origin"
  )
  String origin();

  @JsProperty
  void setOrigin(@Nonnull String origin);

  @JsOverlay
  @Nonnull
  default MessageEventInit origin(@Nonnull final String origin) {
    setOrigin( origin );
    return this;
  }

  @JsProperty(
      name = "ports"
  )
  JsArray<MessagePort> ports();

  @JsProperty
  void setPorts(@Nonnull JsArray<MessagePort> ports);

  @JsOverlay
  @Nonnull
  default MessageEventInit ports(@Nonnull final JsArray<MessagePort> ports) {
    setPorts( ports );
    return this;
  }

  @JsOverlay
  default void setPorts(@Nonnull final MessagePort... ports) {
    setPorts( Js.<JsArray<MessagePort>>uncheckedCast( ports ) );
  }

  @JsOverlay
  @Nonnull
  default MessageEventInit ports(@Nonnull final MessagePort... ports) {
    setPorts( ports );
    return this;
  }

  @JsProperty(
      name = "source"
  )
  @Nullable
  MessageEventSource source();

  @JsProperty
  void setSource(@Nullable MessageEventSource source);

  @JsOverlay
  @Nonnull
  default MessageEventInit source(@Nullable final MessageEventSource source) {
    setSource( source );
    return this;
  }

  @JsOverlay
  default void setSource(@Nonnull final Window source) {
    setSource( MessageEventSource.of( source ) );
  }

  @JsOverlay
  @Nonnull
  default MessageEventInit source(@Nonnull final Window source) {
    setSource( source );
    return this;
  }

  @JsOverlay
  default void setSource(@Nonnull final MessagePort source) {
    setSource( MessageEventSource.of( source ) );
  }

  @JsOverlay
  @Nonnull
  default MessageEventInit source(@Nonnull final MessagePort source) {
    setSource( source );
    return this;
  }

  @JsOverlay
  default void setSource(@Nonnull final ServiceWorker source) {
    setSource( MessageEventSource.of( source ) );
  }

  @JsOverlay
  @Nonnull
  default MessageEventInit source(@Nonnull final ServiceWorker source) {
    setSource( source );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MessageEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MessageEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MessageEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
