package elemental3;

import elemental3.core.JsArray;
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
public interface BasePropertyIndexedKeyframe {
  @JsOverlay
  @Nonnull
  static BasePropertyIndexedKeyframe create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "composite"
  )
  CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion composite();

  @JsProperty
  void setComposite(
      @Nonnull CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion composite);

  @JsOverlay
  default void setComposite(@Nonnull final String composite) {
    setComposite( CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion.of( composite ) );
  }

  @JsOverlay
  @Nonnull
  default BasePropertyIndexedKeyframe composite(@Nonnull final String composite) {
    setComposite( composite );
    return this;
  }

  @JsOverlay
  default void setComposite(@Nonnull final JsArray<String> composite) {
    setComposite( CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion.of( composite ) );
  }

  @JsOverlay
  @Nonnull
  default BasePropertyIndexedKeyframe composite(@Nonnull final JsArray<String> composite) {
    setComposite( composite );
    return this;
  }

  @JsOverlay
  default void setComposite(@Nonnull final String... composite) {
    setComposite( CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion.of( composite ) );
  }

  @JsOverlay
  @Nonnull
  default BasePropertyIndexedKeyframe composite(@Nonnull final String... composite) {
    setComposite( composite );
    return this;
  }

  @JsProperty(
      name = "easing"
  )
  StringOrStringArrayUnion easing();

  @JsProperty
  void setEasing(@Nonnull StringOrStringArrayUnion easing);

  @JsOverlay
  default void setEasing(@Nonnull final String easing) {
    setEasing( StringOrStringArrayUnion.of( easing ) );
  }

  @JsOverlay
  @Nonnull
  default BasePropertyIndexedKeyframe easing(@Nonnull final String easing) {
    setEasing( easing );
    return this;
  }

  @JsOverlay
  default void setEasing(@Nonnull final JsArray<String> easing) {
    setEasing( StringOrStringArrayUnion.of( easing ) );
  }

  @JsOverlay
  @Nonnull
  default BasePropertyIndexedKeyframe easing(@Nonnull final JsArray<String> easing) {
    setEasing( easing );
    return this;
  }

  @JsOverlay
  default void setEasing(@Nonnull final String... easing) {
    setEasing( StringOrStringArrayUnion.of( easing ) );
  }

  @JsOverlay
  @Nonnull
  default BasePropertyIndexedKeyframe easing(@Nonnull final String... easing) {
    setEasing( easing );
    return this;
  }

  @JsProperty(
      name = "offset"
  )
  @Nullable
  DoubleOrDoubleArrayUnion offset();

  @JsProperty
  void setOffset(@Nullable DoubleOrDoubleArrayUnion offset);

  @JsOverlay
  default void setOffset(@Nullable final Double offset) {
    setOffset( DoubleOrDoubleArrayUnion.of( offset ) );
  }

  @JsOverlay
  @Nonnull
  default BasePropertyIndexedKeyframe offset(@Nullable final Double offset) {
    setOffset( offset );
    return this;
  }

  @JsOverlay
  default void setOffset(@Nonnull final JsArray<Double> offset) {
    setOffset( DoubleOrDoubleArrayUnion.of( offset ) );
  }

  @JsOverlay
  @Nonnull
  default BasePropertyIndexedKeyframe offset(@Nonnull final JsArray<Double> offset) {
    setOffset( offset );
    return this;
  }

  @JsOverlay
  default void setOffset(@Nonnull final double... offset) {
    setOffset( DoubleOrDoubleArrayUnion.of( offset ) );
  }

  @JsOverlay
  @Nonnull
  default BasePropertyIndexedKeyframe offset(@Nonnull final double... offset) {
    setOffset( offset );
    return this;
  }
}
