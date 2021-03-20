package akasha;

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
public interface CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion {
  @JsOverlay
  @Nonnull
  static CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion of(
      @CompositeOperationOrAuto @Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion of(
      @Nonnull final JsArray<String> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion of(
      @Nonnull final String[] value) {
    return Js.cast( value );
  }
}
