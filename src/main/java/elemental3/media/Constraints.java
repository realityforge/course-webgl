package elemental3.media;

import elemental3.core.JsArray;
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
    name = "?"
)
public interface Constraints extends ConstraintSet {
  @JsOverlay
  @Nonnull
  static Constraints create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "advanced"
  )
  JsArray<ConstraintSet> advanced();

  @JsProperty
  void setAdvanced(@Nonnull JsArray<ConstraintSet> advanced);

  @JsOverlay
  @Nonnull
  default Constraints advanced(@Nonnull final JsArray<ConstraintSet> advanced) {
    setAdvanced( advanced );
    return this;
  }

  @JsOverlay
  default void setAdvanced(@Nonnull final ConstraintSet... advanced) {
    setAdvanced( Js.<JsArray<ConstraintSet>>uncheckedCast( advanced ) );
  }

  @JsOverlay
  @Nonnull
  default Constraints advanced(@Nonnull final ConstraintSet... advanced) {
    setAdvanced( advanced );
    return this;
  }
}
