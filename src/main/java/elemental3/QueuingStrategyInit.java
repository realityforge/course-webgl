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
public interface QueuingStrategyInit {
  @JsOverlay
  @Nonnull
  static QueuingStrategyInit create(final double highWaterMark) {
    return Js.<QueuingStrategyInit>uncheckedCast( JsPropertyMap.of() ).highWaterMark( highWaterMark );
  }

  @JsProperty(
      name = "highWaterMark"
  )
  double highWaterMark();

  @JsProperty
  void setHighWaterMark(double highWaterMark);

  @JsOverlay
  @Nonnull
  default QueuingStrategyInit highWaterMark(final double highWaterMark) {
    setHighWaterMark( highWaterMark );
    return this;
  }
}
