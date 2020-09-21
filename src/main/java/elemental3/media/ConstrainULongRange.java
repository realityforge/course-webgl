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
public interface ConstrainULongRange extends ULongRange {
  @JsOverlay
  @Nonnull
  static ConstrainULongRange create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "exact"
  )
  int exact();

  @JsProperty
  void setExact(int exact);

  @JsOverlay
  @Nonnull
  default ConstrainULongRange exact(final int exact) {
    setExact( exact );
    return this;
  }

  @JsProperty(
      name = "ideal"
  )
  int ideal();

  @JsProperty
  void setIdeal(int ideal);

  @JsOverlay
  @Nonnull
  default ConstrainULongRange ideal(final int ideal) {
    setIdeal( ideal );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ConstrainULongRange max(final int max) {
    setMax( max );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ConstrainULongRange min(final int min) {
    setMin( min );
    return this;
  }
}
