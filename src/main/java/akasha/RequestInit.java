package akasha;

import akasha.core.BufferSource;
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
public interface RequestInit {
  @JsOverlay
  @Nonnull
  static RequestInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "body"
  )
  @Nullable
  BodyInit body();

  @JsProperty
  void setBody(@Nullable BodyInit body);

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nullable final BodyInit body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final ReadableStream body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final ReadableStream body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final XMLHttpRequestBodyInit body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final XMLHttpRequestBodyInit body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final Blob body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final Blob body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final BufferSource body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final BufferSource body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final FormData body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final FormData body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final URLSearchParams body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final URLSearchParams body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final String body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final String body) {
    setBody( body );
    return this;
  }

  @JsProperty(
      name = "cache"
  )
  @RequestCache
  String cache();

  @JsProperty
  void setCache(@RequestCache @Nonnull String cache);

  @JsOverlay
  @Nonnull
  default RequestInit cache(@RequestCache @Nonnull final String cache) {
    setCache( cache );
    return this;
  }

  @JsProperty(
      name = "credentials"
  )
  @RequestCredentials
  String credentials();

  @JsProperty
  void setCredentials(@RequestCredentials @Nonnull String credentials);

  @JsOverlay
  @Nonnull
  default RequestInit credentials(@RequestCredentials @Nonnull final String credentials) {
    setCredentials( credentials );
    return this;
  }

  @JsProperty(
      name = "headers"
  )
  HeadersInit headers();

  @JsProperty
  void setHeaders(@Nonnull HeadersInit headers);

  @JsOverlay
  @Nonnull
  default RequestInit headers(@Nonnull final HeadersInit headers) {
    setHeaders( headers );
    return this;
  }

  @JsOverlay
  default void setHeaders(@Nonnull final JsArray<JsArray<String>> headers) {
    setHeaders( HeadersInit.of( headers ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit headers(@Nonnull final JsArray<JsArray<String>> headers) {
    setHeaders( headers );
    return this;
  }

  @JsOverlay
  @SuppressWarnings("unchecked")
  default void setHeaders(@Nonnull final JsArray<String>... headers) {
    setHeaders( HeadersInit.of( headers ) );
  }

  @JsOverlay
  @Nonnull
  @SuppressWarnings("unchecked")
  default RequestInit headers(@Nonnull final JsArray<String>... headers) {
    setHeaders( headers );
    return this;
  }

  @JsOverlay
  default void setHeaders(@Nonnull final JsPropertyMap<String> headers) {
    setHeaders( HeadersInit.of( headers ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit headers(@Nonnull final JsPropertyMap<String> headers) {
    setHeaders( headers );
    return this;
  }

  @JsProperty(
      name = "integrity"
  )
  String integrity();

  @JsProperty
  void setIntegrity(@Nonnull String integrity);

  @JsOverlay
  @Nonnull
  default RequestInit integrity(@Nonnull final String integrity) {
    setIntegrity( integrity );
    return this;
  }

  @JsProperty(
      name = "keepalive"
  )
  boolean keepalive();

  @JsProperty
  void setKeepalive(boolean keepalive);

  @JsOverlay
  @Nonnull
  default RequestInit keepalive(final boolean keepalive) {
    setKeepalive( keepalive );
    return this;
  }

  @JsProperty(
      name = "method"
  )
  String method();

  @JsProperty
  void setMethod(@Nonnull String method);

  @JsOverlay
  @Nonnull
  default RequestInit method(@Nonnull final String method) {
    setMethod( method );
    return this;
  }

  @JsProperty(
      name = "mode"
  )
  @RequestMode
  String mode();

  @JsProperty
  void setMode(@RequestMode @Nonnull String mode);

  @JsOverlay
  @Nonnull
  default RequestInit mode(@RequestMode @Nonnull final String mode) {
    setMode( mode );
    return this;
  }

  @JsProperty(
      name = "redirect"
  )
  @RequestRedirect
  String redirect();

  @JsProperty
  void setRedirect(@RequestRedirect @Nonnull String redirect);

  @JsOverlay
  @Nonnull
  default RequestInit redirect(@RequestRedirect @Nonnull final String redirect) {
    setRedirect( redirect );
    return this;
  }

  @JsProperty(
      name = "referrer"
  )
  String referrer();

  @JsProperty
  void setReferrer(@Nonnull String referrer);

  @JsOverlay
  @Nonnull
  default RequestInit referrer(@Nonnull final String referrer) {
    setReferrer( referrer );
    return this;
  }

  @JsProperty(
      name = "referrerPolicy"
  )
  @ReferrerPolicy
  String referrerPolicy();

  @JsProperty
  void setReferrerPolicy(@ReferrerPolicy @Nonnull String referrerPolicy);

  @JsOverlay
  @Nonnull
  default RequestInit referrerPolicy(@ReferrerPolicy @Nonnull final String referrerPolicy) {
    setReferrerPolicy( referrerPolicy );
    return this;
  }

  @JsProperty(
      name = "signal"
  )
  @Nullable
  AbortSignal signal();

  @JsProperty
  void setSignal(@Nullable AbortSignal signal);

  @JsOverlay
  @Nonnull
  default RequestInit signal(@Nullable final AbortSignal signal) {
    setSignal( signal );
    return this;
  }

  @JsProperty(
      name = "window"
  )
  @Nullable
  Any window();

  @JsProperty
  void setWindow(@DoNotAutobox @Nullable Object window);

  @JsOverlay
  @Nonnull
  default RequestInit window(@DoNotAutobox @Nullable final Object window) {
    setWindow( window );
    return this;
  }
}
