package elemental3;

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
public interface QueuingStrategy {
  @JsOverlay
  @Nonnull
  static QueuingStrategy create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "highWaterMark"
  )
  double highWaterMark();

  @JsProperty
  void setHighWaterMark(double highWaterMark);

  @JsOverlay
  @Nonnull
  default QueuingStrategy highWaterMark(final double highWaterMark) {
    setHighWaterMark( highWaterMark );
    return this;
  }

  @JsProperty(
      name = "size"
  )
  QueuingStrategySize size();

  @JsProperty
  void setSize(@Nonnull QueuingStrategySize size);

  @JsOverlay
  @Nonnull
  default QueuingStrategy size(@Nonnull final QueuingStrategySize size) {
    setSize( size );
    return this;
  }
}
