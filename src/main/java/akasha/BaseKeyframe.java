package akasha;

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
    name = "Object"
)
public interface BaseKeyframe {
  @JsOverlay
  @Nonnull
  static BaseKeyframe create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "composite"
  )
  @CompositeOperationOrAuto
  String composite();

  @JsProperty
  void setComposite(@CompositeOperationOrAuto @Nonnull String composite);

  @JsOverlay
  @Nonnull
  default BaseKeyframe composite(@CompositeOperationOrAuto @Nonnull final String composite) {
    setComposite( composite );
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
  default BaseKeyframe easing(@Nonnull final String easing) {
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
  default BaseKeyframe offset(@Nullable final Double offset) {
    setOffset( offset );
    return this;
  }
}
