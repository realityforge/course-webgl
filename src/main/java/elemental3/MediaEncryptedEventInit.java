package elemental3;

import elemental3.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public interface MediaEncryptedEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static MediaEncryptedEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "initData"
  )
  @Nullable
  ArrayBuffer initData();

  @JsProperty
  void setInitData(@Nullable ArrayBuffer initData);

  @JsOverlay
  @Nonnull
  default MediaEncryptedEventInit initData(@Nullable final ArrayBuffer initData) {
    setInitData( initData );
    return this;
  }

  @JsProperty(
      name = "initDataType"
  )
  String initDataType();

  @JsProperty
  void setInitDataType(@Nonnull String initDataType);

  @JsOverlay
  @Nonnull
  default MediaEncryptedEventInit initDataType(@Nonnull final String initDataType) {
    setInitDataType( initDataType );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaEncryptedEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaEncryptedEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaEncryptedEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
