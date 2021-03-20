package akasha;

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
public interface Transformer {
  @JsOverlay
  @Nonnull
  static Transformer create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "start"
  )
  TransformerStartCallback start();

  @JsProperty
  void setStart(@Nonnull TransformerStartCallback start);

  @JsOverlay
  @Nonnull
  default Transformer start(@Nonnull final TransformerStartCallback start) {
    setStart( start );
    return this;
  }

  @JsProperty(
      name = "transform"
  )
  TransformerTransformCallback transform();

  @JsProperty
  void setTransform(@Nonnull TransformerTransformCallback transform);

  @JsOverlay
  @Nonnull
  default Transformer transform(@Nonnull final TransformerTransformCallback transform) {
    setTransform( transform );
    return this;
  }

  @JsProperty(
      name = "flush"
  )
  TransformerFlushCallback flush();

  @JsProperty
  void setFlush(@Nonnull TransformerFlushCallback flush);

  @JsOverlay
  @Nonnull
  default Transformer flush(@Nonnull final TransformerFlushCallback flush) {
    setFlush( flush );
    return this;
  }

  @JsProperty(
      name = "readableType"
  )
  @Nullable
  Any readableType();

  @JsProperty
  void setReadableType(@DoNotAutobox @Nullable Object readableType);

  @JsOverlay
  @Nonnull
  default Transformer readableType(@DoNotAutobox @Nullable final Object readableType) {
    setReadableType( readableType );
    return this;
  }

  @JsProperty(
      name = "writableType"
  )
  @Nullable
  Any writableType();

  @JsProperty
  void setWritableType(@DoNotAutobox @Nullable Object writableType);

  @JsOverlay
  @Nonnull
  default Transformer writableType(@DoNotAutobox @Nullable final Object writableType) {
    setWritableType( writableType );
    return this;
  }
}
