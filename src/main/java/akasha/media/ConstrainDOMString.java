package akasha.media;

import akasha.lang.JsArray;
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
public interface ConstrainDOMString {
  @JsOverlay
  @Nonnull
  static ConstrainDOMString of(@Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ConstrainDOMString of(@Nonnull final JsArray<String> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ConstrainDOMString of(@Nonnull final String[] value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ConstrainDOMString of(@Nonnull final ConstrainDOMStringParameters value) {
    return Js.cast( value );
  }
}
