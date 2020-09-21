package elemental3.media;

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
public interface ConstrainDoubleRange extends DoubleRange {
  @JsOverlay
  @Nonnull
  static ConstrainDoubleRange create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "exact"
  )
  double exact();

  @JsProperty
  void setExact(double exact);

  @JsOverlay
  @Nonnull
  default ConstrainDoubleRange exact(final double exact) {
    setExact( exact );
    return this;
  }

  @JsProperty(
      name = "ideal"
  )
  double ideal();

  @JsProperty
  void setIdeal(double ideal);

  @JsOverlay
  @Nonnull
  default ConstrainDoubleRange ideal(final double ideal) {
    setIdeal( ideal );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ConstrainDoubleRange max(final double max) {
    setMax( max );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ConstrainDoubleRange min(final double min) {
    setMin( min );
    return this;
  }
}
