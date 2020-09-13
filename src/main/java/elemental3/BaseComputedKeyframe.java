package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface BaseComputedKeyframe {
  @JsOverlay
  @Nonnull
  static BaseComputedKeyframe create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "composite"
  )
  @MagicConstant(
      valuesFromClass = CompositeOperationOrAuto.class
  )
  String composite();

  @JsProperty
  void setComposite(
      @MagicConstant(valuesFromClass = CompositeOperationOrAuto.class) @Nonnull String composite);

  @JsOverlay
  @Nonnull
  default BaseComputedKeyframe composite(
      @MagicConstant(valuesFromClass = CompositeOperationOrAuto.class) @Nonnull final String composite) {
    setComposite( composite );
    return this;
  }

  @JsProperty(
      name = "computedOffset"
  )
  double computedOffset();

  @JsProperty
  void setComputedOffset(double computedOffset);

  @JsOverlay
  @Nonnull
  default BaseComputedKeyframe computedOffset(final double computedOffset) {
    setComputedOffset( computedOffset );
    return this;
  }

  @JsProperty(
      name = "easing"
  )
  String easing();

  @JsProperty
  void setEasing(@Nonnull String easing);

  @JsOverlay
  @Nonnull
  default BaseComputedKeyframe easing(@Nonnull final String easing) {
    setEasing( easing );
    return this;
  }

  @JsProperty(
      name = "offset"
  )
  @Nullable
  Double offset();

  @JsProperty
  void setOffset(@Nullable Double offset);

  @JsOverlay
  @Nonnull
  default BaseComputedKeyframe offset(@Nullable final Double offset) {
    setOffset( offset );
    return this;
  }
}
