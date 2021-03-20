package akasha;

import akasha.lang.JsArray;
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
public interface ResponseInit {
  @JsOverlay
  @Nonnull
  static ResponseInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "headers"
  )
  HeadersInit headers();

  @JsProperty
  void setHeaders(@Nonnull HeadersInit headers);

  @JsOverlay
  @Nonnull
  default ResponseInit headers(@Nonnull final HeadersInit headers) {
    setHeaders( headers );
    return this;
  }

  @JsOverlay
  default void setHeaders(@Nonnull final JsArray<JsArray<String>> headers) {
    setHeaders( HeadersInit.of( headers ) );
  }

  @JsOverlay
  @Nonnull
  default ResponseInit headers(@Nonnull final JsArray<JsArray<String>> headers) {
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
  default ResponseInit headers(@Nonnull final JsArray<String>... headers) {
    setHeaders( headers );
    return this;
  }

  @JsOverlay
  default void setHeaders(@Nonnull final JsPropertyMap<String> headers) {
    setHeaders( HeadersInit.of( headers ) );
  }

  @JsOverlay
  @Nonnull
  default ResponseInit headers(@Nonnull final JsPropertyMap<String> headers) {
    setHeaders( headers );
    return this;
  }

  @JsProperty(
      name = "status"
  )
  int status();

  @JsProperty
  void setStatus(int status);

  @JsOverlay
  @Nonnull
  default ResponseInit status(final int status) {
    setStatus( status );
    return this;
  }

  @JsProperty(
      name = "statusText"
  )
  String statusText();

  @JsProperty
  void setStatusText(@Nonnull String statusText);

  @JsOverlay
  @Nonnull
  default ResponseInit statusText(@Nonnull final String statusText) {
    setStatusText( statusText );
    return this;
  }
}
