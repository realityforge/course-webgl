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
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
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
  default void setBody(@Nonnull final ArrayBufferView body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final ArrayBufferView body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final Int8Array body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final Int8Array body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final Int16Array body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final Int16Array body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final Int32Array body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final Int32Array body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final Uint8Array body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final Uint8Array body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final Uint16Array body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final Uint16Array body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final Uint32Array body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final Uint32Array body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final Uint8ClampedArray body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final Uint8ClampedArray body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final Float32Array body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final Float32Array body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final Float64Array body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final Float64Array body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final DataView body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final DataView body) {
    setBody( body );
    return this;
  }

  @JsOverlay
  default void setBody(@Nonnull final ArrayBuffer body) {
    setBody( BodyInit.of( body ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit body(@Nonnull final ArrayBuffer body) {
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
  @MagicConstant(
      valuesFromClass = RequestCache.class
  )
  String cache();

  @JsProperty
  void setCache(@MagicConstant(valuesFromClass = RequestCache.class) @Nonnull String cache);

  @JsOverlay
  @Nonnull
  default RequestInit cache(
      @MagicConstant(valuesFromClass = RequestCache.class) @Nonnull final String cache) {
    setCache( cache );
    return this;
  }

  @JsProperty(
      name = "credentials"
  )
  @MagicConstant(
      valuesFromClass = RequestCredentials.class
  )
  String credentials();

  @JsProperty
  void setCredentials(
      @MagicConstant(valuesFromClass = RequestCredentials.class) @Nonnull String credentials);

  @JsOverlay
  @Nonnull
  default RequestInit credentials(
      @MagicConstant(valuesFromClass = RequestCredentials.class) @Nonnull final String credentials) {
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
  @MagicConstant(
      valuesFromClass = RequestMode.class
  )
  String mode();

  @JsProperty
  void setMode(@MagicConstant(valuesFromClass = RequestMode.class) @Nonnull String mode);

  @JsOverlay
  @Nonnull
  default RequestInit mode(
      @MagicConstant(valuesFromClass = RequestMode.class) @Nonnull final String mode) {
    setMode( mode );
    return this;
  }

  @JsProperty(
      name = "redirect"
  )
  @MagicConstant(
      valuesFromClass = RequestRedirect.class
  )
  String redirect();

  @JsProperty
  void setRedirect(
      @MagicConstant(valuesFromClass = RequestRedirect.class) @Nonnull String redirect);

  @JsOverlay
  @Nonnull
  default RequestInit redirect(
      @MagicConstant(valuesFromClass = RequestRedirect.class) @Nonnull final String redirect) {
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
  @MagicConstant(
      valuesFromClass = ReferrerPolicy.class
  )
  String referrerPolicy();

  @JsProperty
  void setReferrerPolicy(
      @MagicConstant(valuesFromClass = ReferrerPolicy.class) @Nonnull String referrerPolicy);

  @JsOverlay
  @Nonnull
  default RequestInit referrerPolicy(
      @MagicConstant(valuesFromClass = ReferrerPolicy.class) @Nonnull final String referrerPolicy) {
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
  void setWindow(@Nullable Any window);

  @JsOverlay
  @Nonnull
  default RequestInit window(@Nullable final Any window) {
    setWindow( window );
    return this;
  }

  @JsOverlay
  default void setWindow(@DoNotAutobox @Nullable final Object window) {
    setWindow( Js.asAny( window ) );
  }

  @JsOverlay
  @Nonnull
  default RequestInit window(@DoNotAutobox @Nullable final Object window) {
    setWindow( window );
    return this;
  }
}
