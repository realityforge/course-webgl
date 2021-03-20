package akasha;

import akasha.core.ArrayBuffer;
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
public interface TxAuthGenericArg {
  @JsOverlay
  @Nonnull
  static TxAuthGenericArg create(@Nonnull final ArrayBuffer content,
      @Nonnull final String contentType) {
    return Js.<TxAuthGenericArg>uncheckedCast( JsPropertyMap.of() ).content( content ).contentType( contentType );
  }

  @JsProperty(
      name = "content"
  )
  @Nonnull
  ArrayBuffer content();

  @JsProperty
  void setContent(@Nonnull ArrayBuffer content);

  @JsOverlay
  @Nonnull
  default TxAuthGenericArg content(@Nonnull final ArrayBuffer content) {
    setContent( content );
    return this;
  }

  @JsProperty(
      name = "contentType"
  )
  @Nonnull
  String contentType();

  @JsProperty
  void setContentType(@Nonnull String contentType);

  @JsOverlay
  @Nonnull
  default TxAuthGenericArg contentType(@Nonnull final String contentType) {
    setContentType( contentType );
    return this;
  }
}
